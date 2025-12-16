package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class zk2 extends LinearLayout {
    public final ImageView a;
    public final TextView b;

    public zk2(Context context) {
        super(context, null);
        ImageView imageView = new ImageView(context);
        float f = 188;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        setGravity(1);
        tqi.c(new nd0(3, null, 4), imageView);
        this.a = imageView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(1);
        dpg.d.b(textView, t75.b);
        tqi.c(new x9(3, null, 4), textView);
        this.b = textView;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setGravity(17);
        setOrientation(1);
        addView(imageView);
        addView(textView);
    }

    public final void setIcon(int i) {
        this.a.setImageDrawable(r34.b(getContext(), i).mutate());
    }

    public final void setTitle(int i) {
        this.b.setText(z7.e(getContext(), i));
    }
}
