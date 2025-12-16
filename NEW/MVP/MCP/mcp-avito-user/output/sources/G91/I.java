package g91;

import kotlin.Metadata;
import ru.avito.messenger.generated.api.send_text_message.DomainError;
import ru.avito.messenger.generated.api.send_text_message.Message;

/* compiled from: SendTextMessageResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lg91/I;", "", "Lru/avito/messenger/generated/api/send_text_message/DomainError;", "error", "Lru/avito/messenger/generated/api/send_text_message/Message;", "message", "<init>", "(Lru/avito/messenger/generated/api/send_text_message/DomainError;Lru/avito/messenger/generated/api/send_text_message/Message;)V", "Lru/avito/messenger/generated/api/send_text_message/DomainError;", "a", "()Lru/avito/messenger/generated/api/send_text_message/DomainError;", "Lru/avito/messenger/generated/api/send_text_message/Message;", "b", "()Lru/avito/messenger/generated/api/send_text_message/Message;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class I {

    @com.google.gson.annotations.c("error")
    @Y61.l
    private final DomainError error;

    @com.google.gson.annotations.c("message")
    @Y61.l
    private final Message message;

    public I(@Y61.l DomainError domainError, @Y61.l Message message) {
        this.error = domainError;
        this.message = message;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final DomainError getError() {
        return this.error;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }
}
