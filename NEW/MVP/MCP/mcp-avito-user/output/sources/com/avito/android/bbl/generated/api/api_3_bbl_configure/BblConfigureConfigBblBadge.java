package com.avito.android.bbl.generated.api.api_3_bbl_configure;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api3BblConfigureResponse.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/avito/android/bbl/generated/api/api_3_bbl_configure/BblConfigureConfigBblBadge;", "", "Lcom/avito/android/bbl/generated/api/api_3_bbl_configure/BblConfigureConfigBblBadge$LeftEndType;", "leftEndType", "Lcom/avito/android/bbl/generated/api/api_3_bbl_configure/BblConfigureConfigBblBadge$RightEndType;", "rightEndType", "Lcom/avito/android/bbl/generated/api/api_3_bbl_configure/BblConfigureConfigBblBadge$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "title", "<init>", "(Lcom/avito/android/bbl/generated/api/api_3_bbl_configure/BblConfigureConfigBblBadge$LeftEndType;Lcom/avito/android/bbl/generated/api/api_3_bbl_configure/BblConfigureConfigBblBadge$RightEndType;Lcom/avito/android/bbl/generated/api/api_3_bbl_configure/BblConfigureConfigBblBadge$Style;Ljava/lang/String;)V", "Lcom/avito/android/bbl/generated/api/api_3_bbl_configure/BblConfigureConfigBblBadge$LeftEndType;", "a", "()Lcom/avito/android/bbl/generated/api/api_3_bbl_configure/BblConfigureConfigBblBadge$LeftEndType;", "Lcom/avito/android/bbl/generated/api/api_3_bbl_configure/BblConfigureConfigBblBadge$RightEndType;", "b", "()Lcom/avito/android/bbl/generated/api/api_3_bbl_configure/BblConfigureConfigBblBadge$RightEndType;", "Lcom/avito/android/bbl/generated/api/api_3_bbl_configure/BblConfigureConfigBblBadge$Style;", "c", "()Lcom/avito/android/bbl/generated/api/api_3_bbl_configure/BblConfigureConfigBblBadge$Style;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "LeftEndType", "RightEndType", "Style", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BblConfigureConfigBblBadge {

    @c("leftEndType")
    @k
    private final LeftEndType leftEndType;

    @c("rightEndType")
    @k
    private final RightEndType rightEndType;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final Style style;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api3BblConfigureResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/bbl/generated/api/api_3_bbl_configure/BblConfigureConfigBblBadge$LeftEndType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Flag", "Pipka", "Pyramid", "AntiPyramid", "Square", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LeftEndType {

        @c("antiPyramid")
        public static final LeftEndType AntiPyramid;

        @c("flag")
        public static final LeftEndType Flag;

        @c("pipka")
        public static final LeftEndType Pipka;

        @c("pyramid")
        public static final LeftEndType Pyramid;

        @c("square")
        public static final LeftEndType Square;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ LeftEndType[] f99081c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f99082d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f99083b;

        static {
            LeftEndType leftEndType = new LeftEndType("Flag", 0, "flag");
            Flag = leftEndType;
            LeftEndType leftEndType2 = new LeftEndType("Pipka", 1, "pipka");
            Pipka = leftEndType2;
            LeftEndType leftEndType3 = new LeftEndType("Pyramid", 2, "pyramid");
            Pyramid = leftEndType3;
            LeftEndType leftEndType4 = new LeftEndType("AntiPyramid", 3, "antiPyramid");
            AntiPyramid = leftEndType4;
            LeftEndType leftEndType5 = new LeftEndType("Square", 4, "square");
            Square = leftEndType5;
            LeftEndType[] leftEndTypeArr = {leftEndType, leftEndType2, leftEndType3, leftEndType4, leftEndType5};
            f99081c = leftEndTypeArr;
            f99082d = kotlin.enums.c.a(leftEndTypeArr);
        }

        private LeftEndType(String str, int i12, String str2) {
            this.f99083b = str2;
        }

        public static LeftEndType valueOf(String str) {
            return (LeftEndType) Enum.valueOf(LeftEndType.class, str);
        }

        public static LeftEndType[] values() {
            return (LeftEndType[]) f99081c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api3BblConfigureResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/bbl/generated/api/api_3_bbl_configure/BblConfigureConfigBblBadge$RightEndType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Flag", "Pipka", "Pyramid", "AntiPyramid", "Square", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RightEndType {

        @c("antiPyramid")
        public static final RightEndType AntiPyramid;

        @c("flag")
        public static final RightEndType Flag;

        @c("pipka")
        public static final RightEndType Pipka;

        @c("pyramid")
        public static final RightEndType Pyramid;

        @c("square")
        public static final RightEndType Square;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ RightEndType[] f99084c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f99085d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f99086b;

        static {
            RightEndType rightEndType = new RightEndType("Flag", 0, "flag");
            Flag = rightEndType;
            RightEndType rightEndType2 = new RightEndType("Pipka", 1, "pipka");
            Pipka = rightEndType2;
            RightEndType rightEndType3 = new RightEndType("Pyramid", 2, "pyramid");
            Pyramid = rightEndType3;
            RightEndType rightEndType4 = new RightEndType("AntiPyramid", 3, "antiPyramid");
            AntiPyramid = rightEndType4;
            RightEndType rightEndType5 = new RightEndType("Square", 4, "square");
            Square = rightEndType5;
            RightEndType[] rightEndTypeArr = {rightEndType, rightEndType2, rightEndType3, rightEndType4, rightEndType5};
            f99084c = rightEndTypeArr;
            f99085d = kotlin.enums.c.a(rightEndTypeArr);
        }

        private RightEndType(String str, int i12, String str2) {
            this.f99086b = str2;
        }

        public static RightEndType valueOf(String str) {
            return (RightEndType) Enum.valueOf(RightEndType.class, str);
        }

        public static RightEndType[] values() {
            return (RightEndType[]) f99084c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api3BblConfigureResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/bbl/generated/api/api_3_bbl_configure/BblConfigureConfigBblBadge$Style;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Black", "Blue", "Gray", "Green", "Red", "Violet", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        @c(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)
        public static final Style Black;

        @c("blue")
        public static final Style Blue;

        @c("gray")
        public static final Style Gray;

        @c("green")
        public static final Style Green;

        @c("red")
        public static final Style Red;

        @c("violet")
        public static final Style Violet;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Style[] f99087b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f99088c;

        static {
            Style style = new Style("Black", 0, AvitoMapMarkerKt.AMENITY_TYPE_BLACK);
            Black = style;
            Style style2 = new Style("Blue", 1, "blue");
            Blue = style2;
            Style style3 = new Style("Gray", 2, "gray");
            Gray = style3;
            Style style4 = new Style("Green", 3, "green");
            Green = style4;
            Style style5 = new Style("Red", 4, "red");
            Red = style5;
            Style style6 = new Style("Violet", 5, "violet");
            Violet = style6;
            Style[] styleArr = {style, style2, style3, style4, style5, style6};
            f99087b = styleArr;
            f99088c = kotlin.enums.c.a(styleArr);
        }

        private Style(String str, int i12, String str2) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f99087b.clone();
        }
    }

    public BblConfigureConfigBblBadge(@k LeftEndType leftEndType, @k RightEndType rightEndType, @k Style style, @k String str) {
        this.leftEndType = leftEndType;
        this.rightEndType = rightEndType;
        this.style = style;
        this.title = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final LeftEndType getLeftEndType() {
        return this.leftEndType;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final RightEndType getRightEndType() {
        return this.rightEndType;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
