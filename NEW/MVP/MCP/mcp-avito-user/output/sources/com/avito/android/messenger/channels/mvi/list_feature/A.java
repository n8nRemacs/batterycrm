package com.avito.android.messenger.channels.mvi.list_feature;

import HY.g;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.messenger.channels.analytics.UseCaseScenario;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ChannelsListActor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LHY/g$b$e;", "it", "Lkotlinx/coroutines/flow/i;", "LHY/d;", "<anonymous>", "(LHY/g$b$e;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$15", f = "ChannelsListActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class A extends SuspendLambda implements Y41.p<g.b.e, Continuation<? super InterfaceC43160i<? extends HY.d>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g.b.e f187678q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C31772a f187679r;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$15$invokeSuspend$$inlined$flowWithAccessToMutableStateFrom$1", f = "ChannelsListActor.kt", i = {}, l = {337}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HY.d>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f187680q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f187681r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.arch.mvi.utils.o f187682s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Object f187683t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C31772a f187684u;

        /* compiled from: PrivateStateHolder.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.A$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C5507a extends kotlin.jvm.internal.H implements Y41.p<HY.d, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
            @Override // Y41.p
            public final Object invoke(HY.d dVar, Continuation<? super kotlin.G0> continuation) {
                return ((InterfaceC43172j) this.receiver).emit(dVar, continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.arch.mvi.utils.o oVar, Object obj, Continuation continuation, C31772a c31772a) {
            super(2, continuation);
            this.f187682s = oVar;
            this.f187683t = obj;
            this.f187684u = c31772a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f187682s, this.f187683t, continuation, this.f187684u);
            aVar.f187681r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super HY.d> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f187680q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f187681r;
                o.a aVar = this.f187682s.f92114c;
                new C5507a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                this.f187680q = 1;
                C31772a c31772a = this.f187684u;
                if ((((HY.m) aVar.getValue()).f7254e.isEmpty() ? C31772a.i(aVar, new C31774b(aVar, c31772a, null), this) : c31772a.h(aVar, UseCaseScenario.f187088m, this)) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(g.b.e eVar, C31772a c31772a, Continuation<? super A> continuation) {
        super(2, continuation);
        this.f187678q = eVar;
        this.f187679r = c31772a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new A(this.f187678q, this.f187679r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(g.b.e eVar, Continuation<? super InterfaceC43160i<? extends HY.d>> continuation) {
        return ((A) create(eVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C31772a c31772a = this.f187679r;
        return C43175k.G(new a(c31772a.f187944x, this.f187678q, null, c31772a));
    }
}
