package com.avito.android.arch.mvi;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: Actor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u00020\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/arch/mvi/a;", "", "Action", "InternalAction", "State", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a<Action, InternalAction, State> {

    /* compiled from: Actor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.arch.mvi.a$a, reason: collision with other inner class name */
    public static final class C2701a {

        /* compiled from: Actor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"", "Action", "InternalAction", "State", "action", "Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.arch.mvi.Actor$process$1", f = "Actor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.arch.mvi.a$a$a, reason: collision with other inner class name */
        public static final class C2702a extends SuspendLambda implements Y41.p<Action, Continuation<? super InterfaceC43160i<? extends InternalAction>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f91840q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ a<Action, InternalAction, State> f91841r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Y41.a<State> f91842s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2702a(a<Action, InternalAction, State> aVar, Y41.a<? extends State> aVar2, Continuation<? super C2702a> continuation) {
                super(2, continuation);
                this.f91841r = aVar;
                this.f91842s = aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C2702a c2702a = new C2702a(this.f91841r, this.f91842s, continuation);
                c2702a.f91840q = obj;
                return c2702a;
            }

            @Override // Y41.p
            public final Object invoke(Object obj, Object obj2) {
                return ((C2702a) create(obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                return this.f91841r.b(this.f91840q, this.f91842s.invoke());
            }
        }

        @Y61.k
        public static <Action, InternalAction, State> InterfaceC43160i<InternalAction> a(@Y61.k a<Action, InternalAction, State> aVar, @Y61.k InterfaceC43160i<? extends Action> interfaceC43160i, @Y61.k Y41.a<? extends State> aVar2) {
            return C43175k.C(new C2702a(aVar, aVar2, null), interfaceC43160i);
        }
    }

    @Y61.k
    InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar);

    @Y61.k
    InterfaceC43160i<InternalAction> b(@Y61.k Action action, @Y61.k State state);
}
