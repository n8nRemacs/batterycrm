package com.avito.android.str_seller_orders.strsellerorders;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StrSellerOrdersIntentFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersIntentFactory;", "", "InitialTab", "ScreenState", "_avito_str-seller-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StrSellerOrdersIntentFactory {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StrSellerOrdersIntentFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersIntentFactory$InitialTab;", "", "_avito_str-seller-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InitialTab {

        /* renamed from: b, reason: collision with root package name */
        public static final InitialTab f289693b;

        /* renamed from: c, reason: collision with root package name */
        public static final InitialTab f289694c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ InitialTab[] f289695d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f289696e;

        static {
            InitialTab initialTab = new InitialTab("SELLER", 0);
            f289693b = initialTab;
            InitialTab initialTab2 = new InitialTab("BUYER", 1);
            f289694c = initialTab2;
            InitialTab[] initialTabArr = {initialTab, initialTab2};
            f289695d = initialTabArr;
            f289696e = kotlin.enums.c.a(initialTabArr);
        }

        public InitialTab() {
            throw null;
        }

        public static InitialTab valueOf(String str) {
            return (InitialTab) Enum.valueOf(InitialTab.class, str);
        }

        public static InitialTab[] values() {
            return (InitialTab[]) f289695d.clone();
        }
    }

    /* compiled from: StrSellerOrdersIntentFactory.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersIntentFactory$ScreenState;", "Landroid/os/Parcelable;", "()V", "SinglePage", "TabsPages", "Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersIntentFactory$ScreenState$SinglePage;", "Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersIntentFactory$ScreenState$TabsPages;", "_avito_str-seller-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static abstract class ScreenState implements Parcelable {

        /* compiled from: StrSellerOrdersIntentFactory.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersIntentFactory$ScreenState$SinglePage;", "Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersIntentFactory$ScreenState;", "()V", "Buyer", "Seller", "Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersIntentFactory$ScreenState$SinglePage$Buyer;", "Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersIntentFactory$ScreenState$SinglePage$Seller;", "_avito_str-seller-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static abstract class SinglePage extends ScreenState {

            /* compiled from: StrSellerOrdersIntentFactory.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersIntentFactory$ScreenState$SinglePage$Buyer;", "Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersIntentFactory$ScreenState$SinglePage;", "<init>", "()V", "_avito_str-seller-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Buyer extends SinglePage {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final Buyer f289697b = new Buyer();

                @Y61.k
                public static final Parcelable.Creator<Buyer> CREATOR = new a();

                /* compiled from: StrSellerOrdersIntentFactory.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Buyer> {
                    @Override // android.os.Parcelable.Creator
                    public final Buyer createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return Buyer.f289697b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Buyer[] newArray(int i12) {
                        return new Buyer[i12];
                    }
                }

                public Buyer() {
                    super(null);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof Buyer);
                }

                public final int hashCode() {
                    return 1952877343;
                }

                @Y61.k
                public final String toString() {
                    return "Buyer";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: StrSellerOrdersIntentFactory.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersIntentFactory$ScreenState$SinglePage$Seller;", "Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersIntentFactory$ScreenState$SinglePage;", "<init>", "()V", "_avito_str-seller-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Seller extends SinglePage {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final Seller f289698b = new Seller();

                @Y61.k
                public static final Parcelable.Creator<Seller> CREATOR = new a();

                /* compiled from: StrSellerOrdersIntentFactory.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Seller> {
                    @Override // android.os.Parcelable.Creator
                    public final Seller createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return Seller.f289698b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Seller[] newArray(int i12) {
                        return new Seller[i12];
                    }
                }

                public Seller() {
                    super(null);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof Seller);
                }

                public final int hashCode() {
                    return 881193875;
                }

                @Y61.k
                public final String toString() {
                    return "Seller";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeInt(1);
                }
            }

            public /* synthetic */ SinglePage(C42822w c42822w) {
                this();
            }

            public SinglePage() {
                super(null);
            }
        }

        /* compiled from: StrSellerOrdersIntentFactory.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersIntentFactory$ScreenState$TabsPages;", "Lcom/avito/android/str_seller_orders/strsellerorders/StrSellerOrdersIntentFactory$ScreenState;", "_avito_str-seller-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TabsPages extends ScreenState {

            @Y61.k
            public static final Parcelable.Creator<TabsPages> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final InitialTab f289699b;

            /* compiled from: StrSellerOrdersIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<TabsPages> {
                @Override // android.os.Parcelable.Creator
                public final TabsPages createFromParcel(Parcel parcel) {
                    return new TabsPages(InitialTab.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final TabsPages[] newArray(int i12) {
                    return new TabsPages[i12];
                }
            }

            public TabsPages(@Y61.k InitialTab initialTab) {
                super(null);
                this.f289699b = initialTab;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TabsPages) && this.f289699b == ((TabsPages) obj).f289699b;
            }

            public final int hashCode() {
                return this.f289699b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "TabsPages(initialTab=" + this.f289699b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f289699b.name());
            }
        }

        public /* synthetic */ ScreenState(C42822w c42822w) {
            this();
        }

        public ScreenState() {
        }
    }

    @Y61.k
    Intent a(@Y61.k ScreenState screenState, @Y61.k Map<String, String> map);
}
