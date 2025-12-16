package com.avito.android.advert_details_items.sellerprofile;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SellerStatusProvider.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/sellerprofile/V;", "Lcom/avito/android/advert_details_items/sellerprofile/U;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class V implements U {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final O f85596a;

    @Inject
    public V(@Y61.k O o12) {
        this.f85596a = o12;
    }

    @Override // com.avito.android.advert_details_items.sellerprofile.U
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Boolean> a(@Y61.k String str, boolean z12) {
        return this.f85596a.a(str, z12);
    }
}
