package com.avito.beduin.v2.repository.client.event.bus.interactions;

import Y41.l;
import Y41.p;
import Y61.k;
import cV0.InterfaceC27110a;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.repository.flow.C36328a;
import dU0.f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;

/* compiled from: ClientEventBusRepositoryObserveInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.repository.client.event.bus.interactions.ClientEventBusRepositoryObserveInteractionHandler$observe$1", f = "ClientEventBusRepositoryObserveInteractionHandler.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements p<I0<? super f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f338189q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f338190r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f338191s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.repository.client.event.bus.interactions.a f338192t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C36272i f338193u;

    /* compiled from: ClientEventBusRepositoryObserveInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ HV0.c f338194l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HV0.c cVar) {
            super(0);
            this.f338194l = cVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f338194l.dispose();
            return G0.f406611a;
        }
    }

    /* compiled from: ClientEventBusRepositoryObserveInteractionHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "params", "Lkotlin/G0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<Map<String, ? extends String>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I0<f> f338195l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.repository.client.event.bus.interactions.a f338196m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C36272i f338197n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(I0<? super f> i02, com.avito.beduin.v2.repository.client.event.bus.interactions.a aVar, C36272i c36272i) {
            super(1);
            this.f338195l = i02;
            this.f338196m = aVar;
            this.f338197n = c36272i;
        }

        @Override // Y41.l
        public final G0 invoke(Map<String, ? extends String> map) {
            Map<String, ? extends String> map2 = map;
            LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(map2.size()));
            Iterator<T> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), this.f338197n.e((String) entry.getValue()));
            }
            this.f338195l.w(this.f338196m.f337753a.invoke(C36328a.a(new A(new m(linkedHashMap), null, 2, null))));
            return G0.f406611a;
        }
    }

    /* compiled from: ClientEventBusRepositoryObserveInteractionHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.repository.client.event.bus.interactions.a f338198l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ I0<f> f338199m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(com.avito.beduin.v2.repository.client.event.bus.interactions.a aVar, I0<? super f> i02) {
            super(0);
            this.f338198l = aVar;
            this.f338199m = i02;
        }

        @Override // Y41.a
        public final G0 invoke() {
            f fVarInvoke = this.f338198l.f338177f.invoke();
            if (fVarInvoke != null) {
                this.f338199m.w(fVarInvoke);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, com.avito.beduin.v2.repository.client.event.bus.interactions.a aVar, C36272i c36272i, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f338191s = eVar;
        this.f338192t = aVar;
        this.f338193u = c36272i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        d dVar = new d(this.f338191s, this.f338192t, this.f338193u, continuation);
        dVar.f338190r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super f> i02, Continuation<? super G0> continuation) {
        return ((d) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f338189q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f338190r;
            InterfaceC27110a interfaceC27110a = this.f338191s.f338200c;
            com.avito.beduin.v2.repository.client.event.bus.interactions.a aVar = this.f338192t;
            a aVar2 = new a(interfaceC27110a.a(aVar.f338176e, new b(i02, aVar, this.f338193u), new c(aVar, i02)));
            this.f338189q = 1;
            if (F0.a(i02, aVar2, this) == coroutine_suspended) {
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
