package com.avito.android.publish.slots.group_inlined_block.item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GroupInlinedBlockItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/group_inlined_block/item/e;", "Lcom/avito/android/publish/slots/group_inlined_block/item/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RecyclerView.Adapter<?> f244032b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.recycler.data_aware.c f244033c;

    @Inject
    public e(@com.avito.android.publish.slots.group_inlined_block.a @k RecyclerView.Adapter<?> adapter, @com.avito.android.publish.slots.group_inlined_block.a @k com.avito.android.recycler.data_aware.c cVar) {
        this.f244032b = adapter;
        this.f244033c = cVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((g) eVar, (a) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof com.avito.android.publish.slots.group_inlined_block.b) {
                obj = obj2;
            }
        }
        com.avito.android.publish.slots.group_inlined_block.b bVar = (com.avito.android.publish.slots.group_inlined_block.b) (obj instanceof com.avito.android.publish.slots.group_inlined_block.b ? obj : null);
        if (bVar == null) {
            k(gVar, aVar2);
            return;
        }
        List<com.avito.conveyor_item.a> list2 = bVar.f244009a;
        if (list2 != null) {
            this.f244033c.c(new UV0.c(list2));
        }
    }

    public final void k(@k g gVar, @k a aVar) {
        gVar.setTitle(aVar.f244025c);
        gVar.I1(aVar.f244026d);
        gVar.setAdapter(this.f244032b);
        List<com.avito.conveyor_item.a> list = aVar.f244027e;
        if (list != null) {
            this.f244033c.c(new UV0.c(list));
        }
    }
}
