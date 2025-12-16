package defpackage;

import kotlin.coroutines.Continuation;
import one.me.location.map.show.ShowLocationScreen;

/* loaded from: classes2.dex */
public final class dye extends dtf implements sm6 {
    public final /* synthetic */ ShowLocationScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dye(Continuation continuation, ShowLocationScreen showLocationScreen) {
        super(2, continuation);
        this.X = showLocationScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dye dyeVar = (dye) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dyeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dye dyeVar = new dye(continuation, this.X);
        dyeVar.o = obj;
        return dyeVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dye.n(java.lang.Object):java.lang.Object");
    }
}
