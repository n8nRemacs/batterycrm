package com.avito.android.verification.verification_disclaimer;

import Y41.q;
import com.avito.android.util.R0;
import com.avito.android.verification.verification_disclaimer.mvi.entity.DisclaimerInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
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

/* compiled from: VerificationDisclaimerInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/g;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final BM0.a f325054a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f325055b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final VerificationDisclaimerArgs f325056c;

    /* compiled from: VerificationDisclaimerInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_disclaimer.VerificationDisclaimerInteractor$getDisclaimer$1", f = "VerificationDisclaimerInteractor.kt", i = {0, 1, 2}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, 31, 41, 44, 49, 54}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DisclaimerInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public g f325057q;

        /* renamed from: r, reason: collision with root package name */
        public int f325058r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f325059s;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = g.this.new a(continuation);
            aVar.f325059s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DisclaimerInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.verification_disclaimer.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: VerificationDisclaimerInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_disclaimer.VerificationDisclaimerInteractor$getDisclaimer$2", f = "VerificationDisclaimerInteractor.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super DisclaimerInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f325061q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f325062r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f325063s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super DisclaimerInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f325062r = interfaceC43172j;
            bVar.f325063s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f325061q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f325062r;
                DisclaimerInternalAction.Error error = new DisclaimerInternalAction.Error(this.f325063s);
                this.f325062r = null;
                this.f325061q = 1;
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
    public g(@Y61.k BM0.a aVar, @Y61.k R0 r02, @Y61.k VerificationDisclaimerArgs verificationDisclaimerArgs) {
        this.f325054a = aVar;
        this.f325055b = r02;
        this.f325056c = verificationDisclaimerArgs;
    }

    @Y61.k
    public final InterfaceC43160i<DisclaimerInternalAction> a() {
        return C43175k.I(this.f325055b.a(), new C43152f0(C43175k.G(new a(null)), new b(3, null)));
    }
}
