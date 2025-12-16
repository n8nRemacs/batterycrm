package com.avito.android.extended_profile_widgets.adapter.banner;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/banner/BannerItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BannerItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<BannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154234b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154235c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TnsGalleryImage f154236d;

    /* compiled from: BannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BannerItem> {
        @Override // android.os.Parcelable.Creator
        public final BannerItem createFromParcel(Parcel parcel) {
            return new BannerItem(parcel.readString(), (GridElementType) parcel.readParcelable(BannerItem.class.getClassLoader()), (TnsGalleryImage) parcel.readParcelable(BannerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BannerItem[] newArray(int i12) {
            return new BannerItem[i12];
        }
    }

    public BannerItem(@k String str, @k GridElementType gridElementType, @k TnsGalleryImage tnsGalleryImage) {
        this.f154234b = str;
        this.f154235c = gridElementType;
        this.f154236d = tnsGalleryImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154235c() {
        return this.f154235c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272437b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154234b() {
        return this.f154234b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154234b);
        parcel.writeParcelable(this.f154235c, i12);
        parcel.writeParcelable(this.f154236d, i12);
    }

    public /* synthetic */ BannerItem(String str, GridElementType gridElementType, TnsGalleryImage tnsGalleryImage, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, tnsGalleryImage);
    }
}
