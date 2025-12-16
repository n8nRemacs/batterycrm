package fW0;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommonStatsBasicIndicators.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LfW0/j;", "", "", "slug", "LfW0/C;", "summary", "", "LfW0/l;", "details", "LfW0/q;", "extra", "<init>", "(Ljava/lang/String;LfW0/C;Ljava/util/List;LfW0/q;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "LfW0/C;", "d", "()LfW0/C;", "Ljava/util/List;", "a", "()Ljava/util/List;", "LfW0/q;", "b", "()LfW0/q;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class j {

    @com.google.gson.annotations.c("details")
    @Y61.l
    private final List<l> details;

    @com.google.gson.annotations.c("extra")
    @Y61.l
    private final q extra;

    @com.google.gson.annotations.c("slug")
    @Y61.k
    private final String slug;

    @com.google.gson.annotations.c("summary")
    @Y61.k
    private final C40347C summary;

    public j(@Y61.k String str, @Y61.k C40347C c40347c, @Y61.l List<l> list, @Y61.l q qVar) {
        this.slug = str;
        this.summary = c40347c;
        this.details = list;
        this.extra = qVar;
    }

    @Y61.l
    public final List<l> a() {
        return this.details;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final q getExtra() {
        return this.extra;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getSlug() {
        return this.slug;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final C40347C getSummary() {
        return this.summary;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.slug, jVar.slug) && L.f(this.summary, jVar.summary) && L.f(this.details, jVar.details) && L.f(this.extra, jVar.extra);
    }

    public final int hashCode() {
        int iHashCode = (this.summary.hashCode() + (this.slug.hashCode() * 31)) * 31;
        List<l> list = this.details;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        q qVar = this.extra;
        return iHashCode2 + (qVar != null ? qVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "Counter(slug=" + this.slug + ", summary=" + this.summary + ", details=" + this.details + ", extra=" + this.extra + ')';
    }
}
