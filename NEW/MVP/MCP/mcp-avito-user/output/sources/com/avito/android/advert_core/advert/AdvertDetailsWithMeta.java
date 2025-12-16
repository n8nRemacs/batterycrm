package com.avito.android.advert_core.advert;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.AdvertDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsWithMeta.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/advert/AdvertDetailsWithMeta;", "Landroid/os/Parcelable;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsWithMeta implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsWithMeta> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AdvertDetails f82645b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AdvertDetailsMeta f82646c;

    /* compiled from: AdvertDetailsWithMeta.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsWithMeta> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsWithMeta createFromParcel(Parcel parcel) {
            return new AdvertDetailsWithMeta((AdvertDetails) parcel.readParcelable(AdvertDetailsWithMeta.class.getClassLoader()), parcel.readInt() == 0 ? null : AdvertDetailsMeta.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsWithMeta[] newArray(int i12) {
            return new AdvertDetailsWithMeta[i12];
        }
    }

    public AdvertDetailsWithMeta(@Y61.k AdvertDetails advertDetails, @Y61.l AdvertDetailsMeta advertDetailsMeta) {
        this.f82645b = advertDetails;
        this.f82646c = advertDetailsMeta;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final AdvertDetails getF82645b() {
        return this.f82645b;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final AdvertDetailsMeta getF82646c() {
        return this.f82646c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsWithMeta)) {
            return false;
        }
        AdvertDetailsWithMeta advertDetailsWithMeta = (AdvertDetailsWithMeta) obj;
        return L.f(this.f82645b, advertDetailsWithMeta.f82645b) && L.f(this.f82646c, advertDetailsWithMeta.f82646c);
    }

    public final int hashCode() {
        int iHashCode = this.f82645b.hashCode() * 31;
        AdvertDetailsMeta advertDetailsMeta = this.f82646c;
        return iHashCode + (advertDetailsMeta == null ? 0 : advertDetailsMeta.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "AdvertDetailsWithMeta(advert=" + this.f82645b + ", meta=" + this.f82646c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f82645b, i12);
        AdvertDetailsMeta advertDetailsMeta = this.f82646c;
        if (advertDetailsMeta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertDetailsMeta.writeToParcel(parcel, i12);
        }
    }
}
