package com.avito.android.rating_form.step.mvi;

import com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction;
import ih0.C41404c;
import ih0.InterfaceC41402a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingFormStepActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lih0/a$k;", "Lkotlinx/coroutines/flow/i;", "Lih0/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$process$2", f = "RatingFormStepActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class l extends SuspendLambda implements Y41.p<Q<? extends InterfaceC41402a.k, ? extends InterfaceC43160i<? extends InterfaceC41402a>>, Continuation<? super InterfaceC43160i<? extends RatingFormStepInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f249644q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f249645r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C41404c> f249646s;

    /* compiled from: RatingFormStepActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lih0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "<anonymous>", "(Lih0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$process$2$1", f = "RatingFormStepActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC41402a, Continuation<? super InterfaceC43160i<? extends RatingFormStepInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f249647q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ j f249648r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C41404c> f249649s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, j jVar, Continuation continuation) {
            super(2, continuation);
            this.f249648r = jVar;
            this.f249649s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f249649s, this.f249648r, continuation);
            aVar.f249647q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC41402a interfaceC41402a, Continuation<? super InterfaceC43160i<? extends RatingFormStepInternalAction>> continuation) {
            return ((a) create(interfaceC41402a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f249648r.b((InterfaceC41402a) this.f249647q, this.f249649s.invoke());
        }
    }

    /* compiled from: RatingFormStepActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lih0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "<anonymous>", "(Lih0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$process$2$2", f = "RatingFormStepActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC41402a, Continuation<? super InterfaceC43160i<? extends RatingFormStepInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f249650q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ j f249651r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C41404c> f249652s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar, j jVar, Continuation continuation) {
            super(2, continuation);
            this.f249651r = jVar;
            this.f249652s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f249652s, this.f249651r, continuation);
            bVar.f249650q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC41402a interfaceC41402a, Continuation<? super InterfaceC43160i<? extends RatingFormStepInternalAction>> continuation) {
            return ((b) create(interfaceC41402a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f249651r.b((InterfaceC41402a) this.f249650q, this.f249652s.invoke());
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$process$2$invokeSuspend$$inlined$flatMapLatest$1", f = "RatingFormStepActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super RatingFormStepInternalAction>, InterfaceC41402a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249653q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f249654r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f249655s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ j f249656t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f249657u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar, j jVar, Continuation continuation) {
            super(3, continuation);
            this.f249656t = jVar;
            this.f249657u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction> interfaceC43172j, InterfaceC41402a interfaceC41402a, Continuation<? super G0> continuation) {
            c cVar = new c(this.f249657u, this.f249656t, continuation);
            cVar.f249654r = interfaceC43172j;
            cVar.f249655s = interfaceC41402a;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f249653q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f249654r;
                InterfaceC43160i<RatingFormStepInternalAction> interfaceC43160iB = this.f249656t.b((InterfaceC41402a) this.f249655s, (C41404c) this.f249657u.invoke());
                this.f249653q = 1;
                if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Y41.a aVar, j jVar, Continuation continuation) {
        super(2, continuation);
        this.f249645r = jVar;
        this.f249646s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f249646s, this.f249645r, continuation);
        lVar.f249644q = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends InterfaceC41402a.k, ? extends InterfaceC43160i<? extends InterfaceC41402a>> q12, Continuation<? super InterfaceC43160i<? extends RatingFormStepInternalAction>> continuation) {
        return ((l) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f249644q;
        InterfaceC41402a.k kVar = (InterfaceC41402a.k) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean z12 = kVar instanceof InterfaceC41402a.k.c;
        Y41.a<C41404c> aVar = this.f249646s;
        j jVar = this.f249645r;
        if (z12) {
            return C43175k.C(new a(aVar, jVar, null), interfaceC43160i);
        }
        if (kVar instanceof InterfaceC41402a.k.C11385a) {
            return C43175k.B(new b(aVar, jVar, null), interfaceC43160i);
        }
        if (kVar instanceof InterfaceC41402a.k.b) {
            return C43175k.Y(interfaceC43160i, new c(aVar, jVar, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
