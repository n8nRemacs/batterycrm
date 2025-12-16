package com.avito.android.fees_methods.generated.api.api_21_fees_fees_methods_get;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api21FeesFeesMethodsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/ApiBadge;", "", "Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/ApiBadge$BadgeType;", "badgeType", "Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/ApiBadge$LeftEdgeStyle;", "leftEdgeStyle", "Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/ApiBadge$RightEdgeStyle;", "rightEdgeStyle", "", "title", "<init>", "(Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/ApiBadge$BadgeType;Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/ApiBadge$LeftEdgeStyle;Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/ApiBadge$RightEdgeStyle;Ljava/lang/String;)V", "Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/ApiBadge$BadgeType;", "a", "()Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/ApiBadge$BadgeType;", "Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/ApiBadge$LeftEdgeStyle;", "b", "()Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/ApiBadge$LeftEdgeStyle;", "Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/ApiBadge$RightEdgeStyle;", "c", "()Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/ApiBadge$RightEdgeStyle;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "BadgeType", "LeftEdgeStyle", "RightEdgeStyle", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ApiBadge {

    @c("badgeType")
    @k
    private final BadgeType badgeType;

    @c("leftEdgeStyle")
    @k
    private final LeftEdgeStyle leftEdgeStyle;

    @c("rightEdgeStyle")
    @k
    private final RightEdgeStyle rightEdgeStyle;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api21FeesFeesMethodsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/ApiBadge$BadgeType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Green", "Violet", "Blue", "Gray", "Red", "Black", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BadgeType {

        @c(AvitoMapMarkerKt.AMENITY_TYPE_BLACK)
        public static final BadgeType Black;

        @c("blue")
        public static final BadgeType Blue;

        @c("gray")
        public static final BadgeType Gray;

        @c("green")
        public static final BadgeType Green;

        @c("red")
        public static final BadgeType Red;

        @c("violet")
        public static final BadgeType Violet;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ BadgeType[] f157949b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f157950c;

        static {
            BadgeType badgeType = new BadgeType("Green", 0, "green");
            Green = badgeType;
            BadgeType badgeType2 = new BadgeType("Violet", 1, "violet");
            Violet = badgeType2;
            BadgeType badgeType3 = new BadgeType("Blue", 2, "blue");
            Blue = badgeType3;
            BadgeType badgeType4 = new BadgeType("Gray", 3, "gray");
            Gray = badgeType4;
            BadgeType badgeType5 = new BadgeType("Red", 4, "red");
            Red = badgeType5;
            BadgeType badgeType6 = new BadgeType("Black", 5, AvitoMapMarkerKt.AMENITY_TYPE_BLACK);
            Black = badgeType6;
            BadgeType[] badgeTypeArr = {badgeType, badgeType2, badgeType3, badgeType4, badgeType5, badgeType6};
            f157949b = badgeTypeArr;
            f157950c = kotlin.enums.c.a(badgeTypeArr);
        }

        private BadgeType(String str, int i12, String str2) {
        }

        public static BadgeType valueOf(String str) {
            return (BadgeType) Enum.valueOf(BadgeType.class, str);
        }

        public static BadgeType[] values() {
            return (BadgeType[]) f157949b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api21FeesFeesMethodsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/ApiBadge$LeftEdgeStyle;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Flag", "Pipka", "Pyramid", "AntiPyramid", "Square", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LeftEdgeStyle {

        @c("antiPyramid")
        public static final LeftEdgeStyle AntiPyramid;

        @c("flag")
        public static final LeftEdgeStyle Flag;

        @c("pipka")
        public static final LeftEdgeStyle Pipka;

        @c("pyramid")
        public static final LeftEdgeStyle Pyramid;

        @c("square")
        public static final LeftEdgeStyle Square;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ LeftEdgeStyle[] f157951b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f157952c;

        static {
            LeftEdgeStyle leftEdgeStyle = new LeftEdgeStyle("Flag", 0, "flag");
            Flag = leftEdgeStyle;
            LeftEdgeStyle leftEdgeStyle2 = new LeftEdgeStyle("Pipka", 1, "pipka");
            Pipka = leftEdgeStyle2;
            LeftEdgeStyle leftEdgeStyle3 = new LeftEdgeStyle("Pyramid", 2, "pyramid");
            Pyramid = leftEdgeStyle3;
            LeftEdgeStyle leftEdgeStyle4 = new LeftEdgeStyle("AntiPyramid", 3, "antiPyramid");
            AntiPyramid = leftEdgeStyle4;
            LeftEdgeStyle leftEdgeStyle5 = new LeftEdgeStyle("Square", 4, "square");
            Square = leftEdgeStyle5;
            LeftEdgeStyle[] leftEdgeStyleArr = {leftEdgeStyle, leftEdgeStyle2, leftEdgeStyle3, leftEdgeStyle4, leftEdgeStyle5};
            f157951b = leftEdgeStyleArr;
            f157952c = kotlin.enums.c.a(leftEdgeStyleArr);
        }

        private LeftEdgeStyle(String str, int i12, String str2) {
        }

        public static LeftEdgeStyle valueOf(String str) {
            return (LeftEdgeStyle) Enum.valueOf(LeftEdgeStyle.class, str);
        }

        public static LeftEdgeStyle[] values() {
            return (LeftEdgeStyle[]) f157951b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api21FeesFeesMethodsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/fees_methods/generated/api/api_21_fees_fees_methods_get/ApiBadge$RightEdgeStyle;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Flag", "Pipka", "Pyramid", "AntiPyramid", "Square", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RightEdgeStyle {

        @c("antiPyramid")
        public static final RightEdgeStyle AntiPyramid;

        @c("flag")
        public static final RightEdgeStyle Flag;

        @c("pipka")
        public static final RightEdgeStyle Pipka;

        @c("pyramid")
        public static final RightEdgeStyle Pyramid;

        @c("square")
        public static final RightEdgeStyle Square;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ RightEdgeStyle[] f157953b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f157954c;

        static {
            RightEdgeStyle rightEdgeStyle = new RightEdgeStyle("Flag", 0, "flag");
            Flag = rightEdgeStyle;
            RightEdgeStyle rightEdgeStyle2 = new RightEdgeStyle("Pipka", 1, "pipka");
            Pipka = rightEdgeStyle2;
            RightEdgeStyle rightEdgeStyle3 = new RightEdgeStyle("Pyramid", 2, "pyramid");
            Pyramid = rightEdgeStyle3;
            RightEdgeStyle rightEdgeStyle4 = new RightEdgeStyle("AntiPyramid", 3, "antiPyramid");
            AntiPyramid = rightEdgeStyle4;
            RightEdgeStyle rightEdgeStyle5 = new RightEdgeStyle("Square", 4, "square");
            Square = rightEdgeStyle5;
            RightEdgeStyle[] rightEdgeStyleArr = {rightEdgeStyle, rightEdgeStyle2, rightEdgeStyle3, rightEdgeStyle4, rightEdgeStyle5};
            f157953b = rightEdgeStyleArr;
            f157954c = kotlin.enums.c.a(rightEdgeStyleArr);
        }

        private RightEdgeStyle(String str, int i12, String str2) {
        }

        public static RightEdgeStyle valueOf(String str) {
            return (RightEdgeStyle) Enum.valueOf(RightEdgeStyle.class, str);
        }

        public static RightEdgeStyle[] values() {
            return (RightEdgeStyle[]) f157953b.clone();
        }
    }

    public ApiBadge(@k BadgeType badgeType, @k LeftEdgeStyle leftEdgeStyle, @k RightEdgeStyle rightEdgeStyle, @k String str) {
        this.badgeType = badgeType;
        this.leftEdgeStyle = leftEdgeStyle;
        this.rightEdgeStyle = rightEdgeStyle;
        this.title = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final BadgeType getBadgeType() {
        return this.badgeType;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final LeftEdgeStyle getLeftEdgeStyle() {
        return this.leftEdgeStyle;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final RightEdgeStyle getRightEdgeStyle() {
        return this.rightEdgeStyle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
