package androidx.compose.ui.layout;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;

/* compiled from: SubcomposeLayout.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f40416a = new a();

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/layout/V0$a", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public final String toString() {
            return "ReusedSlotId";
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f40417l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.p<Z0, C22712b, InterfaceC22367j0> f40418m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f40419n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f40420o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(androidx.compose.ui.v vVar, Y41.p<? super Z0, ? super C22712b, ? extends InterfaceC22367j0> pVar, int i12, int i13) {
            super(2);
            this.f40417l = vVar;
            this.f40418m = pVar;
            this.f40419n = i12;
            this.f40420o = i13;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f40419n | 1);
            Y41.p<Z0, C22712b, InterfaceC22367j0> pVar = this.f40418m;
            int i12 = this.f40420o;
            V0.a(this.f40417l, pVar, a12, iA2, i12);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.l androidx.compose.ui.v vVar, @Y61.k Y41.p<? super Z0, ? super C22712b, ? extends InterfaceC22367j0> pVar, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        int i14;
        androidx.compose.runtime.B bE2 = a12.E(-1298353104);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= bE2.u(pVar) ? 32 : 16;
        }
        if (bE2.p(i14 & 1, (i14 & 19) != 18)) {
            if (i15 != 0) {
                vVar = androidx.compose.ui.v.f42878y1;
            }
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = new Y0();
                bE2.H(objT);
            }
            b((Y0) objT, vVar, pVar, bE2, (i14 << 3) & 1008);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(vVar, pVar, i12, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.ui.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k androidx.compose.ui.layout.Y0 r8, @Y61.l androidx.compose.ui.v r9, @Y61.k Y41.p r10, @Y61.l androidx.compose.runtime.A r11, int r12) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.V0.b(androidx.compose.ui.layout.Y0, androidx.compose.ui.v, Y41.p, androidx.compose.runtime.A, int):void");
    }
}
