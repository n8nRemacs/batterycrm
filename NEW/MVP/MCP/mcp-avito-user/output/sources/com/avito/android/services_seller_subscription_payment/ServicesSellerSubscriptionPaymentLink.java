package com.avito.android.services_seller_subscription_payment;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ServicesSellerSubscriptionPaymentLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_seller_subscription_payment/ServicesSellerSubscriptionPaymentLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_services-seller-subscription-payment_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class ServicesSellerSubscriptionPaymentLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServicesSellerSubscriptionPaymentLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f280443b;

    /* compiled from: ServicesSellerSubscriptionPaymentLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServicesSellerSubscriptionPaymentLink> {
        @Override // android.os.Parcelable.Creator
        public final ServicesSellerSubscriptionPaymentLink createFromParcel(Parcel parcel) {
            return new ServicesSellerSubscriptionPaymentLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesSellerSubscriptionPaymentLink[] newArray(int i12) {
            return new ServicesSellerSubscriptionPaymentLink[i12];
        }
    }

    /* compiled from: ServicesSellerSubscriptionPaymentLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/services_seller_subscription_payment/ServicesSellerSubscriptionPaymentLink$b;", "", "a", "b", "Lcom/avito/android/services_seller_subscription_payment/ServicesSellerSubscriptionPaymentLink$b$a;", "Lcom/avito/android/services_seller_subscription_payment/ServicesSellerSubscriptionPaymentLink$b$b;", "_avito_services-seller-subscription-payment_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f280444b;

        /* compiled from: ServicesSellerSubscriptionPaymentLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_seller_subscription_payment/ServicesSellerSubscriptionPaymentLink$b$a;", "Lcom/avito/android/services_seller_subscription_payment/ServicesSellerSubscriptionPaymentLink$b;", "LJu/c$b;", "_avito_services-seller-subscription-payment_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Uri f280445c;

            public a(@k Uri uri) {
                super(uri, null);
                this.f280445c = uri;
            }

            @Override // com.avito.android.services_seller_subscription_payment.ServicesSellerSubscriptionPaymentLink.b
            @k
            /* renamed from: a, reason: from getter */
            public final Uri getF280444b() {
                return this.f280445c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f280445c, ((a) obj).f280445c);
            }

            public final int hashCode() {
                return this.f280445c.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.t(new StringBuilder("Error(deepLink="), this.f280445c, ')');
            }
        }

        /* compiled from: ServicesSellerSubscriptionPaymentLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_seller_subscription_payment/ServicesSellerSubscriptionPaymentLink$b$b;", "Lcom/avito/android/services_seller_subscription_payment/ServicesSellerSubscriptionPaymentLink$b;", "LJu/c$b;", "_avito_services-seller-subscription-payment_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.services_seller_subscription_payment.ServicesSellerSubscriptionPaymentLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C8343b extends b implements InterfaceC14249c.b {

            /* renamed from: c, reason: collision with root package name */
            @k
            public final Uri f280446c;

            public C8343b(@k Uri uri) {
                super(uri, null);
                this.f280446c = uri;
            }

            @Override // com.avito.android.services_seller_subscription_payment.ServicesSellerSubscriptionPaymentLink.b
            @k
            /* renamed from: a, reason: from getter */
            public final Uri getF280444b() {
                return this.f280446c;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8343b) && L.f(this.f280446c, ((C8343b) obj).f280446c);
            }

            public final int hashCode() {
                return this.f280446c.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.t(new StringBuilder("Success(deepLink="), this.f280446c, ')');
            }
        }

        public b(Uri uri, C42822w c42822w) {
            this.f280444b = uri;
        }

        @k
        /* renamed from: a, reason: from getter */
        public Uri getF280444b() {
            return this.f280444b;
        }
    }

    public ServicesSellerSubscriptionPaymentLink(@k String str) {
        this.f280443b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f280443b);
    }
}
