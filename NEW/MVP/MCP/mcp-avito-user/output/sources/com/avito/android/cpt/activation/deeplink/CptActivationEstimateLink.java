package com.avito.android.cpt.activation.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: CptActivationEstimateLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpt/activation/deeplink/CptActivationEstimateLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class CptActivationEstimateLink extends DeepLink {

    @k
    public static final Parcelable.Creator<CptActivationEstimateLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f126225b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f126226c;

    /* compiled from: CptActivationEstimateLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CptActivationEstimateLink> {
        @Override // android.os.Parcelable.Creator
        public final CptActivationEstimateLink createFromParcel(Parcel parcel) {
            return new CptActivationEstimateLink(parcel.readString(), (DeepLink) parcel.readParcelable(CptActivationEstimateLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CptActivationEstimateLink[] newArray(int i12) {
            return new CptActivationEstimateLink[i12];
        }
    }

    public CptActivationEstimateLink(@k String str, @k DeepLink deepLink) {
        this.f126225b = str;
        this.f126226c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f126225b);
        parcel.writeParcelable(this.f126226c, i12);
    }
}
