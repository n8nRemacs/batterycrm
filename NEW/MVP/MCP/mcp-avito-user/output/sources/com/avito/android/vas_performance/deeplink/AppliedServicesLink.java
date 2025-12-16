package com.avito.android.vas_performance.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: AppliedServicesLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/deeplink/AppliedServicesLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final class AppliedServicesLink extends DeepLink {

    @k
    public static final Parcelable.Creator<AppliedServicesLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f319856b;

    /* compiled from: AppliedServicesLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AppliedServicesLink> {
        @Override // android.os.Parcelable.Creator
        public final AppliedServicesLink createFromParcel(Parcel parcel) {
            return new AppliedServicesLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppliedServicesLink[] newArray(int i12) {
            return new AppliedServicesLink[i12];
        }
    }

    public AppliedServicesLink(@k String str) {
        this.f319856b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f319856b);
    }
}
