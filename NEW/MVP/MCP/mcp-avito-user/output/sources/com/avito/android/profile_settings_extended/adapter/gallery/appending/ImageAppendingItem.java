package com.avito.android.profile_settings_extended.adapter.gallery.appending;

import Rb0.InterfaceC15025a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.android.profile_settings_extended.entity.GalleryWidgetItemsGroup;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImageAppendingItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/gallery/appending/ImageAppendingItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "LRb0/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ImageAppendingItem implements SettingsListItem, InterfaceC15025a {

    @k
    public static final Parcelable.Creator<ImageAppendingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229386b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f229387c;

    /* renamed from: d, reason: collision with root package name */
    public final int f229388d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final GalleryWidgetItemsGroup.AppendingType f229389e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f229390f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final GridElementType.SingleSpan f229391g;

    /* compiled from: ImageAppendingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImageAppendingItem> {
        @Override // android.os.Parcelable.Creator
        public final ImageAppendingItem createFromParcel(Parcel parcel) {
            return new ImageAppendingItem(parcel.readString(), parcel.readString(), parcel.readInt(), (GalleryWidgetItemsGroup.AppendingType) parcel.readParcelable(ImageAppendingItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageAppendingItem[] newArray(int i12) {
            return new ImageAppendingItem[i12];
        }
    }

    public ImageAppendingItem(@k String str, @k String str2, int i12, @k GalleryWidgetItemsGroup.AppendingType appendingType, boolean z12) {
        this.f229386b = str;
        this.f229387c = str2;
        this.f229388d = i12;
        this.f229389e = appendingType;
        this.f229390f = z12;
        this.f229391g = GridElementType.SingleSpan.f161210b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageAppendingItem)) {
            return false;
        }
        ImageAppendingItem imageAppendingItem = (ImageAppendingItem) obj;
        return L.f(this.f229386b, imageAppendingItem.f229386b) && L.f(this.f229387c, imageAppendingItem.f229387c) && this.f229388d == imageAppendingItem.f229388d && L.f(this.f229389e, imageAppendingItem.f229389e) && this.f229390f == imageAppendingItem.f229390f;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154209c() {
        return this.f229391g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272880b() {
        return this.f229386b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f229390f) + ((this.f229389e.hashCode() + r.e(this.f229388d, H.d(this.f229386b.hashCode() * 31, 31, this.f229387c), 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageAppendingItem(stringId=");
        sb2.append(this.f229386b);
        sb2.append(", fieldName=");
        sb2.append(this.f229387c);
        sb2.append(", maxPhotoCount=");
        sb2.append(this.f229388d);
        sb2.append(", appendingType=");
        sb2.append(this.f229389e);
        sb2.append(", isActive=");
        return r.x(sb2, this.f229390f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229386b);
        parcel.writeString(this.f229387c);
        parcel.writeInt(this.f229388d);
        parcel.writeParcelable(this.f229389e, i12);
        parcel.writeInt(this.f229390f ? 1 : 0);
    }

    public /* synthetic */ ImageAppendingItem(String str, String str2, int i12, GalleryWidgetItemsGroup.AppendingType appendingType, boolean z12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? "image_appending_item" : str, str2, i12, appendingType, z12);
    }
}
