package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import MY.l;
import NY.f;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.util.X2;
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
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorDelegateImpl$process$$inlined$flowWithAccessToMutableStateFrom$20", f = "MessageListActorDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31977p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f190056q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f190057r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l.j f190058s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J f190059t;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.p$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<MY.d, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(MY.d dVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(dVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31977p(com.avito.android.arch.mvi.utils.o oVar, l.j jVar, Continuation continuation, J j12) {
        super(2, continuation);
        this.f190057r = oVar;
        this.f190058s = jVar;
        this.f190059t = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31977p c31977p = new C31977p(this.f190057r, this.f190058s, continuation, this.f190059t);
        c31977p.f190056q = obj;
        return c31977p;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MY.d> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C31977p) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f190056q;
        o.a aVar = this.f190057r.f92114c;
        new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        f.a aVar2 = ((NY.h) aVar.getValue()).f11577b;
        f.a.b bVar = aVar2 instanceof f.a.b ? (f.a.b) aVar2 : null;
        f.b.AbstractC0740b abstractC0740b = ((NY.h) aVar.getValue()).f11579d;
        f.b.AbstractC0740b.d dVar = abstractC0740b instanceof f.b.AbstractC0740b.d ? (f.b.AbstractC0740b.d) abstractC0740b : null;
        J j12 = this.f190059t;
        if (bVar == null || dVar == null) {
            X2.f318778a.c(j12.f189841x, "Pagination ignored: Event.PaginationError arrived when context or first page weren't loaded: \n\t ctxState = " + ((NY.h) aVar.getValue()).f11577b + ", \n\t listMiddleState = " + ((NY.h) aVar.getValue()).f11579d, null);
        } else {
            j12.f189835r.a();
            aVar.setValue(NY.h.a((NY.h) aVar.getValue(), null, null, f.b.d.C0742b.f11567a, null, null, null, 59));
            j12.f189838u.getClass();
        }
        return kotlin.G0.f406611a;
    }
}
