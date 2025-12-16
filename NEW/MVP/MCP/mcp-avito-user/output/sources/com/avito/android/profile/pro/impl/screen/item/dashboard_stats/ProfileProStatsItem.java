package com.avito.android.profile.pro.impl.screen.item.dashboard_stats;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProStatsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/dashboard_stats/ProfileProStatsItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProStatsItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProStatsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223150b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f223151c;

    /* compiled from: ProfileProStatsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProStatsItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProStatsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(StatsItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ProfileProStatsItem(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProStatsItem[] newArray(int i12) {
            return new ProfileProStatsItem[i12];
        }
    }

    public ProfileProStatsItem(@k String str, @k ArrayList arrayList) {
        this.f223150b = str;
        this.f223151c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProStatsItem)) {
            return false;
        }
        ProfileProStatsItem profileProStatsItem = (ProfileProStatsItem) obj;
        return L.f(this.f223150b, profileProStatsItem.f223150b) && this.f223151c.equals(profileProStatsItem.f223151c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF217245b() {
        return this.f223150b;
    }

    public final int hashCode() {
        return this.f223151c.hashCode() + (this.f223150b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProStatsItem(stringId=");
        sb2.append(this.f223150b);
        sb2.append(", statistics=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f223151c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223150b);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f223151c, parcel);
        while (itZ.hasNext()) {
            ((StatsItem) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
