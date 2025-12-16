package Tb;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import mx0.InterfaceC44149a;

/* compiled from: ChatUpdateEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LTb/b;", "Lmx0/a;", "", "chatId", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class b implements InterfaceC44149a {

    @com.google.gson.annotations.c("chatId")
    @k
    private final String chatId;

    public b(@k String str) {
        this.chatId = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.chatId, ((b) obj).chatId);
    }

    public final int hashCode() {
        return this.chatId.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ChatUpdateEvent(chatId="), this.chatId, ')');
    }
}
