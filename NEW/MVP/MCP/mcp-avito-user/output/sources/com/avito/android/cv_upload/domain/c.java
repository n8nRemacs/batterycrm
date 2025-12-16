package com.avito.android.cv_upload.domain;

import Jt.InterfaceC14244a;
import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CvUploadInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_upload/domain/c;", "", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC14244a> f131660a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.cv_upload.domain.mapper.a f131661b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.cv_upload.domain.mapper.c f131662c;

    @Inject
    public c(@k h31.e<InterfaceC14244a> eVar, @k com.avito.android.cv_upload.domain.mapper.a aVar, @k com.avito.android.cv_upload.domain.mapper.c cVar) {
        this.f131660a = eVar;
        this.f131661b = aVar;
        this.f131662c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.cv_upload.domain.a
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.cv_upload.domain.a r0 = (com.avito.android.cv_upload.domain.a) r0
            int r1 = r0.f131655t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131655t = r1
            goto L18
        L13:
            com.avito.android.cv_upload.domain.a r0 = new com.avito.android.cv_upload.domain.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f131653r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f131655t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.cv_upload.domain.mapper.a r5 = r0.f131652q
            kotlin.C42729a0.b(r6)
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r6)
            h31.e<Jt.a> r6 = r4.f131660a
            java.lang.Object r6 = r6.get()
            Jt.a r6 = (Jt.InterfaceC14244a) r6
            com.avito.android.cv_upload.domain.mapper.a r2 = r4.f131661b
            r0.f131652q = r2
            r0.f131655t = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r5 = r2
        L4c:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            r5.getClass()
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto Lb0
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r5 = r6.getResult()
            com.avito.android.cv_upload.generated.api.v_1__job_cv_import_from_file_status.V1JobCvImportFromFileStatusResponse r5 = (com.avito.android.cv_upload.generated.api.v_1__job_cv_import_from_file_status.V1JobCvImportFromFileStatusResponse) r5
            It.b r6 = new It.b
            com.avito.android.cv_upload.generated.api.v_1__job_cv_import_from_file_status.V1JobCvImportFromFileStatusResponse$Status r0 = r5.getStatus()
            int[] r1 = com.avito.android.cv_upload.domain.mapper.a.C3941a.f131668a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r3) goto L7f
            r1 = 2
            if (r0 == r1) goto L7c
            r1 = 3
            if (r0 != r1) goto L76
            com.avito.android.cv_upload.domain.model.CvParsing r0 = com.avito.android.cv_upload.domain.model.CvParsing.f131673d
            goto L81
        L76:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L7c:
            com.avito.android.cv_upload.domain.model.CvParsing r0 = com.avito.android.cv_upload.domain.model.CvParsing.f131672c
            goto L81
        L7f:
            com.avito.android.cv_upload.domain.model.CvParsing r0 = com.avito.android.cv_upload.domain.model.CvParsing.f131671b
        L81:
            Kt.a r1 = r5.getAction()
            r2 = 0
            if (r1 == 0) goto L92
            It.a r3 = new It.a
            com.avito.android.deep_linking.links.DeepLink r1 = r1.getDeeplink()
            r3.<init>(r1)
            goto L93
        L92:
            r3 = r2
        L93:
            Kt.b r5 = r5.getError()
            if (r5 == 0) goto La6
            It.c r2 = new It.c
            java.lang.String r1 = r5.getTitle()
            java.lang.String r5 = r5.getSubtitle()
            r2.<init>(r1, r5)
        La6:
            r6.<init>(r0, r3, r2)
            com.avito.android.remote.model.TypedResult$Success r5 = new com.avito.android.remote.model.TypedResult$Success
            r5.<init>(r6)
            r6 = r5
            goto Lb4
        Lb0:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto Lb5
        Lb4:
            return r6
        Lb5:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cv_upload.domain.c.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k okhttp3.MultipartBody.Part r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.cv_upload.domain.b
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.cv_upload.domain.b r0 = (com.avito.android.cv_upload.domain.b) r0
            int r1 = r0.f131659t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131659t = r1
            goto L18
        L13:
            com.avito.android.cv_upload.domain.b r0 = new com.avito.android.cv_upload.domain.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f131657r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f131659t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.cv_upload.domain.mapper.c r5 = r0.f131656q
            kotlin.C42729a0.b(r6)
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r6)
            h31.e<Jt.a> r6 = r4.f131660a
            java.lang.Object r6 = r6.get()
            Jt.a r6 = (Jt.InterfaceC14244a) r6
            com.avito.android.cv_upload.domain.mapper.c r2 = r4.f131662c
            r0.f131656q = r2
            r0.f131659t = r3
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r5 = r2
        L4c:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            r5.getClass()
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r5 == 0) goto L8d
            com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
            java.lang.Object r5 = r6.getResult()
            Lt.b r5 = (Lt.b) r5
            It.d r6 = new It.d
            java.lang.String r0 = r5.getFileUid()
            Lt.a r5 = r5.getError()
            r1 = 0
            if (r5 == 0) goto L83
            java.lang.String r2 = r5.getTitle()
            if (r2 == 0) goto L83
            java.lang.String r2 = r5.getSubtitle()
            if (r2 == 0) goto L83
            It.c r1 = new It.c
            java.lang.String r2 = r5.getTitle()
            java.lang.String r5 = r5.getSubtitle()
            r1.<init>(r2, r5)
        L83:
            r6.<init>(r0, r1)
            com.avito.android.remote.model.TypedResult$Success r5 = new com.avito.android.remote.model.TypedResult$Success
            r5.<init>(r6)
            r6 = r5
            goto L91
        L8d:
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L92
        L91:
            return r6
        L92:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cv_upload.domain.c.b(okhttp3.MultipartBody$Part, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
