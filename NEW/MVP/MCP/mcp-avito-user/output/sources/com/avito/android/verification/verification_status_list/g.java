package com.avito.android.verification.verification_status_list;

import Y41.p;
import Y41.q;
import com.avito.android.remote.A1;
import com.avito.android.util.R0;
import com.avito.android.verification.verification_status_list.mvi.entity.StatusListInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: VerificationStatusListInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_status_list/g;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A1 f325762a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f325763b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final VerificationStatusListArgs f325764c;

    /* compiled from: VerificationStatusListInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_status_list.VerificationStatusListInteractor$getVerificationStatusList$1", f = "VerificationStatusListInteractor.kt", i = {0, 1}, l = {20, 22, 23, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f325765q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f325766r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f325767s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ g f325768t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, g gVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f325767s = z12;
            this.f325768t = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f325767s, this.f325768t, continuation);
            aVar.f325766r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f325765q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.C42729a0.b(r7)
                goto La2
            L22:
                java.lang.Object r1 = r6.f325766r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L61
            L2a:
                java.lang.Object r1 = r6.f325766r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L4e
            L32:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f325766r
                r1 = r7
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                boolean r7 = r6.f325767s
                if (r7 == 0) goto L4e
                com.avito.android.verification.verification_status_list.mvi.entity.StatusListInternalAction$Loading r7 = new com.avito.android.verification.verification_status_list.mvi.entity.StatusListInternalAction$Loading
                r7.<init>()
                r6.f325766r = r1
                r6.f325765q = r5
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L4e
                return r0
            L4e:
                com.avito.android.verification.verification_status_list.g r7 = r6.f325768t
                com.avito.android.remote.A1 r5 = r7.f325762a
                com.avito.android.verification.verification_status_list.VerificationStatusListArgs r7 = r7.f325764c
                java.util.Map<java.lang.String, java.lang.String> r7 = r7.f325744b
                r6.f325766r = r1
                r6.f325765q = r4
                java.lang.Object r7 = r5.m(r7, r6)
                if (r7 != r0) goto L61
                return r0
            L61:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto L80
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                com.avito.android.remote.model.VerificationStatusListResult r7 = (com.avito.android.remote.model.VerificationStatusListResult) r7
                com.avito.android.verification.verification_status_list.mvi.entity.StatusListInternalAction$Loaded r2 = new com.avito.android.verification.verification_status_list.mvi.entity.StatusListInternalAction$Loaded
                r2.<init>(r7)
                r6.f325766r = r5
                r6.f325765q = r3
                java.lang.Object r7 = r1.emit(r2, r6)
                if (r7 != r0) goto La2
                return r0
            L80:
                boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto La5
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r3 = r7.getError()
                java.lang.Throwable r7 = r7.getCause()
                com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r3, r7)
                com.avito.android.verification.verification_status_list.mvi.entity.StatusListInternalAction$Error r3 = new com.avito.android.verification.verification_status_list.mvi.entity.StatusListInternalAction$Error
                r3.<init>(r7)
                r6.f325766r = r5
                r6.f325765q = r2
                java.lang.Object r7 = r1.emit(r3, r6)
                if (r7 != r0) goto La2
                return r0
            La2:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            La5:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.verification_status_list.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: VerificationStatusListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_status_list.VerificationStatusListInteractor$getVerificationStatusList$2", f = "VerificationStatusListInteractor.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<?>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f325769q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f325770r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f325771s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f325770r = interfaceC43172j;
            bVar.f325771s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f325769q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f325770r;
                StatusListInternalAction.Error error = new StatusListInternalAction.Error(this.f325771s);
                this.f325770r = null;
                this.f325769q = 1;
                if (interfaceC43172j.emit(error, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public g(@Y61.k A1 a12, @Y61.k R0 r02, @Y61.k VerificationStatusListArgs verificationStatusListArgs) {
        this.f325762a = a12;
        this.f325763b = r02;
        this.f325764c = verificationStatusListArgs;
    }

    @Y61.k
    public final InterfaceC43160i<StatusListInternalAction> a(boolean z12) {
        return C43175k.I(this.f325763b.a(), new C43152f0(C43175k.G(new a(z12, this, null)), new b(3, null)));
    }
}
