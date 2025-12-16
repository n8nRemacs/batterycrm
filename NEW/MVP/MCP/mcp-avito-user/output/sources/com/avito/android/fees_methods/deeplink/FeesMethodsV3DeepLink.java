package com.avito.android.fees_methods.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: FeesMethodsLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/deeplink/FeesMethodsV3DeepLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_fees-methods_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class FeesMethodsV3DeepLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<FeesMethodsV3DeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f157945b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f157946c;

    /* compiled from: FeesMethodsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FeesMethodsV3DeepLink> {
        @Override // android.os.Parcelable.Creator
        public final FeesMethodsV3DeepLink createFromParcel(Parcel parcel) {
            return new FeesMethodsV3DeepLink(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FeesMethodsV3DeepLink[] newArray(int i12) {
            return new FeesMethodsV3DeepLink[i12];
        }
    }

    public FeesMethodsV3DeepLink(@k String str, boolean z12) {
        this.f157945b = str;
        this.f157946c = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f157945b);
        parcel.writeInt(this.f157946c ? 1 : 0);
    }
}
