package com.avito.android.str_booking.network.generated.api.api_4_str_order_seller_by_order_id_get;

import Sx0.C15263l;
import Sx0.C15265n;
import Sx0.r;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/a;", "", "a", "b", "c", "Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/a$a;", "Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/a$b;", "Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/a$c;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/a$a;", "Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/a;", "LSx0/l;", "bookingHrefEnumButton", "<init>", "(LSx0/l;)V", "LSx0/l;", "a", "()LSx0/l;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_booking.network.generated.api.api_4_str_order_seller_by_order_id_get.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8556a implements a {

        @com.google.gson.annotations.c("bookingHrefEnumButton")
        @k
        private final C15263l bookingHrefEnumButton;

        public C8556a(@k C15263l c15263l) {
            this.bookingHrefEnumButton = c15263l;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final C15263l getBookingHrefEnumButton() {
            return this.bookingHrefEnumButton;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8556a) && L.f(this.bookingHrefEnumButton, ((C8556a) obj).bookingHrefEnumButton);
        }

        public final int hashCode() {
            return this.bookingHrefEnumButton.hashCode();
        }

        @k
        public final String toString() {
            return "BookingHrefEnumButton(bookingHrefEnumButton=" + this.bookingHrefEnumButton + ')';
        }
    }

    /* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/a$b;", "Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/a;", "LSx0/n;", "action", "LSx0/r;", "clickstream", "", "dataMarker", "icon", "preset", "title", "type", "<init>", "(LSx0/n;LSx0/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LSx0/n;", "a", "()LSx0/n;", "LSx0/r;", "b", "()LSx0/r;", "Ljava/lang/String;", "getDataMarker", "()Ljava/lang/String;", "getIcon", "c", "d", "getType", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        @com.google.gson.annotations.c("action")
        @l
        private final C15265n action;

        @com.google.gson.annotations.c("clickstream")
        @l
        private final r clickstream;

        @com.google.gson.annotations.c("dataMarker")
        @l
        private final String dataMarker;

        @com.google.gson.annotations.c("icon")
        @l
        private final String icon;

        @com.google.gson.annotations.c("preset")
        @l
        private final String preset;

        @com.google.gson.annotations.c("title")
        @l
        private final String title;

        @com.google.gson.annotations.c("type")
        @l
        private final String type;

        public b(@l C15265n c15265n, @l r rVar, @l String str, @l String str2, @l String str3, @l String str4, @l String str5) {
            this.action = c15265n;
            this.clickstream = rVar;
            this.dataMarker = str;
            this.icon = str2;
            this.preset = str3;
            this.title = str4;
            this.type = str5;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final C15265n getAction() {
            return this.action;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final r getClickstream() {
            return this.clickstream;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getPreset() {
            return this.preset;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api4StrOrderSellerByOrderIdGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/a$c;", "Lcom/avito/android/str_booking/network/generated/api/api_4_str_order_seller_by_order_id_get/a;", "LSx0/l;", "guestProfileButton", "<init>", "(LSx0/l;)V", "LSx0/l;", "a", "()LSx0/l;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        @com.google.gson.annotations.c("guestProfileButton")
        @k
        private final C15263l guestProfileButton;

        public c(@k C15263l c15263l) {
            this.guestProfileButton = c15263l;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final C15263l getGuestProfileButton() {
            return this.guestProfileButton;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.guestProfileButton, ((c) obj).guestProfileButton);
        }

        public final int hashCode() {
            return this.guestProfileButton.hashCode();
        }

        @k
        public final String toString() {
            return "GuestProfileButton(guestProfileButton=" + this.guestProfileButton + ')';
        }
    }
}
