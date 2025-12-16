package com.avito.android.remote.model.advert_badge_bar;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: AdvertBadgeStyle.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\"BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeStyle;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "backgroundPressedColor", "fontColor", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeStyle$Edge;", "leftEdgeStyle", "rightEdgeStyle", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeStyle$Edge;Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeStyle$Edge;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundPressedColor", "getFontColor", "Lcom/avito/android/remote/model/UniversalImage;", "getIcon", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeStyle$Edge;", "getLeftEdgeStyle", "()Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeStyle$Edge;", "getRightEdgeStyle", "Edge", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertBadgeStyle implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertBadgeStyle> CREATOR = new Creator();

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("backgroundPressedColor")
    @l
    private final UniversalColor backgroundPressedColor;

    @c("fontColor")
    @l
    private final UniversalColor fontColor;

    @c("icon")
    @l
    private final UniversalImage icon;

    @c("leftEdgeStyle")
    @l
    private final Edge leftEdgeStyle;

    @c("rightEdgeStyle")
    @l
    private final Edge rightEdgeStyle;

    /* compiled from: AdvertBadgeStyle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertBadgeStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertBadgeStyle createFromParcel(@k Parcel parcel) {
            return new AdvertBadgeStyle((UniversalColor) parcel.readParcelable(AdvertBadgeStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(AdvertBadgeStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(AdvertBadgeStyle.class.getClassLoader()), (UniversalImage) parcel.readParcelable(AdvertBadgeStyle.class.getClassLoader()), parcel.readInt() == 0 ? null : Edge.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Edge.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertBadgeStyle[] newArray(int i12) {
            return new AdvertBadgeStyle[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertBadgeStyle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/advert_badge_bar/AdvertBadgeStyle$Edge;", "", "(Ljava/lang/String;I)V", "SQUARE", "FLAG", "PIPKA", "PYRAMID", "ANTI_PYRAMID", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Edge {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Edge[] $VALUES;

        @c("square")
        public static final Edge SQUARE = new Edge("SQUARE", 0);

        @c("flag")
        public static final Edge FLAG = new Edge("FLAG", 1);

        @c("pipka")
        public static final Edge PIPKA = new Edge("PIPKA", 2);

        @c("pyramid")
        public static final Edge PYRAMID = new Edge("PYRAMID", 3);

        @c("antiPyramid")
        public static final Edge ANTI_PYRAMID = new Edge("ANTI_PYRAMID", 4);

        private static final /* synthetic */ Edge[] $values() {
            return new Edge[]{SQUARE, FLAG, PIPKA, PYRAMID, ANTI_PYRAMID};
        }

        static {
            Edge[] edgeArr$values = $values();
            $VALUES = edgeArr$values;
            $ENTRIES = kotlin.enums.c.a(edgeArr$values);
        }

        private Edge(String str, int i12) {
        }

        @k
        public static a<Edge> getEntries() {
            return $ENTRIES;
        }

        public static Edge valueOf(String str) {
            return (Edge) Enum.valueOf(Edge.class, str);
        }

        public static Edge[] values() {
            return (Edge[]) $VALUES.clone();
        }
    }

    public AdvertBadgeStyle(@l UniversalColor universalColor, @l UniversalColor universalColor2, @l UniversalColor universalColor3, @l UniversalImage universalImage, @l Edge edge, @l Edge edge2) {
        this.backgroundColor = universalColor;
        this.backgroundPressedColor = universalColor2;
        this.fontColor = universalColor3;
        this.icon = universalImage;
        this.leftEdgeStyle = edge;
        this.rightEdgeStyle = edge2;
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
    public final UniversalColor getBackgroundPressedColor() {
        return this.backgroundPressedColor;
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
    public final Edge getLeftEdgeStyle() {
        return this.leftEdgeStyle;
    }

    @l
    public final Edge getRightEdgeStyle() {
        return this.rightEdgeStyle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeParcelable(this.backgroundPressedColor, flags);
        parcel.writeParcelable(this.fontColor, flags);
        parcel.writeParcelable(this.icon, flags);
        Edge edge = this.leftEdgeStyle;
        if (edge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(edge.name());
        }
        Edge edge2 = this.rightEdgeStyle;
        if (edge2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(edge2.name());
        }
    }
}
