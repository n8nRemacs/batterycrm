package Mp;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: AgentRoomGetDealByUuidApiResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LMp/m;", "", "", "additionalCount", "count", "", "title", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m {

    @com.google.gson.annotations.c("additionalCount")
    @Y61.l
    private final Long additionalCount;

    @com.google.gson.annotations.c("count")
    @Y61.l
    private final Long count;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    public m(@Y61.l Long l12, @Y61.l Long l13, @Y61.l String str) {
        this.additionalCount = l12;
        this.count = l13;
        this.title = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getAdditionalCount() {
        return this.additionalCount;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Long getCount() {
        return this.count;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
