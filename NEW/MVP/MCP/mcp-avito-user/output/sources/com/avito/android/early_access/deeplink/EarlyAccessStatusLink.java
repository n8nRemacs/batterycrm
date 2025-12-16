package com.avito.android.early_access.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: EarlyAccessStatusLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/deeplink/EarlyAccessStatusLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_early-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class EarlyAccessStatusLink extends DeepLink {

    @k
    public static final Parcelable.Creator<EarlyAccessStatusLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f145277b;

    /* renamed from: c, reason: collision with root package name */
    public final long f145278c;

    /* compiled from: EarlyAccessStatusLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessStatusLink> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessStatusLink createFromParcel(Parcel parcel) {
            return new EarlyAccessStatusLink(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessStatusLink[] newArray(int i12) {
            return new EarlyAccessStatusLink[i12];
        }
    }

    public EarlyAccessStatusLink(long j12, long j13) {
        this.f145277b = j12;
        this.f145278c = j13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f145277b);
        parcel.writeLong(this.f145278c);
    }
}
