package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class ugf extends LinearLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public ugf(Context context) {
        super(context, null);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setGravity(17);
        int iD = kti.d(21 * vw4.d().getDisplayMetrics().density);
        ImageView imageView = new ImageView(context);
        int iD2 = kti.d(188 * vw4.d().getDisplayMetrics().density);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(iD2, iD2));
        addView(imageView);
        this.a = imageView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
        layoutParams.leftMargin = iD;
        layoutParams.rightMargin = iD;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        dpg.d.b(textView, t75.b);
        tqi.c(new ua6(3, null, 2), textView);
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = kti.d(2 * vw4.d().getDisplayMetrics().density);
        layoutParams2.leftMargin = iD;
        layoutParams2.rightMargin = iD;
        textView2.setLayoutParams(layoutParams2);
        textView2.setGravity(17);
        dpg.j.b(textView2, t75.b);
        tqi.c(new ua6(3, null, 3), textView2);
        addView(textView2);
        this.c = textView2;
    }

    public final void setIcon(int i) {
        this.a.setImageResource(i);
    }

    public final void setSubtitle(Integer num) {
        TextView textView = this.c;
        if (num == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(num.intValue());
        }
    }

    public final void setTitle(int i) {
        this.b.setText(i);
    }
}
