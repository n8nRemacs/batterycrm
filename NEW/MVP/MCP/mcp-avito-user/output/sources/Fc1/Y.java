package Fc1;

import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.graphics.InterfaceC22276o0;
import kotlin.NoWhenBranchMatchedException;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class Y {

    public static final class a extends kotlin.jvm.internal.N implements Y41.l<InterfaceC22276o0, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.snapshots.D<C13602e5> f5329l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.runtime.snapshots.D<C13602e5> d12) {
            super(1);
            this.f5329l = d12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(InterfaceC22276o0 interfaceC22276o0) {
            float f12;
            InterfaceC22276o0 interfaceC22276o02 = interfaceC22276o0;
            boolean z12 = this.f5329l.size() < 3;
            if (z12) {
                f12 = 1.0f;
            } else {
                if (z12) {
                    throw new NoWhenBranchMatchedException();
                }
                f12 = 0.6f;
            }
            interfaceC22276o02.setAlpha(f12);
            return kotlin.G0.f406611a;
        }
    }

    public static final class b extends kotlin.jvm.internal.N implements Y41.l<InterfaceC22276o0, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.snapshots.D<C13602e5> f5330l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.runtime.snapshots.D<C13602e5> d12) {
            super(1);
            this.f5330l = d12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(InterfaceC22276o0 interfaceC22276o0) {
            float f12;
            InterfaceC22276o0 interfaceC22276o02 = interfaceC22276o0;
            boolean z12 = this.f5330l.size() < 3;
            if (z12) {
                f12 = 1.0f;
            } else {
                if (z12) {
                    throw new NoWhenBranchMatchedException();
                }
                f12 = 0.6f;
            }
            interfaceC22276o02.setAlpha(f12);
            return kotlin.G0.f406611a;
        }
    }

    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C13608f2 f5331l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.snapshots.D<C13602e5> f5332m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f5333n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, C13608f2 c13608f2, androidx.compose.runtime.snapshots.D d12) {
            super(2);
            this.f5331l = c13608f2;
            this.f5332m = d12;
            this.f5333n = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f5333n | 1);
            Y.a(this.f5331l, this.f5332m, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02b2  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k Fc1.C13608f2 r31, @Y61.k androidx.compose.runtime.snapshots.D<Fc1.C13602e5> r32, @Y61.l androidx.compose.runtime.A r33, int r34) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.Y.a(Fc1.f2, androidx.compose.runtime.snapshots.D, androidx.compose.runtime.A, int):void");
    }
}
