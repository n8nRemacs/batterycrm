package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.avito.messenger.api.entity.Channel;

/* compiled from: ChannelsListInconsistencyTracker.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lru/avito/messenger/api/entity/Channel;", "channels", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class W<T> implements l41.g {
    @Override // l41.g
    public final void accept(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (T t12 : (List) obj) {
            if (((Channel) t12).getLastMessage() == null) {
                arrayList.add(t12);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String strO = C42745f0.O(arrayList, ", ", null, null, U.f188392l, 30);
        V2.f318762a.g("ChannelSyncAgent", "Channels with empty last messages: [" + strO + ']');
        C42745f0.O(C42745f0.E0(arrayList, 10), ", ", null, null, V.f188410l, 30);
        throw null;
    }
}
