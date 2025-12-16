package com.avito.android.messenger_icebreakers_dialog.deeplink;

import com.avito.android.messenger_icebreakers_dialog.deeplink.a;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.Channel;

/* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/api/entity/Channel;", "channel", "Lcom/avito/android/messenger_icebreakers_dialog/deeplink/a$a;", "apply", "(Lru/avito/messenger/api/entity/Channel;)Lcom/avito/android/messenger_icebreakers_dialog/deeplink/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class b<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f197584b;

    public b(MessengerUserHashInfo messengerUserHashInfo) {
        this.f197584b = messengerUserHashInfo;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new a.C5819a((Channel) obj, this.f197584b.f430682d, null);
    }
}
