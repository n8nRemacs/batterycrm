package com.avito.android.universal_map.map.mvi.actor;

import com.avito.android.universal_map.map.mvi.actor.m;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rG0.AbstractC47541a;

/* compiled from: UniversalMapActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/universal_map/map/mvi/actor/m$a;", "Lkotlinx/coroutines/flow/i;", "LrG0/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.UniversalMapActor$process$5", f = "UniversalMapActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class q extends SuspendLambda implements Y41.p<Q<? extends m.a, ? extends InterfaceC43160i<? extends AbstractC47541a>>, Continuation<? super InterfaceC43160i<? extends UniversalMapInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f305403q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f305404r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.universal_map.map.mvi.entity.e> f305405s;

    /* compiled from: UniversalMapActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LrG0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "<anonymous>", "(LrG0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.UniversalMapActor$process$5$2", f = "UniversalMapActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<AbstractC47541a, Continuation<? super InterfaceC43160i<? extends UniversalMapInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f305406q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ m f305407r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<com.avito.android.universal_map.map.mvi.entity.e> f305408s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, m mVar, Continuation continuation) {
            super(2, continuation);
            this.f305407r = mVar;
            this.f305408s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f305408s, this.f305407r, continuation);
            aVar.f305406q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(AbstractC47541a abstractC47541a, Continuation<? super InterfaceC43160i<? extends UniversalMapInternalAction>> continuation) {
            return ((a) create(abstractC47541a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f305407r.b((AbstractC47541a) this.f305406q, this.f305408s.invoke());
        }
    }

    /* compiled from: UniversalMapActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LrG0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "<anonymous>", "(LrG0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.UniversalMapActor$process$5$3", f = "UniversalMapActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<AbstractC47541a, Continuation<? super InterfaceC43160i<? extends UniversalMapInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f305409q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ m f305410r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<com.avito.android.universal_map.map.mvi.entity.e> f305411s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar, m mVar, Continuation continuation) {
            super(2, continuation);
            this.f305410r = mVar;
            this.f305411s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f305411s, this.f305410r, continuation);
            bVar.f305409q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(AbstractC47541a abstractC47541a, Continuation<? super InterfaceC43160i<? extends UniversalMapInternalAction>> continuation) {
            return ((b) create(abstractC47541a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f305410r.b((AbstractC47541a) this.f305409q, this.f305411s.invoke());
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.UniversalMapActor$process$5$invokeSuspend$$inlined$flatMapLatest$1", f = "UniversalMapActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UniversalMapInternalAction>, AbstractC47541a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f305412q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f305413r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f305414s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ m f305415t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f305416u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar, m mVar, Continuation continuation) {
            super(3, continuation);
            this.f305415t = mVar;
            this.f305416u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, AbstractC47541a abstractC47541a, Continuation<? super G0> continuation) {
            c cVar = new c(this.f305416u, this.f305415t, continuation);
            cVar.f305413r = interfaceC43172j;
            cVar.f305414s = abstractC47541a;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f305412q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f305413r;
                InterfaceC43160i<UniversalMapInternalAction> interfaceC43160iB = this.f305415t.b((AbstractC47541a) this.f305414s, (com.avito.android.universal_map.map.mvi.entity.e) this.f305416u.invoke());
                this.f305412q = 1;
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
    public q(Y41.a aVar, m mVar, Continuation continuation) {
        super(2, continuation);
        this.f305404r = mVar;
        this.f305405s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        q qVar = new q(this.f305405s, this.f305404r, continuation);
        qVar.f305403q = obj;
        return qVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends m.a, ? extends InterfaceC43160i<? extends AbstractC47541a>> q12, Continuation<? super InterfaceC43160i<? extends UniversalMapInternalAction>> continuation) {
        return ((q) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f305403q;
        m.a aVar = (m.a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean zF2 = L.f(aVar, m.a.e.f305385a) ? true : L.f(aVar, m.a.c.f305383a) ? true : L.f(aVar, m.a.d.f305384a) ? true : L.f(aVar, m.a.f.f305386a);
        Y41.a<com.avito.android.universal_map.map.mvi.entity.e> aVar2 = this.f305405s;
        m mVar = this.f305404r;
        if (zF2) {
            return C43175k.Y(interfaceC43160i, new c(aVar2, mVar, null));
        }
        if (L.f(aVar, m.a.C9373a.f305381a)) {
            return C43175k.B(new a(aVar2, mVar, null), interfaceC43160i);
        }
        if (L.f(aVar, m.a.b.f305382a)) {
            return C43175k.C(new b(aVar2, mVar, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
