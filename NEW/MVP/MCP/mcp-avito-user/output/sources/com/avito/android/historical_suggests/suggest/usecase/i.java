package com.avito.android.historical_suggests.suggest.usecase;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GetIdFromJwtUseCase.kt */
@P
@h31.j
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/historical_suggests/suggest/usecase/i;", "", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f162168a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f162169b;

    @Inject
    public i(@Y61.k c cVar, @Y61.k f fVar) {
        this.f162168a = cVar;
        this.f162169b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.l java.lang.String r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.avito.android.historical_suggests.suggest.usecase.h
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.historical_suggests.suggest.usecase.h r0 = (com.avito.android.historical_suggests.suggest.usecase.h) r0
            int r1 = r0.f162167t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162167t = r1
            goto L18
        L13:
            com.avito.android.historical_suggests.suggest.usecase.h r0 = new com.avito.android.historical_suggests.suggest.usecase.h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f162165r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f162167t
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            kotlin.C42729a0.b(r8)
            goto L77
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            com.avito.android.historical_suggests.suggest.usecase.i r7 = r0.f162164q
            kotlin.C42729a0.b(r8)
            goto L57
        L3b:
            kotlin.C42729a0.b(r8)
            r0.f162164q = r6
            r0.f162167t = r5
            com.avito.android.historical_suggests.suggest.usecase.c r8 = r6.f162168a
            com.avito.android.util.R0 r2 = r8.f162154a
            kotlinx.coroutines.scheduling.b r2 = r2.a()
            com.avito.android.historical_suggests.suggest.usecase.b r5 = new com.avito.android.historical_suggests.suggest.usecase.b
            r5.<init>(r7, r8, r3)
            java.lang.Object r8 = kotlinx.coroutines.C43259k.g(r2, r5, r0)
            if (r8 != r1) goto L56
            return r1
        L56:
            r7 = r6
        L57:
            qI.c r8 = (qI.C47300c) r8
            if (r8 != 0) goto L5c
            return r3
        L5c:
            java.lang.String r2 = r8.getId()
            if (r2 != 0) goto L78
            com.avito.android.historical_suggests.suggest.usecase.f r7 = r7.f162169b
            java.lang.Double r2 = r8.getLatitude()
            java.lang.Double r8 = r8.getLongitude()
            r0.f162164q = r3
            r0.f162167t = r4
            java.lang.Object r8 = r7.a(r2, r8, r0)
            if (r8 != r1) goto L77
            return r1
        L77:
            return r8
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.historical_suggests.suggest.usecase.i.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
