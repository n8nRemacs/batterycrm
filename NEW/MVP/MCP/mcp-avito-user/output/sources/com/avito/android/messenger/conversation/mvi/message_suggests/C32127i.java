package com.avito.android.messenger.conversation.mvi.message_suggests;

import arrow.core.AbstractC23662a;
import com.avito.android.messenger.conversation.mvi.message_suggests.C32120b;
import com.avito.android.messenger.conversation.mvi.message_suggests.InterfaceC32119a;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggestsResponse;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MessageSuggestsInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/messenger/message_suggests/MessageSuggestsResponse;", "response", "Lkotlin/G0;", "apply", "(Lcom/avito/android/remote/model/messenger/message_suggests/MessageSuggestsResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.message_suggests.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32127i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32120b f191980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32120b.c f191981c;

    public C32127i(C32120b c32120b, C32120b.c cVar) {
        this.f191980b = c32120b;
        this.f191981c = cVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessageSuggestsResponse messageSuggestsResponse = (MessageSuggestsResponse) obj;
        C32120b c32120b = this.f191980b;
        com.jakewharton.rxrelay3.b<AbstractC23662a<Throwable, InterfaceC32119a.b>> bVar = c32120b.f191952g;
        String title = messageSuggestsResponse.getTitle();
        List<MessageSuggest> suggestList = messageSuggestsResponse.getSuggestList();
        boolean z12 = ((C32120b.c.C5675b) this.f191981c).f191970a;
        Boolean hideChatButtons = messageSuggestsResponse.getHideChatButtons();
        bVar.accept(new AbstractC23662a.c(new InterfaceC32119a.b(title, suggestList, z12, hideChatButtons != null ? hideChatButtons.booleanValue() : false)));
        c32120b.f191956k.set(false);
        return G0.f406611a;
    }
}
