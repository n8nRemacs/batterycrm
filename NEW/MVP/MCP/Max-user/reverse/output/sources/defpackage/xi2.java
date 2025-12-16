package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class xi2 extends ConstraintLayout implements u6g, rqd {
    public final Object F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    public final uxa J0;
    public final AppCompatTextView K0;
    public final AppCompatImageView L0;
    public final ImageView M0;

    public xi2(final Context context) {
        super(context, null);
        this.F0 = ipi.b(3, new zb2(5));
        this.G0 = ipi.b(3, new hk1(8, this));
        final int i = 0;
        this.H0 = ipi.b(3, new cm6() { // from class: wi2
            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                xi2 xi2Var = this;
                Context context2 = context;
                switch (i2) {
                    case 0:
                        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, null);
                        appCompatTextView.setId(v8b.K);
                        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
                        appCompatTextView.setTextAlignment(2);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView.setVisibility(8);
                        t5g t5gVar = vz2.a;
                        dpg.f.b(appCompatTextView, t75.b);
                        appCompatTextView.setTextColor(a93.s0.y(appCompatTextView).getText().e);
                        fqi.c(xi2Var, appCompatTextView, -1);
                        return appCompatTextView;
                    default:
                        m9b m9bVar = new m9b(context2);
                        m9bVar.setId(zud.h);
                        mgb.a(m9bVar, new ue(7, m9bVar, m9bVar));
                        m9bVar.setSize(i9b.a);
                        m9bVar.setVisibility(0);
                        xi2Var.addView(m9bVar);
                        return m9bVar;
                }
            }
        });
        final int i2 = 1;
        k18 k18VarB = ipi.b(3, new cm6() { // from class: wi2
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                xi2 xi2Var = this;
                Context context2 = context;
                switch (i22) {
                    case 0:
                        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, null);
                        appCompatTextView.setId(v8b.K);
                        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
                        appCompatTextView.setTextAlignment(2);
                        appCompatTextView.setMaxLines(1);
                        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView.setVisibility(8);
                        t5g t5gVar = vz2.a;
                        dpg.f.b(appCompatTextView, t75.b);
                        appCompatTextView.setTextColor(a93.s0.y(appCompatTextView).getText().e);
                        fqi.c(xi2Var, appCompatTextView, -1);
                        return appCompatTextView;
                    default:
                        m9b m9bVar = new m9b(context2);
                        m9bVar.setId(zud.h);
                        mgb.a(m9bVar, new ue(7, m9bVar, m9bVar));
                        m9bVar.setSize(i9b.a);
                        m9bVar.setVisibility(0);
                        xi2Var.addView(m9bVar);
                        return m9bVar;
                }
            }
        });
        this.I0 = k18VarB;
        uxa uxaVar = new uxa(context);
        uxaVar.setId(v8b.H);
        float f = 40;
        uxaVar.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        uxaVar.setAvatarShape(kxa.a);
        addView(uxaVar);
        this.J0 = uxaVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(v8b.N);
        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        appCompatTextView.setTextAlignment(2);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        t5g t5gVar = vz2.a;
        dpg.j.b(appCompatTextView, t75.b);
        addView(appCompatTextView);
        this.K0 = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(v8b.J);
        float f2 = 24;
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2)));
        int i3 = ivd.O;
        v1a v1aVar = a93.s0;
        int i4 = v1aVar.y(appCompatImageView).getIcon().f;
        Drawable drawableMutate = r34.b(appCompatImageView.getContext(), i3).mutate();
        cei.k(drawableMutate, i4);
        appCompatImageView.setImageDrawable(drawableMutate);
        addView(appCompatImageView);
        this.L0 = appCompatImageView;
        ImageView imageView = new ImageView(context);
        imageView.setId(v8b.L);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
        imageView.setImageDrawable(r34.b(imageView.getContext(), yud.v0).mutate());
        addView(imageView);
        this.M0 = imageView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setMinHeight(kti.d(48 * vw4.d().getDisplayMetrics().density));
        w();
        if (k18VarB.e()) {
            m9b m9bVar = (m9b) k18VarB.getValue();
            int iD = kti.d(20 * vw4.d().getDisplayMetrics().density);
            ViewGroup.LayoutParams layoutParams = m9bVar.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = iD;
            layoutParams.height = iD;
            m9bVar.setLayoutParams(layoutParams);
        }
        requestLayout();
        onThemeChanged(v1aVar.y(this));
        setBackground(getRippleDrawable());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ShapeDrawable getMaskDrawable() {
        return (ShapeDrawable) this.F0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.G0.getValue();
    }

    public static RippleDrawable v(xi2 xi2Var) {
        int i = a93.s0.y(xi2Var).c().a.a.i;
        return new RippleDrawable(ColorStateList.valueOf(i), null, xi2Var.getMaskDrawable());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        getRippleDrawable().setColor(ColorStateList.valueOf(yebVar.c().a.a.i));
        ?? r0 = this.H0;
        if (r0.e()) {
            ((AppCompatTextView) r0.getValue()).setTextColor(yebVar.getText().e);
        }
        this.K0.setTextColor(yebVar.getText().g);
        this.L0.setImageTintList(ColorStateList.valueOf(yebVar.getIcon().f));
        this.M0.setImageTintList(ColorStateList.valueOf(yebVar.getIcon().f));
    }

    public final void setChatTitle(String str) {
        this.K0.setText(str);
        w();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, k18] */
    public final void setLink(String str) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.H0.getValue();
        appCompatTextView.setText(str);
        appCompatTextView.setVisibility(0);
        ?? r2 = this.I0;
        if (r2.e()) {
            ((m9b) r2.getValue()).setVisibility(8);
        }
        w();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k18] */
    public final void setLoading(boolean z) {
        ?? r1 = this.I0;
        ?? r3 = this.H0;
        if (z) {
            if (r3.e()) {
                ((AppCompatTextView) r3.getValue()).setVisibility(8);
            }
            ((m9b) r1.getValue()).setVisibility(0);
        } else {
            if (r3.e()) {
                ((AppCompatTextView) r3.getValue()).setVisibility(0);
            }
            ((m9b) r1.getValue()).setVisibility(8);
        }
        w();
    }

    public final void setOnMoreActionsClickListener(cm6 cm6Var) {
        f8j.d(this.M0, 300L, new x6(2, cm6Var));
    }

    @Override // defpackage.rqd
    public void setRippleMask(Shape shape) {
        getMaskDrawable().setShape(shape);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, k18] */
    public final void w() {
        fua fuaVar;
        float f;
        ut3 ut3VarG = l5j.g(this);
        uxa uxaVar = this.J0;
        int id = uxaVar.getId();
        ut3VarG.d(id, 6, 0, 6);
        float f2 = 12;
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id, 5));
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 4, 0, 4);
        ?? r2 = this.H0;
        boolean zE = r2.e();
        AppCompatImageView appCompatImageView = this.L0;
        if (zE) {
            int id2 = ((AppCompatTextView) r2.getValue()).getId();
            ut3VarG.d(id2, 6, uxaVar.getId(), 7);
            new fua(ut3VarG, 6, id2, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f2));
            ut3VarG.d(id2, 3, uxaVar.getId(), 3);
            ut3VarG.d(id2, 7, appCompatImageView.getId(), 6);
            new fua(ut3VarG, 7, id2, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f2));
            ((AppCompatTextView) r2.getValue()).getId();
        } else {
            ?? r22 = this.I0;
            int id3 = ((m9b) r22.getValue()).getId();
            ut3VarG.d(id3, 6, uxaVar.getId(), 7);
            az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id3, 5));
            ut3VarG.d(id3, 3, 0, 3);
            new fua(ut3VarG, 3, id3, 5).e(kti.d(6 * vw4.d().getDisplayMetrics().density));
            ((m9b) r22.getValue()).getId();
        }
        int id4 = this.K0.getId();
        ut3VarG.d(id4, 6, uxaVar.getId(), 7);
        new fua(ut3VarG, 6, id4, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f2));
        ut3VarG.d(id4, 4, uxaVar.getId(), 4);
        ut3VarG.d(id4, 7, appCompatImageView.getId(), 6);
        new fua(ut3VarG, 7, id4, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f2));
        int id5 = appCompatImageView.getId();
        ImageView imageView = this.M0;
        if (imageView.getVisibility() == 0) {
            ut3VarG.d(id5, 7, imageView.getId(), 6);
            fuaVar = new fua(ut3VarG, 7, id5, 5);
            f = vw4.d().getDisplayMetrics().density;
        } else {
            ut3VarG.d(id5, 7, 0, 7);
            fuaVar = new fua(ut3VarG, 7, id5, 5);
            f = vw4.d().getDisplayMetrics().density;
        }
        az1.q(f2, f, fuaVar);
        ut3VarG.d(id5, 3, 0, 3);
        ut3VarG.d(id5, 4, 0, 4);
        if (imageView.getVisibility() == 0) {
            int id6 = imageView.getId();
            ut3VarG.d(id6, 7, 0, 7);
            az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id6, 5));
            ut3VarG.d(id6, 3, 0, 3);
            ut3VarG.d(id6, 4, 0, 4);
        }
        ut3VarG.a(this);
    }
}
