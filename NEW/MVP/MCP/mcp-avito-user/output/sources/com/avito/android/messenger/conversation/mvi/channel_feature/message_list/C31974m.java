package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import MY.l;
import NY.f;
import Oq.InterfaceC14725a;
import androidx.compose.runtime.C22026a;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.messenger.MessageListInconsistentStateException;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.ChatAvatar;
import com.avito.android.remote.model.messenger.PublicProfile;
import com.avito.android.util.X2;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorDelegateImpl$process$$inlined$flowWithAccessToMutableStateFrom$18", f = "MessageListActorDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31974m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f190028q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f190029r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l.p f190030s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l.p f190031t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ J f190032u;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.m$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<MY.d, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(MY.d dVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(dVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31974m(com.avito.android.arch.mvi.utils.o oVar, l.p pVar, Continuation continuation, l.p pVar2, J j12) {
        super(2, continuation);
        this.f190029r = oVar;
        this.f190030s = pVar;
        this.f190031t = pVar2;
        this.f190032u = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31974m c31974m = new C31974m(this.f190029r, this.f190030s, continuation, this.f190031t, this.f190032u);
        c31974m.f190028q = obj;
        return c31974m;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MY.d> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C31974m) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String strF0;
        l.p pVar;
        Object next;
        ChatAvatar avatar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f190028q;
        o.a aVar = this.f190029r.f92114c;
        new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        f.a aVar2 = ((NY.h) aVar.getValue()).f11577b;
        Image image = null;
        f.a.b bVar = aVar2 instanceof f.a.b ? (f.a.b) aVar2 : null;
        J j12 = this.f190032u;
        if (bVar != null) {
            List<User> list = bVar.f11550c;
            Iterator<T> it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                pVar = this.f190031t;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.L.f(((User) next).getId(), pVar.f10813a)) {
                    break;
                }
            }
            User user = (User) next;
            if (user != null) {
                String str = pVar.f10813a;
                PublicProfile publicProfile = user.getPublicProfile();
                if (publicProfile != null && (avatar = publicProfile.getAvatar()) != null) {
                    image = avatar.getImage();
                }
                aVar.setValue(NY.h.a((NY.h) aVar.getValue(), null, null, null, null, new f.b.a.C0739b(new T1.h(str, image)), null, 47));
            } else {
                MessageListInconsistentStateException messageListInconsistentStateException = new MessageListInconsistentStateException("Event.UsersStartedTyping handler couldn't find typingUser to display: \n\t typingUserId = " + pVar.f10813a + ", \n\t users = " + list, null, 2, null);
                InterfaceC14725a.C0808a.a(j12.f189839v, messageListInconsistentStateException, null, 6);
                X2.f318778a.j(j12.f189841x, "Typing event handler error", messageListInconsistentStateException);
            }
        } else {
            MessageListInconsistentStateException messageListInconsistentStateException2 = new MessageListInconsistentStateException("Action.UsersStartedTyping arrived when context wasn't loaded", null, 2, null);
            InterfaceC14725a interfaceC14725a = j12.f189839v;
            f.a aVar3 = ((NY.h) aVar.getValue()).f11577b;
            if (aVar3 == null) {
                throw new NoWhenBranchMatchedException();
            }
            if (aVar3.equals(f.a.C0737a.f11547a)) {
                strF0 = "Empty";
            } else if (aVar3 instanceof f.a.d) {
                strF0 = C22026a.c(new StringBuilder("LoadingError("), com.avito.android.messenger.util.i.b(((f.a.d) aVar3).f11554a, new kotlin.Q[0]), ')');
            } else if (aVar3 instanceof f.a.c) {
                strF0 = C22026a.c(new StringBuilder("LoadedOnlyUserId("), com.avito.android.messenger.util.i.b(((f.a.c) aVar3).f11553a, new kotlin.Q[0]), ')');
            } else {
                if (!(aVar3 instanceof f.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                StringBuilder sb2 = new StringBuilder("Loaded(\n                        |   userInfo=(");
                f.a.b bVar2 = (f.a.b) aVar3;
                sb2.append(com.avito.android.messenger.util.i.b(bVar2.f11548a, new kotlin.Q[0]));
                sb2.append("),\n                        |   context=");
                sb2.append(bVar2.f11549b.getClass().getSimpleName());
                sb2.append(",\n                        |   users=(");
                sb2.append(bVar2.f11550c.size());
                sb2.append(")[add logging to see contents],\n                        |)");
                strF0 = C43066x.F0(sb2.toString());
            }
            InterfaceC14725a.C0808a.a(interfaceC14725a, messageListInconsistentStateException2, Collections.singletonMap("ctxState", strF0), 2);
            X2.f318778a.j(j12.f189841x, "Inconsistent state", messageListInconsistentStateException2);
        }
        return kotlin.G0.f406611a;
    }
}
