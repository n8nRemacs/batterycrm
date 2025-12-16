package com.avito.android.messenger_icebreakers_dialog.deeplink;

import com.avito.android.messenger_icebreakers_dialog.deeplink.a;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggestsResponse;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/messenger/message_suggests/MessageSuggestsResponse;", "it", "Lcom/avito/android/messenger_icebreakers_dialog/deeplink/a$a;", "apply", "(Lcom/avito/android/remote/model/messenger/message_suggests/MessageSuggestsResponse;)Lcom/avito/android/messenger_icebreakers_dialog/deeplink/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.C5819a f197585b;

    public c(a.C5819a c5819a) {
        this.f197585b = c5819a;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List<MessageSuggest> suggestList = ((MessageSuggestsResponse) obj).getSuggestList();
        a.C5819a c5819a = this.f197585b;
        return new a.C5819a(c5819a.f197576a, c5819a.f197577b, suggestList);
    }
}
