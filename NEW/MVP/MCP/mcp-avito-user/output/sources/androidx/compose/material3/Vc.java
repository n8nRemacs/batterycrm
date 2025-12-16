package androidx.compose.material3;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import kotlin.Metadata;

/* compiled from: ProvideContentColorTextStyle.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Vc {

    /* compiled from: ProvideContentColorTextStyle.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f35674l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.x0 f35675m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35676n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f35677o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(long j12, androidx.compose.ui.text.x0 x0Var, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar, int i12) {
            super(2);
            this.f35674l = j12;
            this.f35675m = x0Var;
            this.f35676n = pVar;
            this.f35677o = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f35677o | 1);
            androidx.compose.ui.text.x0 x0Var = this.f35675m;
            Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> pVar = this.f35676n;
            Vc.a(this.f35674l, x0Var, pVar, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(long j12, @Y61.k androidx.compose.ui.text.x0 x0Var, @Y61.k Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1479790536);
        if ((i12 & 6) == 0) {
            i13 = (bE2.n(j12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(x0Var) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.u(pVar) ? 256 : 128;
        }
        if ((i13 & 147) == 146 && bE2.c()) {
            bE2.f();
        } else {
            C22143q0 c22143q0 = C21914uj.f37441a;
            androidx.compose.runtime.S.b(new androidx.compose.runtime.Y1[]{L3.f35042a.b(androidx.compose.ui.graphics.T.a(j12)), c22143q0.b(((androidx.compose.ui.text.x0) bE2.o(c22143q0)).g(x0Var))}, pVar, bE2, (i13 >> 3) & 112);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(j12, x0Var, pVar, i12);
        }
    }
}
