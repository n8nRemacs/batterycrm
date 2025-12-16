package com.avito.android.verification.links.redirect;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationRedirectLinkInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/redirect/g;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BM0.a f324362a;

    @Inject
    public g(@Y61.k BM0.a aVar) {
        this.f324362a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.util.LinkedHashMap r8, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.avito.android.verification.links.redirect.f
            if (r0 == 0) goto L13
            r0 = r9
            com.avito.android.verification.links.redirect.f r0 = (com.avito.android.verification.links.redirect.f) r0
            int r1 = r0.f324361s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f324361s = r1
            goto L18
        L13:
            com.avito.android.verification.links.redirect.f r0 = new com.avito.android.verification.links.redirect.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f324359q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f324361s
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.C42729a0.b(r9)     // Catch: java.lang.Throwable -> L2a
            goto L75
        L2a:
            r8 = move-exception
            goto Lc3
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.C42729a0.b(r9)
            java.lang.String r9 = "flow"
            java.lang.Object r9 = r8.remove(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r2 = ""
            if (r9 != 0) goto L45
            r9 = r2
        L45:
            java.lang.String r5 = "type"
            java.lang.Object r5 = r8.remove(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L50
            goto L51
        L50:
            r2 = r5
        L51:
            java.lang.String r5 = "skipChooseCategoryStep"
            java.lang.Object r5 = r8.remove(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L64
            boolean r5 = java.lang.Boolean.parseBoolean(r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            goto L65
        L64:
            r5 = r4
        L65:
            DM0.d r6 = new DM0.d
            r6.<init>(r8, r9, r5, r2)
            BM0.a r8 = r7.f324362a     // Catch: java.lang.Throwable -> L2a
            r0.f324361s = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r9 = r8.c(r6, r0)     // Catch: java.lang.Throwable -> L2a
            if (r9 != r1) goto L75
            return r1
        L75:
            com.avito.android.remote.model.TypedResult r9 = (com.avito.android.remote.model.TypedResult) r9     // Catch: java.lang.Throwable -> L2a
            boolean r8 = r9 instanceof com.avito.android.remote.model.TypedResult.Success     // Catch: java.lang.Throwable -> L2a
            if (r8 == 0) goto La2
            com.avito.android.remote.model.TypedResult$Success r9 = (com.avito.android.remote.model.TypedResult.Success) r9     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r8 = r9.getResult()     // Catch: java.lang.Throwable -> L2a
            DM0.e r8 = (DM0.e) r8     // Catch: java.lang.Throwable -> L2a
            boolean r9 = r8 instanceof DM0.e.a     // Catch: java.lang.Throwable -> L2a
            if (r9 == 0) goto L90
            com.avito.android.verification.links.redirect.a$a r9 = new com.avito.android.verification.links.redirect.a$a     // Catch: java.lang.Throwable -> L2a
            DM0.e$a r8 = (DM0.e.a) r8     // Catch: java.lang.Throwable -> L2a
            r0 = 2
            r9.<init>(r8, r4, r0, r4)     // Catch: java.lang.Throwable -> L2a
            goto Lc8
        L90:
            boolean r9 = r8 instanceof DM0.e.b     // Catch: java.lang.Throwable -> L2a
            if (r9 == 0) goto L9c
            com.avito.android.verification.links.redirect.a$b r9 = new com.avito.android.verification.links.redirect.a$b     // Catch: java.lang.Throwable -> L2a
            DM0.e$b r8 = (DM0.e.b) r8     // Catch: java.lang.Throwable -> L2a
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2a
            goto Lc8
        L9c:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L2a
            r8.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r8     // Catch: java.lang.Throwable -> L2a
        La2:
            boolean r8 = r9 instanceof com.avito.android.remote.model.TypedResult.Error     // Catch: java.lang.Throwable -> L2a
            if (r8 == 0) goto Lbd
            r8 = r9
            com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8     // Catch: java.lang.Throwable -> L2a
            com.avito.android.remote.error.ApiError r8 = r8.getError()     // Catch: java.lang.Throwable -> L2a
            com.avito.android.remote.model.TypedResult$Error r9 = (com.avito.android.remote.model.TypedResult.Error) r9     // Catch: java.lang.Throwable -> L2a
            java.lang.Throwable r9 = r9.getCause()     // Catch: java.lang.Throwable -> L2a
            com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r8, r9)     // Catch: java.lang.Throwable -> L2a
            com.avito.android.verification.links.redirect.a$a r9 = new com.avito.android.verification.links.redirect.a$a     // Catch: java.lang.Throwable -> L2a
            r9.<init>(r4, r8, r3, r4)     // Catch: java.lang.Throwable -> L2a
            goto Lc8
        Lbd:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L2a
            r8.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r8     // Catch: java.lang.Throwable -> L2a
        Lc3:
            com.avito.android.verification.links.redirect.a$a r9 = new com.avito.android.verification.links.redirect.a$a
            r9.<init>(r4, r8, r3, r4)
        Lc8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.links.redirect.g.a(java.util.LinkedHashMap, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
