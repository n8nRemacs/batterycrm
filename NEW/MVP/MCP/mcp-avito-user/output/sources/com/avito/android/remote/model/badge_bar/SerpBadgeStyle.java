package com.avito.android.remote.model.badge_bar;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;

/* compiled from: SerpBadgeStyle.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0002%&BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b!\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/badge_bar/SerpBadgeStyle;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "fontColor", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeStyle$DockingStyle;", "leftEdgeStyle", "rightEdgeStyle", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeStyle$DockingSize;", "size", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/badge_bar/SerpBadgeStyle$DockingStyle;Lcom/avito/android/remote/model/badge_bar/SerpBadgeStyle$DockingStyle;Lcom/avito/android/remote/model/badge_bar/SerpBadgeStyle$DockingSize;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getFontColor", "Lcom/avito/android/remote/model/UniversalImage;", "getIcon", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeStyle$DockingStyle;", "getLeftEdgeStyle", "()Lcom/avito/android/remote/model/badge_bar/SerpBadgeStyle$DockingStyle;", "getRightEdgeStyle", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeStyle$DockingSize;", "getSize", "()Lcom/avito/android/remote/model/badge_bar/SerpBadgeStyle$DockingSize;", "DockingSize", "DockingStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SerpBadgeStyle implements Parcelable {

    @k
    public static final Parcelable.Creator<SerpBadgeStyle> CREATOR = new Creator();

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("fontColor")
    @l
    private final UniversalColor fontColor;

    @c("icon")
    @l
    private final UniversalImage icon;

    @c("leftEdgeStyle")
    @l
    private final DockingStyle leftEdgeStyle;

    @c("rightEdgeStyle")
    @l
    private final DockingStyle rightEdgeStyle;

    @c("size")
    @l
    private final DockingSize size;

    /* compiled from: SerpBadgeStyle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SerpBadgeStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SerpBadgeStyle createFromParcel(@k Parcel parcel) {
            return new SerpBadgeStyle((UniversalColor) parcel.readParcelable(SerpBadgeStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(SerpBadgeStyle.class.getClassLoader()), (UniversalImage) parcel.readParcelable(SerpBadgeStyle.class.getClassLoader()), parcel.readInt() == 0 ? null : DockingStyle.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : DockingStyle.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : DockingSize.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SerpBadgeStyle[] newArray(int i12) {
            return new SerpBadgeStyle[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SerpBadgeStyle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/badge_bar/SerpBadgeStyle$DockingSize;", "", "(Ljava/lang/String;I)V", "SMALL", "MEDIUM", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DockingSize {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DockingSize[] $VALUES;

        @c(Constants.SMALL)
        public static final DockingSize SMALL = new DockingSize("SMALL", 0);

        @c("medium")
        public static final DockingSize MEDIUM = new DockingSize("MEDIUM", 1);

        private static final /* synthetic */ DockingSize[] $values() {
            return new DockingSize[]{SMALL, MEDIUM};
        }

        static {
            DockingSize[] dockingSizeArr$values = $values();
            $VALUES = dockingSizeArr$values;
            $ENTRIES = kotlin.enums.c.a(dockingSizeArr$values);
        }

        private DockingSize(String str, int i12) {
        }

        @k
        public static a<DockingSize> getEntries() {
            return $ENTRIES;
        }

        public static DockingSize valueOf(String str) {
            return (DockingSize) Enum.valueOf(DockingSize.class, str);
        }

        public static DockingSize[] values() {
            return (DockingSize[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SerpBadgeStyle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/badge_bar/SerpBadgeStyle$DockingStyle;", "", "(Ljava/lang/String;I)V", "FLAG", "PIPKA", "PYRAMID", "ANTI_PYRAMID", "SQUARE", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DockingStyle {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DockingStyle[] $VALUES;

        @c("flag")
        public static final DockingStyle FLAG = new DockingStyle("FLAG", 0);

        @c("pipka")
        public static final DockingStyle PIPKA = new DockingStyle("PIPKA", 1);

        @c("pyramid")
        public static final DockingStyle PYRAMID = new DockingStyle("PYRAMID", 2);

        @c("antiPyramid")
        public static final DockingStyle ANTI_PYRAMID = new DockingStyle("ANTI_PYRAMID", 3);

        @c("square")
        public static final DockingStyle SQUARE = new DockingStyle("SQUARE", 4);

        private static final /* synthetic */ DockingStyle[] $values() {
            return new DockingStyle[]{FLAG, PIPKA, PYRAMID, ANTI_PYRAMID, SQUARE};
        }

        static {
            DockingStyle[] dockingStyleArr$values = $values();
            $VALUES = dockingStyleArr$values;
            $ENTRIES = kotlin.enums.c.a(dockingStyleArr$values);
        }

        private DockingStyle(String str, int i12) {
        }

        @k
        public static a<DockingStyle> getEntries() {
            return $ENTRIES;
        }

        public static DockingStyle valueOf(String str) {
            return (DockingStyle) Enum.valueOf(DockingStyle.class, str);
        }

        public static DockingStyle[] values() {
            return (DockingStyle[]) $VALUES.clone();
        }
    }

    public SerpBadgeStyle(@l UniversalColor universalColor, @l UniversalColor universalColor2, @l UniversalImage universalImage, @l DockingStyle dockingStyle, @l DockingStyle dockingStyle2, @l DockingSize dockingSize) {
        this.backgroundColor = universalColor;
        this.fontColor = universalColor2;
        this.icon = universalImage;
        this.leftEdgeStyle = dockingStyle;
        this.rightEdgeStyle = dockingStyle2;
        this.size = dockingSize;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final UniversalColor getFontColor() {
        return this.fontColor;
    }

    @l
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @l
    public final DockingStyle getLeftEdgeStyle() {
        return this.leftEdgeStyle;
    }

    @l
    public final DockingStyle getRightEdgeStyle() {
        return this.rightEdgeStyle;
    }

    @l
    public final DockingSize getSize() {
        return this.size;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeParcelable(this.fontColor, flags);
        parcel.writeParcelable(this.icon, flags);
        DockingStyle dockingStyle = this.leftEdgeStyle;
        if (dockingStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dockingStyle.name());
        }
        DockingStyle dockingStyle2 = this.rightEdgeStyle;
        if (dockingStyle2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dockingStyle2.name());
        }
        DockingSize dockingSize = this.size;
        if (dockingSize == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dockingSize.name());
        }
    }

    public /* synthetic */ SerpBadgeStyle(UniversalColor universalColor, UniversalColor universalColor2, UniversalImage universalImage, DockingStyle dockingStyle, DockingStyle dockingStyle2, DockingSize dockingSize, int i12, C42822w c42822w) {
        this(universalColor, universalColor2, (i12 & 4) != 0 ? null : universalImage, (i12 & 8) != 0 ? null : dockingStyle, (i12 & 16) != 0 ? null : dockingStyle2, (i12 & 32) != 0 ? null : dockingSize);
    }
}
