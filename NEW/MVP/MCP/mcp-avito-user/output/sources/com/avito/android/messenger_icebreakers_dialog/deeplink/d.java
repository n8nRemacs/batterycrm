package com.avito.android.messenger_icebreakers_dialog.deeplink;

import com.avito.android.messenger_icebreakers_dialog.deeplink.a;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.Channel;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/deeplink/a$a;", "channelData", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lcom/avito/android/messenger_icebreakers_dialog/deeplink/a$a;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f197586b;

    public d(a aVar) {
        this.f197586b = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        a.C5819a c5819a = (a.C5819a) obj;
        a aVar = this.f197586b;
        Channel channel = c5819a.f197576a;
        String channelId = channel.getChannelId();
        ChatMessage lastMessage = channel.getLastMessage();
        return aVar.f197561j.getSellerSuggests(channelId, lastMessage != null ? lastMessage.getId() : null, null).r(new c(c5819a));
    }
}
