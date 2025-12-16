package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a8a extends dtf implements sm6 {
    public final /* synthetic */ b8a o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8a(b8a b8aVar, Continuation continuation) {
        super(2, continuation);
        this.o = b8aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        a8a a8aVar = (a8a) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        a8aVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new a8a(this.o, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a8a.n(java.lang.Object):java.lang.Object");
    }
}
