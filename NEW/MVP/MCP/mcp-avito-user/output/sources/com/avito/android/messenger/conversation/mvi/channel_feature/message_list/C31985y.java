package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import MY.k;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.util.X2;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/s"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorDelegateImpl$process$$inlined$flowWithAccessToStateFromOverloaded$2", f = "MessageListActorDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.y, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31985y extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f190129q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f190130r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k.b f190131s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k.b f190132t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ J f190133u;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.y$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<MY.d, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(MY.d dVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(dVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31985y(com.avito.android.arch.mvi.utils.o oVar, k.b bVar, Continuation continuation, k.b bVar2, J j12) {
        super(2, continuation);
        this.f190130r = oVar;
        this.f190131s = bVar;
        this.f190132t = bVar2;
        this.f190133u = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31985y c31985y = new C31985y(this.f190130r, this.f190131s, continuation, this.f190132t, this.f190133u);
        c31985y.f190129q = obj;
        return c31985y;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MY.d> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C31985y) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<kotlin.Q<LocalMessage, Q1>> listB;
        k.b bVar;
        Object next;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f190129q;
        Object value = this.f190130r.f92114c.getValue();
        new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        Object obj2 = ((NY.h) value).f11579d;
        if (!(obj2 instanceof NY.a)) {
            obj2 = null;
        }
        NY.a aVar = (NY.a) obj2;
        if (aVar == null || (listB = aVar.b()) == null) {
            listB = C42784z0.f406748b;
        }
        Iterator<T> it = listB.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            bVar = this.f190132t;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(((LocalMessage) ((kotlin.Q) next).f406619b).getRemoteId(), ((k.b.a) bVar).f10785a)) {
                break;
            }
        }
        kotlin.Q q12 = (kotlin.Q) next;
        LocalMessage localMessage = q12 != null ? (LocalMessage) q12.f406619b : null;
        J j12 = this.f190133u;
        if (localMessage == null) {
            X2.f318778a.c(j12.f189841x, "Message not found: remoteId=".concat(((k.b.a) bVar).f10785a), null);
        } else if (((k.b.a) bVar).f10786b) {
            j12.f189837t.U4(localMessage.getFromId());
        } else {
            j12.f189837t.Y6(localMessage.getFromId());
        }
        return kotlin.G0.f406611a;
    }
}
