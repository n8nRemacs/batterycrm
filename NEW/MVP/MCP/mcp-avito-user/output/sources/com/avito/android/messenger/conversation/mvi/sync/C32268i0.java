package com.avito.android.messenger.conversation.mvi.sync;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: MessageSyncAgent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lru/avito/messenger/api/entity/ChatMessage;", "newMessages", "Lio/reactivex/rxjava3/core/E;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.i0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32268i0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f194782b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f194783c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f194784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P f194785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f194787g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Integer f194788h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f194789i;

    public C32268i0(AtomicBoolean atomicBoolean, int i12, AtomicBoolean atomicBoolean2, P p12, MessengerUserHashInfo messengerUserHashInfo, String str, Integer num, String str2) {
        this.f194782b = atomicBoolean;
        this.f194783c = i12;
        this.f194784d = atomicBoolean2;
        this.f194785e = p12;
        this.f194786f = messengerUserHashInfo;
        this.f194787g = str;
        this.f194788h = num;
        this.f194789i = str2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        T next;
        List list = (List) obj;
        List list2 = list;
        boolean z12 = list2 instanceof Collection;
        AtomicBoolean atomicBoolean = this.f194784d;
        AtomicBoolean atomicBoolean2 = this.f194782b;
        int i12 = this.f194783c;
        String str = this.f194789i;
        if (!z12 || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.L.f(((ChatMessage) it.next()).getId(), str)) {
                    atomicBoolean2.set(list.size() >= i12);
                    atomicBoolean.set(true);
                    return io.reactivex.rxjava3.core.z.c0(list);
                }
            }
        }
        if (list.size() < i12) {
            atomicBoolean2.set(false);
            return io.reactivex.rxjava3.core.z.c0(list);
        }
        Iterator<T> it2 = list2.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                long created = ((ChatMessage) next).getCreated();
                do {
                    T next2 = it2.next();
                    long created2 = ((ChatMessage) next2).getCreated();
                    if (created > created2) {
                        next = next2;
                        created = created2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = (T) null;
        }
        ChatMessage chatMessage = next;
        Long lValueOf = chatMessage != null ? Long.valueOf(chatMessage.getCreated()) : null;
        if (lValueOf != null) {
            return io.reactivex.rxjava3.core.z.p(this.f194785e.e(this.f194786f, this.f194787g, lValueOf.longValue() + 1, 4, this.f194788h, new C32264g0(str)).d0(new C32266h0(atomicBoolean2, atomicBoolean)), io.reactivex.rxjava3.core.z.c0(list));
        }
        atomicBoolean2.set(false);
        return io.reactivex.rxjava3.core.z.c0(list);
    }
}
