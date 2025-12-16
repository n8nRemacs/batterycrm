package com.avito.android.messenger.notification;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;

/* compiled from: UnreadMsgNotificationHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "msg", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/messenger/message/LocalMessage;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class a<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f196916b;

    public a(c cVar) {
        this.f196916b = cVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        LocalMessage localMessage = (LocalMessage) obj;
        Long readLocallyTimestamp = localMessage.getReadLocallyTimestamp();
        if (readLocallyTimestamp != null) {
            this.f196916b.f196919b.a(readLocallyTimestamp.longValue(), localMessage.getChannelId());
        }
    }
}
