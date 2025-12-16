package com.avito.android.public_profile.ui.tab;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TabItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/public_profile/ui/tab/TabItem;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/BaseTabItem;", "_avito_public-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class TabItem extends BaseTabItem {

    @k
    public static final Parcelable.Creator<TabItem> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f231823d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f231824e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f231825f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f231826g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f231827h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f231828i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f231829j;

    /* compiled from: TabItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TabItem> {
        @Override // android.os.Parcelable.Creator
        public final TabItem createFromParcel(Parcel parcel) {
            return new TabItem(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TabItem[] newArray(int i12) {
            return new TabItem[i12];
        }
    }

    public /* synthetic */ TabItem(String str, Integer num, String str2, String str3, boolean z12, String str4, String str5, int i12, C42822w c42822w) {
        this(num, str, str2, str3, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : str5, z12);
    }

    public static TabItem d(TabItem tabItem, String str) {
        Integer num = tabItem.f231824e;
        String str2 = tabItem.f231825f;
        String str3 = tabItem.f231826g;
        boolean z12 = tabItem.f231827h;
        String str4 = tabItem.f231828i;
        String str5 = tabItem.f231829j;
        tabItem.getClass();
        return new TabItem(num, str, str2, str3, str4, str5, z12);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem
    @l
    /* renamed from: c, reason: from getter */
    public final Integer getF231824e() {
        return this.f231824e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabItem)) {
            return false;
        }
        TabItem tabItem = (TabItem) obj;
        return L.f(this.f231823d, tabItem.f231823d) && L.f(this.f231824e, tabItem.f231824e) && L.f(this.f231825f, tabItem.f231825f) && L.f(this.f231826g, tabItem.f231826g) && this.f231827h == tabItem.f231827h && L.f(this.f231828i, tabItem.f231828i) && L.f(this.f231829j, tabItem.f231829j);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem, com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF86187d() {
        return this.f231823d;
    }

    public final int hashCode() {
        int iHashCode = this.f231823d.hashCode() * 31;
        Integer num = this.f231824e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f231825f;
        int i12 = r.i(H.d((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f231826g), 31, this.f231827h);
        String str2 = this.f231828i;
        int iHashCode3 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f231829j;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabItem(title=");
        sb2.append(this.f231823d);
        sb2.append(", count=");
        sb2.append(this.f231824e);
        sb2.append(", placeholder=");
        sb2.append(this.f231825f);
        sb2.append(", shortcut=");
        sb2.append(this.f231826g);
        sb2.append(", useSearchRequest=");
        sb2.append(this.f231827h);
        sb2.append(", disclaimer=");
        sb2.append(this.f231828i);
        sb2.append(", profileSession=");
        return C22026a.c(sb2, this.f231829j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f231823d);
        Integer num = this.f231824e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f231825f);
        parcel.writeString(this.f231826g);
        parcel.writeInt(this.f231827h ? 1 : 0);
        parcel.writeString(this.f231828i);
        parcel.writeString(this.f231829j);
    }

    public TabItem(@l Integer num, @k String str, @l String str2, @k String str3, @l String str4, @l String str5, boolean z12) {
        super(str, num);
        this.f231823d = str;
        this.f231824e = num;
        this.f231825f = str2;
        this.f231826g = str3;
        this.f231827h = z12;
        this.f231828i = str4;
        this.f231829j = str5;
    }
}
