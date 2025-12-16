package com.avito.android.mortgage.document_upload.interactor;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.document_upload.mvi.entity.DocumentUploadInternalAction;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import f00.C40196c;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: NavigationInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_upload/interactor/k;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<IZ.a> f199361a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f199362b;

    /* compiled from: NavigationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.NavigationInteractor$navigateBack$1", f = "NavigationInteractor.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.HMS_IS_SPOOF, 30, 31}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super DocumentUploadInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f199363q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f199364r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C40196c f199365s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f199366t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k f199367u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C40196c c40196c, boolean z12, k kVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f199365s = c40196c;
            this.f199366t = z12;
            this.f199367u = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f199365s, this.f199366t, this.f199367u, continuation);
            aVar.f199364r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DocumentUploadInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f199363q;
            if (i12 != 0) {
                if (i12 == 1) {
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                if (i12 != 2 && i12 != 3 && i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f199364r;
            C40196c c40196c = this.f199365s;
            if (c40196c.f395545e) {
                DocumentUploadInternalAction.NavigateBack navigateBack = DocumentUploadInternalAction.NavigateBack.f199416b;
                this.f199363q = 1;
                if (interfaceC43172j.emit(navigateBack, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            }
            if (c40196c.f395547g <= 1) {
                DocumentUploadInternalAction.NavigateBack navigateBack2 = DocumentUploadInternalAction.NavigateBack.f199416b;
                this.f199363q = 2;
                if (interfaceC43172j.emit(navigateBack2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (this.f199366t) {
                DocumentUploadInternalAction.NavigateBack navigateBack3 = DocumentUploadInternalAction.NavigateBack.f199416b;
                this.f199363q = 3;
                if (interfaceC43172j.emit(navigateBack3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.f199363q = 4;
                if (k.a(this.f199367u, interfaceC43172j, c40196c, false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: NavigationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.document_upload.interactor.NavigationInteractor$navigateUp$1", f = "NavigationInteractor.kt", i = {}, l = {42, 45}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super DocumentUploadInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f199368q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f199369r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C40196c f199370s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ k f199371t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C40196c c40196c, k kVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f199370s = c40196c;
            this.f199371t = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f199370s, this.f199371t, continuation);
            bVar.f199369r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DocumentUploadInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f199368q;
            if (i12 != 0) {
                if (i12 == 1) {
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f199369r;
            C40196c c40196c = this.f199370s;
            if (c40196c.f395545e) {
                return G0.f406611a;
            }
            if (c40196c.f395547g != c40196c.f395548h) {
                this.f199368q = 2;
                if (k.a(this.f199371t, interfaceC43172j, c40196c, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            }
            DocumentUploadInternalAction.CloseAllDocumentsScreens closeAllDocumentsScreens = DocumentUploadInternalAction.CloseAllDocumentsScreens.f199408b;
            this.f199368q = 1;
            if (interfaceC43172j.emit(closeAllDocumentsScreens, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public k(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f199361a = eVar;
        this.f199362b = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.avito.android.mortgage.document_upload.interactor.k r30, kotlinx.coroutines.flow.InterfaceC43172j r31, f00.C40196c r32, boolean r33, kotlin.coroutines.jvm.internal.ContinuationImpl r34) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.document_upload.interactor.k.a(com.avito.android.mortgage.document_upload.interactor.k, kotlinx.coroutines.flow.j, f00.c, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Y61.k
    public final InterfaceC43160i<DocumentUploadInternalAction> b(@Y61.k C40196c c40196c, boolean z12) {
        return C43175k.I(this.f199362b.a(), C43175k.G(new a(c40196c, z12, this, null)));
    }

    @Y61.k
    public final InterfaceC43160i<DocumentUploadInternalAction> c(@Y61.k C40196c c40196c) {
        return C43175k.I(this.f199362b.a(), C43175k.G(new b(c40196c, this, null)));
    }
}
