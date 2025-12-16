package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qx9 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ay9 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx9(ay9 ay9Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ay9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qx9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qx9 qx9Var = new qx9(this.Y, continuation);
        qx9Var.X = obj;
        return qx9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            qqg r0 = defpackage.qqg.a
            g84 r1 = defpackage.g84.a
            int r2 = r9.o
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r3) goto L1b
            if (r2 != r4) goto L13
            defpackage.g8j.b(r10)
            return r0
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            defpackage.g8j.b(r10)     // Catch: java.lang.Throwable -> L1f
            goto L5e
        L1f:
            r10 = move-exception
            goto L61
        L21:
            defpackage.g8j.b(r10)
            java.lang.Object r10 = r9.X
            f84 r10 = (defpackage.f84) r10
            ay9 r10 = r9.Y
            mcf r10 = r10.d
            java.lang.Object r10 = r10.getValue()
            pb2 r10 = (defpackage.pb2) r10
            if (r10 != 0) goto L36
            goto Lb3
        L36:
            boolean r2 = r10.E()
            if (r2 != 0) goto L3e
            goto Lb3
        L3e:
            eh9 r2 = r10.d
            if (r2 != 0) goto L7e
            ay9 r2 = r9.Y
            int r6 = defpackage.s65.d     // Catch: java.lang.Throwable -> L1f
            y65 r6 = defpackage.y65.SECONDS     // Catch: java.lang.Throwable -> L1f
            long r6 = defpackage.v9j.h(r4, r6)     // Catch: java.lang.Throwable -> L1f
            px9 r8 = new px9     // Catch: java.lang.Throwable -> L1f
            r8.<init>(r10, r2, r5)     // Catch: java.lang.Throwable -> L1f
            r9.o = r3     // Catch: java.lang.Throwable -> L1f
            long r2 = defpackage.s8j.f(r6)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r10 = defpackage.yei.g(r2, r8, r9)     // Catch: java.lang.Throwable -> L1f
            if (r10 != r1) goto L5e
            goto Lb2
        L5e:
            eh9 r10 = (defpackage.eh9) r10     // Catch: java.lang.Throwable -> L1f
            goto L67
        L61:
            ipd r2 = new ipd
            r2.<init>(r10)
            r10 = r2
        L67:
            ay9 r2 = r9.Y
            java.lang.Throwable r3 = defpackage.kpd.a(r10)
            if (r3 == 0) goto L76
            java.lang.String r2 = r2.i
            java.lang.String r6 = "onMentionScrollButtonClicked: sync remote message fail"
            defpackage.wqi.p(r2, r6, r3)
        L76:
            boolean r2 = r10 instanceof defpackage.ipd
            if (r2 == 0) goto L7b
            r10 = r5
        L7b:
            r2 = r10
            eh9 r2 = (defpackage.eh9) r2
        L7e:
            if (r2 != 0) goto L8a
            ay9 r10 = r9.Y
            java.lang.String r10 = r10.i
            java.lang.String r1 = "onMentionScrollButtonClicked but lastMentionedMessage is null"
            defpackage.wqi.r(r10, r1)
            return r0
        L8a:
            si9 r10 = r2.a
            long r2 = r10.a
            ay9 r10 = r9.Y
            java.lang.String r10 = r10.i
            l6b r6 = defpackage.wqi.a
            if (r6 != 0) goto L97
            goto La8
        L97:
            lg8 r7 = defpackage.lg8.d
            boolean r8 = r6.b(r7)
            if (r8 == 0) goto La8
            java.lang.String r8 = "Scrolling to last mention with id="
            java.lang.String r8 = defpackage.vb9.e(r2, r8)
            r6.c(r7, r10, r8, r5)
        La8:
            ay9 r10 = r9.Y
            r9.o = r4
            java.lang.Object r10 = defpackage.ay9.a(r10, r2, r9)
            if (r10 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx9.n(java.lang.Object):java.lang.Object");
    }
}
