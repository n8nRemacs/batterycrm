package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import arrow.core.Y0;
import com.avito.android.C30277e1;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MessageListActorSubscriptions.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b20\u0010\u0007\u001a,\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000j\u0002`\u00040\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0000H\u008a@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/Q;", "", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "Lcom/avito/android/persistence/messenger/Q1;", "Lcom/avito/android/messenger/conversation/mvi/data/MessageAndMetaInfo;", "Larrow/core/Y0;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorSubscriptionsImpl$subscribeToMessageUpdates$6", f = "MessageListActorSubscriptions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class r0 extends SuspendLambda implements Y41.p<kotlin.Q<? extends List<? extends kotlin.Q<? extends LocalMessage, ? extends Q1>>, ? extends Y0<? extends Boolean>>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f190073q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ G0 f190074r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(G0 g02, Continuation<? super r0> continuation) {
        super(2, continuation);
        this.f190074r = g02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r0 r0Var = new r0(this.f190074r, continuation);
        r0Var.f190073q = obj;
        return r0Var;
    }

    @Override // Y41.p
    public final Object invoke(kotlin.Q<? extends List<? extends kotlin.Q<? extends LocalMessage, ? extends Q1>>, ? extends Y0<? extends Boolean>> q12, Continuation<? super kotlin.G0> continuation) {
        return ((r0) create(q12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        List list = (List) ((kotlin.Q) this.f190073q).f406619b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((LocalMessage) ((kotlin.Q) it.next()).f406619b);
        }
        G0 g02 = this.f190074r;
        C30277e1 c30277e1 = g02.f189787m;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[11];
        if (((Boolean) c30277e1.f145025m.a().invoke()).booleanValue()) {
            g02.f189781g.Cb(arrayList);
        }
        if (g02.f189787m.x().invoke().booleanValue()) {
            g02.f189782h.k9(arrayList);
        }
        return kotlin.G0.f406611a;
    }
}
