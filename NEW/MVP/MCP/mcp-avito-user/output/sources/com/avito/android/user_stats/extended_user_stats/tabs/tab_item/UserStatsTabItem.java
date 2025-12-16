package com.avito.android.user_stats.extended_user_stats.tabs.tab_item;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem;
import kotlin.Metadata;

/* compiled from: UserStatsTabItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/tab_item/UserStatsTabItem;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/BaseTabItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserStatsTabItem extends BaseTabItem {

    @k
    public static final Parcelable.Creator<UserStatsTabItem> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f318257d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f318258e;

    /* compiled from: UserStatsTabItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserStatsTabItem> {
        @Override // android.os.Parcelable.Creator
        public final UserStatsTabItem createFromParcel(Parcel parcel) {
            return new UserStatsTabItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserStatsTabItem[] newArray(int i12) {
            return new UserStatsTabItem[i12];
        }
    }

    public UserStatsTabItem(@k String str, @k String str2) {
        super(str, null);
        this.f318257d = str;
        this.f318258e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem, com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF318257d() {
        return this.f318257d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f318257d);
        parcel.writeString(this.f318258e);
    }
}
