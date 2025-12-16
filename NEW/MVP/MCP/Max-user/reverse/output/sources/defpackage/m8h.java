package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m8h extends dtf implements sm6 {
    public long X;
    public int Y;
    public /* synthetic */ Object Z;
    public long o;
    public final /* synthetic */ q8h s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8h(q8h q8hVar, Continuation continuation) {
        super(2, continuation);
        this.s0 = q8hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((m8h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        m8h m8hVar = new m8h(this.s0, continuation);
        m8hVar.Z = obj;
        return m8hVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:18:0x0061
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a8 -> B:7:0x0017). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    public final java.lang.Object n(java.lang.Object r14) {
        /*
            r13 = this;
            g84 r0 = defpackage.g84.a
            int r1 = r13.Y
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L30
            if (r1 == r2) goto L24
            if (r1 != r3) goto L1c
            long r4 = r13.X
            long r6 = r13.o
            java.lang.Object r1 = r13.Z
            f84 r1 = (defpackage.f84) r1
            defpackage.g8j.b(r14)
        L17:
            r11 = r6
            r6 = r4
            r4 = r11
            r14 = r1
            goto L4b
        L1c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L24:
            long r4 = r13.X
            long r6 = r13.o
            java.lang.Object r1 = r13.Z
            f84 r1 = (defpackage.f84) r1
            defpackage.g8j.b(r14)
            goto L5d
        L30:
            defpackage.g8j.b(r14)
            java.lang.Object r14 = r13.Z
            f84 r14 = (defpackage.f84) r14
            int r1 = defpackage.s65.d
            q8h r1 = r13.s0
            u8h r1 = r1.L
            long r4 = r1.a
            y65 r1 = defpackage.y65.SECONDS
            long r4 = defpackage.v9j.i(r4, r1)
            long r4 = defpackage.s65.g(r4)
            r6 = 100
        L4b:
            q8h r1 = r13.s0
            long r8 = r1.s
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 >= 0) goto Lab
            boolean r1 = defpackage.d7j.f(r14)
            if (r1 == 0) goto Lab
            r11 = r6
            r6 = r4
            r4 = r11
            r1 = r14
        L5d:
            q8h r14 = r13.s0
            boolean r14 = r14.z
            if (r14 == 0) goto L78
            boolean r14 = defpackage.d7j.f(r1)
            if (r14 == 0) goto L78
            r13.Z = r1
            r13.o = r6
            r13.X = r4
            r13.Y = r2
            java.lang.Object r14 = defpackage.s8j.c(r4, r13)
            if (r14 != r0) goto L5d
            goto Laa
        L78:
            q8h r14 = r13.s0
            long r8 = r14.s
            long r8 = r8 + r4
            r14.s = r8
            q8h r14 = r13.s0
            hfd r8 = r14.r
            if (r8 == 0) goto L9c
            long r9 = r14.s
            float r14 = (float) r9
            float r9 = (float) r6
            float r14 = r14 / r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r14 = r14 * r9
            java.lang.Object r8 = r8.b
            one.me.chatscreen.videomsg.VideoMessageWidget r8 = (one.me.chatscreen.videomsg.VideoMessageWidget) r8
            yy7[] r9 = one.me.chatscreen.videomsg.VideoMessageWidget.H0
            l5h r8 = r8.A0()
            b6h r8 = r8.s0
            defpackage.b6h.l(r8, r14)
        L9c:
            r13.Z = r1
            r13.o = r6
            r13.X = r4
            r13.Y = r3
            java.lang.Object r14 = defpackage.s8j.c(r4, r13)
            if (r14 != r0) goto L17
        Laa:
            return r0
        Lab:
            q8h r14 = r13.s0
            tfd r14 = r14.e
            if (r14 == 0) goto Lb6
            zed r14 = (defpackage.zed) r14
            r14.H()
        Lb6:
            qqg r14 = defpackage.qqg.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8h.n(java.lang.Object):java.lang.Object");
    }
}
