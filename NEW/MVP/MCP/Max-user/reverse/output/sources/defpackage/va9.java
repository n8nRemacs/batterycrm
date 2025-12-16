package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class va9 extends LinearLayout implements u6g {
    public boolean a;
    public mb9 b;
    public final AppCompatImageView c;
    public final AppCompatTextView d;

    public va9(Context context) {
        super(context, null, 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        float f = 4;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        appCompatImageView.setPadding(iD, iD, iD, iD);
        appCompatImageView.setLayoutParams(layoutParams);
        this.c = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setMaxWidth(kti.d(72 * vw4.d().getDisplayMetrics().density));
        dpg.o.b(appCompatTextView, t75.b);
        this.d = appCompatTextView;
        setId(m1b.E);
        setOrientation(1);
        setGravity(1);
        setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        float f2 = 6;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density), getPaddingBottom());
        addView(appCompatImageView);
        addView(appCompatTextView);
        a();
    }

    public final void a() {
        v1a v1aVar = a93.s0;
        boolean z = this.a;
        AppCompatImageView appCompatImageView = this.c;
        AppCompatTextView appCompatTextView = this.d;
        if (z) {
            appCompatTextView.setTextColor(v1aVar.y(this).getText().e);
            appCompatImageView.setColorFilter(v1aVar.y(this).getIcon().f);
        } else {
            appCompatTextView.setTextColor(v1aVar.y(this).getText().g);
            appCompatImageView.setColorFilter(v1aVar.y(this).getIcon().j);
        }
    }

    public final mb9 getState() {
        return this.b;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        a();
    }

    public final void setIsSelected(boolean z) {
        this.a = z;
        a();
    }

    public final void setState(mb9 mb9Var) {
        int i;
        int i2;
        this.b = mb9Var;
        jb9 jb9Var = jb9.a;
        boolean zA = fni.a(mb9Var, jb9Var);
        ib9 ib9Var = ib9.a;
        hb9 hb9Var = hb9.a;
        kb9 kb9Var = kb9.a;
        lb9 lb9Var = lb9.a;
        if (zA) {
            i = n1b.J;
        } else if (fni.a(mb9Var, lb9Var)) {
            i = n1b.L;
        } else if (fni.a(mb9Var, kb9Var)) {
            i = n1b.U;
        } else if (fni.a(mb9Var, hb9Var)) {
            i = n1b.E;
        } else {
            if (!fni.a(mb9Var, ib9Var)) {
                throw new NoWhenBranchMatchedException();
            }
            i = n1b.F;
        }
        this.d.setText(i);
        if (fni.a(mb9Var, jb9Var)) {
            i2 = ivd.f1;
        } else if (fni.a(mb9Var, lb9Var)) {
            i2 = l1b.n;
        } else if (fni.a(mb9Var, kb9Var)) {
            i2 = l1b.b;
        } else if (fni.a(mb9Var, hb9Var)) {
            i2 = l1b.m;
        } else {
            if (!fni.a(mb9Var, ib9Var)) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = l1b.a;
        }
        this.c.setImageResource(i2);
    }
}
