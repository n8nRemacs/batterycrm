package com.avito.android.checkout.deeplink;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.checkout.data.CheckoutResponse;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: CheckoutRefreshDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/deeplink/CheckoutRefreshDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CheckoutRefreshDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<CheckoutRefreshDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f118190b;

    /* compiled from: CheckoutRefreshDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CheckoutRefreshDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final CheckoutRefreshDeepLink createFromParcel(Parcel parcel) {
            return new CheckoutRefreshDeepLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CheckoutRefreshDeepLink[] newArray(int i12) {
            return new CheckoutRefreshDeepLink[i12];
        }
    }

    /* compiled from: CheckoutRefreshDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/checkout/deeplink/CheckoutRefreshDeepLink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/checkout/deeplink/CheckoutRefreshDeepLink$b$a;", "Lcom/avito/android/checkout/deeplink/CheckoutRefreshDeepLink$b$b;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: CheckoutRefreshDeepLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/checkout/deeplink/CheckoutRefreshDeepLink$b$a;", "Lcom/avito/android/checkout/deeplink/CheckoutRefreshDeepLink$b;", "<init>", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f118191b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1477723369;
            }

            @k
            public final String toString() {
                return "Failure";
            }
        }

        /* compiled from: CheckoutRefreshDeepLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/checkout/deeplink/CheckoutRefreshDeepLink$b$b;", "Lcom/avito/android/checkout/deeplink/CheckoutRefreshDeepLink$b;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.checkout.deeplink.CheckoutRefreshDeepLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3440b extends b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final CheckoutResponse f118192b;

            public C3440b(@k CheckoutResponse checkoutResponse) {
                super(null);
                this.f118192b = checkoutResponse;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3440b) && L.f(this.f118192b, ((C3440b) obj).f118192b);
            }

            public final int hashCode() {
                return this.f118192b.hashCode();
            }

            @k
            public final String toString() {
                return "Success(data=" + this.f118192b + ')';
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public CheckoutRefreshDeepLink(@k String str) {
        this.f118190b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutRefreshDeepLink) && L.f(this.f118190b, ((CheckoutRefreshDeepLink) obj).f118190b);
    }

    public final int hashCode() {
        return this.f118190b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("CheckoutRefreshDeepLink(remoteContext="), this.f118190b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f118190b);
    }
}
