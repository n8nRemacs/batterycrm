package defpackage;

import java.nio.file.Path;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r4b extends dtf implements sm6 {
    public Path X;
    public int Y;
    public /* synthetic */ Object Z;
    public Object o;
    public final /* synthetic */ x4b s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4b(x4b x4bVar, Continuation continuation) {
        super(2, continuation);
        this.s0 = x4bVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((r4b) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        r4b r4bVar = new r4b(this.s0, continuation);
        r4bVar.Z = obj;
        return r4bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:68)|23|63|24|(5:27|28|66|33|(0))|56) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        r8 = r6;
     */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00cc: MOVE (r9 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:39:0x00cc */
    /* JADX WARN: Path cross not found for [B:21:0x0065, B:52:0x00ea], limit reached: 64 */
    /* JADX WARN: Path cross not found for [B:52:0x00ea, B:21:0x0065], limit reached: 64 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e8 -> B:21:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0103 -> B:21:0x0065). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r4b.n(java.lang.Object):java.lang.Object");
    }
}
