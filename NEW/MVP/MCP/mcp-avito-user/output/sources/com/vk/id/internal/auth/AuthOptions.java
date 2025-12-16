package com.vk.id.internal.auth;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.vk.id.OAuth;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuthOptions.kt */
@P
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b&\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b-\u0010\u0017R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b1\u0010\u0017R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b2\u0010\u0017¨\u00063"}, d2 = {"Lcom/vk/id/internal/auth/AuthOptions;", "", "", "appId", "codeChallenge", "codeChallengeMethod", "redirectUriCodeFlow", "redirectUriBrowser", VoiceInfo.STATE, "locale", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "", "webAuthPhoneScreen", "Lcom/vk/id/OAuth;", "oAuth", "prompt", "", "scopes", "statsInfo", "sdkVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/vk/id/OAuth;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAppId", "getCodeChallenge", "getCodeChallengeMethod", "getRedirectUriCodeFlow", "getRedirectUriBrowser", "getState", "getLocale", "getTheme", "Z", "getWebAuthPhoneScreen", "()Z", "Lcom/vk/id/OAuth;", "getOAuth", "()Lcom/vk/id/OAuth;", "getPrompt", "Ljava/util/Set;", "getScopes", "()Ljava/util/Set;", "getStatsInfo", "getSdkVersion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AuthOptions {

    @k
    private final String appId;

    @k
    private final String codeChallenge;

    @k
    private final String codeChallengeMethod;

    @l
    private final String locale;

    @l
    private final OAuth oAuth;

    @k
    private final String prompt;

    @k
    private final String redirectUriBrowser;

    @k
    private final String redirectUriCodeFlow;

    @k
    private final Set<String> scopes;

    @k
    private final String sdkVersion;

    @k
    private final String state;

    @k
    private final String statsInfo;

    @l
    private final String theme;
    private final boolean webAuthPhoneScreen;

    public AuthOptions(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k String str6, @l String str7, @l String str8, boolean z12, @l OAuth oAuth, @k String str9, @k Set<String> set, @k String str10, @k String str11) {
        this.appId = str;
        this.codeChallenge = str2;
        this.codeChallengeMethod = str3;
        this.redirectUriCodeFlow = str4;
        this.redirectUriBrowser = str5;
        this.state = str6;
        this.locale = str7;
        this.theme = str8;
        this.webAuthPhoneScreen = z12;
        this.oAuth = oAuth;
        this.prompt = str9;
        this.scopes = set;
        this.statsInfo = str10;
        this.sdkVersion = str11;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthOptions)) {
            return false;
        }
        AuthOptions authOptions = (AuthOptions) other;
        return L.f(this.appId, authOptions.appId) && L.f(this.codeChallenge, authOptions.codeChallenge) && L.f(this.codeChallengeMethod, authOptions.codeChallengeMethod) && L.f(this.redirectUriCodeFlow, authOptions.redirectUriCodeFlow) && L.f(this.redirectUriBrowser, authOptions.redirectUriBrowser) && L.f(this.state, authOptions.state) && L.f(this.locale, authOptions.locale) && L.f(this.theme, authOptions.theme) && this.webAuthPhoneScreen == authOptions.webAuthPhoneScreen && this.oAuth == authOptions.oAuth && L.f(this.prompt, authOptions.prompt) && L.f(this.scopes, authOptions.scopes) && L.f(this.statsInfo, authOptions.statsInfo) && L.f(this.sdkVersion, authOptions.sdkVersion);
    }

    @k
    public final String getAppId() {
        return this.appId;
    }

    @k
    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    @k
    public final String getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    @l
    public final String getLocale() {
        return this.locale;
    }

    @l
    public final OAuth getOAuth() {
        return this.oAuth;
    }

    @k
    public final String getPrompt() {
        return this.prompt;
    }

    @k
    public final String getRedirectUriBrowser() {
        return this.redirectUriBrowser;
    }

    @k
    public final String getRedirectUriCodeFlow() {
        return this.redirectUriCodeFlow;
    }

    @k
    public final Set<String> getScopes() {
        return this.scopes;
    }

    @k
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @k
    public final String getState() {
        return this.state;
    }

    @k
    public final String getStatsInfo() {
        return this.statsInfo;
    }

    @l
    public final String getTheme() {
        return this.theme;
    }

    public final boolean getWebAuthPhoneScreen() {
        return this.webAuthPhoneScreen;
    }

    public int hashCode() {
        int iD2 = H.d(H.d(H.d(H.d(H.d(this.appId.hashCode() * 31, 31, this.codeChallenge), 31, this.codeChallengeMethod), 31, this.redirectUriCodeFlow), 31, this.redirectUriBrowser), 31, this.state);
        String str = this.locale;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.theme;
        int i12 = r.i((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.webAuthPhoneScreen);
        OAuth oAuth = this.oAuth;
        return this.sdkVersion.hashCode() + H.d(m.g(this.scopes, H.d((i12 + (oAuth != null ? oAuth.hashCode() : 0)) * 31, 31, this.prompt), 31), 31, this.statsInfo);
    }

    @k
    public String toString() {
        String str = this.appId;
        String str2 = this.codeChallenge;
        String str3 = this.codeChallengeMethod;
        String str4 = this.redirectUriCodeFlow;
        String str5 = this.redirectUriBrowser;
        String str6 = this.state;
        String str7 = this.locale;
        String str8 = this.theme;
        boolean z12 = this.webAuthPhoneScreen;
        OAuth oAuth = this.oAuth;
        String str9 = this.prompt;
        Set<String> set = this.scopes;
        String str10 = this.statsInfo;
        String str11 = this.sdkVersion;
        StringBuilder sbB = C23088b.b("AuthOptions(appId=", str, ", codeChallenge=", str2, ", codeChallengeMethod=");
        m.p(sbB, str3, ", redirectUriCodeFlow=", str4, ", redirectUriBrowser=");
        m.p(sbB, str5, ", state=", str6, ", locale=");
        m.p(sbB, str7, ", theme=", str8, ", webAuthPhoneScreen=");
        sbB.append(z12);
        sbB.append(", oAuth=");
        sbB.append(oAuth);
        sbB.append(", prompt=");
        sbB.append(str9);
        sbB.append(", scopes=");
        sbB.append(set);
        sbB.append(", statsInfo=");
        return G.h(sbB, str10, ", sdkVersion=", str11, ")");
    }
}
