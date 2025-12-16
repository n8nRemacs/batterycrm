package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;

/* loaded from: classes.dex */
public final class ou7 extends dpd implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ su7 Y;
    public LockFreeLinkedListHead c;
    public z73 d;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou7(su7 su7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = su7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ou7) l((fee) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ou7 ou7Var = new ou7(this.Y, continuation);
        ou7Var.X = obj;
        return ou7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005d -> B:25:0x0072). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.o
            r1 = 2
            r2 = 1
            g84 r3 = defpackage.g84.a
            if (r0 == 0) goto L24
            if (r0 == r2) goto L20
            if (r0 != r1) goto L18
            z73 r0 = r5.d
            kotlinx.coroutines.internal.LockFreeLinkedListHead r2 = r5.c
            java.lang.Object r4 = r5.X
            fee r4 = (defpackage.fee) r4
            defpackage.g8j.b(r6)
            goto L72
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            defpackage.g8j.b(r6)
            goto L77
        L24:
            defpackage.g8j.b(r6)
            java.lang.Object r6 = r5.X
            fee r6 = (defpackage.fee) r6
            su7 r0 = r5.Y
            java.lang.Object r0 = r0.getState$kotlinx_coroutines_core()
            boolean r4 = r0 instanceof defpackage.z73
            if (r4 == 0) goto L3f
            z73 r0 = (defpackage.z73) r0
            a83 r0 = r0.b
            r5.o = r2
            r6.b(r0, r5)
            return r3
        L3f:
            boolean r2 = r0 instanceof defpackage.jj7
            if (r2 == 0) goto L77
            jj7 r0 = (defpackage.jj7) r0
            xha r0 = r0.b()
            if (r0 == 0) goto L77
            java.lang.Object r2 = r0.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            r4 = r2
            r2 = r0
            r0 = r4
            r4 = r6
        L55:
            boolean r6 = defpackage.fni.a(r0, r2)
            if (r6 != 0) goto L77
            boolean r6 = r0 instanceof defpackage.z73
            if (r6 == 0) goto L72
            r6 = r0
            z73 r6 = (defpackage.z73) r6
            a83 r6 = r6.b
            r5.X = r4
            r5.c = r2
            z73 r0 = (defpackage.z73) r0
            r5.d = r0
            r5.o = r1
            r4.b(r6, r5)
            return r3
        L72:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            goto L55
        L77:
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou7.n(java.lang.Object):java.lang.Object");
    }
}
