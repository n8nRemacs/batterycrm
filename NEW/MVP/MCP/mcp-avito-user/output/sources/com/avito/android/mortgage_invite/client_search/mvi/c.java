package com.avito.android.mortgage_invite.client_search.mvi;

import W10.a;
import Y41.p;
import com.avito.android.mortgage_invite.client_search.mvi.entity.ClientSearchInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ClientSearchActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.client_search.mvi.ClientSearchActor$process$3", f = "ClientSearchActor.kt", i = {0}, l = {43}, m = "invokeSuspend", n = {"$this$channelFlow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<I0<? super ClientSearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205417q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f205418r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W10.a f205419s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f205420t;

    /* compiled from: ClientSearchActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_invite.client_search.mvi.ClientSearchActor$process$3$1", f = "ClientSearchActor.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f205421q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ d f205422r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ W10.a f205423s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ I0<ClientSearchInternalAction> f205424t;

        /* compiled from: ClientSearchActor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage_invite.client_search.mvi.c$a$a, reason: collision with other inner class name */
        public static final class C6121a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I0<ClientSearchInternalAction> f205425b;

            /* JADX WARN: Multi-variable type inference failed */
            public C6121a(I0<? super ClientSearchInternalAction> i02) {
                this.f205425b = i02;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                Object objSend = this.f205425b.send((ClientSearchInternalAction) obj, continuation);
                return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(d dVar, W10.a aVar, I0<? super ClientSearchInternalAction> i02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f205422r = dVar;
            this.f205423s = aVar;
            this.f205424t = i02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f205422r, this.f205423s, this.f205424t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f205421q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43160i interfaceC43160iA = this.f205422r.f205426a.a(0, ((a.f) this.f205423s).f17553a);
                C6121a c6121a = new C6121a(this.f205424t);
                this.f205421q = 1;
                if (interfaceC43160iA.collect(c6121a, this) == coroutine_suspended) {
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
    public c(W10.a aVar, d dVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f205419s = aVar;
        this.f205420t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f205419s, this.f205420t, continuation);
        cVar.f205418r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super ClientSearchInternalAction> i02, Continuation<? super G0> continuation) {
        return ((c) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        I0 i02;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205417q;
        W10.a aVar = this.f205419s;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i03 = (I0) this.f205418r;
            ClientSearchInternalAction.UpdateSearchQuery updateSearchQuery = new ClientSearchInternalAction.UpdateSearchQuery(((a.f) aVar).f17553a);
            this.f205418r = i03;
            this.f205417q = 1;
            if (i03.send(updateSearchQuery, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i02 = i03;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i02 = (I0) this.f205418r;
            C42729a0.b(obj);
        }
        d dVar = this.f205420t;
        N0 n02 = dVar.f205427b;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        dVar.f205427b = C43259k.d(U.a(getF411447c()), null, null, new a(dVar, aVar, i02, null), 3);
        return G0.f406611a;
    }
}
