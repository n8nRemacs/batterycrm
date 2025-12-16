package com.avito.android.advert_collection;

import I7.a;
import android.net.Uri;
import com.avito.android.favorites.adapter.loading.c;
import kotlin.Metadata;

/* compiled from: AdvertCollectionView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/u;", "Lcom/avito/android/favorites/adapter/loading/c$a;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class u implements c.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f81699b;

    public u(z zVar) {
        this.f81699b = zVar;
    }

    @Override // com.avito.android.favorites.adapter.loading.c.a
    public final void A(@Y61.k Uri uri) {
        this.f81699b.f81707e.accept(new a.d(uri));
    }
}
