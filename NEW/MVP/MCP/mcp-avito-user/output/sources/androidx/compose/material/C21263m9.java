package androidx.compose.material;

import androidx.compose.ui.layout.C22350b;
import androidx.compose.ui.layout.C22387u;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: Snackbar.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.m9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21263m9 implements InterfaceC22365i0 {

    /* compiled from: Snackbar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.m9$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f33812l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f33813m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f33814n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f33815o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f33816p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02, int i12, androidx.compose.ui.layout.K0 k03, int i13, int i14) {
            super(1);
            this.f33812l = k02;
            this.f33813m = i12;
            this.f33814n = k03;
            this.f33815o = i13;
            this.f33816p = i14;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            aVar2.h(this.f33812l, 0, this.f33813m, 0.0f);
            aVar2.h(this.f33814n, this.f33815o, this.f33816p, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final InterfaceC22367j0 b(InterfaceC22369k0 interfaceC22369k0, List<? extends InterfaceC22363h0> list, long j12) {
        int iMax;
        int i12;
        int i13;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            InterfaceC22363h0 interfaceC22363h0 = list.get(i14);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h0), "action")) {
                androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(j12);
                int iJ2 = (C22712b.j(j12) - k0I.f40345b) - interfaceC22369k0.y0(C21434z9.f34447f);
                int iL2 = C22712b.l(j12);
                int i15 = iJ2 < iL2 ? iL2 : iJ2;
                int size2 = list.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    InterfaceC22363h0 interfaceC22363h02 = list.get(i16);
                    if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h02), "text")) {
                        androidx.compose.ui.layout.K0 k0I2 = interfaceC22363h02.I(C22712b.c(j12, 0, i15, 0, 0, 9));
                        C22387u c22387u = C22350b.f40439a;
                        int iD02 = k0I2.d0(c22387u);
                        int iD03 = k0I2.d0(C22350b.f40440b);
                        boolean z12 = true;
                        boolean z13 = (iD02 == Integer.MIN_VALUE || iD03 == Integer.MIN_VALUE) ? false : true;
                        if (iD02 != iD03 && z13) {
                            z12 = false;
                        }
                        int iJ3 = C22712b.j(j12) - k0I.f40345b;
                        if (z12) {
                            iMax = Math.max(interfaceC22369k0.y0(C21434z9.f34449h), k0I.f40346c);
                            int i17 = (iMax - k0I2.f40346c) / 2;
                            int iD04 = k0I.d0(c22387u);
                            i13 = iD04 != Integer.MIN_VALUE ? (iD02 + i17) - iD04 : 0;
                            i12 = i17;
                        } else {
                            int iY02 = interfaceC22369k0.y0(C21434z9.f34442a) - iD02;
                            iMax = Math.max(interfaceC22369k0.y0(C21434z9.f34450i), k0I2.f40346c + iY02);
                            i12 = iY02;
                            i13 = (iMax - k0I.f40346c) / 2;
                        }
                        return interfaceC22369k0.L0(C22712b.j(j12), iMax, kotlin.collections.P0.c(), new a(k0I2, i12, k0I, iJ3, i13));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
