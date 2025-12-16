package com.avito.android.autoteka.deeplinks;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: AutotekaPaymentLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/AutotekaPaymentLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "b", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final /* data */ class AutotekaPaymentLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<AutotekaPaymentLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PaymentDetails f96221b;

    /* compiled from: AutotekaPaymentLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutotekaPaymentLink> {
        @Override // android.os.Parcelable.Creator
        public final AutotekaPaymentLink createFromParcel(Parcel parcel) {
            return new AutotekaPaymentLink(PaymentDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AutotekaPaymentLink[] newArray(int i12) {
            return new AutotekaPaymentLink[i12];
        }
    }

    /* compiled from: AutotekaPaymentLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/AutotekaPaymentLink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/autoteka/deeplinks/AutotekaPaymentLink$b$a;", "Lcom/avito/android/autoteka/deeplinks/AutotekaPaymentLink$b$b;", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: AutotekaPaymentLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/AutotekaPaymentLink$b$a;", "Lcom/avito/android/autoteka/deeplinks/AutotekaPaymentLink$b;", "<init>", "()V", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f96222b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 243192491;
            }

            @k
            public final String toString() {
                return "Failure";
            }
        }

        /* compiled from: AutotekaPaymentLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/AutotekaPaymentLink$b$b;", "Lcom/avito/android/autoteka/deeplinks/AutotekaPaymentLink$b;", "<init>", "()V", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.autoteka.deeplinks.AutotekaPaymentLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C2845b extends b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C2845b f96223b = new C2845b();

            public C2845b() {
                super(null);
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C2845b);
            }

            public final int hashCode() {
                return -537403100;
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

    public AutotekaPaymentLink(@k PaymentDetails paymentDetails) {
        this.f96221b = paymentDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutotekaPaymentLink) && L.f(this.f96221b, ((AutotekaPaymentLink) obj).f96221b);
    }

    public final int hashCode() {
        return this.f96221b.hashCode();
    }

    @k
    public final String toString() {
        return "AutotekaPaymentLink(paymentDetails=" + this.f96221b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f96221b.writeToParcel(parcel, i12);
    }
}
