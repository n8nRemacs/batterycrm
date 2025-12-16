package jz0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Navigation;
import com.avito.android.str_seller_orders.generated.api.api_4_str_seller_orders_list_post.ApiBookingsListV5FiltersDisplaying;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api4StrSellerOrdersListPostResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Ljz0/b;", "", "a", "b", "c", "Ljz0/b$a;", "Ljz0/b$b;", "Ljz0/b$c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC42456b {

    /* compiled from: Api4StrSellerOrdersListPostResponse.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ljz0/b$a;", "Ljz0/b;", "", "id", "text", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jz0.b$a */
    public static final class a implements InterfaceC42456b {

        @com.google.gson.annotations.c("id")
        @k
        private final String id;

        @com.google.gson.annotations.c("text")
        @k
        private final String text;

        @com.google.gson.annotations.c("value")
        @l
        private final Boolean value;

        public a(@k String str, @k String str2, @l Boolean bool) {
            this.id = str;
            this.text = str2;
            this.value = bool;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Boolean getValue() {
            return this.value;
        }
    }

    /* compiled from: Api4StrSellerOrdersListPostResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Ljz0/b$b;", "Ljz0/b;", "Lcom/avito/android/str_seller_orders/generated/api/api_4_str_seller_orders_list_post/ApiBookingsListV5FiltersDisplaying;", Navigation.DISPLAYING, "", "id", "", "Ljz0/c;", "options", "text", "value", "<init>", "(Lcom/avito/android/str_seller_orders/generated/api/api_4_str_seller_orders_list_post/ApiBookingsListV5FiltersDisplaying;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "Lcom/avito/android/str_seller_orders/generated/api/api_4_str_seller_orders_list_post/ApiBookingsListV5FiltersDisplaying;", "a", "()Lcom/avito/android/str_seller_orders/generated/api/api_4_str_seller_orders_list_post/ApiBookingsListV5FiltersDisplaying;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "e", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jz0.b$b, reason: collision with other inner class name */
    public static final class C11598b implements InterfaceC42456b {

        @com.google.gson.annotations.c(Navigation.DISPLAYING)
        @k
        private final ApiBookingsListV5FiltersDisplaying displaying;

        @com.google.gson.annotations.c("id")
        @k
        private final String id;

        @com.google.gson.annotations.c("options")
        @k
        private final List<C42457c> options;

        @com.google.gson.annotations.c("text")
        @k
        private final String text;

        @com.google.gson.annotations.c("value")
        @l
        private final List<String> value;

        public C11598b(@k ApiBookingsListV5FiltersDisplaying apiBookingsListV5FiltersDisplaying, @k String str, @k List<C42457c> list, @k String str2, @l List<String> list2) {
            this.displaying = apiBookingsListV5FiltersDisplaying;
            this.id = str;
            this.options = list;
            this.text = str2;
            this.value = list2;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final ApiBookingsListV5FiltersDisplaying getDisplaying() {
            return this.displaying;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        public final List<C42457c> c() {
            return this.options;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        public final List<String> e() {
            return this.value;
        }
    }

    /* compiled from: Api4StrSellerOrdersListPostResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012¨\u0006\u0018"}, d2 = {"Ljz0/b$c;", "Ljz0/b;", "Lcom/avito/android/str_seller_orders/generated/api/api_4_str_seller_orders_list_post/ApiBookingsListV5FiltersDisplaying;", Navigation.DISPLAYING, "", "id", "", "Ljz0/c;", "options", "text", "value", "<init>", "(Lcom/avito/android/str_seller_orders/generated/api/api_4_str_seller_orders_list_post/ApiBookingsListV5FiltersDisplaying;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/str_seller_orders/generated/api/api_4_str_seller_orders_list_post/ApiBookingsListV5FiltersDisplaying;", "a", "()Lcom/avito/android/str_seller_orders/generated/api/api_4_str_seller_orders_list_post/ApiBookingsListV5FiltersDisplaying;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "e", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jz0.b$c */
    public static final class c implements InterfaceC42456b {

        @com.google.gson.annotations.c(Navigation.DISPLAYING)
        @k
        private final ApiBookingsListV5FiltersDisplaying displaying;

        @com.google.gson.annotations.c("id")
        @k
        private final String id;

        @com.google.gson.annotations.c("options")
        @k
        private final List<C42457c> options;

        @com.google.gson.annotations.c("text")
        @k
        private final String text;

        @com.google.gson.annotations.c("value")
        @l
        private final String value;

        public c(@k ApiBookingsListV5FiltersDisplaying apiBookingsListV5FiltersDisplaying, @k String str, @k List<C42457c> list, @k String str2, @l String str3) {
            this.displaying = apiBookingsListV5FiltersDisplaying;
            this.id = str;
            this.options = list;
            this.text = str2;
            this.value = str3;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final ApiBookingsListV5FiltersDisplaying getDisplaying() {
            return this.displaying;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        public final List<C42457c> c() {
            return this.options;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }
}
