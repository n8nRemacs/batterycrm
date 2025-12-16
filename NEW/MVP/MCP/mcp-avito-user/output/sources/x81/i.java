package X81;

import kotlin.Metadata;

/* compiled from: ChatTypingEvent.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LX81/i;", "LX81/v;", "", "channelId", "fromId", "uid", "", "initActionTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "Ljava/lang/String;", "getChannelId", "()Ljava/lang/String;", "getFromId", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class i implements v {

    @com.google.gson.annotations.c("channelId")
    @Y61.k
    private final String channelId;

    @com.google.gson.annotations.c("fromUid")
    @Y61.k
    private final String fromId;

    @com.google.gson.annotations.c("initActionTimestamp")
    @Y61.l
    private final Long initActionTimestamp;

    @X41.f
    @com.google.gson.annotations.c("uid")
    @Y61.k
    public final String uid;

    public i(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l Long l12) {
        this.channelId = str;
        this.fromId = str2;
        this.uid = str3;
        this.initActionTimestamp = l12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getInitActionTimestamp() {
        return this.initActionTimestamp;
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
