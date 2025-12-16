package androidx.compose.ui.window;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: AndroidPopup.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "<anonymous parameter 0>", "Landroidx/compose/ui/unit/b;", "<anonymous parameter 1>", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.ui.window.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22733u implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L f43117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f43118b;

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.window.u$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f43119l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(K0.a aVar) {
            return G0.f406611a;
        }
    }

    public C22733u(L l12, LayoutDirection layoutDirection) {
        this.f43117a = l12;
        this.f43118b = layoutDirection;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final InterfaceC22367j0 b(InterfaceC22369k0 interfaceC22369k0, List<? extends InterfaceC22363h0> list, long j12) {
        this.f43117a.setParentLayoutDirection(this.f43118b);
        return interfaceC22369k0.L0(0, 0, P0.c(), a.f43119l);
    }
}
