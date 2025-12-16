package com.avito.android.auth_passwordless.links;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.auth_passwordless.AuthPasswordlessLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: AuthPasswordlessLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/auth_passwordless/links/o;", "LKu/a;", "Lcom/avito/android/auth_passwordless/AuthPasswordlessLink;", "<init>", "()V", "_avito_auth-passwordless_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o extends AbstractC14350a<AuthPasswordlessLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String queryParameter = uri.getQueryParameter(MessageBody.SystemMessageBody.Platform.FLOW);
        if (queryParameter != null) {
            return new AuthPasswordlessLink(queryParameter);
        }
        Ku.i.h(uri, MessageBody.SystemMessageBody.Platform.FLOW);
        throw null;
    }
}
