package com.avito.android.messenger.search;

import com.avito.android.messenger.search.InterfaceC32569e;
import com.avito.android.messenger.search.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.Channel;
import ru.avito.messenger.api.entity.ChannelSearchItem;
import ru.avito.messenger.api.entity.ChannelsSearchResponse;
import ru.avito.messenger.api.entity.ChatMessage;
import shark.AndroidResourceIdNames;

/* compiled from: ChannelsSearchInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/api/entity/ChannelsSearchResponse;", "results", "Lcom/avito/android/messenger/search/e$b;", "apply", "(Lru/avito/messenger/api/entity/ChannelsSearchResponse;)Lcom/avito/android/messenger/search/e$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class l<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32569e.b f197164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.d f197165c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f197166d;

    public l(InterfaceC32569e.b bVar, h.d dVar, h hVar) {
        this.f197164b = bVar;
        this.f197165c = dVar;
        this.f197166d = hVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        ChannelsSearchResponse channelsSearchResponse = (ChannelsSearchResponse) obj;
        InterfaceC32569e.b bVar = this.f197164b;
        MessengerUserHashInfo f197134a = bVar.getF197134a();
        MessengerUserHashInfo f197135b = bVar.getF197135b();
        F f12 = this.f197165c.f197151d;
        List<ChannelSearchItem> items = channelsSearchResponse.getItems();
        ArrayList arrayList = new ArrayList(C42745f0.q(items, 10));
        for (ChannelSearchItem channelSearchItem : items) {
            MessengerUserHashInfo f197134a2 = bVar.getF197134a();
            com.avito.android.messenger.B b12 = this.f197166d.f197144W;
            Channel channel = channelSearchItem.getChannel();
            ChatMessage message = channelSearchItem.getMessage();
            if (message == null) {
                message = channelSearchItem.getChannel().getLastMessage();
            }
            com.avito.android.remote.model.messenger.Channel channelC = b12.c(f197134a2, channel.copy((524283 & 1) != 0 ? channel.channelId : null, (524283 & 2) != 0 ? channel.type : null, (524283 & 4) != 0 ? channel.lastMessage : message, (524283 & 8) != 0 ? channel.users : null, (524283 & 16) != 0 ? channel.created : 0L, (524283 & 32) != 0 ? channel.updated : 0L, (524283 & 64) != 0 ? channel.context : null, (524283 & 128) != 0 ? channel.readOnlyState : null, (524283 & 256) != 0 ? channel.isDeleted : null, (524283 & 512) != 0 ? channel.isRead : null, (524283 & 1024) != 0 ? channel.isSpam : null, (524283 & 2048) != 0 ? channel.isAnswered : null, (524283 & 4096) != 0 ? channel.tags : null, (524283 & 8192) != 0 ? channel.contextActions : null, (524283 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? channel.flow : null, (524283 & 32768) != 0 ? channel.suspectMessageId : null, (524283 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? channel.info : null, (524283 & 131072) != 0 ? channel.inputState : null, (524283 & 262144) != 0 ? channel.pinOrder : null));
            ChatMessage message2 = channelSearchItem.getMessage();
            arrayList.add(new InterfaceC32569e.a.C5803a(channelC, message2 != null ? message2.getId() : null));
        }
        return new InterfaceC32569e.b.c(f197134a, f197135b, f12, new InterfaceC32569e.a(arrayList, channelsSearchResponse.getHasMore()), InterfaceC32569e.b.d.C5805b.f197140a);
    }
}
