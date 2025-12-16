package com.avito.android.extended_profile_universal_widget_edit.create.adapter.section;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.extended.UniversalWidget;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetCreateSectionItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/adapter/section/UniversalWidgetCreateSectionItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UniversalWidgetCreateSectionItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<UniversalWidgetCreateSectionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f153677b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f153678c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Image f153679d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f153680e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Image f153681f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final UniversalWidget.OrderedSectionType f153682g;

    /* compiled from: UniversalWidgetCreateSectionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalWidgetCreateSectionItem> {
        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetCreateSectionItem createFromParcel(Parcel parcel) {
            return new UniversalWidgetCreateSectionItem(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(UniversalWidgetCreateSectionItem.class.getClassLoader()), (Image) parcel.readParcelable(UniversalWidgetCreateSectionItem.class.getClassLoader()), (Image) parcel.readParcelable(UniversalWidgetCreateSectionItem.class.getClassLoader()), (UniversalWidget.OrderedSectionType) parcel.readParcelable(UniversalWidgetCreateSectionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetCreateSectionItem[] newArray(int i12) {
            return new UniversalWidgetCreateSectionItem[i12];
        }
    }

    public UniversalWidgetCreateSectionItem(@k String str, @l String str2, @l Image image, @l Image image2, @l Image image3, @k UniversalWidget.OrderedSectionType orderedSectionType) {
        this.f153677b = str;
        this.f153678c = str2;
        this.f153679d = image;
        this.f153680e = image2;
        this.f153681f = image3;
        this.f153682g = orderedSectionType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalWidgetCreateSectionItem)) {
            return false;
        }
        UniversalWidgetCreateSectionItem universalWidgetCreateSectionItem = (UniversalWidgetCreateSectionItem) obj;
        return L.f(this.f153677b, universalWidgetCreateSectionItem.f153677b) && L.f(this.f153678c, universalWidgetCreateSectionItem.f153678c) && L.f(this.f153679d, universalWidgetCreateSectionItem.f153679d) && L.f(this.f153680e, universalWidgetCreateSectionItem.f153680e) && L.f(this.f153681f, universalWidgetCreateSectionItem.f153681f) && L.f(this.f153682g, universalWidgetCreateSectionItem.f153682g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF153677b() {
        return this.f153677b;
    }

    public final int hashCode() {
        int iHashCode = this.f153677b.hashCode() * 31;
        String str = this.f153678c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.f153679d;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.f153680e;
        int iHashCode4 = (iHashCode3 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Image image3 = this.f153681f;
        return this.f153682g.hashCode() + ((iHashCode4 + (image3 != null ? image3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "UniversalWidgetCreateSectionItem(stringId=" + this.f153677b + ", title=" + this.f153678c + ", mobileImage=" + this.f153679d + ", darkMobileImage=" + this.f153680e + ", desktopImage=" + this.f153681f + ", sectionType=" + this.f153682g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f153677b);
        parcel.writeString(this.f153678c);
        parcel.writeParcelable(this.f153679d, i12);
        parcel.writeParcelable(this.f153680e, i12);
        parcel.writeParcelable(this.f153681f, i12);
        parcel.writeParcelable(this.f153682g, i12);
    }

    public /* synthetic */ UniversalWidgetCreateSectionItem(String str, String str2, Image image, Image image2, Image image3, UniversalWidget.OrderedSectionType orderedSectionType, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "universal_widget_create_section_item" : str, str2, image, image2, image3, orderedSectionType);
    }
}
