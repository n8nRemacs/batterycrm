package com.avito.android.serp.adapter.auto_model_widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.auto_model.AutoModelButton;
import com.avito.android.remote.model.auto_model.AutoModelRating;
import com.avito.android.remote.model.auto_model.Description;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoModelWidgetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/auto_model_widget/AutoModelWidgetItem;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoModelWidgetItem implements l1, ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<AutoModelWidgetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f268949b;

    /* renamed from: c, reason: collision with root package name */
    public final int f268950c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f268951d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<Image> f268952e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f268953f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f268954g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final List<Description> f268955h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final AutoModelRating f268956i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final DeepLink f268957j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final List<AutoModelButton> f268958k;

    /* compiled from: AutoModelWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoModelWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final AutoModelWidgetItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            String string = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            int iL2 = 0;
            int iL3 = 0;
            while (iL3 != i13) {
                iL3 = com.avito.android.actions_sheet.a.l(AutoModelWidgetItem.class, parcel, arrayList2, iL3, 1);
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i14);
                int iL4 = 0;
                while (iL4 != i14) {
                    iL4 = com.avito.android.actions_sheet.a.l(AutoModelWidgetItem.class, parcel, arrayList3, iL4, 1);
                }
                arrayList = arrayList3;
            }
            AutoModelRating autoModelRating = (AutoModelRating) parcel.readParcelable(AutoModelWidgetItem.class.getClassLoader());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(AutoModelWidgetItem.class.getClassLoader());
            int i15 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i15);
            while (iL2 != i15) {
                iL2 = com.avito.android.actions_sheet.a.l(AutoModelWidgetItem.class, parcel, arrayList4, iL2, 1);
            }
            return new AutoModelWidgetItem(serpViewTypeValueOf, i12, string, arrayList2, string2, string3, arrayList, autoModelRating, deepLink, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final AutoModelWidgetItem[] newArray(int i12) {
            return new AutoModelWidgetItem[i12];
        }
    }

    public AutoModelWidgetItem(@Y61.k SerpViewType serpViewType, int i12, @Y61.k String str, @Y61.k List<Image> list, @Y61.k String str2, @Y61.l String str3, @Y61.l List<Description> list2, @Y61.l AutoModelRating autoModelRating, @Y61.l DeepLink deepLink, @Y61.k List<AutoModelButton> list3) {
        this.f268949b = serpViewType;
        this.f268950c = i12;
        this.f268951d = str;
        this.f268952e = list;
        this.f268953f = str2;
        this.f268954g = str3;
        this.f268955h = list2;
        this.f268956i = autoModelRating;
        this.f268957j = deepLink;
        this.f268958k = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoModelWidgetItem)) {
            return false;
        }
        AutoModelWidgetItem autoModelWidgetItem = (AutoModelWidgetItem) obj;
        return this.f268949b == autoModelWidgetItem.f268949b && this.f268950c == autoModelWidgetItem.f268950c && L.f(this.f268951d, autoModelWidgetItem.f268951d) && L.f(this.f268952e, autoModelWidgetItem.f268952e) && L.f(this.f268953f, autoModelWidgetItem.f268953f) && L.f(this.f268954g, autoModelWidgetItem.f268954g) && L.f(this.f268955h, autoModelWidgetItem.f268955h) && L.f(this.f268956i, autoModelWidgetItem.f268956i) && L.f(this.f268957j, autoModelWidgetItem.f268957j) && L.f(this.f268958k, autoModelWidgetItem.f268958k);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF162538b() {
        return this.f268950c;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223480b() {
        return this.f268951d;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF162547k() {
        return this.f268949b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.e(H.d(r.e(this.f268950c, this.f268949b.hashCode() * 31, 31), 31, this.f268951d), 31, this.f268952e), 31, this.f268953f);
        String str = this.f268954g;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        List<Description> list = this.f268955h;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        AutoModelRating autoModelRating = this.f268956i;
        int iHashCode3 = (iHashCode2 + (autoModelRating == null ? 0 : autoModelRating.hashCode())) * 31;
        DeepLink deepLink = this.f268957j;
        return this.f268958k.hashCode() + ((iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoModelWidgetItem(viewType=");
        sb2.append(this.f268949b);
        sb2.append(", spanCount=");
        sb2.append(this.f268950c);
        sb2.append(", stringId=");
        sb2.append(this.f268951d);
        sb2.append(", images=");
        sb2.append(this.f268952e);
        sb2.append(", title=");
        sb2.append(this.f268953f);
        sb2.append(", price=");
        sb2.append(this.f268954g);
        sb2.append(", description=");
        sb2.append(this.f268955h);
        sb2.append(", rating=");
        sb2.append(this.f268956i);
        sb2.append(", deepLink=");
        sb2.append(this.f268957j);
        sb2.append(", buttons=");
        return H.p(sb2, this.f268958k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f268949b.name());
        parcel.writeInt(this.f268950c);
        parcel.writeString(this.f268951d);
        Iterator itJ = C0.j(this.f268952e, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f268953f);
        parcel.writeString(this.f268954g);
        List<Description> list = this.f268955h;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f268956i, i12);
        parcel.writeParcelable(this.f268957j, i12);
        Iterator itJ2 = C0.j(this.f268958k, parcel);
        while (itJ2.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ2.next(), i12);
        }
    }

    public /* synthetic */ AutoModelWidgetItem(SerpViewType serpViewType, int i12, String str, List list, String str2, String str3, List list2, AutoModelRating autoModelRating, DeepLink deepLink, List list3, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? SerpViewType.f268583c : serpViewType, (i13 & 2) != 0 ? 6 : i12, str, list, str2, str3, list2, autoModelRating, deepLink, list3);
    }
}
