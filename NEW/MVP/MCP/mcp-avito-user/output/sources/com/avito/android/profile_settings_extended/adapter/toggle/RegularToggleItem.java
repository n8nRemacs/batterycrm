package com.avito.android.profile_settings_extended.adapter.toggle;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.entity.CommonValueId;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ToggleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/toggle/RegularToggleItem;", "Lcom/avito/android/profile_settings_extended/adapter/toggle/ToggleItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RegularToggleItem extends ToggleItem {

    @k
    public static final Parcelable.Creator<RegularToggleItem> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ToggleViewState f229864d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final CommonValueId f229865e;

    /* compiled from: ToggleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RegularToggleItem> {
        @Override // android.os.Parcelable.Creator
        public final RegularToggleItem createFromParcel(Parcel parcel) {
            return new RegularToggleItem(ToggleViewState.CREATOR.createFromParcel(parcel), CommonValueId.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RegularToggleItem[] newArray(int i12) {
            return new RegularToggleItem[i12];
        }
    }

    public RegularToggleItem(@k ToggleViewState toggleViewState, @k CommonValueId commonValueId) {
        super(toggleViewState, null);
        this.f229864d = toggleViewState;
        this.f229865e = commonValueId;
    }

    public static RegularToggleItem L(RegularToggleItem regularToggleItem, ToggleViewState toggleViewState) {
        CommonValueId commonValueId = regularToggleItem.f229865e;
        regularToggleItem.getClass();
        return new RegularToggleItem(toggleViewState, commonValueId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegularToggleItem)) {
            return false;
        }
        RegularToggleItem regularToggleItem = (RegularToggleItem) obj;
        return L.f(this.f229864d, regularToggleItem.f229864d) && L.f(this.f229865e, regularToggleItem.f229865e);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.toggle.ToggleItem
    @k
    /* renamed from: f, reason: from getter */
    public final ToggleViewState getF229864d() {
        return this.f229864d;
    }

    public final int hashCode() {
        return this.f229865e.hashCode() + (this.f229864d.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "RegularToggleItem(viewState=" + this.f229864d + ", commonValueId=" + this.f229865e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f229864d.writeToParcel(parcel, i12);
        this.f229865e.writeToParcel(parcel, i12);
    }
}
