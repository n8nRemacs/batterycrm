package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.M1;
import androidx.compose.foundation.O1;
import androidx.compose.foundation.gestures.InterfaceC20432a1;
import androidx.compose.foundation.gestures.J1;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.layout.V1;
import androidx.compose.foundation.lazy.grid.InterfaceC20662b;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.h;
import java.util.ArrayList;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: LazyGridDsl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.grid.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20672g {

    /* compiled from: LazyGridDsl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.grid.g$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20662b f29132l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f29133m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ I0 f29134n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ T1 f29135o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f29136p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C20585k.e f29137q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C20585k.m f29138r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC20432a1 f29139s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f29140t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ M1 f29141u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Y41.l<y0, kotlin.G0> f29142v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f29143w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f29144x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ int f29145y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC20662b interfaceC20662b, androidx.compose.ui.v vVar, I0 i02, T1 t12, boolean z12, C20585k.e eVar, C20585k.m mVar, InterfaceC20432a1 interfaceC20432a1, boolean z13, M1 m12, Y41.l<? super y0, kotlin.G0> lVar, int i12, int i13, int i14) {
            super(2);
            this.f29132l = interfaceC20662b;
            this.f29133m = vVar;
            this.f29134n = i02;
            this.f29135o = t12;
            this.f29136p = z12;
            this.f29137q = eVar;
            this.f29138r = mVar;
            this.f29139s = interfaceC20432a1;
            this.f29140t = z13;
            this.f29141u = m12;
            this.f29142v = lVar;
            this.f29143w = i12;
            this.f29144x = i13;
            this.f29145y = i14;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f29143w | 1);
            int iA3 = C22066f2.a(this.f29144x);
            boolean z12 = this.f29140t;
            int i12 = this.f29145y;
            C20672g.a(this.f29132l, this.f29133m, this.f29134n, this.f29135o, this.f29136p, this.f29137q, this.f29138r, this.f29139s, z12, this.f29141u, this.f29142v, a12, iA2, iA3, i12);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010e  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.foundation.lazy.grid.InterfaceC20662b r25, @Y61.l androidx.compose.ui.v r26, @Y61.l androidx.compose.foundation.lazy.grid.I0 r27, @Y61.l androidx.compose.foundation.layout.T1 r28, boolean r29, @Y61.l androidx.compose.foundation.layout.C20585k.e r30, @Y61.l androidx.compose.foundation.layout.C20585k.m r31, @Y61.l androidx.compose.foundation.gestures.InterfaceC20432a1 r32, boolean r33, @Y61.l androidx.compose.foundation.M1 r34, @Y61.k Y41.l<? super androidx.compose.foundation.lazy.grid.y0, kotlin.G0> r35, @Y61.l androidx.compose.runtime.A r36, int r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.C20672g.a(androidx.compose.foundation.lazy.grid.b, androidx.compose.ui.v, androidx.compose.foundation.lazy.grid.I0, androidx.compose.foundation.layout.T1, boolean, androidx.compose.foundation.layout.k$e, androidx.compose.foundation.layout.k$m, androidx.compose.foundation.gestures.a1, boolean, androidx.compose.foundation.M1, Y41.l, androidx.compose.runtime.A, int, int, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    @InterfaceC42830m
    public static final void b(InterfaceC20662b.C1591b c1591b, androidx.compose.ui.v vVar, I0 i02, V1 v12, C20585k.m mVar, C20585k.e eVar, androidx.compose.foundation.gestures.T t12, boolean z12, Y41.l lVar, androidx.compose.runtime.A a12, int i12) {
        V1 v13;
        androidx.compose.foundation.gestures.T t13;
        boolean z13;
        int i13;
        boolean z14;
        V1 v14;
        androidx.compose.foundation.gestures.T tA2;
        androidx.compose.runtime.B bE2 = a12.E(1485410512);
        int i14 = i12 | (bE2.B(c1591b) ? 4 : 2) | (bE2.B(vVar) ? 32 : 16) | (bE2.B(i02) ? 256 : 128) | 104885248 | (bE2.u(lVar) ? 536870912 : 268435456);
        if (bE2.p(i14 & 1, (306783379 & i14) != 306783378)) {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                V1 v1A = R1.a(0);
                J1.f27300a.getClass();
                i13 = i14 & (-29360129);
                z14 = true;
                v14 = v1A;
                tA2 = J1.a(bE2);
            } else {
                bE2.f();
                tA2 = t12;
                z14 = z12;
                i13 = i14 & (-29360129);
                v14 = v12;
            }
            bE2.Y();
            c(c1591b, vVar, i02, v14, false, mVar, eVar, tA2, z14, O1.a(bE2), lVar, bE2, i13 & 268435454, (i13 >> 27) & 14, 0);
            v13 = v14;
            t13 = tA2;
            z13 = z14;
        } else {
            bE2.f();
            v13 = v12;
            t13 = t12;
            z13 = z12;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C20678j(c1591b, vVar, i02, v13, mVar, eVar, t13, z13, lVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0113  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@Y61.k androidx.compose.foundation.lazy.grid.InterfaceC20662b r30, @Y61.l androidx.compose.ui.v r31, @Y61.l androidx.compose.foundation.lazy.grid.I0 r32, @Y61.l androidx.compose.foundation.layout.V1 r33, boolean r34, @Y61.l androidx.compose.foundation.layout.C20585k.m r35, @Y61.l androidx.compose.foundation.layout.C20585k.e r36, @Y61.l androidx.compose.foundation.gestures.T r37, boolean r38, @Y61.l androidx.compose.foundation.M1 r39, @Y61.k Y41.l r40, @Y61.l androidx.compose.runtime.A r41, int r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.C20672g.c(androidx.compose.foundation.lazy.grid.b, androidx.compose.ui.v, androidx.compose.foundation.lazy.grid.I0, androidx.compose.foundation.layout.V1, boolean, androidx.compose.foundation.layout.k$m, androidx.compose.foundation.layout.k$e, androidx.compose.foundation.gestures.T, boolean, androidx.compose.foundation.M1, Y41.l, androidx.compose.runtime.A, int, int, int):void");
    }

    public static final ArrayList d(int i12, int i13, int i14) {
        int i15 = i12 - ((i13 - 1) * i14);
        int i16 = i15 / i13;
        int i17 = i15 % i13;
        ArrayList arrayList = new ArrayList(i13);
        int i18 = 0;
        while (i18 < i13) {
            arrayList.add(Integer.valueOf((i18 < i17 ? 1 : 0) + i16));
            i18++;
        }
        return arrayList;
    }
}
