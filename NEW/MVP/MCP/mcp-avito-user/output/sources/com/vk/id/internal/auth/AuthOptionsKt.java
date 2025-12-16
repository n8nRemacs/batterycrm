package com.vk.id.internal.auth;

import Y61.k;
import android.net.Uri;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.vk.id.OAuth;
import com.vk.id.auth.VKIDAuthParams;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;

/* compiled from: AuthOptions.kt */
@s0
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0000*\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\f\u001a\u00020\u0000*\u00020\u000eH\u0000¢\u0006\u0004\b\f\u0010\u000f\u001a\u0013\u0010\f\u001a\u00020\u0000*\u00020\u0010H\u0002¢\u0006\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"", "appPackage", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "basicCodeFlowUri", "(Ljava/lang/String;)Landroid/net/Uri;", "Lcom/vk/id/internal/auth/AuthOptions;", "toAuthUriBrowser", "(Lcom/vk/id/internal/auth/AuthOptions;)Landroid/net/Uri;", "toAuthUriCodeFlow", "(Lcom/vk/id/internal/auth/AuthOptions;Ljava/lang/String;)Landroid/net/Uri;", "Lcom/vk/id/auth/VKIDAuthParams$Locale;", "toQueryParam", "(Lcom/vk/id/auth/VKIDAuthParams$Locale;)Ljava/lang/String;", "Lcom/vk/id/auth/VKIDAuthParams$Theme;", "(Lcom/vk/id/auth/VKIDAuthParams$Theme;)Ljava/lang/String;", "Lcom/vk/id/OAuth;", "(Lcom/vk/id/OAuth;)Ljava/lang/String;", "vkid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthOptionsKt {

    /* compiled from: AuthOptions.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VKIDAuthParams.Locale.values().length];
            try {
                iArr[VKIDAuthParams.Locale.RUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VKIDAuthParams.Locale.UKR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VKIDAuthParams.Locale.ENG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VKIDAuthParams.Locale.SPA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VKIDAuthParams.Locale.GERMAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VKIDAuthParams.Locale.POL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VKIDAuthParams.Locale.FRA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VKIDAuthParams.Locale.TURKEY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VKIDAuthParams.Theme.values().length];
            try {
                iArr2[VKIDAuthParams.Theme.Light.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VKIDAuthParams.Theme.Dark.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Uri basicCodeFlowUri(@k String str) {
        return new Uri.Builder().scheme(str).authority("vkcexternalauth-codeflow").build();
    }

    @k
    public static final Uri toAuthUriBrowser(@k AuthOptions authOptions) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter("client_id", authOptions.getAppId()).appendQueryParameter("response_type", "code").appendQueryParameter("redirect_uri", authOptions.getRedirectUriBrowser()).appendQueryParameter("code_challenge_method", "s256").appendQueryParameter("code_challenge", authOptions.getCodeChallenge()).appendQueryParameter(VoiceInfo.STATE, authOptions.getState()).appendQueryParameter("prompt", authOptions.getPrompt()).appendQueryParameter("stats_info", authOptions.getStatsInfo()).appendQueryParameter(HianalyticsBaseData.SDK_TYPE, "vkid").appendQueryParameter("v", authOptions.getSdkVersion());
        if (!authOptions.getScopes().isEmpty()) {
            builderAppendQueryParameter.appendQueryParameter("scope", C42745f0.O(authOptions.getScopes(), " ", null, null, null, 62));
        }
        if (authOptions.getOAuth() != null) {
            builderAppendQueryParameter.appendQueryParameter("action", toQueryParam(authOptions.getOAuth()));
            builderAppendQueryParameter.appendQueryParameter("provider", authOptions.getOAuth().getServerName());
        }
        if (authOptions.getLocale() != null) {
            builderAppendQueryParameter.appendQueryParameter("lang_id", authOptions.getLocale());
        }
        if (authOptions.getTheme() != null) {
            builderAppendQueryParameter.appendQueryParameter("scheme", authOptions.getTheme());
        }
        if (authOptions.getWebAuthPhoneScreen()) {
            builderAppendQueryParameter.appendQueryParameter("screen", "phone");
        }
        return builderAppendQueryParameter.scheme(Constants.SCHEME).authority("id.vk.ru").path("authorize").build();
    }

    @k
    public static final Uri toAuthUriCodeFlow(@k AuthOptions authOptions, @k String str) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter(HiAnalyticsConstant.BI_KEY_APP_ID, authOptions.getAppId()).appendQueryParameter("response_type", "code").appendQueryParameter("redirect_uri", authOptions.getRedirectUriCodeFlow()).appendQueryParameter("code_challenge_method", authOptions.getCodeChallengeMethod()).appendQueryParameter("code_challenge", authOptions.getCodeChallenge()).appendQueryParameter(VoiceInfo.STATE, authOptions.getState()).appendQueryParameter("uuid", authOptions.getState());
        if (authOptions.getOAuth() != null) {
            builderAppendQueryParameter.appendQueryParameter("action", toQueryParam(authOptions.getOAuth()));
            builderAppendQueryParameter.appendQueryParameter("provider", authOptions.getOAuth().getServerName());
        }
        if (authOptions.getLocale() != null) {
            builderAppendQueryParameter.appendQueryParameter("lang_id", authOptions.getLocale());
        }
        if (authOptions.getTheme() != null) {
            builderAppendQueryParameter.appendQueryParameter("scheme", authOptions.getTheme());
        }
        if (authOptions.getWebAuthPhoneScreen()) {
            builderAppendQueryParameter.appendQueryParameter("screen", "phone");
        }
        return builderAppendQueryParameter.scheme(str).authority("vkcexternalauth-codeflow").build();
    }

    @k
    public static final String toQueryParam(@k VKIDAuthParams.Locale locale) {
        int i12;
        switch (WhenMappings.$EnumSwitchMapping$0[locale.ordinal()]) {
            case 1:
                i12 = 0;
                break;
            case 2:
                i12 = 1;
                break;
            case 3:
                i12 = 3;
                break;
            case 4:
                i12 = 4;
                break;
            case 5:
                i12 = 6;
                break;
            case 6:
                i12 = 15;
                break;
            case 7:
                i12 = 16;
                break;
            case 8:
                i12 = 82;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return String.valueOf(i12);
    }

    @k
    public static final String toQueryParam(@k VKIDAuthParams.Theme theme) {
        int i12 = WhenMappings.$EnumSwitchMapping$1[theme.ordinal()];
        if (i12 == 1) {
            return "bright_light";
        }
        if (i12 == 2) {
            return "space_gray";
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final String toQueryParam(OAuth oAuth) throws IOException {
        String strEncodeToString = Base64.encodeToString(AK.c.k("{\"name\":\"sdk_oauth\",\"params\":{\"oauth\":\"", oAuth.getServerName(), "\"}}").getBytes(C43047d.f410589b), 0);
        StringBuilder sb2 = new StringBuilder();
        int length = strEncodeToString.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = strEncodeToString.charAt(i12);
            if (cCharAt != '\n') {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }
}
