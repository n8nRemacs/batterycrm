package defpackage;

import android.content.Context;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes2.dex */
public class x4g extends ViewGroup implements vde, jf4, y4g, b37, ii9, wad, zk9, nkb, qde, z78 {
    public static final /* synthetic */ yy7[] A0;
    public final u9d a;
    public final uk9 b;
    public final okb c;
    public final ode d;
    public final w4g o;
    public final wde s0;
    public final rm9 t0;
    public final if4 u0;
    public final int v0;
    public final int w0;
    public final int x0;
    public final int y0;
    public ab3 z0;

    static {
        z8a z8aVar = new z8a(x4g.class, "isChannelMode", "isChannelMode$message_list_release()Z");
        vid.a.getClass();
        A0 = new yy7[]{z8aVar};
    }

    public x4g(Context context) {
        u9d u9dVar = new u9d();
        uk9 uk9Var = new uk9();
        okb okbVar = new okb();
        ode odeVar = new ode();
        super(context);
        this.a = u9dVar;
        this.b = uk9Var;
        this.c = okbVar;
        this.d = odeVar;
        this.o = new w4g(this);
        this.s0 = new wde(this);
        rm9 rm9Var = new rm9(context);
        rm9Var.setId(j7b.N);
        this.t0 = rm9Var;
        if4 if4Var = new if4(context);
        this.u0 = if4Var;
        this.v0 = kti.d(8 * vw4.d().getDisplayMetrics().density);
        this.w0 = kti.d(10 * vw4.d().getDisplayMetrics().density);
        float f = 4;
        this.x0 = kti.d(vw4.d().getDisplayMetrics().density * f);
        this.y0 = kti.d(f * vw4.d().getDisplayMetrics().density);
        u9dVar.b = this;
        uk9Var.b = this;
        odeVar.b = this;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        addView(rm9Var, new ViewGroup.LayoutParams(-2, -2));
        addView(if4Var, new ViewGroup.LayoutParams(-2, -2));
        kk4 kk4Var = qh9.s;
        yeb yebVarY = a93.s0.y(this);
        kk4Var.getClass();
        setBackground(kk4.o(yebVarY));
        setWillNotDraw(false);
        final int i = 0;
        rm9Var.setSingleClickAction(new Runnable(this) { // from class: v4g
            public final /* synthetic */ x4g b;

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
        final int i2 = 1;
        rm9Var.setTryToSingleClickAction(new Runnable(this) { // from class: v4g
            public final /* synthetic */ x4g b;

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
        rm9Var.setOnLongClickListener(new bn0(7, this));
        rm9Var.setLinkLongClickListener(new co2(10, this));
    }

    @Override // defpackage.zk9
    public final void d(yt0 yt0Var) {
        this.b.d(yt0Var);
    }

    @Override // defpackage.b37
    public final void f(List list, sm6 sm6Var) {
        CharSequence text = getText();
        if (text == null) {
            return;
        }
        rm9 rm9Var = this.t0;
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

    public final int getContentHorizontalPadding$message_list_release() {
        return this.w0;
    }

    public final int getContentTopPadding$message_list_release() {
        return this.v0;
    }

    public final if4 getDate$message_list_release() {
        return this.u0;
    }

    public boolean getDependOnOutsideView() {
        return this.c.a;
    }

    public final uk9 getMessageLinkDelegate() {
        return this.b;
    }

    public final rm9 getMessageTextView$message_list_release() {
        return this.t0;
    }

    public ab3 getOnLinkLongClickListener() {
        return this.z0;
    }

    public final u9d getReactionsDelegate() {
        return this.a;
    }

    public final ode getSenderAliasDelegate() {
        return this.d;
    }

    public final int getSenderBottomMargin$message_list_release() {
        return this.x0;
    }

    public final wde getSenderNameViewStub$message_list_release() {
        return this.s0;
    }

    public final int getStatusBottomMargin$message_list_release() {
        return this.y0;
    }

    public final CharSequence getText() {
        return this.t0.getText();
    }

    public void h(CharSequence charSequence, boolean z) {
        this.u0.c(charSequence, z);
    }

    public boolean i(MotionEvent motionEvent) {
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

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, k18] */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iJ;
        wde wdeVar = this.s0;
        boolean zR = dqi.r(wdeVar.b);
        int i5 = this.w0;
        int i6 = this.v0;
        if (zR) {
            wdeVar.c(i5, i6);
            iJ = utb.j(4, vw4.d().getDisplayMetrics().density, wdeVar.a(), i6);
        } else {
            iJ = i6;
        }
        ode odeVar = this.d;
        if (dqi.r(odeVar.c) && dqi.r(wdeVar.b)) {
            odeVar.W((getMeasuredWidth() - i5) - odeVar.N(), ((wdeVar.a() / 2) - (odeVar.M() / 2)) + i6);
        }
        uk9 uk9Var = this.b;
        if (dqi.r(uk9Var.c)) {
            uk9Var.W(i5, iJ);
            iJ = utb.j(4, vw4.d().getDisplayMetrics().density, uk9Var.M(), iJ);
        }
        rm9 rm9Var = this.t0;
        cri.c(rm9Var, i5, iJ, 0, 12);
        int measuredHeight = rm9Var.getMeasuredHeight() + iJ;
        u9d u9dVar = this.a;
        if (dqi.r(u9dVar.c)) {
            u9dVar.W(i5, kti.d(8 * vw4.d().getDisplayMetrics().density) + measuredHeight);
            u9dVar.M();
        }
        int measuredWidth = getMeasuredWidth();
        if4 if4Var = this.u0;
        cri.c(if4Var, (measuredWidth - if4Var.getMeasuredWidth()) - i5, u45.q(4, vw4.d().getDisplayMetrics().density, getMeasuredHeight() - if4Var.getMeasuredHeight()), 0, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0139  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, k18] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x4g.onMeasure(int, int):void");
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

    public final void setChannelMode$message_list_release(boolean z) {
        this.o.O(this, A0[0], Boolean.valueOf(z));
    }

    @Override // defpackage.wad
    public void setChipObserver(y8d y8dVar) {
        this.a.setChipObserver(y8dVar);
    }

    @Override // defpackage.jf4
    public void setCountView(CharSequence charSequence) {
        this.u0.setCountView$message_list_release(charSequence);
    }

    public void setDateViewStatus(ghh ghhVar) {
        this.u0.setStatus$message_list_release(ghhVar);
    }

    @Override // defpackage.nkb
    public void setDependOnOutsideView(boolean z) {
        this.c.a = z;
    }

    @Override // defpackage.zk9
    public void setForwardClickListener(sm6 sm6Var) {
        this.b.o = sm6Var;
    }

    public void setIsChannelMode(boolean z) {
        setChannelMode$message_list_release(z);
        this.u0.setChannelMode$message_list_release(z);
    }

    @Override // defpackage.wad
    public void setIsIncoming(boolean z) {
        this.a.d = z;
    }

    @Override // defpackage.zk9
    public void setLink(tk9 tk9Var) {
        this.b.setLink(tk9Var);
    }

    public final void setMaxHeightForClip(int i) {
        this.t0.setMaxHeightForClip(i);
    }

    @Override // defpackage.wad
    public void setOnClickListener(em6 em6Var) {
        this.a.o = em6Var;
    }

    @Override // defpackage.z78
    public void setOnLinkLongClickListener(ab3 ab3Var) {
        this.z0 = ab3Var;
    }

    @Override // defpackage.zk9
    public void setReplyClickListener(sm6 sm6Var) {
        this.b.d = sm6Var;
    }

    public void setSenderName(Layout layout) {
        this.s0.e(layout);
    }

    public void setSenderNameColor(int i) {
        this.s0.f(i);
    }

    @Override // defpackage.wad
    public void setStackFromEnd(boolean z) {
        this.a.Y = z;
    }

    public void setTextMessageColors(yt0 yt0Var) {
        this.t0.setTextColors(yt0Var);
    }

    @Override // defpackage.y4g
    public void setTextMessageLayout(pm9 pm9Var) {
        this.t0.setLayout(pm9Var);
    }

    @Override // defpackage.y4g
    public void setTextMessageLinkClickListener(e88 e88Var) {
        this.t0.setLinkListener(e88Var);
    }

    public void y(yt0 yt0Var) {
        int i = yt0Var.d.m;
        if4 if4Var = this.u0;
        if4Var.setTextColor$message_list_release(i);
        if4Var.setDateViewStatusColor(i);
    }

    public void z(th3 th3Var) {
        this.u0.setBackgroundColor(th3Var.b.g);
    }
}
