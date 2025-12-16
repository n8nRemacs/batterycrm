package com.avito.android.imv_cars_details.presentation.items.all_affecting_params;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.imv_cars_details.models.AffectingParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImvCarsAllAffectingParamsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/all_affecting_params/ImvCarsAllAffectingParamsItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImvCarsAllAffectingParamsItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<ImvCarsAllAffectingParamsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f170047b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AffectingParams f170048c;

    /* compiled from: ImvCarsAllAffectingParamsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvCarsAllAffectingParamsItem> {
        @Override // android.os.Parcelable.Creator
        public final ImvCarsAllAffectingParamsItem createFromParcel(Parcel parcel) {
            return new ImvCarsAllAffectingParamsItem(parcel.readString(), (AffectingParams) parcel.readParcelable(ImvCarsAllAffectingParamsItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImvCarsAllAffectingParamsItem[] newArray(int i12) {
            return new ImvCarsAllAffectingParamsItem[i12];
        }
    }

    public ImvCarsAllAffectingParamsItem(@k String str, @k AffectingParams affectingParams) {
        this.f170047b = str;
        this.f170048c = affectingParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return getF163033b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF163033b() {
        return this.f170047b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f170047b);
        parcel.writeParcelable(this.f170048c, i12);
    }

    public /* synthetic */ ImvCarsAllAffectingParamsItem(String str, AffectingParams affectingParams, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? ImvCarsAllAffectingParamsItem.class.getName() : str, affectingParams);
    }
}
