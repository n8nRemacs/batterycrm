package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.V4;
import com.avito.android.advert_core.blocks.AdvertDetailsBlockItem;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.remote.model.AdvertDetailsBlockId;
import com.avito.android.remote.model.RawParams;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsSimpleContactBarBlockFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/block_factories/C2;", "Lcom/avito/android/advert_core/blocks/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class C2 implements com.avito.android.advert_core.blocks.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final V4 f73425a;

    @Inject
    public C2(@Y61.k V4 v42) {
        this.f73425a = v42;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.k
    public final List<PersistableSpannedItem> a(@Y61.k a.b bVar) {
        return C42745f0.V(this.f73425a.a(bVar.f83013a.f82645b, bVar.f83014b));
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.l
    public final List<PersistableSpannedItem> b(@Y61.k a.b bVar) {
        return a.C2462a.a(this, bVar);
    }

    @Override // com.avito.android.advert_core.blocks.a
    public final boolean c(@Y61.k a.b bVar) {
        Map<String, RawParams> rawParams = bVar.f83015c.getRawParams();
        if (rawParams == null) {
            return true;
        }
        RawParams rawParams2 = rawParams.get("dependency");
        if (!(rawParams2 instanceof RawParams.StringRawParams) || !kotlin.jvm.internal.L.f(((RawParams.StringRawParams) rawParams2).getValue(), "contactBarTopPosition")) {
            return true;
        }
        Iterable iterable = (Iterable) bVar.f83016d;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((AdvertDetailsBlockItem) it.next()).f83011b == AdvertDetailsBlockId.CONTACT_BAR) {
                return false;
            }
        }
        return true;
    }
}
