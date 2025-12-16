package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OffersResult.kt */
@d
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/mortgage/api/model/OffersResult;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/mortgage/api/model/Offer;", "offers", "", "showMkbBanner", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OffersResult implements Parcelable {

    @k
    public static final Parcelable.Creator<OffersResult> CREATOR = new a();

    @c("offers")
    @k
    private final List<Offer> offers;

    @c("showMKBBanner")
    @l
    private final Boolean showMkbBanner;

    /* compiled from: OffersResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OffersResult> {
        @Override // android.os.Parcelable.Creator
        public final OffersResult createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Offer.CREATOR, parcel, arrayList, iC2, 1);
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new OffersResult(arrayList, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final OffersResult[] newArray(int i12) {
            return new OffersResult[i12];
        }
    }

    public OffersResult(@k List<Offer> list, @l Boolean bool) {
        this.offers = list;
        this.showMkbBanner = bool;
    }

    @k
    public final List<Offer> c() {
        return this.offers;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Boolean getShowMkbBanner() {
        return this.showMkbBanner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersResult)) {
            return false;
        }
        OffersResult offersResult = (OffersResult) obj;
        return L.f(this.offers, offersResult.offers) && L.f(this.showMkbBanner, offersResult.showMkbBanner);
    }

    public final int hashCode() {
        int iHashCode = this.offers.hashCode() * 31;
        Boolean bool = this.showMkbBanner;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OffersResult(offers=");
        sb2.append(this.offers);
        sb2.append(", showMkbBanner=");
        return C0.g(sb2, this.showMkbBanner, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.offers, parcel);
        while (itJ.hasNext()) {
            ((Offer) itJ.next()).writeToParcel(parcel, i12);
        }
        Boolean bool = this.showMkbBanner;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
