package Gu;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import kotlin.Metadata;
import q50.InterfaceC47203a;

/* compiled from: AuthLinks.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* renamed from: Gu.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13917a {
    public static AuthenticateLink a(int i12, DeepLink deepLink, String str) {
        if ((i12 & 4) != 0) {
            deepLink = null;
        }
        return new AuthenticateLink(str, false, deepLink);
    }
}
