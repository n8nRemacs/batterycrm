package com.avito.android.verification.links.disclaimer;

import Ku.AbstractC14350a;
import Y61.k;
import com.avito.android.deep_linking.links.VerificationDisclaimerLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationDisclaimerLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/links/disclaimer/a;", "LKu/a;", "Lcom/avito/android/deep_linking/links/VerificationDisclaimerLink;", "<init>", "()V", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC14350a<VerificationDisclaimerLink> {

    /* compiled from: VerificationDisclaimerLinkParser.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/verification/links/disclaimer/a$a;", "", "", "content", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.verification.links.disclaimer.a$a, reason: collision with other inner class name */
    public static final class C10036a {

        @c("content")
        @k
        private final String content;

        public C10036a(@k String str) {
            this.content = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getContent() {
            return this.content;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    @Override // Ku.AbstractC14350a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.deep_linking.links.DeepLink r(android.net.Uri r4, com.google.gson.Gson r5, com.avito.android.deep_linking.x r6) {
        /*
            r3 = this;
            java.util.Map r4 = Ku.i.i(r4)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r4)
            java.lang.String r4 = "toast"
            java.lang.Object r4 = r6.remove(r4)
            java.lang.String r4 = (java.lang.String) r4
            r0 = 0
            if (r4 == 0) goto L19
            java.lang.String r4 = android.net.Uri.decode(r4)
            goto L1a
        L19:
            r4 = r0
        L1a:
            if (r4 == 0) goto L4c
            com.avito.android.verification.links.disclaimer.b r1 = new com.avito.android.verification.links.disclaimer.b     // Catch: java.lang.Throwable -> L42
            r1.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.reflect.Type r1 = r1.getType()     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L39
            r2 = r1
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2     // Catch: java.lang.Throwable -> L42
            boolean r2 = com.avito.android.util.R1.a(r2)     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L39
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1     // Catch: java.lang.Throwable -> L42
            java.lang.reflect.Type r1 = r1.getRawType()     // Catch: java.lang.Throwable -> L42
            goto L3d
        L39:
            java.lang.reflect.Type r1 = com.avito.android.util.R1.b(r1)     // Catch: java.lang.Throwable -> L42
        L3d:
            java.lang.Object r4 = r5.e(r4, r1)     // Catch: java.lang.Throwable -> L42
            goto L43
        L42:
            r4 = r0
        L43:
            com.avito.android.verification.links.disclaimer.a$a r4 = (com.avito.android.verification.links.disclaimer.a.C10036a) r4
            if (r4 == 0) goto L4c
            java.lang.String r4 = r4.getContent()
            goto L4d
        L4c:
            r4 = r0
        L4d:
            com.avito.android.deep_linking.links.VerificationDisclaimerLink r5 = new com.avito.android.deep_linking.links.VerificationDisclaimerLink
            if (r4 == 0) goto L5a
            r0 = 0
            java.lang.String r1 = "+"
            java.lang.String r2 = " "
            java.lang.String r0 = kotlin.text.C43066x.a0(r4, r1, r2, r0)
        L5a:
            r5.<init>(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.links.disclaimer.a.r(android.net.Uri, com.google.gson.Gson, com.avito.android.deep_linking.x):com.avito.android.deep_linking.links.DeepLink");
    }
}
