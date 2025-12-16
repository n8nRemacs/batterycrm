package com.avito.android.messenger.channels.mvi.list_feature;

import HY.c;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.messenger.channels.action_banner.d;
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
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$$inlined$flowWithAccessToMutableStateFrom$18", f = "ChannelsListActor.kt", i = {}, l = {343}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31800o extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f188147q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f188148r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f188149s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c.a f188150t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C31772a f188151u;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.o$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<HY.d, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(HY.d dVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(dVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31800o(com.avito.android.arch.mvi.utils.o oVar, c.a aVar, Continuation continuation, C31772a c31772a) {
        super(2, continuation);
        this.f188149s = oVar;
        this.f188150t = aVar;
        this.f188151u = c31772a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31800o c31800o = new C31800o(this.f188149s, this.f188150t, continuation, this.f188151u);
        c31800o.f188148r = obj;
        return c31800o;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HY.d> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C31800o) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f188147q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f188148r;
            o.a aVar = this.f188149s.f92114c;
            new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            com.avito.android.messenger.channels.action_banner.d dVar = ((HY.j) aVar.getValue()).f7247a;
            if (dVar instanceof d.a) {
                C31772a c31772a = this.f188151u;
                c31772a.f187941u.b(dVar);
                aVar.setValue(new HY.j(null));
                this.f188147q = 1;
                if (C31772a.f(c31772a, aVar, this) == coroutine_suspended) {
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
