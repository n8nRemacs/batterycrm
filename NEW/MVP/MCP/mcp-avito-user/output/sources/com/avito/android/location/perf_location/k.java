package com.avito.android.location.perf_location;

import android.content.Context;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: PerformanceRegionLocationProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/perf_location/k;", "Lcom/avito/android/location/perf_location/g;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo.j f181838a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo_common.interactor.g f181839b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f181840c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Context f181841d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public volatile f f181842e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.sync.d f181843f = new kotlinx.coroutines.sync.d();

    @Inject
    public k(@Y61.k com.avito.android.geo.j jVar, @Y61.k com.avito.android.geo_common.interactor.g gVar, @Y61.k a aVar, @Y61.k Context context) {
        this.f181838a = jVar;
        this.f181839b = gVar;
        this.f181840c = aVar;
        this.f181841d = context;
    }

    @Override // com.avito.android.location.perf_location.g
    @Y61.l
    public final Object a(boolean z12, @Y61.k SuspendLambda suspendLambda) {
        f fVar = this.f181842e;
        if (fVar != null) {
            com.avito.android.time.c.f301452a.getClass();
            if (com.avito.android.time.c.f301453b.a() <= fVar.f181823b) {
                return fVar.f181822a;
            }
        }
        return c(z12, suspendLambda);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r16, boolean r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = r18
            boolean r2 = r1 instanceof com.avito.android.location.perf_location.h
            if (r2 == 0) goto L16
            r2 = r1
            com.avito.android.location.perf_location.h r2 = (com.avito.android.location.perf_location.h) r2
            int r3 = r2.f181828u
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f181828u = r3
            goto L1b
        L16:
            com.avito.android.location.perf_location.h r2 = new com.avito.android.location.perf_location.h
            r2.<init>(r15, r1)
        L1b:
            java.lang.Object r1 = r2.f181826s
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f181828u
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L45
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L32
            com.avito.android.location.perf_location.k r2 = r2.f181824q
            kotlin.C42729a0.b(r1)
            goto L8a
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            android.content.Context r4 = r2.f181825r
            com.avito.android.location.perf_location.k r6 = r2.f181824q
            kotlin.C42729a0.b(r1)
            r14 = r4
            r4 = r1
            r1 = r14
            goto L73
        L45:
            kotlin.C42729a0.b(r1)
            com.avito.android.geo.j r1 = r0.f181838a
            android.location.Location r1 = r1.j()
            if (r1 == 0) goto L5e
            com.avito.android.remote.model.Coordinates r4 = new com.avito.android.remote.model.Coordinates
            double r8 = r1.getLatitude()
            double r10 = r1.getLongitude()
            r4.<init>(r8, r10)
            goto L5f
        L5e:
            r4 = r7
        L5f:
            if (r4 != 0) goto L77
            if (r17 == 0) goto L76
            r2.f181824q = r0
            r1 = r16
            r2.f181825r = r1
            r2.f181828u = r6
            java.lang.Object r4 = r15.d(r2)
            if (r4 != r3) goto L72
            return r3
        L72:
            r6 = r0
        L73:
            com.avito.android.remote.model.Coordinates r4 = (com.avito.android.remote.model.Coordinates) r4
            goto L7a
        L76:
            return r7
        L77:
            r1 = r16
            r6 = r0
        L7a:
            r2.f181824q = r6
            r2.f181825r = r7
            r2.f181828u = r5
            com.avito.android.location.perf_location.a r5 = r6.f181840c
            java.lang.Object r1 = r5.a(r1, r4, r2)
            if (r1 != r3) goto L89
            return r3
        L89:
            r2 = r6
        L8a:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L9c
            com.avito.android.location.perf_location.f r3 = new com.avito.android.location.perf_location.f
            r13 = 0
            r10 = 0
            r12 = 2
            r8 = r3
            r9 = r1
            r8.<init>(r9, r10, r12, r13)
            r2.f181842e = r3
            r7 = r1
        L9c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.location.perf_location.k.b(android.content.Context, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v15, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7, types: [kotlinx.coroutines.sync.a] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.avito.android.location.perf_location.i
            if (r0 == 0) goto L13
            r0 = r14
            com.avito.android.location.perf_location.i r0 = (com.avito.android.location.perf_location.i) r0
            int r1 = r0.f181834v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181834v = r1
            goto L18
        L13:
            com.avito.android.location.perf_location.i r0 = new com.avito.android.location.perf_location.i
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f181832t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f181834v
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L4a
            if (r2 == r3) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r13 = r0.f181829q
            kotlinx.coroutines.sync.a r13 = (kotlinx.coroutines.sync.a) r13
            kotlin.C42729a0.b(r14)     // Catch: java.lang.Throwable -> L32
            goto L91
        L32:
            r14 = move-exception
            goto La0
        L35:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3d:
            boolean r13 = r0.f181831s
            kotlinx.coroutines.sync.d r2 = r0.f181830r
            java.lang.Object r6 = r0.f181829q
            com.avito.android.location.perf_location.k r6 = (com.avito.android.location.perf_location.k) r6
            kotlin.C42729a0.b(r14)
            r14 = r2
            goto L5f
        L4a:
            kotlin.C42729a0.b(r14)
            kotlinx.coroutines.sync.d r14 = r12.f181843f
            r0.f181829q = r12
            r0.f181830r = r14
            r0.f181831s = r13
            r0.f181834v = r3
            java.lang.Object r2 = r14.b(r0)
            if (r2 != r1) goto L5e
            return r1
        L5e:
            r6 = r12
        L5f:
            com.avito.android.location.perf_location.f r2 = r6.f181842e     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L7f
            com.avito.android.time.c r7 = com.avito.android.time.c.f301452a     // Catch: java.lang.Throwable -> L9e
            r7.getClass()     // Catch: java.lang.Throwable -> L9e
            com.avito.android.time.b r7 = com.avito.android.time.c.f301453b     // Catch: java.lang.Throwable -> L9e
            long r7 = r7.a()     // Catch: java.lang.Throwable -> L9e
            long r9 = r2.f181823b     // Catch: java.lang.Throwable -> L9e
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L75
            goto L76
        L75:
            r3 = 0
        L76:
            if (r3 != 0) goto L7f
            java.lang.String r13 = r2.f181822a     // Catch: java.lang.Throwable -> L9e
            goto L9a
        L7b:
            r11 = r14
            r14 = r13
            r13 = r11
            goto La0
        L7f:
            android.content.Context r2 = r6.f181841d     // Catch: java.lang.Throwable -> L9e
            r0.f181829q = r14     // Catch: java.lang.Throwable -> L9e
            r0.f181830r = r5     // Catch: java.lang.Throwable -> L9e
            r0.f181834v = r4     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r13 = r6.b(r2, r13, r0)     // Catch: java.lang.Throwable -> L9e
            if (r13 != r1) goto L8e
            return r1
        L8e:
            r11 = r14
            r14 = r13
            r13 = r11
        L91:
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L32
            if (r14 != 0) goto L97
            java.lang.String r14 = ""
        L97:
            r11 = r14
            r14 = r13
            r13 = r11
        L9a:
            r14.d(r5)
            return r13
        L9e:
            r13 = move-exception
            goto L7b
        La0:
            r13.d(r5)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.location.perf_location.k.c(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.avito.android.location.perf_location.j
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.location.perf_location.j r0 = (com.avito.android.location.perf_location.j) r0
            int r1 = r0.f181837s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f181837s = r1
            goto L18
        L13:
            com.avito.android.location.perf_location.j r0 = new com.avito.android.location.perf_location.j
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f181835q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f181837s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.C42729a0.b(r6)
            r0.f181837s = r3
            com.avito.android.geo_common.interactor.g r6 = r5.f181839b
            java.lang.Object r6 = r6.w(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r0 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L63
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r6 = r6.getResult()
            uF.g r6 = (uF.g) r6
            com.avito.android.remote.model.Coordinates r0 = new com.avito.android.remote.model.Coordinates
            com.avito.android.remote.model.Coordinates r1 = r6.getCoordinates()
            double r1 = r1.getLatitude()
            com.avito.android.remote.model.Coordinates r6 = r6.getCoordinates()
            double r3 = r6.getLongitude()
            r0.<init>(r1, r3)
            goto L7b
        L63:
            boolean r0 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L7c
            com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
            com.avito.android.remote.error.ApiError r0 = r6.getError()
            java.lang.Throwable r6 = r6.getCause()
            com.avito.android.util.C35936s.a(r0, r6)
            com.avito.android.remote.model.Coordinates r0 = new com.avito.android.remote.model.Coordinates
            r1 = 0
            r0.<init>(r1, r1)
        L7b:
            return r0
        L7c:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.location.perf_location.k.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
