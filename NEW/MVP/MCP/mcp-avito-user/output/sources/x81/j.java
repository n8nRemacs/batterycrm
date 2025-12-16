package X81;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MessagesMarkedAsSpamEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LX81/j;", "LX81/h;", "", "channelId", "", "messageIds", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getChannelId", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class j implements h {

    @com.google.gson.annotations.c("channelId")
    @Y61.k
    private final String channelId;

    @com.google.gson.annotations.c("messageIds")
    @Y61.k
    private final List<String> messageIds;

    public j(@Y61.k String str, @Y61.k List<String> list) {
        this.channelId = str;
        this.messageIds = list;
    }

    @Y61.k
    public final List<String> a() {
        return this.messageIds;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.channelId, jVar.channelId) && L.f(this.messageIds, jVar.messageIds);
    }

    @Override // X81.h
    @Y61.k
    public final String getChannelId() {
        return this.channelId;
    }

    public final int hashCode() {
        return this.messageIds.hashCode() + (this.channelId.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessagesMarkedAsSpamEvent(channelId=");
        sb2.append(this.channelId);
        sb2.append(", messageIds=");
        return H.p(sb2, this.messageIds, ')');
    }
}
