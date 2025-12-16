package androidx.compose.material;

import androidx.compose.ui.layout.C22350b;
import androidx.compose.ui.layout.C22387u;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Snackbar.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.x9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21408x9 implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C21408x9 f34409a = new C21408x9();

    /* compiled from: Snackbar.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.x9$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList<androidx.compose.ui.layout.K0> f34410l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f34411m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, ArrayList arrayList) {
            super(1);
            this.f34410l = arrayList;
            this.f34411m = i12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            ArrayList<androidx.compose.ui.layout.K0> arrayList = this.f34410l;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                androidx.compose.ui.layout.K0 k02 = arrayList.get(i12);
                aVar2.h(k02, 0, (this.f34411m - k02.f40346c) / 2, 0.0f);
            }
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final InterfaceC22367j0 b(InterfaceC22369k0 interfaceC22369k0, List<? extends InterfaceC22363h0> list, long j12) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        boolean z12 = false;
        int iD02 = Integer.MIN_VALUE;
        int iD03 = Integer.MIN_VALUE;
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            androidx.compose.ui.layout.K0 k0I = list.get(i12).I(j12);
            arrayList.add(k0I);
            C22387u c22387u = C22350b.f40439a;
            if (k0I.d0(c22387u) != Integer.MIN_VALUE && (iD02 == Integer.MIN_VALUE || k0I.d0(c22387u) < iD02)) {
                iD02 = k0I.d0(c22387u);
            }
            C22387u c22387u2 = C22350b.f40440b;
            if (k0I.d0(c22387u2) != Integer.MIN_VALUE && (iD03 == Integer.MIN_VALUE || k0I.d0(c22387u2) > iD03)) {
                iD03 = k0I.d0(c22387u2);
            }
            iMax = Math.max(iMax, k0I.f40346c);
        }
        if (iD02 != Integer.MIN_VALUE && iD03 != Integer.MIN_VALUE) {
            z12 = true;
        }
        int iMax2 = Math.max(interfaceC22369k0.y0((iD02 == iD03 || !z12) ? C21434z9.f34449h : C21434z9.f34450i), iMax);
        return interfaceC22369k0.L0(C22712b.j(j12), iMax2, kotlin.collections.P0.c(), new a(iMax2, arrayList));
    }
}
