package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class x4f extends dpd implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ int Z;
    public Object c;
    public Iterator d;
    public int o;
    public final /* synthetic */ int s0;
    public final /* synthetic */ Iterator t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4f(int i, int i2, Iterator it, Continuation continuation) {
        super(2, continuation);
        this.Z = i;
        this.s0 = i2;
        this.t0 = it;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((x4f) l((fee) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        x4f x4fVar = new x4f(this.Z, this.s0, this.t0, continuation);
        x4fVar.Y = obj;
        return x4fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125 A[SYNTHETIC] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x4f.n(java.lang.Object):java.lang.Object");
    }
}
