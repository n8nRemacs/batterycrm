package com.avito.android.tariff.remote.model.cpx;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: CpxConfigureLandingResult.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/avito/android/tariff/remote/model/cpx/Badge;", "", "", "title", "Lcom/avito/android/tariff/remote/model/cpx/Badge$Type;", "type", "Lcom/avito/android/tariff/remote/model/cpx/Badge$Edge;", "leftEndType", "rightEndType", "<init>", "(Ljava/lang/String;Lcom/avito/android/tariff/remote/model/cpx/Badge$Type;Lcom/avito/android/tariff/remote/model/cpx/Badge$Edge;Lcom/avito/android/tariff/remote/model/cpx/Badge$Edge;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/tariff/remote/model/cpx/Badge$Type;", "d", "()Lcom/avito/android/tariff/remote/model/cpx/Badge$Type;", "Lcom/avito/android/tariff/remote/model/cpx/Badge$Edge;", "a", "()Lcom/avito/android/tariff/remote/model/cpx/Badge$Edge;", "b", "Edge", "Type", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Badge {

    @c("leftEndType")
    @k
    private final Edge leftEndType;

    @c("rightEndType")
    @k
    private final Edge rightEndType;

    @c("title")
    @k
    private final String title;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CpxConfigureLandingResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/tariff/remote/model/cpx/Badge$Edge;", "", "(Ljava/lang/String;I)V", "SQUARE", "FLAG", "PIPKA", "PYRAMID", "ANTI_PYRAMID", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Edge {

        @c("antiPyramid")
        public static final Edge ANTI_PYRAMID;

        @c("flag")
        public static final Edge FLAG;

        @c("pipka")
        public static final Edge PIPKA;

        @c("pyramid")
        public static final Edge PYRAMID;

        @c("square")
        public static final Edge SQUARE;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Edge[] f297489b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f297490c;

        static {
            Edge edge = new Edge("SQUARE", 0);
            SQUARE = edge;
            Edge edge2 = new Edge("FLAG", 1);
            FLAG = edge2;
            Edge edge3 = new Edge("PIPKA", 2);
            PIPKA = edge3;
            Edge edge4 = new Edge("PYRAMID", 3);
            PYRAMID = edge4;
            Edge edge5 = new Edge("ANTI_PYRAMID", 4);
            ANTI_PYRAMID = edge5;
            Edge[] edgeArr = {edge, edge2, edge3, edge4, edge5};
            f297489b = edgeArr;
            f297490c = kotlin.enums.c.a(edgeArr);
        }

        private Edge(String str, int i12) {
        }

        public static Edge valueOf(String str) {
            return (Edge) Enum.valueOf(Edge.class, str);
        }

        public static Edge[] values() {
            return (Edge[]) f297489b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CpxConfigureLandingResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/tariff/remote/model/cpx/Badge$Type;", "", "(Ljava/lang/String;I)V", "GREEN", "VIOLET", "BLUE", "GRAY", "RED", "BLACK", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)
        public static final Type BLACK;

        @c("blue")
        public static final Type BLUE;

        @c("gray")
        public static final Type GRAY;

        @c("green")
        public static final Type GREEN;

        @c("red")
        public static final Type RED;

        @c("violet")
        public static final Type VIOLET;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f297491b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f297492c;

        static {
            Type type = new Type("GREEN", 0);
            GREEN = type;
            Type type2 = new Type("VIOLET", 1);
            VIOLET = type2;
            Type type3 = new Type("BLUE", 2);
            BLUE = type3;
            Type type4 = new Type("GRAY", 3);
            GRAY = type4;
            Type type5 = new Type("RED", 4);
            RED = type5;
            Type type6 = new Type("BLACK", 5);
            BLACK = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
            f297491b = typeArr;
            f297492c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f297491b.clone();
        }
    }

    public Badge(@k String str, @k Type type, @k Edge edge, @k Edge edge2) {
        this.title = str;
        this.type = type;
        this.leftEndType = edge;
        this.rightEndType = edge2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Edge getLeftEndType() {
        return this.leftEndType;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Edge getRightEndType() {
        return this.rightEndType;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
