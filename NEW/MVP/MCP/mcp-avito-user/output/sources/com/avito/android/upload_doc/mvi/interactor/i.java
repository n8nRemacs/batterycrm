package com.avito.android.upload_doc.mvi.interactor;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.H;
import com.avito.android.remote.error.ApiError;
import com.avito.android.upload_doc.mvi.entities.GigUploadDocInternalAction;
import com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem;
import com.avito.android.util.C;
import iH.InterfaceC41285a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GigUploadDocInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/upload_doc/mvi/interactor/i;", "Lcom/avito/android/upload_doc/mvi/interactor/a;", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41285a f306916a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final MG0.a f306917b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final GigUploadDocDeeplink.FlowType f306918c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final x f306919d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_picker.converter.f f306920e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f306921f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C f306922g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f306923h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final E f306924i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final H f306925j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final l f306926k;

    @Inject
    public i(@Y61.k InterfaceC41285a interfaceC41285a, @Y61.k MG0.a aVar, @Y61.k GigUploadDocDeeplink.FlowType flowType, @Y61.k x xVar, @Y61.k com.avito.android.photo_picker.converter.f fVar, @Y61.k com.avito.android.photo_cache.b bVar, @Y61.k C c12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k E e12, @Y61.k H h12) {
        this.f306916a = interfaceC41285a;
        this.f306917b = aVar;
        this.f306918c = flowType;
        this.f306919d = xVar;
        this.f306920e = fVar;
        this.f306921f = bVar;
        this.f306922g = c12;
        this.f306923h = interfaceC28373a;
        this.f306924i = e12;
        this.f306925j = h12;
        this.f306926k = new l(xVar);
    }

    public static Object h(InterfaceC43172j interfaceC43172j, GigUploadDocDocumentItem gigUploadDocDocumentItem, Continuation continuation) {
        Object objEmit = interfaceC43172j.emit(new GigUploadDocInternalAction.DocumentError(new ApiError.UnknownError("GigUploadDocInteractorImpl - failed to upload document.", null, null, 6, null), gigUploadDocDocumentItem), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.avito.android.upload_doc.mvi.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j r32, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r33) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.upload_doc.mvi.interactor.i.a(kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.upload_doc.mvi.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.upload_doc.mvi.interactor.f
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.upload_doc.mvi.interactor.f r0 = (com.avito.android.upload_doc.mvi.interactor.f) r0
            int r1 = r0.f306901s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f306901s = r1
            goto L18
        L13:
            com.avito.android.upload_doc.mvi.interactor.f r0 = new com.avito.android.upload_doc.mvi.interactor.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f306899q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f306901s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            java.lang.String r5 = r5.f307016g
            r0.f306901s = r3
            iH.a r6 = r4.f306916a
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            boolean r5 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L4f
            com.avito.android.util.V2 r5 = com.avito.android.util.V2.f318762a
            r6 = 0
            java.lang.String r0 = "GigUploadDocInteractorImpl - failed to remove photo."
            r5.e(r0, r6)
        L4f:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.upload_doc.mvi.interactor.i.b(com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.avito.android.upload_doc.mvi.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j r18, @Y61.k com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem r19, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.upload_doc.mvi.interactor.i.c(kotlinx.coroutines.flow.j, com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    @Override // com.avito.android.upload_doc.mvi.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j r19, @Y61.k java.util.ArrayList r20, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.upload_doc.mvi.interactor.i.d(kotlinx.coroutines.flow.j, java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.upload_doc.mvi.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@Y61.k com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.upload_doc.mvi.interactor.c
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.upload_doc.mvi.interactor.c r0 = (com.avito.android.upload_doc.mvi.interactor.c) r0
            int r1 = r0.f306890t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f306890t = r1
            goto L18
        L13:
            com.avito.android.upload_doc.mvi.interactor.c r0 = new com.avito.android.upload_doc.mvi.interactor.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f306888r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f306890t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.upload_doc.mvi.interactor.i r5 = r0.f306887q
            kotlin.C42729a0.b(r6)
            goto L4a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r6)
            java.lang.String r5 = r5.f307011b
            com.avito.android.photo_cache.b r6 = r4.f306921f
            io.reactivex.rxjava3.core.z r5 = r6.a(r5)
            r0.f306887q = r4
            r0.f306890t = r3
            java.lang.Object r6 = kotlinx.coroutines.rx3.C43292o.c(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r5 = r4
        L4a:
            com.avito.android.remote.model.CloseableDataSource r6 = (com.avito.android.remote.model.CloseableDataSource) r6
            java.util.ArrayList r6 = com.avito.android.util.Y.a(r6)
            java.lang.Object r6 = kotlin.collections.C42745f0.G(r6)
            com.avito.android.photo_cache.PhotoUpload r6 = (com.avito.android.photo_cache.PhotoUpload) r6
            if (r6 == 0) goto L67
            com.avito.android.photo_cache.b r5 = r5.f306921f
            long r0 = r6.f216300b
            java.lang.String r6 = java.lang.String.valueOf(r0)
            boolean r5 = r5.b(r6)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
        L67:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.upload_doc.mvi.interactor.i.e(com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.upload_doc.mvi.interactor.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@Y61.k com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.upload_doc.mvi.interactor.d
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.upload_doc.mvi.interactor.d r0 = (com.avito.android.upload_doc.mvi.interactor.d) r0
            int r1 = r0.f306893s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f306893s = r1
            goto L18
        L13:
            com.avito.android.upload_doc.mvi.interactor.d r0 = new com.avito.android.upload_doc.mvi.interactor.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f306891q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f306893s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            java.lang.String r5 = r5.f307011b
            com.avito.android.photo_cache.b r6 = r4.f306921f
            io.reactivex.rxjava3.core.z r5 = r6.a(r5)
            r0.f306893s = r3
            java.lang.Object r6 = kotlinx.coroutines.rx3.C43292o.c(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.avito.android.remote.model.CloseableDataSource r6 = (com.avito.android.remote.model.CloseableDataSource) r6
            java.util.ArrayList r5 = com.avito.android.util.Y.a(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.C42745f0.q(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L5a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r5.next()
            com.avito.android.photo_cache.PhotoUpload r0 = (com.avito.android.photo_cache.PhotoUpload) r0
            android.net.Uri r0 = r0.f216305g
            r6.add(r0)
            goto L5a
        L6c:
            int r5 = r6.size()
            if (r5 != r3) goto L79
            java.lang.Object r5 = kotlin.collections.C42745f0.E(r6)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L7a
        L79:
            r5 = 0
        L7a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.upload_doc.mvi.interactor.i.f(com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlinx.coroutines.flow.InterfaceC43172j r9, com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.avito.android.upload_doc.mvi.interactor.b
            if (r0 == 0) goto L13
            r0 = r11
            com.avito.android.upload_doc.mvi.interactor.b r0 = (com.avito.android.upload_doc.mvi.interactor.b) r0
            int r1 = r0.f306886v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f306886v = r1
            goto L18
        L13:
            com.avito.android.upload_doc.mvi.interactor.b r0 = new com.avito.android.upload_doc.mvi.interactor.b
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f306884t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f306886v
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L53
            if (r2 == r5) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            kotlin.C42729a0.b(r11)
            goto Lae
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.Object r9 = r0.f306882r
            com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem r9 = (com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem) r9
            java.lang.Object r10 = r0.f306881q
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            kotlin.C42729a0.b(r11)
            goto L7f
        L45:
            com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem r10 = r0.f306883s
            java.lang.Object r9 = r0.f306882r
            kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
            java.lang.Object r2 = r0.f306881q
            com.avito.android.upload_doc.mvi.interactor.i r2 = (com.avito.android.upload_doc.mvi.interactor.i) r2
            kotlin.C42729a0.b(r11)
            goto L6b
        L53:
            kotlin.C42729a0.b(r11)
            com.avito.android.upload_doc.mvi.entities.GigUploadDocInternalAction$DocumentLoading r11 = new com.avito.android.upload_doc.mvi.entities.GigUploadDocInternalAction$DocumentLoading
            r11.<init>(r10)
            r0.f306881q = r8
            r0.f306882r = r9
            r0.f306883s = r10
            r0.f306886v = r5
            java.lang.Object r11 = r9.emit(r11, r0)
            if (r11 != r1) goto L6a
            return r1
        L6a:
            r2 = r8
        L6b:
            iH.a r11 = r2.f306916a
            r0.f306881q = r9
            r0.f306882r = r10
            r0.f306883s = r6
            r0.f306886v = r4
            java.lang.Object r11 = r11.d(r0)
            if (r11 != r1) goto L7c
            return r1
        L7c:
            r7 = r10
            r10 = r9
            r9 = r7
        L7f:
            com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
            boolean r2 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r2 == 0) goto L92
            com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
            java.lang.Object r9 = r11.getResult()
            kH.a r9 = (kH.C42581a) r9
            java.lang.String r9 = r9.getImageId()
            return r9
        L92:
            boolean r2 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r2 == 0) goto Laf
            com.avito.android.upload_doc.mvi.entities.GigUploadDocInternalAction$DocumentError r2 = new com.avito.android.upload_doc.mvi.entities.GigUploadDocInternalAction$DocumentError
            com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
            com.avito.android.remote.error.ApiError r11 = r11.getError()
            r2.<init>(r11, r9)
            r0.f306881q = r6
            r0.f306882r = r6
            r0.f306886v = r3
            java.lang.Object r9 = r10.emit(r2, r0)
            if (r9 != r1) goto Lae
            return r1
        Lae:
            return r6
        Laf:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.upload_doc.mvi.interactor.i.g(kotlinx.coroutines.flow.j, com.avito.android.upload_doc.view.document.GigUploadDocDocumentItem, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
