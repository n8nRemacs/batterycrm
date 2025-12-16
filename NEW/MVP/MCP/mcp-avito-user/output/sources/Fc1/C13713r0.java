package Fc1;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.r0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13713r0 {

    /* renamed from: Fc1.r0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C13615g0 f5774l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f5775m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C13615g0 c13615g0, int i12) {
            super(2);
            this.f5774l = c13615g0;
            this.f5775m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f5775m | 1);
            C13713r0.a(this.f5774l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    public static final void a(@Y61.k C13615g0 c13615g0, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(2055652061);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c13615g0) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            ((A3) bE2.o(P4.f5144a)).a(c13615g0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new a(c13615g0, i12);
    }
}
