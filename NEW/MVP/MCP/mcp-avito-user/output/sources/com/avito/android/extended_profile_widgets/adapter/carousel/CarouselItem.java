package com.avito.android.extended_profile_widgets.adapter.carousel;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CarouselItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/carousel/CarouselItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CarouselItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<CarouselItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154283b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154284c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f154285d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<AdvertItem> f154286e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Parcelable f154287f;

    /* compiled from: CarouselItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CarouselItem> {
        @Override // android.os.Parcelable.Creator
        public final CarouselItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            GridElementType gridElementType = (GridElementType) parcel.readParcelable(CarouselItem.class.getClassLoader());
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(CarouselItem.class, parcel, arrayList, iL2, 1);
            }
            return new CarouselItem(string, gridElementType, string2, arrayList, parcel.readParcelable(CarouselItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CarouselItem[] newArray(int i12) {
            return new CarouselItem[i12];
        }
    }

    public CarouselItem(@k String str, @k GridElementType gridElementType, @k String str2, @k List<AdvertItem> list, @l Parcelable parcelable) {
        this.f154283b = str;
        this.f154284c = gridElementType;
        this.f154285d = str2;
        this.f154286e = list;
        this.f154287f = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselItem)) {
            return false;
        }
        CarouselItem carouselItem = (CarouselItem) obj;
        return L.f(this.f154283b, carouselItem.f154283b) && L.f(this.f154284c, carouselItem.f154284c) && L.f(this.f154285d, carouselItem.f154285d) && L.f(this.f154286e, carouselItem.f154286e) && L.f(this.f154287f, carouselItem.f154287f);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154418c() {
        return this.f154284c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124032b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154417b() {
        return this.f154283b;
    }

    public final int hashCode() {
        int iE2 = H.e(H.d(com.avito.android.bxcontent.mvi.entity.f.b(this.f154284c, this.f154283b.hashCode() * 31, 31), 31, this.f154285d), 31, this.f154286e);
        Parcelable parcelable = this.f154287f;
        return iE2 + (parcelable == null ? 0 : parcelable.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CarouselItem(stringId=");
        sb2.append(this.f154283b);
        sb2.append(", gridType=");
        sb2.append(this.f154284c);
        sb2.append(", title=");
        sb2.append(this.f154285d);
        sb2.append(", adverts=");
        sb2.append(this.f154286e);
        sb2.append(", scrollState=");
        return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f154287f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154283b);
        parcel.writeParcelable(this.f154284c, i12);
        parcel.writeString(this.f154285d);
        Iterator itJ = C0.j(this.f154286e, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f154287f, i12);
    }

    public /* synthetic */ CarouselItem(String str, GridElementType gridElementType, String str2, List list, Parcelable parcelable, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2, list, (i12 & 16) != 0 ? null : parcelable);
    }
}
