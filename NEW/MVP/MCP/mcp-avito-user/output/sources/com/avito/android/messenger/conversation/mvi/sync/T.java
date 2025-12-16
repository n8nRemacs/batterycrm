package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.K;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: MessageSyncAgent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lru/avito/messenger/api/entity/ChatMessage;", "messages", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/Q;", "Lcom/avito/android/messenger/conversation/mvi/sync/K$b;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class T<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f194702b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<List<ChatMessage>, Boolean> f194703c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f194704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P f194705e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194706f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f194707g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Integer f194708h;

    /* JADX WARN: Multi-variable type inference failed */
    public T(int i12, Y41.l<? super List<ChatMessage>, Boolean> lVar, Integer num, P p12, MessengerUserHashInfo messengerUserHashInfo, String str, Integer num2) {
        this.f194702b = i12;
        this.f194703c = lVar;
        this.f194704d = num;
        this.f194705e = p12;
        this.f194706f = messengerUserHashInfo;
        this.f194707g = str;
        this.f194708h = num2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        T next;
        List<ChatMessage> list = (List) obj;
        boolean z12 = list.size() >= this.f194702b;
        if (this.f194703c.invoke(list).booleanValue()) {
            return io.reactivex.rxjava3.core.z.c0(new kotlin.Q(list, new K.b(z12, true)));
        }
        if (!z12) {
            return io.reactivex.rxjava3.core.z.c0(new kotlin.Q(list, new K.b(false, false)));
        }
        Integer num = this.f194704d;
        if (num != null && num.intValue() == 0) {
            return io.reactivex.rxjava3.core.z.c0(new kotlin.Q(list, new K.b(z12, false)));
        }
        Integer numValueOf = num != null ? Integer.valueOf(num.intValue() - 1) : null;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long created = ((ChatMessage) next).getCreated();
                do {
                    T next2 = it.next();
                    long created2 = ((ChatMessage) next2).getCreated();
                    if (created > created2) {
                        next = next2;
                        created = created2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = (T) null;
        }
        ChatMessage chatMessage = next;
        Long lValueOf = chatMessage != null ? Long.valueOf(chatMessage.getCreated()) : null;
        if (lValueOf == null || lValueOf.longValue() <= Long.MIN_VALUE) {
            return io.reactivex.rxjava3.core.z.c0(new kotlin.Q(list, new K.b(true, false)));
        }
        return io.reactivex.rxjava3.core.z.p(this.f194705e.e(this.f194706f, this.f194707g, lValueOf.longValue() + 1, numValueOf, this.f194708h, this.f194703c), io.reactivex.rxjava3.core.z.c0(new kotlin.Q(list, new K.b(true, false))));
    }
}
