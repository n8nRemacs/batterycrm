package com.avito.android.recall_me_v2.presentation.recallme.mvi;

import Di0.AbstractC13405c;
import com.avito.android.recall_me_v2.presentation.recallme.mvi.entity.RecallMeInternalAction;
import com.avito.android.remote.ConfirmCodeResponse;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RecallMeActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.recall_me_v2.presentation.recallme.mvi.RecallMeActor$verifyPhone$2", f = "RecallMeActor.kt", i = {0}, l = {149, 163, 163, 165, 167, 173}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RecallMeInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f252181q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f252182r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.recall_me_v2.presentation.recallme.mvi.a f252183s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC13405c.a f252184t;

    /* compiled from: RecallMeActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/ConfirmCodeResponse;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.recall_me_v2.presentation.recallme.mvi.RecallMeActor$verifyPhone$2$requestSmsResult$1", f = "RecallMeActor.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<ConfirmCodeResponse>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f252185q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.recall_me_v2.presentation.recallme.mvi.a f252186r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AbstractC13405c.a f252187s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC13405c.a aVar, com.avito.android.recall_me_v2.presentation.recallme.mvi.a aVar2, Continuation continuation) {
            super(2, continuation);
            this.f252186r = aVar2;
            this.f252187s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f252187s, this.f252186r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<ConfirmCodeResponse>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f252185q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.recall_me_v2.presentation.recallme.mvi.a aVar = this.f252186r;
                com.avito.android.recall_me.domain.n nVar = aVar.f252120a;
                String strC = com.avito.android.recall_me_v2.presentation.recallme.mvi.a.c(aVar, this.f252187s.f3406h);
                this.f252185q = 1;
                obj = nVar.e(strC, this);
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
    public i(AbstractC13405c.a aVar, com.avito.android.recall_me_v2.presentation.recallme.mvi.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f252183s = aVar2;
        this.f252184t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f252184t, this.f252183s, continuation);
        iVar.f252182r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RecallMeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.recall_me_v2.presentation.recallme.mvi.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
