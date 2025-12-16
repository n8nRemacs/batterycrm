package androidx.compose.material3;

import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: Slider.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.uf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21910uf implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C21589gd f37426a;

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.uf$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f37427l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f37428m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f37429n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f37430o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f37431p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f37432q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f37433r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f37434s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f37435t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, int i13, int i14, int i15, int i16, int i17, androidx.compose.ui.layout.K0 k02, androidx.compose.ui.layout.K0 k03, androidx.compose.ui.layout.K0 k04) {
            super(1);
            this.f37427l = k02;
            this.f37428m = i12;
            this.f37429n = i13;
            this.f37430o = k03;
            this.f37431p = i14;
            this.f37432q = i15;
            this.f37433r = k04;
            this.f37434s = i16;
            this.f37435t = i17;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            aVar2.h(this.f37427l, this.f37428m, this.f37429n, 0.0f);
            aVar2.h(this.f37430o, this.f37431p, this.f37432q, 0.0f);
            aVar2.h(this.f37433r, this.f37434s, this.f37435t, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    public C21910uf(C21589gd c21589gd) {
        this.f37426a = c21589gd;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC22363h0 interfaceC22363h0 = list.get(i12);
            if (androidx.compose.ui.layout.C.a(interfaceC22363h0) == EnumC21497cd.f36158c) {
                androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(j12);
                int size2 = list.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    InterfaceC22363h0 interfaceC22363h02 = list.get(i13);
                    if (androidx.compose.ui.layout.C.a(interfaceC22363h02) == EnumC21497cd.f36157b) {
                        androidx.compose.ui.layout.K0 k0I2 = interfaceC22363h02.I(j12);
                        int size3 = list.size();
                        for (int i14 = 0; i14 < size3; i14++) {
                            InterfaceC22363h0 interfaceC22363h03 = list.get(i14);
                            if (androidx.compose.ui.layout.C.a(interfaceC22363h03) == EnumC21497cd.f36159d) {
                                androidx.compose.ui.layout.K0 k0I3 = interfaceC22363h03.I(C22712b.c(C22713c.j((-(k0I.f40345b + k0I2.f40345b)) / 2, 0, j12, 2), 0, 0, 0, 0, 11));
                                int i15 = ((k0I.f40345b + k0I2.f40345b) / 2) + k0I3.f40345b;
                                int iMax = Math.max(k0I3.f40346c, Math.max(k0I.f40346c, k0I2.f40346c));
                                float f12 = k0I.f40345b;
                                C21589gd c21589gd = this.f37426a;
                                InterfaceC22192v1 interfaceC22192v1 = c21589gd.f36434g;
                                ((C22040c3) interfaceC22192v1).S6(f12);
                                float f13 = k0I2.f40345b;
                                InterfaceC22192v1 interfaceC22192v12 = c21589gd.f36435h;
                                ((C22040c3) interfaceC22192v12).S6(f13);
                                ((C22061e3) c21589gd.f36436i).L3(i15);
                                float f14 = 2;
                                float fMax = Math.max(((C22061e3) r4).e() - (((C22040c3) interfaceC22192v12).f() / f14), 0.0f);
                                float fMin = Math.min(((C22040c3) interfaceC22192v1).f() / f14, fMax);
                                C22040c3 c22040c3 = (C22040c3) c21589gd.f36442o;
                                float f15 = c22040c3.f();
                                InterfaceC22192v1 interfaceC22192v13 = c21589gd.f36441n;
                                if (f15 != fMin || ((C22040c3) interfaceC22192v13).f() != fMax) {
                                    c22040c3.S6(fMin);
                                    C22040c3 c22040c32 = (C22040c3) interfaceC22192v13;
                                    c22040c32.S6(fMax);
                                    ((C22040c3) c21589gd.f36437j).S6(c21589gd.h(c22040c3.f(), c22040c32.f(), c21589gd.b()));
                                    ((C22040c3) c21589gd.f36438k).S6(c21589gd.h(c22040c3.f(), c22040c32.f(), c21589gd.a()));
                                }
                                return interfaceC22369k0.L0(i15, iMax, kotlin.collections.P0.c(), new a(k0I.f40345b / 2, (iMax - k0I3.f40346c) / 2, kotlin.math.b.b(c21589gd.d() * k0I3.f40345b), (iMax - k0I.f40346c) / 2, kotlin.math.b.b((c21589gd.c() * k0I3.f40345b) + ((k0I.f40345b - k0I2.f40345b) / 2)), (iMax - k0I2.f40346c) / 2, k0I3, k0I, k0I2));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
