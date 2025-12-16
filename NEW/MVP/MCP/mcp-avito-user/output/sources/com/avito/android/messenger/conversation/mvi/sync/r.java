package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.C32275m;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.Quote;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: MessageAndQuoteBodyResolver.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010!\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012.\u0010\u0005\u001a*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0004*\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0001¢\u0006\u0002\b\u00030\u0000¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "Lcom/avito/android/messenger/conversation/mvi/sync/m$b;", "Lj41/e;", "kotlin.jvm.PlatformType", "it", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "apply", "(Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class r<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32275m f194844b;

    public r(C32275m c32275m) {
        this.f194844b = c32275m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        LocalMessage localMessageCopy;
        T next;
        T next2;
        ArrayList arrayListH = C42745f0.H((List) obj);
        this.f194844b.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayListH.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            Integer numValueOf = Integer.valueOf(((C32275m.b) next3).f194815a);
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(next3);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            List list = (List) ((Map.Entry) it2.next()).getValue();
            List list2 = list;
            Iterator<T> it3 = list2.iterator();
            while (true) {
                localMessageCopy = null;
                localMessageCopy = null;
                if (!it3.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it3.next();
                if (!((C32275m.b) next).f194816b) {
                    break;
                }
            }
            C32275m.b bVar = next;
            Iterator<T> it4 = list2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next2 = (T) null;
                    break;
                }
                next2 = it4.next();
                if (((C32275m.b) next2).f194816b) {
                    break;
                }
            }
            C32275m.b bVar2 = next2;
            C32275m.b bVar3 = (C32275m.b) C42745f0.G(list);
            LocalMessage localMessage = bVar3 != null ? bVar3.f194818d : null;
            if (localMessage != null) {
                if (bVar != null && bVar2 != null) {
                    Quote quote = localMessage.getQuote();
                    localMessageCopy = localMessage.copy((253943 & 1) != 0 ? localMessage.localId : null, (253943 & 2) != 0 ? localMessage.remoteId : null, (253943 & 4) != 0 ? localMessage.channelId : null, (253943 & 8) != 0 ? localMessage.body : bVar.f194817c, (253943 & 16) != 0 ? localMessage.userId : null, (253943 & 32) != 0 ? localMessage.fromId : null, (253943 & 64) != 0 ? localMessage.created : 0L, (253943 & 128) != 0 ? localMessage.isRead : false, (253943 & 256) != 0 ? localMessage.isFailed : false, (253943 & 512) != 0 ? localMessage.readTimestamp : null, (253943 & 1024) != 0 ? localMessage.preview : null, (253943 & 2048) != 0 ? localMessage.isSupported : false, (253943 & 4096) != 0 ? localMessage.readLocallyTimestamp : null, (253943 & 8192) != 0 ? localMessage.quote : quote != null ? Quote.copy$default(quote, null, bVar2.f194817c, 0L, null, null, 29, null) : null, (253943 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? localMessage.xHash : null, (253943 & 32768) != 0 ? localMessage.userType : null, (253943 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? localMessage.accountId : null, (253943 & 131072) != 0 ? localMessage.sendTimestamp : null);
                } else if (bVar != null) {
                    localMessageCopy = localMessage.copy((253943 & 1) != 0 ? localMessage.localId : null, (253943 & 2) != 0 ? localMessage.remoteId : null, (253943 & 4) != 0 ? localMessage.channelId : null, (253943 & 8) != 0 ? localMessage.body : bVar.f194817c, (253943 & 16) != 0 ? localMessage.userId : null, (253943 & 32) != 0 ? localMessage.fromId : null, (253943 & 64) != 0 ? localMessage.created : 0L, (253943 & 128) != 0 ? localMessage.isRead : false, (253943 & 256) != 0 ? localMessage.isFailed : false, (253943 & 512) != 0 ? localMessage.readTimestamp : null, (253943 & 1024) != 0 ? localMessage.preview : null, (253943 & 2048) != 0 ? localMessage.isSupported : false, (253943 & 4096) != 0 ? localMessage.readLocallyTimestamp : null, (253943 & 8192) != 0 ? localMessage.quote : null, (253943 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? localMessage.xHash : null, (253943 & 32768) != 0 ? localMessage.userType : null, (253943 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? localMessage.accountId : null, (253943 & 131072) != 0 ? localMessage.sendTimestamp : null);
                } else if (bVar2 != null) {
                    Quote quote2 = localMessage.getQuote();
                    localMessageCopy = localMessage.copy((253943 & 1) != 0 ? localMessage.localId : null, (253943 & 2) != 0 ? localMessage.remoteId : null, (253943 & 4) != 0 ? localMessage.channelId : null, (253943 & 8) != 0 ? localMessage.body : null, (253943 & 16) != 0 ? localMessage.userId : null, (253943 & 32) != 0 ? localMessage.fromId : null, (253943 & 64) != 0 ? localMessage.created : 0L, (253943 & 128) != 0 ? localMessage.isRead : false, (253943 & 256) != 0 ? localMessage.isFailed : false, (253943 & 512) != 0 ? localMessage.readTimestamp : null, (253943 & 1024) != 0 ? localMessage.preview : null, (253943 & 2048) != 0 ? localMessage.isSupported : false, (253943 & 4096) != 0 ? localMessage.readLocallyTimestamp : null, (253943 & 8192) != 0 ? localMessage.quote : quote2 != null ? Quote.copy$default(quote2, null, bVar2.f194817c, 0L, null, null, 29, null) : null, (253943 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? localMessage.xHash : null, (253943 & 32768) != 0 ? localMessage.userType : null, (253943 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? localMessage.accountId : null, (253943 & 131072) != 0 ? localMessage.sendTimestamp : null);
                }
            }
            if (localMessageCopy != null) {
                arrayList2.add(localMessageCopy);
            }
        }
        return arrayList2;
    }
}
