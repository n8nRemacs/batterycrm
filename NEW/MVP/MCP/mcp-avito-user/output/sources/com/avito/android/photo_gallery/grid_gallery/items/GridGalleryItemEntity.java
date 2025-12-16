package com.avito.android.photo_gallery.grid_gallery.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: GridGalleryItemEntity.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/GridGalleryItemEntity;", "Landroid/os/Parcelable;", "PhotoPreview", "PositionType", "VideoPreview", "Lcom/avito/android/photo_gallery/grid_gallery/items/GridGalleryItemEntity$PhotoPreview;", "Lcom/avito/android/photo_gallery/grid_gallery/items/GridGalleryItemEntity$VideoPreview;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface GridGalleryItemEntity extends Parcelable {

    /* compiled from: GridGalleryItemEntity.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/GridGalleryItemEntity$PhotoPreview;", "Lcom/avito/android/photo_gallery/grid_gallery/items/GridGalleryItemEntity;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class PhotoPreview implements GridGalleryItemEntity {

        @k
        public static final Parcelable.Creator<PhotoPreview> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Image f217200b;

        /* renamed from: c, reason: collision with root package name */
        public final int f217201c;

        /* renamed from: d, reason: collision with root package name */
        public final int f217202d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final PositionType f217203e;

        /* renamed from: f, reason: collision with root package name */
        public final int f217204f;

        /* compiled from: GridGalleryItemEntity.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PhotoPreview> {
            @Override // android.os.Parcelable.Creator
            public final PhotoPreview createFromParcel(Parcel parcel) {
                return new PhotoPreview((Image) parcel.readParcelable(PhotoPreview.class.getClassLoader()), parcel.readInt(), parcel.readInt(), PositionType.valueOf(parcel.readString()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final PhotoPreview[] newArray(int i12) {
                return new PhotoPreview[i12];
            }
        }

        public PhotoPreview(@k Image image, int i12, int i13, @k PositionType positionType, int i14) {
            this.f217200b = image;
            this.f217201c = i12;
            this.f217202d = i13;
            this.f217203e = positionType;
            this.f217204f = i14;
        }

        @Override // com.avito.android.photo_gallery.grid_gallery.items.GridGalleryItemEntity
        /* renamed from: T1, reason: from getter */
        public final int getF217215f() {
            return this.f217204f;
        }

        @Override // com.avito.android.photo_gallery.grid_gallery.items.GridGalleryItemEntity
        @k
        /* renamed from: b6, reason: from getter */
        public final PositionType getF217214e() {
            return this.f217203e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhotoPreview)) {
                return false;
            }
            PhotoPreview photoPreview = (PhotoPreview) obj;
            return L.f(this.f217200b, photoPreview.f217200b) && this.f217201c == photoPreview.f217201c && this.f217202d == photoPreview.f217202d && this.f217203e == photoPreview.f217203e && this.f217204f == photoPreview.f217204f;
        }

        @Override // com.avito.android.photo_gallery.grid_gallery.items.GridGalleryItemEntity
        @k
        /* renamed from: getPreview, reason: from getter */
        public final Image getF217211b() {
            return this.f217200b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f217204f) + ((this.f217203e.hashCode() + r.e(this.f217202d, r.e(this.f217201c, this.f217200b.hashCode() * 31, 31), 31)) * 31);
        }

        @Override // com.avito.android.photo_gallery.grid_gallery.items.GridGalleryItemEntity
        /* renamed from: r0, reason: from getter */
        public final int getF217213d() {
            return this.f217202d;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PhotoPreview(preview=");
            sb2.append(this.f217200b);
            sb2.append(", fullScreenGalleryPosition=");
            sb2.append(this.f217201c);
            sb2.append(", advertGalleryPosition=");
            sb2.append(this.f217202d);
            sb2.append(", positionType=");
            sb2.append(this.f217203e);
            sb2.append(", gridGalleryPosition=");
            return r.t(sb2, this.f217204f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f217200b, i12);
            parcel.writeInt(this.f217201c);
            parcel.writeInt(this.f217202d);
            parcel.writeString(this.f217203e.name());
            parcel.writeInt(this.f217204f);
        }

        @Override // com.avito.android.photo_gallery.grid_gallery.items.GridGalleryItemEntity
        /* renamed from: z3, reason: from getter */
        public final int getF217212c() {
            return this.f217201c;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GridGalleryItemEntity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/GridGalleryItemEntity$PositionType;", "", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PositionType {

        /* renamed from: b, reason: collision with root package name */
        public static final PositionType f217205b;

        /* renamed from: c, reason: collision with root package name */
        public static final PositionType f217206c;

        /* renamed from: d, reason: collision with root package name */
        public static final PositionType f217207d;

        /* renamed from: e, reason: collision with root package name */
        public static final PositionType f217208e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ PositionType[] f217209f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ a f217210g;

        static {
            PositionType positionType = new PositionType("SINGLE", 0);
            f217205b = positionType;
            PositionType positionType2 = new PositionType("FIRST", 1);
            f217206c = positionType2;
            PositionType positionType3 = new PositionType("MIDDLE", 2);
            f217207d = positionType3;
            PositionType positionType4 = new PositionType("LAST", 3);
            f217208e = positionType4;
            PositionType[] positionTypeArr = {positionType, positionType2, positionType3, positionType4};
            f217209f = positionTypeArr;
            f217210g = c.a(positionTypeArr);
        }

        public PositionType() {
            throw null;
        }

        public static PositionType valueOf(String str) {
            return (PositionType) Enum.valueOf(PositionType.class, str);
        }

        public static PositionType[] values() {
            return (PositionType[]) f217209f.clone();
        }
    }

    /* compiled from: GridGalleryItemEntity.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/GridGalleryItemEntity$VideoPreview;", "Lcom/avito/android/photo_gallery/grid_gallery/items/GridGalleryItemEntity;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class VideoPreview implements GridGalleryItemEntity {

        @k
        public static final Parcelable.Creator<VideoPreview> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Image f217211b;

        /* renamed from: c, reason: collision with root package name */
        public final int f217212c;

        /* renamed from: d, reason: collision with root package name */
        public final int f217213d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final PositionType f217214e;

        /* renamed from: f, reason: collision with root package name */
        public final int f217215f;

        /* compiled from: GridGalleryItemEntity.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<VideoPreview> {
            @Override // android.os.Parcelable.Creator
            public final VideoPreview createFromParcel(Parcel parcel) {
                return new VideoPreview((Image) parcel.readParcelable(VideoPreview.class.getClassLoader()), parcel.readInt(), parcel.readInt(), PositionType.valueOf(parcel.readString()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final VideoPreview[] newArray(int i12) {
                return new VideoPreview[i12];
            }
        }

        public VideoPreview(@k Image image, int i12, int i13, @k PositionType positionType, int i14) {
            this.f217211b = image;
            this.f217212c = i12;
            this.f217213d = i13;
            this.f217214e = positionType;
            this.f217215f = i14;
        }

        @Override // com.avito.android.photo_gallery.grid_gallery.items.GridGalleryItemEntity
        /* renamed from: T1, reason: from getter */
        public final int getF217215f() {
            return this.f217215f;
        }

        @Override // com.avito.android.photo_gallery.grid_gallery.items.GridGalleryItemEntity
        @k
        /* renamed from: b6, reason: from getter */
        public final PositionType getF217214e() {
            return this.f217214e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoPreview)) {
                return false;
            }
            VideoPreview videoPreview = (VideoPreview) obj;
            return L.f(this.f217211b, videoPreview.f217211b) && this.f217212c == videoPreview.f217212c && this.f217213d == videoPreview.f217213d && this.f217214e == videoPreview.f217214e && this.f217215f == videoPreview.f217215f;
        }

        @Override // com.avito.android.photo_gallery.grid_gallery.items.GridGalleryItemEntity
        @k
        /* renamed from: getPreview, reason: from getter */
        public final Image getF217211b() {
            return this.f217211b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f217215f) + ((this.f217214e.hashCode() + r.e(this.f217213d, r.e(this.f217212c, this.f217211b.hashCode() * 31, 31), 31)) * 31);
        }

        @Override // com.avito.android.photo_gallery.grid_gallery.items.GridGalleryItemEntity
        /* renamed from: r0, reason: from getter */
        public final int getF217213d() {
            return this.f217213d;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VideoPreview(preview=");
            sb2.append(this.f217211b);
            sb2.append(", fullScreenGalleryPosition=");
            sb2.append(this.f217212c);
            sb2.append(", advertGalleryPosition=");
            sb2.append(this.f217213d);
            sb2.append(", positionType=");
            sb2.append(this.f217214e);
            sb2.append(", gridGalleryPosition=");
            return r.t(sb2, this.f217215f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f217211b, i12);
            parcel.writeInt(this.f217212c);
            parcel.writeInt(this.f217213d);
            parcel.writeString(this.f217214e.name());
            parcel.writeInt(this.f217215f);
        }

        @Override // com.avito.android.photo_gallery.grid_gallery.items.GridGalleryItemEntity
        /* renamed from: z3, reason: from getter */
        public final int getF217212c() {
            return this.f217212c;
        }
    }

    /* renamed from: T1 */
    int getF217215f();

    @k
    /* renamed from: b6 */
    PositionType getF217214e();

    @k
    /* renamed from: getPreview */
    Image getF217211b();

    /* renamed from: r0 */
    int getF217213d();

    /* renamed from: z3 */
    int getF217212c();
}
