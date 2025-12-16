package defpackage;

import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class leb implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ meb b;

    public /* synthetic */ leb(meb mebVar, int i) {
        this.a = i;
        this.b = mebVar;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, k18] */
    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) obj;
                meb mebVar = this.b;
                marginLayoutParams.setMarginEnd(kti.d(((dqi.r(mebVar.b) || dqi.r(mebVar.o) || dqi.r(mebVar.d)) ? 4 : 0) * vw4.d().getDisplayMetrics().density));
                break;
            default:
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) obj;
                meb mebVar2 = this.b;
                marginLayoutParams2.setMarginEnd(kti.d(((dqi.r(mebVar2.o) || dqi.r(mebVar2.d)) ? 4 : 0) * vw4.d().getDisplayMetrics().density));
                break;
        }
        return qqg.a;
    }
}
