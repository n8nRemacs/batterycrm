package androidx.compose.material;

import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.C22350b;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.q;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.m5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21259m5 implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f33808a;

    /* compiled from: ListItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.m5$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f33809l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f33810m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02, int i12) {
            super(1);
            this.f33809l = k02;
            this.f33810m = i12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            aVar.h(this.f33809l, 0, this.f33810m, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    public C21259m5(float f12) {
        this.f33808a = f12;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final InterfaceC22367j0 b(InterfaceC22369k0 interfaceC22369k0, List<? extends InterfaceC22363h0> list, long j12) {
        int iMax;
        int iY02;
        androidx.compose.ui.layout.K0 k0I = list.get(0).I(C22712b.c(j12, 0, 0, 0, 0, 11));
        int iD02 = k0I.d0(C22350b.f40439a);
        if (iD02 != Integer.MIN_VALUE) {
            iY02 = interfaceC22369k0.y0(this.f33808a) - iD02;
            iMax = Math.max(C22712b.k(j12), k0I.f40346c + iY02);
        } else {
            iMax = Math.max(C22712b.k(j12), k0I.f40346c);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.i iVar = InterfaceC22215f.a.f39080f;
            androidx.compose.ui.unit.u.f42871b.getClass();
            long jA2 = iVar.a(0L, androidx.compose.ui.unit.v.a(0, iMax - k0I.f40346c), interfaceC22369k0.getF40449b());
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
            iY02 = (int) (jA2 & 4294967295L);
        }
        return interfaceC22369k0.L0(k0I.f40345b, iMax, kotlin.collections.P0.c(), new a(k0I, iY02));
    }
}
