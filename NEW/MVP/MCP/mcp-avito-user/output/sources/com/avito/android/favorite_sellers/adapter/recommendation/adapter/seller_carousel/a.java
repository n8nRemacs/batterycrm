package com.avito.android.favorite_sellers.adapter.recommendation.adapter.seller_carousel;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertWithOverlay.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/recommendation/adapter/seller_carousel/a;", "", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.image_loader.a f155591a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f155592b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f155593c;

    public a(@Y61.l com.avito.android.image_loader.a aVar, @Y61.l String str, @Y61.l String str2) {
        this.f155591a = aVar;
        this.f155592b = str;
        this.f155593c = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f155591a, aVar.f155591a) && L.f(this.f155592b, aVar.f155592b) && L.f(this.f155593c, aVar.f155593c);
    }

    public final int hashCode() {
        com.avito.android.image_loader.a aVar = this.f155591a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        String str = this.f155592b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f155593c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "AdvertWithOverlay(picture=" + this.f155591a + ", title=" + ((Object) this.f155592b) + ", subtitle=" + ((Object) this.f155593c) + ')';
    }
}
