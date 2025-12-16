package com.vk.id.auth;

import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.vk.id.OAuth;
import com.vk.id.common.InternalVKIDApi;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: VKIDAuthParams.kt */
@P
@s0
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001:\u0003>?@B{\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u001b\u001a\u00020\u00002\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b6\u0010\u001eR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u00109R(\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0013\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010+\u001a\u0004\b=\u0010-¨\u0006A"}, d2 = {"Lcom/vk/id/auth/VKIDAuthParams;", "", "Lcom/vk/id/auth/VKIDAuthParams$Locale;", "locale", "Lcom/vk/id/auth/VKIDAuthParams$Theme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "", "useOAuthProviderIfPossible", "Lcom/vk/id/OAuth;", "oAuth", "Lcom/vk/id/auth/Prompt;", "prompt", "", VoiceInfo.STATE, "codeChallenge", "", "scopes", "", "extraParams", "internalUse", "<init>", "(Lcom/vk/id/auth/VKIDAuthParams$Locale;Lcom/vk/id/auth/VKIDAuthParams$Theme;ZLcom/vk/id/OAuth;Lcom/vk/id/auth/Prompt;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/Map;Z)V", "Lkotlin/Function1;", "Lcom/vk/id/auth/VKIDAuthParams$Builder;", "Lkotlin/G0;", "Lkotlin/w;", "initializer", "newBuilder", "(LY41/l;)Lcom/vk/id/auth/VKIDAuthParams;", "toString", "()Ljava/lang/String;", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/vk/id/auth/VKIDAuthParams$Locale;", "getLocale$vkid_release", "()Lcom/vk/id/auth/VKIDAuthParams$Locale;", "Lcom/vk/id/auth/VKIDAuthParams$Theme;", "getTheme$vkid_release", "()Lcom/vk/id/auth/VKIDAuthParams$Theme;", "Z", "getUseOAuthProviderIfPossible$vkid_release", "()Z", "Lcom/vk/id/OAuth;", "getOAuth$vkid_release", "()Lcom/vk/id/OAuth;", "Lcom/vk/id/auth/Prompt;", "getPrompt$vkid_release", "()Lcom/vk/id/auth/Prompt;", "Ljava/lang/String;", "getState$vkid_release", "getCodeChallenge$vkid_release", "Ljava/util/Set;", "getScopes$vkid_release", "()Ljava/util/Set;", "Ljava/util/Map;", "getExtraParams$vkid_release", "()Ljava/util/Map;", "getInternalUse$vkid_release", "Locale", "Theme", "Builder", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VKIDAuthParams {

    @l
    private final String codeChallenge;

    @l
    private final Map<String, String> extraParams;
    private final boolean internalUse;

    @l
    private final Locale locale;

    @l
    private final OAuth oAuth;

    @k
    private final Prompt prompt;

    @k
    private final Set<String> scopes;

    @l
    private final String state;

    @l
    private final Theme theme;
    private final boolean useOAuthProviderIfPossible;

    /* compiled from: VKIDAuthParams.kt */
    @P
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R(\u00105\u001a\b\u0012\u0004\u0012\u00020*048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R6\u0010<\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*\u0018\u00010;8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b<\u0010=\u0012\u0004\bB\u0010\u0003\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010C\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bC\u0010\u0017\u0012\u0004\bF\u0010\u0003\u001a\u0004\bD\u0010\u0019\"\u0004\bE\u0010\u001b¨\u0006G"}, d2 = {"Lcom/vk/id/auth/VKIDAuthParams$Builder;", "", "<init>", "()V", "Lcom/vk/id/auth/VKIDAuthParams;", "build", "()Lcom/vk/id/auth/VKIDAuthParams;", "Lcom/vk/id/auth/VKIDAuthParams$Locale;", "locale", "Lcom/vk/id/auth/VKIDAuthParams$Locale;", "getLocale", "()Lcom/vk/id/auth/VKIDAuthParams$Locale;", "setLocale", "(Lcom/vk/id/auth/VKIDAuthParams$Locale;)V", "Lcom/vk/id/auth/VKIDAuthParams$Theme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/vk/id/auth/VKIDAuthParams$Theme;", "getTheme", "()Lcom/vk/id/auth/VKIDAuthParams$Theme;", "setTheme", "(Lcom/vk/id/auth/VKIDAuthParams$Theme;)V", "", "useOAuthProviderIfPossible", "Z", "getUseOAuthProviderIfPossible", "()Z", "setUseOAuthProviderIfPossible", "(Z)V", "Lcom/vk/id/OAuth;", "oAuth", "Lcom/vk/id/OAuth;", "getOAuth", "()Lcom/vk/id/OAuth;", "setOAuth", "(Lcom/vk/id/OAuth;)V", "Lcom/vk/id/auth/Prompt;", "prompt", "Lcom/vk/id/auth/Prompt;", "getPrompt", "()Lcom/vk/id/auth/Prompt;", "setPrompt", "(Lcom/vk/id/auth/Prompt;)V", "", VoiceInfo.STATE, "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "setState", "(Ljava/lang/String;)V", "codeChallenge", "getCodeChallenge", "setCodeChallenge", "", "scopes", "Ljava/util/Set;", "getScopes", "()Ljava/util/Set;", "setScopes", "(Ljava/util/Set;)V", "", "extraParams", "Ljava/util/Map;", "getExtraParams", "()Ljava/util/Map;", "setExtraParams", "(Ljava/util/Map;)V", "getExtraParams$annotations", "internalUse", "getInternalUse", "setInternalUse", "getInternalUse$annotations", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        @l
        private String codeChallenge;

        @l
        private Map<String, String> extraParams;
        private boolean internalUse;

        @l
        private Locale locale;

        @l
        private OAuth oAuth;

        @l
        private String state;

        @l
        private Theme theme;
        private boolean useOAuthProviderIfPossible = true;

        @k
        private Prompt prompt = Prompt.BLANK;

        @k
        private Set<String> scopes = B0.f406639b;

        @k
        public final VKIDAuthParams build() {
            return new VKIDAuthParams(this.locale, this.theme, this.useOAuthProviderIfPossible, this.oAuth, this.prompt, this.state, this.codeChallenge, this.scopes, this.extraParams, this.internalUse, null);
        }

        public final void setCodeChallenge(@l String str) {
            this.codeChallenge = str;
        }

        public final void setExtraParams(@l Map<String, String> map) {
            this.extraParams = map;
        }

        public final void setInternalUse(boolean z12) {
            this.internalUse = z12;
        }

        public final void setLocale(@l Locale locale) {
            this.locale = locale;
        }

        public final void setOAuth(@l OAuth oAuth) {
            this.oAuth = oAuth;
        }

        public final void setPrompt(@k Prompt prompt) {
            this.prompt = prompt;
        }

        public final void setScopes(@k Set<String> set) {
            this.scopes = set;
        }

        public final void setState(@l String str) {
            this.state = str;
        }

        public final void setTheme(@l Theme theme) {
            this.theme = theme;
        }

        public final void setUseOAuthProviderIfPossible(boolean z12) {
            this.useOAuthProviderIfPossible = z12;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VKIDAuthParams.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/vk/id/auth/VKIDAuthParams$Locale;", "", "<init>", "(Ljava/lang/String;I)V", "RUS", "UKR", "ENG", "SPA", "GERMAN", "POL", "FRA", "TURKEY", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Locale {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Locale[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE;
        public static final Locale RUS = new Locale("RUS", 0);
        public static final Locale UKR = new Locale("UKR", 1);
        public static final Locale ENG = new Locale("ENG", 2);
        public static final Locale SPA = new Locale("SPA", 3);
        public static final Locale GERMAN = new Locale("GERMAN", 4);
        public static final Locale POL = new Locale("POL", 5);
        public static final Locale FRA = new Locale("FRA", 6);
        public static final Locale TURKEY = new Locale("TURKEY", 7);

        /* compiled from: VKIDAuthParams.kt */
        @InternalVKIDApi
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0014\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/vk/id/auth/VKIDAuthParams$Locale$Companion;", "", "<init>", "()V", "systemLocale", "Lcom/vk/id/auth/VKIDAuthParams$Locale;", "context", "Landroid/content/Context;", "systemLocale$vkid_release", "fromLocale", "locale", "Ljava/util/Locale;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @l
            @InternalVKIDApi
            public final Locale fromLocale(@l java.util.Locale locale) {
                String language = locale != null ? locale.getLanguage() : null;
                if (language == null) {
                    return null;
                }
                int iHashCode = language.hashCode();
                if (iHashCode == 3201) {
                    if (language.equals("de")) {
                        return Locale.GERMAN;
                    }
                    return null;
                }
                if (iHashCode == 3241) {
                    if (language.equals("en")) {
                        return Locale.ENG;
                    }
                    return null;
                }
                if (iHashCode == 3246) {
                    if (language.equals("es")) {
                        return Locale.SPA;
                    }
                    return null;
                }
                if (iHashCode == 3276) {
                    if (language.equals("fr")) {
                        return Locale.FRA;
                    }
                    return null;
                }
                if (iHashCode == 3580) {
                    if (language.equals("pl")) {
                        return Locale.POL;
                    }
                    return null;
                }
                if (iHashCode == 3651) {
                    if (language.equals("ru")) {
                        return Locale.RUS;
                    }
                    return null;
                }
                if (iHashCode == 3710) {
                    if (language.equals("tr")) {
                        return Locale.TURKEY;
                    }
                    return null;
                }
                if (iHashCode == 3734 && language.equals("uk")) {
                    return Locale.UKR;
                }
                return null;
            }

            @l
            public final Locale systemLocale$vkid_release(@k Context context) {
                return fromLocale(context.getResources().getConfiguration().getLocales().get(0));
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ Locale[] $values() {
            return new Locale[]{RUS, UKR, ENG, SPA, GERMAN, POL, FRA, TURKEY};
        }

        static {
            Locale[] localeArr$values = $values();
            $VALUES = localeArr$values;
            $ENTRIES = c.a(localeArr$values);
            INSTANCE = new Companion(null);
        }

        private Locale(String str, int i12) {
        }

        public static Locale valueOf(String str) {
            return (Locale) Enum.valueOf(Locale.class, str);
        }

        public static Locale[] values() {
            return (Locale[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VKIDAuthParams.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/vk/id/auth/VKIDAuthParams$Theme;", "", "<init>", "(Ljava/lang/String;I)V", "Light", "Dark", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Theme {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Theme[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE;
        public static final Theme Light = new Theme("Light", 0);
        public static final Theme Dark = new Theme("Dark", 1);

        /* compiled from: VKIDAuthParams.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/vk/id/auth/VKIDAuthParams$Theme$Companion;", "", "<init>", "()V", "systemTheme", "Lcom/vk/id/auth/VKIDAuthParams$Theme;", "context", "Landroid/content/Context;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @l
            public final Theme systemTheme(@k Context context) {
                int i12 = context.getResources().getConfiguration().uiMode & 48;
                if (i12 == 16) {
                    return Theme.Light;
                }
                if (i12 != 32) {
                    return null;
                }
                return Theme.Dark;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ Theme[] $values() {
            return new Theme[]{Light, Dark};
        }

        static {
            Theme[] themeArr$values = $values();
            $VALUES = themeArr$values;
            $ENTRIES = c.a(themeArr$values);
            INSTANCE = new Companion(null);
        }

        private Theme(String str, int i12) {
        }

        public static Theme valueOf(String str) {
            return (Theme) Enum.valueOf(Theme.class, str);
        }

        public static Theme[] values() {
            return (Theme[]) $VALUES.clone();
        }
    }

    public /* synthetic */ VKIDAuthParams(Locale locale, Theme theme, boolean z12, OAuth oAuth, Prompt prompt, String str, String str2, Set set, Map map, boolean z13, C42822w c42822w) {
        this(locale, theme, z12, oAuth, prompt, str, str2, set, map, z13);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!VKIDAuthParams.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        VKIDAuthParams vKIDAuthParams = (VKIDAuthParams) other;
        return this.locale == vKIDAuthParams.locale && this.theme == vKIDAuthParams.theme && this.useOAuthProviderIfPossible == vKIDAuthParams.useOAuthProviderIfPossible && this.oAuth == vKIDAuthParams.oAuth && this.prompt == vKIDAuthParams.prompt && L.f(this.state, vKIDAuthParams.state) && L.f(this.codeChallenge, vKIDAuthParams.codeChallenge) && L.f(this.scopes, vKIDAuthParams.scopes) && L.f(this.extraParams, vKIDAuthParams.extraParams) && this.internalUse == vKIDAuthParams.internalUse;
    }

    @l
    /* renamed from: getCodeChallenge$vkid_release, reason: from getter */
    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    @l
    public final Map<String, String> getExtraParams$vkid_release() {
        return this.extraParams;
    }

    /* renamed from: getInternalUse$vkid_release, reason: from getter */
    public final boolean getInternalUse() {
        return this.internalUse;
    }

    @l
    /* renamed from: getLocale$vkid_release, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    @l
    /* renamed from: getOAuth$vkid_release, reason: from getter */
    public final OAuth getOAuth() {
        return this.oAuth;
    }

    @k
    /* renamed from: getPrompt$vkid_release, reason: from getter */
    public final Prompt getPrompt() {
        return this.prompt;
    }

    @k
    public final Set<String> getScopes$vkid_release() {
        return this.scopes;
    }

    @l
    /* renamed from: getState$vkid_release, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @l
    /* renamed from: getTheme$vkid_release, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    /* renamed from: getUseOAuthProviderIfPossible$vkid_release, reason: from getter */
    public final boolean getUseOAuthProviderIfPossible() {
        return this.useOAuthProviderIfPossible;
    }

    public int hashCode() {
        Locale locale = this.locale;
        int iHashCode = (locale != null ? locale.hashCode() : 0) * 31;
        Theme theme = this.theme;
        int i12 = r.i((iHashCode + (theme != null ? theme.hashCode() : 0)) * 31, 31, this.useOAuthProviderIfPossible);
        OAuth oAuth = this.oAuth;
        int iHashCode2 = (this.prompt.hashCode() + ((i12 + (oAuth != null ? oAuth.hashCode() : 0)) * 31)) * 31;
        String str = this.state;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.codeChallenge;
        int iG2 = m.g(this.scopes, (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
        Map<String, String> map = this.extraParams;
        return Boolean.hashCode(this.internalUse) + ((iG2 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @InternalVKIDApi
    @k
    public final VKIDAuthParams newBuilder(@k Y41.l<? super Builder, G0> initializer) {
        Builder builder = new Builder();
        builder.setLocale(this.locale);
        builder.setTheme(this.theme);
        builder.setUseOAuthProviderIfPossible(this.useOAuthProviderIfPossible);
        builder.setOAuth(this.oAuth);
        builder.setPrompt(this.prompt);
        builder.setState(this.state);
        builder.setCodeChallenge(this.codeChallenge);
        builder.setScopes(this.scopes);
        builder.setExtraParams(this.extraParams);
        builder.setInternalUse(this.internalUse);
        initializer.invoke(builder);
        return builder.build();
    }

    @k
    public String toString() {
        return "VKIDAuthParams(locale=" + this.locale + ", theme=" + this.theme + ", useOAuthProviderIfPossible=" + this.useOAuthProviderIfPossible + ", oAuth=" + this.oAuth + ", prompt=" + this.prompt + ", state=" + this.state + ", codeChallenge=" + this.codeChallenge + ", scopes=" + this.scopes + ", extraParams=" + this.extraParams + ", internalUse=" + this.internalUse + ")";
    }

    private VKIDAuthParams(Locale locale, Theme theme, boolean z12, OAuth oAuth, Prompt prompt, String str, String str2, Set<String> set, Map<String, String> map, boolean z13) {
        this.locale = locale;
        this.theme = theme;
        this.useOAuthProviderIfPossible = z12;
        this.oAuth = oAuth;
        this.prompt = prompt;
        this.state = str;
        this.codeChallenge = str2;
        this.scopes = set;
        this.extraParams = map;
        this.internalUse = z13;
    }

    public /* synthetic */ VKIDAuthParams(Locale locale, Theme theme, boolean z12, OAuth oAuth, Prompt prompt, String str, String str2, Set set, Map map, boolean z13, int i12, C42822w c42822w) {
        this(locale, theme, z12, oAuth, prompt, str, str2, set, (i12 & 256) != 0 ? null : map, (i12 & 512) != 0 ? false : z13);
    }
}
