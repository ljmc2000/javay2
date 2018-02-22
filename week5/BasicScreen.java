package com.labs.week5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;


public class BasicScreen extends JFrame implements MouseListener, ActionListener
{
	JButton button1;
	JButton button2;

	JCheckBox checkbox;

	JTextField box;
	JButton buttonOk;	//confirm button for text box

	JPanel mypanel;

	BasicScreen(String title)
	{
		super(title);
		setSize(1280,720);	//change window default size
		setLayout(new FlowLayout());

		//buttons 1&2
		button1=new JButton("Click me");
		button2=new JButton("No click me instead");
		add(button1);
		add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);

		//the checkbox
		checkbox=new JCheckBox("ignore them?");
		add(checkbox);

		//the text field
		JTextField box= new JTextField("Name");
		buttonOk=new JButton("Ok");
		box.addActionListener(this);
		buttonOk.addActionListener(this);
		add(box);
		add(buttonOk);

		//jpanel
		mypanel=new JPanel();
		mypanel.addMouseListener(this);
		add(mypanel);

		setVisible(true);	//forget this and the window wont appear
	}

	public void actionPerformed(ActionEvent event1)
	{
		if(event1.getSource()==button1)
		{
			JOptionPane.showMessageDialog(this, "MyFirstevent!");
			System.out.println("button1 clicked");
		}

		else if(event1.getSource()==button2)
		{
			System.out.println("button2 clicked");
			JOptionPane.showMessageDialog(this, "My Second event!");
		}

		else if(event1.getSource()==buttonOk)
		{
			JOptionPane.showMessageDialog(this, "you entered "+event1.getActionCommand());
		}

	}


	//implements MouseListener
	public void mousePressed(MouseEvent event2)
	{
	}

	public void mouseReleased(MouseEvent event3)
	{
	}

	public void mouseEntered(MouseEvent event4)
	{
	}

	public void mouseExited(MouseEvent event5)
	{
	}

	public void mouseClicked(MouseEvent event6)
	{
	}

}
