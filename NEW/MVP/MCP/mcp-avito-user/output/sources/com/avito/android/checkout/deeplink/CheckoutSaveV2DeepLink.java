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
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;
import y50.InterfaceC50065a;

/* compiled from: CheckoutSaveV2DeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/deeplink/CheckoutSaveV2DeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CheckoutSaveV2DeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<CheckoutSaveV2DeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f118193b;

    /* compiled from: CheckoutSaveV2DeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CheckoutSaveV2DeepLink> {
        @Override // android.os.Parcelable.Creator
        public final CheckoutSaveV2DeepLink createFromParcel(Parcel parcel) {
            return new CheckoutSaveV2DeepLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CheckoutSaveV2DeepLink[] newArray(int i12) {
            return new CheckoutSaveV2DeepLink[i12];
        }
    }

    /* compiled from: CheckoutSaveV2DeepLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/checkout/deeplink/CheckoutSaveV2DeepLink$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/checkout/deeplink/CheckoutSaveV2DeepLink$b$a;", "Lcom/avito/android/checkout/deeplink/CheckoutSaveV2DeepLink$b$b;", "Lcom/avito/android/checkout/deeplink/CheckoutSaveV2DeepLink$b$c;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: CheckoutSaveV2DeepLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/deeplink/CheckoutSaveV2DeepLink$b$a;", "Lcom/avito/android/checkout/deeplink/CheckoutSaveV2DeepLink$b;", "LJu/c$b;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final ApiException f118194b;

            public a(@k ApiException apiException) {
                super(null);
                this.f118194b = apiException;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f118194b, ((a) obj).f118194b);
            }

            public final int hashCode() {
                return this.f118194b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.q(new StringBuilder("Failure(throwable="), this.f118194b, ')');
            }
        }

        /* compiled from: CheckoutSaveV2DeepLink.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/checkout/deeplink/CheckoutSaveV2DeepLink$b$b;", "Lcom/avito/android/checkout/deeplink/CheckoutSaveV2DeepLink$b;", "LJu/c$a;", "Ly50/a;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.checkout.deeplink.CheckoutSaveV2DeepLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3441b extends b implements InterfaceC14249c.a, InterfaceC50065a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f118195b;

            public C3441b(@k DeepLink deepLink) {
                super(null);
                this.f118195b = deepLink;
            }

            @Override // y50.InterfaceC50065a
            @k
            /* renamed from: a, reason: from getter */
            public final DeepLink getF118195b() {
                return this.f118195b;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3441b) && L.f(this.f118195b, ((C3441b) obj).f118195b);
            }

            public final int hashCode() {
                return this.f118195b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("PaymentRequired(successFinishFlowUri="), this.f118195b, ')');
            }
        }

        /* compiled from: CheckoutSaveV2DeepLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/checkout/deeplink/CheckoutSaveV2DeepLink$b$c;", "Lcom/avito/android/checkout/deeplink/CheckoutSaveV2DeepLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends b implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f118196b = new c();

            public c() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -953604080;
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

    public CheckoutSaveV2DeepLink(@k String str) {
        this.f118193b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutSaveV2DeepLink) && L.f(this.f118193b, ((CheckoutSaveV2DeepLink) obj).f118193b);
    }

    public final int hashCode() {
        return this.f118193b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("CheckoutSaveV2DeepLink(remoteContext="), this.f118193b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f118193b);
    }
}
