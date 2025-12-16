package ru.avito.messenger.generated.api.get_channels;

import Y61.k;
import Y61.l;
import c91.C26972c;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetChannelsResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u00002\u00020\u0001:\u0003\u001f !B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006\""}, d2 = {"Lru/avito/messenger/generated/api/get_channels/CallItemAction;", "", "Lc91/c;", "analytics", "Lru/avito/messenger/generated/api/get_channels/CallItemAction$Preset;", "preset", "Lru/avito/messenger/generated/api/get_channels/CallItemAction$Scenario;", "scenario", "Lru/avito/messenger/generated/api/get_channels/CallItemAction$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "title", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lc91/c;Lru/avito/messenger/generated/api/get_channels/CallItemAction$Preset;Lru/avito/messenger/generated/api/get_channels/CallItemAction$Scenario;Lru/avito/messenger/generated/api/get_channels/CallItemAction$Style;Ljava/lang/String;Ljava/lang/String;)V", "Lc91/c;", "getAnalytics", "()Lc91/c;", "Lru/avito/messenger/generated/api/get_channels/CallItemAction$Preset;", "getPreset", "()Lru/avito/messenger/generated/api/get_channels/CallItemAction$Preset;", "Lru/avito/messenger/generated/api/get_channels/CallItemAction$Scenario;", "getScenario", "()Lru/avito/messenger/generated/api/get_channels/CallItemAction$Scenario;", "Lru/avito/messenger/generated/api/get_channels/CallItemAction$Style;", "a", "()Lru/avito/messenger/generated/api/get_channels/CallItemAction$Style;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Preset", "Scenario", "Style", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CallItemAction {

    @c("analytics")
    @l
    private final C26972c analytics;

    @c("preset")
    @l
    private final Preset preset;

    @c("scenario")
    @k
    private final Scenario scenario;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final Style style;

    @c("title")
    @k
    private final String title;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final String uri;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetChannelsResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/avito/messenger/generated/api/get_channels/CallItemAction$Preset;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Unknown", "Secondary", "Success", "Accent", "Overlay", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Preset {

        @c("accent")
        public static final Preset Accent;

        @c("overlay")
        public static final Preset Overlay;

        @c("secondary")
        public static final Preset Secondary;

        @c("success")
        public static final Preset Success;

        @c("unknown")
        public static final Preset Unknown;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Preset[] f430948b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f430949c;

        static {
            Preset preset = new Preset("Unknown", 0, "unknown");
            Unknown = preset;
            Preset preset2 = new Preset("Secondary", 1, "secondary");
            Secondary = preset2;
            Preset preset3 = new Preset("Success", 2, "success");
            Success = preset3;
            Preset preset4 = new Preset("Accent", 3, "accent");
            Accent = preset4;
            Preset preset5 = new Preset("Overlay", 4, "overlay");
            Overlay = preset5;
            Preset[] presetArr = {preset, preset2, preset3, preset4, preset5};
            f430948b = presetArr;
            f430949c = kotlin.enums.c.a(presetArr);
        }

        private Preset(String str, int i12, String str2) {
        }

        public static Preset valueOf(String str) {
            return (Preset) Enum.valueOf(Preset.class, str);
        }

        public static Preset[] values() {
            return (Preset[]) f430948b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetChannelsResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/avito/messenger/generated/api/get_channels/CallItemAction$Scenario;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Unknown", "RealtySnippetCall", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Scenario {

        @c("realty_snippet_call")
        public static final Scenario RealtySnippetCall;

        @c("unknown")
        public static final Scenario Unknown;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Scenario[] f430950b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f430951c;

        static {
            Scenario scenario = new Scenario("Unknown", 0, "unknown");
            Unknown = scenario;
            Scenario scenario2 = new Scenario("RealtySnippetCall", 1, "realty_snippet_call");
            RealtySnippetCall = scenario2;
            Scenario[] scenarioArr = {scenario, scenario2};
            f430950b = scenarioArr;
            f430951c = kotlin.enums.c.a(scenarioArr);
        }

        private Scenario(String str, int i12, String str2) {
        }

        public static Scenario valueOf(String str) {
            return (Scenario) Enum.valueOf(Scenario.class, str);
        }

        public static Scenario[] values() {
            return (Scenario[]) f430950b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetChannelsResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/avito/messenger/generated/api/get_channels/CallItemAction$Style;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Unknown", "SuccessSmallRound", "SuccessSmall", "AccentSmallRound", "AccentSmall", "OverlayPrimarySmallRound", "OverlayPrimarySmall", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        @c("accentSmall")
        public static final Style AccentSmall;

        @c("accentSmallRound")
        public static final Style AccentSmallRound;

        @c("overlayPrimarySmall")
        public static final Style OverlayPrimarySmall;

        @c("overlayPrimarySmallRound")
        public static final Style OverlayPrimarySmallRound;

        @c("successSmall")
        public static final Style SuccessSmall;

        @c("successSmallRound")
        public static final Style SuccessSmallRound;

        @c("unknown")
        public static final Style Unknown;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Style[] f430952c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f430953d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f430954b;

        static {
            Style style = new Style("Unknown", 0, "unknown");
            Unknown = style;
            Style style2 = new Style("SuccessSmallRound", 1, "successSmallRound");
            SuccessSmallRound = style2;
            Style style3 = new Style("SuccessSmall", 2, "successSmall");
            SuccessSmall = style3;
            Style style4 = new Style("AccentSmallRound", 3, "accentSmallRound");
            AccentSmallRound = style4;
            Style style5 = new Style("AccentSmall", 4, "accentSmall");
            AccentSmall = style5;
            Style style6 = new Style("OverlayPrimarySmallRound", 5, "overlayPrimarySmallRound");
            OverlayPrimarySmallRound = style6;
            Style style7 = new Style("OverlayPrimarySmall", 6, "overlayPrimarySmall");
            OverlayPrimarySmall = style7;
            Style[] styleArr = {style, style2, style3, style4, style5, style6, style7};
            f430952c = styleArr;
            f430953d = kotlin.enums.c.a(styleArr);
        }

        private Style(String str, int i12, String str2) {
            this.f430954b = str2;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f430952c.clone();
        }
    }

    public CallItemAction(@l C26972c c26972c, @l Preset preset, @k Scenario scenario, @l Style style, @k String str, @k String str2) {
        this.analytics = c26972c;
        this.preset = preset;
        this.scenario = scenario;
        this.style = style;
        this.title = str;
        this.uri = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getUri() {
        return this.uri;
    }
}
