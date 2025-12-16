package com.avito.android.messenger.channels.mvi.header_feature;

import FY.a;
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

/* compiled from: ChannelsHeaderActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "LFY/a;", "Lkotlinx/coroutines/flow/i;", "<name for destructuring parameter 0>", "LFY/b;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.header_feature.ChannelsHeaderActor$process$3", f = "ChannelsHeaderActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.header_feature.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31752d extends SuspendLambda implements Y41.p<Q<? extends FY.a, ? extends InterfaceC43160i<? extends FY.a>>, Continuation<? super InterfaceC43160i<? extends FY.b>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f187518q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C31755g f187519r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<FY.d> f187520s;

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.header_feature.ChannelsHeaderActor$process$3$invokeSuspend$$inlined$flatMapLatest$1", f = "ChannelsHeaderActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.messenger.channels.mvi.header_feature.d$a */
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super FY.b>, FY.a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f187521q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f187522r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f187523s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C31755g f187524t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ FY.a f187525u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Y41.a f187526v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Continuation continuation, C31755g c31755g, FY.a aVar, Y41.a aVar2) {
            super(3, continuation);
            this.f187524t = c31755g;
            this.f187525u = aVar;
            this.f187526v = aVar2;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super FY.b> interfaceC43172j, FY.a aVar, Continuation<? super G0> continuation) {
            a aVar2 = new a(continuation, this.f187524t, this.f187525u, this.f187526v);
            aVar2.f187522r = interfaceC43172j;
            aVar2.f187523s = aVar;
            return aVar2.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f187521q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f187522r;
                InterfaceC43160i interfaceC43160iC = this.f187524t.c(this.f187525u);
                this.f187521q = 1;
                if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.header_feature.ChannelsHeaderActor$process$3$invokeSuspend$$inlined$flatMapLatest$2", f = "ChannelsHeaderActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.messenger.channels.mvi.header_feature.d$b */
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super FY.b>, FY.a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f187527q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f187528r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f187529s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C31755g f187530t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ FY.a f187531u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Y41.a f187532v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, C31755g c31755g, FY.a aVar, Y41.a aVar2) {
            super(3, continuation);
            this.f187530t = c31755g;
            this.f187531u = aVar;
            this.f187532v = aVar2;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super FY.b> interfaceC43172j, FY.a aVar, Continuation<? super G0> continuation) {
            b bVar = new b(continuation, this.f187530t, this.f187531u, this.f187532v);
            bVar.f187528r = interfaceC43172j;
            bVar.f187529s = aVar;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f187527q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f187528r;
                InterfaceC43160i interfaceC43160iC = this.f187530t.c(this.f187531u);
                this.f187527q = 1;
                if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.header_feature.ChannelsHeaderActor$process$3$invokeSuspend$$inlined$flatMapLatest$3", f = "ChannelsHeaderActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.messenger.channels.mvi.header_feature.d$c */
    public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super FY.b>, FY.a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f187533q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f187534r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f187535s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C31755g f187536t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ FY.a f187537u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Y41.a f187538v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Continuation continuation, C31755g c31755g, FY.a aVar, Y41.a aVar2) {
            super(3, continuation);
            this.f187536t = c31755g;
            this.f187537u = aVar;
            this.f187538v = aVar2;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super FY.b> interfaceC43172j, FY.a aVar, Continuation<? super G0> continuation) {
            c cVar = new c(continuation, this.f187536t, this.f187537u, this.f187538v);
            cVar.f187534r = interfaceC43172j;
            cVar.f187535s = aVar;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f187533q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f187534r;
                InterfaceC43160i interfaceC43160iC = this.f187536t.c(this.f187537u);
                this.f187533q = 1;
                if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
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
    public C31752d(C31755g c31755g, Y41.a<FY.d> aVar, Continuation<? super C31752d> continuation) {
        super(2, continuation);
        this.f187519r = c31755g;
        this.f187520s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31752d c31752d = new C31752d(this.f187519r, this.f187520s, continuation);
        c31752d.f187518q = obj;
        return c31752d;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends FY.a, ? extends InterfaceC43160i<? extends FY.a>> q12, Continuation<? super InterfaceC43160i<? extends FY.b>> continuation) {
        return ((C31752d) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f187518q;
        FY.a aVar = (FY.a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean z12 = aVar instanceof a.c;
        Y41.a<FY.d> aVar2 = this.f187520s;
        C31755g c31755g = this.f187519r;
        if (z12) {
            return C43175k.Y(interfaceC43160i, new a(null, c31755g, aVar, aVar2));
        }
        if (aVar instanceof a.C0291a) {
            return C43175k.Y(interfaceC43160i, new b(null, c31755g, aVar, aVar2));
        }
        if (aVar instanceof a.b) {
            return C43175k.Y(interfaceC43160i, new c(null, c31755g, aVar, aVar2));
        }
        throw new NoWhenBranchMatchedException();
    }
}
