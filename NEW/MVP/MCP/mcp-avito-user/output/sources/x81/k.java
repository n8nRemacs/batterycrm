package X81;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MessagesUnmarkedAsSpamEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LX81/k;", "LX81/h;", "", "channelId", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getChannelId", "()Ljava/lang/String;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class k implements h {

    @com.google.gson.annotations.c("channelId")
    @Y61.k
    private final String channelId;

    public k(@Y61.k String str) {
        this.channelId = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && L.f(this.channelId, ((k) obj).channelId);
    }

    @Override // X81.h
    @Y61.k
    public final String getChannelId() {
        return this.channelId;
    }

    public final int hashCode() {
        return this.channelId.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("MessagesUnmarkedAsSpamEvent(channelId="), this.channelId, ')');
    }
}
