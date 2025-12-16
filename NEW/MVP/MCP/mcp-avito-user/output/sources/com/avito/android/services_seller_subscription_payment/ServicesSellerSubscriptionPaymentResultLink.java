package com.avito.android.services_seller_subscription_payment;

import K51.d;
import Y61.k;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.enums.c;
import q50.InterfaceC47204b;

/* compiled from: ServicesSellerSubscriptionPaymentResultLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_seller_subscription_payment/ServicesSellerSubscriptionPaymentResultLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Status", "_avito_services-seller-subscription-payment_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class ServicesSellerSubscriptionPaymentResultLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ServicesSellerSubscriptionPaymentResultLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Uri f280447b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Status f280448c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServicesSellerSubscriptionPaymentResultLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_seller_subscription_payment/ServicesSellerSubscriptionPaymentResultLink$Status;", "", "_avito_services-seller-subscription-payment_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final Status f280449b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f280450c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Status[] f280451d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f280452e;

        static {
            Status status = new Status("SUCCESS", 0);
            f280449b = status;
            Status status2 = new Status("FAILED", 1);
            f280450c = status2;
            Status[] statusArr = {status, status2};
            f280451d = statusArr;
            f280452e = c.a(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f280451d.clone();
        }
    }

    /* compiled from: ServicesSellerSubscriptionPaymentResultLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServicesSellerSubscriptionPaymentResultLink> {
        @Override // android.os.Parcelable.Creator
        public final ServicesSellerSubscriptionPaymentResultLink createFromParcel(Parcel parcel) {
            return new ServicesSellerSubscriptionPaymentResultLink((Uri) parcel.readParcelable(ServicesSellerSubscriptionPaymentResultLink.class.getClassLoader()), Status.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ServicesSellerSubscriptionPaymentResultLink[] newArray(int i12) {
            return new ServicesSellerSubscriptionPaymentResultLink[i12];
        }
    }

    public ServicesSellerSubscriptionPaymentResultLink(@k Uri uri, @k Status status) {
        this.f280447b = uri;
        this.f280448c = status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f280447b, i12);
        parcel.writeString(this.f280448c.name());
    }
}
