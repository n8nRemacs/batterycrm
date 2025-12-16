package com.avito.android.messenger_icebreakers_dialog.deeplink;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/api/entity/ChatMessage;", "it", "Lkotlin/G0;", "invoke", "(Lru/avito/messenger/api/entity/ChatMessage;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class j extends N implements Y41.l<ChatMessage, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f197599l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MessengerIcebreakerDialogDeeplink f197600m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D8.c f197601n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink, D8.c cVar) {
        super(1);
        this.f197599l = aVar;
        this.f197600m = messengerIcebreakerDialogDeeplink;
        this.f197601n = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(ChatMessage chatMessage) {
        a.k(this.f197599l, this.f197600m, this.f197601n);
        return G0.f406611a;
    }
}
