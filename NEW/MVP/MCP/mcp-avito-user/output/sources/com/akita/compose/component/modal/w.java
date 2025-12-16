package com.akita.compose.component.modal;

import androidx.compose.foundation.d2;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import java.util.List;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Modal.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class w implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d2 f62135a;

    /* compiled from: Modal.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K0 f62136l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ K0 f62137m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ long f62138n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ d2 f62139o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K0 k02, K0 k03, long j12, d2 d2Var) {
            super(1);
            this.f62136l = k02;
            this.f62137m = k03;
            this.f62138n = j12;
            this.f62139o = d2Var;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            aVar2.e(this.f62136l, 0, 0, 0.0f);
            K0 k02 = this.f62137m;
            if (k02 != null) {
                K0.a.m(aVar2, k02, 0, C22712b.k(this.f62138n) - k02.f40346c, new v(this.f62139o), 4);
            }
            return G0.f406611a;
        }
    }

    public w(d2 d2Var) {
        this.f62135a = d2Var;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        InterfaceC22363h0 interfaceC22363h0;
        List<? extends InterfaceC22363h0> list2 = list;
        int size = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                interfaceC22363h0 = null;
                break;
            }
            interfaceC22363h0 = list.get(i12);
            if (L.f(androidx.compose.ui.layout.C.a(interfaceC22363h0), "modalButtons")) {
                break;
            }
            i12++;
        }
        InterfaceC22363h0 interfaceC22363h02 = interfaceC22363h0;
        K0 k0I = interfaceC22363h02 != null ? interfaceC22363h02.I(C22712b.c(j12, 0, 0, 0, 0, 11)) : null;
        int size2 = list2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            InterfaceC22363h0 interfaceC22363h03 = list.get(i13);
            if (L.f(androidx.compose.ui.layout.C.a(interfaceC22363h03), "modalContent")) {
                K0 k0I2 = interfaceC22363h03.I(C22712b.c(j12, 0, 0, 0, 0, 11));
                return interfaceC22369k0.L0(C22712b.j(j12), k0I2.f40346c + (k0I != null ? k0I.f40346c : 0), P0.c(), new a(k0I2, k0I, j12, this.f62135a));
            }
        }
        E0.d.c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
