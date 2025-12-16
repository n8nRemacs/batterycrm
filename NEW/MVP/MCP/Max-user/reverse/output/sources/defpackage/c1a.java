package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class c1a extends dtf implements sm6 {
    public Object X;
    public k1a Y;
    public int Z;
    public Object o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ Object t0;
    public final /* synthetic */ k1a u0;
    public final /* synthetic */ long v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1a(List list, k1a k1aVar, long j, Continuation continuation) {
        super(2, continuation);
        this.t0 = list;
        this.u0 = k1aVar;
        this.v0 = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((c1a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        c1a c1aVar = new c1a(this.t0, this.u0, this.v0, continuation);
        c1aVar.s0 = obj;
        return c1aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x012a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c1  */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1a.n(java.lang.Object):java.lang.Object");
    }
}
