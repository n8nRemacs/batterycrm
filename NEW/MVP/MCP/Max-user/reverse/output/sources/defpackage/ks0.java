package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ks0 extends ConstraintLayout implements u6g {
    public final TextView F0;
    public final AppCompatImageView G0;
    public final w2b H0;
    public int I0;
    public final js0 J0;
    public um6 K0;

    public ks0(Context context) {
        super(context, null);
        TextView textView = new TextView(context);
        textView.setId(zud.e);
        textView.setVisibility(0);
        textView.setLayoutParams(new kt3(-2, -2));
        dpg.s.b(textView, t75.b);
        this.F0 = textView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(zud.d);
        float f = 28;
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        appCompatImageView.setVisibility(0);
        this.G0 = appCompatImageView;
        w2b w2bVar = new w2b(context);
        w2bVar.setId(zud.b);
        w2bVar.setLayoutParams(new kt3(-2, -2));
        w2bVar.setAppearance(r2b.d);
        w2bVar.setHasBackgroundStroke(true);
        w2bVar.setVisibility(8);
        this.H0 = w2bVar;
        k3b k3bVar = new k3b(context);
        k3bVar.setId(zud.c);
        float f2 = 6;
        kt3 kt3Var = new kt3(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        kt3Var.setMarginStart(kti.d(7 * vw4.d().getDisplayMetrics().density));
        k3bVar.setLayoutParams(kt3Var);
        k3bVar.setAppearance(j3b.c);
        k3bVar.setVisibility(8);
        this.I0 = 2;
        js0 js0Var = new js0(0, this);
        this.J0 = js0Var;
        this.K0 = js0Var;
        setLayoutParams(new ViewGroup.LayoutParams(0, -1));
        addView(appCompatImageView);
        addView(w2bVar);
        addView(k3bVar);
        addView(textView);
        ut3 ut3VarG = l5j.g(this);
        int id = appCompatImageView.getId();
        ut3VarG.d(id, 3, 0, 3);
        az1.q(4, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id, 5));
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 7, 0, 7);
        int id2 = textView.getId();
        ut3VarG.d(id2, 6, 0, 6);
        ut3VarG.d(id2, 7, 0, 7);
        ut3VarG.d(id2, 3, appCompatImageView.getId(), 4);
        float f3 = 2;
        new fua(ut3VarG, 3, id2, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f3));
        int id3 = w2bVar.getId();
        ut3VarG.d(id3, 6, appCompatImageView.getId(), 6);
        az1.q(14, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id3, 5));
        ut3VarG.d(id3, 3, 0, 3);
        int id4 = k3bVar.getId();
        ut3VarG.d(id4, 3, appCompatImageView.getId(), 3);
        ut3VarG.d(id4, 7, appCompatImageView.getId(), 7);
        new fua(ut3VarG, 7, id4, 5).e(-kti.d(f3 * vw4.d().getDisplayMetrics().density));
        ut3VarG.a(this);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        v();
    }

    public final void setCounter(int i) {
        int i2 = i > 0 ? 0 : 8;
        w2b w2bVar = this.H0;
        w2bVar.setVisibility(i2);
        w2bVar.g(i, true);
        if (i > 0) {
            v();
        }
    }

    public final void setIcon(int i) {
        this.G0.setImageDrawable(eri.a(getContext(), i));
        this.K0 = this.J0;
        v();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.I0 = z ? 1 : 2;
        v();
        if (z) {
            Object drawable = this.G0.getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.start();
            }
        }
        super.setSelected(z);
    }

    public final void setText(int i) {
        this.F0.setText(i);
    }

    public final void v() {
        int i;
        int i2 = this.I0;
        v1a v1aVar = a93.s0;
        yeb yebVarY = v1aVar.y(this);
        int iV = az1.v(i2);
        if (iV == 0) {
            i = yebVarY.getText().j;
        } else {
            if (iV != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = yebVarY.getText().g;
        }
        this.F0.setTextColor(i);
        this.K0.invoke(this.G0, Boolean.valueOf(this.I0 == 1), v1aVar.y(this));
        this.H0.f(v1aVar.y(this));
        invalidate();
    }

    public final void setText(CharSequence charSequence) {
        this.F0.setText(charSequence);
    }
}
