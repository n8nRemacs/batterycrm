package d91;

import kotlin.Metadata;
import ru.avito.messenger.generated.api.get_user_visible_messages.BaseItemAction;
import ru.avito.messenger.generated.api.get_user_visible_messages.CallItemAction;
import ru.avito.messenger.generated.api.get_user_visible_messages.CallbackItemAction;

/* compiled from: GetUserVisibleMessagesResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ld91/m;", "", "Lru/avito/messenger/generated/api/get_user_visible_messages/CallItemAction;", "call", "Lru/avito/messenger/generated/api/get_user_visible_messages/CallbackItemAction;", "callback", "Lru/avito/messenger/generated/api/get_user_visible_messages/BaseItemAction;", "message", "<init>", "(Lru/avito/messenger/generated/api/get_user_visible_messages/CallItemAction;Lru/avito/messenger/generated/api/get_user_visible_messages/CallbackItemAction;Lru/avito/messenger/generated/api/get_user_visible_messages/BaseItemAction;)V", "Lru/avito/messenger/generated/api/get_user_visible_messages/CallItemAction;", "a", "()Lru/avito/messenger/generated/api/get_user_visible_messages/CallItemAction;", "Lru/avito/messenger/generated/api/get_user_visible_messages/CallbackItemAction;", "b", "()Lru/avito/messenger/generated/api/get_user_visible_messages/CallbackItemAction;", "Lru/avito/messenger/generated/api/get_user_visible_messages/BaseItemAction;", "c", "()Lru/avito/messenger/generated/api/get_user_visible_messages/BaseItemAction;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class m {

    @com.google.gson.annotations.c("call")
    @Y61.l
    private final CallItemAction call;

    @com.google.gson.annotations.c("callback")
    @Y61.l
    private final CallbackItemAction callback;

    @com.google.gson.annotations.c("message")
    @Y61.l
    private final BaseItemAction message;

    public m(@Y61.l CallItemAction callItemAction, @Y61.l CallbackItemAction callbackItemAction, @Y61.l BaseItemAction baseItemAction) {
        this.call = callItemAction;
        this.callback = callbackItemAction;
        this.message = baseItemAction;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final CallItemAction getCall() {
        return this.call;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final CallbackItemAction getCallback() {
        return this.callback;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final BaseItemAction getMessage() {
        return this.message;
    }
}
