package com.avito.android.remote.model.rating_details_mvi;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.UniversalImage;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: RatingDetailsEntry.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001:\u0003)*+BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/InfoEntry;", "Lcom/avito/android/remote/model/rating_details_mvi/RatingDetailsEntry;", "", "title", "titleSize", "titleColor", "subtitle", "subtitleColor", "Lcom/avito/android/remote/model/rating_details_mvi/InfoEntry$InfoHint;", "hint", "Lcom/avito/android/remote/model/rating_details_mvi/InfoEntry$InfoHorizontalAlign;", "horizontalAlign", "Lcom/avito/android/remote/model/rating_details_mvi/InfoEntry$InfoImage;", "imageInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/rating_details_mvi/InfoEntry$InfoHint;Lcom/avito/android/remote/model/rating_details_mvi/InfoEntry$InfoHorizontalAlign;Lcom/avito/android/remote/model/rating_details_mvi/InfoEntry$InfoImage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitleSize", "getTitleColor", "getSubtitle", "getSubtitleColor", "Lcom/avito/android/remote/model/rating_details_mvi/InfoEntry$InfoHint;", "getHint", "()Lcom/avito/android/remote/model/rating_details_mvi/InfoEntry$InfoHint;", "Lcom/avito/android/remote/model/rating_details_mvi/InfoEntry$InfoHorizontalAlign;", "getHorizontalAlign", "()Lcom/avito/android/remote/model/rating_details_mvi/InfoEntry$InfoHorizontalAlign;", "Lcom/avito/android/remote/model/rating_details_mvi/InfoEntry$InfoImage;", "getImageInfo", "()Lcom/avito/android/remote/model/rating_details_mvi/InfoEntry$InfoImage;", "InfoHint", "InfoHorizontalAlign", "InfoImage", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InfoEntry implements RatingDetailsEntry {

    @k
    public static final Parcelable.Creator<InfoEntry> CREATOR = new Creator();

    @c("hint")
    @l
    private final InfoHint hint;

    @c("horizontalAlign")
    @l
    private final InfoHorizontalAlign horizontalAlign;

    @c("imageInfo")
    @l
    private final InfoImage imageInfo;

    @c("subTitle")
    @l
    private final String subtitle;

    @c("subTitleColor")
    @l
    private final String subtitleColor;

    @c("title")
    @k
    private final String title;

    @c("titleColor")
    @l
    private final String titleColor;

    @c("titleSize")
    @l
    private final String titleSize;

    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InfoEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InfoEntry createFromParcel(@k Parcel parcel) {
            return new InfoEntry(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : InfoHint.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InfoHorizontalAlign.valueOf(parcel.readString()), parcel.readInt() != 0 ? InfoImage.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InfoEntry[] newArray(int i12) {
            return new InfoEntry[i12];
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @d
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/InfoEntry$InfoHint;", "Landroid/os/Parcelable;", "", "title", "text", "Lcom/avito/android/remote/model/Action;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Action;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InfoHint implements Parcelable {

        @k
        public static final Parcelable.Creator<InfoHint> CREATOR = new Creator();

        @c("action")
        @l
        private final Action action;

        @c("text")
        @k
        private final String text;

        @c("title")
        @l
        private final String title;

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InfoHint> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InfoHint createFromParcel(@k Parcel parcel) {
                return new InfoHint(parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(InfoHint.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InfoHint[] newArray(int i12) {
                return new InfoHint[i12];
            }
        }

        public InfoHint(@l String str, @k String str2, @l Action action) {
            this.title = str;
            this.text = str2;
            this.action = action;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Action getAction() {
            return this.action;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.text);
            parcel.writeParcelable(this.action, flags);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RatingDetailsEntry.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/InfoEntry$InfoHorizontalAlign;", "", "(Ljava/lang/String;I)V", "CENTER", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InfoHorizontalAlign {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ InfoHorizontalAlign[] $VALUES;

        @c("center")
        public static final InfoHorizontalAlign CENTER = new InfoHorizontalAlign("CENTER", 0);

        private static final /* synthetic */ InfoHorizontalAlign[] $values() {
            return new InfoHorizontalAlign[]{CENTER};
        }

        static {
            InfoHorizontalAlign[] infoHorizontalAlignArr$values = $values();
            $VALUES = infoHorizontalAlignArr$values;
            $ENTRIES = kotlin.enums.c.a(infoHorizontalAlignArr$values);
        }

        private InfoHorizontalAlign(String str, int i12) {
        }

        @k
        public static a<InfoHorizontalAlign> getEntries() {
            return $ENTRIES;
        }

        public static InfoHorizontalAlign valueOf(String str) {
            return (InfoHorizontalAlign) Enum.valueOf(InfoHorizontalAlign.class, str);
        }

        public static InfoHorizontalAlign[] values() {
            return (InfoHorizontalAlign[]) $VALUES.clone();
        }
    }

    /* compiled from: RatingDetailsEntry.kt */
    @d
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/rating_details_mvi/InfoEntry$InfoImage;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "width", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;I)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "I", "getWidth", "_avito-discouraged_avito-network_rating-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InfoImage implements Parcelable {

        @k
        public static final Parcelable.Creator<InfoImage> CREATOR = new Creator();

        @c("image")
        @k
        private final UniversalImage image;

        @c("width")
        private final int width;

        /* compiled from: RatingDetailsEntry.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InfoImage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InfoImage createFromParcel(@k Parcel parcel) {
                return new InfoImage((UniversalImage) parcel.readParcelable(InfoImage.class.getClassLoader()), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InfoImage[] newArray(int i12) {
                return new InfoImage[i12];
            }
        }

        public InfoImage(@k UniversalImage universalImage, int i12) {
            this.image = universalImage;
            this.width = i12;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final UniversalImage getImage() {
            return this.image;
        }

        public final int getWidth() {
            return this.width;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.image, flags);
            parcel.writeInt(this.width);
        }
    }

    public InfoEntry(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l InfoHint infoHint, @l InfoHorizontalAlign infoHorizontalAlign, @l InfoImage infoImage) {
        this.title = str;
        this.titleSize = str2;
        this.titleColor = str3;
        this.subtitle = str4;
        this.subtitleColor = str5;
        this.hint = infoHint;
        this.horizontalAlign = infoHorizontalAlign;
        this.imageInfo = infoImage;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final InfoHint getHint() {
        return this.hint;
    }

    @l
    public final InfoHorizontalAlign getHorizontalAlign() {
        return this.horizontalAlign;
    }

    @l
    public final InfoImage getImageInfo() {
        return this.imageInfo;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getSubtitleColor() {
        return this.subtitleColor;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getTitleColor() {
        return this.titleColor;
    }

    @l
    public final String getTitleSize() {
        return this.titleSize;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.titleSize);
        parcel.writeString(this.titleColor);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.subtitleColor);
        InfoHint infoHint = this.hint;
        if (infoHint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            infoHint.writeToParcel(parcel, flags);
        }
        InfoHorizontalAlign infoHorizontalAlign = this.horizontalAlign;
        if (infoHorizontalAlign == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(infoHorizontalAlign.name());
        }
        InfoImage infoImage = this.imageInfo;
        if (infoImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            infoImage.writeToParcel(parcel, flags);
        }
    }
}
