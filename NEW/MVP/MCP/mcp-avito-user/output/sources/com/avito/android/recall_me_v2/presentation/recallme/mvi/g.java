package com.avito.android.recall_me_v2.presentation.recallme.mvi;

import Di0.AbstractC13405c;
import com.avito.android.error.z;
import com.avito.android.recall_me.presentation.RecallMeParams;
import com.avito.android.recall_me_v2.presentation.recallme.mvi.entity.RecallMeInternalAction;
import com.avito.android.remote.RecallMeError;
import com.avito.android.remote.SaveResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RecallMeActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.recall_me_v2.presentation.recallme.mvi.RecallMeActor$saveRecallMeRequest$1", f = "RecallMeActor.kt", i = {0}, l = {114, 128, 135, 141}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RecallMeInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f252160q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f252161r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.recall_me_v2.presentation.recallme.mvi.a f252162s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC13405c.a f252163t;

    /* compiled from: RecallMeActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/SaveResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.recall_me_v2.presentation.recallme.mvi.RecallMeActor$saveRecallMeRequest$1$saveRecallMeRequestResult$1", f = "RecallMeActor.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<SaveResponse>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f252164q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.recall_me_v2.presentation.recallme.mvi.a f252165r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AbstractC13405c.a f252166s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC13405c.a aVar, com.avito.android.recall_me_v2.presentation.recallme.mvi.a aVar2, Continuation continuation) {
            super(2, continuation);
            this.f252165r = aVar2;
            this.f252166s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f252166s, this.f252165r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<SaveResponse>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f252164q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.recall_me_v2.presentation.recallme.mvi.a aVar = this.f252165r;
                com.avito.android.recall_me.domain.n nVar = aVar.f252120a;
                AbstractC13405c.a aVar2 = this.f252166s;
                RecallMeParams recallMeParams = aVar2.f3400b;
                String str = recallMeParams.f251909b;
                String strC = com.avito.android.recall_me_v2.presentation.recallme.mvi.a.c(aVar, aVar2.f3406h);
                String str2 = recallMeParams.f251911d;
                this.f252164q = 1;
                obj = nVar.f(str, aVar2.f3404f, strC, str2, recallMeParams.f251910c, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AbstractC13405c.a aVar, com.avito.android.recall_me_v2.presentation.recallme.mvi.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f252162s = aVar2;
        this.f252163t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f252163t, this.f252162s, continuation);
        gVar.f252161r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RecallMeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        String f252105b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f252160q;
        com.avito.android.recall_me_v2.presentation.recallme.mvi.a aVar = this.f252162s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f252161r;
            kotlinx.coroutines.scheduling.b bVarA = aVar.f252123d.a();
            a aVar2 = new a(this.f252163t, aVar, null);
            this.f252161r = interfaceC43172j;
            this.f252160q = 1;
            obj = C43259k.g(bVarA, aVar2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3 && i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f252161r;
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            SaveResponse saveResponse = (SaveResponse) ((TypedResult.Success) typedResult).getResult();
            if (saveResponse.getSuccess()) {
                RecallMeInternalAction.OnRequestSaved onRequestSaved = new RecallMeInternalAction.OnRequestSaved(aVar.f252121b.a(), saveResponse.getRequestId());
                this.f252161r = null;
                this.f252160q = 2;
                if (interfaceC43172j.emit(onRequestSaved, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                RecallMeError error = saveResponse.getError();
                if (error == null || (f252105b = error.getMessage()) == null) {
                    f252105b = aVar.f252121b.getF252105b();
                }
                RecallMeInternalAction.OnError onError = new RecallMeInternalAction.OnError(f252105b);
                this.f252161r = null;
                this.f252160q = 3;
                if (interfaceC43172j.emit(onError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (typedResult instanceof TypedResult.Error) {
            TypedResult.Error error2 = (TypedResult.Error) typedResult;
            RecallMeInternalAction.OnError onError2 = new RecallMeInternalAction.OnError(z.l(C35936s.a(error2.getError(), error2.getCause())));
            this.f252161r = null;
            this.f252160q = 4;
            if (interfaceC43172j.emit(onError2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
