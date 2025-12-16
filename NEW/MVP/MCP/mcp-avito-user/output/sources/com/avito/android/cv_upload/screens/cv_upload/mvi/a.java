package com.avito.android.cv_upload.screens.cv_upload.mvi;

import Ot.InterfaceC14733a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.cv_upload.domain.model.CvParsing;
import com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;

/* compiled from: CvUploadActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cv_upload/screens/cv_upload/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LOt/a;", "Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction;", "LOt/c;", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC14733a, CvUploadInternalAction, Ot.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f131727a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cv_upload.domain.c f131728b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cv_upload.domain.e f131729c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f131730d;

    /* renamed from: e, reason: collision with root package name */
    public int f131731e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C43238h f131732f;

    /* compiled from: CvUploadActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cv_upload.screens.cv_upload.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3942a {
        static {
            int[] iArr = new int[CvParsing.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CvParsing cvParsing = CvParsing.f131671b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CvParsing cvParsing2 = CvParsing.f131671b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.cv_upload.domain.c cVar, @Y61.k com.avito.android.cv_upload.domain.e eVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f131727a = aVar;
        this.f131728b = cVar;
        this.f131729c = eVar;
        this.f131730d = interfaceC28373a;
        kotlinx.coroutines.scheduling.c cVar2 = C43262l0.f411945a;
        this.f131732f = U.a(K.f411877a);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CvUploadInternalAction> b(InterfaceC14733a interfaceC14733a, Ot.c cVar) {
        InterfaceC14733a interfaceC14733a2 = interfaceC14733a;
        if (interfaceC14733a2 instanceof InterfaceC14733a.b) {
            return C43175k.h(new e(this, ((InterfaceC14733a.b) interfaceC14733a2).f12650a, null));
        }
        if (interfaceC14733a2 instanceof InterfaceC14733a.C0817a) {
            return C43175k.G(new d(this, interfaceC14733a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(It.b r8, It.d r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.avito.android.cv_upload.screens.cv_upload.mvi.b
            if (r0 == 0) goto L13
            r0 = r10
            com.avito.android.cv_upload.screens.cv_upload.mvi.b r0 = (com.avito.android.cv_upload.screens.cv_upload.mvi.b) r0
            int r1 = r0.f131737u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131737u = r1
            goto L18
        L13:
            com.avito.android.cv_upload.screens.cv_upload.mvi.b r0 = new com.avito.android.cv_upload.screens.cv_upload.mvi.b
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f131735s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f131737u
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            kotlin.C42729a0.b(r10)
            goto La8
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            It.d r9 = r0.f131734r
            com.avito.android.cv_upload.screens.cv_upload.mvi.a r8 = r0.f131733q
            kotlin.C42729a0.b(r10)
            goto L9b
        L3e:
            kotlin.C42729a0.b(r10)
            com.avito.android.cv_upload.domain.model.CvParsing r10 = r8.f8587a
            int r10 = r10.ordinal()
            if (r10 == 0) goto L83
            java.lang.String r9 = "Required value was null."
            if (r10 == r5) goto L6f
            if (r10 != r4) goto L69
            com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadInternalAction$Content r10 = new com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadInternalAction$Content
            It.c r8 = r8.f8589c
            if (r8 == 0) goto L63
            r10.<init>(r8)
            Ft.a r8 = new Ft.a
            r8.<init>()
            com.avito.android.analytics.a r9 = r7.f131730d
            r9.c(r8)
            goto Lab
        L63:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r9)
            throw r8
        L69:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L6f:
            com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadInternalAction$ReceivedDeeplink r10 = new com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadInternalAction$ReceivedDeeplink
            It.a r8 = r8.f8588b
            if (r8 == 0) goto L77
            com.avito.android.deep_linking.links.DeepLink r3 = r8.f8586a
        L77:
            if (r3 == 0) goto L7d
            r10.<init>(r3)
            goto Lab
        L7d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r9)
            throw r8
        L83:
            int r8 = r7.f131731e
            r10 = 3
            if (r8 >= r10) goto La9
            int r8 = r8 + r5
            r7.f131731e = r8
            r0.f131733q = r7
            r0.f131734r = r9
            r0.f131737u = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = kotlinx.coroutines.C43131e0.b(r5, r0)
            if (r8 != r1) goto L9a
            return r1
        L9a:
            r8 = r7
        L9b:
            r0.f131733q = r3
            r0.f131734r = r3
            r0.f131737u = r4
            java.lang.Object r10 = r8.d(r9, r0)
            if (r10 != r1) goto La8
            return r1
        La8:
            return r10
        La9:
            com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadInternalAction$ParsedWithPending r10 = com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadInternalAction.ParsedWithPending.f131768b
        Lab:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cv_upload.screens.cv_upload.mvi.a.c(It.b, It.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(It.d r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.avito.android.cv_upload.screens.cv_upload.mvi.c
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.cv_upload.screens.cv_upload.mvi.c r0 = (com.avito.android.cv_upload.screens.cv_upload.mvi.c) r0
            int r1 = r0.f131742u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131742u = r1
            goto L18
        L13:
            com.avito.android.cv_upload.screens.cv_upload.mvi.c r0 = new com.avito.android.cv_upload.screens.cv_upload.mvi.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f131740s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f131742u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            It.d r6 = r0.f131739r
            com.avito.android.cv_upload.screens.cv_upload.mvi.a r0 = r0.f131738q
            kotlin.C42729a0.b(r7)
            goto L73
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            It.d r6 = r0.f131739r
            com.avito.android.cv_upload.screens.cv_upload.mvi.a r2 = r0.f131738q
            kotlin.C42729a0.b(r7)
            goto L57
        L40:
            kotlin.C42729a0.b(r7)
            java.lang.String r7 = r6.f8592a
            if (r7 == 0) goto La3
            r0.f131738q = r5
            r0.f131739r = r6
            r0.f131742u = r4
            com.avito.android.cv_upload.domain.c r2 = r5.f131728b
            java.lang.Object r7 = r2.a(r7, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            r2 = r5
        L57:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r4 == 0) goto L77
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r7 = r7.getResult()
            It.b r7 = (It.b) r7
            r0.f131738q = r2
            r0.f131739r = r6
            r0.f131742u = r3
            java.lang.Object r7 = r2.c(r7, r6, r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            r0 = r2
        L73:
            com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadInternalAction r7 = (com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadInternalAction) r7
            r2 = r0
            goto L99
        L77:
            boolean r0 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L9d
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r0 = r7.getError()
            java.lang.Throwable r7 = r7.getCause()
            com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r0, r7)
            com.avito.android.analytics.a r0 = r2.f131730d
            Ft.a r1 = new Ft.a
            r1.<init>()
            r0.c(r1)
            com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadInternalAction$ServerError r0 = new com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadInternalAction$ServerError
            r0.<init>(r7)
            r7 = r0
        L99:
            if (r7 != 0) goto L9c
            goto La4
        L9c:
            return r7
        L9d:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        La3:
            r2 = r5
        La4:
            com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadInternalAction$Content r7 = new com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadInternalAction$Content
            It.c r6 = r6.f8593b
            if (r6 == 0) goto Lb8
            r7.<init>(r6)
            com.avito.android.analytics.a r6 = r2.f131730d
            Ft.b r0 = new Ft.b
            r0.<init>()
            r6.c(r0)
            return r7
        Lb8:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Required value was null."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cv_upload.screens.cv_upload.mvi.a.d(It.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
