package com.avito.android.vas_autoprolong.screens.autoprolong.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import eL0.InterfaceC40020a;
import fL0.InterfaceC40310a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SetVasAutoprolongUseCaseImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_autoprolong/screens/autoprolong/domain/e;", "LeL0/a;", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements InterfaceC40020a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC40310a f319526a;

    public e(@k InterfaceC40310a interfaceC40310a) {
        this.f319526a = interfaceC40310a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // eL0.InterfaceC40020a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r16, @Y61.k java.lang.String r18, boolean r19, long r20, long r22, long r24, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            r15 = this;
            r0 = r15
            r1 = r26
            boolean r2 = r1 instanceof com.avito.android.vas_autoprolong.screens.autoprolong.domain.d
            if (r2 == 0) goto L17
            r2 = r1
            com.avito.android.vas_autoprolong.screens.autoprolong.domain.d r2 = (com.avito.android.vas_autoprolong.screens.autoprolong.domain.d) r2
            int r3 = r2.f319525s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f319525s = r3
        L15:
            r14 = r2
            goto L1d
        L17:
            com.avito.android.vas_autoprolong.screens.autoprolong.domain.d r2 = new com.avito.android.vas_autoprolong.screens.autoprolong.domain.d
            r2.<init>(r15, r1)
            goto L15
        L1d:
            java.lang.Object r1 = r14.f319523q
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r14.f319525s
            r4 = 1
            if (r3 == 0) goto L36
            if (r3 != r4) goto L2e
            kotlin.C42729a0.b(r1)
            goto L50
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            kotlin.C42729a0.b(r1)
            r14.f319525s = r4
            fL0.a r3 = r0.f319526a
            r4 = r18
            r5 = r20
            r7 = r19
            r8 = r16
            r10 = r22
            r12 = r24
            java.lang.Object r1 = r3.a(r4, r5, r7, r8, r10, r12, r14)
            if (r1 != r2) goto L50
            return r2
        L50:
            com.avito.android.remote.model.TypedResult r1 = (com.avito.android.remote.model.TypedResult) r1
            boolean r2 = r1 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r2 == 0) goto L68
            com.avito.android.remote.model.TypedResult$Success r1 = (com.avito.android.remote.model.TypedResult.Success) r1
            java.lang.Object r1 = r1.getResult()
            gL0.a r1 = (gL0.C40597a) r1
            eL0.a$a$b r2 = new eL0.a$a$b
            com.avito.android.deep_linking.links.DeepLink r1 = r1.getUri()
            r2.<init>(r1)
            goto L83
        L68:
            boolean r2 = r1 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r2 == 0) goto L84
            com.avito.android.remote.model.TypedResult$Error r1 = (com.avito.android.remote.model.TypedResult.Error) r1
            com.avito.android.remote.error.ApiError r2 = r1.getError()
            java.lang.Throwable r1 = r1.getCause()
            com.avito.android.util.ApiException r1 = com.avito.android.util.C35936s.a(r2, r1)
            eL0.a$a$a r2 = new eL0.a$a$a
            com.avito.android.remote.error.ApiError r1 = com.avito.android.error.z.n(r1)
            r2.<init>(r1)
        L83:
            return r2
        L84:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_autoprolong.screens.autoprolong.domain.e.a(long, java.lang.String, boolean, long, long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
