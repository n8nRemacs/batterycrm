package com.avito.android.recall_me_v2.presentation.recallme.mvi;

import Di0.AbstractC13405c;
import com.avito.android.recall_me_v2.presentation.recallme.mvi.entity.RecallMeInternalAction;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import yi0.C50255a;

/* compiled from: RecallMeActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/recall_me_v2/presentation/recallme/mvi/entity/RecallMeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.recall_me_v2.presentation.recallme.mvi.RecallMeActor$initialize$1", f = "RecallMeActor.kt", i = {0, 1, 3, 3}, l = {56, 58, 65, 80, 84}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "userContactInfo"}, s = {"L$0", "L$0", "L$0", "L$1"})
/* loaded from: classes16.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RecallMeInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public TypedResult.Error f252124q;

    /* renamed from: r, reason: collision with root package name */
    public int f252125r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f252126s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.recall_me_v2.presentation.recallme.mvi.a f252127t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC13405c f252128u;

    /* compiled from: RecallMeActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lyi0/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.recall_me_v2.presentation.recallme.mvi.RecallMeActor$initialize$1$userContactInfo$1", f = "RecallMeActor.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<C50255a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f252129q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.recall_me_v2.presentation.recallme.mvi.a f252130r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AbstractC13405c f252131s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.recall_me_v2.presentation.recallme.mvi.a aVar, AbstractC13405c abstractC13405c, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f252130r = aVar;
            this.f252131s = abstractC13405c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f252130r, this.f252131s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<C50255a>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f252129q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.recall_me.domain.n nVar = this.f252130r.f252120a;
                AbstractC13405c abstractC13405c = this.f252131s;
                String str = abstractC13405c.getF3411b().f251909b;
                String str2 = abstractC13405c.getF3411b().f251911d;
                this.f252129q = 1;
                obj = nVar.d(str, str2, this);
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
    public b(com.avito.android.recall_me_v2.presentation.recallme.mvi.a aVar, AbstractC13405c abstractC13405c, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f252127t = aVar;
        this.f252128u = abstractC13405c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f252127t, this.f252128u, continuation);
        bVar.f252126s = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RecallMeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.recall_me_v2.presentation.recallme.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
