package com.avito.android.early_access.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: EarlyAccessLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/deeplink/EarlyAccessLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_early-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class EarlyAccessLink extends DeepLink {

    @k
    public static final Parcelable.Creator<EarlyAccessLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f145275b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ReEarlyAccessData f145276c;

    /* compiled from: EarlyAccessLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessLink> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessLink createFromParcel(Parcel parcel) {
            return new EarlyAccessLink((DeepLink) parcel.readParcelable(EarlyAccessLink.class.getClassLoader()), ReEarlyAccessData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessLink[] newArray(int i12) {
            return new EarlyAccessLink[i12];
        }
    }

    public EarlyAccessLink(@k DeepLink deepLink, @k ReEarlyAccessData reEarlyAccessData) {
        this.f145275b = deepLink;
        this.f145276c = reEarlyAccessData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f145275b, i12);
        this.f145276c.writeToParcel(parcel, i12);
    }
}
