package com.avito.android.extended_profile_widgets.adapter.about_v2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AboutV2Item.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/about_v2/AboutV2Item;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AboutV2Item implements ExtendedProfileWidgetItem {

    @Y61.k
    public static final Parcelable.Creator<AboutV2Item> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f154162b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final GridElementType f154163c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f154164d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<TnsGalleryImage> f154165e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Parcelable f154166f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f154167g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f154168h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f154169i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f154170j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f154171k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f154172l;

    /* compiled from: AboutV2Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AboutV2Item> {
        @Override // android.os.Parcelable.Creator
        public final AboutV2Item createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            GridElementType gridElementType = (GridElementType) parcel.readParcelable(AboutV2Item.class.getClassLoader());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(AboutV2Item.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new AboutV2Item(string, gridElementType, string2, arrayList, parcel.readParcelable(AboutV2Item.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AboutV2Item[] newArray(int i12) {
            return new AboutV2Item[i12];
        }
    }

    public AboutV2Item(@Y61.k String str, @Y61.k GridElementType gridElementType, @Y61.l String str2, @Y61.l List<TnsGalleryImage> list, @Y61.l Parcelable parcelable, @Y61.l String str3, @Y61.l Integer num, @Y61.l String str4, boolean z12, @Y61.l String str5, boolean z13) {
        this.f154162b = str;
        this.f154163c = gridElementType;
        this.f154164d = str2;
        this.f154165e = list;
        this.f154166f = parcelable;
        this.f154167g = str3;
        this.f154168h = num;
        this.f154169i = str4;
        this.f154170j = z12;
        this.f154171k = str5;
        this.f154172l = z13;
    }

    public static AboutV2Item a(AboutV2Item aboutV2Item, Parcelable parcelable, int i12) {
        String str = aboutV2Item.f154162b;
        GridElementType gridElementType = aboutV2Item.f154163c;
        String str2 = aboutV2Item.f154164d;
        List<TnsGalleryImage> list = aboutV2Item.f154165e;
        if ((i12 & 16) != 0) {
            parcelable = aboutV2Item.f154166f;
        }
        Parcelable parcelable2 = parcelable;
        String str3 = aboutV2Item.f154167g;
        Integer num = aboutV2Item.f154168h;
        String str4 = aboutV2Item.f154169i;
        boolean z12 = (i12 & 256) != 0 ? aboutV2Item.f154170j : false;
        String str5 = aboutV2Item.f154171k;
        boolean z13 = aboutV2Item.f154172l;
        aboutV2Item.getClass();
        return new AboutV2Item(str, gridElementType, str2, list, parcelable2, str3, num, str4, z12, str5, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AboutV2Item)) {
            return false;
        }
        AboutV2Item aboutV2Item = (AboutV2Item) obj;
        return L.f(this.f154162b, aboutV2Item.f154162b) && L.f(this.f154163c, aboutV2Item.f154163c) && L.f(this.f154164d, aboutV2Item.f154164d) && L.f(this.f154165e, aboutV2Item.f154165e) && L.f(this.f154166f, aboutV2Item.f154166f) && L.f(this.f154167g, aboutV2Item.f154167g) && L.f(this.f154168h, aboutV2Item.f154168h) && L.f(this.f154169i, aboutV2Item.f154169i) && this.f154170j == aboutV2Item.f154170j && L.f(this.f154171k, aboutV2Item.f154171k) && this.f154172l == aboutV2Item.f154172l;
    }

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154163c() {
        return this.f154163c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154162b() {
        return this.f154162b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.bxcontent.mvi.entity.f.b(this.f154163c, this.f154162b.hashCode() * 31, 31);
        String str = this.f154164d;
        int iHashCode = (iB2 + (str == null ? 0 : str.hashCode())) * 31;
        List<TnsGalleryImage> list = this.f154165e;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Parcelable parcelable = this.f154166f;
        int iHashCode3 = (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        String str2 = this.f154167g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f154168h;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f154169i;
        int i12 = r.i((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f154170j);
        String str4 = this.f154171k;
        return Boolean.hashCode(this.f154172l) + ((i12 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AboutV2Item(stringId=");
        sb2.append(this.f154162b);
        sb2.append(", gridType=");
        sb2.append(this.f154163c);
        sb2.append(", title=");
        sb2.append(this.f154164d);
        sb2.append(", images=");
        sb2.append(this.f154165e);
        sb2.append(", galleryState=");
        sb2.append(this.f154166f);
        sb2.append(", description=");
        sb2.append(this.f154167g);
        sb2.append(", showMoreLinesCount=");
        sb2.append(this.f154168h);
        sb2.append(", showMoreTitle=");
        sb2.append(this.f154169i);
        sb2.append(", isCollapsed=");
        sb2.append(this.f154170j);
        sb2.append(", widgetName=");
        sb2.append(this.f154171k);
        sb2.append(", isTabsVisible=");
        return r.x(sb2, this.f154172l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f154162b);
        parcel.writeParcelable(this.f154163c, i12);
        parcel.writeString(this.f154164d);
        List<TnsGalleryImage> list = this.f154165e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f154166f, i12);
        parcel.writeString(this.f154167g);
        Integer num = this.f154168h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f154169i);
        parcel.writeInt(this.f154170j ? 1 : 0);
        parcel.writeString(this.f154171k);
        parcel.writeInt(this.f154172l ? 1 : 0);
    }

    public /* synthetic */ AboutV2Item(String str, GridElementType gridElementType, String str2, List list, Parcelable parcelable, String str3, Integer num, String str4, boolean z12, String str5, boolean z13, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : parcelable, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : num, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? true : z12, (i12 & 512) != 0 ? null : str5, (i12 & 1024) != 0 ? false : z13);
    }
}
