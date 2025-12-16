package com.avito.android.oauth.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OAuthDeepLinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/oauth/deeplink/d;", "LKu/a;", "Lcom/avito/android/oauth/deeplink/OAuthDeepLink;", "<init>", "()V", "a", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends AbstractC14350a<OAuthDeepLink> {

    /* compiled from: OAuthDeepLinkParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/oauth/deeplink/d$a;", "", "<init>", "()V", "", "CLIENT_ID_PARAM_NAME", "Ljava/lang/String;", "CODE_CHALLENGE_METHOD_PARAM_NAME", "CODE_CHALLENGE_PARAM_NAME", "REDIRECT_URI_PARAM_NAME", "RESPONSE_TYPE_PARAM_NAME", "SCOPE_PARAM_NAME", "STATE_PARAM_NAME", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter = uri.getQueryParameter("client_id");
        if (queryParameter == null) {
            throw new IllegalArgumentException("client_id parameter should be passed in link uri");
        }
        String queryParameter2 = uri.getQueryParameter("response_type");
        if (queryParameter2 == null) {
            throw new IllegalArgumentException("response_type parameter should be passed in link uri");
        }
        String queryParameter3 = uri.getQueryParameter("scope");
        if (queryParameter3 != null) {
            return new OAuthDeepLink(uri, queryParameter, queryParameter3, queryParameter2, uri.getQueryParameter(VoiceInfo.STATE), uri.getQueryParameter("code_challenge_method"), uri.getQueryParameter("code_challenge"), uri.getQueryParameter("redirect_uri"));
        }
        throw new IllegalArgumentException("scope parameter should be passed in link uri");
    }
}
