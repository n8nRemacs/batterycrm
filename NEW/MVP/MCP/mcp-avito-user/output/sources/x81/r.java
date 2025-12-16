package X81;

import kotlin.Metadata;

/* compiled from: UnpinnedChatEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LX81/r;", "LX81/v;", "", "channelId", "fromId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getChannelId", "()Ljava/lang/String;", "getFromId", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class r implements v {

    @com.google.gson.annotations.c("channelId")
    @Y61.k
    private final String channelId;

    @com.google.gson.annotations.c("uid")
    @Y61.k
    private final String fromId;

    public r(@Y61.k String str, @Y61.k String str2) {
        this.channelId = str;
        this.fromId = str2;
    }

    @Override // X81.h
    @Y61.k
    public final String getChannelId() {
        return this.channelId;
    }

    @Override // X81.v
    @Y61.k
    public final String getFromId() {
        return this.fromId;
    }
}
