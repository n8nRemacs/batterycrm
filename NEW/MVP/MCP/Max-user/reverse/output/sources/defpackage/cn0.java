package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class cn0 extends ViewGroup implements jf4, y4g, wad, zk9, nkb {
    public final u9d a;
    public final uk9 b;
    public final okb c;
    public final rm9 d;
    public final if4 o;
    public final int s0;

    public cn0(Context context) {
        u9d u9dVar = new u9d();
        uk9 uk9Var = new uk9();
        okb okbVar = new okb();
        super(context);
        this.a = u9dVar;
        this.b = uk9Var;
        this.c = okbVar;
        rm9 rm9Var = new rm9(context);
        rm9Var.setId(j7b.N);
        this.d = rm9Var;
        if4 if4Var = new if4(context);
        if4Var.setBackgroundEnabled$message_list_release(true);
        this.o = if4Var;
        this.s0 = kti.d(10 * vw4.d().getDisplayMetrics().density);
        u9dVar.b = this;
        uk9Var.b = this;
        rm9Var.setSingleClickAction(new o3(19, this));
        rm9Var.setOnLongClickListener(new bn0(0, this));
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(rm9Var, new ViewGroup.LayoutParams(-2, -2));
        addView(if4Var, new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // defpackage.zk9
    public final void d(yt0 yt0Var) {
        this.b.d(yt0Var);
    }

    @Override // defpackage.wad
    public final void g(xl9 xl9Var, boolean z) {
        this.a.g(xl9Var, z);
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public final CharSequence getText() {
        return this.d.getText();
    }

    @Override // defpackage.jf4
    public final void h(CharSequence charSequence, boolean z) {
        this.o.c(charSequence, z);
    }

    @Override // defpackage.wad
    public final void l(yt0 yt0Var, boolean z) {
        this.a.l(yt0Var, z);
    }

    @Override // defpackage.zk9
    public final void m() {
        this.b.m();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iJ;
        uk9 uk9Var = this.b;
        ?? r9 = uk9Var.c;
        ?? r10 = uk9Var.c;
        boolean zR = dqi.r(r9);
        int measuredWidth = this.s0;
        if (zR) {
            uk9Var.W(measuredWidth, measuredWidth);
            iJ = utb.j(4, vw4.d().getDisplayMetrics().density, uk9Var.M(), measuredWidth);
        } else {
            iJ = measuredWidth;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        th9 th9Var = layoutParams instanceof th9 ? (th9) layoutParams : null;
        boolean z2 = (th9Var == null || th9Var.a) ? false : true;
        rm9 rm9Var = this.d;
        int measuredWidth2 = (!z2 || dqi.r(r10)) ? measuredWidth : (getMeasuredWidth() - rm9Var.getMeasuredWidth()) - measuredWidth;
        cri.c(rm9Var, measuredWidth2, iJ, 0, 12);
        int measuredHeight = rm9Var.getMeasuredHeight() + (getBackground() == null ? kti.d(2 * vw4.d().getDisplayMetrics().density) : 0) + iJ;
        boolean zR2 = dqi.r(r10);
        if4 if4Var = this.o;
        if (zR2 || z2) {
            measuredWidth = (getMeasuredWidth() - if4Var.getMeasuredWidth()) - measuredWidth;
        } else if (rm9Var.getMeasuredWidth() >= if4Var.getMeasuredWidth()) {
            measuredWidth = (rm9Var.getMeasuredWidth() + measuredWidth2) - if4Var.getMeasuredWidth();
        }
        cri.c(if4Var, measuredWidth, measuredHeight, 0, 12);
        int iC = measuredHeight + (getBackground() != null ? u45.c(4, vw4.d().getDisplayMetrics().density, if4Var.getMeasuredHeight()) : if4Var.getMeasuredHeight());
        u9d u9dVar = this.a;
        if (dqi.r(u9dVar.c)) {
            u9dVar.W(u9dVar.Y ? getMeasuredWidth() - u9dVar.N() : 0, kti.d(10 * vw4.d().getDisplayMetrics().density) + iC);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f = 10;
        int iD = u45.d(f, vw4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        rm9 rm9Var = this.d;
        rm9Var.i();
        int measuredWidth = getDependOnOutsideView() ? iD : rm9Var.getMeasuredWidth();
        int measuredHeight = rm9Var.getMeasuredHeight() + (getBackground() == null ? kti.d(2 * vw4.d().getDisplayMetrics().density) : 0);
        uk9 uk9Var = this.b;
        if (dqi.r(uk9Var.c)) {
            uk9Var.Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, uk9Var.N());
            measuredHeight = utb.j(4, vw4.d().getDisplayMetrics().density, uk9Var.M(), measuredHeight);
        }
        u9d u9dVar = this.a;
        if (dqi.r(u9dVar.c)) {
            u9dVar.Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            measuredWidth = Math.max(measuredWidth, u9dVar.N());
            measuredHeight = utb.j(f, vw4.d().getDisplayMetrics().density, u9dVar.M(), measuredHeight);
        }
        if4 if4Var = this.o;
        if4Var.measure(i, i2);
        setMeasuredDimension((kti.d(f * vw4.d().getDisplayMetrics().density) * 2) + Math.max(measuredWidth, if4Var.getMeasuredWidth()), (kti.d(8 * vw4.d().getDisplayMetrics().density) * 2) + if4Var.getMeasuredHeight() + measuredHeight);
    }

    @Override // defpackage.wad
    public final void r(boolean z) {
        this.a.r(z);
    }

    @Override // defpackage.wad
    public void setChipObserver(y8d y8dVar) {
        this.a.setChipObserver(y8dVar);
    }

    @Override // defpackage.jf4
    public void setCountView(CharSequence charSequence) {
        this.o.setCountView$message_list_release(charSequence);
    }

    @Override // defpackage.jf4
    public void setDateViewStatus(ghh ghhVar) {
        this.o.setStatus$message_list_release(ghhVar);
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
        this.o.setChannelMode$message_list_release(z);
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

    @Override // defpackage.wad
    public void setStackFromEnd(boolean z) {
        this.a.Y = z;
    }

    @Override // defpackage.y4g
    public void setTextMessageColors(yt0 yt0Var) {
        this.d.setTextColors(yt0Var);
    }

    @Override // defpackage.y4g
    public void setTextMessageLayout(pm9 pm9Var) {
        this.d.setLayout(pm9Var);
    }

    @Override // defpackage.y4g
    public /* bridge */ /* synthetic */ void setTextMessageLinkClickListener(e88 e88Var) {
    }
}
