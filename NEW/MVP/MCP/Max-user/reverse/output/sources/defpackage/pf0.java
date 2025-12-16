package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pf0 extends dtf implements sm6 {
    public Iterator X;
    public of0 Y;
    public int Z;
    public qf0 o;
    public final /* synthetic */ qf0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf0(qf0 qf0Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = qf0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pf0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new pf0(this.s0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e3, code lost:
    
        r12 = defpackage.of0.b;
        r3 = defpackage.jui.b(r3.a, !r1.x(r7.a).l());
        r12 = (defpackage.wb8) r7.b.getValue();
        r13 = r7.a;
        r17.o = r7;
        r17.X = r4;
        r17.Y = r3;
        r17.Z = 3;
        r12 = defpackage.wb8.a(r12, r13, r3, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010c, code lost:
    
        if (r12 != r11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0060, code lost:
    
        r4 = r12;
        r12 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x010c -> B:41:0x010f). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf0.n(java.lang.Object):java.lang.Object");
    }
}
