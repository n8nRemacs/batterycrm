package com.avito.android.cpx_promo.delayedstart.deeplink;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.delayedstart.CpxPromoDelayedStartContent;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: CpxPromoDelayedStartLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/delayedstart/deeplink/CpxPromoDelayedStartLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class CpxPromoDelayedStartLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<CpxPromoDelayedStartLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CpxPromoDelayedStartContent f126832b;

    /* compiled from: CpxPromoDelayedStartLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CpxPromoDelayedStartLink> {
        @Override // android.os.Parcelable.Creator
        public final CpxPromoDelayedStartLink createFromParcel(Parcel parcel) {
            return new CpxPromoDelayedStartLink(CpxPromoDelayedStartContent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CpxPromoDelayedStartLink[] newArray(int i12) {
            return new CpxPromoDelayedStartLink[i12];
        }
    }

    public CpxPromoDelayedStartLink(@k CpxPromoDelayedStartContent cpxPromoDelayedStartContent) {
        this.f126832b = cpxPromoDelayedStartContent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f126832b.writeToParcel(parcel, i12);
    }
}
