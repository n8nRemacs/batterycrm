package com.avito.android.screens.bbip.deep_linking;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: BbipDeepLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip/deep_linking/BbipV2DeepLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class BbipV2DeepLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<BbipV2DeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f260210b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f260211c;

    /* compiled from: BbipDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BbipV2DeepLink> {
        @Override // android.os.Parcelable.Creator
        public final BbipV2DeepLink createFromParcel(Parcel parcel) {
            return new BbipV2DeepLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BbipV2DeepLink[] newArray(int i12) {
            return new BbipV2DeepLink[i12];
        }
    }

    public BbipV2DeepLink(@k String str, @k String str2) {
        this.f260210b = str;
        this.f260211c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f260210b);
        parcel.writeString(this.f260211c);
    }
}
