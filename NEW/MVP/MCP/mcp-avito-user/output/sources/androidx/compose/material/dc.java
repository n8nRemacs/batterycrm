package androidx.compose.material;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.y;
import androidx.compose.ui.v;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: Text.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class dc {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22143q0 f33534a = new C22143q0(a.f33535l, C22126m3.o());

    /* compiled from: Text.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/text/x0;", "invoke", "()Landroidx/compose/ui/text/x0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<androidx.compose.ui.text.x0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f33535l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final androidx.compose.ui.text.x0 invoke() {
            return xc.f34412a;
        }
    }

    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.x0 f33536l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f33537m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f33538n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(androidx.compose.ui.text.x0 x0Var, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar, int i12) {
            super(2);
            this.f33536l = x0Var;
            this.f33537m = pVar;
            this.f33538n = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f33538n | 1);
            dc.a(this.f33536l, this.f33537m, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.k androidx.compose.ui.text.x0 x0Var, @Y61.k Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1772272796);
        if ((i12 & 6) == 0) {
            i13 = (bE2.B(x0Var) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.u(pVar) ? 32 : 16;
        }
        if (bE2.p(i13 & 1, (i13 & 19) != 18)) {
            C22143q0 c22143q0 = f33534a;
            androidx.compose.runtime.S.a(c22143q0.b(((androidx.compose.ui.text.x0) bE2.o(c22143q0)).g(x0Var)), pVar, bE2, (i13 & 112) | 8);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(x0Var, pVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0112  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k java.lang.String r35, @Y61.l androidx.compose.ui.v.a r36, long r37, long r39, long r41, long r43, int r45, boolean r46, int r47, int r48, @Y61.l Y41.l r49, @Y61.l androidx.compose.ui.text.x0 r50, @Y61.l androidx.compose.runtime.A r51, int r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.dc.b(java.lang.String, androidx.compose.ui.v$a, long, long, long, long, int, boolean, int, int, Y41.l, androidx.compose.ui.text.x0, androidx.compose.runtime.A, int, int, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    @InterfaceC42830m
    public static final void c(v.a aVar, long j12, long j13, long j14, long j15, int i12, boolean z12, int i13, Y41.l lVar, androidx.compose.ui.text.x0 x0Var, androidx.compose.runtime.A a12, int i14) {
        v.a aVar2;
        long j16;
        long j17;
        long j18;
        long j19;
        int i15;
        boolean z13;
        int i16;
        Y41.l lVar2;
        androidx.compose.ui.text.x0 x0Var2;
        v.a aVar3;
        long j22;
        boolean z14;
        int i17;
        long j23;
        long j24;
        long j25;
        Y41.l lVar3;
        androidx.compose.ui.text.x0 x0Var3;
        int i18;
        androidx.compose.runtime.B bE2 = a12.E(-366126944);
        int i19 = i14 | 920350128;
        if (bE2.p(i19 & 1, (306783379 & i19) != 306783378)) {
            bE2.y0();
            if ((i14 & 1) == 0 || bE2.g0()) {
                v.a aVar4 = androidx.compose.ui.v.f42878y1;
                androidx.compose.ui.graphics.T.f39320b.getClass();
                long j26 = androidx.compose.ui.graphics.T.f39330l;
                y.a aVar5 = androidx.compose.ui.unit.y.f42874b;
                aVar5.getClass();
                long j27 = androidx.compose.ui.unit.y.f42876d;
                aVar5.getClass();
                aVar5.getClass();
                androidx.compose.ui.text.style.s.f42720b.getClass();
                aVar3 = aVar4;
                j22 = j26;
                z14 = true;
                i17 = androidx.compose.ui.text.style.s.f42721c;
                j23 = j27;
                j24 = j23;
                j25 = j24;
                lVar3 = gc.f33606l;
                x0Var3 = (androidx.compose.ui.text.x0) bE2.o(f33534a);
                i18 = Integer.MAX_VALUE;
            } else {
                bE2.f();
                aVar3 = aVar;
                j22 = j12;
                j23 = j13;
                j24 = j14;
                j25 = j15;
                i17 = i12;
                z14 = z12;
                i18 = i13;
                lVar3 = lVar;
                x0Var3 = x0Var;
            }
            bE2.Y();
            b("Next", aVar3, j22, j23, j24, j25, i17, z14, i18, 1, lVar3, x0Var3, bE2, 920350134, 224694, 0);
            aVar2 = aVar3;
            j16 = j22;
            j17 = j23;
            j18 = j24;
            j19 = j25;
            i15 = i17;
            z13 = z14;
            i16 = i18;
            lVar2 = lVar3;
            x0Var2 = x0Var3;
        } else {
            bE2.f();
            aVar2 = aVar;
            j16 = j12;
            j17 = j13;
            j18 = j14;
            j19 = j15;
            i15 = i12;
            z13 = z12;
            i16 = i13;
            lVar2 = lVar;
            x0Var2 = x0Var;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new hc(aVar2, j16, j17, j18, j19, i15, z13, i16, lVar2, x0Var2, i14);
        }
    }
}
