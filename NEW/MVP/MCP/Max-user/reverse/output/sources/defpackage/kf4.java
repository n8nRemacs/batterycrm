package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class kf4 extends jkf implements u6g {
    public final TextView d;
    public final GradientDrawable o;

    public kf4(FrameLayout frameLayout, t75 t75Var) {
        super(frameLayout);
        this.d = (TextView) frameLayout.getChildAt(0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float f = vw4.d().getDisplayMetrics().density * 10.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        gradientDrawable.setCornerRadii(fArr);
        v1a v1aVar = a93.s0;
        gradientDrawable.setColor(v1aVar.y(this.d).a().G().b.g);
        this.o = gradientDrawable;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TextView textView = this.d;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        int iD = kti.d(4 * vw4.d().getDisplayMetrics().density);
        layoutParams.topMargin = iD;
        layoutParams.bottomMargin = iD;
        textView.setLayoutParams(layoutParams);
        textView.setTextAlignment(4);
        textView.setGravity(17);
        vz2.g.b(textView, t75Var);
        textView.setMinHeight(kti.d(20 * vw4.d().getDisplayMetrics().density));
        float f2 = 6;
        float f3 = 1;
        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        textView.setBackground(textView.getBackground());
        onThemeChanged(v1aVar.y(textView));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        v1a v1aVar = a93.s0;
        TextView textView = this.d;
        textView.setTextColor(v1aVar.y(textView).a().G().g.a);
        int i = v1aVar.y(textView).a().G().b.g;
        GradientDrawable gradientDrawable = this.o;
        gradientDrawable.setColor(i);
        textView.setBackground(gradientDrawable);
    }
}
