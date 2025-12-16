package com.avito.android.favorite_sellers;

import com.avito.android.remote.model.Image;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.Metadata;

/* compiled from: AdvertItemAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/favorite_sellers/a;", "", "a", "b", "Lcom/avito/android/favorite_sellers/a$a;", "Lcom/avito/android/favorite_sellers/a$b;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorite_sellers.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC30574a {

    /* compiled from: AdvertItemAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/a$a;", "Lcom/avito/android/favorite_sellers/a;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite_sellers.a$a, reason: collision with other inner class name */
    public static final /* data */ class C4553a implements InterfaceC30574a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AdvertItem f155490a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Image f155491b;

        public C4553a(@Y61.k AdvertItem advertItem, @Y61.l Image image) {
            this.f155490a = advertItem;
            this.f155491b = image;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4553a)) {
                return false;
            }
            C4553a c4553a = (C4553a) obj;
            return kotlin.jvm.internal.L.f(this.f155490a, c4553a.f155490a) && kotlin.jvm.internal.L.f(this.f155491b, c4553a.f155491b);
        }

        public final int hashCode() {
            int iHashCode = this.f155490a.hashCode() * 31;
            Image image = this.f155491b;
            return iHashCode + (image == null ? 0 : image.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnAdvertItemClick(advert=");
            sb2.append(this.f155490a);
            sb2.append(", image=");
            return AK.c.o(sb2, this.f155491b, ')');
        }
    }

    /* compiled from: AdvertItemAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/a$b;", "Lcom/avito/android/favorite_sellers/a;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorite_sellers.a$b */
    public static final /* data */ class b implements InterfaceC30574a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.serp.adapter.S f155492a;

        public b(@Y61.k com.avito.android.serp.adapter.S s5) {
            this.f155492a = s5;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f155492a, ((b) obj).f155492a);
        }

        public final int hashCode() {
            return this.f155492a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnFavoriteButtonClick(favorableItem=" + this.f155492a + ')';
        }
    }
}
