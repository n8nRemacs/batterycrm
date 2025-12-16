package androidx.compose.ui.layout;

import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: RootMeasurePolicy.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/layout/P0;", "Landroidx/compose/ui/node/LayoutNode$e;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class P0 extends LayoutNode.e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final P0 f40360b = new P0();

    /* compiled from: RootMeasurePolicy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f40361l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(K0.a aVar) {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: RootMeasurePolicy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K0 f40362l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(K0 k02) {
            super(1);
            this.f40362l = k02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a.j(aVar, this.f40362l, 0, 0);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: RootMeasurePolicy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ArrayList f40363l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList arrayList) {
            super(1);
            this.f40363l = arrayList;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            ArrayList arrayList = this.f40363l;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                K0.a.j(aVar2, (K0) arrayList.get(i12), 0, 0);
            }
            return kotlin.G0.f406611a;
        }
    }

    public P0() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        int size = list.size();
        if (size == 0) {
            return interfaceC22369k0.L0(C22712b.l(j12), C22712b.k(j12), kotlin.collections.P0.c(), a.f40361l);
        }
        if (size == 1) {
            K0 k0I = list.get(0).I(j12);
            return interfaceC22369k0.L0(C22713c.g(k0I.f40345b, j12), C22713c.f(k0I.f40346c, j12), kotlin.collections.P0.c(), new b(k0I));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i12 = 0; i12 < size2; i12++) {
            K0 k0I2 = list.get(i12).I(j12);
            iMax = Math.max(k0I2.f40345b, iMax);
            iMax2 = Math.max(k0I2.f40346c, iMax2);
            arrayList.add(k0I2);
        }
        return interfaceC22369k0.L0(C22713c.g(iMax, j12), C22713c.f(iMax2, j12), kotlin.collections.P0.c(), new c(arrayList));
    }
}
