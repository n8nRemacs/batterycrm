package com.avito.android.avl_entry.impl.domain;

import Y61.k;
import com.avito.android.avl_entry.impl.data.model.ShortVideosWitcherNetworkModelImpl;
import com.avito.android.avl_entry.impl.ui.external_item.ShortVideosItemImpl;
import com.avito.android.avl_entry_public.ShortVideosWitcherNetworkModel;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.serp.adapter.l1;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: ShortVideosConverter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_entry/impl/domain/a;", "Lcom/avito/android/serp/b;", "Lcom/avito/android/avl_entry_public/ShortVideosWitcherNetworkModel;", "LIg/d;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.serp.b<ShortVideosWitcherNetworkModel, Ig.d> {
    @Override // com.avito.android.serp.b
    @k
    public final Class<ShortVideosWitcherNetworkModelImpl> a() {
        return ShortVideosWitcherNetworkModelImpl.class;
    }

    @Override // com.avito.android.serp.b
    public final l1 b(SerpElement serpElement, String str, String str2, int i12) {
        ShortVideosWitcherNetworkModel shortVideosWitcherNetworkModel = (ShortVideosWitcherNetworkModel) serpElement;
        String string = UUID.randomUUID().toString();
        String title = shortVideosWitcherNetworkModel.getTitle();
        if (title == null) {
            return null;
        }
        Boolean isNew = shortVideosWitcherNetworkModel.getIsNew();
        return new ShortVideosItemImpl(6, title, isNew != null ? isNew.booleanValue() : false, null, str, string, shortVideosWitcherNetworkModel.getXHash(), false, shortVideosWitcherNetworkModel.getAnalytics(), shortVideosWitcherNetworkModel.getF98497d(), 8, null);
    }
}
