package com.avito.android.bbl.screens.contact_history.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: BblContactHistoryLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/contact_history/deeplink/BblContactHistoryLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final class BblContactHistoryLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<BblContactHistoryLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f99635b;

    /* compiled from: BblContactHistoryLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BblContactHistoryLink> {
        @Override // android.os.Parcelable.Creator
        public final BblContactHistoryLink createFromParcel(Parcel parcel) {
            return new BblContactHistoryLink(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final BblContactHistoryLink[] newArray(int i12) {
            return new BblContactHistoryLink[i12];
        }
    }

    public BblContactHistoryLink(long j12) {
        this.f99635b = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f99635b);
    }
}
