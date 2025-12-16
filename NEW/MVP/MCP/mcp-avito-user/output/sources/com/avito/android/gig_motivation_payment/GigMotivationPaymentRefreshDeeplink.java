package com.avito.android.gig_motivation_payment;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: GigMotivationPaymentRefreshDeeplink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_motivation_payment/GigMotivationPaymentRefreshDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "b", "_avito_gig_motivation-payment_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class GigMotivationPaymentRefreshDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<GigMotivationPaymentRefreshDeeplink> CREATOR = new a();

    /* compiled from: GigMotivationPaymentRefreshDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigMotivationPaymentRefreshDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final GigMotivationPaymentRefreshDeeplink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new GigMotivationPaymentRefreshDeeplink();
        }

        @Override // android.os.Parcelable.Creator
        public final GigMotivationPaymentRefreshDeeplink[] newArray(int i12) {
            return new GigMotivationPaymentRefreshDeeplink[i12];
        }
    }

    /* compiled from: GigMotivationPaymentRefreshDeeplink.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_motivation_payment/GigMotivationPaymentRefreshDeeplink$b;", "LJu/c$b;", "<init>", "()V", "a", "_avito_gig_motivation-payment_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: GigMotivationPaymentRefreshDeeplink.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_motivation_payment/GigMotivationPaymentRefreshDeeplink$b$a;", "LJu/c$b;", "<init>", "()V", "_avito_gig_motivation-payment_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f160082b = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1856576978;
            }

            @k
            public final String toString() {
                return "Refresh";
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
