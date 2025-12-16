package defpackage;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public abstract class s19 extends ViewGroup implements jf4, vde, wad, zk9, nkb, qde, d19 {
    public static final /* synthetic */ yy7[] w0;
    public final u9d a;
    public final uk9 b;
    public final ode c;
    public final okb d;
    public final wde o;
    public final if4 s0;
    public final tcf t0;
    public final tcf u0;
    public final nk v0;

    static {
        z8a z8aVar = new z8a(s19.class, "model", "getModel()Lone/me/messages/list/loader/model/MediaAttachInfo;");
        vid.a.getClass();
        w0 = new yy7[]{z8aVar};
    }

    public s19(Context context) {
        u9d u9dVar = new u9d();
        uk9 uk9Var = new uk9();
        okb okbVar = new okb();
        ode odeVar = new ode();
        super(context);
        this.a = u9dVar;
        this.b = uk9Var;
        this.c = odeVar;
        this.d = okbVar;
        this.o = new wde(this);
        if4 if4Var = new if4(context);
        if4Var.setBackgroundEnabled$message_list_release(true);
        this.s0 = if4Var;
        tcf tcfVarA = ucf.a(null);
        this.t0 = tcfVarA;
        this.u0 = tcfVarA;
        this.v0 = new nk(12, this);
        uk9Var.b = this;
        u9dVar.b = this;
        odeVar.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(if4Var, new ViewGroup.LayoutParams(-2, -2));
        kk4 kk4Var = qh9.s;
        yeb yebVarY = a93.s0.y(this);
        kk4Var.getClass();
        setBackground(kk4.o(yebVarY));
        setWillNotDraw(false);
        setTransitionGroup(true);
    }

    public void a(ae3 ae3Var) {
        setModel(ae3Var);
    }

    @Override // defpackage.zk9
    public final void d(yt0 yt0Var) {
        this.b.d(yt0Var);
    }

    public final void f(th3 th3Var) {
        int i = th3Var.g.a;
        if4 if4Var = this.s0;
        if4Var.setTextColor$message_list_release(i);
        if4Var.setDateViewStatusColor(i);
        if4Var.setBackgroundColor(th3Var.b.f);
    }

    @Override // defpackage.wad
    public final void g(xl9 xl9Var, boolean z) {
        this.a.g(xl9Var, z);
    }

    public int getAliasWidthWithPaddings() {
        return this.c.j0();
    }

    public final if4 getDate() {
        return this.s0;
    }

    public boolean getDependOnOutsideView() {
        return this.d.a;
    }

    public ws8 getModel() {
        yy7 yy7Var = w0[0];
        return (ws8) this.v0.b;
    }

    public final mcf getModelFlow() {
        return this.u0;
    }

    @Override // defpackage.jf4
    public final void h(CharSequence charSequence, boolean z) {
        this.s0.c(charSequence, z);
    }

    public void j(s3f s3fVar) {
        setModel(s3fVar);
    }

    @Override // defpackage.wad
    public final void l(yt0 yt0Var, boolean z) {
        this.a.l(yt0Var, z);
    }

    @Override // defpackage.zk9
    public final void m() {
        this.b.m();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM;
        int iD = kti.d(10 * vw4.d().getDisplayMetrics().density);
        wde wdeVar = this.o;
        if (dqi.r(wdeVar.b)) {
            int iD2 = kti.d(8 * vw4.d().getDisplayMetrics().density);
            wdeVar.c(iD, iD2);
            iM = wdeVar.a() + iD2;
        } else {
            iM = 0;
        }
        ode odeVar = this.c;
        if (dqi.r(odeVar.c) && dqi.r(wdeVar.b)) {
            odeVar.W((getMeasuredWidth() - iD) - odeVar.N(), u45.c(8, vw4.d().getDisplayMetrics().density, (wdeVar.a() / 2) - (odeVar.M() / 2)));
        }
        uk9 uk9Var = this.b;
        if (dqi.r(uk9Var.c)) {
            int iD3 = iM + kti.d((iM == 0 ? 8 : 4) * vw4.d().getDisplayMetrics().density);
            uk9Var.W(iD, iD3);
            iM = iD3 + uk9Var.M();
        }
        float f = 1;
        int iD4 = kti.d(vw4.d().getDisplayMetrics().density * f) + (iM == 0 ? 0 : kti.d(8 * vw4.d().getDisplayMetrics().density)) + iM;
        int iB = b(kti.d(vw4.d().getDisplayMetrics().density * f), iD4) + iD4;
        int measuredWidth = getMeasuredWidth();
        if4 if4Var = this.s0;
        float f2 = 4;
        cri.c(if4Var, u45.q(f, vw4.d().getDisplayMetrics().density, u45.q(f2, vw4.d().getDisplayMetrics().density, measuredWidth - if4Var.getMeasuredWidth())), u45.q(f2, vw4.d().getDisplayMetrics().density, iB - if4Var.getMeasuredHeight()), 0, 12);
        u9d u9dVar = this.a;
        if (dqi.r(u9dVar.c)) {
            u9dVar.W(u9dVar.Y ? getMeasuredWidth() - u9dVar.N() : 0, u45.c(f2, vw4.d().getDisplayMetrics().density, iB));
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, k18] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iM;
        float f = 10;
        int iD = u45.d(f, vw4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : 0;
        ode odeVar = this.c;
        boolean zR = dqi.r(odeVar.c);
        wde wdeVar = this.o;
        if (zR && dqi.r(wdeVar.b)) {
            odeVar.Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            size = Math.max(size, odeVar.N());
        }
        if (dqi.r(wdeVar.b)) {
            wdeVar.d(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            size = Math.max(size, (kti.d(vw4.d().getDisplayMetrics().density * f) * 2) + wdeVar.b() + odeVar.j0());
            iM = wdeVar.a() + kti.d(8 * vw4.d().getDisplayMetrics().density);
        } else {
            iM = 0;
        }
        uk9 uk9Var = this.b;
        if (dqi.r(uk9Var.c)) {
            uk9Var.Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            size = Math.max(size, (kti.d(f * vw4.d().getDisplayMetrics().density) * 2) + uk9Var.N());
            iM += uk9Var.M() + kti.d((iM == 0 ? 8 : 4) * vw4.d().getDisplayMetrics().density);
        }
        int iD2 = iM + (iM != 0 ? kti.d(8 * vw4.d().getDisplayMetrics().density) : 0);
        this.s0.measure(i, i2);
        u9d u9dVar = this.a;
        if (dqi.r(u9dVar.c)) {
            u9dVar.Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            size = Math.max(size, u9dVar.N());
            int iC = u45.c(8, vw4.d().getDisplayMetrics().density, u9dVar.M() + kti.d(4 * vw4.d().getDisplayMetrics().density));
            iD2 += iC;
            ((qh9) getBackground()).q = iC;
        } else {
            ((qh9) getBackground()).q = 0.0f;
        }
        float f2 = 1;
        long jV = v(u45.d(f2, vw4.d().getDisplayMetrics().density, 2, size), u45.d(f2, vw4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i)), i, i2);
        setMeasuredDimension(Math.max(size, (kti.d(vw4.d().getDisplayMetrics().density * f2) * 2) + ((int) (jV >> 32))), (kti.d(f2 * vw4.d().getDisplayMetrics().density) * 2) + ((int) (jV & 4294967295L)) + iD2);
    }

    public void q(n2f n2fVar) {
        setModel(n2fVar);
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
        this.s0.setCountView$message_list_release(charSequence);
    }

    @Override // defpackage.jf4
    public void setDateViewStatus(ghh ghhVar) {
        this.s0.setStatus$message_list_release(ghhVar);
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
        this.s0.setChannelMode$message_list_release(z);
    }

    @Override // defpackage.wad
    public void setIsIncoming(boolean z) {
        this.a.d = z;
    }

    @Override // defpackage.zk9
    public void setLink(tk9 tk9Var) {
        this.b.setLink(tk9Var);
    }

    public void setModel(ws8 ws8Var) {
        this.v0.O(this, w0[0], ws8Var);
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
        this.o.e(layout);
    }

    @Override // defpackage.vde
    public void setSenderNameColor(int i) {
        this.o.f(i);
    }

    @Override // defpackage.wad
    public void setStackFromEnd(boolean z) {
        this.a.Y = z;
    }
}
