package com.avito.android.advert.item.hotel.hotel_offer;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsHotelOfferAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/a;", "", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/advert/item/hotel/hotel_offer/a$a;", "Lcom/avito/android/advert/item/hotel/hotel_offer/a$b;", "Lcom/avito/android/advert/item/hotel/hotel_offer/a$c;", "Lcom/avito/android/advert/item/hotel/hotel_offer/a$d;", "Lcom/avito/android/advert/item/hotel/hotel_offer/a$e;", "Lcom/avito/android/advert/item/hotel/hotel_offer/a$f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a {

    /* compiled from: AdvertDetailsHotelOfferAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/a$a;", "Lcom/avito/android/advert/item/hotel/hotel_offer/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.hotel.hotel_offer.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2256a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f75935a;

        public C2256a(@Y61.k DeepLink deepLink) {
            this.f75935a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2256a) && L.f(this.f75935a, ((C2256a) obj).f75935a);
        }

        public final int hashCode() {
            return this.f75935a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ButtonItemClick(deeplink="), this.f75935a, ')');
        }
    }

    /* compiled from: AdvertDetailsHotelOfferAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/a$b;", "Lcom/avito/android/advert/item/hotel/hotel_offer/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f75936a;

        public b(boolean z12) {
            this.f75936a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f75936a == ((b) obj).f75936a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f75936a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("ChangeMoreButtonVisibility(isVisible="), this.f75936a, ')');
        }
    }

    /* compiled from: AdvertDetailsHotelOfferAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/a$c;", "Lcom/avito/android/advert/item/hotel/hotel_offer/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f75937a;

        public c(@Y61.k DeepLink deepLink) {
            this.f75937a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f75937a, ((c) obj).f75937a);
        }

        public final int hashCode() {
            return this.f75937a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OfferActionClick(deeplink="), this.f75937a, ')');
        }
    }

    /* compiled from: AdvertDetailsHotelOfferAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/a$d;", "Lcom/avito/android/advert/item/hotel/hotel_offer/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<Image> f75938a;

        public d(@Y61.k List<Image> list) {
            this.f75938a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f75938a, ((d) obj).f75938a);
        }

        public final int hashCode() {
            return this.f75938a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("OfferImageClick(images="), this.f75938a, ')');
        }
    }

    /* compiled from: AdvertDetailsHotelOfferAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/a$e;", "Lcom/avito/android/advert/item/hotel/hotel_offer/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f75939a;

        public e(@Y61.k DeepLink deepLink) {
            this.f75939a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f75939a, ((e) obj).f75939a);
        }

        public final int hashCode() {
            return this.f75939a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OfferInstallmentsClick(deeplink="), this.f75939a, ')');
        }
    }

    /* compiled from: AdvertDetailsHotelOfferAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/a$f;", "Lcom/avito/android/advert/item/hotel/hotel_offer/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f75940a;

        public f(@Y61.k DeepLink deepLink) {
            this.f75940a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f75940a, ((f) obj).f75940a);
        }

        public final int hashCode() {
            return this.f75940a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OfferTextClick(deeplink="), this.f75940a, ')');
        }
    }
}
