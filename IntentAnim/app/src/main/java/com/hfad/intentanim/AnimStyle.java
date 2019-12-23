package com.hfad.intentanim;

public class AnimStyle
{
    public int AnimInStyle(int number)
    {
        int Style = 0;
        if(number == 0)
        {
            Style = R.anim.fade_in;
        }
        else if(number == 1)
        {
            Style = R.anim.slide_left_in;
        }
        else if(number == 2)
        {
            Style = R.anim.slide_right_in;
        }
        else
        {
            Style = R.anim.zoomin;
        }

        return Style;
    }

    public int AnimOutStyle(int number)
    {
        int Style = 0;
        if(number == 0)
        {
            Style = R.anim.fade_out;
        }
        else if(number == 1)
        {
            Style = R.anim.slide_left_out;
        }
        else if(number == 2)
        {
            Style = R.anim.slide_right_out;
        }
        else
        {
            Style = R.anim.zoomout;
        }
        return Style;
    }
}
