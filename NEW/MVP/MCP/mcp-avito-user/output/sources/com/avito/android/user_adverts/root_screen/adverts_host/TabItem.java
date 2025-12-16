package com.avito.android.user_adverts.root_screen.adverts_host;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TabItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/TabItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/lib/deprecated_design/tab/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TabItem implements Parcelable, com.avito.android.lib.deprecated_design.tab.a {

    @Y61.k
    public static final Parcelable.Creator<TabItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f312285b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f312286c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f312287d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f312288e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f312289f;

    /* compiled from: TabItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TabItem> {
        @Override // android.os.Parcelable.Creator
        public final TabItem createFromParcel(Parcel parcel) {
            return new TabItem(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TabItem[] newArray(int i12) {
            return new TabItem[i12];
        }
    }

    public TabItem(@Y61.l Integer num, @Y61.k String str, @Y61.k String str2, boolean z12) {
        this.f312285b = str;
        this.f312286c = str2;
        this.f312287d = num;
        this.f312288e = z12;
        this.f312289f = num != null ? num.toString() : null;
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
        return kotlin.jvm.internal.L.f(this.f312285b, tabItem.f312285b) && kotlin.jvm.internal.L.f(this.f312286c, tabItem.f312286c) && kotlin.jvm.internal.L.f(this.f312287d, tabItem.f312287d) && this.f312288e == tabItem.f312288e;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.a
    @Y61.l
    /* renamed from: getLabel, reason: from getter */
    public final String getF113779c() {
        return this.f312289f;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.a
    @Y61.k
    /* renamed from: getTitle, reason: from getter */
    public final String getF113778b() {
        return this.f312285b;
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.f312285b.hashCode() * 31, 31, this.f312286c);
        Integer num = this.f312287d;
        return Boolean.hashCode(this.f312288e) + ((iD2 + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabItem(title=");
        sb2.append(this.f312285b);
        sb2.append(", shortcut=");
        sb2.append(this.f312286c);
        sb2.append(", count=");
        sb2.append(this.f312287d);
        sb2.append(", userIsPro=");
        return androidx.appcompat.app.r.x(sb2, this.f312288e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f312285b);
        parcel.writeString(this.f312286c);
        Integer num = this.f312287d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeInt(this.f312288e ? 1 : 0);
    }

    public /* synthetic */ TabItem(String str, String str2, Integer num, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 4) != 0 ? null : num, str, str2, (i12 & 8) != 0 ? false : z12);
    }
}
