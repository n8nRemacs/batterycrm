package com.akita.compose.component.slider;

import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22061e3;
import androidx.compose.ui.layout.C;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import java.util.List;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Slider.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f62702a;

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K0 f62703l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f62704m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f62705n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ K0 f62706o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f62707p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f62708q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K0 k02, int i12, int i13, K0 k03, int i14, int i15) {
            super(1);
            this.f62703l = k02;
            this.f62704m = i12;
            this.f62705n = i13;
            this.f62706o = k03;
            this.f62707p = i14;
            this.f62708q = i15;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            aVar2.e(this.f62703l, this.f62704m, this.f62705n, 0.0f);
            aVar2.e(this.f62706o, this.f62707p, this.f62708q, 0.0f);
            return G0.f406611a;
        }
    }

    public g(q qVar) {
        this.f62702a = qVar;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        long jC2 = C22712b.c(j12, 0, 0, 0, 0, 10);
        List<? extends InterfaceC22363h0> list2 = list;
        int size = list2.size();
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC22363h0 interfaceC22363h0 = list.get(i12);
            if (C.a(interfaceC22363h0) == c.f62690b) {
                K0 k0I = interfaceC22363h0.I(jC2);
                int size2 = list2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    InterfaceC22363h0 interfaceC22363h02 = list.get(i13);
                    if (C.a(interfaceC22363h02) == c.f62691c) {
                        K0 k0I2 = interfaceC22363h02.I(C22712b.c(C22713c.j(-k0I.f40345b, 0, j12, 2), 0, 0, 0, 0, 11));
                        int i14 = k0I.f40345b + k0I2.f40345b;
                        int iMax = Math.max(k0I2.f40346c, k0I.f40346c);
                        float f12 = k0I.f40345b;
                        q qVar = this.f62702a;
                        ((C22040c3) qVar.f62745h).S6(f12);
                        ((C22061e3) qVar.f62746i).L3(i14);
                        return interfaceC22369k0.L0(i14, iMax, P0.c(), new a(k0I2, k0I.f40345b / 2, (iMax - k0I2.f40346c) / 2, k0I, kotlin.math.b.b(qVar.c() * k0I2.f40345b), (iMax - k0I.f40346c) / 2));
                    }
                }
                E0.d.c("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
        }
        E0.d.c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
