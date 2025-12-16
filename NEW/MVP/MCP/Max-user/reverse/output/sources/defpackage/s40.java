package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.work.WorkRequest;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class s40 extends ViewGroup implements vde, jf4, wad, zk9, qde, nkb {
    public static final int S0 = kti.d(44 * vw4.d().getDisplayMetrics().density);
    public static final int T0 = kti.d(36 * vw4.d().getDisplayMetrics().density);
    public static final int U0 = kti.d(24 * vw4.d().getDisplayMetrics().density);
    public final Object A0;
    public final if4 B0;
    public final int C0;
    public final b70 D0;
    public final AppCompatTextView E0;
    public boolean F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final int M0;
    public Long N0;
    public Long O0;
    public String P0;
    public x9f Q0;
    public r40 R0;
    public final em6 a;
    public final cm6 b;
    public final u9d c;
    public final uk9 d;
    public final ode o;
    public final okb s0;
    public final wde t0;
    public final int u0;
    public final AppCompatImageView v0;
    public final Object w0;
    public final Object x0;
    public final Object y0;
    public final Object z0;

    public s40(Context context, ts9 ts9Var, yu9 yu9Var) {
        u9d u9dVar = new u9d();
        uk9 uk9Var = new uk9();
        ode odeVar = new ode();
        okb okbVar = new okb();
        super(context);
        this.a = ts9Var;
        this.b = yu9Var;
        this.c = u9dVar;
        this.d = uk9Var;
        this.o = odeVar;
        this.s0 = okbVar;
        this.t0 = new wde(this);
        int i = S0;
        this.u0 = i;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.v0 = appCompatImageView;
        this.w0 = ipi.b(3, new o40(context, 0));
        this.x0 = ipi.b(3, new l(11));
        this.y0 = ipi.b(3, new i6(11, this));
        this.z0 = ipi.b(3, new o40(context, 1));
        this.A0 = ipi.b(3, new o40(context, 2));
        if4 if4Var = new if4(context);
        if4Var.setBackgroundEnabled$message_list_release(false);
        this.B0 = if4Var;
        int iD = kti.d(24 * vw4.d().getDisplayMetrics().density);
        this.C0 = iD;
        b70 b70Var = new b70(context);
        this.D0 = b70Var;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        t5g t5gVar = dpg.a;
        vz2.e.b(appCompatTextView, t75.b);
        this.E0 = appCompatTextView;
        this.G0 = kti.d(10 * vw4.d().getDisplayMetrics().density);
        float f = 4;
        this.H0 = kti.d(vw4.d().getDisplayMetrics().density * f);
        float f2 = 8;
        this.I0 = kti.d(vw4.d().getDisplayMetrics().density * f2);
        this.J0 = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        this.K0 = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.L0 = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.M0 = kti.d(f * vw4.d().getDisplayMetrics().density);
        this.P0 = "";
        u9dVar.b = this;
        uk9Var.b = this;
        odeVar.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(if4Var, new ViewGroup.LayoutParams(-2, -2));
        addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
        addView(appCompatImageView, new ViewGroup.LayoutParams(i, i));
        addView(b70Var, new ViewGroup.LayoutParams(-1, iD));
        kk4 kk4Var = qh9.s;
        yeb yebVarY = a93.s0.y(this);
        kk4Var.getClass();
        setBackground(kk4.o(yebVarY));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setWillNotDraw(false);
        setTransitionGroup(true);
        b70Var.setListener(new ukd(4, this));
    }

    public static LayerDrawable a(s40 s40Var) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{s40Var.getProgressDrawable(), s40Var.getDrawableInsideProgress()});
        int i = T0;
        layerDrawable.setLayerSize(0, i, i);
        int i2 = U0;
        int i3 = (i - i2) / 2;
        layerDrawable.setLayerSize(1, i2, i2);
        layerDrawable.setLayerInset(1, i3, i3, i3, i3);
        return layerDrawable;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final Drawable getDrawableInsideProgress() {
        return (Drawable) this.w0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final InsetDrawable getPauseDrawable() {
        return (InsetDrawable) this.A0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final InsetDrawable getPlayDrawable() {
        return (InsetDrawable) this.z0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final oj7 getProgressDrawable() {
        return (oj7) this.x0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final LayerDrawable getProgressDrawableWithIcon() {
        return (LayerDrawable) this.y0.getValue();
    }

    public final void b(p20 p20Var) {
        boolean zA = fni.a(p20Var, uha.c);
        AppCompatImageView appCompatImageView = this.v0;
        if (zA) {
            appCompatImageView.setImageDrawable(getProgressDrawableWithIcon());
            return;
        }
        if (fni.a(p20Var, wha.c)) {
            appCompatImageView.setImageDrawable(getPauseDrawable());
        } else {
            if (!fni.a(p20Var, jbe.b) && !fni.a(p20Var, mni.a) && p20Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            appCompatImageView.setImageDrawable(getPlayDrawable());
        }
    }

    public final void c(yt0 yt0Var) {
        bu0 bu0Var = yt0Var.d;
        int i = bu0Var.m;
        GradientDrawable gradientDrawableD = uga.d(Integer.valueOf(yt0Var.a.e), null, null);
        AppCompatImageView appCompatImageView = this.v0;
        appCompatImageView.setBackground(gradientDrawableD);
        int i2 = yt0Var.b.a;
        appCompatImageView.setColorFilter(i2);
        Drawable drawableInsideProgress = getDrawableInsideProgress();
        if (drawableInsideProgress != null) {
            drawableInsideProgress.setTint(i2);
        }
        getProgressDrawable().b = new int[]{i2, 0};
        this.D0.setIncomingMessage(this.F0);
        this.E0.setTextColor(bu0Var.c);
        if4 if4Var = this.B0;
        if4Var.setTextColor$message_list_release(i);
        if4Var.setDateViewStatusColor(i);
    }

    @Override // defpackage.zk9
    public final void d(yt0 yt0Var) {
        this.d.d(yt0Var);
    }

    @Override // defpackage.wad
    public final void g(xl9 xl9Var, boolean z) {
        this.c.g(xl9Var, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.o.j0();
    }

    public boolean getDependOnOutsideView() {
        return this.s0.a;
    }

    @Override // defpackage.jf4
    public final void h(CharSequence charSequence, boolean z) {
        yy7[] yy7VarArr = if4.K0;
        this.B0.c(charSequence, false);
    }

    @Override // defpackage.wad
    public final void l(yt0 yt0Var, boolean z) {
        this.c.l(yt0Var, z);
    }

    @Override // defpackage.zk9
    public final void m() {
        this.d.m();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        wde wdeVar = this.t0;
        ?? r7 = wdeVar.b;
        ?? r8 = wdeVar.b;
        boolean zR = dqi.r(r7);
        int i5 = this.I0;
        int i6 = this.G0;
        int iM = zR ? i5 : i6;
        if (dqi.r(r8)) {
            int iA = wdeVar.a() + iM;
            wdeVar.c(i6, iM);
            iM = this.M0 + iA;
        }
        ode odeVar = this.o;
        if (dqi.r(odeVar.c) && dqi.r(r8)) {
            odeVar.W((getMeasuredWidth() - i6) - odeVar.N(), ((wdeVar.a() / 2) - (odeVar.M() / 2)) + i5);
        }
        uk9 uk9Var = this.d;
        if (dqi.r(uk9Var.c)) {
            uk9Var.W(i6, iM);
            iM += uk9Var.M() + this.L0;
        }
        AppCompatImageView appCompatImageView = this.v0;
        int measuredWidth = appCompatImageView.getMeasuredWidth() + i6;
        int measuredHeight = appCompatImageView.getMeasuredHeight() + iM;
        View view = (View) appCompatImageView.getParent();
        if (m8j.d(appCompatImageView)) {
            appCompatImageView.layout(view.getMeasuredWidth() - measuredWidth, iM, view.getMeasuredWidth() - i6, measuredHeight);
        } else {
            appCompatImageView.layout(i6, iM, measuredWidth, measuredHeight);
        }
        int measuredWidth2 = appCompatImageView.getMeasuredWidth() + this.J0 + i6;
        int iQ = u45.q(6, vw4.d().getDisplayMetrics().density, measuredWidth2);
        b70 b70Var = this.D0;
        int measuredWidth3 = b70Var.getMeasuredWidth() + measuredWidth2;
        int measuredHeight2 = b70Var.getMeasuredHeight() + iM;
        View view2 = (View) b70Var.getParent();
        if (m8j.d(b70Var)) {
            b70Var.layout(view2.getMeasuredWidth() - measuredWidth3, iM, view2.getMeasuredWidth() - iQ, measuredHeight2);
        } else {
            b70Var.layout(iQ, iM, measuredWidth3, measuredHeight2);
        }
        int measuredHeight3 = b70Var.getMeasuredHeight() + this.K0 + iM;
        AppCompatTextView appCompatTextView = this.E0;
        int measuredWidth4 = appCompatTextView.getMeasuredWidth() + measuredWidth2;
        int measuredHeight4 = appCompatTextView.getMeasuredHeight() + measuredHeight3;
        View view3 = (View) appCompatTextView.getParent();
        if (m8j.d(appCompatTextView)) {
            appCompatTextView.layout(view3.getMeasuredWidth() - measuredWidth4, measuredHeight3, view3.getMeasuredWidth() - measuredWidth2, measuredHeight4);
        } else {
            appCompatTextView.layout(measuredWidth2, measuredHeight3, measuredWidth4, measuredHeight4);
        }
        int bottom = appCompatImageView.getBottom();
        u9d u9dVar = this.c;
        if (dqi.r(u9dVar.c)) {
            float f = 10;
            u9dVar.W(kti.d(f * vw4.d().getDisplayMetrics().density), u45.c(f, vw4.d().getDisplayMetrics().density, bottom));
        }
        int measuredWidth5 = getMeasuredWidth();
        if4 if4Var = this.B0;
        int measuredWidth6 = (measuredWidth5 - if4Var.getMeasuredWidth()) - i6;
        int measuredHeight5 = (getMeasuredHeight() - if4Var.getMeasuredHeight()) - this.H0;
        int measuredWidth7 = if4Var.getMeasuredWidth() + measuredWidth6;
        int measuredHeight6 = if4Var.getMeasuredHeight() + measuredHeight5;
        View view4 = (View) if4Var.getParent();
        if (m8j.d(if4Var)) {
            if4Var.layout(view4.getMeasuredWidth() - measuredWidth7, measuredHeight5, view4.getMeasuredWidth() - measuredWidth6, measuredHeight6);
        } else {
            if4Var.layout(measuredWidth6, measuredHeight5, measuredWidth7, measuredHeight6);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        if (this.O0 == null || getDependOnOutsideView()) {
            size = View.MeasureSpec.getSize(i);
        } else {
            int size2 = View.MeasureSpec.getSize(i);
            float f = 192;
            size = (int) ((u45.q(f, vw4.d().getDisplayMetrics().density, size2) * ((n7j.e(r0.longValue(), 1000L, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) - 1000) / 29000)) + kti.d(vw4.d().getDisplayMetrics().density * f));
        }
        wde wdeVar = this.t0;
        ?? r2 = wdeVar.b;
        ?? r3 = wdeVar.b;
        boolean zR = dqi.r(r2);
        int i3 = this.G0;
        int iM = zR ? this.I0 : i3;
        ode odeVar = this.o;
        if (dqi.r(odeVar.c) && dqi.r(r3)) {
            odeVar.Y(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
        }
        if (dqi.r(r3)) {
            wdeVar.d(View.MeasureSpec.makeMeasureSpec(size - i3, Integer.MIN_VALUE), i2);
            iM += wdeVar.a() + this.M0;
        }
        uk9 uk9Var = this.d;
        if (dqi.r(uk9Var.c)) {
            uk9Var.Y(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            iM += uk9Var.M() + this.L0;
        }
        this.B0.measure(i, i2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        AppCompatTextView appCompatTextView = this.E0;
        appCompatTextView.measure(iMakeMeasureSpec, i2);
        int i4 = this.u0;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        AppCompatImageView appCompatImageView = this.v0;
        appCompatImageView.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
        float f2 = 10;
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(u45.d(f2, vw4.d().getDisplayMetrics().density, 2, (kti.d(6 * vw4.d().getDisplayMetrics().density) * 2) + ((size - appCompatImageView.getMeasuredWidth()) - this.J0)), 1073741824);
        int i5 = this.C0;
        this.D0.measure(iMakeMeasureSpec4, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
        int iMax = Math.max(appCompatImageView.getMeasuredHeight() + i3, appCompatTextView.getMeasuredHeight() + i5 + this.K0 + this.H0) + iM;
        u9d u9dVar = this.c;
        if (dqi.r(u9dVar.c)) {
            u9dVar.Y(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
            iMax = utb.j(f2, vw4.d().getDisplayMetrics().density, u9dVar.M(), iMax);
        }
        setMeasuredDimension(size, iMax);
    }

    @Override // defpackage.wad
    public final void r(boolean z) {
        this.c.r(z);
    }

    @Override // defpackage.qde
    public void setAlias(Layout layout) {
        this.o.setAlias(layout);
    }

    @Override // defpackage.qde
    public void setAliasColor(int i) {
        this.o.setAliasColor(i);
    }

    @Override // defpackage.wad
    public void setChipObserver(y8d y8dVar) {
        this.c.setChipObserver(y8dVar);
    }

    @Override // defpackage.jf4
    public void setCountView(CharSequence charSequence) {
        this.B0.setCountView$message_list_release(charSequence);
    }

    @Override // defpackage.jf4
    public void setDateViewStatus(ghh ghhVar) {
        this.B0.setStatus$message_list_release(ghhVar);
    }

    @Override // defpackage.nkb
    public void setDependOnOutsideView(boolean z) {
        this.s0.a = z;
    }

    @Override // defpackage.zk9
    public void setForwardClickListener(sm6 sm6Var) {
        this.d.o = sm6Var;
    }

    @Override // defpackage.jf4
    public void setIsChannelMode(boolean z) {
        this.B0.setChannelMode$message_list_release(z);
    }

    @Override // defpackage.wad
    public void setIsIncoming(boolean z) {
        this.c.d = z;
    }

    @Override // defpackage.zk9
    public void setLink(tk9 tk9Var) {
        this.d.setLink(tk9Var);
    }

    @Override // defpackage.wad
    public void setOnClickListener(em6 em6Var) {
        this.c.o = em6Var;
    }

    @Override // defpackage.zk9
    public void setReplyClickListener(sm6 sm6Var) {
        this.d.d = sm6Var;
    }

    @Override // defpackage.vde
    public void setSenderName(Layout layout) {
        this.t0.e(layout);
    }

    @Override // defpackage.vde
    public void setSenderNameColor(int i) {
        this.t0.f(i);
    }

    @Override // defpackage.wad
    public void setStackFromEnd(boolean z) {
        this.c.Y = z;
    }
}
