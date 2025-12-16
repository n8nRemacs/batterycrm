package fW0;

import com.avito.user_stats.model.extended_user_stats.UserMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommonStatsBasicIndicators.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LfW0/f;", "", "LfW0/s;", "funnel", "", "LfW0/j;", "counters", "LfW0/E;", "tabs", "LfW0/t;", "groupings", "Lcom/avito/user_stats/model/extended_user_stats/UserMessage;", "userMessage", "<init>", "(LfW0/s;Ljava/util/List;LfW0/E;Ljava/util/List;Lcom/avito/user_stats/model/extended_user_stats/UserMessage;)V", "LfW0/s;", "b", "()LfW0/s;", "Ljava/util/List;", "a", "()Ljava/util/List;", "LfW0/E;", "c", "()LfW0/E;", "getGroupings", "Lcom/avito/user_stats/model/extended_user_stats/UserMessage;", "d", "()Lcom/avito/user_stats/model/extended_user_stats/UserMessage;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class f {

    @com.google.gson.annotations.c("counters")
    @Y61.l
    private final List<j> counters;

    @com.google.gson.annotations.c("funnel")
    @Y61.l
    private final s funnel;

    @com.google.gson.annotations.c("groupings")
    @Y61.l
    private final List<t> groupings;

    @com.google.gson.annotations.c("tabs")
    @Y61.k
    private final E tabs;

    @com.google.gson.annotations.c("userMessage")
    @Y61.l
    private final UserMessage userMessage;

    public f(@Y61.l s sVar, @Y61.l List<j> list, @Y61.k E e12, @Y61.l List<t> list2, @Y61.l UserMessage userMessage) {
        this.funnel = sVar;
        this.counters = list;
        this.tabs = e12;
        this.groupings = list2;
        this.userMessage = userMessage;
    }

    @Y61.l
    public final List<j> a() {
        return this.counters;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final s getFunnel() {
        return this.funnel;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final E getTabs() {
        return this.tabs;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final UserMessage getUserMessage() {
        return this.userMessage;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.funnel, fVar.funnel) && L.f(this.counters, fVar.counters) && L.f(this.tabs, fVar.tabs) && L.f(this.groupings, fVar.groupings) && L.f(this.userMessage, fVar.userMessage);
    }

    public final int hashCode() {
        s sVar = this.funnel;
        int iHashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
        List<j> list = this.counters;
        int iHashCode2 = (this.tabs.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        List<t> list2 = this.groupings;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        UserMessage userMessage = this.userMessage;
        return iHashCode3 + (userMessage != null ? userMessage.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "CommonStatsBasicIndicators(funnel=" + this.funnel + ", counters=" + this.counters + ", tabs=" + this.tabs + ", groupings=" + this.groupings + ", userMessage=" + this.userMessage + ')';
    }
}
