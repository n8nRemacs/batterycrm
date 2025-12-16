package com.avito.android.verification.verification_finish;

import android.os.Parcelable;
import com.avito.android.remote.A1;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.util.R0;
import com.avito.android.verification.verification_finish.mvi.entity.FinishInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;

/* compiled from: VerificationFinishInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_finish/i;", "", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A1 f325247a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f325248b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final VerificationFinishArgs f325249c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.a f325250d;

    /* compiled from: VerificationFinishInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/verification_finish/i$a;", "", "<init>", "()V", "", "DEEPLINK_DELAY_MS", "J", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationFinishInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_finish.VerificationFinishInteractor$getVerificationFinishResult$1", f = "VerificationFinishInteractor.kt", i = {0, 1, 2, 2, 3, 3}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.HMS_IS_SPOOF, 31, 34, 35, 38}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "it", "$this$flow", ContextActionHandler.Link.DEEPLINK}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FinishInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Parcelable f325251q;

        /* renamed from: r, reason: collision with root package name */
        public int f325252r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f325253s;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = i.this.new b(continuation);
            bVar.f325253s = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super FinishInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00bc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
        /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.verification_finish.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: VerificationFinishInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.verification.verification_finish.VerificationFinishInteractor$getVerificationFinishResult$2", f = "VerificationFinishInteractor.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super FinishInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f325255q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f325256r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f325257s;

        public c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super FinishInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(3, continuation);
            cVar.f325256r = interfaceC43172j;
            cVar.f325257s = th2;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f325255q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f325256r;
                FinishInternalAction.Error error = new FinishInternalAction.Error(this.f325257s);
                this.f325256r = null;
                this.f325255q = 1;
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

    static {
        new a(null);
    }

    @Inject
    public i(@Y61.k A1 a12, @Y61.k R0 r02, @Y61.k VerificationFinishArgs verificationFinishArgs, @Y61.k com.avito.android.clientEventBus.a aVar) {
        this.f325247a = a12;
        this.f325248b = r02;
        this.f325249c = verificationFinishArgs;
        this.f325250d = aVar;
    }

    @Y61.k
    public final InterfaceC43160i<FinishInternalAction> a() {
        return C43175k.I(this.f325248b.a(), new C43152f0(C43175k.G(new b(null)), new c(3, null)));
    }

    @Y61.k
    public final kotlinx.coroutines.flow.internal.l b() {
        return C43175k.Y(new C43152f0(y.a(this.f325250d.c(com.avito.android.verification.verification_finish.c.class)), new k(3, null)), new j(this, null));
    }
}
