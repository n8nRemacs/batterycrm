package com.avito.android.mortgage.landing.list.items.expandable_block;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.expandable_block.payload.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import w00.InterfaceC49409a;

/* compiled from: ExpandableBlockPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/expandable_block/d;", "LTV0/f;", "Lcom/avito/android/mortgage/landing/list/items/expandable_block/f;", "Lcom/avito/android/mortgage/landing/list/items/expandable_block/ExpandableBlockItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements TV0.f<f, ExpandableBlockItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC49409a, G0> f199706b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC49409a, G0> lVar) {
        this.f199706b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((f) eVar, (ExpandableBlockItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        f fVar = (f) eVar;
        ExpandableBlockItem expandableBlockItem = (ExpandableBlockItem) aVar;
        G0 g02 = null;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        if (!(obj instanceof List)) {
            obj = null;
        }
        List<com.avito.android.mortgage.landing.list.items.expandable_block.payload.a> list2 = (List) obj;
        if (list2 != null) {
            for (com.avito.android.mortgage.landing.list.items.expandable_block.payload.a aVar2 : list2) {
                if (aVar2 instanceof a.C5900a) {
                    fVar.zd(((a.C5900a) aVar2).f199717a);
                }
            }
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            k(fVar, expandableBlockItem);
        }
    }

    public final void k(@k f fVar, @k ExpandableBlockItem expandableBlockItem) {
        fVar.b(expandableBlockItem.f199694c);
        fVar.q(expandableBlockItem.f199695d);
        fVar.pX(expandableBlockItem.f199696e);
        fVar.YR(!expandableBlockItem.f199697f);
        fVar.dy(new c(this, expandableBlockItem));
    }
}
