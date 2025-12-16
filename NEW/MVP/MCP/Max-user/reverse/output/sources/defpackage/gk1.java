package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class gk1 extends ConstraintLayout implements u6g {
    public static final /* synthetic */ int M0 = 0;
    public final TextView F0;
    public final m9b G0;
    public final ShapeDrawable H0;
    public final Object I0;
    public final Object J0;
    public final ImageView K0;
    public cm6 L0;

    public gk1(Context context) {
        super(context);
        TextView textView = new TextView(context);
        textView.setId(g0b.d);
        dpg.i.b(textView, t75.b);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.y(textView).getText().e);
        mfh.k(textView, false);
        textView.setFocusable(0);
        textView.setVisibility(8);
        textView.setLayoutParams(new kt3(0, -2));
        float f = 12;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        textView.setPadding(iD, iD, iD, iD);
        this.F0 = textView;
        m9b m9bVar = new m9b(context);
        m9bVar.setId(g0b.c);
        m9bVar.setLayoutParams(new kt3(-2, -2));
        m9bVar.setAppearance(b9b.a);
        m9bVar.setSize(i9b.a);
        m9bVar.setVisibility(8);
        this.G0 = m9bVar;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(v1aVar.x(context).k().b().a.n);
        this.H0 = shapeDrawable;
        final int i = 0;
        this.I0 = ipi.b(3, new cm6(this) { // from class: fk1
            public final /* synthetic */ gk1 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return r34.b(this.b.getContext(), yud.O0).mutate();
                    default:
                        return gk1.v(this.b);
                }
            }
        });
        final int i2 = 1;
        this.J0 = ipi.b(3, new cm6(this) { // from class: fk1
            public final /* synthetic */ gk1 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return r34.b(this.b.getContext(), yud.O0).mutate();
                    default:
                        return gk1.v(this.b);
                }
            }
        });
        ImageView imageView = new ImageView(context);
        imageView.setId(g0b.e);
        float f2 = 36;
        imageView.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
        imageView.setImageDrawable(getSendIcon());
        f8j.d(imageView, 300L, new j6(6, this));
        this.K0 = imageView;
        this.L0 = new g31(28);
        addView(textView);
        addView(imageView);
        addView(m9bVar);
        onThemeChanged(v1aVar.y(this));
        ut3 ut3VarG = l5j.g(this);
        int id = textView.getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 4, 0, 4);
        ut3VarG.d(id, 7, imageView.getId(), 6);
        int id2 = imageView.getId();
        ut3VarG.d(id2, 4, 0, 4);
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 4, id2, 5));
        ut3VarG.d(id2, 7, 0, 7);
        new fua(ut3VarG, 7, id2, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f));
        int id3 = m9bVar.getId();
        ut3VarG.d(id3, 3, 0, 3);
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id3, 5));
        ut3VarG.d(id3, 4, 0, 4);
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 4, id3, 5));
        ut3VarG.d(id3, 7, 0, 7);
        ut3VarG.d(id3, 6, 0, 6);
        ut3VarG.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Drawable getArrowDrawable() {
        return (Drawable) this.I0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final LayerDrawable getSendIcon() {
        return (LayerDrawable) this.J0.getValue();
    }

    public static LayerDrawable v(gk1 gk1Var) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gk1Var.H0, gk1Var.getArrowDrawable()});
        float f = 4;
        layerDrawable.setLayerInset(1, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        return layerDrawable;
    }

    public final cm6 getOnConfirmClickListener$calls_share_release() {
        return this.L0;
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.F0.setTextColor(yebVar.getText().h);
        this.G0.onThemeChanged(yebVar);
        cei.k(getArrowDrawable(), -1);
    }

    public final void setBody(CharSequence charSequence) {
        int i = !(charSequence == null || vmf.F(charSequence)) ? 0 : 8;
        TextView textView = this.F0;
        textView.setVisibility(i);
        textView.setText(charSequence);
        this.K0.setVisibility(0);
    }

    public final void setLoading(boolean z) {
        this.G0.setVisibility(z ? 0 : 8);
        this.F0.setVisibility(!z ? 0 : 8);
        this.K0.setVisibility(z ? 8 : 0);
    }

    public final void setOnConfirmClickListener$calls_share_release(cm6 cm6Var) {
        this.L0 = cm6Var;
    }
}
