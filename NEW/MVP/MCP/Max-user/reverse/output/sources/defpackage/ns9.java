package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ns9 extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ vu9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns9(vu9 vu9Var, long j, String str, Continuation continuation) {
        super(2, continuation);
        this.o = vu9Var;
        this.X = j;
        this.Y = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ns9 ns9Var = (ns9) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ns9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ns9(this.o, this.X, this.Y, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns9.n(java.lang.Object):java.lang.Object");
    }
}
