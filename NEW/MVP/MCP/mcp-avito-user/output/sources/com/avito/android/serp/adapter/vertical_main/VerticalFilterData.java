package com.avito.android.serp.adapter.vertical_main;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.vertical_main.Form;
import com.avito.android.remote.model.vertical_main.SearchFormWidgetAction;
import com.avito.android.remote.model.vertical_main.SearchFormWidgetSubmitParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PromoBlockFilterData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/VerticalFilterData;", "Landroid/os/Parcelable;", "Lcom/avito/android/serp/adapter/vertical_main/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VerticalFilterData implements Parcelable, com.avito.android.serp.adapter.vertical_main.a {

    @Y61.k
    public static final Parcelable.Creator<VerticalFilterData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final SearchFormWidgetAction f272511b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<Filter> f272512c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f272513d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<SearchFormWidgetSubmitParam> f272514e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final DeepLink f272515f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Filter f272516g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f272517h;

    /* compiled from: PromoBlockFilterData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerticalFilterData> {
        @Override // android.os.Parcelable.Creator
        public final VerticalFilterData createFromParcel(Parcel parcel) {
            SearchFormWidgetAction searchFormWidgetAction = (SearchFormWidgetAction) parcel.readParcelable(VerticalFilterData.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            int iL3 = 0;
            while (iL3 != i12) {
                iL3 = com.avito.android.actions_sheet.a.l(VerticalFilterData.class, parcel, arrayList, iL3, 1);
            }
            String string = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(VerticalFilterData.class, parcel, arrayList2, iL2, 1);
            }
            return new VerticalFilterData(searchFormWidgetAction, arrayList, string, arrayList2, (DeepLink) parcel.readParcelable(VerticalFilterData.class.getClassLoader()), (Filter) parcel.readParcelable(VerticalFilterData.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VerticalFilterData[] newArray(int i12) {
            return new VerticalFilterData[i12];
        }
    }

    public VerticalFilterData(@Y61.l SearchFormWidgetAction searchFormWidgetAction, @Y61.k List<Filter> list, @Y61.l String str, @Y61.k List<SearchFormWidgetSubmitParam> list2, @Y61.k DeepLink deepLink, @Y61.l Filter filter, @Y61.l Integer num) {
        this.f272511b = searchFormWidgetAction;
        this.f272512c = list;
        this.f272513d = str;
        this.f272514e = list2;
        this.f272515f = deepLink;
        this.f272516g = filter;
        this.f272517h = num;
    }

    public static VerticalFilterData b(VerticalFilterData verticalFilterData, Filter filter, Integer num, int i12) {
        SearchFormWidgetAction searchFormWidgetAction = verticalFilterData.f272511b;
        List<Filter> list = verticalFilterData.f272512c;
        String str = verticalFilterData.f272513d;
        List<SearchFormWidgetSubmitParam> list2 = verticalFilterData.f272514e;
        DeepLink deepLink = verticalFilterData.f272515f;
        if ((i12 & 32) != 0) {
            filter = verticalFilterData.f272516g;
        }
        Filter filter2 = filter;
        if ((i12 & 64) != 0) {
            num = verticalFilterData.f272517h;
        }
        verticalFilterData.getClass();
        return new VerticalFilterData(searchFormWidgetAction, list, str, list2, deepLink, filter2, num);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.a
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.a a(@Y61.k Form form) {
        return new VerticalFilterData(form.getAction(), form.getFilters(), form.getAction().getTitle(), form.getSubmitParams(), form.getAction().getUri(), null, form.getSelectedFiltersCount(), 32, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalFilterData)) {
            return false;
        }
        VerticalFilterData verticalFilterData = (VerticalFilterData) obj;
        return L.f(this.f272511b, verticalFilterData.f272511b) && L.f(this.f272512c, verticalFilterData.f272512c) && L.f(this.f272513d, verticalFilterData.f272513d) && L.f(this.f272514e, verticalFilterData.f272514e) && L.f(this.f272515f, verticalFilterData.f272515f) && L.f(this.f272516g, verticalFilterData.f272516g) && L.f(this.f272517h, verticalFilterData.f272517h);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.a
    @Y61.k
    public final List<SearchFormWidgetSubmitParam> getSubmitParams() {
        return this.f272514e;
    }

    public final int hashCode() {
        SearchFormWidgetAction searchFormWidgetAction = this.f272511b;
        int iE2 = H.e((searchFormWidgetAction == null ? 0 : searchFormWidgetAction.hashCode()) * 31, 31, this.f272512c);
        String str = this.f272513d;
        int iE3 = com.avito.android.actions_sheet.a.e(this.f272515f, H.e((iE2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f272514e), 31);
        Filter filter = this.f272516g;
        int iHashCode = (iE3 + (filter == null ? 0 : filter.hashCode())) * 31;
        Integer num = this.f272517h;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerticalFilterData(action=");
        sb2.append(this.f272511b);
        sb2.append(", filters=");
        sb2.append(this.f272512c);
        sb2.append(", buttonTitle=");
        sb2.append(this.f272513d);
        sb2.append(", submitParams=");
        sb2.append(this.f272514e);
        sb2.append(", buttonLink=");
        sb2.append(this.f272515f);
        sb2.append(", openedFilter=");
        sb2.append(this.f272516g);
        sb2.append(", selectedFiltersCount=");
        return s.j(sb2, this.f272517h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f272511b, i12);
        Iterator itJ = C0.j(this.f272512c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f272513d);
        Iterator itJ2 = C0.j(this.f272514e, parcel);
        while (itJ2.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ2.next(), i12);
        }
        parcel.writeParcelable(this.f272515f, i12);
        parcel.writeParcelable(this.f272516g, i12);
        Integer num = this.f272517h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }

    public VerticalFilterData(SearchFormWidgetAction searchFormWidgetAction, List list, String str, List list2, DeepLink deepLink, Filter filter, Integer num, int i12, C42822w c42822w) {
        this(searchFormWidgetAction, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? C42784z0.f406748b : list2, (i12 & 16) != 0 ? new NoMatchLink() : deepLink, (i12 & 32) != 0 ? null : filter, (i12 & 64) == 0 ? num : null);
    }
}
