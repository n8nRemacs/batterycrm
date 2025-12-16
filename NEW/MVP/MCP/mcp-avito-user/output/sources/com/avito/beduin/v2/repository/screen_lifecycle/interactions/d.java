package com.avito.beduin.v2.repository.screen_lifecycle.interactions;

import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;

/* compiled from: ScreenLifecycleRepositoryObserveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/beduin/v2/engine/field/entity/A;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.repository.screen_lifecycle.interactions.ScreenLifecycleRepositoryObserveInteractionHandler$observeData$1", f = "ScreenLifecycleRepositoryObserveInteractionHandler.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements p<I0<? super A>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f338307q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f338308r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f338309s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C36272i f338310t;

    /* compiled from: ScreenLifecycleRepositoryObserveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ HV0.c f338311l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HV0.c cVar) {
            super(0);
            this.f338311l = cVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f338311l.dispose();
            return G0.f406611a;
        }
    }

    /* compiled from: ScreenLifecycleRepositoryObserveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/screen_lifecycle/p;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/repository/screen_lifecycle/p;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<com.avito.beduin.v2.repository.screen_lifecycle.p, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I0<A> f338312l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C36272i f338313m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C36272i c36272i, I0 i02) {
            super(1);
            this.f338312l = i02;
            this.f338313m = c36272i;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.beduin.v2.repository.screen_lifecycle.p pVar) {
            this.f338312l.w(pVar.a(this.f338313m));
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, C36272i c36272i, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f338309s = eVar;
        this.f338310t = c36272i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        d dVar = new d(this.f338309s, this.f338310t, continuation);
        dVar.f338308r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super A> i02, Continuation<? super G0> continuation) {
        return ((d) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f338307q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f338308r;
            a aVar = new a(this.f338309s.f338314c.n(new b(this.f338310t, i02)));
            this.f338307q = 1;
            if (F0.a(i02, aVar, this) == coroutine_suspended) {
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
