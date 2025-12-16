package com.avito.android.messenger.channels.mvi.list_feature;

import HY.c;
import com.avito.android.messenger.analytics.InterfaceC31662s;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.ChannelKt;
import java.util.List;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.sequences.o0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/s"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$$inlined$flowWithAccessToStateFromOverloaded$1", f = "ChannelsListActor.kt", i = {}, l = {344}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.y, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31819y extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f188259q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f188260r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f188261s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c.b f188262t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c.b f188263u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C31772a f188264v;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.y$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<HY.d, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(HY.d dVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(dVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31819y(com.avito.android.arch.mvi.utils.o oVar, c.b bVar, Continuation continuation, c.b bVar2, C31772a c31772a) {
        super(2, continuation);
        this.f188261s = oVar;
        this.f188262t = bVar;
        this.f188263u = bVar2;
        this.f188264v = c31772a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31819y c31819y = new C31819y(this.f188261s, this.f188262t, continuation, this.f188263u, this.f188264v);
        c31819y.f188260r = obj;
        return c31819y;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HY.d> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C31819y) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f188259q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f188260r;
            Object value = this.f188261s.f92114c.getValue();
            new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            HY.m mVar = (HY.m) value;
            Map<String, List<HY.b>> map = mVar.f7258i;
            c.b.k kVar = (c.b.k) this.f188263u;
            List<HY.b> list = map.get(kVar.f7161a.f186789d);
            if (list != null) {
                Object obj2 = null;
                MessengerUserHashInfo messengerUserHashInfo = mVar.f7250a;
                if ((messengerUserHashInfo != null ? messengerUserHashInfo.f430682d : null) != null) {
                    o0.a aVar = new o0.a(new kotlin.sequences.o0(new C42770s0(C42745f0.h0(mVar.f7257h, mVar.f7254e)), C.f187697l));
                    while (true) {
                        if (!aVar.f410559b.hasNext()) {
                            break;
                        }
                        Object next = aVar.next();
                        if (kotlin.jvm.internal.L.f(((Channel) next).getChannelId(), kVar.f7161a.f186789d)) {
                            obj2 = next;
                            break;
                        }
                    }
                    Channel channel = (Channel) obj2;
                    boolean z12 = false;
                    if (channel != null && ChannelKt.hasItemContextAndUserIsSeller(channel, messengerUserHashInfo.f430682d)) {
                        z12 = true;
                    }
                    InterfaceC31662s interfaceC31662s = this.f188264v.f187943w;
                    String str = kVar.f7161a.f186789d;
                    this.f188259q = 1;
                    if (interfaceC31662s.a(str, list, z12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
