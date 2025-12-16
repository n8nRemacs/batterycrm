package X81;

import com.avito.android.remote.model.messenger.context.ChannelContext;
import k91.C42544b;
import kotlin.Metadata;

/* compiled from: BlacklistInfo.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"LX81/a;", "LX81/h;", "", "ownerId", ChannelContext.Item.USER_ID, "", "created", "Lk91/b;", "context", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLk91/b;)V", "Ljava/lang/String;", "J", "Lk91/b;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a implements h {

    @X41.f
    @com.google.gson.annotations.c("context")
    @Y61.k
    public final C42544b context;

    @X41.f
    @com.google.gson.annotations.c("created")
    public final long created;

    @X41.f
    @com.google.gson.annotations.c("ownerId")
    @Y61.k
    public final String ownerId;

    @X41.f
    @com.google.gson.annotations.c(ChannelContext.Item.USER_ID)
    @Y61.k
    public final String userId;

    public a(@Y61.k String str, @Y61.k String str2, long j12, @Y61.k C42544b c42544b) {
        this.ownerId = str;
        this.userId = str2;
        this.created = j12;
        this.context = c42544b;
    }

    @Override // X81.h
    @Y61.k
    public final String getChannelId() {
        return "";
    }
}
