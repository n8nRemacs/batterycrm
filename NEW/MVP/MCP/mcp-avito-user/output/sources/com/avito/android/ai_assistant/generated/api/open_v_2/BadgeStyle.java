package com.avito.android.ai_assistant.generated.api.open_v_2;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: OpenV2Response.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/open_v_2/BadgeStyle;", "", "LQb/b;", "backgroundColor", "fontColor", "LQb/d;", "icon", "Lcom/avito/android/ai_assistant/generated/api/open_v_2/BadgeStyle$LeftEdgeStyle;", "leftEdgeStyle", "Lcom/avito/android/ai_assistant/generated/api/open_v_2/BadgeStyle$RightEdgeStyle;", "rightEdgeStyle", "<init>", "(LQb/b;LQb/b;LQb/d;Lcom/avito/android/ai_assistant/generated/api/open_v_2/BadgeStyle$LeftEdgeStyle;Lcom/avito/android/ai_assistant/generated/api/open_v_2/BadgeStyle$RightEdgeStyle;)V", "LQb/b;", "a", "()LQb/b;", "b", "LQb/d;", "getIcon", "()LQb/d;", "Lcom/avito/android/ai_assistant/generated/api/open_v_2/BadgeStyle$LeftEdgeStyle;", "c", "()Lcom/avito/android/ai_assistant/generated/api/open_v_2/BadgeStyle$LeftEdgeStyle;", "Lcom/avito/android/ai_assistant/generated/api/open_v_2/BadgeStyle$RightEdgeStyle;", "d", "()Lcom/avito/android/ai_assistant/generated/api/open_v_2/BadgeStyle$RightEdgeStyle;", "LeftEdgeStyle", "RightEdgeStyle", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BadgeStyle {

    @com.google.gson.annotations.c("backgroundColor")
    @k
    private final Qb.b backgroundColor;

    @com.google.gson.annotations.c("fontColor")
    @k
    private final Qb.b fontColor;

    @com.google.gson.annotations.c("icon")
    @l
    private final Qb.d icon;

    @com.google.gson.annotations.c("leftEdgeStyle")
    @l
    private final LeftEdgeStyle leftEdgeStyle;

    @com.google.gson.annotations.c("rightEdgeStyle")
    @l
    private final RightEdgeStyle rightEdgeStyle;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OpenV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/open_v_2/BadgeStyle$LeftEdgeStyle;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Flag", "Pipka", "Pyramid", "AntiPyramid", "Square", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LeftEdgeStyle {

        @com.google.gson.annotations.c("antiPyramid")
        public static final LeftEdgeStyle AntiPyramid;

        @com.google.gson.annotations.c("flag")
        public static final LeftEdgeStyle Flag;

        @com.google.gson.annotations.c("pipka")
        public static final LeftEdgeStyle Pipka;

        @com.google.gson.annotations.c("pyramid")
        public static final LeftEdgeStyle Pyramid;

        @com.google.gson.annotations.c("square")
        public static final LeftEdgeStyle Square;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ LeftEdgeStyle[] f89046c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f89047d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f89048b;

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
            f89046c = leftEdgeStyleArr;
            f89047d = kotlin.enums.c.a(leftEdgeStyleArr);
        }

        private LeftEdgeStyle(String str, int i12, String str2) {
            this.f89048b = str2;
        }

        public static LeftEdgeStyle valueOf(String str) {
            return (LeftEdgeStyle) Enum.valueOf(LeftEdgeStyle.class, str);
        }

        public static LeftEdgeStyle[] values() {
            return (LeftEdgeStyle[]) f89046c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OpenV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/ai_assistant/generated/api/open_v_2/BadgeStyle$RightEdgeStyle;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Flag", "Pipka", "Pyramid", "AntiPyramid", "Square", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RightEdgeStyle {

        @com.google.gson.annotations.c("antiPyramid")
        public static final RightEdgeStyle AntiPyramid;

        @com.google.gson.annotations.c("flag")
        public static final RightEdgeStyle Flag;

        @com.google.gson.annotations.c("pipka")
        public static final RightEdgeStyle Pipka;

        @com.google.gson.annotations.c("pyramid")
        public static final RightEdgeStyle Pyramid;

        @com.google.gson.annotations.c("square")
        public static final RightEdgeStyle Square;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ RightEdgeStyle[] f89049c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f89050d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f89051b;

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
            f89049c = rightEdgeStyleArr;
            f89050d = kotlin.enums.c.a(rightEdgeStyleArr);
        }

        private RightEdgeStyle(String str, int i12, String str2) {
            this.f89051b = str2;
        }

        public static RightEdgeStyle valueOf(String str) {
            return (RightEdgeStyle) Enum.valueOf(RightEdgeStyle.class, str);
        }

        public static RightEdgeStyle[] values() {
            return (RightEdgeStyle[]) f89049c.clone();
        }
    }

    public BadgeStyle(@k Qb.b bVar, @k Qb.b bVar2, @l Qb.d dVar, @l LeftEdgeStyle leftEdgeStyle, @l RightEdgeStyle rightEdgeStyle) {
        this.backgroundColor = bVar;
        this.fontColor = bVar2;
        this.icon = dVar;
        this.leftEdgeStyle = leftEdgeStyle;
        this.rightEdgeStyle = rightEdgeStyle;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Qb.b getBackgroundColor() {
        return this.backgroundColor;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Qb.b getFontColor() {
        return this.fontColor;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final LeftEdgeStyle getLeftEdgeStyle() {
        return this.leftEdgeStyle;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final RightEdgeStyle getRightEdgeStyle() {
        return this.rightEdgeStyle;
    }
}
