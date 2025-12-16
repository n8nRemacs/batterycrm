package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class du9 extends dtf implements sm6 {
    public final /* synthetic */ Set X;
    public final /* synthetic */ vu9 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du9(Set set, vu9 vu9Var, Continuation continuation) {
        super(2, continuation);
        this.X = set;
        this.Y = vu9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((du9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new du9(this.X, this.Y, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.o
            qqg r1 = defpackage.qqg.a
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto Ld
            defpackage.g8j.b(r9)
            return r1
        Ld:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L15:
            defpackage.g8j.b(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Set r0 = r8.X
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r0.next()
            r4 = r3
            one.me.messages.list.loader.MessageModel r4 = (one.me.messages.list.loader.MessageModel) r4
            long r4 = r4.b
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L39
            goto L23
        L39:
            r9.add(r3)
            goto L23
        L3d:
            yy7[] r0 = defpackage.vu9.U1
            vu9 r0 = r8.Y
            bwf r0 = r0.O1
            java.lang.Object r0 = r0.getValue()
            dn9 r0 = (defpackage.dn9) r0
            r8.o = r2
            mcf r3 = r0.a
            java.lang.Object r3 = r3.getValue()
            pb2 r3 = (defpackage.pb2) r3
            g84 r4 = defpackage.g84.a
            if (r3 == 0) goto L98
            boolean r3 = r3.M()
            if (r3 != r2) goto L98
            pv0 r0 = r0.g
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.we3.q(r9, r3)
            r2.<init>(r3)
            java.util.Iterator r9 = r9.iterator()
        L6e:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L91
            java.lang.Object r3 = r9.next()
            one.me.messages.list.loader.MessageModel r3 = (one.me.messages.list.loader.MessageModel) r3
            long r5 = r3.b
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            long r5 = r3.a
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r5)
            imb r5 = new imb
            r5.<init>(r7, r3)
            r2.add(r5)
            goto L6e
        L91:
            java.lang.Object r9 = r0.h(r2, r8)
            if (r9 != r4) goto L98
            goto L99
        L98:
            r9 = r1
        L99:
            if (r9 != r4) goto L9c
            return r4
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.du9.n(java.lang.Object):java.lang.Object");
    }
}
