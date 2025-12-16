package com.avito.android.advert.item.commercials;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.advertising.adapter.CommercialBannerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionedBannerContainer.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/commercials/PositionedBannerContainer;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PositionedBannerContainer implements Parcelable {

    @k
    public static final Parcelable.Creator<PositionedBannerContainer> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f74321b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CommercialBannerItem f74322c;

    /* compiled from: PositionedBannerContainer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PositionedBannerContainer> {
        @Override // android.os.Parcelable.Creator
        public final PositionedBannerContainer createFromParcel(Parcel parcel) {
            return new PositionedBannerContainer(parcel.readString(), (CommercialBannerItem) parcel.readParcelable(PositionedBannerContainer.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PositionedBannerContainer[] newArray(int i12) {
            return new PositionedBannerContainer[i12];
        }
    }

    public PositionedBannerContainer(@k String str, @k CommercialBannerItem commercialBannerItem) {
        this.f74321b = str;
        this.f74322c = commercialBannerItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PositionedBannerContainer)) {
            return false;
        }
        PositionedBannerContainer positionedBannerContainer = (PositionedBannerContainer) obj;
        return L.f(this.f74321b, positionedBannerContainer.f74321b) && L.f(this.f74322c, positionedBannerContainer.f74322c);
    }

    public final int hashCode() {
        return this.f74322c.hashCode() + (this.f74321b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "PositionedBannerContainer(position=" + this.f74321b + ", banner=" + this.f74322c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f74321b);
        parcel.writeParcelable(this.f74322c, i12);
    }
}
