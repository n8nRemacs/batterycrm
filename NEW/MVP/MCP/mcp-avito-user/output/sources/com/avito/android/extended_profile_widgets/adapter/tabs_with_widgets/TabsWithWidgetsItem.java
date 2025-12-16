package com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TabsWithWidgetsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/tabs_with_widgets/TabsWithWidgetsItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TabsWithWidgetsItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<TabsWithWidgetsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154933b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154934c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f154935d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<WidgetTab> f154936e;

    /* renamed from: f, reason: collision with root package name */
    public final int f154937f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f154938g;

    /* compiled from: TabsWithWidgetsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TabsWithWidgetsItem> {
        @Override // android.os.Parcelable.Creator
        public final TabsWithWidgetsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            GridElementType gridElementType = (GridElementType) parcel.readParcelable(TabsWithWidgetsItem.class.getClassLoader());
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(WidgetTab.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new TabsWithWidgetsItem(string, gridElementType, string2, arrayList, parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TabsWithWidgetsItem[] newArray(int i12) {
            return new TabsWithWidgetsItem[i12];
        }
    }

    public TabsWithWidgetsItem(@k String str, @k GridElementType gridElementType, @k String str2, @k List<WidgetTab> list, int i12, boolean z12) {
        this.f154933b = str;
        this.f154934c = gridElementType;
        this.f154935d = str2;
        this.f154936e = list;
        this.f154937f = i12;
        this.f154938g = z12;
    }

    public static TabsWithWidgetsItem a(TabsWithWidgetsItem tabsWithWidgetsItem, List list, int i12, int i13) {
        String str = tabsWithWidgetsItem.f154933b;
        GridElementType gridElementType = tabsWithWidgetsItem.f154934c;
        String str2 = tabsWithWidgetsItem.f154935d;
        if ((i13 & 8) != 0) {
            list = tabsWithWidgetsItem.f154936e;
        }
        List list2 = list;
        if ((i13 & 16) != 0) {
            i12 = tabsWithWidgetsItem.f154937f;
        }
        boolean z12 = tabsWithWidgetsItem.f154938g;
        tabsWithWidgetsItem.getClass();
        return new TabsWithWidgetsItem(str, gridElementType, str2, list2, i12, z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabsWithWidgetsItem)) {
            return false;
        }
        TabsWithWidgetsItem tabsWithWidgetsItem = (TabsWithWidgetsItem) obj;
        return L.f(this.f154933b, tabsWithWidgetsItem.f154933b) && L.f(this.f154934c, tabsWithWidgetsItem.f154934c) && L.f(this.f154935d, tabsWithWidgetsItem.f154935d) && L.f(this.f154936e, tabsWithWidgetsItem.f154936e) && this.f154937f == tabsWithWidgetsItem.f154937f && this.f154938g == tabsWithWidgetsItem.f154938g;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154392c() {
        return this.f154934c;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154391b() {
        return this.f154933b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f154938g) + r.e(this.f154937f, H.e(H.d(com.avito.android.bxcontent.mvi.entity.f.b(this.f154934c, this.f154933b.hashCode() * 31, 31), 31, this.f154935d), 31, this.f154936e), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabsWithWidgetsItem(stringId=");
        sb2.append(this.f154933b);
        sb2.append(", gridType=");
        sb2.append(this.f154934c);
        sb2.append(", title=");
        sb2.append(this.f154935d);
        sb2.append(", tabs=");
        sb2.append(this.f154936e);
        sb2.append(", selectedIndex=");
        sb2.append(this.f154937f);
        sb2.append(", isTabsVisible=");
        return r.x(sb2, this.f154938g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154933b);
        parcel.writeParcelable(this.f154934c, i12);
        parcel.writeString(this.f154935d);
        Iterator itJ = C0.j(this.f154936e, parcel);
        while (itJ.hasNext()) {
            ((WidgetTab) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f154937f);
        parcel.writeInt(this.f154938g ? 1 : 0);
    }

    public /* synthetic */ TabsWithWidgetsItem(String str, GridElementType gridElementType, String str2, List list, int i12, boolean z12, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2, list, i12, z12);
    }
}
