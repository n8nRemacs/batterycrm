package com.avito.android.bundles.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: BundlesLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/deeplink/BundlesLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final class BundlesLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<BundlesLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f108250b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f108251c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f108252d;

    /* compiled from: BundlesLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BundlesLink> {
        @Override // android.os.Parcelable.Creator
        public final BundlesLink createFromParcel(Parcel parcel) {
            return new BundlesLink(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BundlesLink[] newArray(int i12) {
            return new BundlesLink[i12];
        }
    }

    public BundlesLink(@k String str, boolean z12, @k String str2) {
        this.f108250b = str;
        this.f108251c = z12;
        this.f108252d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f108250b);
        parcel.writeInt(this.f108251c ? 1 : 0);
        parcel.writeString(this.f108252d);
    }
}
