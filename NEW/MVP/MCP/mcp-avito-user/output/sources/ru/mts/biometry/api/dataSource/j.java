package ru.mts.biometry.api.dataSource;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import retrofit2.z;
import ru.mts.biometry.api.entity.SelectDocumentBody;
import y91.InterfaceC50088a;

/* compiled from: IdentificationDataSourceImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/mts/biometry/api/dataSource/j;", "Lru/mts/biometry/api/dataSource/a;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class j implements a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC50088a f436344a;

    public j(@Y61.k z zVar) {
        this.f436344a = (InterfaceC50088a) zVar.b(InterfaceC50088a.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.mts.biometry.api.dataSource.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.util.List r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws ru.mts.biometry.api.ApiException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ru.mts.biometry.api.dataSource.f
            if (r0 == 0) goto L13
            r0 = r8
            ru.mts.biometry.api.dataSource.f r0 = (ru.mts.biometry.api.dataSource.f) r0
            int r1 = r0.f436334s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f436334s = r1
            goto L18
        L13:
            ru.mts.biometry.api.dataSource.f r0 = new ru.mts.biometry.api.dataSource.f
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f436332q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f436334s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r8)
            goto L66
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.C42729a0.b(r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C42745f0.q(r7, r2)
            r8.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L45:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r7.next()
            java.io.File r2 = (java.io.File) r2
            okhttp3.MultipartBody$Part r2 = ru.mts.biometry.api.utils.d.a(r2)
            r8.add(r2)
            goto L45
        L59:
            r0.f436334s = r3
            y91.a r7 = r6.f436344a
            java.lang.String r2 = "Document"
            java.lang.Object r8 = r7.b(r2, r8, r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            retrofit2.y r8 = (retrofit2.y) r8
            okhttp3.Response r7 = r8.f430118a
            boolean r7 = r7.isSuccessful()
            if (r7 == 0) goto L73
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L73:
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
        throw new UnsupportedOperationException("Method not decompiled: ru.mts.biometry.api.dataSource.j.a(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ru.mts.biometry.api.dataSource.b
            if (r0 == 0) goto L13
            r0 = r6
            ru.mts.biometry.api.dataSource.b r0 = (ru.mts.biometry.api.dataSource.b) r0
            int r1 = r0.f436319s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f436319s = r1
            goto L18
        L13:
            ru.mts.biometry.api.dataSource.b r0 = new ru.mts.biometry.api.dataSource.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f436317q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f436319s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            ru.mts.biometry.api.entity.locationSuggestion.SuggestionBody r6 = new ru.mts.biometry.api.entity.locationSuggestion.SuggestionBody
            r6.<init>(r5)
            r0.f436319s = r3
            y91.a r5 = r4.f436344a
            java.lang.Object r6 = r5.f(r6, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            ru.mts.biometry.api.entity.locationSuggestion.LocationSuggestionsResponse r6 = (ru.mts.biometry.api.entity.locationSuggestion.LocationSuggestionsResponse) r6
            java.util.List r5 = r6.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.mts.biometry.api.dataSource.j.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.io.File r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws ru.mts.biometry.api.ApiException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ru.mts.biometry.api.dataSource.c
            if (r0 == 0) goto L13
            r0 = r8
            ru.mts.biometry.api.dataSource.c r0 = (ru.mts.biometry.api.dataSource.c) r0
            int r1 = r0.f436322s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f436322s = r1
            goto L18
        L13:
            ru.mts.biometry.api.dataSource.c r0 = new ru.mts.biometry.api.dataSource.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f436320q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f436322s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.C42729a0.b(r8)
            okhttp3.MultipartBody$Part r7 = ru.mts.biometry.api.utils.d.a(r7)
            r0.f436322s = r3
            y91.a r8 = r6.f436344a
            java.lang.String r2 = "Selfie"
            java.lang.Object r8 = r8.g(r2, r7, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            retrofit2.y r8 = (retrofit2.y) r8
            okhttp3.Response r7 = r8.f430118a
            boolean r7 = r7.isSuccessful()
            if (r7 == 0) goto L52
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L52:
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
        throw new UnsupportedOperationException("Method not decompiled: ru.mts.biometry.api.dataSource.j.c(java.io.File, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws ru.mts.biometry.api.ApiException {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ru.mts.biometry.api.dataSource.d
            if (r0 == 0) goto L13
            r0 = r9
            ru.mts.biometry.api.dataSource.d r0 = (ru.mts.biometry.api.dataSource.d) r0
            int r1 = r0.f436326t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f436326t = r1
            goto L18
        L13:
            ru.mts.biometry.api.dataSource.d r0 = new ru.mts.biometry.api.dataSource.d
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f436324r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f436326t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f436323q
            ru.mts.biometry.api.entity.config.IdentificationsConfigResponse r0 = (ru.mts.biometry.api.entity.config.IdentificationsConfigResponse) r0
            kotlin.C42729a0.b(r9)
            goto L83
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            java.lang.Object r2 = r0.f436323q
            ru.mts.biometry.api.dataSource.j r2 = (ru.mts.biometry.api.dataSource.j) r2
            kotlin.C42729a0.b(r9)
            goto L51
        L40:
            kotlin.C42729a0.b(r9)
            r0.f436323q = r8
            r0.f436326t = r4
            y91.a r9 = r8.f436344a
            java.lang.Object r9 = r9.h(r0)
            if (r9 != r1) goto L50
            return r1
        L50:
            r2 = r8
        L51:
            ru.mts.biometry.api.entity.config.IdentificationsConfigResponse r9 = (ru.mts.biometry.api.entity.config.IdentificationsConfigResponse) r9
            ru.mts.biometry.api.entity.config.ApiIdentificationOptions r5 = r9.getIdentificationOptions()
            if (r5 == 0) goto L66
            java.lang.Boolean r5 = r5.getIsWorkflowActive()
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            boolean r4 = kotlin.jvm.internal.L.f(r5, r4)
            goto L67
        L66:
            r4 = 0
        L67:
            if (r4 == 0) goto L6c
            java.lang.String r4 = "workflow"
            goto L6e
        L6c:
            java.lang.String r4 = "bio"
        L6e:
            y91.a r2 = r2.f436344a
            ru.mts.biometry.api.entity.ChoiceRequestBody r5 = new ru.mts.biometry.api.entity.ChoiceRequestBody
            r5.<init>(r4)
            r0.f436323q = r9
            r0.f436326t = r3
            java.lang.Object r0 = r2.m(r5, r0)
            if (r0 != r1) goto L80
            return r1
        L80:
            r7 = r0
            r0 = r9
            r9 = r7
        L83:
            retrofit2.y r9 = (retrofit2.y) r9
            okhttp3.Response r1 = r9.f430118a
            boolean r1 = r1.isSuccessful()
            if (r1 == 0) goto L92
            ru.mts.biometry.api.entity.config.ApiIdentificationsConfig r9 = r0.getBio()
            return r9
        L92:
            ru.mts.biometry.api.ApiException r6 = new ru.mts.biometry.api.ApiException
            okhttp3.Response r0 = r9.f430118a
            int r1 = r0.code()
            T r9 = r9.f430119b
            java.lang.String r2 = java.lang.String.valueOf(r9)
            r5 = 0
            r3 = 0
            r4 = 4
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.mts.biometry.api.dataSource.j.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@Y61.l ru.mts.biometry.api.entity.state.ApiDocumentData r14, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.mts.biometry.api.dataSource.j.e(ru.mts.biometry.api.entity.state.ApiDocumentData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.l
    public final Object f(@Y61.k String str, @Y61.k String str2, @Y61.k SuspendLambda suspendLambda) {
        Object objA = this.f436344a.a(new SelectDocumentBody(str, str2), suspendLambda);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ru.mts.biometry.api.dataSource.g
            if (r0 == 0) goto L13
            r0 = r5
            ru.mts.biometry.api.dataSource.g r0 = (ru.mts.biometry.api.dataSource.g) r0
            int r1 = r0.f436337s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f436337s = r1
            goto L18
        L13:
            ru.mts.biometry.api.dataSource.g r0 = new ru.mts.biometry.api.dataSource.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f436335q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f436337s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.C42729a0.b(r5)
            r0.f436337s = r3
            y91.a r5 = r4.f436344a
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            retrofit2.y r5 = (retrofit2.y) r5
            T r5 = r5.f430119b
            ru.mts.biometry.api.entity.state.IdentificationsStateResponse r5 = (ru.mts.biometry.api.entity.state.IdentificationsStateResponse) r5
            if (r5 == 0) goto L4c
            ru.mts.biometry.api.entity.state.ApiIdentificationState r5 = r5.a()
            goto L4d
        L4c:
            r5 = 0
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.mts.biometry.api.dataSource.j.g(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(@Y61.l java.lang.String r19, @Y61.l java.lang.String r20, @Y61.l java.lang.String r21, @Y61.l java.lang.Integer r22, @Y61.l java.lang.String r23, @Y61.l java.lang.String r24, @Y61.l java.lang.String r25, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r26) throws ru.mts.biometry.api.ApiException {
        /*
            r18 = this;
            r0 = r18
            r1 = r26
            boolean r2 = r1 instanceof ru.mts.biometry.api.dataSource.h
            if (r2 == 0) goto L17
            r2 = r1
            ru.mts.biometry.api.dataSource.h r2 = (ru.mts.biometry.api.dataSource.h) r2
            int r3 = r2.f436340s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f436340s = r3
            goto L1c
        L17:
            ru.mts.biometry.api.dataSource.h r2 = new ru.mts.biometry.api.dataSource.h
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f436338q
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.f436340s
            r5 = 1
            if (r4 == 0) goto L35
            if (r4 != r5) goto L2d
            kotlin.C42729a0.b(r1)
            goto L5f
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            kotlin.C42729a0.b(r1)
            java.lang.String r10 = java.lang.String.valueOf(r22)
            ru.mts.biometry.api.entity.AddressBody r1 = new ru.mts.biometry.api.entity.AddressBody
            r14 = 0
            r15 = 0
            r16 = 384(0x180, float:5.38E-43)
            r17 = 0
            r6 = r1
            r7 = r19
            r8 = r20
            r9 = r21
            r11 = r23
            r12 = r24
            r13 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2.f436340s = r5
            y91.a r4 = r0.f436344a
            java.lang.Object r1 = r4.i(r1, r2)
            if (r1 != r3) goto L5f
            return r3
        L5f:
            retrofit2.y r1 = (retrofit2.y) r1
            okhttp3.Response r2 = r1.f430118a
            boolean r2 = r2.isSuccessful()
            if (r2 == 0) goto L6c
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        L6c:
            ru.mts.biometry.api.ApiException r2 = new ru.mts.biometry.api.ApiException
            okhttp3.Response r1 = r1.f430118a
            int r1 = r1.code()
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r19 = r2
            r20 = r1
            r21 = r3
            r22 = r4
            r23 = r5
            r24 = r6
            r19.<init>(r20, r21, r22, r23, r24)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.mts.biometry.api.dataSource.j.h(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(@Y61.k java.io.File r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws ru.mts.biometry.api.ApiException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ru.mts.biometry.api.dataSource.i
            if (r0 == 0) goto L13
            r0 = r8
            ru.mts.biometry.api.dataSource.i r0 = (ru.mts.biometry.api.dataSource.i) r0
            int r1 = r0.f436343s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f436343s = r1
            goto L18
        L13:
            ru.mts.biometry.api.dataSource.i r0 = new ru.mts.biometry.api.dataSource.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f436341q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f436343s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.C42729a0.b(r8)
            okhttp3.MultipartBody$Part r7 = ru.mts.biometry.api.utils.d.a(r7)
            r0.f436343s = r3
            y91.a r8 = r6.f436344a
            java.lang.String r2 = "Address"
            java.lang.Object r8 = r8.g(r2, r7, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            retrofit2.y r8 = (retrofit2.y) r8
            okhttp3.Response r7 = r8.f430118a
            boolean r7 = r7.isSuccessful()
            if (r7 == 0) goto L52
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L52:
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
        throw new UnsupportedOperationException("Method not decompiled: ru.mts.biometry.api.dataSource.j.i(java.io.File, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
