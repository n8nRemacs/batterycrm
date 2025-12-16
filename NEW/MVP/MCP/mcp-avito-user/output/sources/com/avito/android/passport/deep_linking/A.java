package com.avito.android.passport.deep_linking;

import Ku.AbstractC14350a;
import androidx.compose.runtime.internal.P;
import com.avito.android.passport.deeplinks.PhoneManagementLink;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhoneManagementAsyncLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/deep_linking/A;", "LKu/a;", "Lcom/avito/android/passport/deeplinks/PhoneManagementLink;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class A extends AbstractC14350a<PhoneManagementLink> {
    @Inject
    public A() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    @Override // Ku.AbstractC14350a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.deep_linking.links.DeepLink r(android.net.Uri r8, com.google.gson.Gson r9, com.avito.android.deep_linking.x r10) throws com.avito.android.deep_linking.links.error.DeeplinkParsingError.Custom {
        /*
            r7 = this;
            java.lang.String r9 = "actionType"
            java.lang.String r9 = r8.getQueryParameter(r9)
            r10 = 0
            if (r9 == 0) goto L41
            int r0 = r9.hashCode()
            switch(r0) {
                case -1570036210: goto L35;
                case -1335458389: goto L2a;
                case 1094496948: goto L1e;
                case 1405214180: goto L11;
                default: goto L10;
            }
        L10:
            goto L41
        L11:
            java.lang.String r0 = "setToAll"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L1a
            goto L41
        L1a:
            com.avito.android.passport.deeplinks.PhoneManagementLink$ActionType r9 = com.avito.android.passport.deeplinks.PhoneManagementLink.ActionType.SET_TO_ALL
        L1c:
            r1 = r9
            goto L42
        L1e:
            java.lang.String r0 = "replace"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L27
            goto L41
        L27:
            com.avito.android.passport.deeplinks.PhoneManagementLink$ActionType r9 = com.avito.android.passport.deeplinks.PhoneManagementLink.ActionType.REPLACE
            goto L1c
        L2a:
            java.lang.String r0 = "delete"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L41
            com.avito.android.passport.deeplinks.PhoneManagementLink$ActionType r9 = com.avito.android.passport.deeplinks.PhoneManagementLink.ActionType.DELETE
            goto L1c
        L35:
            java.lang.String r0 = "replaceAndDelete"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L3e
            goto L41
        L3e:
            com.avito.android.passport.deeplinks.PhoneManagementLink$ActionType r9 = com.avito.android.passport.deeplinks.PhoneManagementLink.ActionType.REPLACE_AND_DELETE
            goto L1c
        L41:
            r1 = r10
        L42:
            if (r1 == 0) goto L51
            com.avito.android.passport.deeplinks.PhoneManagementLink r8 = new com.avito.android.passport.deeplinks.PhoneManagementLink
            r5 = 14
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
        L51:
            java.lang.String r9 = "Unknown actionType!"
            Ku.i.g(r7, r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.deep_linking.A.r(android.net.Uri, com.google.gson.Gson, com.avito.android.deep_linking.x):com.avito.android.deep_linking.links.DeepLink");
    }
}
