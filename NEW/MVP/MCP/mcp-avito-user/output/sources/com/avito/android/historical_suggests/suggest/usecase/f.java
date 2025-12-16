package com.avito.android.historical_suggests.suggest.usecase;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import pI.InterfaceC46962a;

/* compiled from: GetIdByCoordinatesUseCase.kt */
@P
@h31.j
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/historical_suggests/suggest/usecase/f;", "", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f162160a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC46962a> f162161b;

    @Inject
    public f(@Y61.k c cVar, @Y61.k h31.e<InterfaceC46962a> eVar) {
        this.f162160a = cVar;
        this.f162161b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.l java.lang.Double r12, @Y61.l java.lang.Double r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.avito.android.historical_suggests.suggest.usecase.e
            if (r0 == 0) goto L13
            r0 = r14
            com.avito.android.historical_suggests.suggest.usecase.e r0 = (com.avito.android.historical_suggests.suggest.usecase.e) r0
            int r1 = r0.f162159t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162159t = r1
            goto L18
        L13:
            com.avito.android.historical_suggests.suggest.usecase.e r0 = new com.avito.android.historical_suggests.suggest.usecase.e
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f162157r
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f162159t
            r9 = 0
            r10 = 2
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 == r2) goto L35
            if (r1 != r10) goto L2d
            kotlin.C42729a0.b(r14)
            goto L8e
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            com.avito.android.historical_suggests.suggest.usecase.f r12 = r0.f162156q
            kotlin.C42729a0.b(r14)
            goto L64
        L3b:
            kotlin.C42729a0.b(r14)
            if (r12 == 0) goto Lb3
            double r3 = r12.doubleValue()
            if (r13 == 0) goto Lb3
            double r12 = r13.doubleValue()
            h31.e<pI.a> r14 = r11.f162161b
            java.lang.Object r14 = r14.get()
            r1 = r14
            pI.a r1 = (pI.InterfaceC46962a) r1
            r0.f162156q = r11
            r0.f162159t = r2
            java.lang.String r6 = "publish"
            r2 = r3
            r4 = r12
            r7 = r0
            java.lang.Object r14 = r1.n(r2, r4, r6, r7)
            if (r14 != r8) goto L63
            return r8
        L63:
            r12 = r11
        L64:
            com.avito.android.remote.model.TypedResult r14 = (com.avito.android.remote.model.TypedResult) r14
            boolean r13 = r14 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r13 == 0) goto L9b
            com.avito.android.remote.model.TypedResult$Success r14 = (com.avito.android.remote.model.TypedResult.Success) r14
            java.lang.Object r13 = r14.getResult()
            qI.a r13 = (qI.C47298a) r13
            com.avito.android.historical_suggests.suggest.usecase.c r12 = r12.f162160a
            java.lang.String r13 = r13.getJsonWebToken()
            r0.f162156q = r9
            r0.f162159t = r10
            com.avito.android.util.R0 r14 = r12.f162154a
            kotlinx.coroutines.scheduling.b r14 = r14.a()
            com.avito.android.historical_suggests.suggest.usecase.b r1 = new com.avito.android.historical_suggests.suggest.usecase.b
            r1.<init>(r13, r12, r9)
            java.lang.Object r14 = kotlinx.coroutines.C43259k.g(r14, r1, r0)
            if (r14 != r8) goto L8e
            return r8
        L8e:
            qI.c r14 = (qI.C47300c) r14
            if (r14 == 0) goto L9a
            java.lang.String r12 = r14.getId()
            if (r12 != 0) goto L99
            goto L9a
        L99:
            return r12
        L9a:
            return r9
        L9b:
            boolean r12 = r14 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r12 == 0) goto Lad
            com.avito.android.remote.model.TypedResult$Error r14 = (com.avito.android.remote.model.TypedResult.Error) r14
            com.avito.android.remote.error.ApiError r12 = r14.getError()
            java.lang.Throwable r13 = r14.getCause()
            com.avito.android.util.C35936s.a(r12, r13)
            return r9
        Lad:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        Lb3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.historical_suggests.suggest.usecase.f.a(java.lang.Double, java.lang.Double, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
