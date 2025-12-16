package com.avito.android.avl_public.repo;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.remote.model.UniversalColor;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvlRepository.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/avl_public/repo/AvlVideoItem;", "Lcom/avito/android/avl_public/repo/BaseAvlVideoItem;", "ShortVideoStatus", "_avito_avl_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AvlVideoItem implements BaseAvlVideoItem {

    @k
    public static final Parcelable.Creator<AvlVideoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final SerpAdvert f98637b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Image f98638c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f98639d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f98640e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f98641f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ShortVideoStatus f98642g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f98643h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f98644i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f98645j;

    /* compiled from: AvlRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/avl_public/repo/AvlVideoItem$ShortVideoStatus;", "Landroid/os/Parcelable;", "ShortVideosStatusIcon", "_avito_avl_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ShortVideoStatus implements Parcelable {

        @k
        public static final Parcelable.Creator<ShortVideoStatus> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f98646b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ShortVideosStatusIcon f98647c;

        /* compiled from: AvlRepository.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl_public/repo/AvlVideoItem$ShortVideoStatus$ShortVideosStatusIcon;", "Landroid/os/Parcelable;", "_avito_avl_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShortVideosStatusIcon implements Parcelable {

            @k
            public static final Parcelable.Creator<ShortVideosStatusIcon> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f98648b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final UniversalColor f98649c;

            /* compiled from: AvlRepository.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ShortVideosStatusIcon> {
                @Override // android.os.Parcelable.Creator
                public final ShortVideosStatusIcon createFromParcel(Parcel parcel) {
                    return new ShortVideosStatusIcon(parcel.readString(), (UniversalColor) parcel.readParcelable(ShortVideosStatusIcon.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ShortVideosStatusIcon[] newArray(int i12) {
                    return new ShortVideosStatusIcon[i12];
                }
            }

            public ShortVideosStatusIcon(@k String str, @k UniversalColor universalColor) {
                this.f98648b = str;
                this.f98649c = universalColor;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShortVideosStatusIcon)) {
                    return false;
                }
                ShortVideosStatusIcon shortVideosStatusIcon = (ShortVideosStatusIcon) obj;
                return L.f(this.f98648b, shortVideosStatusIcon.f98648b) && L.f(this.f98649c, shortVideosStatusIcon.f98649c);
            }

            public final int hashCode() {
                return this.f98649c.hashCode() + (this.f98648b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ShortVideosStatusIcon(name=");
                sb2.append(this.f98648b);
                sb2.append(", color=");
                return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f98649c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f98648b);
                parcel.writeParcelable(this.f98649c, i12);
            }
        }

        /* compiled from: AvlRepository.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShortVideoStatus> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoStatus createFromParcel(Parcel parcel) {
                return new ShortVideoStatus(parcel.readString(), parcel.readInt() == 0 ? null : ShortVideosStatusIcon.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoStatus[] newArray(int i12) {
                return new ShortVideoStatus[i12];
            }
        }

        public ShortVideoStatus(@l String str, @l ShortVideosStatusIcon shortVideosStatusIcon) {
            this.f98646b = str;
            this.f98647c = shortVideosStatusIcon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoStatus)) {
                return false;
            }
            ShortVideoStatus shortVideoStatus = (ShortVideoStatus) obj;
            return L.f(this.f98646b, shortVideoStatus.f98646b) && L.f(this.f98647c, shortVideoStatus.f98647c);
        }

        public final int hashCode() {
            String str = this.f98646b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            ShortVideosStatusIcon shortVideosStatusIcon = this.f98647c;
            return iHashCode + (shortVideosStatusIcon != null ? shortVideosStatusIcon.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ShortVideoStatus(text=" + this.f98646b + ", icon=" + this.f98647c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f98646b);
            ShortVideosStatusIcon shortVideosStatusIcon = this.f98647c;
            if (shortVideosStatusIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                shortVideosStatusIcon.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: AvlRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AvlVideoItem> {
        @Override // android.os.Parcelable.Creator
        public final AvlVideoItem createFromParcel(Parcel parcel) {
            return new AvlVideoItem((SerpAdvert) parcel.readParcelable(AvlVideoItem.class.getClassLoader()), (Image) parcel.readParcelable(AvlVideoItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ShortVideoStatus.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AvlVideoItem[] newArray(int i12) {
            return new AvlVideoItem[i12];
        }
    }

    public AvlVideoItem(@l SerpAdvert serpAdvert, @l Image image, @l String str, @l String str2, @l String str3, @l ShortVideoStatus shortVideoStatus) {
        this.f98637b = serpAdvert;
        this.f98638c = image;
        this.f98639d = str;
        this.f98640e = str2;
        this.f98641f = str3;
        this.f98642g = shortVideoStatus;
        this.f98643h = str == null ? "" : str;
        this.f98644i = serpAdvert != null ? serpAdvert.getId() : null;
        this.f98645j = serpAdvert != null ? serpAdvert.getXHash() : null;
    }

    @Override // com.avito.android.avl_public.repo.BaseAvlVideoItem
    @l
    /* renamed from: F5, reason: from getter */
    public final String getF98641f() {
        return this.f98641f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvlVideoItem)) {
            return false;
        }
        AvlVideoItem avlVideoItem = (AvlVideoItem) obj;
        return L.f(this.f98637b, avlVideoItem.f98637b) && L.f(this.f98638c, avlVideoItem.f98638c) && L.f(this.f98639d, avlVideoItem.f98639d) && L.f(this.f98640e, avlVideoItem.f98640e) && L.f(this.f98641f, avlVideoItem.f98641f) && L.f(this.f98642g, avlVideoItem.f98642g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83624b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.avl_public.repo.BaseAvlVideoItem
    @l
    /* renamed from: getItemId, reason: from getter */
    public final String getF98644i() {
        return this.f98644i;
    }

    @Override // com.avito.android.avl_public.repo.BaseAvlVideoItem
    @l
    /* renamed from: getPreviewUrl, reason: from getter */
    public final String getF98640e() {
        return this.f98640e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF324032b() {
        return this.f98643h;
    }

    @Override // com.avito.android.avl_public.repo.BaseAvlVideoItem
    @l
    /* renamed from: getThumbnail, reason: from getter */
    public final Image getF98638c() {
        return this.f98638c;
    }

    @Override // com.avito.android.avl_public.repo.BaseAvlVideoItem
    @l
    /* renamed from: getVideoUrl, reason: from getter */
    public final String getF98639d() {
        return this.f98639d;
    }

    @Override // com.avito.android.avl_public.repo.BaseAvlVideoItem
    @l
    /* renamed from: getXHash, reason: from getter */
    public final String getF98645j() {
        return this.f98645j;
    }

    public final int hashCode() {
        SerpAdvert serpAdvert = this.f98637b;
        int iHashCode = (serpAdvert == null ? 0 : serpAdvert.hashCode()) * 31;
        Image image = this.f98638c;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.f98639d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f98640e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f98641f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ShortVideoStatus shortVideoStatus = this.f98642g;
        return iHashCode5 + (shortVideoStatus != null ? shortVideoStatus.hashCode() : 0);
    }

    @Override // com.avito.android.avl_public.repo.BaseAvlVideoItem
    public final boolean o1(@k com.avito.conveyor_item.a aVar) {
        BaseAvlVideoItem baseAvlVideoItem = aVar instanceof BaseAvlVideoItem ? (BaseAvlVideoItem) aVar : null;
        if (baseAvlVideoItem == null) {
            return false;
        }
        if (!L.f(this.f98644i, baseAvlVideoItem.getF98644i())) {
            if (!L.f(this.f98639d, baseAvlVideoItem.getF98639d())) {
                return false;
            }
        }
        return true;
    }

    @k
    public final String toString() {
        return "AvlVideoItem(item=" + this.f98637b + ", thumbnail=" + this.f98638c + ", videoUrl=" + this.f98639d + ", previewUrl=" + this.f98640e + ", shareUrl=" + this.f98641f + ", status=" + this.f98642g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f98637b, i12);
        parcel.writeParcelable(this.f98638c, i12);
        parcel.writeString(this.f98639d);
        parcel.writeString(this.f98640e);
        parcel.writeString(this.f98641f);
        ShortVideoStatus shortVideoStatus = this.f98642g;
        if (shortVideoStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoStatus.writeToParcel(parcel, i12);
        }
    }
}
