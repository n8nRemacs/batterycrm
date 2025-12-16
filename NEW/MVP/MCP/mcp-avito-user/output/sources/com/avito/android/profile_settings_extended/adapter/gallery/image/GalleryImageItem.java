package com.avito.android.profile_settings_extended.adapter.gallery.image;

import Rb0.InterfaceC15025a;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GalleryImageItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/gallery/image/GalleryImageItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "LRb0/a;", "ScaleType", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GalleryImageItem implements SettingsListItem, InterfaceC15025a {

    @Y61.k
    public static final Parcelable.Creator<GalleryImageItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f229419b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f229420c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final UploadImage f229421d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ScaleType f229422e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final GridElementType.SingleSpan f229423f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GalleryImageItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/gallery/image/GalleryImageItem$ScaleType;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScaleType {

        /* renamed from: b, reason: collision with root package name */
        public static final ScaleType f229424b;

        /* renamed from: c, reason: collision with root package name */
        public static final ScaleType f229425c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ScaleType[] f229426d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f229427e;

        static {
            ScaleType scaleType = new ScaleType("CROP", 0);
            f229424b = scaleType;
            ScaleType scaleType2 = new ScaleType("FIT", 1);
            f229425c = scaleType2;
            ScaleType[] scaleTypeArr = {scaleType, scaleType2};
            f229426d = scaleTypeArr;
            f229427e = kotlin.enums.c.a(scaleTypeArr);
        }

        public ScaleType() {
            throw null;
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) Enum.valueOf(ScaleType.class, str);
        }

        public static ScaleType[] values() {
            return (ScaleType[]) f229426d.clone();
        }
    }

    /* compiled from: GalleryImageItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GalleryImageItem> {
        @Override // android.os.Parcelable.Creator
        public final GalleryImageItem createFromParcel(Parcel parcel) {
            return new GalleryImageItem(parcel.readString(), parcel.readInt() != 0, (UploadImage) parcel.readParcelable(GalleryImageItem.class.getClassLoader()), ScaleType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryImageItem[] newArray(int i12) {
            return new GalleryImageItem[i12];
        }
    }

    public GalleryImageItem(@Y61.k String str, boolean z12, @Y61.k UploadImage uploadImage, @Y61.k ScaleType scaleType) {
        this.f229419b = str;
        this.f229420c = z12;
        this.f229421d = uploadImage;
        this.f229422e = scaleType;
        this.f229423f = GridElementType.SingleSpan.f161210b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryImageItem)) {
            return false;
        }
        GalleryImageItem galleryImageItem = (GalleryImageItem) obj;
        return L.f(this.f229419b, galleryImageItem.f229419b) && this.f229420c == galleryImageItem.f229420c && L.f(this.f229421d, galleryImageItem.f229421d) && this.f229422e == galleryImageItem.f229422e;
    }

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType */
    public final GridElementType getF154209c() {
        return this.f229423f;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223585b() {
        return this.f229419b;
    }

    public final int hashCode() {
        return this.f229422e.hashCode() + ((this.f229421d.hashCode() + r.i(this.f229419b.hashCode() * 31, 31, this.f229420c)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "GalleryImageItem(stringId=" + this.f229419b + ", isActive=" + this.f229420c + ", image=" + this.f229421d + ", scaleType=" + this.f229422e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f229419b);
        parcel.writeInt(this.f229420c ? 1 : 0);
        parcel.writeParcelable(this.f229421d, i12);
        parcel.writeString(this.f229422e.name());
    }

    public /* synthetic */ GalleryImageItem(String str, boolean z12, UploadImage uploadImage, ScaleType scaleType, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "image_item" : str, z12, uploadImage, scaleType);
    }
}
