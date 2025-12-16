package com.avito.android.extended_profile_widgets.adapter.universal.carousel;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.extended_profile_widgets.adapter.universal.single.UniversalWidgetSingleBlockItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetCarouselContainerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/universal/carousel/UniversalWidgetCarouselContainerItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UniversalWidgetCarouselContainerItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<UniversalWidgetCarouselContainerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154965b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154966c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<UniversalWidgetSingleBlockItem> f154967d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Parcelable f154968e;

    /* compiled from: UniversalWidgetCarouselContainerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalWidgetCarouselContainerItem> {
        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetCarouselContainerItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            GridElementType gridElementType = (GridElementType) parcel.readParcelable(UniversalWidgetCarouselContainerItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(UniversalWidgetSingleBlockItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new UniversalWidgetCarouselContainerItem(string, gridElementType, arrayList, parcel.readParcelable(UniversalWidgetCarouselContainerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetCarouselContainerItem[] newArray(int i12) {
            return new UniversalWidgetCarouselContainerItem[i12];
        }
    }

    public UniversalWidgetCarouselContainerItem(@k String str, @k GridElementType gridElementType, @k List<UniversalWidgetSingleBlockItem> list, @l Parcelable parcelable) {
        this.f154965b = str;
        this.f154966c = gridElementType;
        this.f154967d = list;
        this.f154968e = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalWidgetCarouselContainerItem)) {
            return false;
        }
        UniversalWidgetCarouselContainerItem universalWidgetCarouselContainerItem = (UniversalWidgetCarouselContainerItem) obj;
        return L.f(this.f154965b, universalWidgetCarouselContainerItem.f154965b) && L.f(this.f154966c, universalWidgetCarouselContainerItem.f154966c) && L.f(this.f154967d, universalWidgetCarouselContainerItem.f154967d) && L.f(this.f154968e, universalWidgetCarouselContainerItem.f154968e);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154865c() {
        return this.f154966c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154965b() {
        return this.f154965b;
    }

    public final int hashCode() {
        int iE2 = H.e(com.avito.android.bxcontent.mvi.entity.f.b(this.f154966c, this.f154965b.hashCode() * 31, 31), 31, this.f154967d);
        Parcelable parcelable = this.f154968e;
        return iE2 + (parcelable == null ? 0 : parcelable.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalWidgetCarouselContainerItem(stringId=");
        sb2.append(this.f154965b);
        sb2.append(", gridType=");
        sb2.append(this.f154966c);
        sb2.append(", items=");
        sb2.append(this.f154967d);
        sb2.append(", scrollState=");
        return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f154968e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154965b);
        parcel.writeParcelable(this.f154966c, i12);
        Iterator itJ = C0.j(this.f154967d, parcel);
        while (itJ.hasNext()) {
            ((UniversalWidgetSingleBlockItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f154968e, i12);
    }

    public /* synthetic */ UniversalWidgetCarouselContainerItem(String str, GridElementType gridElementType, List list, Parcelable parcelable, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, list, (i12 & 8) != 0 ? null : parcelable);
    }
}
