package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class tp1 extends ConstraintLayout {
    public sp1 F0;
    public boolean G0;
    public final roe H0;
    public final AppCompatTextView I0;

    public tp1(Context context) throws Resources.NotFoundException {
        super(context, null);
        v1a v1aVar = a93.s0;
        setBackgroundColor(v1aVar.B(this).c.b().l);
        mfh.j(this, vw4.d().getDisplayMetrics().density * 16.0f);
        zfi.b(this, new eo7(0, new ms0(5, 2, false), 7), null);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(j0b.O);
        float f = 48;
        appCompatImageView.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        appCompatImageView.setImageResource(i0b.j0);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.B(appCompatImageView).c.getIcon().f));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(j0b.E1);
        appCompatTextView.setLayoutParams(new kt3(-1, -2));
        appCompatTextView.setGravity(17);
        dpg.c.b(appCompatTextView, t75.b);
        appCompatTextView.setTextColor(v1aVar.B(appCompatTextView).c.getText().e);
        this.I0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
        appCompatTextView2.setId(j0b.D1);
        appCompatTextView2.setLayoutParams(new kt3(-1, -2));
        appCompatTextView2.setGravity(17);
        dpg.l.b(appCompatTextView2, t75.b);
        appCompatTextView2.setTextColor(v1aVar.B(appCompatTextView2).c.getText().g);
        appCompatTextView2.setText(m0b.o0);
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setId(j0b.C1);
        oneMeButton.setLayoutParams(new kt3(-2, -2));
        oneMeButton.setMode(iza.a);
        oneMeButton.setSize(jza.b);
        oneMeButton.setCustomTheme(v1aVar.B(oneMeButton).c);
        oneMeButton.setAppearance(gza.o);
        oneMeButton.setText(m0b.n0);
        final int i = 0;
        f8j.d(oneMeButton, 300L, new View.OnClickListener(this) { // from class: rp1
            public final /* synthetic */ tp1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                tp1 tp1Var = this.b;
                switch (i2) {
                    case 0:
                        sp1 sp1Var = tp1Var.F0;
                        if (sp1Var != null) {
                            CallScreen callScreen = ((am1) sp1Var).a;
                            rha rhaVar = CallScreen.N0;
                            callScreen.H0().B(false, null);
                            break;
                        }
                        break;
                    default:
                        sp1 sp1Var2 = tp1Var.F0;
                        if (sp1Var2 != null) {
                            boolean z = !tp1Var.G0;
                            CallScreen callScreen2 = ((am1) sp1Var2).a;
                            rha rhaVar2 = CallScreen.N0;
                            callScreen2.H0().c.h.a(z);
                            break;
                        }
                        break;
                }
            }
        });
        roe roeVar = new roe(context, 0);
        roeVar.setId(j0b.F1);
        roeVar.setStartIcon(i0b.k0);
        roeVar.setTitle(new n5g(m0b.T));
        roeVar.setType(hoe.b);
        roeVar.setEndView(new doe(this.G0, true));
        roeVar.setOnSwitchCheckedListener(new qk(3, this));
        float[] fArr = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr[i2] = vw4.d().getDisplayMetrics().density * 16.0f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(v1aVar.B(roeVar).c.b().a.h);
        roeVar.setBackground(shapeDrawable);
        roeVar.setThemeDepended(noe.b);
        final int i3 = 1;
        f8j.d(roeVar, 300L, new View.OnClickListener(this) { // from class: rp1
            public final /* synthetic */ tp1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                tp1 tp1Var = this.b;
                switch (i22) {
                    case 0:
                        sp1 sp1Var = tp1Var.F0;
                        if (sp1Var != null) {
                            CallScreen callScreen = ((am1) sp1Var).a;
                            rha rhaVar = CallScreen.N0;
                            callScreen.H0().B(false, null);
                            break;
                        }
                        break;
                    default:
                        sp1 sp1Var2 = tp1Var.F0;
                        if (sp1Var2 != null) {
                            boolean z = !tp1Var.G0;
                            CallScreen callScreen2 = ((am1) sp1Var2).a;
                            rha rhaVar2 = CallScreen.N0;
                            callScreen2.H0().c.h.a(z);
                            break;
                        }
                        break;
                }
            }
        });
        this.H0 = roeVar;
        addView(appCompatImageView);
        addView(this.I0);
        addView(appCompatTextView2);
        addView(oneMeButton);
        addView(roeVar);
        ut3 ut3VarG = l5j.g(this);
        int id = appCompatImageView.getId();
        ut3VarG.d(id, 3, 0, 3);
        float f2 = 16;
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id, 5));
        ut3VarG.d(id, 7, 0, 7);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 4, this.I0.getId(), 3);
        ut3VarG.g(id).d.W = 2;
        int id2 = this.I0.getId();
        ut3VarG.d(id2, 3, appCompatImageView.getId(), 4);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id2, 5));
        ut3VarG.d(id2, 7, 0, 7);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id2, 5));
        ut3VarG.d(id2, 6, 0, 6);
        new fua(ut3VarG, 6, id2, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f2));
        ut3VarG.d(id2, 4, appCompatTextView2.getId(), 3);
        int id3 = appCompatTextView2.getId();
        ut3VarG.d(id3, 3, this.I0.getId(), 4);
        az1.q(8, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id3, 5));
        ut3VarG.d(id3, 6, 0, 6);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id3, 5));
        ut3VarG.d(id3, 7, 0, 7);
        new fua(ut3VarG, 7, id3, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f2));
        ut3VarG.d(id3, 4, oneMeButton.getId(), 3);
        new fua(ut3VarG, 4, id3, 5).e(kti.d(5 * vw4.d().getDisplayMetrics().density));
        int id4 = oneMeButton.getId();
        ut3VarG.d(id4, 3, appCompatTextView2.getId(), 4);
        az1.q(24, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id4, 5));
        ut3VarG.d(id4, 6, 0, 6);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id4, 5));
        ut3VarG.d(id4, 7, 0, 7);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id4, 5));
        ut3VarG.d(id4, 4, 0, 4);
        new fua(ut3VarG, 4, id4, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f2));
        int id5 = roeVar.getId();
        ut3VarG.d(id5, 6, 0, 6);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id5, 5));
        ut3VarG.d(id5, 7, 0, 7);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id5, 5));
        ut3VarG.d(id5, 4, 0, 4);
        new fua(ut3VarG, 4, id5, 5).e(kti.d(112 * vw4.d().getDisplayMetrics().density));
        ut3VarG.a(this);
    }

    public final void setListener(sp1 sp1Var) {
        this.F0 = sp1Var;
    }

    public final void setTitle(s5g s5gVar) {
        this.I0.setText(s5gVar.b(getContext()));
    }
}
