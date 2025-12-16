package com.avito.android.avl_entry.impl.ui.internal_item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import com.google.gson.annotations.c;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ShortVideosWidgetCarouselItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/internal_item/ShortVideosWidgetCarouselItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "ShowAllItem", "VideoItem", "Lcom/avito/android/avl_entry/impl/ui/internal_item/ShortVideosWidgetCarouselItem$ShowAllItem;", "Lcom/avito/android/avl_entry/impl/ui/internal_item/ShortVideosWidgetCarouselItem$VideoItem;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ShortVideosWidgetCarouselItem extends ParcelableItem {

    /* compiled from: ShortVideosWidgetCarouselItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: ShortVideosWidgetCarouselItem.kt */
    @d
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/internal_item/ShortVideosWidgetCarouselItem$ShowAllItem;", "Lcom/avito/android/avl_entry/impl/ui/internal_item/ShortVideosWidgetCarouselItem;", "", "key", "", "entryPosition", "xHash", "", "isSerp", "categoryId", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Ljava/lang/String;", "L", "()Ljava/lang/String;", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "getXHash", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowAllItem implements ShortVideosWidgetCarouselItem {

        @k
        public static final Parcelable.Creator<ShowAllItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f98555b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f98556c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Analytics f98557d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f98558e;

        @c("entryPosition")
        @l
        private final Integer entryPosition;

        @c("key")
        @k
        private final String key;

        @c("xHash")
        @l
        private final String xHash;

        /* compiled from: ShortVideosWidgetCarouselItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowAllItem> {
            @Override // android.os.Parcelable.Creator
            public final ShowAllItem createFromParcel(Parcel parcel) {
                return new ShowAllItem(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), false, parcel.readString(), null, 40, null);
            }

            @Override // android.os.Parcelable.Creator
            public final ShowAllItem[] newArray(int i12) {
                return new ShowAllItem[i12];
            }
        }

        public ShowAllItem(@k String str, @l Integer num, @l String str2, boolean z12, @l String str3, @l Analytics analytics) {
            this.key = str;
            this.entryPosition = num;
            this.xHash = str2;
            this.f98555b = z12;
            this.f98556c = str3;
            this.f98557d = analytics;
            this.f98558e = UUID.randomUUID().toString();
        }

        @k
        /* renamed from: L, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowAllItem)) {
                return false;
            }
            ShowAllItem showAllItem = (ShowAllItem) obj;
            return L.f(this.key, showAllItem.key) && L.f(this.entryPosition, showAllItem.entryPosition) && L.f(this.xHash, showAllItem.xHash) && this.f98555b == showAllItem.f98555b && L.f(this.f98556c, showAllItem.f98556c) && L.f(this.f98557d, showAllItem.f98557d);
        }

        @l
        /* renamed from: f, reason: from getter */
        public final Integer getEntryPosition() {
            return this.entryPosition;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF77564b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF75240b() {
            return this.f98558e;
        }

        @l
        public final String getXHash() {
            return this.xHash;
        }

        public final int hashCode() {
            int iHashCode = this.key.hashCode() * 31;
            Integer num = this.entryPosition;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.xHash;
            int i12 = r.i((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f98555b);
            String str2 = this.f98556c;
            int iHashCode3 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Analytics analytics = this.f98557d;
            return iHashCode3 + (analytics != null ? analytics.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ShowAllItem(key=" + this.key + ", entryPosition=" + this.entryPosition + ", xHash=" + this.xHash + ", isSerp=" + this.f98555b + ", categoryId=" + this.f98556c + ", analytics=" + this.f98557d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.key);
            Integer num = this.entryPosition;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeString(this.xHash);
            parcel.writeString(this.f98556c);
        }

        public /* synthetic */ ShowAllItem(String str, Integer num, String str2, boolean z12, String str3, Analytics analytics, int i12, C42822w c42822w) {
            this(str, num, str2, (i12 & 8) != 0 ? false : z12, str3, (i12 & 32) != 0 ? null : analytics);
        }
    }

    /* compiled from: ShortVideosWidgetCarouselItem.kt */
    @d
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b\u000b\u0010#R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b\f\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b)\u0010\u001c¨\u0006*"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/internal_item/ShortVideosWidgetCarouselItem$VideoItem;", "Lcom/avito/android/avl_entry/impl/ui/internal_item/ShortVideosWidgetCarouselItem;", "Lcom/avito/android/remote/model/Image;", "thumbnail", "", "videoUrl", "previewUrl", "key", "", "videoLength", "", "isFirst", "isLast", "categoryId", "itemId", "", "entryPosition", "xHash", "isSerp", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/Image;", "getThumbnail", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "getVideoUrl", "()Ljava/lang/String;", "getPreviewUrl", "L", "Ljava/lang/Long;", "W", "()Ljava/lang/Long;", "Z", "()Z", "getCategoryId", "getItemId", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "getXHash", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VideoItem implements ShortVideosWidgetCarouselItem {

        @k
        public static final Parcelable.Creator<VideoItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f98559b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Analytics f98560c;

        @c("categoryId")
        @l
        private final String categoryId;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f98561d;

        @c("entryPosition")
        @l
        private final Integer entryPosition;

        @c("isFirst")
        private final boolean isFirst;

        @c("isLast")
        private final boolean isLast;

        @c("itemId")
        @l
        private final String itemId;

        @c("key")
        @k
        private final String key;

        @c("previewUrl")
        @l
        private final String previewUrl;

        @c("thumbnail")
        @l
        private final Image thumbnail;

        @c("videoLength")
        @l
        private final Long videoLength;

        @c("videoUrl")
        @k
        private final String videoUrl;

        @c("xHash")
        @l
        private final String xHash;

        /* compiled from: ShortVideosWidgetCarouselItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<VideoItem> {
            @Override // android.os.Parcelable.Creator
            public final VideoItem createFromParcel(Parcel parcel) {
                return new VideoItem((Image) parcel.readParcelable(VideoItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), false, null, 6144, null);
            }

            @Override // android.os.Parcelable.Creator
            public final VideoItem[] newArray(int i12) {
                return new VideoItem[i12];
            }
        }

        public VideoItem(@l Image image, @k String str, @l String str2, @k String str3, @l Long l12, boolean z12, boolean z13, @l String str4, @l String str5, @l Integer num, @l String str6, boolean z14, @l Analytics analytics) {
            this.thumbnail = image;
            this.videoUrl = str;
            this.previewUrl = str2;
            this.key = str3;
            this.videoLength = l12;
            this.isFirst = z12;
            this.isLast = z13;
            this.categoryId = str4;
            this.itemId = str5;
            this.entryPosition = num;
            this.xHash = str6;
            this.f98559b = z14;
            this.f98560c = analytics;
            this.f98561d = UUID.randomUUID().toString();
        }

        @k
        /* renamed from: L, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @l
        /* renamed from: W, reason: from getter */
        public final Long getVideoLength() {
            return this.videoLength;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoItem)) {
                return false;
            }
            VideoItem videoItem = (VideoItem) obj;
            return L.f(this.thumbnail, videoItem.thumbnail) && L.f(this.videoUrl, videoItem.videoUrl) && L.f(this.previewUrl, videoItem.previewUrl) && L.f(this.key, videoItem.key) && L.f(this.videoLength, videoItem.videoLength) && this.isFirst == videoItem.isFirst && this.isLast == videoItem.isLast && L.f(this.categoryId, videoItem.categoryId) && L.f(this.itemId, videoItem.itemId) && L.f(this.entryPosition, videoItem.entryPosition) && L.f(this.xHash, videoItem.xHash) && this.f98559b == videoItem.f98559b && L.f(this.f98560c, videoItem.f98560c);
        }

        @l
        /* renamed from: f, reason: from getter */
        public final Integer getEntryPosition() {
            return this.entryPosition;
        }

        @l
        public final String getCategoryId() {
            return this.categoryId;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF85532b() {
            return a.C10492a.a(this);
        }

        @l
        public final String getItemId() {
            return this.itemId;
        }

        @l
        public final String getPreviewUrl() {
            return this.previewUrl;
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF85533c() {
            return this.f98561d;
        }

        @l
        public final Image getThumbnail() {
            return this.thumbnail;
        }

        @k
        public final String getVideoUrl() {
            return this.videoUrl;
        }

        @l
        public final String getXHash() {
            return this.xHash;
        }

        public final int hashCode() {
            Image image = this.thumbnail;
            int iD2 = H.d((image == null ? 0 : image.hashCode()) * 31, 31, this.videoUrl);
            String str = this.previewUrl;
            int iD3 = H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.key);
            Long l12 = this.videoLength;
            int i12 = r.i(r.i((iD3 + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.isFirst), 31, this.isLast);
            String str2 = this.categoryId;
            int iHashCode = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.itemId;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.entryPosition;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str4 = this.xHash;
            int i13 = r.i((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f98559b);
            Analytics analytics = this.f98560c;
            return i13 + (analytics != null ? analytics.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "VideoItem(thumbnail=" + this.thumbnail + ", videoUrl=" + this.videoUrl + ", previewUrl=" + this.previewUrl + ", key=" + this.key + ", videoLength=" + this.videoLength + ", isFirst=" + this.isFirst + ", isLast=" + this.isLast + ", categoryId=" + this.categoryId + ", itemId=" + this.itemId + ", entryPosition=" + this.entryPosition + ", xHash=" + this.xHash + ", isSerp=" + this.f98559b + ", analytics=" + this.f98560c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.thumbnail, i12);
            parcel.writeString(this.videoUrl);
            parcel.writeString(this.previewUrl);
            parcel.writeString(this.key);
            Long l12 = this.videoLength;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeInt(this.isFirst ? 1 : 0);
            parcel.writeInt(this.isLast ? 1 : 0);
            parcel.writeString(this.categoryId);
            parcel.writeString(this.itemId);
            Integer num = this.entryPosition;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeString(this.xHash);
        }

        public /* synthetic */ VideoItem(Image image, String str, String str2, String str3, Long l12, boolean z12, boolean z13, String str4, String str5, Integer num, String str6, boolean z14, Analytics analytics, int i12, C42822w c42822w) {
            this(image, str, str2, str3, l12, z12, z13, str4, str5, num, str6, (i12 & 2048) != 0 ? false : z14, (i12 & 4096) != 0 ? null : analytics);
        }
    }
}
