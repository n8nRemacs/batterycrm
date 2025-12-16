package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import MY.l;
import NY.f;
import Oq.InterfaceC14725a;
import androidx.compose.runtime.C22026a;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.messenger.MessageListInconsistentStateException;
import com.avito.android.util.X2;
import java.util.Collections;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorDelegateImpl$process$$inlined$flowWithAccessToMutableStateFrom$17", f = "MessageListActorDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31973l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f190018q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f190019r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l.i f190020s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J f190021t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l.i f190022u;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.l$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<MY.d, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(MY.d dVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(dVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31973l(com.avito.android.arch.mvi.utils.o oVar, l.i iVar, Continuation continuation, J j12, l.i iVar2) {
        super(2, continuation);
        this.f190019r = oVar;
        this.f190020s = iVar;
        this.f190021t = j12;
        this.f190022u = iVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31973l c31973l = new C31973l(this.f190019r, this.f190020s, continuation, this.f190021t, this.f190022u);
        c31973l.f190018q = obj;
        return c31973l;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MY.d> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C31973l) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String strF0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f190018q;
        o.a aVar = this.f190019r.f92114c;
        new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        Object obj2 = ((NY.h) aVar.getValue()).f11577b;
        if (!(obj2 instanceof NY.b)) {
            obj2 = null;
        }
        NY.b bVar = (NY.b) obj2;
        MessengerUserHashInfo f11554a = bVar != null ? bVar.getF11554a() : null;
        if (f11554a == null || C43066x.K(f11554a.f430682d)) {
            f11554a = null;
        }
        J j12 = this.f190021t;
        String str = j12.f189819b;
        Integer numBoxInt = str != null ? Boxing.boxInt(com.avito.android.messenger.conversation.mvi.messages.e0.d(str)) : null;
        if (f11554a != null) {
            if (this.f190022u.f10806a) {
                j12.f189822e.get().o9(f11554a, numBoxInt);
            }
            aVar.setValue(NY.h.a((NY.h) aVar.getValue(), null, null, new f.b.d.a(false), new f.b.AbstractC0740b.c(C42784z0.f406748b), f.b.a.C0738a.f11555a, null, 35));
        } else {
            MessageListInconsistentStateException messageListInconsistentStateException = new MessageListInconsistentStateException("Action.MessagesLoadingStart arrived when userId wasn't available (contextState=" + ((NY.h) aVar.getValue()).f11577b + ')', null, 2, null);
            f.a aVar2 = ((NY.h) aVar.getValue()).f11577b;
            if (aVar2 == null) {
                throw new NoWhenBranchMatchedException();
            }
            if (aVar2.equals(f.a.C0737a.f11547a)) {
                strF0 = "Empty";
            } else if (aVar2 instanceof f.a.d) {
                strF0 = C22026a.c(new StringBuilder("LoadingError("), com.avito.android.messenger.util.i.b(((f.a.d) aVar2).f11554a, new kotlin.Q[0]), ')');
            } else if (aVar2 instanceof f.a.c) {
                strF0 = C22026a.c(new StringBuilder("LoadedOnlyUserId("), com.avito.android.messenger.util.i.b(((f.a.c) aVar2).f11553a, new kotlin.Q[0]), ')');
            } else {
                if (!(aVar2 instanceof f.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                StringBuilder sb2 = new StringBuilder("Loaded(\n                        |   userInfo=(");
                f.a.b bVar2 = (f.a.b) aVar2;
                sb2.append(com.avito.android.messenger.util.i.b(bVar2.f11548a, new kotlin.Q[0]));
                sb2.append("),\n                        |   context=");
                sb2.append(bVar2.f11549b.getClass().getSimpleName());
                sb2.append(",\n                        |   users=(");
                sb2.append(bVar2.f11550c.size());
                sb2.append(")[add logging to see contents],\n                        |)");
                strF0 = C43066x.F0(sb2.toString());
            }
            InterfaceC14725a.C0808a.a(j12.f189839v, messageListInconsistentStateException, Collections.singletonMap("contextState", strF0), 2);
            X2.f318778a.j(j12.f189841x, "Inconsistent state", messageListInconsistentStateException);
        }
        return kotlin.G0.f406611a;
    }
}
