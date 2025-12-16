package com.avito.android.extended_profile_widgets.adapter.gallery;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
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

/* compiled from: GalleryItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/gallery/GalleryItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GalleryItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<GalleryItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154391b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154392c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f154393d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<TnsGalleryImage> f154394e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Parcelable f154395f;

    /* compiled from: GalleryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GalleryItem> {
        @Override // android.os.Parcelable.Creator
        public final GalleryItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            GridElementType gridElementType = (GridElementType) parcel.readParcelable(GalleryItem.class.getClassLoader());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(GalleryItem.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new GalleryItem(string, gridElementType, string2, arrayList, parcel.readParcelable(GalleryItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryItem[] newArray(int i12) {
            return new GalleryItem[i12];
        }
    }

    public GalleryItem(@k String str, @k GridElementType gridElementType, @l String str2, @l List<TnsGalleryImage> list, @l Parcelable parcelable) {
        this.f154391b = str;
        this.f154392c = gridElementType;
        this.f154393d = str2;
        this.f154394e = list;
        this.f154395f = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryItem)) {
            return false;
        }
        GalleryItem galleryItem = (GalleryItem) obj;
        return L.f(this.f154391b, galleryItem.f154391b) && L.f(this.f154392c, galleryItem.f154392c) && L.f(this.f154393d, galleryItem.f154393d) && L.f(this.f154394e, galleryItem.f154394e) && L.f(this.f154395f, galleryItem.f154395f);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154311c() {
        return this.f154392c;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154310b() {
        return this.f154391b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.bxcontent.mvi.entity.f.b(this.f154392c, this.f154391b.hashCode() * 31, 31);
        String str = this.f154393d;
        int iHashCode = (iB2 + (str == null ? 0 : str.hashCode())) * 31;
        List<TnsGalleryImage> list = this.f154394e;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Parcelable parcelable = this.f154395f;
        return iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryItem(stringId=");
        sb2.append(this.f154391b);
        sb2.append(", gridType=");
        sb2.append(this.f154392c);
        sb2.append(", title=");
        sb2.append(this.f154393d);
        sb2.append(", images=");
        sb2.append(this.f154394e);
        sb2.append(", galleryState=");
        return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f154395f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154391b);
        parcel.writeParcelable(this.f154392c, i12);
        parcel.writeString(this.f154393d);
        List<TnsGalleryImage> list = this.f154394e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f154395f, i12);
    }

    public /* synthetic */ GalleryItem(String str, GridElementType gridElementType, String str2, List list, Parcelable parcelable, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : parcelable);
    }
}
