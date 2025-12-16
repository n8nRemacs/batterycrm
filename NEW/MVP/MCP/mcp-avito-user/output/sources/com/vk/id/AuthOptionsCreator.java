package com.vk.id;

import Y61.k;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.vk.id.auth.Prompt;
import com.vk.id.auth.VKIDAuthParams;
import com.vk.id.internal.auth.AuthOptions;
import com.vk.id.internal.auth.AuthOptionsKt;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.auth.pkce.PkceGeneratorSHA256;
import com.vk.id.internal.state.StateGenerator;
import com.vk.id.internal.store.InternalVKIDPrefsStore;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AuthOptionsCreator.kt */
@P
@s0
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/vk/id/AuthOptionsCreator;", "", "Landroid/content/Context;", "appContext", "Lkotlin/C;", "Lcom/vk/id/internal/auth/pkce/PkceGeneratorSHA256;", "pkceGenerator", "Lcom/vk/id/internal/store/InternalVKIDPrefsStore;", "prefsStore", "Lcom/vk/id/internal/auth/ServiceCredentials;", "serviceCredentials", "Lcom/vk/id/internal/state/StateGenerator;", "stateGenerator", "<init>", "(Landroid/content/Context;Lkotlin/C;Lkotlin/C;Lkotlin/C;Lcom/vk/id/internal/state/StateGenerator;)V", "Lcom/vk/id/auth/VKIDAuthParams;", "authParams", "Lcom/vk/id/StatParams;", "statParams", "Lcom/vk/id/internal/auth/AuthOptions;", "create$vkid_release", "(Lcom/vk/id/auth/VKIDAuthParams;Lcom/vk/id/StatParams;)Lcom/vk/id/internal/auth/AuthOptions;", "create", "Landroid/content/Context;", "Lkotlin/C;", "Lcom/vk/id/internal/state/StateGenerator;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthOptionsCreator {

    @k
    private final Context appContext;

    @k
    private final InterfaceC42726C<PkceGeneratorSHA256> pkceGenerator;

    @k
    private final InterfaceC42726C<InternalVKIDPrefsStore> prefsStore;

    @k
    private final InterfaceC42726C<ServiceCredentials> serviceCredentials;

    @k
    private final StateGenerator stateGenerator;

    /* compiled from: AuthOptionsCreator.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Prompt.values().length];
            try {
                iArr[Prompt.LOGIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Prompt.CONSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AuthOptionsCreator(@k Context context, @k InterfaceC42726C<PkceGeneratorSHA256> interfaceC42726C, @k InterfaceC42726C<InternalVKIDPrefsStore> interfaceC42726C2, @k InterfaceC42726C<ServiceCredentials> interfaceC42726C3, @k StateGenerator stateGenerator) {
        this.appContext = context;
        this.pkceGenerator = interfaceC42726C;
        this.prefsStore = interfaceC42726C2;
        this.serviceCredentials = interfaceC42726C3;
        this.stateGenerator = stateGenerator;
    }

    @k
    public final AuthOptions create$vkid_release(@k VKIDAuthParams authParams, @k StatParams statParams) throws JSONException, NoSuchAlgorithmException {
        String codeChallenge = authParams.getCodeChallenge();
        if (codeChallenge == null) {
            String strGenerateRandomCodeVerifier = this.pkceGenerator.getValue().generateRandomCodeVerifier(new SecureRandom());
            this.prefsStore.getValue().setCodeVerifier$vkid_release(strGenerateRandomCodeVerifier);
            codeChallenge = this.pkceGenerator.getValue().deriveCodeVerifierChallenge(strGenerateRandomCodeVerifier);
        }
        String str = codeChallenge;
        String state = authParams.getState();
        if (state != null) {
            this.prefsStore.getValue().setState(state);
        } else {
            state = this.stateGenerator.regenerateState();
        }
        String str2 = state;
        VKIDAuthParams.Locale locale = authParams.getLocale();
        if (locale == null) {
            locale = VKIDAuthParams.Locale.INSTANCE.systemLocale$vkid_release(this.appContext);
        }
        VKIDAuthParams.Theme theme = authParams.getTheme();
        if (theme == null) {
            theme = VKIDAuthParams.Theme.INSTANCE.systemTheme(this.appContext);
        }
        ServiceCredentials value = this.serviceCredentials.getValue();
        JSONObject jSONObject = new JSONObject();
        AuthOptionsCreatorKt.addOAuthParams(jSONObject, authParams.getScopes$vkid_release());
        Uri uri = Uri.parse(value.getRedirectUri());
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("oauth2_params", AuthOptionsCreatorKt.toBase64(jSONObject));
        Uri.Builder builderBuildUpon2 = uri.buildUpon();
        JSONObject jSONObjectCreateStatsInfo = AuthOptionsCreatorKt.createStatsInfo(statParams);
        AuthOptionsCreatorKt.addStatParams(jSONObject, jSONObjectCreateStatsInfo);
        builderBuildUpon2.appendQueryParameter("oauth2_params", AuthOptionsCreatorKt.toBase64(jSONObject));
        builderBuildUpon2.appendQueryParameter("v", "2.5.1");
        String clientID = value.getClientID();
        String string = builderBuildUpon.toString();
        String string2 = builderBuildUpon2.toString();
        String queryParam = locale != null ? AuthOptionsKt.toQueryParam(locale) : null;
        String queryParam2 = theme != null ? AuthOptionsKt.toQueryParam(theme) : null;
        boolean z12 = !authParams.getUseOAuthProviderIfPossible();
        OAuth oAuth = authParams.getOAuth();
        int i12 = WhenMappings.$EnumSwitchMapping$0[authParams.getPrompt().ordinal()];
        return new AuthOptions(clientID, str, "sha256", string2, string, str2, queryParam, queryParam2, z12, oAuth, i12 != 1 ? i12 != 2 ? "" : "consent" : "login", authParams.getScopes$vkid_release(), AuthOptionsCreatorKt.toBase64(jSONObjectCreateStatsInfo), "2.5.1");
    }
}
