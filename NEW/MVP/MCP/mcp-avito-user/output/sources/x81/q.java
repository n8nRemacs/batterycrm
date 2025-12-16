package X81;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ReadMessageEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LX81/q;", "LX81/v;", "", "channelId", "fromId", "", "timeStamp", "", "messageIds", "initActionTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/lang/Long;)V", "Ljava/lang/String;", "getChannelId", "()Ljava/lang/String;", "getFromId", "J", "c", "()J", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class q implements v {

    @com.google.gson.annotations.c("channelId")
    @Y61.k
    private final String channelId;

    @com.google.gson.annotations.c("fromUid")
    @Y61.k
    private final String fromId;

    @com.google.gson.annotations.c("initActionTimestamp")
    @Y61.l
    private final Long initActionTimestamp;

    @com.google.gson.annotations.c("ids")
    @Y61.k
    private final List<String> messageIds;

    @com.google.gson.annotations.c(CrashHianalyticsData.TIME)
    private final long timeStamp;

    public q(@Y61.k String str, @Y61.k String str2, long j12, @Y61.k List<String> list, @Y61.l Long l12) {
        this.channelId = str;
        this.fromId = str2;
        this.timeStamp = j12;
        this.messageIds = list;
        this.initActionTimestamp = l12;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getInitActionTimestamp() {
        return this.initActionTimestamp;
    }

    @Y61.k
    public final List<String> b() {
        return this.messageIds;
    }

    /* renamed from: c, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
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
