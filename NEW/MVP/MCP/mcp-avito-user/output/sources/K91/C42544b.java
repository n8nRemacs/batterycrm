package k91;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BlacklistContext.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lk91/b;", "", "", "itemId", "channelId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k91.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* data */ class C42544b {

    @com.google.gson.annotations.c("channelId")
    @k
    private final String channelId;

    @com.google.gson.annotations.c("itemId")
    @k
    private final String itemId;

    public C42544b(@k String str, @k String str2) {
        this.itemId = str;
        this.channelId = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42544b)) {
            return false;
        }
        C42544b c42544b = (C42544b) obj;
        return L.f(this.itemId, c42544b.itemId) && L.f(this.channelId, c42544b.channelId);
    }

    public final int hashCode() {
        return this.channelId.hashCode() + (this.itemId.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlacklistContext(itemId=");
        sb2.append(this.itemId);
        sb2.append(", channelId=");
        return C22026a.c(sb2, this.channelId, ')');
    }
}
