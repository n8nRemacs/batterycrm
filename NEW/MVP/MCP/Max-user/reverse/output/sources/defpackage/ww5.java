package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.Layout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class ww5 extends x4g {
    public static final /* synthetic */ yy7[] X0;
    public int B0;
    public final Object C0;
    public boolean D0;
    public boolean E0;
    public r40 F0;
    public x9f G0;
    public final nk H0;
    public final Rect I0;
    public final Object J0;
    public final Object K0;
    public final Object L0;
    public final ShapeDrawable M0;
    public final Object N0;
    public final Object O0;
    public final Object P0;
    public final Object Q0;
    public final Object R0;
    public final OneMeDraweeView S0;
    public final TextView T0;
    public Layout U0;
    public final int V0;
    public final int W0;

    static {
        z8a z8aVar = new z8a(ww5.class, "model", "getModel()Lone/me/messages/list/loader/model/FileAttachModel;");
        vid.a.getClass();
        X0 = new yy7[]{z8aVar};
    }

    public ww5(final Context context) {
        super(context);
        v1a v1aVar = a93.s0;
        v1aVar.y(this).a();
        this.B0 = v1aVar.y(this).a().i().b.f;
        this.C0 = ipi.b(3, new ns2(context, 7));
        this.H0 = new nk(9, this);
        this.I0 = new Rect();
        final int i = 0;
        this.J0 = ipi.b(3, new cm6(this) { // from class: tw5
            public final /* synthetic */ ww5 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return r34.b(this.b.getContext(), yud.w0).mutate();
                    case 1:
                        return r34.b(this.b.getContext(), yud.E1).mutate();
                    default:
                        return ww5.A(this.b);
                }
            }
        });
        final int i2 = 1;
        this.K0 = ipi.b(3, new cm6(this) { // from class: tw5
            public final /* synthetic */ ww5 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return r34.b(this.b.getContext(), yud.w0).mutate();
                    case 1:
                        return r34.b(this.b.getContext(), yud.E1).mutate();
                    default:
                        return ww5.A(this.b);
                }
            }
        });
        final int i3 = 2;
        this.L0 = ipi.b(3, new cm6(this) { // from class: tw5
            public final /* synthetic */ ww5 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return r34.b(this.b.getContext(), yud.w0).mutate();
                    case 1:
                        return r34.b(this.b.getContext(), yud.E1).mutate();
                    default:
                        return ww5.A(this.b);
                }
            }
        });
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(getPreviewActionIconBackgroundColor());
        this.M0 = shapeDrawable;
        final int i4 = 0;
        this.N0 = ipi.b(3, new cm6() { // from class: uw5
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        ew5 ew5Var = new ew5(context);
                        this.addView(ew5Var);
                        return ew5Var;
                    case 1:
                        ImageView imageView = new ImageView(context);
                        float f = 44;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        ww5 ww5Var = this;
                        imageView.setBackground(ww5Var.M0);
                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        imageView.setTranslationZ(Float.MAX_VALUE);
                        ww5Var.addView(imageView);
                        return imageView;
                    case 2:
                        zd7 zd7Var = new zd7(context);
                        this.addView(zd7Var);
                        return zd7Var;
                    default:
                        l1h l1hVar = new l1h(context);
                        l1hVar.setBackgroundEnabled(true);
                        this.addView(l1hVar);
                        return l1hVar;
                }
            }
        });
        final int i5 = 1;
        this.O0 = ipi.b(3, new cm6() { // from class: uw5
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        ew5 ew5Var = new ew5(context);
                        this.addView(ew5Var);
                        return ew5Var;
                    case 1:
                        ImageView imageView = new ImageView(context);
                        float f = 44;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        ww5 ww5Var = this;
                        imageView.setBackground(ww5Var.M0);
                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        imageView.setTranslationZ(Float.MAX_VALUE);
                        ww5Var.addView(imageView);
                        return imageView;
                    case 2:
                        zd7 zd7Var = new zd7(context);
                        this.addView(zd7Var);
                        return zd7Var;
                    default:
                        l1h l1hVar = new l1h(context);
                        l1hVar.setBackgroundEnabled(true);
                        this.addView(l1hVar);
                        return l1hVar;
                }
            }
        });
        final int i6 = 2;
        this.P0 = ipi.b(3, new cm6() { // from class: uw5
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        ew5 ew5Var = new ew5(context);
                        this.addView(ew5Var);
                        return ew5Var;
                    case 1:
                        ImageView imageView = new ImageView(context);
                        float f = 44;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        ww5 ww5Var = this;
                        imageView.setBackground(ww5Var.M0);
                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        imageView.setTranslationZ(Float.MAX_VALUE);
                        ww5Var.addView(imageView);
                        return imageView;
                    case 2:
                        zd7 zd7Var = new zd7(context);
                        this.addView(zd7Var);
                        return zd7Var;
                    default:
                        l1h l1hVar = new l1h(context);
                        l1hVar.setBackgroundEnabled(true);
                        this.addView(l1hVar);
                        return l1hVar;
                }
            }
        });
        final int i7 = 3;
        this.Q0 = ipi.b(3, new cm6() { // from class: uw5
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        ew5 ew5Var = new ew5(context);
                        this.addView(ew5Var);
                        return ew5Var;
                    case 1:
                        ImageView imageView = new ImageView(context);
                        float f = 44;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        ww5 ww5Var = this;
                        imageView.setBackground(ww5Var.M0);
                        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        imageView.setTranslationZ(Float.MAX_VALUE);
                        ww5Var.addView(imageView);
                        return imageView;
                    case 2:
                        zd7 zd7Var = new zd7(context);
                        this.addView(zd7Var);
                        return zd7Var;
                    default:
                        l1h l1hVar = new l1h(context);
                        l1hVar.setBackgroundEnabled(true);
                        this.addView(l1hVar);
                        return l1hVar;
                }
            }
        });
        this.R0 = ipi.b(3, new nq5(6));
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        this.S0 = oneMeDraweeView;
        TextView textView = new TextView(context);
        vz2.g.b(textView, t75.b);
        textView.setMaxLines(1);
        this.T0 = textView;
        this.V0 = kti.d(10 * vw4.d().getDisplayMetrics().density);
        this.W0 = kti.d(12 * vw4.d().getDisplayMetrics().density);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(oneMeDraweeView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        kk4 kk4Var = qh9.s;
        yeb yebVarY = v1aVar.y(this);
        kk4Var.getClass();
        setBackground(kk4.o(yebVarY));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    public static Drawable A(ww5 ww5Var) {
        int i = yud.p0;
        int previewActionIconColor = ww5Var.getPreviewActionIconColor();
        Drawable drawableMutate = r34.b(ww5Var.getContext(), i).mutate();
        cei.k(drawableMutate, previewActionIconColor);
        return drawableMutate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, k18] */
    public static final void B(ww5 ww5Var, boolean z) {
        hv5 model = ww5Var.getModel();
        if (model == null) {
            return;
        }
        hbd hbdVar = model.m;
        mcf mcfVar = hbdVar.a;
        ww5Var.U0 = model.f;
        ww5Var.setSubtitle(((xz) mcfVar.getValue()).b());
        ww5Var.setPreview(model);
        boolean z2 = !z;
        ?? r3 = ww5Var.O0;
        rm9 messageTextView$message_list_release = ww5Var.getMessageTextView$message_list_release();
        boolean z3 = model.l;
        gv5 gv5Var = model.g;
        messageTextView$message_list_release.setVisibility(z3 ? 0 : 8);
        xz xzVar = (xz) mcfVar.getValue();
        if (ww5Var.E0) {
            ?? r9 = ww5Var.N0;
            if (r9.e()) {
                ((ew5) r9.getValue()).setVisibility(8);
            }
            ww5Var.getBigPreviewActionIcon().setVisibility(0);
            if (hbdVar.a.getValue() instanceof uz) {
                ww5Var.G(r3);
                return;
            } else if (hbdVar.a.getValue() instanceof vz) {
                ww5Var.E(r3);
                return;
            } else {
                if (xzVar instanceof tz) {
                    ww5Var.F(r3, ((tz) xzVar).b);
                    return;
                }
                return;
            }
        }
        if (r3.e()) {
            ((ImageView) r3.getValue()).setVisibility(8);
        }
        ?? r32 = ww5Var.P0;
        if (r32.e()) {
            ((zd7) r32.getValue()).setVisibility(8);
        }
        ww5Var.S0.setVisibility(8);
        ww5Var.getActionIconView().setVisibility(0);
        if (hbdVar.a.getValue() instanceof uz) {
            ww5Var.getActionIconView().c(gv5Var, z2);
            return;
        }
        if (hbdVar.a.getValue() instanceof vz) {
            ww5Var.getActionIconView().a(gv5Var, z2);
            return;
        }
        if (xzVar instanceof wz) {
            ww5Var.getActionIconView().b(gv5Var, ((wz) xzVar).b, z2);
            return;
        }
        ew5 actionIconView = ww5Var.getActionIconView();
        pw5 pw5Var = actionIconView.d;
        pw5Var.a(gv5Var);
        gv5 gv5Var2 = pw5Var.c;
        if (gv5Var2 == null) {
            return;
        }
        int iG = a93.s0.y(actionIconView).a().g(gv5Var2.c().d);
        actionIconView.c.d(iG, iG);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ew5 getActionIconView() {
        return (ew5) this.N0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ImageView getBigPreviewActionIcon() {
        return (ImageView) this.O0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final xq0 getBlurPostProcessor() {
        return (xq0) this.C0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final u74 getCornersOutlineProvider() {
        return (u74) this.R0.getValue();
    }

    private final hv5 getModel() {
        yy7 yy7Var = X0[0];
        return (hv5) this.H0.b;
    }

    private final int getPreviewActionIconBackgroundColor() {
        a93.s0.y(this).a();
        return 1543503872;
    }

    private final int getPreviewActionIconColor() {
        a93.s0.y(this).a();
        return -1;
    }

    private final void setModel(hv5 hv5Var) {
        this.H0.O(this, X0[0], hv5Var);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, k18] */
    private final void setPreview(hv5 hv5Var) {
        od7 od7Var = hv5Var.j;
        s0h s0hVar = hv5Var.k;
        if (od7Var == null) {
            od7Var = s0hVar != null ? new od7(0L, s0hVar.b, s0hVar.c, s0hVar.d, false, s0hVar.e, false, s0hVar.h, null, null, null, null, 7936) : null;
        }
        ?? r5 = this.Q0;
        ((View) r5.getValue()).setVisibility(hv5Var.i == 2 ? 0 : 8);
        if (dqi.r(r5)) {
            l1h l1hVar = (l1h) r5.getValue();
            if (s0hVar != null) {
                long jG = s65.g(s0hVar.f);
                String[] strArr = l6g.b;
                l1hVar.setContent(z7i.a(jG));
            }
        }
        ?? r1 = this.P0;
        OneMeDraweeView oneMeDraweeView = this.S0;
        if (od7Var == null) {
            if (dqi.r(r1)) {
                ((zd7) r1.getValue()).setVisibility(8);
            }
            oneMeDraweeView.setVisibility(8);
            this.D0 = false;
            return;
        }
        zd7 zd7Var = (zd7) r1.getValue();
        zd7Var.setVisibility(0);
        zd7Var.setImageAttach(od7Var);
        sf7 sf7VarD = sf7.d(od7Var.b);
        sf7VarD.d = od7Var.i;
        sf7VarD.k = getBlurPostProcessor();
        oneMeDraweeView.i(sf7VarD.a(), null);
        ((gr6) oneMeDraweeView.getHierarchy()).h(od7Var.j);
    }

    private final void setSubtitle(s5g s5gVar) {
        if (s5gVar == null) {
            return;
        }
        this.T0.setText(s5gVar.b(getContext()));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, k18] */
    public final void C(yt0 yt0Var) {
        TextPaint paint;
        v1a v1aVar = a93.s0;
        bu0 bu0Var = yt0Var.d;
        int i = bu0Var.m;
        this.B0 = yt0Var.b.f;
        ?? r3 = this.J0;
        if (r3.e()) {
            Drawable drawable = (Drawable) r3.getValue();
            v1aVar.y(this).a();
            cei.k(drawable, -1);
        }
        ?? r32 = this.L0;
        if (r32.e()) {
            Drawable drawable2 = (Drawable) r32.getValue();
            v1aVar.y(this).a();
            cei.k(drawable2, -1);
        }
        Layout layout = this.U0;
        if (layout != null && (paint = layout.getPaint()) != null) {
            paint.setColor(bu0Var.e);
        }
        this.T0.setTextColor(bu0Var.f);
        ?? r1 = this.N0;
        if (r1.e()) {
            ew5 ew5Var = (ew5) r1.getValue();
            ew5Var.a = yt0Var;
            pw5 pw5Var = ew5Var.d;
            pw5Var.onThemeChanged(v1aVar.y(ew5Var));
            gv5 gv5Var = pw5Var.c;
            if (gv5Var != null) {
                int iG = v1aVar.y(ew5Var).a().g(gv5Var.c().d);
                ew5Var.c.d(iG, iG);
            }
        }
        ?? r7 = this.O0;
        boolean zE = r7.e();
        ShapeDrawable shapeDrawable = this.M0;
        if (zE) {
            ImageView imageView = (ImageView) r7.getValue();
            if (imageView.getDrawable() instanceof r00) {
                Drawable drawable3 = imageView.getDrawable();
                r00 r00Var = drawable3 instanceof r00 ? (r00) drawable3 : null;
                if (r00Var != null) {
                    r00Var.b(this.B0);
                }
            } else {
                imageView.setBackground(shapeDrawable);
                imageView.setImageTintList(ColorStateList.valueOf(getPreviewActionIconColor()));
            }
        }
        shapeDrawable.getPaint().setColor(getPreviewActionIconBackgroundColor());
        getDate$message_list_release().setTextColor$message_list_release(i);
        getDate$message_list_release().setDateViewStatusColor(i);
        invalidate();
    }

    public final void D() {
        removeOnAttachStateChangeListener(this.F0);
        x9f x9fVar = this.G0;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        this.G0 = null;
        setModel(null);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, k18] */
    public final void E(k18 k18Var) {
        if (k18Var.e()) {
            ImageView imageView = (ImageView) k18Var.getValue();
            hv5 model = getModel();
            if ((model != null ? model.i : 0) == 2) {
                Drawable drawable = (Drawable) this.K0.getValue();
                cei.k(drawable, getPreviewActionIconColor());
                imageView.setImageDrawable(drawable);
                imageView.setBackground(this.M0);
            }
            hv5 model2 = getModel();
            imageView.setVisibility((model2 != null ? model2.i : 0) == 2 ? 0 : 8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void F(k18 k18Var, float f) {
        Drawable drawable = (Drawable) this.L0.getValue();
        int previewActionIconColor = getPreviewActionIconColor();
        ImageView imageView = (ImageView) k18Var.getValue();
        if (!(imageView.getDrawable() instanceof r00)) {
            r00 r00Var = new r00();
            r00Var.a = drawable;
            r00Var.invalidateSelf();
            r00Var.b(previewActionIconColor);
            r00Var.e = true;
            r00Var.invalidateSelf();
            imageView.setImageDrawable(r00Var);
            imageView.setAdjustViewBounds(false);
        }
        imageView.getDrawable().setLevel((int) (f * 100));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    public final void G(k18 k18Var) {
        ImageView imageView = (ImageView) k18Var.getValue();
        imageView.setAdjustViewBounds(false);
        Drawable drawable = (Drawable) this.J0.getValue();
        cei.k(drawable, getPreviewActionIconColor());
        imageView.setImageDrawable(drawable);
        imageView.setBackground(this.M0);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
    }

    public final void H(hv5 hv5Var) {
        setModel(hv5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, k18] */
    public final void I(xz xzVar) {
        hv5 model;
        gv5 gv5Var;
        if (xzVar == null || (model = getModel()) == null || xzVar.a() != model.b) {
            return;
        }
        setSubtitle(xzVar.b());
        boolean z = this.E0;
        ?? r3 = this.O0;
        if (z) {
            ?? r0 = this.N0;
            if (r0.e()) {
                ((ew5) r0.getValue()).setVisibility(8);
            }
            getBigPreviewActionIcon().setVisibility(0);
            if (xzVar instanceof tz) {
                F(r3, ((tz) xzVar).b);
                return;
            }
            if (xzVar instanceof wz) {
                F(r3, ((wz) xzVar).b);
                return;
            } else if (xzVar instanceof uz) {
                G(r3);
                return;
            } else {
                if (!(xzVar instanceof vz)) {
                    throw new NoWhenBranchMatchedException();
                }
                E(r3);
                return;
            }
        }
        if (r3.e()) {
            ((ImageView) r3.getValue()).setVisibility(8);
        }
        ?? r02 = this.P0;
        if (r02.e()) {
            ((zd7) r02.getValue()).setVisibility(8);
        }
        this.S0.setVisibility(8);
        getActionIconView().setVisibility(0);
        hv5 model2 = getModel();
        if (model2 == null || (gv5Var = model2.g) == null) {
            gv5Var = fv5.c;
        }
        if (xzVar instanceof tz) {
            getActionIconView().b(gv5Var, ((tz) xzVar).b, true);
            return;
        }
        if (xzVar instanceof wz) {
            getActionIconView().b(gv5Var, ((wz) xzVar).b, true);
        } else if (xzVar instanceof uz) {
            getActionIconView().c(gv5Var, true);
        } else {
            if (!(xzVar instanceof vz)) {
                throw new NoWhenBranchMatchedException();
            }
            getActionIconView().a(gv5Var, true);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int contentHorizontalPadding$message_list_release;
        super.dispatchDraw(canvas);
        Layout layout = this.U0;
        if (layout != null) {
            View viewJ = dqi.j(this.N0);
            if (viewJ != null) {
                contentHorizontalPadding$message_list_release = getContentHorizontalPadding$message_list_release() + viewJ.getMeasuredWidth();
            } else {
                contentHorizontalPadding$message_list_release = 0;
            }
            int i = this.V0 + contentHorizontalPadding$message_list_release;
            float top = this.T0.getTop() - layout.getHeight();
            int iSave = canvas.save();
            canvas.translate(i, top);
            try {
                layout.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // defpackage.x4g, defpackage.jf4
    public final void h(CharSequence charSequence, boolean z) {
        if4 date$message_list_release = getDate$message_list_release();
        yy7[] yy7VarArr = if4.K0;
        date$message_list_release.c(charSequence, false);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    @Override // defpackage.x4g, defpackage.ii9
    public final boolean i(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (this.D0 && shh.c(this.S0, this).contains(x, y)) {
            return true;
        }
        ?? r1 = this.P0;
        if (dqi.r(r1) && shh.c((View) r1.getValue(), this).contains(x, y)) {
            return true;
        }
        return this.I0.contains(x, y);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0288  */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, k18] */
    @Override // defpackage.x4g, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ww5.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, k18] */
    @Override // defpackage.x4g, android.view.View
    public final void onMeasure(int i, int i2) {
        int iM;
        int i3;
        int iIntValue;
        float f = 10;
        int iD = u45.d(f, vw4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int iD2 = kti.d(40 * vw4.d().getDisplayMetrics().density);
        int iD3 = kti.d(44 * vw4.d().getDisplayMetrics().density);
        int iD4 = kti.d(4 * vw4.d().getDisplayMetrics().density);
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : getSuggestedMinimumWidth() + getContentHorizontalPadding$message_list_release();
        if (dqi.r(getSenderAliasDelegate().c) && dqi.r(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            size = Math.max(size, getSenderAliasDelegate().N());
        }
        boolean zR = dqi.r(getSenderNameViewStub$message_list_release().b);
        int iD5 = this.V0;
        if (zR) {
            getSenderNameViewStub$message_list_release().d(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            int iJ0 = getSenderAliasDelegate().j0();
            iM = getSenderBottomMargin$message_list_release() + getSenderNameViewStub$message_list_release().a() + iD5;
            size = Math.max(size, (iD5 * 2) + getSenderNameViewStub$message_list_release().b() + iJ0);
        } else {
            iM = iD5;
        }
        hv5 model = getModel();
        int i4 = this.W0;
        if (model != null && model.l) {
            rm9 messageTextView$message_list_release = getMessageTextView$message_list_release();
            messageTextView$message_list_release.i();
            size = Math.max(size, (iD5 * 2) + messageTextView$message_list_release.getMeasuredWidth());
            iM += messageTextView$message_list_release.getMeasuredHeight() + i4;
        }
        ?? r9 = this.P0;
        boolean zR2 = dqi.r(r9);
        OneMeDraweeView oneMeDraweeView = this.S0;
        if (zR2) {
            zd7 zd7Var = (zd7) r9.getValue();
            i3 = iD4;
            zd7Var.measure(View.MeasureSpec.makeMeasureSpec(iD, 1073741824), i2);
            iM += zd7Var.getMeasuredLayoutHeight() + i4;
            size = Math.max(size, (iD5 * 2) + zd7Var.getMeasuredLayoutWidth());
            boolean z = (zd7Var.getMeasuredLayoutWidth() == zd7Var.getMeasuredWidth() && zd7Var.getMeasuredLayoutHeight() == zd7Var.getMeasuredHeight()) ? false : true;
            this.D0 = z;
            oneMeDraweeView.setVisibility(z ? 0 : 8);
        } else {
            i3 = iD4;
        }
        if (this.D0) {
            oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(iD, 1073741824), View.MeasureSpec.makeMeasureSpec(((zd7) r9.getValue()).getMeasuredLayoutHeight(), 1073741824));
            size = Math.max(size, (iD5 * 2) + oneMeDraweeView.getMeasuredWidth());
        }
        ?? r7 = this.O0;
        if (r7.e()) {
            ((ImageView) r7.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iD3, 1073741824), View.MeasureSpec.makeMeasureSpec(iD3, 1073741824));
        }
        boolean zR3 = dqi.r(r9);
        ?? r72 = this.N0;
        if (zR3) {
            iIntValue = Math.min(iD, ((zd7) r9.getValue()).getMeasuredWidth());
        } else {
            Integer numValueOf = Integer.valueOf(getContentHorizontalPadding$message_list_release() + iD2);
            if (!dqi.r(r72)) {
                numValueOf = 0;
            }
            iIntValue = iD - numValueOf.intValue();
        }
        if (dqi.r(getMessageLinkDelegate().c)) {
            getMessageLinkDelegate().Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            size = Math.max(size, (iD5 * 2) + getMessageLinkDelegate().N());
            iM += getMessageLinkDelegate().M() + i3;
        }
        getDate$message_list_release().measure(i, i2);
        ?? r12 = this.Q0;
        if (r12.e()) {
            ((l1h) r12.getValue()).measure(i, i2);
        }
        if (r72.e()) {
            ((ew5) r72.getValue()).measure(View.MeasureSpec.makeMeasureSpec(iD2, 1073741824), View.MeasureSpec.makeMeasureSpec(iD2, 1073741824));
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iIntValue, Integer.MIN_VALUE);
        TextView textView = this.T0;
        textView.measure(iMakeMeasureSpec, i2);
        int iMax = Math.max(gpi.e(this.U0), textView.getMeasuredWidth());
        if (!dqi.r(r9)) {
            size = Math.max(size, getContentHorizontalPadding$message_list_release() + (iD5 * 2) + iMax + iD2);
        }
        int contentHorizontalPadding$message_list_release = (size - iD5) - getContentHorizontalPadding$message_list_release();
        Integer numValueOf2 = Integer.valueOf(iD2);
        Integer numValueOf3 = Integer.valueOf(textView.getMeasuredHeight() + gpi.d(this.U0));
        if (!dqi.r(r72)) {
            numValueOf2 = numValueOf3;
        }
        this.I0.set(iD5, iM, contentHorizontalPadding$message_list_release, numValueOf2.intValue() + iM);
        int measuredHeight = textView.getMeasuredHeight() + gpi.d(this.U0);
        Integer numValueOf4 = Integer.valueOf(iD2);
        Integer numValueOf5 = Integer.valueOf(measuredHeight);
        if (!dqi.r(r72)) {
            numValueOf4 = numValueOf5;
        }
        int iMax2 = Math.max(numValueOf4.intValue(), measuredHeight) + iM;
        if (dqi.r(getReactionsDelegate().c)) {
            getReactionsDelegate().Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            iMax2 = utb.j(f, vw4.d().getDisplayMetrics().density, getReactionsDelegate().M(), iMax2);
            size = Math.max(size, (iD5 * 2) + getReactionsDelegate().N());
        }
        if (dqi.r(getReactionsDelegate().c)) {
            if (size - (getReactionsDelegate().N() + (iD5 * 2)) < getDate$message_list_release().getMeasuredWidth()) {
                iMax2 += u45.c(6, vw4.d().getDisplayMetrics().density, getDate$message_list_release().getMeasuredHeight()) - kti.d(8 * vw4.d().getDisplayMetrics().density);
            }
        }
        int iE = gpi.e(this.U0) - textView.getMeasuredWidth();
        boolean z2 = dqi.r(r9) && ((zd7) r9.getValue()).getMeasuredLayoutWidth() <= iE && iE < getDate$message_list_release().getMeasuredWidth();
        boolean z3 = !dqi.r(r9) && iE < getDate$message_list_release().getMeasuredWidth();
        if (!dqi.r(getReactionsDelegate().c) && (z2 || z3)) {
            size += (kti.d(8 * vw4.d().getDisplayMetrics().density) + getDate$message_list_release().getMeasuredWidth()) - iE;
        }
        if (dqi.r(getReactionsDelegate().c)) {
            iD5 = kti.d(8 * vw4.d().getDisplayMetrics().density);
        }
        setMeasuredDimension(size, iMax2 + iD5);
    }

    @Override // defpackage.x4g, defpackage.jf4
    public void setDateViewStatus(ghh ghhVar) {
        getDate$message_list_release().setStatus$message_list_release(ghhVar);
    }

    public final void setFileInfo(hv5 hv5Var) {
        r40 r40Var;
        setModel(hv5Var);
        this.F0 = new r40(this, 5, hv5Var);
        if (isAttachedToWindow() && (r40Var = this.F0) != null) {
            r40Var.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.F0);
    }

    @Override // defpackage.x4g, defpackage.jf4
    public void setIsChannelMode(boolean z) {
        getDate$message_list_release().setChannelMode$message_list_release(z);
    }

    @Override // defpackage.x4g, defpackage.vde
    public void setSenderName(Layout layout) {
        getSenderNameViewStub$message_list_release().e(layout);
    }

    @Override // defpackage.x4g, defpackage.vde
    public void setSenderNameColor(int i) {
        getSenderNameViewStub$message_list_release().f(i);
    }
}
