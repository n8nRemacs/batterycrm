package d91;

import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.generated.api.get_user_visible_messages.Message;

/* compiled from: GetUserVisibleMessagesResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ld91/i;", "", "", "hasMore", "", "Lru/avito/messenger/generated/api/get_user_visible_messages/Message;", "messages", "<init>", "(ZLjava/util/List;)V", "Z", "getHasMore", "()Z", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class i {

    @com.google.gson.annotations.c("hasMore")
    private final boolean hasMore;

    @com.google.gson.annotations.c("messages")
    @Y61.k
    private final List<Message> messages;

    public i(boolean z12, @Y61.k List<Message> list) {
        this.hasMore = z12;
        this.messages = list;
    }

    @Y61.k
    public final List<Message> a() {
        return this.messages;
    }
}
