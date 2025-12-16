package com.avito.android.advert_collection;

import I7.a;
import android.net.Uri;
import com.avito.android.favorites.adapter.error.c;
import kotlin.Metadata;

/* compiled from: AdvertCollectionView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/v;", "Lcom/avito/android/favorites/adapter/error/c$a;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class v implements c.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f81700b;

    public v(z zVar) {
        this.f81700b = zVar;
    }

    @Override // com.avito.android.favorites.adapter.error.c.a
    public final void g(@Y61.k Uri uri) {
        this.f81700b.f81707e.accept(new a.s(uri.toString()));
    }
}
