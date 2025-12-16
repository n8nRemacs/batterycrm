package com.avito.android.messenger.channels.mvi.list_feature;

import HY.g;
import HY.m;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.messenger.channels.analytics.UseCaseScenario;
import com.avito.android.util.X2;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$$inlined$flowWithAccessToMutableStateFrom$10", f = "ChannelsListActor.kt", i = {}, l = {342}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31784g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f188054q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f188055r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f188056s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g.b f188057t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C31772a f188058u;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.g$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<HY.d, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(HY.d dVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(dVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31784g(com.avito.android.arch.mvi.utils.o oVar, g.b bVar, Continuation continuation, C31772a c31772a) {
        super(2, continuation);
        this.f188056s = oVar;
        this.f188057t = bVar;
        this.f188058u = c31772a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31784g c31784g = new C31784g(this.f188056s, this.f188057t, continuation, this.f188058u);
        c31784g.f188055r = obj;
        return c31784g;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HY.d> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C31784g) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        m.b bVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f188054q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f188055r;
            o.a aVar = this.f188056s.f92114c;
            new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            HY.m mVar = (HY.m) aVar.getValue();
            if (!kotlin.jvm.internal.L.f(mVar.f7251b, m.c.b.f7265a) || (bVar = mVar.f7255f) == null || bVar.f7263b.getF7270b()) {
                X2 x22 = X2.f318778a;
                StringBuilder sb2 = new StringBuilder("PrivateAction.MessagesUnmarkedAsSpam: userId = ");
                MessengerUserHashInfo messengerUserHashInfo = ((HY.m) aVar.getValue()).f7250a;
                sb2.append(messengerUserHashInfo != null ? messengerUserHashInfo.f430682d : null);
                sb2.append(", initialLoadingState = ");
                sb2.append(((HY.m) aVar.getValue()).f7251b);
                sb2.append(", mainListBottomTimestamp = ");
                sb2.append(((HY.m) aVar.getValue()).f7255f);
                sb2.append(" => do nothing");
                x22.j("ChannelsListActor", sb2.toString(), null);
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } else {
                UseCaseScenario useCaseScenario = UseCaseScenario.f187086k;
                this.f188054q = 1;
                if (this.f188058u.h(aVar, useCaseScenario, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
