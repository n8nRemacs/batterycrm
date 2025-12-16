package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class dz6 extends ConstraintLayout implements u6g {
    public final qqd F0;
    public final View G0;
    public final kdb H0;
    public final TextView I0;
    public final TextView J0;
    public final OneMeButton K0;

    public dz6(Context context) {
        super(context);
        qqd qqdVar = new qqd();
        this.F0 = qqdVar;
        View view = new View(context);
        view.setId(k8b.c);
        v1a v1aVar = a93.s0;
        view.setBackgroundColor(v1aVar.x(context).k().i().b.b);
        this.G0 = view;
        kdb kdbVar = new kdb(context);
        kdbVar.setId(k8b.d);
        kdbVar.v0 = new x52(new hdb(kdbVar, 0), new wu7(27, kdbVar), new hdb(kdbVar, 1));
        kdbVar.setListener(new xt4(this, 21, kdbVar));
        this.H0 = kdbVar;
        TextView textView = new TextView(context);
        textView.setId(k8b.f);
        textView.setText(context.getString(m8b.c));
        dpg.k.b(textView, t75.b);
        this.I0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(k8b.e);
        dpg.o.b(textView2, t75.b);
        this.J0 = textView2;
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setId(k8b.b);
        oneMeButton.setSize(jza.a);
        oneMeButton.setMode(iza.a);
        oneMeButton.setAppearance(gza.c);
        oneMeButton.setText(m8b.b);
        this.K0 = oneMeButton;
        setLayoutParams(new kt3(-1, -2));
        addView(view, 0, kti.d(1 * vw4.d().getDisplayMetrics().density));
        addView(kdbVar, 0, -2);
        addView(oneMeButton, 0, -2);
        addView(textView, 0, -2);
        addView(textView2, 0, -2);
        setBackground(qqdVar);
        onThemeChanged(v1aVar.y(this));
        ut3 ut3VarG = l5j.g(this);
        int id = view.getId();
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 7, 0, 7);
        ut3VarG.d(id, 3, 0, 3);
        int id2 = kdbVar.getId();
        ut3VarG.d(id2, 6, 0, 6);
        float f = 12;
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id2, 5));
        ut3VarG.d(id2, 3, 0, 3);
        ut3VarG.d(id2, 4, 0, 4);
        ut3VarG.g(id2).d.l0 = true;
        int id3 = textView.getId();
        ut3VarG.d(id3, 6, kdbVar.getId(), 7);
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id3, 5));
        ut3VarG.d(id3, 3, 0, 3);
        ut3VarG.d(id3, 4, textView2.getId(), 3);
        new fua(ut3VarG, 4, id3, 5).e(kti.d(2 * vw4.d().getDisplayMetrics().density));
        ut3VarG.d(id3, 7, oneMeButton.getId(), 6);
        float f2 = 9;
        new fua(ut3VarG, 7, id3, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f2));
        ut3VarG.g(id3).d.l0 = true;
        ut3VarG.g(id3).d.W = 2;
        int id4 = textView2.getId();
        ut3VarG.d(id4, 6, kdbVar.getId(), 7);
        new fua(ut3VarG, 6, id4, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f));
        ut3VarG.d(id4, 3, textView.getId(), 4);
        ut3VarG.d(id4, 4, 0, 4);
        ut3VarG.d(id4, 7, oneMeButton.getId(), 6);
        new fua(ut3VarG, 7, id4, 5).e(kti.d(f2 * vw4.d().getDisplayMetrics().density));
        ut3VarG.g(id4).d.l0 = true;
        int id5 = oneMeButton.getId();
        ut3VarG.d(id5, 7, 0, 7);
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id5, 5));
        ut3VarG.d(id5, 3, 0, 3);
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id5, 5));
        ut3VarG.d(id5, 4, 0, 4);
        new fua(ut3VarG, 4, id5, 5).e(kti.d(f * vw4.d().getDisplayMetrics().density));
        ut3VarG.g(id5).d.l0 = true;
        ut3VarG.a(this);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public final View getDividerView() {
        return this.G0;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.I0.setTextColor(yebVar.getText().e);
        this.J0.setTextColor(yebVar.getText().g);
        this.K0.onThemeChanged(yebVar);
        this.G0.setBackgroundColor(yebVar.i().b.b);
    }

    public final void setJoinAction(cm6 cm6Var) {
        OneMeButton oneMeButton = this.K0;
        if (cm6Var == null) {
            oneMeButton.setOnClickListener(null);
        } else {
            f8j.d(oneMeButton, 300L, new x6(5, cm6Var));
        }
    }
}
