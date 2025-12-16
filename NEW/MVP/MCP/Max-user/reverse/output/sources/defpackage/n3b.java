package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class n3b extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ o3b Z;
    public m3b o;
    public final /* synthetic */ String s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3b(o3b o3bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = o3bVar;
        this.s0 = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((n3b) l((sac) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        n3b n3bVar = new n3b(this.Z, this.s0, continuation);
        n3bVar.Y = obj;
        return n3bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        if (defpackage.e6j.a(r3, r11, r10) == r5) goto L25;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.X
            java.lang.String r1 = r10.s0
            r2 = 2
            r3 = 1
            o3b r4 = r10.Z
            g84 r5 = defpackage.g84.a
            if (r0 == 0) goto L27
            if (r0 == r3) goto L1d
            if (r0 != r2) goto L15
            defpackage.g8j.b(r11)
            goto La6
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            m3b r0 = r10.o
            java.lang.Object r3 = r10.Y
            sac r3 = (defpackage.sac) r3
            defpackage.g8j.b(r11)
            goto L51
        L27:
            defpackage.g8j.b(r11)
            java.lang.Object r11 = r10.Y
            sac r11 = (defpackage.sac) r11
            m3b r0 = new m3b
            r0.<init>(r1, r11)
            int r6 = defpackage.o3b.f
            j25 r6 = r4.a()
            r6.getClass()
            java.util.concurrent.CopyOnWriteArraySet r6 = r6.e
            r6.add(r0)
            long r6 = defpackage.o3b.e
            r10.Y = r11
            r10.o = r0
            r10.X = r3
            java.lang.Object r3 = defpackage.s8j.d(r6, r10)
            if (r3 != r5) goto L50
            goto La5
        L50:
            r3 = r11
        L51:
            int r11 = defpackage.o3b.f
            j25 r11 = r4.a()
            java.util.List r11 = r11.l
            java.util.Iterator r11 = r11.iterator()
        L5d:
            boolean r6 = r11.hasNext()
            r7 = 0
            if (r6 == 0) goto L76
            java.lang.Object r6 = r11.next()
            r8 = r6
            xz4 r8 = (defpackage.xz4) r8
            r25 r8 = r8.a
            java.lang.String r8 = r8.a
            boolean r8 = defpackage.fni.a(r8, r1)
            if (r8 == 0) goto L5d
            goto L77
        L76:
            r6 = r7
        L77:
            if (r6 != 0) goto L93
            r11 = r3
            pac r11 = (defpackage.pac) r11
            r11.getClass()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            long r8 = defpackage.o3b.e
            java.lang.String r6 = defpackage.s65.n(r8)
            java.lang.String r8 = "download not started after "
            java.lang.String r6 = r8.concat(r6)
            r1.<init>(r6)
            r11.D(r1)
        L93:
            l3b r11 = new l3b
            r1 = 0
            r11.<init>(r4, r1, r0)
            r10.Y = r7
            r10.o = r7
            r10.X = r2
            java.lang.Object r11 = defpackage.e6j.a(r3, r11, r10)
            if (r11 != r5) goto La6
        La5:
            return r5
        La6:
            qqg r11 = defpackage.qqg.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n3b.n(java.lang.Object):java.lang.Object");
    }
}
