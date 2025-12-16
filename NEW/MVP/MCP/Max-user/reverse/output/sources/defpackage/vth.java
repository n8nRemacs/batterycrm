package defpackage;

import android.content.res.Resources;
import kotlin.coroutines.Continuation;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final class vth extends dtf implements sm6 {
    public final /* synthetic */ WebAppRootScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vth(Continuation continuation, WebAppRootScreen webAppRootScreen) {
        super(2, continuation);
        this.X = webAppRootScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
        vth vthVar = (vth) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vthVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vth vthVar = new vth(continuation, this.X);
        vthVar.o = obj;
        return vthVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0295  */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v100, types: [c54] */
    /* JADX WARN: Type inference failed for: r2v106 */
    /* JADX WARN: Type inference failed for: r2v107 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56, types: [c54] */
    /* JADX WARN: Type inference failed for: r2v99 */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r24) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vth.n(java.lang.Object):java.lang.Object");
    }
}
