package Mp;

import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AgentRoomGetDealByUuidApiResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"LMp/g;", "", "", "after", "LMp/h;", "afterWithIcon", "", "colors", "content", "<init>", "(Ljava/lang/String;LMp/h;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LMp/h;", "b", "()LMp/h;", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g {

    @com.google.gson.annotations.c("after")
    @Y61.l
    private final String after;

    @com.google.gson.annotations.c("afterWithIcon")
    @Y61.l
    private final h afterWithIcon;

    @com.google.gson.annotations.c("colors")
    @Y61.l
    private final List<String> colors;

    @com.google.gson.annotations.c("content")
    @Y61.l
    private final String content;

    public g(@Y61.l String str, @Y61.l h hVar, @Y61.l List<String> list, @Y61.l String str2) {
        this.after = str;
        this.afterWithIcon = hVar;
        this.colors = list;
        this.content = str2;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getAfter() {
        return this.after;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final h getAfterWithIcon() {
        return this.afterWithIcon;
    }

    @Y61.l
    public final List<String> c() {
        return this.colors;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getContent() {
        return this.content;
    }
}
