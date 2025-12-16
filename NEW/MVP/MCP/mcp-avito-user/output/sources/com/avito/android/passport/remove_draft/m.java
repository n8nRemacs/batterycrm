package com.avito.android.passport.remove_draft;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PassportRemoveDraftProfileInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/remove_draft/m;", "Lcom/avito/android/passport/remove_draft/k;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<I50.a> f213910a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport_lib.h f213911b;

    @Inject
    public m(@Y61.k h31.e<I50.a> eVar, @Y61.k com.avito.android.passport_lib.h hVar) {
        this.f213910a = eVar;
        this.f213911b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.passport.remove_draft.k
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.avito.android.passport.remove_draft.l
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.passport.remove_draft.l r0 = (com.avito.android.passport.remove_draft.l) r0
            int r1 = r0.f213909t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213909t = r1
            goto L18
        L13:
            com.avito.android.passport.remove_draft.l r0 = new com.avito.android.passport.remove_draft.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f213907r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f213909t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f213906q
            kotlin.C42729a0.b(r7)
            goto L6a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f213906q
            com.avito.android.passport.remove_draft.m r6 = (com.avito.android.passport.remove_draft.m) r6
            kotlin.C42729a0.b(r7)
            goto L55
        L3e:
            kotlin.C42729a0.b(r7)
            h31.e<I50.a> r7 = r5.f213910a
            java.lang.Object r7 = r7.get()
            I50.a r7 = (I50.a) r7
            r0.f213906q = r5
            r0.f213909t = r4
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r6 = r5
        L55:
            r2 = r7
            com.avito.android.remote.model.TypedResult r2 = (com.avito.android.remote.model.TypedResult) r2
            boolean r2 = r2 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r2 == 0) goto L6b
            com.avito.android.passport_lib.h r6 = r6.f213911b
            r0.f213906q = r7
            r0.f213909t = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L69
            return r1
        L69:
            r6 = r7
        L6a:
            r7 = r6
        L6b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.remove_draft.m.a(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
