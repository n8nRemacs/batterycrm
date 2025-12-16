package com.avito.android.checkout.deeplink;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: CheckoutPromoCodeV2DeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/deeplink/CheckoutPromoCodeV2DeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CheckoutPromoCodeV2DeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<CheckoutPromoCodeV2DeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f118187b;

    /* compiled from: CheckoutPromoCodeV2DeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CheckoutPromoCodeV2DeepLink> {
        @Override // android.os.Parcelable.Creator
        public final CheckoutPromoCodeV2DeepLink createFromParcel(Parcel parcel) {
            return new CheckoutPromoCodeV2DeepLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CheckoutPromoCodeV2DeepLink[] newArray(int i12) {
            return new CheckoutPromoCodeV2DeepLink[i12];
        }
    }

    /* compiled from: CheckoutPromoCodeV2DeepLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/checkout/deeplink/CheckoutPromoCodeV2DeepLink$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/checkout/deeplink/CheckoutPromoCodeV2DeepLink$b$a;", "Lcom/avito/android/checkout/deeplink/CheckoutPromoCodeV2DeepLink$b$b;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: CheckoutPromoCodeV2DeepLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/checkout/deeplink/CheckoutPromoCodeV2DeepLink$b$a;", "Lcom/avito/android/checkout/deeplink/CheckoutPromoCodeV2DeepLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f118188b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1027802522;
            }

            @k
            public final String toString() {
                return "Failure";
            }
        }

        /* compiled from: CheckoutPromoCodeV2DeepLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/checkout/deeplink/CheckoutPromoCodeV2DeepLink$b$b;", "Lcom/avito/android/checkout/deeplink/CheckoutPromoCodeV2DeepLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.checkout.deeplink.CheckoutPromoCodeV2DeepLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3439b extends b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C3439b f118189b = new C3439b();

            public C3439b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C3439b);
            }

            public final int hashCode() {
                return 247206931;
            }

            @k
            public final String toString() {
                return "Success";
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public CheckoutPromoCodeV2DeepLink(@k String str) {
        this.f118187b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutPromoCodeV2DeepLink) && L.f(this.f118187b, ((CheckoutPromoCodeV2DeepLink) obj).f118187b);
    }

    public final int hashCode() {
        return this.f118187b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("CheckoutPromoCodeV2DeepLink(remoteContext="), this.f118187b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f118187b);
    }
}
