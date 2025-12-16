package ru.mts.biometry.api.dataSource;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import okhttp3.HttpUrl;
import retrofit2.z;
import y91.InterfaceC50089b;

/* compiled from: RecognitionDataSourceImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/mts/biometry/api/dataSource/o;", "Lru/mts/biometry/api/dataSource/l;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class o implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final z f436352a;

    /* renamed from: b, reason: collision with root package name */
    public HttpUrl f436353b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC50089b f436354c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public String f436355d = "";

    public o(@Y61.k z zVar) {
        this.f436352a = zVar;
    }

    @Y61.l
    public final Object a(@Y61.k SuspendLambda suspendLambda) {
        InterfaceC50089b interfaceC50089b = this.f436354c;
        if (interfaceC50089b == null) {
            interfaceC50089b = null;
        }
        Object objH = interfaceC50089b.h(this.f436355d, suspendLambda);
        return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.util.List r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws ru.mts.biometry.api.ApiException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ru.mts.biometry.api.dataSource.m
            if (r0 == 0) goto L13
            r0 = r8
            ru.mts.biometry.api.dataSource.m r0 = (ru.mts.biometry.api.dataSource.m) r0
            int r1 = r0.f436347s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f436347s = r1
            goto L18
        L13:
            ru.mts.biometry.api.dataSource.m r0 = new ru.mts.biometry.api.dataSource.m
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f436345q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f436347s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r8)
            goto L69
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.C42729a0.b(r8)
            y91.b r8 = r6.f436354c
            if (r8 != 0) goto L39
            r8 = 0
        L39:
            java.lang.String r2 = r6.f436355d
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C42745f0.q(r7, r5)
            r4.<init>(r5)
            java.util.Iterator r7 = r7.iterator()
        L4c:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L60
            java.lang.Object r5 = r7.next()
            java.io.File r5 = (java.io.File) r5
            okhttp3.MultipartBody$Part r5 = ru.mts.biometry.api.utils.d.a(r5)
            r4.add(r5)
            goto L4c
        L60:
            r0.f436347s = r3
            java.lang.Object r8 = r8.b(r2, r4, r0)
            if (r8 != r1) goto L69
            return r1
        L69:
            retrofit2.y r8 = (retrofit2.y) r8
            okhttp3.Response r7 = r8.f430118a
            boolean r7 = r7.isSuccessful()
            if (r7 == 0) goto L76
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L76:
            ru.mts.biometry.api.ApiException r7 = new ru.mts.biometry.api.ApiException
            okhttp3.Response r8 = r8.f430118a
            int r1 = r8.code()
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.mts.biometry.api.dataSource.o.b(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ru.mts.biometry.api.dataSource.n
            if (r0 == 0) goto L13
            r0 = r6
            ru.mts.biometry.api.dataSource.n r0 = (ru.mts.biometry.api.dataSource.n) r0
            int r1 = r0.f436351t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f436351t = r1
            goto L18
        L13:
            ru.mts.biometry.api.dataSource.n r0 = new ru.mts.biometry.api.dataSource.n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f436349r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f436351t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            ru.mts.biometry.api.dataSource.o r0 = r0.f436348q
            kotlin.C42729a0.b(r6)
            goto L48
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.C42729a0.b(r6)
            y91.b r6 = r5.f436354c
            if (r6 != 0) goto L3c
            r6 = r3
        L3c:
            r0.f436348q = r5
            r0.f436351t = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r0 = r5
        L48:
            retrofit2.y r6 = (retrofit2.y) r6
            T r1 = r6.f430119b
            ru.mts.biometry.api.entity.state.RecognitionStateResponse r1 = (ru.mts.biometry.api.entity.state.RecognitionStateResponse) r1
            if (r1 == 0) goto L56
            java.lang.String r1 = r1.getPageId()
            if (r1 != 0) goto L58
        L56:
            java.lang.String r1 = ""
        L58:
            r0.f436355d = r1
            T r6 = r6.f430119b
            ru.mts.biometry.api.entity.state.RecognitionStateResponse r6 = (ru.mts.biometry.api.entity.state.RecognitionStateResponse) r6
            if (r6 == 0) goto L64
            ru.mts.biometry.api.entity.state.ApiIdentificationState r3 = r6.b()
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.mts.biometry.api.dataSource.o.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
