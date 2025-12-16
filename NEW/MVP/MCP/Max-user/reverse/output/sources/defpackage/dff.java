package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class dff extends ViewGroup implements jf4, zef, wad, zk9 {
    public final zef a;
    public final u9d b;
    public final uk9 c;
    public final FrameLayout d;
    public final int o;
    public final if4 s0;
    public boolean t0;

    public dff(Context context, zef zefVar) {
        u9d u9dVar = new u9d();
        uk9 uk9Var = new uk9();
        super(context);
        this.a = zefVar;
        this.b = u9dVar;
        this.c = uk9Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        this.o = kti.d(10 * vw4.d().getDisplayMetrics().density);
        if4 if4Var = new if4(context);
        if4Var.setBackgroundEnabled$message_list_release(true);
        this.s0 = if4Var;
        this.t0 = true;
        u9dVar.b = this;
        uk9Var.b = this;
        zefVar.setParent(frameLayout);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(frameLayout, new ViewGroup.LayoutParams(-2, -2));
        addView(if4Var, new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // defpackage.zef
    public final void a(fff fffVar) {
        this.a.a(fffVar);
    }

    @Override // defpackage.zef
    public final void b(qk8 qk8Var) {
        this.a.b(qk8Var);
    }

    @Override // defpackage.zk9
    public final void d(yt0 yt0Var) {
        this.c.d(yt0Var);
    }

    @Override // defpackage.wad
    public final void g(xl9 xl9Var, boolean z) {
        this.b.g(xl9Var, z);
    }

    @Override // defpackage.jf4
    public final void h(CharSequence charSequence, boolean z) {
        yy7[] yy7VarArr = if4.K0;
        this.s0.c(charSequence, false);
    }

    @Override // defpackage.wad
    public final void l(yt0 yt0Var, boolean z) {
        this.b.l(yt0Var, z);
    }

    @Override // defpackage.zk9
    public final void m() {
        this.c.m();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int measuredWidth2 = getMeasuredWidth();
        int measuredWidth3 = this.o;
        int i5 = measuredWidth2 - (measuredWidth3 * 2);
        uk9 uk9Var = this.c;
        ?? r10 = uk9Var.c;
        ?? r11 = uk9Var.c;
        int iD = dqi.r(r10) ? kti.d(4 * vw4.d().getDisplayMetrics().density) : measuredWidth3;
        if (dqi.r(r11)) {
            uk9Var.W(this.t0 ? measuredWidth3 : (i5 + measuredWidth3) - uk9Var.N(), iD);
            iD = utb.j(4, vw4.d().getDisplayMetrics().density, uk9Var.M(), iD);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        th9 th9Var = layoutParams instanceof th9 ? (th9) layoutParams : null;
        boolean z2 = (th9Var == null || th9Var.a) ? false : true;
        FrameLayout frameLayout = this.d;
        cri.c(frameLayout, (!z2 || dqi.r(r11)) ? measuredWidth3 : (getMeasuredWidth() - frameLayout.getMeasuredWidth()) - measuredWidth3, iD, 0, 12);
        int iJ = utb.j(2, vw4.d().getDisplayMetrics().density, frameLayout.getMeasuredHeight(), iD);
        boolean zR = dqi.r(r11);
        if4 if4Var = this.s0;
        if (zR || z2) {
            measuredWidth = getMeasuredWidth() - if4Var.getMeasuredWidth();
        } else {
            measuredWidth = frameLayout.getMeasuredWidth();
            measuredWidth3 = if4Var.getMeasuredWidth();
        }
        cri.c(if4Var, measuredWidth - measuredWidth3, iJ, 0, 12);
        int iC = iJ + (getBackground() != null ? u45.c(4, vw4.d().getDisplayMetrics().density, if4Var.getMeasuredHeight()) : if4Var.getMeasuredHeight());
        u9d u9dVar = this.b;
        if (dqi.r(u9dVar.c)) {
            u9dVar.W(u9dVar.Y ? getMeasuredWidth() - u9dVar.N() : 0, kti.d(10 * vw4.d().getDisplayMetrics().density) + iC);
        }
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.o * 2;
        int i4 = size - i3;
        int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        FrameLayout frameLayout = this.d;
        frameLayout.measure(iMakeMeasureSpec, i2);
        int iMax = Math.max(0, frameLayout.getMeasuredWidth());
        int measuredHeight = frameLayout.getMeasuredHeight() + iD;
        uk9 uk9Var = this.c;
        if (dqi.r(uk9Var.c)) {
            uk9Var.Y(View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE), i2);
            iMax = Math.max(iMax, (kti.d(10 * vw4.d().getDisplayMetrics().density) * 2) + uk9Var.N());
            measuredHeight += (kti.d(4 * vw4.d().getDisplayMetrics().density) * 2) + uk9Var.M();
        }
        if4 if4Var = this.s0;
        if4Var.measure(i, i2);
        int iJ = utb.j(4, vw4.d().getDisplayMetrics().density, if4Var.getMeasuredHeight() + kti.d(2 * vw4.d().getDisplayMetrics().density), measuredHeight);
        int iMax2 = i3 + iMax;
        u9d u9dVar = this.b;
        if (dqi.r(u9dVar.c)) {
            u9dVar.Y(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i2);
            iMax2 = Math.max(iMax2, u9dVar.N());
            iJ = utb.j(10, vw4.d().getDisplayMetrics().density, u9dVar.M(), iJ);
        }
        setMeasuredDimension(iMax2, iJ);
    }

    @Override // defpackage.wad
    public final void r(boolean z) {
        this.b.r(z);
    }

    @Override // defpackage.wad
    public void setChipObserver(y8d y8dVar) {
        this.b.setChipObserver(y8dVar);
    }

    @Override // defpackage.jf4
    public void setCountView(CharSequence charSequence) {
        this.s0.setCountView$message_list_release(charSequence);
    }

    @Override // defpackage.jf4
    public void setDateViewStatus(ghh ghhVar) {
        this.s0.setStatus$message_list_release(ghhVar);
    }

    @Override // defpackage.zk9
    public void setForwardClickListener(sm6 sm6Var) {
        this.c.o = sm6Var;
    }

    public final void setIncomingAlignment(boolean z) {
        this.t0 = z;
    }

    @Override // defpackage.jf4
    public void setIsChannelMode(boolean z) {
        this.s0.setChannelMode$message_list_release(z);
    }

    @Override // defpackage.wad
    public void setIsIncoming(boolean z) {
        this.b.d = z;
    }

    @Override // defpackage.zk9
    public void setLink(tk9 tk9Var) {
        this.c.setLink(tk9Var);
    }

    @Override // defpackage.wad
    public void setOnClickListener(em6 em6Var) {
        this.b.o = em6Var;
    }

    @Override // defpackage.zef
    public void setParent(ViewGroup viewGroup) {
        this.a.setParent(viewGroup);
    }

    @Override // defpackage.zk9
    public void setReplyClickListener(sm6 sm6Var) {
        this.c.d = sm6Var;
    }

    @Override // defpackage.wad
    public void setStackFromEnd(boolean z) {
        this.b.Y = z;
    }
}
