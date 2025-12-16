package com.avito.android.messenger.deeplink;

import com.avito.android.deep_linking.links.CreateChannelLink;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: CreateChannelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/api/entity/ChatMessage;", "it", "Lkotlin/G0;", "invoke", "(Lru/avito/messenger/api/entity/ChatMessage;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class L extends kotlin.jvm.internal.N implements Y41.l<ChatMessage, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f195361l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CreateChannelLink f195362m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(C c12, CreateChannelLink createChannelLink) {
        super(1);
        this.f195361l = c12;
        this.f195362m = createChannelLink;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(ChatMessage chatMessage) {
        this.f195361l.j(new CreateChannelLink.b.g(this.f195362m.f133130b));
        return kotlin.G0.f406611a;
    }
}
