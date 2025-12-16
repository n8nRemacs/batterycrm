package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import MY.l;
import NY.f;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorDelegateImpl$process$$inlined$flowWithAccessToMutableStateFrom$16", f = "MessageListActorDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31972k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f190008q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f190009r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l.e f190010s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l.e f190011t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ J f190012u;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.k$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<MY.d, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(MY.d dVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(dVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31972k(com.avito.android.arch.mvi.utils.o oVar, l.e eVar, Continuation continuation, l.e eVar2, J j12) {
        super(2, continuation);
        this.f190009r = oVar;
        this.f190010s = eVar;
        this.f190011t = eVar2;
        this.f190012u = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31972k c31972k = new C31972k(this.f190009r, this.f190010s, continuation, this.f190011t, this.f190012u);
        c31972k.f190008q = obj;
        return c31972k;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MY.d> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C31972k) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        T1.g gVar;
        T1.g gVar2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f190008q;
        o.a aVar = this.f190009r.f92114c;
        new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        l.e eVar = this.f190011t;
        a.b bVar = eVar.f10801a;
        if (kotlin.jvm.internal.L.f(bVar, a.b.C5595a.f189665a)) {
            gVar2 = null;
        } else {
            boolean z12 = bVar instanceof a.b.c;
            a.b bVar2 = eVar.f10801a;
            J j12 = this.f190012u;
            if (z12) {
                gVar = new T1.g(j12.f189818a, ((a.b.c) bVar2).f189669a.f189664d, T1.g.a.b.f189211a);
            } else {
                if (!(bVar instanceof a.b.C5596b)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.b.C5596b c5596b = (a.b.C5596b) bVar2;
                gVar = new T1.g(j12.f189818a, c5596b.f189666a.f189664d, new T1.g.a.C5575a(c5596b.f189667b));
            }
            gVar2 = gVar;
        }
        aVar.setValue(NY.h.a((NY.h) aVar.getValue(), null, null, null, null, null, new f.b.c(gVar2), 31));
        return kotlin.G0.f406611a;
    }
}
