package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.Z3;
import com.avito.android.advert.item.safedeal.info.AdvertDetailsSafeDealInfoItem;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsSafeDealInfoBlockFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/block_factories/a2;", "Lcom/avito/android/advert_core/blocks/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.block_factories.a2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27821a2 implements com.avito.android.advert_core.blocks.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Z3 f73523a;

    @Inject
    public C27821a2(@Y61.k Z3 z32) {
        this.f73523a = z32;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.l
    public final List<PersistableSpannedItem> a(@Y61.k a.b bVar) {
        AdvertDetailsSafeDealInfoItem advertDetailsSafeDealInfoItemA = this.f73523a.a(bVar.f83013a.f82645b);
        if (advertDetailsSafeDealInfoItemA != null) {
            return Collections.singletonList(advertDetailsSafeDealInfoItemA);
        }
        return null;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.l
    public final List<PersistableSpannedItem> b(@Y61.k a.b bVar) {
        return a.C2462a.a(this, bVar);
    }

    @Override // com.avito.android.advert_core.blocks.a
    public final boolean c(@Y61.k a.b bVar) {
        return true;
    }
}
