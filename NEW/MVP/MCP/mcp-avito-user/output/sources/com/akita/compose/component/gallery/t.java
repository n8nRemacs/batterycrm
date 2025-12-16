package com.akita.compose.component.gallery;

import androidx.compose.runtime.I3;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.K;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;

/* compiled from: GalleryItemScope.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/akita/compose/component/gallery/t;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "gallery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class t extends v.d implements K {

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public I3<Integer> f61624p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public I3<Integer> f61625q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f61626r;

    /* compiled from: GalleryItemScope.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K0 f61627l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K0 k02) {
            super(1);
            this.f61627l = k02;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            aVar.e(this.f61627l, 0, 0, 0.0f);
            return G0.f406611a;
        }
    }

    public t() {
        throw null;
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        long jA2;
        I3<Integer> i32 = this.f61624p;
        int iIntValue = i32 != null ? i32.getF42167b().intValue() : Integer.MAX_VALUE;
        I3<Integer> i33 = this.f61625q;
        int iIntValue2 = i33 != null ? i33.getF42167b().intValue() : Integer.MAX_VALUE;
        if (this.f61626r) {
            int iL2 = iIntValue != Integer.MAX_VALUE ? iIntValue : C22712b.l(j12);
            int iK2 = iIntValue2 != Integer.MAX_VALUE ? iIntValue2 : C22712b.k(j12);
            if (iIntValue == Integer.MAX_VALUE) {
                iIntValue = C22712b.j(j12);
            }
            if (iIntValue2 == Integer.MAX_VALUE) {
                iIntValue2 = C22712b.i(j12);
            }
            jA2 = C22713c.a(iL2, iIntValue, iK2, iIntValue2);
        } else {
            if (iIntValue == Integer.MAX_VALUE) {
                iIntValue = C22712b.j(j12);
            }
            if (iIntValue2 == Integer.MAX_VALUE) {
                iIntValue2 = C22712b.i(j12);
            }
            jA2 = C22713c.a(0, iIntValue, 0, iIntValue2);
        }
        K0 k0I = interfaceC22363h0.I(jA2);
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, P0.c(), new a(k0I));
    }
}
