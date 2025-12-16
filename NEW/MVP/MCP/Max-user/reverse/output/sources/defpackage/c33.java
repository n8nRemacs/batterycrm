package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class c33 extends dtf implements sm6 {
    public b43 X;
    public Collection Y;
    public Iterator Z;
    public List o;
    public List s0;
    public Collection t0;
    public int u0;
    public /* synthetic */ Object v0;
    public final /* synthetic */ b43 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c33(b43 b43Var, Continuation continuation) {
        super(2, continuation);
        this.w0 = b43Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((c33) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        c33 c33Var = new c33(this.w0, continuation);
        c33Var.v0 = obj;
        return c33Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01a7, code lost:
    
        if (r1.join(r20) == r2) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d5 -> B:31:0x00db). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r21) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c33.n(java.lang.Object):java.lang.Object");
    }
}
