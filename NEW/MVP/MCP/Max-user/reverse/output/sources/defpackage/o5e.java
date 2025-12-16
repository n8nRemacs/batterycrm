package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o5e extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ p5e Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5e(String str, p5e p5eVar, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = p5eVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((o5e) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        o5e o5eVar = new o5e(this.Y, this.Z, continuation);
        o5eVar.X = obj;
        return o5eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0140 A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o5e.n(java.lang.Object):java.lang.Object");
    }
}
