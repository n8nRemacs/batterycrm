package com.avito.android.app.task;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: PendingMessageHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "localMessages", "Larrow/core/Y0;", "apply", "(Ljava/util/List;)Larrow/core/Y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class S0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f91516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f91517c;

    /* JADX WARN: Multi-variable type inference failed */
    public S0(MessengerUserHashInfo messengerUserHashInfo, Y41.l<? super MessageBody, Boolean> lVar) {
        this.f91516b = messengerUserHashInfo;
        this.f91517c = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // l41.o
    public final Object apply(Object obj) {
        Object next;
        Iterator<T> it = ((List) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            LocalMessage localMessage = (LocalMessage) next;
            if (com.avito.android.messenger.util.i.c(localMessage).equals(this.f91516b)) {
                if (((Boolean) this.f91517c.invoke(localMessage.getBody())).booleanValue()) {
                    break;
                }
            }
        }
        return arrow.core.Z0.b(next);
    }
}
