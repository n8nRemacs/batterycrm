package defpackage;

import java.io.Serializable;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m6e extends dtf implements um6 {
    public Object X;
    public int Y;
    public /* synthetic */ z26 Z;
    public Object o;
    public /* synthetic */ Serializable s0;
    public final /* synthetic */ uid t0;
    public final /* synthetic */ l7e u0;
    public final /* synthetic */ int v0;
    public final /* synthetic */ String w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6e(uid uidVar, l7e l7eVar, int i, String str, Continuation continuation) {
        super(3, continuation);
        this.t0 = uidVar;
        this.u0 = l7eVar;
        this.v0 = i;
        this.w0 = str;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.v0;
        String str = this.w0;
        m6e m6eVar = new m6e(this.t0, this.u0, i, str, (Continuation) obj3);
        m6eVar.Z = (z26) obj;
        m6eVar.s0 = (imb) obj2;
        return m6eVar.n(qqg.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a0  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6e.n(java.lang.Object):java.lang.Object");
    }
}
