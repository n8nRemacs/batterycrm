package com.avito.android.remote.model.advert_docking_badge_bar;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDockingBadgeBar.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge;", "badges", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getBadges", "Badge", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertDockingBadgeBar implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertDockingBadgeBar> CREATOR = new Creator();

    @c("badges")
    @k
    private final List<Badge> badges;

    /* compiled from: AdvertDockingBadgeBar.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002+,B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b*\u0010\u0010¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge$Type;", "type", "Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge$Edge;", "startEdge", "endEdge", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge$Type;Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge$Edge;Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge$Edge;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge$Type;", "component3", "()Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge$Edge;", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge$Type;Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge$Edge;Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge$Edge;)Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge$Type;", "getType", "Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge$Edge;", "getStartEdge", "getEndEdge", "Edge", "Type", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Badge implements Parcelable {

        @k
        public static final Parcelable.Creator<Badge> CREATOR = new Creator();

        @c("endEdge")
        @l
        private final Edge endEdge;

        @c("startEdge")
        @l
        private final Edge startEdge;

        @c("title")
        @k
        private final String title;

        @c("type")
        @l
        private final Type type;

        /* compiled from: AdvertDockingBadgeBar.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Badge> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Badge createFromParcel(@k Parcel parcel) {
                return new Badge(parcel.readString(), parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Edge.valueOf(parcel.readString()), parcel.readInt() != 0 ? Edge.valueOf(parcel.readString()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Badge[] newArray(int i12) {
                return new Badge[i12];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AdvertDockingBadgeBar.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge$Edge;", "", "(Ljava/lang/String;I)V", "SQUARE", "FLAG", "PIPKA", "PYRAMID", "ANTI_PYRAMID", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AdvertDockingBadgeBar.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/advert_docking_badge_bar/AdvertDockingBadgeBar$Badge$Type;", "", "(Ljava/lang/String;I)V", "GREEN", "VIOLET", "BLUE", "GRAY", "RED", "BLACK", "SPECIAL_BLACK", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @c("green")
            public static final Type GREEN = new Type("GREEN", 0);

            @c("violet")
            public static final Type VIOLET = new Type("VIOLET", 1);

            @c("blue")
            public static final Type BLUE = new Type("BLUE", 2);

            @c("gray")
            public static final Type GRAY = new Type("GRAY", 3);

            @c("red")
            public static final Type RED = new Type("RED", 4);

            @c(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)
            public static final Type BLACK = new Type("BLACK", 5);

            @c("specialBlack")
            public static final Type SPECIAL_BLACK = new Type("SPECIAL_BLACK", 6);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{GREEN, VIOLET, BLUE, GRAY, RED, BLACK, SPECIAL_BLACK};
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = kotlin.enums.c.a(typeArr$values);
            }

            private Type(String str, int i12) {
            }

            @k
            public static a<Type> getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public Badge(@k String str, @l Type type, @l Edge edge, @l Edge edge2) {
            this.title = str;
            this.type = type;
            this.startEdge = edge;
            this.endEdge = edge2;
        }

        public static /* synthetic */ Badge copy$default(Badge badge, String str, Type type, Edge edge, Edge edge2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = badge.title;
            }
            if ((i12 & 2) != 0) {
                type = badge.type;
            }
            if ((i12 & 4) != 0) {
                edge = badge.startEdge;
            }
            if ((i12 & 8) != 0) {
                edge2 = badge.endEdge;
            }
            return badge.copy(str, type, edge, edge2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Edge getStartEdge() {
            return this.startEdge;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Edge getEndEdge() {
            return this.endEdge;
        }

        @k
        public final Badge copy(@k String title, @l Type type, @l Edge startEdge, @l Edge endEdge) {
            return new Badge(title, type, startEdge, endEdge);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) other;
            return L.f(this.title, badge.title) && this.type == badge.type && this.startEdge == badge.startEdge && this.endEdge == badge.endEdge;
        }

        @l
        public final Edge getEndEdge() {
            return this.endEdge;
        }

        @l
        public final Edge getStartEdge() {
            return this.startEdge;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            Type type = this.type;
            int iHashCode2 = (iHashCode + (type == null ? 0 : type.hashCode())) * 31;
            Edge edge = this.startEdge;
            int iHashCode3 = (iHashCode2 + (edge == null ? 0 : edge.hashCode())) * 31;
            Edge edge2 = this.endEdge;
            return iHashCode3 + (edge2 != null ? edge2.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Badge(title=" + this.title + ", type=" + this.type + ", startEdge=" + this.startEdge + ", endEdge=" + this.endEdge + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            Type type = this.type;
            if (type == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(type.name());
            }
            Edge edge = this.startEdge;
            if (edge == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(edge.name());
            }
            Edge edge2 = this.endEdge;
            if (edge2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(edge2.name());
            }
        }
    }

    /* compiled from: AdvertDockingBadgeBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertDockingBadgeBar> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDockingBadgeBar createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Badge.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AdvertDockingBadgeBar(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDockingBadgeBar[] newArray(int i12) {
            return new AdvertDockingBadgeBar[i12];
        }
    }

    public AdvertDockingBadgeBar(@k List<Badge> list) {
        this.badges = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvertDockingBadgeBar copy$default(AdvertDockingBadgeBar advertDockingBadgeBar, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = advertDockingBadgeBar.badges;
        }
        return advertDockingBadgeBar.copy(list);
    }

    @k
    public final List<Badge> component1() {
        return this.badges;
    }

    @k
    public final AdvertDockingBadgeBar copy(@k List<Badge> badges) {
        return new AdvertDockingBadgeBar(badges);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AdvertDockingBadgeBar) && L.f(this.badges, ((AdvertDockingBadgeBar) other).badges);
    }

    @k
    public final List<Badge> getBadges() {
        return this.badges;
    }

    public int hashCode() {
        return this.badges.hashCode();
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("AdvertDockingBadgeBar(badges="), this.badges, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.badges, parcel);
        while (itJ.hasNext()) {
            ((Badge) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
