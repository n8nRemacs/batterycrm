package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class k5f extends phd {
    public static final /* synthetic */ yy7[] Z;
    public final yo3 X;
    public final nk Y = new nk(this);
    public final int d;
    public final fm7 o;

    static {
        z8a z8aVar = new z8a(k5f.class, "isSecure", "isSecure()Z");
        vid.a.getClass();
        Z = new yy7[]{z8aVar};
    }

    public k5f(int i, fm7 fm7Var, yo3 yo3Var) {
        this.d = i;
        this.o = fm7Var;
        this.X = yo3Var;
    }

    @Override // defpackage.phd
    public final int j() {
        return this.d;
    }

    @Override // defpackage.phd
    public final void r(mid midVar, final int i) {
        final j5f j5fVar = (j5f) midVar;
        yy7 yy7Var = Z[0];
        boolean zBooleanValue = ((Boolean) this.Y.b).booleanValue();
        hq3 hq3Var = j5fVar.G0;
        hq3Var.setSecure(zBooleanValue);
        hq3Var.addTextChangedListener(new i5f(j5fVar, i));
        hq3Var.setOnKeyListener(new View.OnKeyListener() { // from class: h5f
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (i2 != 67 || keyEvent.getAction() != 0) {
                    return false;
                }
                mq3 mq3Var = (mq3) j5fVar.F0;
                int i3 = i;
                int i4 = i3 - 1;
                lm7 lm7VarH0 = mq3Var.H0(i3);
                String strZ = lm7VarH0 != null ? ((j5f) lm7VarH0).z() : null;
                if (strZ == null || strZ.length() == 0) {
                    lm7 lm7VarH02 = mq3Var.H0(i4);
                    if (lm7VarH02 != null) {
                        j5f j5fVar2 = (j5f) lm7VarH02;
                        j5fVar2.A("");
                        j5fVar2.G0.requestFocus();
                    }
                } else if (lm7VarH0 != null) {
                    ((j5f) lm7VarH0).A("");
                    return true;
                }
                return true;
            }
        });
        job jobVar = new job(hq3Var.getContext(), j5fVar.F0, i, j5fVar.E0);
        hq3Var.setCustomSelectionActionModeCallback(jobVar);
        hq3Var.setCustomInsertionActionModeCallback(jobVar);
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        hq3 hq3Var = new hq3(viewGroup.getContext(), null);
        hq3Var.setId(lzc.one_me_codeinput_edit_text_view);
        hq3Var.setMinimumWidth(kti.d(40 * vw4.d().getDisplayMetrics().density));
        hq3Var.setMinimumHeight(kti.d(52 * vw4.d().getDisplayMetrics().density));
        hq3Var.setInputType(2);
        hq3Var.setGravity(17);
        hq3Var.setFilters(new InputFilter[]{hq3.c});
        dpg.b.b(hq3Var, t75.b);
        hq3Var.setClipToOutline(true);
        hq3Var.setOutlineProvider(new u74(kti.d(12 * vw4.d().getDisplayMetrics().density)));
        hq3Var.setSingleLine(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(kti.d(2 * vw4.d().getDisplayMetrics().density), hq3Var.getLineHeight());
        mfh.l(hq3Var, gradientDrawable);
        hq3Var.onThemeChanged(a93.s0.y(hq3Var));
        hq3Var.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return new j5f(this, this.d, this.o, hq3Var);
    }
}
