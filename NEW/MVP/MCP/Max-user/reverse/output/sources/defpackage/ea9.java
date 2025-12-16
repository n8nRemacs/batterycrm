package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class ea9 extends x4g implements d19 {
    public static final /* synthetic */ yy7[] C0;
    public final nk B0;

    static {
        z8a z8aVar = new z8a(ea9.class, "model", "getModel()Lone/me/messages/list/loader/model/MediaAttachInfo;");
        vid.a.getClass();
        C0 = new yy7[]{z8aVar};
    }

    public ea9(Context context) {
        super(context);
        this.B0 = new nk(13, this);
    }

    public final boolean A() {
        ws8 model = getModel();
        return model != null && model.d();
    }

    public void a(ae3 ae3Var) {
        setModel(ae3Var);
    }

    public ws8 getModel() {
        yy7 yy7Var = C0[0];
        return (ws8) this.B0.b;
    }

    public void j(s3f s3fVar) {
        setModel(s3fVar);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r10v39, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object, k18] */
    @Override // defpackage.x4g, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM;
        int iB;
        float f = 10;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        if (dqi.r(getSenderNameViewStub$message_list_release().b)) {
            int iD2 = kti.d(8 * vw4.d().getDisplayMetrics().density);
            getSenderNameViewStub$message_list_release().c(iD, iD2);
            iM = getSenderNameViewStub$message_list_release().a() + iD2;
        } else {
            iM = 0;
        }
        if (dqi.r(getSenderAliasDelegate().c) && dqi.r(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().W((getMeasuredWidth() - iD) - getSenderAliasDelegate().N(), u45.c(8, vw4.d().getDisplayMetrics().density, (getSenderNameViewStub$message_list_release().a() / 2) - (getSenderAliasDelegate().M() / 2)));
        }
        if (dqi.r(getMessageLinkDelegate().c)) {
            int iD3 = iM + kti.d((iM == 0 ? 8 : 4) * vw4.d().getDisplayMetrics().density);
            getMessageLinkDelegate().W(iD, iD3);
            iM = iD3 + getMessageLinkDelegate().M();
        }
        if (A()) {
            float f2 = 1;
            int iD4 = kti.d(vw4.d().getDisplayMetrics().density * f2) + (iM == 0 ? 0 : u45.c(8, vw4.d().getDisplayMetrics().density, iM));
            int iC = u45.c(6, vw4.d().getDisplayMetrics().density, b(kti.d(f2 * vw4.d().getDisplayMetrics().density), iD4) + iD4);
            cri.c(getMessageTextView$message_list_release(), iD, iC, 0, 12);
            iB = u45.c(8, vw4.d().getDisplayMetrics().density, getMessageTextView$message_list_release().getMeasuredHeight() + iC);
        } else {
            int iC2 = u45.c(8, vw4.d().getDisplayMetrics().density, iM);
            cri.c(getMessageTextView$message_list_release(), iD, iC2, 0, 12);
            float f3 = 1;
            int iJ = utb.j(f3, vw4.d().getDisplayMetrics().density, kti.d(6 * vw4.d().getDisplayMetrics().density), getMessageTextView$message_list_release().getMeasuredHeight() + iC2);
            iB = iJ + b(kti.d(f3 * vw4.d().getDisplayMetrics().density), iJ);
        }
        int measuredWidth = getMeasuredWidth() - getDate$message_list_release().getMeasuredWidth();
        if (!A()) {
            f = 4;
        }
        cri.c(getDate$message_list_release(), measuredWidth - kti.d(f * vw4.d().getDisplayMetrics().density), ((A() ? getMeasuredHeight() : iB) - getDate$message_list_release().getMeasuredHeight()) - getStatusBottomMargin$message_list_release(), 0, 12);
        if (dqi.r(getReactionsDelegate().c) && A()) {
            getReactionsDelegate().W(iD, iB);
        } else if (dqi.r(getReactionsDelegate().c)) {
            getReactionsDelegate().W(getReactionsDelegate().Y ? getMeasuredWidth() - getReactionsDelegate().N() : 0, u45.c(4, vw4.d().getDisplayMetrics().density, iB));
        }
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v51, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v83, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, k18] */
    @Override // defpackage.x4g, android.view.View
    public final void onMeasure(int i, int i2) {
        int iM;
        float f = 10;
        int iD = u45.d(f, vw4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i));
        getMessageTextView$message_list_release().i();
        int size = getDependOnOutsideView() ? View.MeasureSpec.getSize(i) : Math.max(u45.c(f, vw4.d().getDisplayMetrics().density, getSuggestedMinimumWidth()), (kti.d(vw4.d().getDisplayMetrics().density * f) * 2) + getMessageTextView$message_list_release().getMeasuredWidth());
        if (dqi.r(getSenderAliasDelegate().c) && dqi.r(getSenderNameViewStub$message_list_release().b)) {
            getSenderAliasDelegate().Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            size = Math.max(size, getSenderAliasDelegate().N());
        }
        if (dqi.r(getSenderNameViewStub$message_list_release().b)) {
            getSenderNameViewStub$message_list_release().d(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            size = Math.max(size, (kti.d(vw4.d().getDisplayMetrics().density * f) * 2) + getSenderNameViewStub$message_list_release().b() + getSenderAliasDelegate().j0());
            iM = getSenderNameViewStub$message_list_release().a() + kti.d(8 * vw4.d().getDisplayMetrics().density);
        } else {
            iM = 0;
        }
        if (dqi.r(getMessageLinkDelegate().c)) {
            getMessageLinkDelegate().Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            size = Math.max(size, (kti.d(vw4.d().getDisplayMetrics().density * f) * 2) + getMessageLinkDelegate().N());
            iM += getMessageLinkDelegate().M() + kti.d((iM == 0 ? 8 : 4) * vw4.d().getDisplayMetrics().density);
        }
        int iD2 = iM + ((iM == 0 || !A()) ? 0 : kti.d(8 * vw4.d().getDisplayMetrics().density));
        getDate$message_list_release().measure(i, i2);
        if (dqi.r(getReactionsDelegate().c) && A()) {
            getReactionsDelegate().Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            size = Math.max(size, (kti.d(vw4.d().getDisplayMetrics().density * f) * 2) + getReactionsDelegate().N());
            iD2 = utb.j(f, vw4.d().getDisplayMetrics().density, getReactionsDelegate().M(), iD2);
        } else if (dqi.r(getReactionsDelegate().c)) {
            getReactionsDelegate().Y(View.MeasureSpec.makeMeasureSpec(iD, Integer.MIN_VALUE), i2);
            size = Math.max(size, getReactionsDelegate().N());
            int iC = u45.c(8, vw4.d().getDisplayMetrics().density, getReactionsDelegate().M() + kti.d(4 * vw4.d().getDisplayMetrics().density));
            iD2 += iC;
            ((qh9) getBackground()).q = iC;
        } else {
            ((qh9) getBackground()).q = 0.0f;
        }
        int iMax = Math.max(size, (kti.d(vw4.d().getDisplayMetrics().density * f) * 2) + getMessageTextView$message_list_release().getMeasuredWidth());
        float f2 = 6;
        int iJ = utb.j(8, vw4.d().getDisplayMetrics().density, getMessageTextView$message_list_release().getMeasuredHeight() + kti.d(vw4.d().getDisplayMetrics().density * f2), iD2);
        if (A()) {
            int iN = dqi.r(getReactionsDelegate().c) ? getReactionsDelegate().N() : getMessageTextView$message_list_release().e(iD);
            int measuredWidth = getDate$message_list_release().getMeasuredWidth() + kti.d(f2 * vw4.d().getDisplayMetrics().density);
            boolean z = !dqi.r(getReactionsDelegate().c) && getMessageTextView$message_list_release().h();
            yy7 yy7Var = x4g.A0[0];
            if (((Boolean) this.o.b).booleanValue() || z || iD - iN < measuredWidth) {
                iJ = u45.c(12, vw4.d().getDisplayMetrics().density, iJ);
            } else if ((iMax - (kti.d(vw4.d().getDisplayMetrics().density * f) * 2)) - iN < measuredWidth) {
                iMax += measuredWidth - ((iMax - (kti.d(f * vw4.d().getDisplayMetrics().density) * 2)) - iN);
            }
        }
        float f3 = 1;
        long jV = v(iMax, u45.d(f3, vw4.d().getDisplayMetrics().density, 2, View.MeasureSpec.getSize(i)), i, i2);
        setMeasuredDimension(Math.max(iMax, (kti.d(vw4.d().getDisplayMetrics().density * f3) * 2) + ((int) (jV >> 32))), (kti.d(f3 * vw4.d().getDisplayMetrics().density) * 2) + ((int) (jV & 4294967295L)) + iJ);
    }

    public void q(n2f n2fVar) {
        setModel(n2fVar);
    }

    public void setModel(ws8 ws8Var) {
        this.B0.O(this, C0[0], ws8Var);
    }

    @Override // defpackage.x4g
    public final void y(yt0 yt0Var) {
        int i = yt0Var.d.m;
        if (A()) {
            getDate$message_list_release().setTextColor$message_list_release(i);
            getDate$message_list_release().setDateViewStatusColor(i);
        }
    }

    @Override // defpackage.x4g
    public final void z(th3 th3Var) {
        int i = th3Var.g.a;
        if (A()) {
            return;
        }
        getDate$message_list_release().setTextColor$message_list_release(i);
        getDate$message_list_release().setDateViewStatusColor(i);
        getDate$message_list_release().setBackgroundColor(th3Var.b.f);
    }
}
