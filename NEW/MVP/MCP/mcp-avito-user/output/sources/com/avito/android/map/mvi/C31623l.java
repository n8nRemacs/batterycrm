package com.avito.android.map.mvi;

import bY.InterfaceC25584a;
import bY.InterfaceC25585b;
import com.avito.android.map.mvi.entity.MapInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MapActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "LbY/a;", "Lkotlinx/coroutines/flow/i;", "LbY/b;", "<name for destructuring parameter 0>", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.map.mvi.MapActor$process$2", f = "MapActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.map.mvi.l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31623l extends SuspendLambda implements Y41.p<kotlin.Q<? extends InterfaceC25584a, ? extends InterfaceC43160i<? extends InterfaceC25585b>>, Continuation<? super InterfaceC43160i<? extends MapInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f185269q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C31612a f185270r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.map.mvi.entity.a> f185271s;

    /* compiled from: MapActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LbY/b;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<anonymous>", "(LbY/b;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.map.mvi.MapActor$process$2$2", f = "MapActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.map.mvi.l$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC25585b, Continuation<? super InterfaceC43160i<? extends MapInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f185272q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C31612a f185273r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<com.avito.android.map.mvi.entity.a> f185274s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, C31612a c31612a, Continuation continuation) {
            super(2, continuation);
            this.f185273r = c31612a;
            this.f185274s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f185274s, this.f185273r, continuation);
            aVar.f185272q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC25585b interfaceC25585b, Continuation<? super InterfaceC43160i<? extends MapInternalAction>> continuation) {
            return ((a) create(interfaceC25585b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f185273r.b((InterfaceC25585b) this.f185272q, this.f185274s.invoke());
        }
    }

    /* compiled from: MapActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LbY/b;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "<anonymous>", "(LbY/b;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.map.mvi.MapActor$process$2$3", f = "MapActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.map.mvi.l$b */
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC25585b, Continuation<? super InterfaceC43160i<? extends MapInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f185275q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C31612a f185276r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<com.avito.android.map.mvi.entity.a> f185277s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar, C31612a c31612a, Continuation continuation) {
            super(2, continuation);
            this.f185276r = c31612a;
            this.f185277s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f185277s, this.f185276r, continuation);
            bVar.f185275q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC25585b interfaceC25585b, Continuation<? super InterfaceC43160i<? extends MapInternalAction>> continuation) {
            return ((b) create(interfaceC25585b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f185276r.b((InterfaceC25585b) this.f185275q, this.f185277s.invoke());
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.map.mvi.MapActor$process$2$invokeSuspend$$inlined$flatMapLatest$1", f = "MapActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.map.mvi.l$c */
    public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super MapInternalAction>, InterfaceC25585b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f185278q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f185279r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f185280s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C31612a f185281t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f185282u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar, C31612a c31612a, Continuation continuation) {
            super(3, continuation);
            this.f185281t = c31612a;
            this.f185282u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, InterfaceC25585b interfaceC25585b, Continuation<? super G0> continuation) {
            c cVar = new c(this.f185282u, this.f185281t, continuation);
            cVar.f185279r = interfaceC43172j;
            cVar.f185280s = interfaceC25585b;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f185278q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f185279r;
                C43152f0 c43152f0B = this.f185281t.b((InterfaceC25585b) this.f185280s, (com.avito.android.map.mvi.entity.a) this.f185282u.invoke());
                this.f185278q = 1;
                if (C43175k.u(this, c43152f0B, interfaceC43172j) == coroutine_suspended) {
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
    public C31623l(Y41.a aVar, C31612a c31612a, Continuation continuation) {
        super(2, continuation);
        this.f185270r = c31612a;
        this.f185271s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31623l c31623l = new C31623l(this.f185271s, this.f185270r, continuation);
        c31623l.f185269q = obj;
        return c31623l;
    }

    @Override // Y41.p
    public final Object invoke(kotlin.Q<? extends InterfaceC25584a, ? extends InterfaceC43160i<? extends InterfaceC25585b>> q12, Continuation<? super InterfaceC43160i<? extends MapInternalAction>> continuation) {
        return ((C31623l) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlin.Q q12 = (kotlin.Q) this.f185269q;
        InterfaceC25584a interfaceC25584a = (InterfaceC25584a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean z12 = interfaceC25584a instanceof InterfaceC25584a.b;
        Y41.a<com.avito.android.map.mvi.entity.a> aVar = this.f185271s;
        C31612a c31612a = this.f185270r;
        if (z12) {
            return C43175k.Y(interfaceC43160i, new c(aVar, c31612a, null));
        }
        if (interfaceC25584a instanceof InterfaceC25584a.c) {
            return C43175k.C(new a(aVar, c31612a, null), com.avito.android.arch.mvi.utils.h.d(interfaceC43160i, 500L));
        }
        if (interfaceC25584a instanceof InterfaceC25584a.C2003a) {
            return C43175k.C(new b(aVar, c31612a, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
