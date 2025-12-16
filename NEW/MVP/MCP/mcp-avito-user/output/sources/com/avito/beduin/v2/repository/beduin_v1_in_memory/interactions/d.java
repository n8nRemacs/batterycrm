package com.avito.beduin.v2.repository.beduin_v1_in_memory.interactions;

import Y41.p;
import Y61.k;
import Y61.l;
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

/* compiled from: BeduinV1InMemoryRepositoryObserveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/beduin/v2/engine/field/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.repository.beduin_v1_in_memory.interactions.BeduinV1InMemoryRepositoryObserveInteractionHandler$observeData$1", f = "BeduinV1InMemoryRepositoryObserveInteractionHandler.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements p<I0<? super com.avito.beduin.v2.engine.field.d>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f338119q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f338120r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f338121s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f338122t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C36272i f338123u;

    /* compiled from: BeduinV1InMemoryRepositoryObserveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ HV0.c f338124l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HV0.c cVar) {
            super(0);
            this.f338124l = cVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f338124l.dispose();
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinV1InMemoryRepositoryObserveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "Lcom/avito/beduin/v2/engine/field/entity/A;", "params", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Lcom/avito/beduin/v2/engine/field/entity/A;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<String, A, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I0<com.avito.beduin.v2.engine.field.d> f338125l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(I0<? super com.avito.beduin.v2.engine.field.d> i02) {
            super(2);
            this.f338125l = i02;
        }

        @Override // Y41.p
        public final G0 invoke(String str, A a12) {
            this.f338125l.w(a12);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, c cVar, C36272i c36272i, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f338121s = eVar;
        this.f338122t = cVar;
        this.f338123u = c36272i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        d dVar = new d(this.f338121s, this.f338122t, this.f338123u, continuation);
        dVar.f338120r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super com.avito.beduin.v2.engine.field.d> i02, Continuation<? super G0> continuation) {
        return ((d) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f338119q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f338120r;
            a aVar = new a(this.f338121s.f338126c.b(this.f338122t.f338117e, this.f338123u, new b(i02)));
            this.f338119q = 1;
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
