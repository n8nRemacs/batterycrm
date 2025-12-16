package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j7h extends dtf implements sm6 {
    public Object X;
    public AbstractList Y;
    public o98 Z;
    public Object o;
    public n9a s0;
    public int t0;
    public final /* synthetic */ k7h u0;
    public final /* synthetic */ ArrayList v0;
    public final /* synthetic */ ArrayList w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7h(k7h k7hVar, ArrayList arrayList, ArrayList arrayList2, Continuation continuation) {
        super(2, continuation);
        this.u0 = k7hVar;
        this.v0 = arrayList;
        this.w0 = arrayList2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((j7h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new j7h(this.u0, this.v0, this.w0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        if (r1.e(null, r11) == r7) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.AbstractList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [j9a] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) {
        /*
            r11 = this;
            k7h r0 = r11.u0
            n9a r1 = r0.f
            int r2 = r11.t0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            g84 r7 = defpackage.g84.a
            if (r2 == 0) goto L44
            if (r2 == r5) goto L32
            if (r2 == r4) goto L2e
            if (r2 != r3) goto L26
            java.util.AbstractList r0 = r11.Y
            java.lang.Object r1 = r11.X
            k7h r1 = (defpackage.k7h) r1
            java.lang.Object r2 = r11.o
            j9a r2 = (defpackage.j9a) r2
            defpackage.g8j.b(r12)
            r12 = r0
            r0 = r1
            r1 = r2
            goto La4
        L26:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2e:
            defpackage.g8j.b(r12)
            goto L8b
        L32:
            n9a r2 = r11.s0
            o98 r5 = r11.Z
            java.util.AbstractList r8 = r11.Y
            java.lang.Object r9 = r11.X
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r11.o
            k7h r10 = (defpackage.k7h) r10
            defpackage.g8j.b(r12)
            goto L64
        L44:
            defpackage.g8j.b(r12)
            o98 r12 = defpackage.ve3.d()
            r11.o = r0
            java.util.ArrayList r9 = r11.v0
            r11.X = r9
            r11.Y = r12
            r11.Z = r12
            r11.s0 = r1
            r11.t0 = r5
            java.lang.Object r2 = r1.e(r6, r11)
            if (r2 != r7) goto L60
            goto La3
        L60:
            r5 = r12
            r8 = r5
            r10 = r0
            r2 = r1
        L64:
            android.net.Uri r12 = r10.h     // Catch: java.lang.Throwable -> L6c
            if (r12 == 0) goto L6e
            r5.add(r12)     // Catch: java.lang.Throwable -> L6c
            goto L6e
        L6c:
            r12 = move-exception
            goto Lb9
        L6e:
            r5.addAll(r9)     // Catch: java.lang.Throwable -> L6c
            r2.g(r6)
            o98 r12 = defpackage.ve3.a(r8)
            r11.o = r6
            r11.X = r6
            r11.Y = r6
            r11.Z = r6
            r11.s0 = r6
            r11.t0 = r4
            java.lang.Object r12 = defpackage.k7h.b(r0, r12, r11)
            if (r12 != r7) goto L8b
            goto La3
        L8b:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lb6
            r11.o = r1
            r11.X = r0
            java.util.ArrayList r12 = r11.w0
            r11.Y = r12
            r11.t0 = r3
            java.lang.Object r2 = r1.e(r6, r11)
            if (r2 != r7) goto La4
        La3:
            return r7
        La4:
            js r0 = r0.g     // Catch: java.lang.Throwable -> Laf
            r0.removeAll(r12)     // Catch: java.lang.Throwable -> Laf
            n9a r1 = (defpackage.n9a) r1
            r1.g(r6)
            goto Lb6
        Laf:
            r12 = move-exception
            n9a r1 = (defpackage.n9a) r1
            r1.g(r6)
            throw r12
        Lb6:
            qqg r12 = defpackage.qqg.a
            return r12
        Lb9:
            r2.g(r6)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j7h.n(java.lang.Object):java.lang.Object");
    }
}
