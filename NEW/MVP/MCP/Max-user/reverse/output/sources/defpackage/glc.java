package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class glc extends dtf implements sm6 {
    public Iterator X;
    public ghc Y;
    public int Z;
    public klc o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ klc t0;
    public final /* synthetic */ k18 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glc(klc klcVar, k18 k18Var, Continuation continuation) {
        super(2, continuation);
        this.t0 = klcVar;
        this.u0 = k18Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((glc) l((List) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        glc glcVar = new glc(this.t0, this.u0, continuation);
        glcVar.s0 = obj;
        return glcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0054 -> B:14:0x0057). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glc.n(java.lang.Object):java.lang.Object");
    }
}
