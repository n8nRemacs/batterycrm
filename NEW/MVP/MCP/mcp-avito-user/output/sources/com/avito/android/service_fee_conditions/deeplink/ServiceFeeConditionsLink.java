package com.avito.android.service_fee_conditions.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ServiceFeeConditionsLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_fee_conditions/deeplink/ServiceFeeConditionsLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_service-fee-conditions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class ServiceFeeConditionsLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<ServiceFeeConditionsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f278407b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f278408c;

    /* compiled from: ServiceFeeConditionsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceFeeConditionsLink> {
        @Override // android.os.Parcelable.Creator
        public final ServiceFeeConditionsLink createFromParcel(Parcel parcel) {
            return new ServiceFeeConditionsLink(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceFeeConditionsLink[] newArray(int i12) {
            return new ServiceFeeConditionsLink[i12];
        }
    }

    public ServiceFeeConditionsLink(@k String str, boolean z12) {
        this.f278407b = str;
        this.f278408c = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f278407b);
        parcel.writeInt(this.f278408c ? 1 : 0);
    }
}
