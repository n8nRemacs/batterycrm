package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: FlowLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/Z0;", "Landroidx/compose/foundation/layout/b2;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Z0 extends InterfaceC20548b2 {

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int[] f28561l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f28562m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f28563n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f28564o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0[] f28565p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Z0 f28566q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f28567r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ LayoutDirection f28568s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f28569t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int[] f28570u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int[] iArr, int i12, int i13, int i14, androidx.compose.ui.layout.K0[] k0Arr, Z0 z02, int i15, LayoutDirection layoutDirection, int i16, int[] iArr2) {
            super(1);
            this.f28561l = iArr;
            this.f28562m = i12;
            this.f28563n = i13;
            this.f28564o = i14;
            this.f28565p = k0Arr;
            this.f28566q = z02;
            this.f28567r = i15;
            this.f28568s = layoutDirection;
            this.f28569t = i16;
            this.f28570u = iArr2;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            int[] iArr = this.f28561l;
            int i12 = iArr != null ? iArr[this.f28562m] : 0;
            int i13 = this.f28563n;
            for (int i14 = i13; i14 < this.f28564o; i14++) {
                androidx.compose.ui.layout.K0 k02 = this.f28565p[i14];
                LayoutDirection layoutDirection = this.f28568s;
                int i15 = this.f28569t;
                Z0 z02 = this.f28566q;
                int iL2 = z02.l(this.f28567r, i15, k02, layoutDirection) + i12;
                boolean zO2 = z02.getF28628a();
                int[] iArr2 = this.f28570u;
                if (zO2) {
                    aVar2.e(k02, iArr2[i14 - i13], iL2, 0.0f);
                } else {
                    aVar2.e(k02, iL2, iArr2[i14 - i13], 0.0f);
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20548b2
    default void a(int i12, @Y61.k int[] iArr, @Y61.k int[] iArr2, @Y61.k InterfaceC22369k0 interfaceC22369k0) {
        if (getF28628a()) {
            getF28629b().b(interfaceC22369k0, i12, iArr, interfaceC22369k0.getF40449b(), iArr2);
        } else {
            getF28630c().c(interfaceC22369k0, i12, iArr, iArr2);
        }
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20548b2
    default long d(int i12, int i13, int i14, int i15, boolean z12) {
        if (getF28628a()) {
            C20568f2 c20568f2 = C20563e2.f28601a;
            if (!z12) {
                return C22713c.a(i12, i14, i13, i15);
            }
            C22712b.f42842b.getClass();
            return C22712b.a.b(i12, i14, i13, i15);
        }
        I i16 = H.f28299a;
        if (!z12) {
            return C22713c.a(i13, i15, i12, i14);
        }
        C22712b.f42842b.getClass();
        return C22712b.a.a(i13, i15, i12, i14);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20548b2
    default int g(@Y61.k androidx.compose.ui.layout.K0 k02) {
        return getF28628a() ? k02.f0() : k02.g0();
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20548b2
    @Y61.k
    default InterfaceC22367j0 i(@Y61.k androidx.compose.ui.layout.K0[] k0Arr, @Y61.k InterfaceC22369k0 interfaceC22369k0, int i12, @Y61.k int[] iArr, int i13, int i14, @Y61.l int[] iArr2, int i15, int i16, int i17) {
        int i18;
        int i19;
        if (getF28628a()) {
            i19 = i13;
            i18 = i14;
        } else {
            i18 = i13;
            i19 = i14;
        }
        return interfaceC22369k0.L0(i19, i18, kotlin.collections.P0.c(), new a(iArr2, i15, i16, i17, k0Arr, this, i14, getF28628a() ? LayoutDirection.f42838b : interfaceC22369k0.getF40449b(), i12, iArr));
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20548b2
    default int j(@Y61.k androidx.compose.ui.layout.K0 k02) {
        return getF28628a() ? k02.g0() : k02.f0();
    }

    @Y61.k
    /* renamed from: k */
    C20585k.m getF28630c();

    default int l(int i12, int i13, @Y61.k androidx.compose.ui.layout.K0 k02, @Y61.k LayoutDirection layoutDirection) {
        AbstractC20606p0 abstractC20606p0N;
        C20558d2 c20558d2B = C20543a2.b(k02);
        if (c20558d2B == null || (abstractC20606p0N = c20558d2B.f28596c) == null) {
            abstractC20606p0N = getF28632e();
        }
        return abstractC20606p0N.a(i12 - g(k02), i13, k02, layoutDirection);
    }

    @Y61.k
    /* renamed from: m */
    C20585k.e getF28629b();

    @Y61.k
    /* renamed from: n */
    AbstractC20606p0 getF28632e();

    /* renamed from: o */
    boolean getF28628a();
}
