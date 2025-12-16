package com.avito.android.advert.item.spare_parts.data;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsV4Dto.kt */
@d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/spare_parts/data/SparePartsCompatibilityV4Holder;", "Landroid/os/Parcelable;", "Lcom/avito/android/advert/item/spare_parts/data/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SparePartsCompatibilityV4Holder implements Parcelable, com.avito.android.advert.item.spare_parts.data.a {

    @k
    public static final Parcelable.Creator<SparePartsCompatibilityV4Holder> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final SparePartsCompatibilityV3Holder f80440b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final CompatibilityV4Info f80441c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f80442d;

    /* compiled from: SparePartsV4Dto.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SparePartsCompatibilityV4Holder> {
        @Override // android.os.Parcelable.Creator
        public final SparePartsCompatibilityV4Holder createFromParcel(Parcel parcel) {
            return new SparePartsCompatibilityV4Holder(parcel.readInt() == 0 ? null : SparePartsCompatibilityV3Holder.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CompatibilityV4Info.CREATOR.createFromParcel(parcel) : null, (DeepLink) parcel.readParcelable(SparePartsCompatibilityV4Holder.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SparePartsCompatibilityV4Holder[] newArray(int i12) {
            return new SparePartsCompatibilityV4Holder[i12];
        }
    }

    public SparePartsCompatibilityV4Holder() {
        this(null, null, null, 7, null);
    }

    @Override // com.avito.android.advert.item.spare_parts.data.a
    @l
    /* renamed from: c, reason: from getter */
    public final SparePartsCompatibilityV3Holder getF80440b() {
        return this.f80440b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SparePartsCompatibilityV4Holder)) {
            return false;
        }
        SparePartsCompatibilityV4Holder sparePartsCompatibilityV4Holder = (SparePartsCompatibilityV4Holder) obj;
        return L.f(this.f80440b, sparePartsCompatibilityV4Holder.f80440b) && L.f(this.f80441c, sparePartsCompatibilityV4Holder.f80441c) && L.f(this.f80442d, sparePartsCompatibilityV4Holder.f80442d);
    }

    @Override // com.avito.android.advert.item.spare_parts.data.a
    @l
    /* renamed from: getAction, reason: from getter */
    public final DeepLink getF80442d() {
        return this.f80442d;
    }

    public final int hashCode() {
        SparePartsCompatibilityV3Holder sparePartsCompatibilityV3Holder = this.f80440b;
        int iHashCode = (sparePartsCompatibilityV3Holder == null ? 0 : sparePartsCompatibilityV3Holder.hashCode()) * 31;
        CompatibilityV4Info compatibilityV4Info = this.f80441c;
        int iHashCode2 = (iHashCode + (compatibilityV4Info == null ? 0 : compatibilityV4Info.hashCode())) * 31;
        DeepLink deepLink = this.f80442d;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SparePartsCompatibilityV4Holder(compatibilityV3Info=");
        sb2.append(this.f80440b);
        sb2.append(", compatibilityV4Info=");
        sb2.append(this.f80441c);
        sb2.append(", _action=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f80442d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        SparePartsCompatibilityV3Holder sparePartsCompatibilityV3Holder = this.f80440b;
        if (sparePartsCompatibilityV3Holder == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sparePartsCompatibilityV3Holder.writeToParcel(parcel, i12);
        }
        CompatibilityV4Info compatibilityV4Info = this.f80441c;
        if (compatibilityV4Info == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            compatibilityV4Info.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f80442d, i12);
    }

    public SparePartsCompatibilityV4Holder(@l SparePartsCompatibilityV3Holder sparePartsCompatibilityV3Holder, @l CompatibilityV4Info compatibilityV4Info, @l DeepLink deepLink) {
        this.f80440b = sparePartsCompatibilityV3Holder;
        this.f80441c = compatibilityV4Info;
        this.f80442d = deepLink;
    }

    public /* synthetic */ SparePartsCompatibilityV4Holder(SparePartsCompatibilityV3Holder sparePartsCompatibilityV3Holder, CompatibilityV4Info compatibilityV4Info, DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : sparePartsCompatibilityV3Holder, (i12 & 2) != 0 ? null : compatibilityV4Info, (i12 & 4) != 0 ? null : deepLink);
    }

    @Override // com.avito.android.advert.item.spare_parts.data.a
    @l
    public final SparePartsCompatibilityV4Holder d() {
        return this;
    }
}
