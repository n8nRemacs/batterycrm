package com.avito.android.str_core;

import Y61.k;
import com.avito.android.remote.d1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrUxFeedbackInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_core/e;", "Lcom/avito/android/str_core/c;", "_avito-discouraged_avito-libs_str-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d1 f288533a;

    @Inject
    public e(@k d1 d1Var) {
        this.f288533a = d1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.str_core.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.avito.android.str_core.d
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.str_core.d r0 = (com.avito.android.str_core.d) r0
            int r1 = r0.f288532s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288532s = r1
            goto L18
        L13:
            com.avito.android.str_core.d r0 = new com.avito.android.str_core.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f288530q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f288532s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.C42729a0.b(r6)
            goto L40
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.C42729a0.b(r6)
            r0.f288532s = r4
            com.avito.android.remote.d1 r6 = r5.f288533a
            java.lang.Object r6 = r6.c(r3, r0)
            if (r6 != r1) goto L40
            return r1
        L40:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r0 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L47
            goto La0
        L47:
            boolean r0 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto La1
            SK0.f r0 = new SK0.f
            r0.<init>()
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r1 = r6.getResult()
            com.avito.android.remote.model.StrUxFeedbackInfoResponse r1 = (com.avito.android.remote.model.StrUxFeedbackInfoResponse) r1
            com.avito.android.remote.model.StrUxFeedbackItem r1 = r1.getItem()
            if (r1 == 0) goto L69
            com.avito.android.remote.model.StrLocationItem r1 = r1.getLocation()
            if (r1 == 0) goto L69
            java.lang.String r1 = r1.getCityName()
            goto L6a
        L69:
            r1 = r3
        L6a:
            java.lang.String r2 = ""
            if (r1 != 0) goto L6f
            r1 = r2
        L6f:
            java.lang.String r4 = "city"
            r0.a(r4, r1)
            java.lang.Object r1 = r6.getResult()
            com.avito.android.remote.model.StrUxFeedbackInfoResponse r1 = (com.avito.android.remote.model.StrUxFeedbackInfoResponse) r1
            java.lang.Integer r1 = r1.getTrxItemsCount()
            if (r1 == 0) goto L84
            java.lang.String r3 = r1.toString()
        L84:
            if (r3 != 0) goto L87
            r3 = r2
        L87:
            java.lang.String r1 = "trxItemsCount"
            r0.a(r1, r3)
            java.lang.Object r6 = r6.getResult()
            com.avito.android.remote.model.StrUxFeedbackInfoResponse r6 = (com.avito.android.remote.model.StrUxFeedbackInfoResponse) r6
            java.lang.String r6 = r6.getUserIdHash()
            if (r6 != 0) goto L99
            goto L9a
        L99:
            r2 = r6
        L9a:
            java.lang.String r6 = "userId"
            r0.a(r6, r2)
            r3 = r0
        La0:
            return r3
        La1:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_core.e.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
