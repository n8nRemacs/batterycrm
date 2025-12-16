package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class g34 extends ViewGroup implements jf4, vde, wad, zk9, nkb, qde, ii9 {
    public final u9d a;
    public final uk9 b;
    public final ode c;
    public final okb d;
    public final Paint o;
    public final Rect s0;
    public final float t0;
    public final int u0;
    public final Object v0;
    public final ImageView w0;
    public final TextView x0;
    public final if4 y0;
    public final wde z0;

    public g34(Context context) {
        u9d u9dVar = new u9d();
        uk9 uk9Var = new uk9();
        ode odeVar = new ode();
        okb okbVar = new okb();
        super(context);
        this.a = u9dVar;
        this.b = uk9Var;
        this.c = odeVar;
        this.d = okbVar;
        this.o = new Paint(1);
        this.s0 = new Rect();
        this.t0 = vw4.d().getDisplayMetrics().density * 16.0f;
        this.u0 = kti.d(24 * vw4.d().getDisplayMetrics().density);
        this.v0 = ipi.b(3, new hk1(29, this));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(yud.W);
        this.w0 = imageView;
        TextView textView = new TextView(context);
        t5g t5gVar = dpg.a;
        vz2.b.b(textView, t75.b);
        textView.setText(l7b.S0);
        this.x0 = textView;
        if4 if4Var = new if4(context);
        if4Var.setBackgroundEnabled$message_list_release(false);
        this.y0 = if4Var;
        this.z0 = new wde(this);
        u9dVar.b = this;
        uk9Var.b = this;
        odeVar.b = this;
        addView(imageView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(if4Var, new ViewGroup.LayoutParams(-2, -2));
        setClickable(false);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        kk4 kk4Var = qh9.s;
        yeb yebVarY = a93.s0.y(this);
        kk4Var.getClass();
        setBackground(kk4.o(yebVarY));
        setTransitionGroup(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final ShapeDrawable getBorderDrawable() {
        return (ShapeDrawable) this.v0.getValue();
    }

    public final void a(yt0 yt0Var) {
        this.w0.setImageTintList(ColorStateList.valueOf(a93.s0.y(this).getIcon().j));
        bu0 bu0Var = yt0Var.d;
        this.x0.setTextColor(bu0Var.f);
        this.o.setColor(yt0Var.a.m);
        getBorderDrawable().getPaint().setColor(yt0Var.c.b);
        int i = bu0Var.m;
        if4 if4Var = this.y0;
        if4Var.setTextColor$message_list_release(i);
        if4Var.setDateViewStatusColor(i);
    }

    @Override // defpackage.zk9
    public final void d(yt0 yt0Var) {
        this.b.d(yt0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        getBorderDrawable().setBounds(this.s0);
        getBorderDrawable().draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getBorderDrawable().setState(getDrawableState());
        invalidate();
    }

    @Override // defpackage.wad
    public final void g(xl9 xl9Var, boolean z) {
        this.a.g(xl9Var, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.j0();
    }

    public boolean getDependOnOutsideView() {
        return this.d.a;
    }

    @Override // defpackage.jf4
    public final void h(CharSequence charSequence, boolean z) {
        this.y0.c(charSequence, z);
    }

    @Override // defpackage.ii9
    public final boolean i(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.wad
    public final void l(yt0 yt0Var, boolean z) {
        this.a.l(yt0Var, z);
    }

    @Override // defpackage.zk9
    public final void m() {
        this.b.m();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.s0;
        if (rect.isEmpty()) {
            return;
        }
        RectF rectF = new RectF(rect);
        float f = this.t0;
        canvas.drawRoundRect(rectF, f, f, this.o);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM;
        float f = 10;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        int iD2 = kti.d(16 * vw4.d().getDisplayMetrics().density);
        float f2 = 8;
        int iD3 = kti.d(vw4.d().getDisplayMetrics().density * f2);
        int iD4 = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        wde wdeVar = this.z0;
        if (dqi.r(wdeVar.b)) {
            wdeVar.c(iD, iD4);
            iM = u45.c(4, vw4.d().getDisplayMetrics().density, wdeVar.a() + iD4);
        } else {
            iM = iD;
        }
        ode odeVar = this.c;
        if (dqi.r(odeVar.c) && dqi.r(wdeVar.b)) {
            odeVar.W((getMeasuredWidth() - iD) - odeVar.N(), ((wdeVar.a() / 2) - (odeVar.M() / 2)) + iD4);
        }
        uk9 uk9Var = this.b;
        if (dqi.r(uk9Var.c)) {
            uk9Var.W(iD, iM);
            iM += uk9Var.M();
        }
        int iJ = utb.j(6, vw4.d().getDisplayMetrics().density, iM, iD3);
        int i5 = iD2 + iD;
        ImageView imageView = this.w0;
        int measuredHeight = imageView.getMeasuredHeight();
        TextView textView = this.x0;
        int iMax = (Math.max(measuredHeight, textView.getMeasuredHeight()) / 2) + iJ;
        cri.c(imageView, i5, iMax - (imageView.getMeasuredHeight() / 2), 0, 12);
        cri.c(textView, u45.c(12, vw4.d().getDisplayMetrics().density, imageView.getMeasuredWidth() + i5), iMax - (textView.getMeasuredHeight() / 2), 0, 12);
        u9d u9dVar = this.a;
        if (dqi.r(u9dVar.c)) {
            u9dVar.W(kti.d(f * vw4.d().getDisplayMetrics().density), u45.q(2, vw4.d().getDisplayMetrics().density, u45.q(f, vw4.d().getDisplayMetrics().density, getMeasuredHeight())) - u9dVar.M());
        }
        int measuredWidth = getMeasuredWidth();
        if4 if4Var = this.y0;
        cri.c(if4Var, (measuredWidth - if4Var.getMeasuredWidth()) - iD, u45.q(4, vw4.d().getDisplayMetrics().density, getMeasuredHeight() - if4Var.getMeasuredHeight()), 0, 12);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iD;
        int iM;
        int iC;
        if (getDependOnOutsideView()) {
            iD = View.MeasureSpec.getSize(i);
        } else {
            iD = u45.d(10, vw4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        }
        float f = 10;
        int iD2 = kti.d(vw4.d().getDisplayMetrics().density * f);
        int iD3 = kti.d(16 * vw4.d().getDisplayMetrics().density);
        float f2 = 8;
        int iD4 = kti.d(vw4.d().getDisplayMetrics().density * f2);
        int i3 = iD2 * 2;
        int i4 = iD - i3;
        ode odeVar = this.c;
        boolean zR = dqi.r(odeVar.c);
        wde wdeVar = this.z0;
        if (zR && dqi.r(wdeVar.b)) {
            odeVar.Y(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            iD = Math.max(iD, odeVar.N());
        }
        if (dqi.r(wdeVar.b)) {
            wdeVar.d(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            iD = Math.max(iD, wdeVar.b() + i3 + odeVar.j0());
            iM = u45.c(4, vw4.d().getDisplayMetrics().density, wdeVar.a() + kti.d(vw4.d().getDisplayMetrics().density * f2));
        } else {
            iM = iD2;
        }
        uk9 uk9Var = this.b;
        if (dqi.r(uk9Var.c)) {
            uk9Var.Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            iD = Math.max(iD, uk9Var.N() + 20);
            iM += uk9Var.M();
        }
        int iC2 = u45.c(6, vw4.d().getDisplayMetrics().density, iM);
        int i5 = i4 - (iD3 * 2);
        int i6 = this.u0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        ImageView imageView = this.w0;
        imageView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i5 - (imageView.getMeasuredWidth() - kti.d(12 * vw4.d().getDisplayMetrics().density)), Integer.MIN_VALUE);
        TextView textView = this.x0;
        textView.measure(iMakeMeasureSpec3, i2);
        int iMax = Math.max(imageView.getMeasuredHeight(), textView.getMeasuredHeight()) + (iD4 * 2) + iC2;
        this.s0.set(iD2, iC2, iD - iD2, iMax);
        u9d u9dVar = this.a;
        if (dqi.r(u9dVar.c)) {
            u9dVar.Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            iMax = utb.j(f, vw4.d().getDisplayMetrics().density, u9dVar.M(), iMax);
            iD = Math.max(iD, (kti.d(vw4.d().getDisplayMetrics().density * f) * 2) + u9dVar.N());
        }
        if4 if4Var = this.y0;
        if4Var.measure(i, i2);
        if (dqi.r(u9dVar.c)) {
            iC = kti.d(f * vw4.d().getDisplayMetrics().density);
        } else {
            iC = u45.c(f2, vw4.d().getDisplayMetrics().density, if4Var.getMeasuredHeight());
        }
        setMeasuredDimension(iD, iMax + iC);
    }

    @Override // defpackage.wad
    public final void r(boolean z) {
        this.a.r(z);
    }

    @Override // defpackage.qde
    public void setAlias(Layout layout) {
        this.c.setAlias(layout);
    }

    @Override // defpackage.qde
    public void setAliasColor(int i) {
        this.c.setAliasColor(i);
    }

    @Override // defpackage.wad
    public void setChipObserver(y8d y8dVar) {
        this.a.setChipObserver(y8dVar);
    }

    @Override // defpackage.jf4
    public void setCountView(CharSequence charSequence) {
        this.y0.setCountView$message_list_release(charSequence);
    }

    @Override // defpackage.jf4
    public void setDateViewStatus(ghh ghhVar) {
        this.y0.setStatus$message_list_release(ghhVar);
    }

    @Override // defpackage.nkb
    public void setDependOnOutsideView(boolean z) {
        this.d.a = z;
    }

    @Override // defpackage.zk9
    public void setForwardClickListener(sm6 sm6Var) {
        this.b.o = sm6Var;
    }

    @Override // defpackage.jf4
    public void setIsChannelMode(boolean z) {
        this.y0.setChannelMode$message_list_release(z);
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
}
