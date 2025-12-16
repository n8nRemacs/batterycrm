package com.avito.android.messenger.channels.mvi.list_feature;

import HY.c;
import com.avito.android.arch.mvi.utils.o;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V", "com/avito/android/arch/mvi/utils/p"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$$inlined$channelFlowWithAccessToStateFrom$1", f = "ChannelsListActor.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31780e extends SuspendLambda implements Y41.p<kotlinx.coroutines.channels.I0<? super HY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f188025q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f188026r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f188027s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c.a f188028t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C31772a f188029u;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.e$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<HY.d, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(HY.d dVar, Continuation<? super kotlin.G0> continuation) {
            return ((kotlinx.coroutines.channels.I0) this.receiver).send(dVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31780e(com.avito.android.arch.mvi.utils.o oVar, c.a aVar, Continuation continuation, C31772a c31772a) {
        super(2, continuation);
        this.f188027s = oVar;
        this.f188028t = aVar;
        this.f188029u = c31772a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31780e c31780e = new C31780e(this.f188027s, this.f188028t, continuation, this.f188029u);
        c31780e.f188026r = obj;
        return c31780e;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.channels.I0<? super HY.d> i02, Continuation<? super kotlin.G0> continuation) {
        return ((C31780e) create(i02, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String f186722g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f188025q;
        if (i12 == 0) {
            C42729a0.b(obj);
            kotlinx.coroutines.channels.I0 i02 = (kotlinx.coroutines.channels.I0) this.f188026r;
            o.a aVar = this.f188027s.f92114c;
            new a(2, i02, kotlinx.coroutines.channels.I0.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            com.avito.android.messenger.channels.action_banner.d dVar = ((HY.j) aVar.getValue()).f7247a;
            if (dVar != null && (f186722g = dVar.getF186722g()) != null) {
                C31772a c31772a = this.f188029u;
                c31772a.f187942v.d(dVar.f186716a);
                AbstractC43129d1 abstractC43129d1B = c31772a.f187934n.b();
                L l12 = new L(f186722g, c31772a, null);
                this.f188025q = 1;
                if (C43259k.g(abstractC43129d1B, l12, this) == coroutine_suspended) {
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
