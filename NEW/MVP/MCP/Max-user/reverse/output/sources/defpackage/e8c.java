package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e8c extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ f8c Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8c(f8c f8cVar, Continuation continuation) {
        super(2, continuation);
        this.Y = f8cVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((e8c) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        e8c e8cVar = new e8c(this.Y, continuation);
        e8cVar.X = obj;
        return e8cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009d -> B:28:0x00a0). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            g84 r0 = defpackage.g84.a
            int r1 = r9.o
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L12
            java.lang.Object r1 = r9.X
            f84 r1 = (defpackage.f84) r1
            defpackage.g8j.b(r10)
            goto La0
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            defpackage.g8j.b(r10)
            java.lang.Object r10 = r9.X
            f84 r10 = (defpackage.f84) r10
            r1 = r10
        L22:
            boolean r10 = defpackage.d7j.f(r1)
            if (r10 == 0) goto Lef
            java.util.TimeZone r10 = java.util.TimeZone.getDefault()
            java.util.Calendar r10 = java.util.Calendar.getInstance(r10)
            r3 = 13
            int r10 = r10.get(r3)
            int r3 = defpackage.s65.d
            y65 r3 = defpackage.y65.MINUTES
            long r4 = defpackage.v9j.h(r2, r3)
            y65 r6 = defpackage.y65.SECONDS
            long r6 = defpackage.v9j.h(r10, r6)
            long r4 = defpackage.s65.k(r4, r6)
            s65 r10 = new s65
            r10.<init>(r4)
            s65 r4 = new s65
            r5 = 0
            r4.<init>(r5)
            long r5 = defpackage.v9j.h(r2, r3)
            s65 r3 = new s65
            r3.<init>(r5)
            int r5 = r4.compareTo(r3)
            if (r5 > 0) goto Lce
            int r5 = r10.compareTo(r4)
            if (r5 >= 0) goto L6b
            r10 = r4
            goto L72
        L6b:
            int r4 = r10.compareTo(r3)
            if (r4 <= 0) goto L72
            r10 = r3
        L72:
            long r3 = r10.a
            java.lang.Class<f8c> r10 = defpackage.f8c.class
            java.lang.String r10 = r10.getName()
            l6b r5 = defpackage.wqi.a
            if (r5 != 0) goto L7f
            goto L95
        L7f:
            lg8 r6 = defpackage.lg8.d
            boolean r7 = r5.b(r6)
            if (r7 == 0) goto L95
            java.lang.String r7 = defpackage.s65.n(r3)
            java.lang.String r8 = "delay = "
            java.lang.String r7 = r8.concat(r7)
            r8 = 0
            r5.c(r6, r10, r7, r8)
        L95:
            r9.X = r1
            r9.o = r2
            java.lang.Object r10 = defpackage.s8j.d(r3, r9)
            if (r10 != r0) goto La0
            return r0
        La0:
            f8c r10 = r9.Y
            java.util.concurrent.ConcurrentHashMap r10 = r10.d
            java.util.Collection r10 = r10.values()
            java.util.Iterator r10 = r10.iterator()
        Lac:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L22
            java.lang.Object r3 = r10.next()
            f9a r3 = (defpackage.f9a) r3
            java.lang.Object r4 = r3.getValue()
            b8c r4 = (defpackage.b8c) r4
            if (r4 != 0) goto Lc1
            goto Lac
        Lc1:
            b8c r5 = new b8c
            int r6 = r4.a
            int r4 = r4.b
            r5.<init>(r6, r4)
            r3.setValue(r5)
            goto Lac
        Lce:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " is less than minimum "
            r0.append(r1)
            r0.append(r4)
            r1 = 46
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        Lef:
            qqg r10 = defpackage.qqg.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e8c.n(java.lang.Object):java.lang.Object");
    }
}
