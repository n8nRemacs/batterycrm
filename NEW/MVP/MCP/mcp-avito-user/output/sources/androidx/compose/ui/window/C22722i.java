package androidx.compose.ui.window;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidDialog.android.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.ui.window.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22722i implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C22722i f43087a = new C22722i();

    /* compiled from: AndroidDialog.android.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.window.i$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList f43088l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.f43088l = arrayList;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            ArrayList arrayList = this.f43088l;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                aVar2.h((K0) arrayList.get(i12), 0, 0, 0.0f);
            }
            return G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final InterfaceC22367j0 b(InterfaceC22369k0 interfaceC22369k0, List<? extends InterfaceC22363h0> list, long j12) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iL2 = 0;
        int iK2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            K0 k0I = list.get(i12).I(j12);
            iL2 = Math.max(iL2, k0I.f40345b);
            iK2 = Math.max(iK2, k0I.f40346c);
            arrayList.add(k0I);
        }
        if (list.isEmpty()) {
            iL2 = C22712b.l(j12);
            iK2 = C22712b.k(j12);
        }
        return interfaceC22369k0.L0(iL2, iK2, P0.c(), new a(arrayList));
    }
}
