package com.avito.android.authorization.deep_linking;

import Ku.AbstractC14350a;
import android.net.Uri;
import android.util.Base64;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AuthResult;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.text.C43047d;

/* compiled from: AuthResultLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/authorization/deep_linking/e;", "LKu/a;", "Lcom/avito/android/authorization/deep_linking/AuthResultLink;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.authorization.deep_linking.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28651e extends AbstractC14350a<AuthResultLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) {
        AuthResult authResult;
        try {
            authResult = (AuthResult) gson.d(AuthResult.class, new String(Base64.decode(Ku.i.p(uri, "data"), 8), C43047d.f410589b));
        } catch (Throwable th2) {
            V2.f318762a.a("DEFAULT_TAG", "AuthResulAsyncLinkHandler parser parsing failed", th2);
            authResult = null;
        }
        return new AuthResultLink(authResult);
    }
}
