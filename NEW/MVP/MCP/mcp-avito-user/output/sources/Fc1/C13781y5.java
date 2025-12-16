package Fc1;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;

/* renamed from: Fc1.y5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13781y5 {

    /* renamed from: Fc1.y5$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<C13623h, kotlin.G0> f5906l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f5907m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, Y41.l lVar) {
            super(2);
            this.f5906l = lVar;
            this.f5907m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                C13577b7.a(null, androidx.compose.runtime.internal.r.b(a13, -178392705, new C13638i5(this.f5907m, this.f5906l)), a13, 48);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* renamed from: Fc1.y5$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<C13623h, kotlin.G0> f5908l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, Y41.l lVar) {
            super(2);
            this.f5908l = lVar;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            C13781y5.a(this.f5908l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k Y41.l<? super C13623h, kotlin.G0> lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1203495);
        int i13 = (bE2.u(lVar) ? 4 : 2) | i12;
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            R3.a(androidx.compose.runtime.internal.r.b(bE2, -1737710162, new a(i13, lVar)), bE2, 6);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new b(i12, lVar);
    }
}
