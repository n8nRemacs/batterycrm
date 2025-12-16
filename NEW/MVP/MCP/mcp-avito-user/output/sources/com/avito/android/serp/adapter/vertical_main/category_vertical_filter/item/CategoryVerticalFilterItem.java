package com.avito.android.serp.adapter.vertical_main.category_vertical_filter.item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.S2;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.vertical_main.SearchFormWidgetAction;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: CategoryVerticalFilterItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/category_vertical_filter/item/CategoryVerticalFilterItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lis0/h;", "Lqs0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CategoryVerticalFilterItem implements PersistableSerpItem, S2, h, InterfaceC47435a {

    @k
    public static final Parcelable.Creator<CategoryVerticalFilterItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f272668b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f272669c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Filter> f272670d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final SearchFormWidgetAction f272671e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Analytics f272672f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final VerticalPromoBlockItem.VerticalFilterItem f272673g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Settings f272674h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final h.b f272675i;

    /* renamed from: j, reason: collision with root package name */
    public final long f272676j = a.C10492a.a(this);

    /* renamed from: k, reason: collision with root package name */
    @k
    public final SerpViewType f272677k = SerpViewType.f268585e;

    /* renamed from: l, reason: collision with root package name */
    public final int f272678l = 6;

    /* compiled from: CategoryVerticalFilterItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryVerticalFilterItem> {
        @Override // android.os.Parcelable.Creator
        public final CategoryVerticalFilterItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(CategoryVerticalFilterItem.class, parcel, arrayList, iL2, 1);
            }
            return new CategoryVerticalFilterItem(string, string2, arrayList, (SearchFormWidgetAction) parcel.readParcelable(CategoryVerticalFilterItem.class.getClassLoader()), (Analytics) parcel.readParcelable(CategoryVerticalFilterItem.class.getClassLoader()), VerticalPromoBlockItem.VerticalFilterItem.CREATOR.createFromParcel(parcel), (Settings) parcel.readParcelable(CategoryVerticalFilterItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryVerticalFilterItem[] newArray(int i12) {
            return new CategoryVerticalFilterItem[i12];
        }
    }

    public CategoryVerticalFilterItem(@k String str, @k String str2, @k List<Filter> list, @l SearchFormWidgetAction searchFormWidgetAction, @l Analytics analytics, @k VerticalPromoBlockItem.VerticalFilterItem verticalFilterItem, @l Settings settings) {
        this.f272668b = str;
        this.f272669c = str2;
        this.f272670d = list;
        this.f272671e = searchFormWidgetAction;
        this.f272672f = analytics;
        this.f272673g = verticalFilterItem;
        this.f272674h = settings;
        this.f272675i = new h.b("category_vertical_filter", null, null, null, null, analytics, 30, null);
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryVerticalFilterItem)) {
            return false;
        }
        CategoryVerticalFilterItem categoryVerticalFilterItem = (CategoryVerticalFilterItem) obj;
        return L.f(this.f272668b, categoryVerticalFilterItem.f272668b) && L.f(this.f272669c, categoryVerticalFilterItem.f272669c) && L.f(this.f272670d, categoryVerticalFilterItem.f272670d) && L.f(this.f272671e, categoryVerticalFilterItem.f272671e) && L.f(this.f272672f, categoryVerticalFilterItem.f272672f) && L.f(this.f272673g, categoryVerticalFilterItem.f272673g) && L.f(this.f272674h, categoryVerticalFilterItem.f272674h);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF270466m() {
        return this.f272674h;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF82714j() {
        return this.f272678l;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF8954b() {
        return this.f272668b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF199699h() {
        return this.f272676j;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF82716l() {
        return this.f272677k;
    }

    public final int hashCode() {
        int iE2 = H.e(H.d(this.f272668b.hashCode() * 31, 31, this.f272669c), 31, this.f272670d);
        SearchFormWidgetAction searchFormWidgetAction = this.f272671e;
        int iHashCode = (iE2 + (searchFormWidgetAction == null ? 0 : searchFormWidgetAction.hashCode())) * 31;
        Analytics analytics = this.f272672f;
        int iHashCode2 = (this.f272673g.hashCode() + ((iHashCode + (analytics == null ? 0 : analytics.hashCode())) * 31)) * 31;
        Settings settings = this.f272674h;
        return iHashCode2 + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF273825p() {
        return this.f272675i;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryVerticalFilterItem(stringId=");
        sb2.append(this.f272668b);
        sb2.append(", title=");
        sb2.append(this.f272669c);
        sb2.append(", filters=");
        sb2.append(this.f272670d);
        sb2.append(", action=");
        sb2.append(this.f272671e);
        sb2.append(", analytics=");
        sb2.append(this.f272672f);
        sb2.append(", verticalFilterItem=");
        sb2.append(this.f272673g);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f272674h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f272668b);
        parcel.writeString(this.f272669c);
        Iterator itJ = C0.j(this.f272670d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f272671e, i12);
        parcel.writeParcelable(this.f272672f, i12);
        this.f272673g.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f272674h, i12);
    }
}
