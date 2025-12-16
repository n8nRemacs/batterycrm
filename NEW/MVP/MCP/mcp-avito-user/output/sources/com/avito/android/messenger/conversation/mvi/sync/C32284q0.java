package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: MessageUpdateMerger.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "messagesFromDb", "apply", "(Ljava/util/List;)Ljava/util/List;", "com/avito/android/messenger/conversation/mvi/sync/s0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.q0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32284q0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f194843b;

    public C32284q0(C32282p0 c32282p0, List list) {
        this.f194843b = list;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        T next;
        LocalMessage localMessageCopy;
        List list = (List) obj;
        List<LocalMessage> list2 = this.f194843b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (LocalMessage localMessage : list2) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.L.f(((LocalMessage) next).getRemoteId(), localMessage.getRemoteId())) {
                    break;
                }
            }
            LocalMessage localMessage2 = next;
            if (localMessage2 != null && (localMessageCopy = localMessage.copy((253943 & 1) != 0 ? localMessage.localId : null, (253943 & 2) != 0 ? localMessage.remoteId : null, (253943 & 4) != 0 ? localMessage.channelId : null, (253943 & 8) != 0 ? localMessage.body : null, (253943 & 16) != 0 ? localMessage.userId : null, (253943 & 32) != 0 ? localMessage.fromId : null, (253943 & 64) != 0 ? localMessage.created : 0L, (253943 & 128) != 0 ? localMessage.isRead : false, (253943 & 256) != 0 ? localMessage.isFailed : false, (253943 & 512) != 0 ? localMessage.readTimestamp : null, (253943 & 1024) != 0 ? localMessage.preview : null, (253943 & 2048) != 0 ? localMessage.isSupported : false, (253943 & 4096) != 0 ? localMessage.readLocallyTimestamp : localMessage2.getReadLocallyTimestamp(), (253943 & 8192) != 0 ? localMessage.quote : null, (253943 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? localMessage.xHash : null, (253943 & 32768) != 0 ? localMessage.userType : null, (253943 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? localMessage.accountId : null, (253943 & 131072) != 0 ? localMessage.sendTimestamp : null)) != null) {
                localMessage = localMessageCopy;
            }
            arrayList.add(localMessage);
        }
        return arrayList;
    }
}
