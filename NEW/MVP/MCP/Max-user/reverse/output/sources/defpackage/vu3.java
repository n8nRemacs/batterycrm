package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public final class vu3 extends ConstraintLayout implements u6g {
    public final uxa F0;
    public final TextView G0;
    public final TextView H0;
    public final Object I0;
    public final Object J0;
    public final Object K0;
    public final ViewStub L0;
    public final ViewStub M0;
    public final ViewStub N0;
    public usd O0;
    public boolean P0;
    public long Q0;

    public vu3(final Context context) {
        super(context, null);
        final int i = 0;
        this.I0 = ipi.b(3, new cm6() { // from class: tu3
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return vu3.w(context, this);
                    case 1:
                        return vu3.x(context, this);
                    default:
                        return vu3.v(context, this);
                }
            }
        });
        final int i2 = 1;
        this.J0 = ipi.b(3, new cm6() { // from class: tu3
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return vu3.w(context, this);
                    case 1:
                        return vu3.x(context, this);
                    default:
                        return vu3.v(context, this);
                }
            }
        });
        final int i3 = 2;
        this.K0 = ipi.b(3, new cm6() { // from class: tu3
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return vu3.w(context, this);
                    case 1:
                        return vu3.x(context, this);
                    default:
                        return vu3.v(context, this);
                }
            }
        });
        this.Q0 = BuildConfig.MAX_TIME_TO_UPLOAD;
        setLayoutParams(new kt3(-1, -2));
        float f = 12;
        float f2 = 10;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        setBackground(getBackgroundDrawable());
        setOnLongClickListener(new bn0(2, this));
        f8j.d(this, 300L, new uu3(this, 0));
        uxa uxaVar = new uxa(context);
        uxaVar.setId(zud.D);
        uxaVar.setAvatarShape(kxa.a);
        this.F0 = uxaVar;
        TextView textView = new TextView(context);
        textView.setId(zud.I);
        dpg.f.b(textView, t75.b);
        textView.setTextColor(getTitleText());
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        mfh.k(textView, false);
        this.G0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(zud.E);
        dpg.i.b(textView2, t75.b);
        textView2.setTextColor(getDescriptionColor());
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        Object tag = textView2.getTag(o0d.oneme_theme_textview_for_span_attach_listener);
        if ((tag instanceof View.OnAttachStateChangeListener ? (View.OnAttachStateChangeListener) tag : null) != null) {
            wqi.q("ViewThemeUtils", "try to observe onThemeChanged for spans in TextView more than once for " + tqi.b(textView2), new Object[0]);
        } else {
            rk rkVar = new rk();
            textView2.setTag(o0d.oneme_theme_textview_for_span_attach_listener, rkVar);
            if (textView2.isAttachedToWindow()) {
                rkVar.onViewAttachedToWindow(textView2);
            }
            textView2.addOnAttachStateChangeListener(rkVar);
        }
        this.H0 = textView2;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(zud.G);
        this.L0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(zud.F);
        this.M0 = viewStub2;
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(zud.H);
        this.N0 = viewStub3;
        float f3 = 40;
        addView(uxaVar, kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        addView(textView, 0, -2);
        addView(textView2, 0, -2);
        addView(viewStub);
        addView(viewStub2);
        addView(viewStub3);
        ut3 ut3VarG = l5j.g(this);
        int id = uxaVar.getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 4, 0, 4);
        int id2 = textView.getId();
        ut3VarG.d(id2, 3, uxaVar.getId(), 3);
        ut3VarG.d(id2, 6, uxaVar.getId(), 7);
        new fua(ut3VarG, 6, id2, 5).e(kti.d(f * vw4.d().getDisplayMetrics().density));
        ut3VarG.d(id2, 7, viewStub.getId(), 6);
        float f4 = 8;
        new fua(ut3VarG, 7, id2, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f4));
        ut3VarG.d(id2, 4, textView2.getId(), 3);
        ut3VarG.g(id2).d.W = 2;
        ut3VarG.g(id2).d.l0 = true;
        int id3 = textView2.getId();
        ut3VarG.d(id3, 3, textView.getId(), 4);
        new fua(ut3VarG, 3, id3, 5).e(kti.d(4 * vw4.d().getDisplayMetrics().density));
        ut3VarG.d(id3, 6, textView.getId(), 6);
        ut3VarG.d(id3, 7, textView.getId(), 7);
        ut3VarG.d(id3, 4, uxaVar.getId(), 4);
        ut3VarG.g(id3).d.l0 = true;
        int id4 = viewStub.getId();
        ut3VarG.d(id4, 3, 0, 3);
        ut3VarG.d(id4, 7, viewStub2.getId(), 6);
        az1.q(f4, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id4, 5));
        ut3VarG.d(id4, 4, 0, 4);
        int id5 = viewStub2.getId();
        ut3VarG.d(id5, 3, 0, 3);
        ut3VarG.d(id5, 7, viewStub3.getId(), 6);
        ut3VarG.d(id5, 4, 0, 4);
        int id6 = viewStub3.getId();
        ut3VarG.d(id6, 3, 0, 3);
        ut3VarG.d(id6, 7, 0, 7);
        ut3VarG.d(id6, 4, 0, 4);
        ut3VarG.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ImageView getAudioCallButton() {
        return (ImageView) this.J0.getValue();
    }

    private final RippleDrawable getBackgroundDrawable() {
        int i = a93.s0.y(this).c().a.a.i;
        return new RippleDrawable(ColorStateList.valueOf(i), null, new ColorDrawable(-1));
    }

    private final int getDescriptionColor() {
        return a93.s0.y(this).getText().g;
    }

    private final RippleDrawable getRippleDrawableButton() {
        int i = a93.s0.y(this).c().a.a.i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-1);
        return new RippleDrawable(ColorStateList.valueOf(i), null, shapeDrawable);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final TextView getTimeTextView() {
        return (TextView) this.I0.getValue();
    }

    private final int getTitleText() {
        v1a v1aVar = a93.s0;
        boolean z = this.P0;
        u3g text = v1aVar.y(this).getText();
        return z ? text.b : text.e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ImageView getVideoCallButton() {
        return (ImageView) this.K0.getValue();
    }

    public static ImageView v(Context context, vu3 vu3Var) {
        ImageView imageView = new ImageView(context);
        float f = 40;
        imageView.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        imageView.setImageResource(yud.h2);
        u45.n(8, vw4.d().getDisplayMetrics().density, imageView);
        imageView.setBackground(vu3Var.getRippleDrawableButton());
        imageView.setContentDescription(context.getString(avd.b));
        imageView.setVisibility(8);
        imageView.setImageTintList(ColorStateList.valueOf(a93.s0.y(imageView).getIcon().f));
        f8j.d(imageView, 300L, new uu3(vu3Var, 1));
        return imageView;
    }

    public static TextView w(Context context, vu3 vu3Var) {
        TextView textView = new TextView(context);
        textView.setLayoutParams(new kt3(-2, -2));
        dpg.l.b(textView, t75.b);
        textView.setTextColor(vu3Var.getDescriptionColor());
        return textView;
    }

    public static ImageView x(Context context, vu3 vu3Var) {
        ImageView imageView = new ImageView(context);
        float f = 40;
        imageView.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        u45.n(8, vw4.d().getDisplayMetrics().density, imageView);
        imageView.setImageResource(yud.e0);
        imageView.setBackground(vu3Var.getRippleDrawableButton());
        imageView.setContentDescription(context.getString(avd.a));
        imageView.setVisibility(8);
        imageView.setImageTintList(ColorStateList.valueOf(a93.s0.y(imageView).getIcon().f));
        f8j.d(imageView, 300L, new uu3(vu3Var, 2));
        return imageView;
    }

    public final void A(boolean z) {
        ViewStub viewStub = this.N0;
        if (dqi.q(viewStub) || z) {
            dqi.p(viewStub, getVideoCallButton(), null);
            getVideoCallButton().setVisibility(z ? 0 : 8);
        }
    }

    public final void B(boolean z) {
        this.P0 = z;
        this.G0.setTextColor(getTitleText());
    }

    public final void C(long j, CharSequence charSequence, String str) {
        String string = str != null ? str.toString() : null;
        Long lValueOf = Long.valueOf(j);
        if (charSequence == null) {
            charSequence = "";
        }
        uxa.n(this.F0, string, lValueOf, charSequence);
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.G0.setTextColor(getTitleText());
        getTimeTextView().setTextColor(getDescriptionColor());
        this.H0.setTextColor(getDescriptionColor());
        getAudioCallButton().setBackground(getRippleDrawableButton());
        getVideoCallButton().setBackground(getRippleDrawableButton());
        setBackground(getBackgroundDrawable());
        getAudioCallButton().setImageTintList(ColorStateList.valueOf(yebVar.getIcon().f));
        getVideoCallButton().setImageTintList(ColorStateList.valueOf(yebVar.getIcon().f));
    }

    public final void setAvatarOverlay(yd0 yd0Var) {
        this.F0.setCustomOverlay(yd0Var);
    }

    public final void setAvatarPlaceholder(Drawable drawable) {
        uxa.o(this.F0, drawable, null, null, 30);
    }

    public final void setDescription(CharSequence charSequence) {
        this.H0.setText(charSequence);
    }

    public final void setTime(CharSequence charSequence) {
        ViewStub viewStub = this.L0;
        if (dqi.q(viewStub) || !vmf.F(charSequence)) {
            dqi.p(viewStub, getTimeTextView(), null);
            getTimeTextView().setText(charSequence);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }

    public final void z(boolean z) {
        ViewStub viewStub = this.M0;
        if (dqi.q(viewStub) || z) {
            dqi.p(viewStub, getAudioCallButton(), null);
            getAudioCallButton().setVisibility(z ? 0 : 8);
        }
    }
}
