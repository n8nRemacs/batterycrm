package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public final class uf1 extends ViewGroup implements jf4, vde, wad, qde {
    public final u9d a;
    public final ode b;
    public final bwf c;
    public final wde d;
    public final TextView o;
    public final TextView s0;
    public final AppCompatImageView t0;
    public final if4 u0;
    public final int v0;
    public final int w0;
    public boolean x0;
    public boolean y0;

    public uf1(Context context) {
        u9d u9dVar = new u9d();
        ode odeVar = new ode();
        super(context);
        this.a = u9dVar;
        this.b = odeVar;
        this.c = new bwf(new g31(15));
        this.d = new wde(this);
        TextView textView = new TextView(context);
        t5g t5gVar = dpg.a;
        vz2.j.b(textView, t75.b);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.o = textView;
        TextView textView2 = new TextView(context);
        vz2.g.b(textView2, t75.b);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        this.s0 = textView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setBackground(getIconBackground());
        int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(iD, iD, iD, iD);
        this.t0 = appCompatImageView;
        if4 if4Var = new if4(context);
        if4Var.setBackgroundEnabled$message_list_release(false);
        this.u0 = if4Var;
        this.v0 = kti.d(10 * vw4.d().getDisplayMetrics().density);
        int iD2 = kti.d(40 * vw4.d().getDisplayMetrics().density);
        this.w0 = iD2;
        u9dVar.b = this;
        odeVar.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(appCompatImageView, new ViewGroup.LayoutParams(iD2, iD2));
        addView(textView, new ViewGroup.LayoutParams(-2, -2));
        addView(textView2, new ViewGroup.LayoutParams(-2, -2));
        addView(if4Var, new ViewGroup.LayoutParams(-2, -2));
        setClipChildren(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        kk4 kk4Var = qh9.s;
        yeb yebVarY = a93.s0.y(this);
        kk4Var.getClass();
        setBackground(kk4.o(yebVarY));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    private final yt0 getColors() {
        return a93.s0.y(this).a().h(this.y0);
    }

    private final ShapeDrawable getIconBackground() {
        return (ShapeDrawable) this.c.getValue();
    }

    private final int getIconColor() {
        v1a v1aVar = a93.s0;
        boolean z = this.y0;
        return (z && this.x0) ? v1aVar.y(this).getIcon().c : z ? v1aVar.y(this).getIcon().f : getColors().b.f;
    }

    private final void setIcon(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.t0;
        appCompatImageView.setImageDrawable(drawable);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(getIconColor()));
    }

    private final void setSubtitle(CharSequence charSequence) {
        this.s0.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.o.setText(charSequence);
    }

    public final void a(yt0 yt0Var) {
        bu0 bu0Var = yt0Var.d;
        this.o.setTextColor(bu0Var.e);
        this.s0.setTextColor(bu0Var.f);
        this.t0.setImageTintList(ColorStateList.valueOf(getIconColor()));
        getIconBackground().getPaint().setColor(yt0Var.a.i);
        int i = bu0Var.m;
        if4 if4Var = this.u0;
        if4Var.setTextColor$message_list_release(i);
        if4Var.setDateViewStatusColor(i);
    }

    public final void b(u21 u21Var) {
        this.y0 = u21Var.f;
        this.x0 = u21Var.c;
        setTitle(u21Var.a);
        setSubtitle(u21Var.b);
        setIcon(u21Var.d);
    }

    @Override // defpackage.wad
    public final void g(xl9 xl9Var, boolean z) {
        this.a.g(xl9Var, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.b.j0();
    }

    @Override // defpackage.jf4
    public final void h(CharSequence charSequence, boolean z) {
        yy7[] yy7VarArr = if4.K0;
        this.u0.c(charSequence, false);
    }

    @Override // defpackage.wad
    public final void l(yt0 yt0Var, boolean z) {
        this.a.l(yt0Var, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iJ;
        wde wdeVar = this.d;
        boolean zR = dqi.r(wdeVar.b);
        int i5 = this.v0;
        if (zR) {
            wdeVar.c(i5, i5);
            iJ = utb.j(4, vw4.d().getDisplayMetrics().density, wdeVar.a(), i5);
        } else {
            iJ = i5;
        }
        ode odeVar = this.b;
        if (dqi.r(odeVar.c) && dqi.r(wdeVar.b)) {
            odeVar.W((getMeasuredWidth() - i5) - odeVar.N(), ((wdeVar.a() / 2) - (odeVar.M() / 2)) + i5);
        }
        int i6 = this.w0;
        int i7 = i5 + i6;
        cri.b(this.t0, i5, iJ, i7, i6 + iJ);
        int i8 = i7 + i5;
        TextView textView = this.o;
        cri.c(textView, i8, iJ, 0, 12);
        int measuredHeight = textView.getMeasuredHeight() + iJ;
        TextView textView2 = this.s0;
        cri.c(textView2, i8, measuredHeight, 0, 12);
        int measuredHeight2 = textView2.getMeasuredHeight() + measuredHeight;
        u9d u9dVar = this.a;
        if (dqi.r(u9dVar.c)) {
            float f = 10;
            u9dVar.W(kti.d(f * vw4.d().getDisplayMetrics().density), u45.c(f, vw4.d().getDisplayMetrics().density, measuredHeight2));
        }
        int measuredWidth = getMeasuredWidth();
        if4 if4Var = this.u0;
        cri.c(if4Var, (measuredWidth - if4Var.getMeasuredWidth()) - i5, u45.q(4, vw4.d().getDisplayMetrics().density, getMeasuredHeight() - if4Var.getMeasuredHeight()), 0, 12);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iJ0;
        float f = 10;
        int iD = u45.d(f, vw4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int iD2 = kti.d(8 * vw4.d().getDisplayMetrics().density) * 2;
        ode odeVar = this.b;
        boolean zR = dqi.r(odeVar.c);
        wde wdeVar = this.d;
        if (zR && dqi.r(wdeVar.b)) {
            odeVar.Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
        }
        if (dqi.r(wdeVar.b)) {
            wdeVar.d(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            iJ0 = odeVar.j0() + wdeVar.b();
            iD2 = utb.j(4, vw4.d().getDisplayMetrics().density, wdeVar.a(), iD2);
        } else {
            iJ0 = 0;
        }
        if4 if4Var = this.u0;
        if4Var.measure(i, i2);
        this.t0.measure(View.MeasureSpec.makeMeasureSpec(iD, 1073741824), i2);
        int i3 = this.w0;
        int i4 = this.v0;
        int i5 = iD - (i3 + i4);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        TextView textView = this.o;
        textView.measure(iMakeMeasureSpec, i2);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        TextView textView2 = this.s0;
        textView2.measure(iMakeMeasureSpec2, i2);
        int iMin = (i4 * 2) + Math.min(iD, if4Var.getMeasuredWidth() + Math.max(textView.getMeasuredWidth(), Math.max(textView2.getMeasuredWidth(), iJ0)) + i3);
        int measuredHeight = if4Var.getMeasuredHeight() + textView.getMeasuredHeight() + textView2.getMeasuredHeight() + iD2;
        u9d u9dVar = this.a;
        if (dqi.r(u9dVar.c)) {
            u9dVar.Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            iMin = Math.max(iMin, u9dVar.N());
            measuredHeight = utb.j(f, vw4.d().getDisplayMetrics().density, u9dVar.M(), measuredHeight);
        }
        setMeasuredDimension(iMin, measuredHeight);
    }

    @Override // defpackage.wad
    public final void r(boolean z) {
        this.a.r(z);
    }

    @Override // defpackage.qde
    public void setAlias(Layout layout) {
        this.b.setAlias(layout);
    }

    @Override // defpackage.qde
    public void setAliasColor(int i) {
        this.b.setAliasColor(i);
    }

    @Override // defpackage.wad
    public void setChipObserver(y8d y8dVar) {
        this.a.setChipObserver(y8dVar);
    }

    @Override // defpackage.jf4
    public void setCountView(CharSequence charSequence) {
        this.u0.setCountView$message_list_release(charSequence);
    }

    @Override // defpackage.jf4
    public void setDateViewStatus(ghh ghhVar) {
        this.u0.setStatus$message_list_release(ghhVar);
    }

    @Override // defpackage.jf4
    public void setIsChannelMode(boolean z) {
        this.u0.setChannelMode$message_list_release(z);
    }

    @Override // defpackage.wad
    public void setIsIncoming(boolean z) {
        this.a.d = z;
    }

    @Override // defpackage.wad
    public void setOnClickListener(em6 em6Var) {
        this.a.o = em6Var;
    }

    @Override // defpackage.vde
    public void setSenderName(Layout layout) {
        this.d.e(layout);
    }

    @Override // defpackage.vde
    public void setSenderNameColor(int i) {
        this.d.f(i);
    }

    @Override // defpackage.wad
    public void setStackFromEnd(boolean z) {
        this.a.Y = z;
    }
}
