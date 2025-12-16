package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final class uxa extends View implements u6g {
    public static final /* synthetic */ int K0 = 0;
    public final Object A0;
    public final d9a B0;
    public cm6 C0;
    public cm6 D0;
    public boolean E0;
    public lc0 F0;
    public be0 G0;
    public final rpd H0;
    public final md0 I0;
    public List J0;
    public final String a;
    public final m45 b;
    public nxa c;
    public int d;
    public boolean o;
    public boolean s0;
    public boolean t0;
    public final Object u0;
    public final Object v0;
    public final Object w0;
    public boolean x0;
    public final Object y0;
    public final Object z0;

    public uxa(final Context context) {
        super(context, null);
        this.a = uxa.class.getName();
        m45 m45Var = new m45(new hr6(getResources()).a());
        qsd qsdVarD = m45Var.d();
        if (qsdVarD != null) {
            qsdVarD.setCallback(this);
        }
        l45 l45Var = m45Var.d;
        l45Var.getClass();
        up5 up5Var = ((gr6) l45Var).e;
        up5Var.v0 = 50;
        if (up5Var.u0 == 1) {
            up5Var.u0 = 0;
        }
        this.b = m45Var;
        kxa kxaVar = kxa.a;
        this.c = kxaVar;
        this.d = 1;
        final int i = 0;
        this.u0 = ipi.b(3, new cm6() { // from class: ixa
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        int i2 = cxc.ic_add_photo_28;
                        Context context2 = context;
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context2, i2);
                        v1a v1aVar = a93.s0;
                        z18.e(enhancedVectorDrawable, "background", v1aVar.x(context2).k().b().a.g);
                        z18.e(enhancedVectorDrawable, "photo", v1aVar.x(context2).k().getIcon().b);
                        enhancedVectorDrawable.setCallback(this);
                        return enhancedVectorDrawable;
                    case 1:
                        int i3 = uwc.ic_online_24;
                        Context context3 = context;
                        EnhancedVectorDrawable enhancedVectorDrawable2 = new EnhancedVectorDrawable(context3, i3);
                        v1a v1aVar2 = a93.s0;
                        z18.e(enhancedVectorDrawable2, "online", ctd.f(v1aVar2, context3).e);
                        z18.f(enhancedVectorDrawable2, "online", v1aVar2.x(context3).k().b().l);
                        enhancedVectorDrawable2.setCallback(this);
                        return enhancedVectorDrawable2;
                    default:
                        int i4 = uwc.ic_delete_filled_apart_24;
                        Context context4 = context;
                        EnhancedVectorDrawable enhancedVectorDrawable3 = new EnhancedVectorDrawable(context4, i4);
                        v1a v1aVar3 = a93.s0;
                        v1aVar3.x(context4).k().getIcon();
                        z18.e(enhancedVectorDrawable3, "cross", -1);
                        z18.e(enhancedVectorDrawable3, "circle_background", ctd.f(v1aVar3, context4).j);
                        enhancedVectorDrawable3.setCallback(this);
                        return enhancedVectorDrawable3;
                }
            }
        });
        final int i2 = 1;
        this.v0 = ipi.b(3, new cm6() { // from class: ixa
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        int i22 = cxc.ic_add_photo_28;
                        Context context2 = context;
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context2, i22);
                        v1a v1aVar = a93.s0;
                        z18.e(enhancedVectorDrawable, "background", v1aVar.x(context2).k().b().a.g);
                        z18.e(enhancedVectorDrawable, "photo", v1aVar.x(context2).k().getIcon().b);
                        enhancedVectorDrawable.setCallback(this);
                        return enhancedVectorDrawable;
                    case 1:
                        int i3 = uwc.ic_online_24;
                        Context context3 = context;
                        EnhancedVectorDrawable enhancedVectorDrawable2 = new EnhancedVectorDrawable(context3, i3);
                        v1a v1aVar2 = a93.s0;
                        z18.e(enhancedVectorDrawable2, "online", ctd.f(v1aVar2, context3).e);
                        z18.f(enhancedVectorDrawable2, "online", v1aVar2.x(context3).k().b().l);
                        enhancedVectorDrawable2.setCallback(this);
                        return enhancedVectorDrawable2;
                    default:
                        int i4 = uwc.ic_delete_filled_apart_24;
                        Context context4 = context;
                        EnhancedVectorDrawable enhancedVectorDrawable3 = new EnhancedVectorDrawable(context4, i4);
                        v1a v1aVar3 = a93.s0;
                        v1aVar3.x(context4).k().getIcon();
                        z18.e(enhancedVectorDrawable3, "cross", -1);
                        z18.e(enhancedVectorDrawable3, "circle_background", ctd.f(v1aVar3, context4).j);
                        enhancedVectorDrawable3.setCallback(this);
                        return enhancedVectorDrawable3;
                }
            }
        });
        final int i3 = 2;
        this.w0 = ipi.b(3, new cm6() { // from class: ixa
            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        int i22 = cxc.ic_add_photo_28;
                        Context context2 = context;
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context2, i22);
                        v1a v1aVar = a93.s0;
                        z18.e(enhancedVectorDrawable, "background", v1aVar.x(context2).k().b().a.g);
                        z18.e(enhancedVectorDrawable, "photo", v1aVar.x(context2).k().getIcon().b);
                        enhancedVectorDrawable.setCallback(this);
                        return enhancedVectorDrawable;
                    case 1:
                        int i32 = uwc.ic_online_24;
                        Context context3 = context;
                        EnhancedVectorDrawable enhancedVectorDrawable2 = new EnhancedVectorDrawable(context3, i32);
                        v1a v1aVar2 = a93.s0;
                        z18.e(enhancedVectorDrawable2, "online", ctd.f(v1aVar2, context3).e);
                        z18.f(enhancedVectorDrawable2, "online", v1aVar2.x(context3).k().b().l);
                        enhancedVectorDrawable2.setCallback(this);
                        return enhancedVectorDrawable2;
                    default:
                        int i4 = uwc.ic_delete_filled_apart_24;
                        Context context4 = context;
                        EnhancedVectorDrawable enhancedVectorDrawable3 = new EnhancedVectorDrawable(context4, i4);
                        v1a v1aVar3 = a93.s0;
                        v1aVar3.x(context4).k().getIcon();
                        z18.e(enhancedVectorDrawable3, "cross", -1);
                        z18.e(enhancedVectorDrawable3, "circle_background", ctd.f(v1aVar3, context4).j);
                        enhancedVectorDrawable3.setCallback(this);
                        return enhancedVectorDrawable3;
                }
            }
        });
        final int i4 = 0;
        this.y0 = ipi.b(3, new cm6(this) { // from class: jxa
            public final /* synthetic */ uxa b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        int iD = kti.d(2 * vw4.d().getDisplayMetrics().density);
                        v1a v1aVar = a93.s0;
                        uxa uxaVar = this.b;
                        gradientDrawable.setStroke(iD, v1aVar.y(uxaVar).b().l);
                        gradientDrawable.setColor(v1aVar.y(uxaVar).getIcon().k);
                        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 32.0f);
                        return gradientDrawable;
                    case 1:
                        int i5 = uwc.call_fill_16;
                        v1a v1aVar2 = a93.s0;
                        uxa uxaVar2 = this.b;
                        v1aVar2.y(uxaVar2).getIcon();
                        Drawable drawableMutate = r34.b(uxaVar2.getContext(), i5).mutate();
                        cei.k(drawableMutate, -1);
                        return drawableMutate;
                    default:
                        return uxa.a(this.b);
                }
            }
        });
        final int i5 = 1;
        this.z0 = ipi.b(3, new cm6(this) { // from class: jxa
            public final /* synthetic */ uxa b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        int iD = kti.d(2 * vw4.d().getDisplayMetrics().density);
                        v1a v1aVar = a93.s0;
                        uxa uxaVar = this.b;
                        gradientDrawable.setStroke(iD, v1aVar.y(uxaVar).b().l);
                        gradientDrawable.setColor(v1aVar.y(uxaVar).getIcon().k);
                        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 32.0f);
                        return gradientDrawable;
                    case 1:
                        int i52 = uwc.call_fill_16;
                        v1a v1aVar2 = a93.s0;
                        uxa uxaVar2 = this.b;
                        v1aVar2.y(uxaVar2).getIcon();
                        Drawable drawableMutate = r34.b(uxaVar2.getContext(), i52).mutate();
                        cei.k(drawableMutate, -1);
                        return drawableMutate;
                    default:
                        return uxa.a(this.b);
                }
            }
        });
        final int i6 = 2;
        this.A0 = ipi.b(3, new cm6(this) { // from class: jxa
            public final /* synthetic */ uxa b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        int iD = kti.d(2 * vw4.d().getDisplayMetrics().density);
                        v1a v1aVar = a93.s0;
                        uxa uxaVar = this.b;
                        gradientDrawable.setStroke(iD, v1aVar.y(uxaVar).b().l);
                        gradientDrawable.setColor(v1aVar.y(uxaVar).getIcon().k);
                        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 32.0f);
                        return gradientDrawable;
                    case 1:
                        int i52 = uwc.call_fill_16;
                        v1a v1aVar2 = a93.s0;
                        uxa uxaVar2 = this.b;
                        v1aVar2.y(uxaVar2).getIcon();
                        Drawable drawableMutate = r34.b(uxaVar2.getContext(), i52).mutate();
                        cei.k(drawableMutate, -1);
                        return drawableMutate;
                    default:
                        return uxa.a(this.b);
                }
            }
        });
        this.B0 = new d9a(4);
        this.H0 = new rpd();
        this.I0 = new md0(2, this);
        m45Var.i(j());
        l45 l45Var2 = m45Var.d;
        l45Var2.getClass();
        ((gr6) l45Var2).m(fni.a(this.c, kxaVar) ? vtd.a() : null);
    }

    public static LayerDrawable a(uxa uxaVar) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{uxaVar.getCallBadgeBackgroundDrawable(), uxaVar.getCallIconDrawable()});
        int iD = kti.d(28 * vw4.d().getDisplayMetrics().density);
        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
        int i = (iD - iD2) / 2;
        layerDrawable.setLayerSize(0, iD, iD);
        layerDrawable.setLayerSize(1, iD2, iD2);
        layerDrawable.setLayerInset(1, i, i, i, i);
        layerDrawable.setCallback(uxaVar);
        return layerDrawable;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final EnhancedVectorDrawable getAddBadgeDrawable() {
        return (EnhancedVectorDrawable) this.u0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final GradientDrawable getCallBadgeBackgroundDrawable() {
        return (GradientDrawable) this.y0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final LayerDrawable getCallBadgeDrawable() {
        return (LayerDrawable) this.A0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Drawable getCallIconDrawable() {
        return (Drawable) this.z0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final EnhancedVectorDrawable getCloseBadgeDrawable() {
        return (EnhancedVectorDrawable) this.w0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final EnhancedVectorDrawable getOnlineBadgeDrawable() {
        return (EnhancedVectorDrawable) this.v0.getValue();
    }

    private final int getViewSize() {
        return Math.min(getMeasuredWidth(), getMeasuredHeight());
    }

    public static void m(uxa uxaVar, String str, mc0 mc0Var) {
        uxaVar.setAvatarUrl(str);
        uxaVar.l(mc0Var, true);
    }

    public static void n(uxa uxaVar, String str, Long l, CharSequence charSequence) {
        mc0 mc0VarA = fui.a(charSequence, l);
        uxaVar.setAvatarUrl(str);
        uxaVar.l(mc0VarA, true);
    }

    public static void o(uxa uxaVar, Drawable drawable, em6 em6Var, em6 em6Var2, int i) {
        nxa nxaVar = (i & 2) != 0 ? uxaVar.c : mxa.a;
        yeb yebVarY = a93.s0.y(uxaVar);
        if ((i & 8) != 0) {
            em6Var = new o8(2, yebVarY);
        }
        em6 em6Var3 = em6Var;
        if ((i & 16) != 0) {
            em6Var2 = new o8(3, yebVarY);
        }
        em6 em6Var4 = em6Var2;
        uxaVar.setAvatarShape(nxaVar);
        uxaVar.setCustomPlaceholder(drawable != null ? new be0(drawable, nxaVar, yebVarY, em6Var3, em6Var4) : null);
        uxaVar.invalidate();
    }

    public final void f() {
        int viewSize = getViewSize();
        if (viewSize == 0) {
            return;
        }
        float f = 28;
        getAddBadgeDrawable().setBounds(u45.q(f, vw4.d().getDisplayMetrics().density, viewSize), u45.q(f, vw4.d().getDisplayMetrics().density, viewSize), viewSize, viewSize);
        this.B0.a(getAddBadgeDrawable());
    }

    public final void g() {
        int viewSize = getViewSize();
        if (viewSize == 0) {
            return;
        }
        float f = 24;
        getCallBadgeDrawable().setBounds(u45.q(f, vw4.d().getDisplayMetrics().density, viewSize), u45.q(f, vw4.d().getDisplayMetrics().density, viewSize), viewSize, viewSize);
        this.B0.a(getCallBadgeDrawable());
    }

    public final void h() {
        int viewSize = getViewSize();
        if (viewSize == 0) {
            return;
        }
        int iD = viewSize >= kti.d(((float) 72) * vw4.d().getDisplayMetrics().density) ? kti.d(24 * vw4.d().getDisplayMetrics().density) : viewSize >= kti.d(((float) 54) * vw4.d().getDisplayMetrics().density) ? kti.d(20 * vw4.d().getDisplayMetrics().density) : viewSize >= kti.d(((float) 40) * vw4.d().getDisplayMetrics().density) ? kti.d(16 * vw4.d().getDisplayMetrics().density) : kti.d(12 * vw4.d().getDisplayMetrics().density);
        getCloseBadgeDrawable().setBounds(viewSize - iD, 0, viewSize, iD);
        this.B0.a(getCloseBadgeDrawable());
    }

    public final void i() {
        int viewSize = getViewSize();
        if (viewSize == 0) {
            return;
        }
        int iD = viewSize - (viewSize >= kti.d(((float) 72) * vw4.d().getDisplayMetrics().density) ? kti.d(24 * vw4.d().getDisplayMetrics().density) : viewSize >= kti.d(((float) 54) * vw4.d().getDisplayMetrics().density) ? kti.d(20 * vw4.d().getDisplayMetrics().density) : viewSize >= kti.d(((float) 40) * vw4.d().getDisplayMetrics().density) ? kti.d(16 * vw4.d().getDisplayMetrics().density) : kti.d(12 * vw4.d().getDisplayMetrics().density));
        float f = 3;
        getOnlineBadgeDrawable().setBounds(u45.c(f, vw4.d().getDisplayMetrics().density, iD), u45.c(f, vw4.d().getDisplayMetrics().density, iD), u45.c(f, vw4.d().getDisplayMetrics().density, viewSize), u45.c(f, vw4.d().getDisplayMetrics().density, viewSize));
        this.B0.a(getOnlineBadgeDrawable());
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.invalidateDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new pxa(this, drawable, 0));
        } else {
            post(new qxa(this, drawable, 0));
        }
    }

    public final b2c j() {
        c2c c2cVarA = zk6.a.a();
        c2cVarA.d = this.H0;
        c2cVarA.e = this.I0;
        c2cVarA.i = this.b.e;
        c2cVarA.h = true;
        return c2cVarA.a();
    }

    public final void k(Drawable drawable, cm6 cm6Var) {
        if (this.B0.c(drawable)) {
            drawable.invalidateSelf();
            return;
        }
        if (getMeasuredWidth() == 0 || getMeasuredHeight() == 0) {
            requestLayout();
            drawable.invalidateSelf();
        } else {
            cm6Var.invoke();
            drawable.invalidateSelf();
        }
    }

    public final void l(mc0 mc0Var, boolean z) {
        m45 m45Var = this.b;
        if (mc0Var == null || mc0Var == mc0.c || (mc0Var.a == 0 && mc0Var.b.length() == 0)) {
            if (this.d == 3) {
                l45 l45Var = m45Var.d;
                l45Var.getClass();
                ((gr6) l45Var).i(null, 1);
                this.F0 = null;
                this.d = 1;
                return;
            }
            return;
        }
        lc0 lc0Var = new lc0(getContext(), this.c, mc0Var, a93.s0.x(getContext()).k());
        lc0Var.w0.O(lc0Var, lc0.y0[0], Boolean.valueOf(z));
        this.F0 = lc0Var;
        l45 l45Var2 = m45Var.d;
        l45Var2.getClass();
        ((gr6) l45Var2).i(lc0Var, 1);
        l45 l45Var3 = m45Var.d;
        l45Var3.getClass();
        ((gr6) l45Var3).i(lc0Var, 5);
        this.d = 3;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.f();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.g();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        qsd qsdVarD = this.b.d();
        if (qsdVarD != null) {
            qsdVarD.draw(canvas);
        }
        if (this.o) {
            getCloseBadgeDrawable().draw(canvas);
        }
        if (this.s0) {
            getOnlineBadgeDrawable().draw(canvas);
        }
        if (this.t0) {
            getAddBadgeDrawable().draw(canvas);
        }
        if (this.x0) {
            float f = 24;
            getCallBadgeDrawable().setBounds(u45.q(f, vw4.d().getDisplayMetrics().density, getViewSize()), u45.q(f, vw4.d().getDisplayMetrics().density, getViewSize()), getViewSize(), getViewSize());
            getCallBadgeDrawable().draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.b.f();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int viewSize = getViewSize();
        qsd qsdVarD = this.b.d();
        if (qsdVarD != null) {
            qsdVarD.setBounds(0, 0, viewSize, viewSize);
        }
        if (this.o) {
            h();
        }
        if (this.s0) {
            i();
        }
        if (this.t0) {
            f();
        }
        if (this.x0) {
            g();
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.b.g();
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        lc0 lc0Var;
        EnhancedVectorDrawable addBadgeDrawable = getAddBadgeDrawable();
        z18.e(addBadgeDrawable, "background", yebVar.b().a.g);
        z18.e(addBadgeDrawable, "photo", yebVar.getIcon().b);
        EnhancedVectorDrawable onlineBadgeDrawable = getOnlineBadgeDrawable();
        z18.e(onlineBadgeDrawable, "online", yebVar.getIcon().e);
        z18.f(onlineBadgeDrawable, "online", yebVar.b().l);
        EnhancedVectorDrawable closeBadgeDrawable = getCloseBadgeDrawable();
        z18.e(closeBadgeDrawable, "cross", -1);
        z18.e(closeBadgeDrawable, "circle_background", yebVar.getIcon().j);
        getCallIconDrawable().setTint(-1);
        GradientDrawable callBadgeBackgroundDrawable = getCallBadgeBackgroundDrawable();
        int iD = kti.d(2 * vw4.d().getDisplayMetrics().density);
        v1a v1aVar = a93.s0;
        callBadgeBackgroundDrawable.setStroke(iD, v1aVar.y(this).b().l);
        callBadgeBackgroundDrawable.setColor(v1aVar.y(this).getIcon().k);
        int iV = az1.v(this.d);
        if (iV == 1) {
            be0 be0Var = this.G0;
            if (be0Var != null) {
                be0Var.onThemeChanged(yebVar);
            }
        } else if (iV == 2 && (lc0Var = this.F0) != null) {
            lc0Var.onThemeChanged(yebVar);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cm6 cm6Var;
        if (!this.o || this.D0 == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            boolean zContains = getCloseBadgeDrawable().getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
            this.E0 = zContains;
            if (zContains) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        if (action == 1 && this.E0 && getCloseBadgeDrawable().getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (cm6Var = this.D0) != null) {
            cm6Var.invoke();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.scheduleDrawable(drawable, runnable, j);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new rxa(this, drawable, runnable, j, 0));
        } else {
            post(new rxa(this, drawable, runnable, j, 1));
        }
    }

    public final void setAddBadgeVisibility(boolean z) {
        boolean z2 = true;
        boolean z3 = this.t0 != z;
        this.t0 = z;
        if (z) {
            this.s0 = false;
        } else {
            z2 = z3;
        }
        if (z2) {
            k(getAddBadgeDrawable(), new o91(0, this, uxa.class, "applyAddBadgeDrawable", "applyAddBadgeDrawable()V", 0, 28));
        }
    }

    public final void setAvatarShape(nxa nxaVar) {
        if (fni.a(this.c, nxaVar)) {
            return;
        }
        this.c = nxaVar;
        l45 l45Var = this.b.d;
        l45Var.getClass();
        ((gr6) l45Var).m(fni.a(this.c, kxa.a) ? vtd.a() : null);
        invalidate();
    }

    public final void setAvatarUrl(String str) {
        rf7 rf7VarB;
        List list = this.J0;
        if (list != null && list.size() == 1) {
            List list2 = this.J0;
            if (fni.a(list2 != null ? (String) ue3.G(list2) : null, str)) {
                return;
            }
        }
        if (str == null || str.length() == 0) {
            this.J0 = null;
            rf7VarB = null;
        } else {
            this.J0 = Collections.singletonList(str);
            nc0 nc0Var = hxa.a;
            rf7VarB = hxa.b(str, this.c);
        }
        m45 m45Var = this.b;
        if (rf7VarB == null) {
            m45Var.i(null);
            return;
        }
        df7 df7VarE = zk6.e();
        df7VarE.getClass();
        this.H0.a(new cf7(df7VarE, rf7VarB, str));
        if (m45Var.e == null) {
            m45Var.i(j());
        }
    }

    public final void setAvatarUrls(List<String> list) {
        if (list == null || list.isEmpty() || !fni.a(this.J0, list)) {
            m45 m45Var = this.b;
            if (list == null || list.isEmpty()) {
                m45Var.i(null);
                this.J0 = null;
                return;
            }
            ArrayList arrayList = new ArrayList(we3.q(list, 10));
            for (String str : list) {
                nc0 nc0Var = hxa.a;
                rf7 rf7VarB = hxa.b(str, this.c);
                df7 df7VarE = zk6.e();
                df7VarE.getClass();
                arrayList.add(new cf7(df7VarE, rf7VarB, str));
            }
            nj7 nj7Var = new nj7(arrayList, true);
            this.J0 = list;
            this.H0.a(nj7Var);
            if (m45Var.e == null) {
                m45Var.i(j());
            }
        }
    }

    public final void setCallBadgeVisibility(boolean z) {
        boolean z2 = true;
        boolean z3 = this.x0 != z;
        this.x0 = z;
        if (z) {
            this.s0 = false;
            this.t0 = false;
        } else {
            z2 = z3;
        }
        if (z2) {
            k(getCallBadgeDrawable(), new o91(0, this, uxa.class, "applyCallBadgeVisible", "applyCallBadgeVisible()V", 0, 29));
        }
    }

    public final void setCloseBadgeClickListener(cm6 cm6Var) {
        this.D0 = cm6Var;
    }

    public final void setCloseBadgeVisibility(boolean z) {
        boolean z2 = this.o;
        this.o = z;
        if (z2 != z) {
            k(getCloseBadgeDrawable(), new sxa(0, this, uxa.class, "applyCloseBadgeDrawableBounds", "applyCloseBadgeDrawableBounds()V", 0, 0));
        }
    }

    public final void setCustomOverlay(yd0 yd0Var) {
        m45 m45Var = this.b;
        if (yd0Var == null) {
            l45 l45Var = m45Var.d;
            l45Var.getClass();
            ((gr6) l45Var).k(null);
        } else {
            l45 l45Var2 = m45Var.d;
            l45Var2.getClass();
            ((gr6) l45Var2).k(yd0Var);
        }
    }

    public final void setCustomPlaceholder(be0 be0Var) {
        m45 m45Var = this.b;
        if (be0Var != null) {
            this.G0 = be0Var;
            l45 l45Var = m45Var.d;
            l45Var.getClass();
            ((gr6) l45Var).i(be0Var, 1);
            this.d = 2;
            return;
        }
        if (this.d == 2) {
            l45 l45Var2 = m45Var.d;
            l45Var2.getClass();
            ((gr6) l45Var2).i(null, 1);
            this.G0 = null;
            this.d = 1;
        }
    }

    public final void setOnImageLoadedListener(cm6 cm6Var) {
        this.C0 = cm6Var;
    }

    public final void setOnlineBadgeVisibility(boolean z) {
        boolean z2 = true;
        boolean z3 = this.s0 != z;
        this.s0 = z;
        if (z) {
            this.t0 = false;
        } else {
            z2 = z3;
        }
        if (z2) {
            k(getOnlineBadgeDrawable(), new sxa(0, this, uxa.class, "applyOnlineBadgeDrawable", "applyOnlineBadgeDrawable()V", 0, 1));
        }
    }

    public final void setOverlay(Drawable drawable) {
        yd0 yd0Var;
        if (drawable != null) {
            nxa nxaVar = this.c;
            Context context = getContext();
            yd0Var = new yd0(drawable, nxaVar, context, new xd0(context, 0), new xd0(context, 1));
        } else {
            yd0Var = null;
        }
        setCustomOverlay(yd0Var);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable, runnable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new txa(this, drawable, runnable, 0));
        } else {
            post(new txa(this, drawable, runnable, 1));
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        boolean z = this.b.d() == drawable;
        if (!z) {
            if (this.o) {
                z = z || getCloseBadgeDrawable() == drawable;
            }
            if (this.s0) {
                z = z || getOnlineBadgeDrawable() == drawable;
            }
            if (this.t0) {
                z = z || getAddBadgeDrawable() == drawable;
            }
            if (this.x0) {
                z = z || getCallBadgeDrawable() == drawable;
            }
            if (!z && !super.verifyDrawable(drawable)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            super.unscheduleDrawable(drawable);
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new pxa(this, drawable, 1));
        } else {
            post(new qxa(this, drawable, 1));
        }
    }
}
