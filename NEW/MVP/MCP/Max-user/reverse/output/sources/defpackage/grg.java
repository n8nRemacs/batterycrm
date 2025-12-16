package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes2.dex */
public final class grg extends LinearLayout {
    public final fwa a;
    public final fwa b;

    public grg(Context context) {
        super(context);
        fwa fwaVar = new fwa(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 12;
        float f2 = 8;
        layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(16 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f2));
        layoutParams.weight = 1.0f;
        fwaVar.setLayoutParams(layoutParams);
        fwaVar.setAppearance(ewa.a);
        fwaVar.setText(m8b.e);
        this.a = fwaVar;
        fwa fwaVar2 = new fwa(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        layoutParams2.weight = 1.0f;
        fwaVar2.setLayoutParams(layoutParams2);
        fwaVar2.setAppearance(ewa.b);
        fwaVar2.setText(m8b.f);
        this.b = fwaVar2;
        setOrientation(0);
        addView(fwaVar);
        addView(fwaVar2);
    }

    public final void setOnAddContactClickListener(View.OnClickListener onClickListener) {
        f8j.d(this.a, 300L, onClickListener);
    }

    public final void setOnBlockContactClickListener(View.OnClickListener onClickListener) {
        f8j.d(this.b, 300L, onClickListener);
    }
}
