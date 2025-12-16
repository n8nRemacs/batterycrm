package com.avito.android.serp.adapter.vertical_main;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.vertical_main.Form;
import com.avito.android.remote.model.vertical_main.SearchFormWidgetSubmitParam;
import j.InterfaceC42150f;
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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/VerticalPublishData;", "Landroid/os/Parcelable;", "Lcom/avito/android/serp/adapter/vertical_main/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VerticalPublishData implements Parcelable, com.avito.android.serp.adapter.vertical_main.a {

    @Y61.k
    public static final Parcelable.Creator<VerticalPublishData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<SearchFormWidgetSubmitParam> f272561b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<Filter> f272562c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f272563d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final DeepLink f272564e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Filter f272565f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f272566g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f272567h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f272568i;

    /* compiled from: PromoBlockFilterData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerticalPublishData> {
        @Override // android.os.Parcelable.Creator
        public final VerticalPublishData createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            int iL3 = 0;
            while (iL3 != i12) {
                iL3 = com.avito.android.actions_sheet.a.l(VerticalPublishData.class, parcel, arrayList, iL3, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(VerticalPublishData.class, parcel, arrayList2, iL2, 1);
            }
            return new VerticalPublishData(arrayList, arrayList2, parcel.readString(), (DeepLink) parcel.readParcelable(VerticalPublishData.class.getClassLoader()), (Filter) parcel.readParcelable(VerticalPublishData.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VerticalPublishData[] newArray(int i12) {
            return new VerticalPublishData[i12];
        }
    }

    public VerticalPublishData(@Y61.k List<SearchFormWidgetSubmitParam> list, @Y61.k List<Filter> list2, @Y61.l String str, @Y61.k DeepLink deepLink, @Y61.l Filter filter, @InterfaceC42150f @Y61.l Integer num, @Y61.l String str2, @Y61.k String str3) {
        this.f272561b = list;
        this.f272562c = list2;
        this.f272563d = str;
        this.f272564e = deepLink;
        this.f272565f = filter;
        this.f272566g = num;
        this.f272567h = str2;
        this.f272568i = str3;
    }

    public static VerticalPublishData b(VerticalPublishData verticalPublishData, Filter filter) {
        List<SearchFormWidgetSubmitParam> list = verticalPublishData.f272561b;
        List<Filter> list2 = verticalPublishData.f272562c;
        String str = verticalPublishData.f272563d;
        DeepLink deepLink = verticalPublishData.f272564e;
        Integer num = verticalPublishData.f272566g;
        String str2 = verticalPublishData.f272567h;
        String str3 = verticalPublishData.f272568i;
        verticalPublishData.getClass();
        return new VerticalPublishData(list, list2, str, deepLink, filter, num, str2, str3);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.a
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.a a(@Y61.k Form form) {
        return new VerticalPublishData(form.getSubmitParams(), form.getFilters(), form.getAction().getTitle(), form.getAction().getUri(), null, this.f272566g, this.f272567h, this.f272568i, 16, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalPublishData)) {
            return false;
        }
        VerticalPublishData verticalPublishData = (VerticalPublishData) obj;
        return L.f(this.f272561b, verticalPublishData.f272561b) && L.f(this.f272562c, verticalPublishData.f272562c) && L.f(this.f272563d, verticalPublishData.f272563d) && L.f(this.f272564e, verticalPublishData.f272564e) && L.f(this.f272565f, verticalPublishData.f272565f) && L.f(this.f272566g, verticalPublishData.f272566g) && L.f(this.f272567h, verticalPublishData.f272567h) && L.f(this.f272568i, verticalPublishData.f272568i);
    }

    @Override // com.avito.android.serp.adapter.vertical_main.a
    @Y61.k
    public final List<SearchFormWidgetSubmitParam> getSubmitParams() {
        return this.f272561b;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f272561b.hashCode() * 31, 31, this.f272562c);
        String str = this.f272563d;
        int iE3 = com.avito.android.actions_sheet.a.e(this.f272564e, (iE2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        Filter filter = this.f272565f;
        int iHashCode = (iE3 + (filter == null ? 0 : filter.hashCode())) * 31;
        Integer num = this.f272566g;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f272567h;
        return this.f272568i.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerticalPublishData(submitParams=");
        sb2.append(this.f272561b);
        sb2.append(", filters=");
        sb2.append(this.f272562c);
        sb2.append(", buttonTitle=");
        sb2.append(this.f272563d);
        sb2.append(", buttonLink=");
        sb2.append(this.f272564e);
        sb2.append(", openedFilter=");
        sb2.append(this.f272565f);
        sb2.append(", style=");
        sb2.append(this.f272566g);
        sb2.append(", activeFieldId=");
        sb2.append(this.f272567h);
        sb2.append(", categoryId=");
        return C22026a.c(sb2, this.f272568i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f272561b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        Iterator itJ2 = C0.j(this.f272562c, parcel);
        while (itJ2.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ2.next(), i12);
        }
        parcel.writeString(this.f272563d);
        parcel.writeParcelable(this.f272564e, i12);
        parcel.writeParcelable(this.f272565f, i12);
        Integer num = this.f272566g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f272567h);
        parcel.writeString(this.f272568i);
    }

    public VerticalPublishData(List list, List list2, String str, DeepLink deepLink, Filter filter, Integer num, String str2, String str3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? C42784z0.f406748b : list2, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? new NoMatchLink() : deepLink, (i12 & 16) != 0 ? null : filter, (i12 & 32) != 0 ? null : num, str2, str3);
    }
}
