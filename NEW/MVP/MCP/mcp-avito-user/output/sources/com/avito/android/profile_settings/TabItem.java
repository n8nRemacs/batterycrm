package com.avito.android.profile_settings;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TabItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings/TabItem;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/BaseTabItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class TabItem extends BaseTabItem {

    @Y61.k
    public static final Parcelable.Creator<TabItem> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f228383d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f228384e;

    /* compiled from: TabItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TabItem> {
        @Override // android.os.Parcelable.Creator
        public final TabItem createFromParcel(Parcel parcel) {
            return new TabItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TabItem[] newArray(int i12) {
            return new TabItem[i12];
        }
    }

    public TabItem(@Y61.k String str, @Y61.k String str2) {
        super(str, null);
        this.f228383d = str;
        this.f228384e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabItem)) {
            return false;
        }
        TabItem tabItem = (TabItem) obj;
        return L.f(this.f228383d, tabItem.f228383d) && L.f(this.f228384e, tabItem.f228384e);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem, com.avito.android.lib.deprecated_design.tab.a
    @Y61.k
    /* renamed from: getTitle, reason: from getter */
    public final String getF228383d() {
        return this.f228383d;
    }

    public final int hashCode() {
        return this.f228384e.hashCode() + (this.f228383d.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabItem(title=");
        sb2.append(this.f228383d);
        sb2.append(", shortcut=");
        return C22026a.c(sb2, this.f228384e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f228383d);
        parcel.writeString(this.f228384e);
    }
}
