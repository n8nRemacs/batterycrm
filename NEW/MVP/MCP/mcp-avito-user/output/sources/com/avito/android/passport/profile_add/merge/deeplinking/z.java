package com.avito.android.passport.profile_add.merge.deeplinking;

import Ku.AbstractC14350a;
import androidx.compose.runtime.internal.P;
import com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PassportSelectBusinessVrfLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/deeplinking/z;", "LKu/a;", "Lcom/avito/android/passport/deeplinks/PassportSelectBusinessVrfLink;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class z extends AbstractC14350a<PassportSelectBusinessVrfLink> {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    @Override // Ku.AbstractC14350a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.deep_linking.links.DeepLink r(android.net.Uri r4, com.google.gson.Gson r5, com.avito.android.deep_linking.x r6) throws com.avito.android.deep_linking.links.error.DeeplinkParsingError.WrongParameterValue {
        /*
            r3 = this;
            java.lang.String r5 = "flow"
            java.lang.String r6 = r4.getQueryParameter(r5)
            r0 = 0
            if (r6 == 0) goto L41
            int r1 = r6.hashCode()
            r2 = -1352294148(0xffffffffaf65a0fc, float:-2.0884622E-10)
            if (r1 == r2) goto L35
            r2 = -246033952(0xfffffffff155d1e0, float:-1.0587845E30)
            if (r1 == r2) goto L29
            r2 = 1922487511(0x7296d4d7, float:5.9750476E30)
            if (r1 == r2) goto L1d
            goto L41
        L1d:
            java.lang.String r1 = "finalize_merge"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L26
            goto L41
        L26:
            com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink$Flow r6 = com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink.Flow.f211125c
            goto L42
        L29:
            java.lang.String r1 = "merge_with_profile_prof_convertation"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L32
            goto L41
        L32:
            com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink$Flow r6 = com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink.Flow.f211124b
            goto L42
        L35:
            java.lang.String r1 = "create"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L3e
            goto L41
        L3e:
            com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink$Flow r6 = com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink.Flow.f211126d
            goto L42
        L41:
            r6 = r0
        L42:
            java.lang.String r1 = "draftId"
            java.lang.String r1 = r4.getQueryParameter(r1)
            if (r6 == 0) goto L50
            com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink r4 = new com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink
            r4.<init>(r6, r1)
            return r4
        L50:
            Ku.i.h(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.merge.deeplinking.z.r(android.net.Uri, com.google.gson.Gson, com.avito.android.deep_linking.x):com.avito.android.deep_linking.links.DeepLink");
    }
}
