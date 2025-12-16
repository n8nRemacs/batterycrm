package com.avito.android.mortgage.verification_flow;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import s10.InterfaceC47958b;

/* compiled from: VerificationFlowScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.verification_flow.VerificationFlowScreenKt$VerificationFlowScreen$1", f = "VerificationFlowScreen.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class n extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f203932q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC47958b> f203933r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f203934s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f203935t;

    /* compiled from: VerificationFlowScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls10/b;", "event", "Lkotlin/G0;", "<anonymous>", "(Ls10/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.verification_flow.VerificationFlowScreenKt$VerificationFlowScreen$1$1", f = "VerificationFlowScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC47958b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f203936q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f203937r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f203938s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar, Y41.l<? super DeepLink, G0> lVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f203937r = aVar;
            this.f203938s = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f203937r, this.f203938s, continuation);
            aVar.f203936q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC47958b interfaceC47958b, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC47958b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC47958b interfaceC47958b = (InterfaceC47958b) this.f203936q;
            if (interfaceC47958b instanceof InterfaceC47958b.a) {
                this.f203937r.invoke();
            } else if (interfaceC47958b instanceof InterfaceC47958b.C12606b) {
                this.f203938s.invoke(((InterfaceC47958b.C12606b) interfaceC47958b).f437290a);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Y41.a aVar, Y41.l lVar, Continuation continuation, InterfaceC43160i interfaceC43160i) {
        super(2, continuation);
        this.f203933r = interfaceC43160i;
        this.f203934s = aVar;
        this.f203935t = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new n(this.f203934s, this.f203935t, continuation, this.f203933r);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((n) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f203932q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C43197r1 c43197r1 = new C43197r1(new a(this.f203934s, this.f203935t, null), this.f203933r);
            this.f203932q = 1;
            if (C43175k.i(c43197r1, this) == coroutine_suspended) {
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
