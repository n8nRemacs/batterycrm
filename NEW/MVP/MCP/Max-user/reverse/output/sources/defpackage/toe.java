package defpackage;

/* loaded from: classes2.dex */
public final class toe implements ioe {
    public final u18 X;
    public final foe Y;
    public final xne Z;
    public final long a;
    public final int b;
    public final s5g c;
    public final hoe d;
    public final s5g o;
    public final s5g s0;

    public toe(long j, int i, s5g s5gVar, hoe hoeVar, s5g s5gVar2, u18 u18Var, foe foeVar, xne xneVar, s5g s5gVar3) {
        this.a = j;
        this.b = i;
        this.c = s5gVar;
        this.d = hoeVar;
        this.o = s5gVar2;
        this.X = u18Var;
        this.Y = foeVar;
        this.Z = xneVar;
        this.s0 = s5gVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [s5g] */
    /* JADX WARN: Type inference failed for: r13v2, types: [foe] */
    public static toe l(toe toeVar, l5g l5gVar, boe boeVar, int i) {
        long j = toeVar.a;
        int i2 = toeVar.b;
        l5g l5gVar2 = l5gVar;
        if ((i & 4) != 0) {
            l5gVar2 = toeVar.c;
        }
        l5g l5gVar3 = l5gVar2;
        hoe hoeVar = toeVar.d;
        s5g s5gVar = toeVar.o;
        u18 u18Var = toeVar.X;
        boe boeVar2 = boeVar;
        if ((i & 64) != 0) {
            boeVar2 = toeVar.Y;
        }
        xne xneVar = toeVar.Z;
        s5g s5gVar2 = toeVar.s0;
        toeVar.getClass();
        return new toe(j, i2, l5gVar3, hoeVar, s5gVar, u18Var, boeVar2, xneVar, s5gVar2);
    }

    @Override // defpackage.ioe
    public final s5g a() {
        return this.o;
    }

    @Override // defpackage.ioe
    public final xne b() {
        return this.Z;
    }

    @Override // defpackage.ioe
    public final s5g c() {
        return this.s0;
    }

    @Override // defpackage.ioe
    public final foe d() {
        return this.Y;
    }

    @Override // defpackage.ioe
    public final u18 e() {
        return this.X;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toe)) {
            return false;
        }
        toe toeVar = (toe) obj;
        return this.a == toeVar.a && this.b == toeVar.b && fni.a(this.c, toeVar.c) && this.d == toeVar.d && fni.a(this.o, toeVar.o) && fni.a(this.X, toeVar.X) && fni.a(this.Y, toeVar.Y) && fni.a(this.Z, toeVar.Z) && fni.a(this.s0, toeVar.s0);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.ioe
    public final s5g getTitle() {
        return this.c;
    }

    @Override // defpackage.ioe
    public final hoe getType() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + xc0.d(xrf.k(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c)) * 31;
        s5g s5gVar = this.o;
        int iHashCode2 = (iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31;
        u18 u18Var = this.X;
        int iHashCode3 = (iHashCode2 + (u18Var == null ? 0 : u18Var.hashCode())) * 31;
        foe foeVar = this.Y;
        int iHashCode4 = (iHashCode3 + (foeVar == null ? 0 : foeVar.hashCode())) * 31;
        xne xneVar = this.Z;
        int iHashCode5 = (iHashCode4 + (xneVar == null ? 0 : xneVar.hashCode())) * 31;
        s5g s5gVar2 = this.s0;
        return iHashCode5 + (s5gVar2 != null ? s5gVar2.hashCode() : 0);
    }

    @Override // defpackage.ioe
    public final int t() {
        return this.b;
    }

    public final String toString() {
        return "SettingsItemModel(itemId=" + this.a + ", sectionId=" + this.b + ", title=" + this.c + ", type=" + this.d + ", descriptionRes=" + this.o + ", leadingElementProperties=" + this.X + ", endView=" + this.Y + ", counterType=" + this.Z + ", upperText=" + this.s0 + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ toe(long r14, int r16, defpackage.s5g r17, defpackage.hoe r18, defpackage.s5g r19, defpackage.u18 r20, defpackage.foe r21, defpackage.vne r22, defpackage.s5g r23, int r24) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 8
            if (r1 == 0) goto La
            hoe r1 = defpackage.hoe.b
            r7 = r1
            goto Lc
        La:
            r7 = r18
        Lc:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L13
            r8 = r2
            goto L15
        L13:
            r8 = r19
        L15:
            r1 = r0 & 32
            if (r1 == 0) goto L1b
            r9 = r2
            goto L1d
        L1b:
            r9 = r20
        L1d:
            r1 = r0 & 64
            if (r1 == 0) goto L23
            r10 = r2
            goto L25
        L23:
            r10 = r21
        L25:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L2b
            r11 = r2
            goto L2d
        L2b:
            r11 = r22
        L2d:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L39
            r12 = r2
            r3 = r14
            r5 = r16
            r6 = r17
            r2 = r13
            goto L41
        L39:
            r12 = r23
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
        L41:
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.toe.<init>(long, int, s5g, hoe, s5g, u18, foe, vne, s5g, int):void");
    }
}
