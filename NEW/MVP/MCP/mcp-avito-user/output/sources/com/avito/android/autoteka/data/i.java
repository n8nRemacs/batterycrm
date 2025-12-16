package com.avito.android.autoteka.data;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import xj0.InterfaceC49957a;
import yj0.InterfaceC50257a;

/* compiled from: AutotekaRepository.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/data/i;", "", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49957a f96123a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50257a f96124b;

    @Inject
    public i(@Y61.k InterfaceC49957a interfaceC49957a, @Y61.k InterfaceC50257a interfaceC50257a) {
        this.f96123a = interfaceC49957a;
        this.f96124b = interfaceC50257a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.autoteka.data.e
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.autoteka.data.e r0 = (com.avito.android.autoteka.data.e) r0
            int r1 = r0.f96113s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96113s = r1
            goto L18
        L13:
            com.avito.android.autoteka.data.e r0 = new com.avito.android.autoteka.data.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f96111q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f96113s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            r0.f96113s = r3
            xj0.a r6 = r4.f96123a
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            retrofit2.y r6 = (retrofit2.y) r6
            T r5 = r6.f430119b
            okhttp3.ResponseBody r5 = (okhttp3.ResponseBody) r5
            if (r5 == 0) goto L4c
            java.io.InputStream r5 = r5.byteStream()
            goto L4d
        L4c:
            r5 = 0
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.data.i.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r8, @Y61.l java.lang.String r9, @Y61.l java.lang.Long r10, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.avito.android.autoteka.data.f
            if (r0 == 0) goto L13
            r0 = r11
            com.avito.android.autoteka.data.f r0 = (com.avito.android.autoteka.data.f) r0
            int r1 = r0.f96116s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96116s = r1
            goto L18
        L13:
            com.avito.android.autoteka.data.f r0 = new com.avito.android.autoteka.data.f
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f96114q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f96116s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r11)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.C42729a0.b(r11)
            r0.f96116s = r3
            yj0.a r11 = r7.f96124b
            java.lang.Object r11 = r11.f(r10, r9, r8, r0)
            if (r11 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
            boolean r8 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r8 == 0) goto Lb2
            com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
            java.lang.Object r8 = r11.getResult()
            Ej0.a r8 = (Ej0.C13494a) r8
            vf.c r9 = new vf.c
            r9.<init>()
            java.lang.String r2 = r8.getIframeUrl()
            Ej0.c r9 = r8.getSharingLink()
            r10 = 0
            java.lang.String r11 = "androidSharing"
            java.lang.String r0 = "fromSource"
            if (r9 == 0) goto L7f
            Bf.a$a r1 = new Bf.a$a
            java.lang.String r3 = r9.getTitle()
            java.lang.String r9 = r9.getUrl()
            android.net.Uri r9 = android.net.Uri.parse(r9)
            android.net.Uri$Builder r9 = r9.buildUpon()
            r9.appendQueryParameter(r0, r11)
            android.net.Uri r9 = r9.build()
            r1.<init>(r3, r9)
            r3 = r1
            goto L80
        L7f:
            r3 = r10
        L80:
            Ej0.b r8 = r8.getPdfDownload()
            if (r8 == 0) goto La2
            java.lang.String r9 = r8.getUrl()
            android.net.Uri r9 = android.net.Uri.parse(r9)
            android.net.Uri$Builder r9 = r9.buildUpon()
            r9.appendQueryParameter(r0, r11)
            android.net.Uri r9 = r9.build()
            java.lang.String r8 = r8.getFileName()
            Bf.a$b r10 = new Bf.a$b
            r10.<init>(r8, r9)
        La2:
            r4 = r10
            Bf.a r8 = new Bf.a
            r6 = 0
            r1 = 0
            r5 = 1
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.avito.android.remote.model.TypedResult$Success r11 = new com.avito.android.remote.model.TypedResult$Success
            r11.<init>(r8)
            goto Lb6
        Lb2:
            boolean r8 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r8 == 0) goto Lb7
        Lb6:
            return r11
        Lb7:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.data.i.b(java.lang.String, java.lang.String, java.lang.Long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.l java.lang.Integer r12, @Y61.l com.avito.android.util.UtmParams r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.avito.android.autoteka.data.g
            if (r0 == 0) goto L13
            r0 = r14
            com.avito.android.autoteka.data.g r0 = (com.avito.android.autoteka.data.g) r0
            int r1 = r0.f96119s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96119s = r1
            goto L18
        L13:
            com.avito.android.autoteka.data.g r0 = new com.avito.android.autoteka.data.g
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f96117q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f96119s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r14)
            goto L48
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            kotlin.C42729a0.b(r14)
            if (r13 == 0) goto L39
            java.util.LinkedHashMap r13 = r13.f318752b
            goto L3d
        L39:
            java.util.Map r13 = kotlin.collections.P0.c()
        L3d:
            r0.f96119s = r3
            xj0.a r14 = r11.f96123a
            java.lang.Object r14 = r14.a(r12, r13, r0)
            if (r14 != r1) goto L48
            return r1
        L48:
            com.avito.android.remote.model.TypedResult r14 = (com.avito.android.remote.model.TypedResult) r14
            boolean r12 = r14 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r12 == 0) goto La8
            com.avito.android.remote.model.TypedResult$Success r14 = (com.avito.android.remote.model.TypedResult.Success) r14
            java.lang.Object r12 = r14.getResult()
            com.avito.android.remote.autoteka.model.AutotekaLandingResponse r12 = (com.avito.android.remote.autoteka.model.AutotekaLandingResponse) r12
            vf.a r13 = new vf.a
            r13.<init>()
            com.avito.android.autoteka.domain.model.landing.LandingBeduinItem r13 = new com.avito.android.autoteka.domain.model.landing.LandingBeduinItem
            java.lang.String r1 = r12.getId()
            java.lang.String r2 = r12.getTopFormId()
            java.lang.String r3 = r12.getMainFormId()
            java.lang.String r4 = r12.getBottomFormId()
            java.util.List r5 = r12.getTopComponents()
            java.util.List r6 = r12.getMainComponents()
            java.util.List r7 = r12.getBottomComponents()
            java.util.List r8 = r12.getOnOpenActions()
            com.avito.android.remote.autoteka.model.AutotekaLandingNavBarParams r14 = r12.getNavigationBar()
            r0 = 0
            if (r14 == 0) goto L90
            com.avito.android.remote.autoteka.model.LandingTitle r14 = r14.getScreenTitle()
            if (r14 == 0) goto L90
            java.lang.String r14 = r14.getText()
            r9 = r14
            goto L91
        L90:
            r9 = r0
        L91:
            com.avito.android.remote.autoteka.model.AutotekaLandingNavBarParams r12 = r12.getNavigationBar()
            if (r12 == 0) goto L9d
            com.avito.android.remote.model.UniversalColor r12 = r12.getBackgroundColor()
            r10 = r12
            goto L9e
        L9d:
            r10 = r0
        L9e:
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.avito.android.remote.model.TypedResult$Success r14 = new com.avito.android.remote.model.TypedResult$Success
            r14.<init>(r13)
            goto Lac
        La8:
            boolean r12 = r14 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r12 == 0) goto Lad
        Lac:
            return r14
        Lad:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.data.i.c(java.lang.Integer, com.avito.android.util.UtmParams, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k java.lang.String r5, @Y61.k java.lang.String r6, @Y61.k java.lang.String r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.avito.android.autoteka.data.h
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.autoteka.data.h r0 = (com.avito.android.autoteka.data.h) r0
            int r1 = r0.f96122s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96122s = r1
            goto L18
        L13:
            com.avito.android.autoteka.data.h r0 = new com.avito.android.autoteka.data.h
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f96120q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f96122s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r8)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r8)
            r0.f96122s = r3
            yj0.a r8 = r4.f96124b
            java.lang.Object r8 = r8.b(r6, r5, r7, r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
            boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L61
            com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
            java.lang.Object r5 = r8.getResult()
            Gj0.a r5 = (Gj0.C13890a) r5
            vf.d r6 = new vf.d
            r6.<init>()
            zf.a r6 = new zf.a
            java.lang.String r5 = r5.getUsagePublicId()
            r6.<init>(r5)
            com.avito.android.remote.model.TypedResult$Success r8 = new com.avito.android.remote.model.TypedResult$Success
            r8.<init>(r6)
            goto L65
        L61:
            boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L66
        L65:
            return r8
        L66:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.data.i.d(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
