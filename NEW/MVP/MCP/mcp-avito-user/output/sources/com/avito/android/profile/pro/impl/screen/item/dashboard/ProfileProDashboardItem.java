package com.avito.android.profile.pro.impl.screen.item.dashboard;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.profile.pro.impl.screen.mvi.entity.DashboardAction;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProDashboardItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/dashboard/ProfileProDashboardItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProDashboardItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProDashboardItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223079b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DashboardAction f223080c;

    /* compiled from: ProfileProDashboardItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProDashboardItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProDashboardItem createFromParcel(Parcel parcel) {
            return new ProfileProDashboardItem(parcel.readString(), (DashboardAction) parcel.readParcelable(ProfileProDashboardItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProDashboardItem[] newArray(int i12) {
            return new ProfileProDashboardItem[i12];
        }
    }

    public ProfileProDashboardItem(@k String str, @l DashboardAction dashboardAction) {
        this.f223079b = str;
        this.f223080c = dashboardAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProDashboardItem)) {
            return false;
        }
        ProfileProDashboardItem profileProDashboardItem = (ProfileProDashboardItem) obj;
        return L.f(this.f223079b, profileProDashboardItem.f223079b) && L.f(this.f223080c, profileProDashboardItem.f223080c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207600b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF212447d() {
        return this.f223079b;
    }

    public final int hashCode() {
        int iHashCode = this.f223079b.hashCode() * 31;
        DashboardAction dashboardAction = this.f223080c;
        return iHashCode + (dashboardAction == null ? 0 : dashboardAction.hashCode());
    }

    @k
    public final String toString() {
        return "ProfileProDashboardItem(stringId=" + this.f223079b + ", state=" + this.f223080c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223079b);
        parcel.writeParcelable(this.f223080c, i12);
    }
}
