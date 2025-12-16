package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a38 extends LinearLayout {
    public boolean a;
    public final xu6 b;
    public final ImageView c;

    public a38(Context context) {
        super(context, null);
        this.a = true;
        xu6 xu6Var = new xu6(context);
        xu6Var.setAnimConfig(new wu6(0, 0L, 1500L, 0.0f, 16));
        this.b = xu6Var;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        setOrientation(0);
        xu6Var.setImageResource(yud.d1);
        float f = 32;
        xu6Var.setLayoutParams(new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f)));
        imageView.setImageResource(qwc.max_text_logo);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kti.d(58 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density));
        layoutParams.setMarginStart(kti.d(10 * vw4.d().getDisplayMetrics().density));
        imageView.setLayoutParams(layoutParams);
        addView(xu6Var);
        addView(imageView);
        setGravity(17);
        post(new gq5(13, this));
        tqi.c(new ld0(3, (Continuation) null, 19), this);
    }
}
