package androidx.compose.material;

import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;

/* compiled from: BackdropScaffold.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class D0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f32503l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f32504m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<C22712b, C22712b> f32505n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C22096n f32506o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f32507p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(androidx.compose.ui.v vVar, C22096n c22096n, Y41.l lVar, C22096n c22096n2, int i12) {
        super(2);
        this.f32503l = vVar;
        this.f32504m = c22096n;
        this.f32505n = lVar;
        this.f32506o = c22096n2;
        this.f32507p = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.A r13, java.lang.Integer r14) {
        /*
            r12 = this;
            r0 = 1
            androidx.compose.runtime.A r13 = (androidx.compose.runtime.A) r13
            java.lang.Number r14 = (java.lang.Number) r14
            r14.intValue()
            int r14 = r12.f32507p
            r14 = r14 | r0
            int r6 = androidx.compose.runtime.C22066f2.a(r14)
            androidx.compose.runtime.internal.n r5 = r12.f32506o
            androidx.compose.runtime.internal.n r3 = r12.f32504m
            float r14 = androidx.compose.material.K0.f32812a
            r14 = -1248995194(0xffffffffb58dd886, float:-1.0568335E-6)
            androidx.compose.runtime.B r13 = r13.E(r14)
            r14 = r6 & 6
            androidx.compose.ui.v r2 = r12.f32503l
            if (r14 != 0) goto L2d
            boolean r14 = r13.B(r2)
            if (r14 == 0) goto L2a
            r14 = 4
            goto L2b
        L2a:
            r14 = 2
        L2b:
            r14 = r14 | r6
            goto L2e
        L2d:
            r14 = r6
        L2e:
            r1 = r6 & 48
            r4 = 32
            if (r1 != 0) goto L3f
            boolean r1 = r13.u(r3)
            if (r1 == 0) goto L3c
            r1 = r4
            goto L3e
        L3c:
            r1 = 16
        L3e:
            r14 = r14 | r1
        L3f:
            r1 = r6 & 384(0x180, float:5.38E-43)
            Y41.l<androidx.compose.ui.unit.b, androidx.compose.ui.unit.b> r7 = r12.f32505n
            r8 = 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L52
            boolean r1 = r13.u(r7)
            if (r1 == 0) goto L4f
            r1 = r8
            goto L51
        L4f:
            r1 = 128(0x80, float:1.8E-43)
        L51:
            r14 = r14 | r1
        L52:
            r1 = r6 & 3072(0xc00, float:4.305E-42)
            r9 = 2048(0x800, float:2.87E-42)
            if (r1 != 0) goto L63
            boolean r1 = r13.u(r5)
            if (r1 == 0) goto L60
            r1 = r9
            goto L62
        L60:
            r1 = 1024(0x400, float:1.435E-42)
        L62:
            r14 = r14 | r1
        L63:
            r1 = r14 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            r11 = 0
            if (r1 == r10) goto L6c
            r1 = r0
            goto L6d
        L6c:
            r1 = r11
        L6d:
            r10 = r14 & 1
            boolean r1 = r13.p(r10, r1)
            if (r1 == 0) goto Laa
            r1 = r14 & 112(0x70, float:1.57E-43)
            if (r1 != r4) goto L7b
            r1 = r0
            goto L7c
        L7b:
            r1 = r11
        L7c:
            r4 = r14 & 896(0x380, float:1.256E-42)
            if (r4 != r8) goto L82
            r4 = r0
            goto L83
        L82:
            r4 = r11
        L83:
            r1 = r1 | r4
            r4 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r4 != r9) goto L89
            goto L8a
        L89:
            r0 = r11
        L8a:
            r0 = r0 | r1
            java.lang.Object r1 = r13.t()
            if (r0 != 0) goto L9a
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r0) goto La2
        L9a:
            androidx.compose.material.C0 r1 = new androidx.compose.material.C0
            r1.<init>(r3, r7, r5)
            r13.H(r1)
        La2:
            Y41.p r1 = (Y41.p) r1
            r14 = r14 & 14
            androidx.compose.ui.layout.V0.a(r2, r1, r13, r14, r11)
            goto Lad
        Laa:
            r13.f()
        Lad:
            androidx.compose.runtime.c2 r13 = r13.Z()
            if (r13 == 0) goto Lbc
            androidx.compose.material.D0 r14 = new androidx.compose.material.D0
            r1 = r14
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r13.f38184d = r14
        Lbc:
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.D0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
