package com.avito.android.advert_core.service_education;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceEducationItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/service_education/ServiceEducationItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ServiceEducationItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<ServiceEducationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f84290b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84291c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f84292d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final PrintableText f84293e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<ServiceEducationValue> f84294f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f84295g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f84296h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f84297i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f84298j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f84299k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f84300l;

    /* compiled from: ServiceEducationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceEducationItem> {
        @Override // android.os.Parcelable.Creator
        public final ServiceEducationItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            PrintableText printableText = (PrintableText) parcel.readParcelable(ServiceEducationItem.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(ServiceEducationValue.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ServiceEducationItem(string, i12, string2, printableText, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceEducationItem[] newArray(int i12) {
            return new ServiceEducationItem[i12];
        }
    }

    public ServiceEducationItem(@Y61.k String str, int i12, @Y61.l String str2, @Y61.l PrintableText printableText, @Y61.k List<ServiceEducationValue> list, boolean z12, boolean z13, boolean z14) {
        this.f84290b = str;
        this.f84291c = i12;
        this.f84292d = str2;
        this.f84293e = printableText;
        this.f84294f = list;
        this.f84295g = z12;
        this.f84296h = z13;
        this.f84297i = z14;
        SerpDisplayType.Companion companion = SerpDisplayType.INSTANCE;
        this.f84298j = SerpViewType.f268585e;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new ServiceEducationItem(this.f84290b, i12, this.f84292d, this.f84293e, this.f84294f, this.f84295g, this.f84296h, this.f84297i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceEducationItem)) {
            return false;
        }
        ServiceEducationItem serviceEducationItem = (ServiceEducationItem) obj;
        return L.f(this.f84290b, serviceEducationItem.f84290b) && this.f84291c == serviceEducationItem.f84291c && L.f(this.f84292d, serviceEducationItem.f84292d) && L.f(this.f84293e, serviceEducationItem.f84293e) && L.f(this.f84294f, serviceEducationItem.f84294f) && this.f84295g == serviceEducationItem.f84295g && this.f84296h == serviceEducationItem.f84296h && this.f84297i == serviceEducationItem.f84297i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF72794b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF72797e() {
        return this.f84291c;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF76179b() {
        return this.f84290b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF72799g() {
        return this.f84298j;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f84291c, this.f84290b.hashCode() * 31, 31);
        String str = this.f84292d;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        PrintableText printableText = this.f84293e;
        return Boolean.hashCode(this.f84297i) + r.i(r.i(H.e((iHashCode + (printableText != null ? printableText.hashCode() : 0)) * 31, 31, this.f84294f), 31, this.f84295g), 31, this.f84296h);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceEducationItem(stringId=");
        sb2.append(this.f84290b);
        sb2.append(", spanCount=");
        sb2.append(this.f84291c);
        sb2.append(", advertId=");
        sb2.append(this.f84292d);
        sb2.append(", title=");
        sb2.append(this.f84293e);
        sb2.append(", values=");
        sb2.append(this.f84294f);
        sb2.append(", isExpand=");
        sb2.append(this.f84295g);
        sb2.append(", isInitState=");
        sb2.append(this.f84296h);
        sb2.append(", isSeller=");
        return r.x(sb2, this.f84297i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f84290b);
        parcel.writeInt(this.f84291c);
        parcel.writeString(this.f84292d);
        parcel.writeParcelable(this.f84293e, i12);
        Iterator itJ = C0.j(this.f84294f, parcel);
        while (itJ.hasNext()) {
            ((ServiceEducationValue) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f84295g ? 1 : 0);
        parcel.writeInt(this.f84296h ? 1 : 0);
        parcel.writeInt(this.f84297i ? 1 : 0);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
    }
}
