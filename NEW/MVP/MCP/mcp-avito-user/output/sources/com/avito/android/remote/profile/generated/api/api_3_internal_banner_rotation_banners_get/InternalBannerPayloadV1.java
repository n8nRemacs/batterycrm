package com.avito.android.remote.profile.generated.api.api_3_internal_banner_rotation_banners_get;

import Y61.l;
import Zk0.C19572b;
import Zk0.d;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api3InternalBannerRotationBannersGetResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0019\u0018\u00002\u00020\u0001:\u0001&BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b\"\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/avito/android/remote/profile/generated/api/api_3_internal_banner_rotation_banners_get/InternalBannerPayloadV1;", "", "LZk0/b;", "action", "", BeduinPromoBlockModel.SERIALIZED_NAME_CLOSEABLE, "secondaryAction", "LZk0/d;", "specificParams", "Lcom/avito/android/remote/profile/generated/api/api_3_internal_banner_rotation_banners_get/InternalBannerPayloadV1$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "text", "title", "", ChannelContext.Item.USER_ID, "<init>", "(LZk0/b;Ljava/lang/Boolean;LZk0/b;LZk0/d;Lcom/avito/android/remote/profile/generated/api/api_3_internal_banner_rotation_banners_get/InternalBannerPayloadV1$Style;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "LZk0/b;", "a", "()LZk0/b;", "Ljava/lang/Boolean;", "getCloseable", "()Ljava/lang/Boolean;", "b", "LZk0/d;", "c", "()LZk0/d;", "Lcom/avito/android/remote/profile/generated/api/api_3_internal_banner_rotation_banners_get/InternalBannerPayloadV1$Style;", "d", "()Lcom/avito/android/remote/profile/generated/api/api_3_internal_banner_rotation_banners_get/InternalBannerPayloadV1$Style;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "Ljava/lang/Long;", "getUserId", "()Ljava/lang/Long;", "Style", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InternalBannerPayloadV1 {

    @c("action")
    @l
    private final C19572b action;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_CLOSEABLE)
    @l
    private final Boolean closeable;

    @c("secondaryAction")
    @l
    private final C19572b secondaryAction;

    @c("specificParams")
    @l
    private final d specificParams;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final Style style;

    @c("text")
    @l
    private final String text;

    @c("title")
    @l
    private final String title;

    @c(ChannelContext.Item.USER_ID)
    @l
    private final Long userId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api3InternalBannerRotationBannersGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/profile/generated/api/api_3_internal_banner_rotation_banners_get/InternalBannerPayloadV1$Style;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "White", "Blue", "Green", "Red", "Orange", "Beige", "Violet", "Warmgray", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        @c("beige")
        public static final Style Beige;

        @c("blue")
        public static final Style Blue;

        @c("green")
        public static final Style Green;

        @c("orange")
        public static final Style Orange;

        @c("red")
        public static final Style Red;

        @c("violet")
        public static final Style Violet;

        @c("warmgray")
        public static final Style Warmgray;

        @c("white")
        public static final Style White;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Style[] f254323b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f254324c;

        static {
            Style style = new Style("White", 0, "white");
            White = style;
            Style style2 = new Style("Blue", 1, "blue");
            Blue = style2;
            Style style3 = new Style("Green", 2, "green");
            Green = style3;
            Style style4 = new Style("Red", 3, "red");
            Red = style4;
            Style style5 = new Style("Orange", 4, "orange");
            Orange = style5;
            Style style6 = new Style("Beige", 5, "beige");
            Beige = style6;
            Style style7 = new Style("Violet", 6, "violet");
            Violet = style7;
            Style style8 = new Style("Warmgray", 7, "warmgray");
            Warmgray = style8;
            Style[] styleArr = {style, style2, style3, style4, style5, style6, style7, style8};
            f254323b = styleArr;
            f254324c = kotlin.enums.c.a(styleArr);
        }

        private Style(String str, int i12, String str2) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f254323b.clone();
        }
    }

    public InternalBannerPayloadV1(@l C19572b c19572b, @l Boolean bool, @l C19572b c19572b2, @l d dVar, @l Style style, @l String str, @l String str2, @l Long l12) {
        this.action = c19572b;
        this.closeable = bool;
        this.secondaryAction = c19572b2;
        this.specificParams = dVar;
        this.style = style;
        this.text = str;
        this.title = str2;
        this.userId = l12;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C19572b getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C19572b getSecondaryAction() {
        return this.secondaryAction;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final d getSpecificParams() {
        return this.specificParams;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
