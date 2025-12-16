package com.avito.android.extended_profile_widgets.adapter.search.tabs;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.extended_profile_widgets.adapter.search.ExtendedProfileSearchTab;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchTabsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/tabs/SearchTabsItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchTabsItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<SearchTabsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154848b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154849c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<ExtendedProfileSearchTab> f154850d;

    /* renamed from: e, reason: collision with root package name */
    public final int f154851e;

    /* compiled from: SearchTabsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchTabsItem> {
        @Override // android.os.Parcelable.Creator
        public final SearchTabsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            GridElementType gridElementType = (GridElementType) parcel.readParcelable(SearchTabsItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ExtendedProfileSearchTab.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new SearchTabsItem(string, gridElementType, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchTabsItem[] newArray(int i12) {
            return new SearchTabsItem[i12];
        }
    }

    public SearchTabsItem(@k String str, @k GridElementType gridElementType, @k List<ExtendedProfileSearchTab> list, int i12) {
        this.f154848b = str;
        this.f154849c = gridElementType;
        this.f154850d = list;
        this.f154851e = i12;
    }

    public static SearchTabsItem a(SearchTabsItem searchTabsItem, List list, int i12, int i13) {
        String str = searchTabsItem.f154848b;
        GridElementType gridElementType = searchTabsItem.f154849c;
        if ((i13 & 4) != 0) {
            list = searchTabsItem.f154850d;
        }
        if ((i13 & 8) != 0) {
            i12 = searchTabsItem.f154851e;
        }
        searchTabsItem.getClass();
        return new SearchTabsItem(str, gridElementType, list, i12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTabsItem)) {
            return false;
        }
        SearchTabsItem searchTabsItem = (SearchTabsItem) obj;
        return L.f(this.f154848b, searchTabsItem.f154848b) && L.f(this.f154849c, searchTabsItem.f154849c) && L.f(this.f154850d, searchTabsItem.f154850d) && this.f154851e == searchTabsItem.f154851e;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154209c() {
        return this.f154849c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79541k() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145126b() {
        return this.f154848b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f154851e) + H.e(com.avito.android.bxcontent.mvi.entity.f.b(this.f154849c, this.f154848b.hashCode() * 31, 31), 31, this.f154850d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchTabsItem(stringId=");
        sb2.append(this.f154848b);
        sb2.append(", gridType=");
        sb2.append(this.f154849c);
        sb2.append(", tabs=");
        sb2.append(this.f154850d);
        sb2.append(", selectedIndex=");
        return r.t(sb2, this.f154851e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154848b);
        parcel.writeParcelable(this.f154849c, i12);
        Iterator itJ = C0.j(this.f154850d, parcel);
        while (itJ.hasNext()) {
            ((ExtendedProfileSearchTab) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f154851e);
    }

    public /* synthetic */ SearchTabsItem(String str, GridElementType gridElementType, List list, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? "search_tabs_item" : str, (i13 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, list, i12);
    }
}
