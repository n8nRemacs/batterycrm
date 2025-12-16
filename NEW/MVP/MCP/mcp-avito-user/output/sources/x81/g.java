package X81;

import kotlin.Metadata;

/* compiled from: ChatClearEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LX81/g;", "LX81/h;", "", "uid", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getChannelId", "()Ljava/lang/String;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class g implements h {

    @com.google.gson.annotations.c("channelId")
    @Y61.k
    private final String channelId;

    @X41.f
    @com.google.gson.annotations.c("uid")
    @Y61.k
    public final String uid;

    public g(@Y61.k String str, @Y61.k String str2) {
        this.uid = str;
        this.channelId = str2;
    }

    @Override // X81.h
    @Y61.k
    public final String getChannelId() {
        return this.channelId;
    }
}
