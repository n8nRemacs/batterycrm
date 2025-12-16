package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;

/* loaded from: classes2.dex */
public final class wue extends ViewGroup implements jf4, vde, y4g, b37, wad, zk9, nkb, qde, z78 {
    public ab3 A0;
    public final rm9 B0;
    public final Object C0;
    public final Object D0;
    public final Object E0;
    public final Object F0;
    public final Object G0;
    public final if4 H0;
    public final u9d a;
    public final uk9 b;
    public final okb c;
    public final ode d;
    public final em6 o;
    public final k18 s0;
    public yt0 t0;
    public final Paint u0;
    public final Rect v0;
    public boolean w0;
    public final Object x0;
    public final Object y0;
    public final wde z0;

    public wue(final Context context, ts9 ts9Var) {
        u9d u9dVar = new u9d();
        uk9 uk9Var = new uk9();
        okb okbVar = new okb();
        ode odeVar = new ode();
        k18 k18Var = fq9.a;
        bwf bwfVarD = gq9.a.getAccessor().d(48);
        super(context);
        this.a = u9dVar;
        this.b = uk9Var;
        this.c = okbVar;
        this.d = odeVar;
        this.o = ts9Var;
        this.s0 = bwfVarD;
        v1a v1aVar = a93.s0;
        this.t0 = v1aVar.y(this).a().i();
        final int i = 1;
        Paint paint = new Paint(1);
        paint.setColor(getInternalBubbleBackgroundColor());
        this.u0 = paint;
        this.v0 = new Rect();
        final int i2 = 0;
        final int i3 = 3;
        this.x0 = ipi.b(3, new cm6(this) { // from class: uue
            public final /* synthetic */ wue b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return wue.b(this.b);
                    default:
                        return wue.i(this.b);
                }
            }
        });
        this.y0 = ipi.b(3, new cm6(this) { // from class: uue
            public final /* synthetic */ wue b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return wue.b(this.b);
                    default:
                        return wue.i(this.b);
                }
            }
        });
        this.z0 = new wde(this);
        rm9 rm9Var = new rm9(context);
        rm9Var.setId(j7b.N);
        rm9Var.setLinkLongClickListener(new co2(9, this));
        rm9Var.setOnLongClickListener(new bn0(5, this));
        rm9Var.setSingleClickAction(new Runnable(this) { // from class: vue
            public final /* synthetic */ wue b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        ((View) this.b.getParent()).performClick();
                        break;
                    default:
                        ((View) this.b.getParent()).performClick();
                        break;
                }
            }
        });
        rm9Var.setTryToSingleClickAction(new Runnable(this) { // from class: vue
            public final /* synthetic */ wue b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        ((View) this.b.getParent()).performClick();
                        break;
                    default:
                        ((View) this.b.getParent()).performClick();
                        break;
                }
            }
        });
        this.B0 = rm9Var;
        this.C0 = ipi.b(3, new cm6() { // from class: tue
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ImageView imageView = new ImageView(context);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        Paint paint2 = shapeDrawable.getPaint();
                        v1a v1aVar2 = a93.s0;
                        paint2.setColor(v1aVar2.y(imageView).a().G().b.q);
                        imageView.setBackground(shapeDrawable);
                        imageView.setImageResource(ivd.m1);
                        u45.n(14, vw4.d().getDisplayMetrics().density, imageView);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        v1aVar2.y(imageView).a();
                        imageView.setImageTintList(ColorStateList.valueOf(-1));
                        float f = 52;
                        this.addView(imageView, new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 1:
                        return wue.c(context, this);
                    case 2:
                        return wue.a(context, this);
                    case 3:
                        return wue.e(context, this);
                    default:
                        zd7 zd7Var = new zd7(context);
                        this.addView(zd7Var, new ViewGroup.LayoutParams(-2, -2));
                        return zd7Var;
                }
            }
        });
        final int i4 = 2;
        this.D0 = ipi.b(3, new cm6() { // from class: tue
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        ImageView imageView = new ImageView(context);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        Paint paint2 = shapeDrawable.getPaint();
                        v1a v1aVar2 = a93.s0;
                        paint2.setColor(v1aVar2.y(imageView).a().G().b.q);
                        imageView.setBackground(shapeDrawable);
                        imageView.setImageResource(ivd.m1);
                        u45.n(14, vw4.d().getDisplayMetrics().density, imageView);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        v1aVar2.y(imageView).a();
                        imageView.setImageTintList(ColorStateList.valueOf(-1));
                        float f = 52;
                        this.addView(imageView, new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 1:
                        return wue.c(context, this);
                    case 2:
                        return wue.a(context, this);
                    case 3:
                        return wue.e(context, this);
                    default:
                        zd7 zd7Var = new zd7(context);
                        this.addView(zd7Var, new ViewGroup.LayoutParams(-2, -2));
                        return zd7Var;
                }
            }
        });
        this.E0 = ipi.b(3, new cm6() { // from class: tue
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ImageView imageView = new ImageView(context);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        Paint paint2 = shapeDrawable.getPaint();
                        v1a v1aVar2 = a93.s0;
                        paint2.setColor(v1aVar2.y(imageView).a().G().b.q);
                        imageView.setBackground(shapeDrawable);
                        imageView.setImageResource(ivd.m1);
                        u45.n(14, vw4.d().getDisplayMetrics().density, imageView);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        v1aVar2.y(imageView).a();
                        imageView.setImageTintList(ColorStateList.valueOf(-1));
                        float f = 52;
                        this.addView(imageView, new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 1:
                        return wue.c(context, this);
                    case 2:
                        return wue.a(context, this);
                    case 3:
                        return wue.e(context, this);
                    default:
                        zd7 zd7Var = new zd7(context);
                        this.addView(zd7Var, new ViewGroup.LayoutParams(-2, -2));
                        return zd7Var;
                }
            }
        });
        final int i5 = 4;
        this.F0 = ipi.b(3, new cm6() { // from class: tue
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        ImageView imageView = new ImageView(context);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        Paint paint2 = shapeDrawable.getPaint();
                        v1a v1aVar2 = a93.s0;
                        paint2.setColor(v1aVar2.y(imageView).a().G().b.q);
                        imageView.setBackground(shapeDrawable);
                        imageView.setImageResource(ivd.m1);
                        u45.n(14, vw4.d().getDisplayMetrics().density, imageView);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        v1aVar2.y(imageView).a();
                        imageView.setImageTintList(ColorStateList.valueOf(-1));
                        float f = 52;
                        this.addView(imageView, new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 1:
                        return wue.c(context, this);
                    case 2:
                        return wue.a(context, this);
                    case 3:
                        return wue.e(context, this);
                    default:
                        zd7 zd7Var = new zd7(context);
                        this.addView(zd7Var, new ViewGroup.LayoutParams(-2, -2));
                        return zd7Var;
                }
            }
        });
        this.G0 = ipi.b(3, new cm6() { // from class: tue
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ImageView imageView = new ImageView(context);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                        Paint paint2 = shapeDrawable.getPaint();
                        v1a v1aVar2 = a93.s0;
                        paint2.setColor(v1aVar2.y(imageView).a().G().b.q);
                        imageView.setBackground(shapeDrawable);
                        imageView.setImageResource(ivd.m1);
                        u45.n(14, vw4.d().getDisplayMetrics().density, imageView);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        v1aVar2.y(imageView).a();
                        imageView.setImageTintList(ColorStateList.valueOf(-1));
                        float f = 52;
                        this.addView(imageView, new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
                        return imageView;
                    case 1:
                        return wue.c(context, this);
                    case 2:
                        return wue.a(context, this);
                    case 3:
                        return wue.e(context, this);
                    default:
                        zd7 zd7Var = new zd7(context);
                        this.addView(zd7Var, new ViewGroup.LayoutParams(-2, -2));
                        return zd7Var;
                }
            }
        });
        if4 if4Var = new if4(context);
        if4Var.setBackgroundEnabled$message_list_release(false);
        this.H0 = if4Var;
        u9dVar.b = this;
        uk9Var.b = this;
        odeVar.b = this;
        addView(rm9Var, new ViewGroup.LayoutParams(-2, -2));
        addView(if4Var, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setClickable(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        kk4 kk4Var = qh9.s;
        yeb yebVarY = v1aVar.y(this);
        kk4Var.getClass();
        setBackground(kk4.o(yebVarY));
        setTransitionGroup(true);
    }

    public static AppCompatTextView a(Context context, wue wueVar) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        t5g t5gVar = dpg.a;
        vz2.j.b(appCompatTextView, t75.b);
        appCompatTextView.setTextColor(wueVar.getTitleColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        wueVar.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    public static RippleDrawable b(wue wueVar) {
        float f = vw4.d().getDisplayMetrics().density * 12.0f;
        int internalBubbleBackgroundContentColor = wueVar.getInternalBubbleBackgroundContentColor();
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        return new RippleDrawable(ColorStateList.valueOf(internalBubbleBackgroundContentColor), null, new ShapeDrawable(new RoundRectShape(fArr, null, null)));
    }

    public static AppCompatTextView c(Context context, wue wueVar) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        t5g t5gVar = dpg.a;
        vz2.l.b(appCompatTextView, t75.b);
        appCompatTextView.setTextColor(wueVar.getAdditionalTextColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        wueVar.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    public static AppCompatTextView e(Context context, wue wueVar) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        t5g t5gVar = dpg.a;
        vz2.g.b(appCompatTextView, t75.b);
        appCompatTextView.setTextColor(wueVar.getAdditionalTextColor());
        appCompatTextView.setEmojiCompatEnabled(false);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        wueVar.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        return appCompatTextView;
    }

    private final int getAdditionalTextColor() {
        return this.t0.d.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final ShapeDrawable getBorderDrawable() {
        return (ShapeDrawable) this.y0.getValue();
    }

    private final rt5 getFeaturePrefs() {
        return (rt5) this.s0.getValue();
    }

    private final int getInternalBubbleBackgroundBorderColor() {
        return this.t0.c.b;
    }

    private final int getInternalBubbleBackgroundColor() {
        return this.t0.a.m;
    }

    private final int getInternalBubbleBackgroundContentColor() {
        return a93.s0.y(this).c().a.a.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final RippleDrawable getRippleDrawable() {
        return (RippleDrawable) this.x0.getValue();
    }

    private final int getTitleColor() {
        return this.t0.d.e;
    }

    public static ShapeDrawable i(wue wueVar) {
        float f = vw4.d().getDisplayMetrics().density * 12.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(wueVar.getInternalBubbleBackgroundBorderColor());
        shapeDrawable.getPaint().setStrokeWidth(vw4.d().getDisplayMetrics().density * 1.0f);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        return shapeDrawable;
    }

    @Override // defpackage.zk9
    public final void d(yt0 yt0Var) {
        this.b.d(yt0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        RippleDrawable rippleDrawable = getRippleDrawable();
        Rect rect = this.v0;
        rippleDrawable.setBounds(rect);
        getRippleDrawable().draw(canvas);
        getBorderDrawable().setBounds(rect);
        getBorderDrawable().draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getRippleDrawable().setState(getDrawableState());
        getBorderDrawable().setState(getDrawableState());
        invalidate();
    }

    @Override // defpackage.b37
    public final void f(List list, sm6 sm6Var) {
        rm9 rm9Var = this.B0;
        CharSequence text = rm9Var.getText();
        if (text == null) {
            return;
        }
        if (list == null || list.isEmpty() || sm6Var == null) {
            rm9.f(rm9Var);
        } else {
            rm9Var.g((List) sm6Var.invoke(text.toString(), list));
        }
    }

    @Override // defpackage.wad
    public final void g(xl9 xl9Var, boolean z) {
        this.a.g(xl9Var, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.d.j0();
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public ab3 getOnLinkLongClickListener() {
        return this.A0;
    }

    @Override // defpackage.jf4
    public final void h(CharSequence charSequence, boolean z) {
        this.H0.c(charSequence, z);
    }

    @Override // defpackage.wad
    public final void l(yt0 yt0Var, boolean z) {
        this.a.l(yt0Var, z);
    }

    @Override // defpackage.zk9
    public final void m() {
        this.b.m();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, k18] */
    public final void n(yt0 yt0Var) {
        int i = yt0Var.d.m;
        this.t0 = yt0Var;
        ?? r3 = this.D0;
        if (r3.e()) {
            ((AppCompatTextView) r3.getValue()).setTextColor(getTitleColor());
        }
        ?? r32 = this.C0;
        if (r32.e()) {
            ((AppCompatTextView) r32.getValue()).setTextColor(getAdditionalTextColor());
        }
        ?? r33 = this.E0;
        if (r33.e()) {
            ((AppCompatTextView) r33.getValue()).setTextColor(getAdditionalTextColor());
        }
        this.u0.setColor(getInternalBubbleBackgroundColor());
        getRippleDrawable().setColor(ColorStateList.valueOf(getInternalBubbleBackgroundContentColor()));
        getBorderDrawable().getPaint().setColor(getInternalBubbleBackgroundBorderColor());
        if4 if4Var = this.H0;
        if4Var.setTextColor$message_list_release(i);
        if4Var.setDateViewStatusColor(i);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, k18] */
    public final void o(kte kteVar, boolean z) {
        this.t0 = a93.s0.y(this).a().h(z);
        String str = kteVar.c;
        ?? r2 = this.C0;
        if (str != null) {
            View view = (View) r2.getValue();
            ((AppCompatTextView) view).setText(str);
            view.setVisibility(0);
        } else if (r2.e()) {
            ((View) r2.getValue()).setVisibility(8);
        }
        String str2 = kteVar.d;
        ?? r22 = this.D0;
        if (str2 != null) {
            View view2 = (View) r22.getValue();
            ((AppCompatTextView) view2).setText(str2);
            view2.setVisibility(0);
        } else if (r22.e()) {
            ((View) r22.getValue()).setVisibility(8);
        }
        String str3 = kteVar.e;
        ?? r23 = this.E0;
        if (str3 != null) {
            View view3 = (View) r23.getValue();
            ((AppCompatTextView) view3).setText(str3);
            view3.setVisibility(0);
        } else if (r23.e()) {
            ((View) r23.getValue()).setVisibility(8);
        }
        od7 od7Var = kteVar.g;
        ?? r24 = this.F0;
        if (od7Var != null) {
            View view4 = (View) r24.getValue();
            ((zd7) view4).setImageAttach(od7Var);
            view4.setVisibility(0);
        } else if (r24.e()) {
            ((View) r24.getValue()).setVisibility(8);
        }
        String str4 = kteVar.f;
        ?? r25 = this.G0;
        if (str4 != null && ((gu5) getFeaturePrefs()).w() && Build.VERSION.SDK_INT >= 29) {
            ((View) r25.getValue()).setVisibility(0);
        } else if (dqi.r(r25)) {
            ((View) r25.getValue()).setVisibility(8);
        }
        GestureDetector gestureDetector = new GestureDetector(getContext(), new of3(this, 4, new sue(this, 0, kteVar)));
        gestureDetector.setIsLongpressEnabled(true);
        setOnTouchListener(new or6(gestureDetector, 6));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.v0;
        if (rect.isEmpty()) {
            return;
        }
        float f = vw4.d().getDisplayMetrics().density * 12.0f;
        canvas.drawRoundRect(new RectF(rect), f, f, this.u0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM;
        float f = 10;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        float f2 = 8;
        int iD2 = kti.d(vw4.d().getDisplayMetrics().density * f2);
        int iD3 = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        wde wdeVar = this.z0;
        if (dqi.r(wdeVar.b)) {
            wdeVar.c(iD, iD3);
            iM = u45.c(4, vw4.d().getDisplayMetrics().density, wdeVar.a() + iD3);
        } else {
            iM = iD;
        }
        ode odeVar = this.d;
        if (dqi.r(odeVar.c) && dqi.r(wdeVar.b)) {
            odeVar.W((getMeasuredWidth() - iD) - odeVar.N(), ((wdeVar.a() / 2) - (odeVar.M() / 2)) + iD3);
        }
        uk9 uk9Var = this.b;
        if (dqi.r(uk9Var.c)) {
            uk9Var.W(iD, iM);
            iM += uk9Var.M();
        }
        rm9 rm9Var = this.B0;
        cri.c(rm9Var, iD, iM, 0, 12);
        int iJ = utb.j(6, vw4.d().getDisplayMetrics().density, rm9Var.getMeasuredHeight(), iM);
        int i5 = iD + iD2;
        ?? r3 = this.F0;
        if (dqi.r(r3)) {
            zd7 zd7Var = (zd7) r3.getValue();
            boolean z2 = this.w0;
            cri.c(zd7Var, z2 ? iD : ((getMeasuredWidth() - iD) - iD2) - zd7Var.getMeasuredWidth(), z2 ? iJ : iJ + iD2, 0, 12);
            float f3 = this.w0 ? vw4.d().getDisplayMetrics().density * 12.0f : vw4.d().getDisplayMetrics().density * 4.0f;
            float f4 = this.w0 ? 0.0f : 4.0f * vw4.d().getDisplayMetrics().density;
            gr6 gr6Var = (gr6) zd7Var.getHierarchy();
            vtd vtdVar = new vtd();
            vtdVar.b(f3, f3, f4, f4);
            gr6Var.m(vtdVar);
            if (this.w0) {
                iJ += zd7Var.getMeasuredHeight() + iD2;
            }
        }
        if (dqi.r(r3)) {
            zd7 zd7Var2 = (zd7) r3.getValue();
            ?? r6 = this.G0;
            if (dqi.r(r6)) {
                cri.c((ImageView) r6.getValue(), ((zd7Var2.getWidth() / 2) + zd7Var2.getLeft()) - (dqi.m(r6) / 2), ((zd7Var2.getHeight() / 2) + zd7Var2.getTop()) - (dqi.l(r6) / 2), 0, 12);
            }
        }
        if (!dqi.r(r3) || !this.w0) {
            iJ += iD2;
        }
        ?? r14 = this.C0;
        if (dqi.r(r14)) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) r14.getValue();
            cri.c(appCompatTextView, i5, iJ, 0, 12);
            iJ += appCompatTextView.getMeasuredHeight();
        }
        ?? r142 = this.D0;
        if (dqi.r(r142)) {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) r142.getValue();
            int iC = u45.c(2, vw4.d().getDisplayMetrics().density, iJ);
            cri.c(appCompatTextView2, i5, iC, 0, 12);
            iJ = iC + appCompatTextView2.getMeasuredHeight();
        }
        ?? r143 = this.E0;
        if (dqi.r(r143)) {
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) r143.getValue();
            cri.c(appCompatTextView3, i5, u45.c(2, vw4.d().getDisplayMetrics().density, iJ), 0, 12);
            appCompatTextView3.getMeasuredHeight();
        }
        u9d u9dVar = this.a;
        boolean zR = dqi.r(u9dVar.c);
        if4 if4Var = this.H0;
        if (zR) {
            u9dVar.W(iD, (getMeasuredHeight() - u9dVar.M()) - ((iD * 2) + (if4Var.getMeasuredWidth() + u9dVar.N()) > getMeasuredWidth() ? (kti.d(4 * vw4.d().getDisplayMetrics().density) * 2) + if4Var.getMeasuredHeight() : kti.d(f * vw4.d().getDisplayMetrics().density)));
        }
        cri.c(if4Var, (getMeasuredWidth() - if4Var.getMeasuredWidth()) - iD, u45.q(4, vw4.d().getDisplayMetrics().density, getMeasuredHeight() - if4Var.getMeasuredHeight()), 0, 12);
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r13v27, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iM;
        rm9 rm9Var;
        int i3;
        int i4;
        int iC;
        int iL;
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : u45.d(10, vw4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        float f = 10;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        rm9 rm9Var2 = this.B0;
        rm9Var2.i();
        int i5 = iD * 2;
        int iMax = Math.max(rm9Var2.getMeasuredWidth() + i5, size);
        int i6 = iMax - i5;
        float f2 = 8;
        int iD2 = kti.d(vw4.d().getDisplayMetrics().density * f2);
        ode odeVar = this.d;
        boolean zR = dqi.r(odeVar.c);
        wde wdeVar = this.z0;
        if (zR && dqi.r(wdeVar.b)) {
            odeVar.Y(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, odeVar.N());
        }
        if (dqi.r(wdeVar.b)) {
            wdeVar.d(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, wdeVar.b() + i5 + odeVar.j0());
            iM = u45.c(4, vw4.d().getDisplayMetrics().density, wdeVar.a() + kti.d(f2 * vw4.d().getDisplayMetrics().density));
        } else {
            iM = iD;
        }
        uk9 uk9Var = this.b;
        if (dqi.r(uk9Var.c)) {
            uk9Var.Y(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, (kti.d(vw4.d().getDisplayMetrics().density * f) * 2) + uk9Var.N());
            iM += uk9Var.M();
        }
        int iJ = utb.j(6, vw4.d().getDisplayMetrics().density, rm9Var2.getMeasuredHeight(), iM);
        int i7 = iD2 * 2;
        int i8 = i6 - i7;
        ?? r14 = this.F0;
        boolean z = false;
        boolean z2 = true;
        if (dqi.r(r14)) {
            zd7 zd7Var = (zd7) r14.getValue();
            boolean z3 = zd7Var.getImageAttach().c * 2 >= i6;
            this.w0 = z3;
            if (z3) {
                zd7Var.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(kti.d(128 * vw4.d().getDisplayMetrics().density), 1073741824));
                rm9Var = rm9Var2;
                i3 = i5;
            } else {
                int iD3 = kti.d(32 * vw4.d().getDisplayMetrics().density);
                rm9Var = rm9Var2;
                i3 = i5;
                zd7Var.measure(View.MeasureSpec.makeMeasureSpec(iD3, 1073741824), View.MeasureSpec.makeMeasureSpec(iD3, 1073741824));
                i8 -= iD3 + iD2;
            }
            z = true;
        } else {
            rm9Var = rm9Var2;
            i3 = i5;
        }
        ?? r4 = this.C0;
        if (dqi.r(r4)) {
            i4 = Integer.MIN_VALUE;
            ((AppCompatTextView) r4.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), i2);
            z = true;
        } else {
            i4 = Integer.MIN_VALUE;
        }
        ?? r6 = this.D0;
        if (dqi.r(r6)) {
            ((AppCompatTextView) r6.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i8, i4), i2);
            z = true;
        }
        ?? r8 = this.E0;
        if (dqi.r(r8)) {
            ((AppCompatTextView) r8.getValue()).measure(View.MeasureSpec.makeMeasureSpec(i8, i4), i2);
            z = true;
        }
        ?? r9 = this.G0;
        if (dqi.r(r9)) {
            float f3 = 52;
            ((ImageView) r9.getValue()).measure(View.MeasureSpec.makeMeasureSpec(kti.d(vw4.d().getDisplayMetrics().density * f3), 1073741824), View.MeasureSpec.makeMeasureSpec(kti.d(f3 * vw4.d().getDisplayMetrics().density), 1073741824));
        } else {
            z2 = z;
        }
        if (z2) {
            int iL2 = dqi.l(r8) + dqi.l(r6) + dqi.l(r4) + i7;
            if (this.w0) {
                iL = dqi.l(r14) + iL2;
            } else {
                int iL3 = dqi.l(r14) + i7;
                if (iL2 < iL3) {
                    iL2 = iL3;
                }
                iL = iL2;
            }
            int i9 = iL + iJ;
            this.v0.set(iD, iJ, iMax - iD, i9);
            iJ = i9;
        }
        u9d u9dVar = this.a;
        if (dqi.r(u9dVar.c)) {
            u9dVar.Y(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            iJ = utb.j(f, vw4.d().getDisplayMetrics().density, u9dVar.M(), iJ);
            iMax = Math.max(iMax, (kti.d(vw4.d().getDisplayMetrics().density * f) * 2) + u9dVar.N());
        }
        if4 if4Var = this.H0;
        if4Var.measure(i, i2);
        int measuredWidth = if4Var.getMeasuredWidth() + (dqi.r(u9dVar.c) ? u9dVar.N() : z2 ? iMax - i3 : rm9Var.getMeasuredWidth()) + i3;
        if (measuredWidth > size) {
            float f4 = 4;
            iC = utb.j(f4, vw4.d().getDisplayMetrics().density, if4Var.getMeasuredHeight() + kti.d(vw4.d().getDisplayMetrics().density * f4), iJ);
        } else {
            iMax = Math.max(iMax, measuredWidth);
            iC = u45.c(f, vw4.d().getDisplayMetrics().density, iJ);
        }
        setMeasuredDimension(iMax, iC);
    }

    @Override // defpackage.wad
    public final void r(boolean z) {
        this.a.r(z);
    }

    @Override // defpackage.qde
    public void setAlias(Layout layout) {
        this.d.setAlias(layout);
    }

    @Override // defpackage.qde
    public void setAliasColor(int i) {
        this.d.setAliasColor(i);
    }

    @Override // defpackage.wad
    public void setChipObserver(y8d y8dVar) {
        this.a.setChipObserver(y8dVar);
    }

    @Override // defpackage.jf4
    public void setCountView(CharSequence charSequence) {
        this.H0.setCountView$message_list_release(charSequence);
    }

    @Override // defpackage.jf4
    public void setDateViewStatus(ghh ghhVar) {
        this.H0.setStatus$message_list_release(ghhVar);
    }

    @Override // defpackage.nkb
    public void setDependOnOutsideView(boolean z) {
        this.c.a = z;
    }

    @Override // defpackage.zk9
    public void setForwardClickListener(sm6 sm6Var) {
        this.b.o = sm6Var;
    }

    @Override // defpackage.jf4
    public void setIsChannelMode(boolean z) {
        this.H0.setChannelMode$message_list_release(z);
    }

    @Override // defpackage.wad
    public void setIsIncoming(boolean z) {
        this.a.d = z;
    }

    @Override // defpackage.zk9
    public void setLink(tk9 tk9Var) {
        this.b.setLink(tk9Var);
    }

    @Override // defpackage.wad
    public void setOnClickListener(em6 em6Var) {
        this.a.o = em6Var;
    }

    @Override // defpackage.z78
    public void setOnLinkLongClickListener(ab3 ab3Var) {
        this.A0 = ab3Var;
    }

    @Override // defpackage.zk9
    public void setReplyClickListener(sm6 sm6Var) {
        this.b.d = sm6Var;
    }

    @Override // defpackage.vde
    public void setSenderName(Layout layout) {
        this.z0.e(layout);
    }

    @Override // defpackage.vde
    public void setSenderNameColor(int i) {
        this.z0.f(i);
    }

    @Override // defpackage.wad
    public void setStackFromEnd(boolean z) {
        this.a.Y = z;
    }

    @Override // defpackage.y4g
    public void setTextMessageColors(yt0 yt0Var) {
        this.B0.setTextColors(yt0Var);
    }

    @Override // defpackage.y4g
    public void setTextMessageLayout(pm9 pm9Var) {
        this.B0.setLayout(pm9Var);
    }

    @Override // defpackage.y4g
    public void setTextMessageLinkClickListener(e88 e88Var) {
        this.B0.setLinkListener(e88Var);
    }
}
