package androidx.compose.material;

import androidx.compose.foundation.layout.InterfaceC20639x2;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: Scaffold.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/v;", "childModifier", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class L7 extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.ui.v, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C21273n6 f32875l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20639x2 f32876m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f32877n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f32878o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f32879p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f32880q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f32881r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C22096n f32882s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C22096n f32883t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C22096n f32884u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ T7 f32885v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L7(C21273n6 c21273n6, InterfaceC20639x2 interfaceC20639x2, long j12, long j13, int i12, C22096n c22096n, C22096n c22096n2, C22096n c22096n3, C22096n c22096n4, C22096n c22096n5, T7 t72) {
        super(3);
        this.f32875l = c21273n6;
        this.f32876m = interfaceC20639x2;
        this.f32877n = j12;
        this.f32878o = j13;
        this.f32879p = i12;
        this.f32880q = c22096n;
        this.f32881r = c22096n2;
        this.f32882s = c22096n3;
        this.f32883t = c22096n4;
        this.f32884u = c22096n5;
        this.f32885v = t72;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    @Override // Y41.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.ui.v r21, androidx.compose.runtime.A r22, java.lang.Integer r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            androidx.compose.ui.v r1 = (androidx.compose.ui.v) r1
            r10 = r22
            androidx.compose.runtime.A r10 = (androidx.compose.runtime.A) r10
            r2 = r23
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r2 & 6
            if (r3 != 0) goto L20
            boolean r3 = r10.B(r1)
            if (r3 == 0) goto L1e
            r3 = 4
            goto L1f
        L1e:
            r3 = 2
        L1f:
            r2 = r2 | r3
        L20:
            r3 = r2 & 19
            r4 = 18
            r5 = 1
            if (r3 == r4) goto L29
            r3 = r5
            goto L2a
        L29:
            r3 = 0
        L2a:
            r2 = r2 & r5
            boolean r2 = r10.p(r2, r3)
            if (r2 == 0) goto L8e
            androidx.compose.material.n6 r2 = r0.f32875l
            boolean r3 = r10.B(r2)
            androidx.compose.foundation.layout.x2 r4 = r0.f32876m
            boolean r5 = r10.B(r4)
            r3 = r3 | r5
            java.lang.Object r5 = r10.t()
            if (r3 != 0) goto L4d
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r5 != r3) goto L55
        L4d:
            androidx.compose.material.I7 r5 = new androidx.compose.material.I7
            r5.<init>(r2, r4)
            r10.H(r5)
        L55:
            Y41.l r5 = (Y41.l) r5
            androidx.compose.ui.v r2 = androidx.compose.foundation.layout.N2.a(r1, r5)
            androidx.compose.material.K7 r1 = new androidx.compose.material.K7
            androidx.compose.runtime.internal.n r14 = r0.f32881r
            androidx.compose.runtime.internal.n r3 = r0.f32884u
            androidx.compose.material.T7 r4 = r0.f32885v
            int r12 = r0.f32879p
            androidx.compose.runtime.internal.n r13 = r0.f32880q
            androidx.compose.runtime.internal.n r15 = r0.f32882s
            androidx.compose.material.n6 r5 = r0.f32875l
            androidx.compose.runtime.internal.n r6 = r0.f32883t
            r11 = r1
            r16 = r5
            r17 = r6
            r18 = r3
            r19 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r3 = 1772955108(0x69ad25e4, float:2.6165388E25)
            androidx.compose.runtime.internal.n r9 = androidx.compose.runtime.internal.r.c(r3, r1, r10)
            r11 = 1572864(0x180000, float:2.204052E-39)
            r12 = 50
            r3 = 0
            long r4 = r0.f32877n
            long r6 = r0.f32878o
            r8 = 0
            androidx.compose.material.M9.a(r2, r3, r4, r6, r8, r9, r10, r11, r12)
            goto L91
        L8e:
            r10.f()
        L91:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.L7.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
