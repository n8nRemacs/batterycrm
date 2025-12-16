package com.avito.android.messenger.channels.mvi.list_feature;

import HY.g;
import com.avito.android.arch.mvi.utils.o;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$$inlined$flowWithAccessToMutableStateFrom$3", f = "ChannelsListActor.kt", i = {}, l = {337}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
public final class r extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f188180q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f188181r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f188182s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g.b f188183t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C31772a f188184u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g.b f188185v;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<HY.d, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(HY.d dVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(dVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g.b bVar, g.b bVar2, com.avito.android.arch.mvi.utils.o oVar, C31772a c31772a, Continuation continuation) {
        super(2, continuation);
        this.f188182s = oVar;
        this.f188183t = bVar;
        this.f188184u = c31772a;
        this.f188185v = bVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31772a c31772a = this.f188184u;
        r rVar = new r(this.f188183t, this.f188185v, this.f188182s, c31772a, continuation);
        rVar.f188181r = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HY.d> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((r) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f188180q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f188181r;
            o.a aVar = this.f188182s.f92114c;
            new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            P p12 = new P(this.f188185v, aVar, null);
            this.f188180q = 1;
            if (C31772a.i(aVar, p12, this) == coroutine_suspended) {
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
