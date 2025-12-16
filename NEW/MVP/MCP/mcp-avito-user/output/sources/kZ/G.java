package KZ;

import java.util.List;
import kotlin.Metadata;

/* compiled from: ApplicationTeamItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LKZ/G;", "LKZ/p;", "", "id", "title", "", "LKZ/I;", "members", "LKZ/H;", "manager", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LKZ/H;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "d", "Ljava/util/List;", "c", "()Ljava/util/List;", "LKZ/H;", "b", "()LKZ/H;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class G implements InterfaceC14286p {

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("manager")
    @Y61.l
    private final H manager;

    @com.google.gson.annotations.c("members")
    @Y61.k
    private final List<I> members;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public G(@Y61.k String str, @Y61.k String str2, @Y61.k List<I> list, @Y61.l H h12) {
        this.id = str;
        this.title = str2;
        this.members = list;
        this.manager = h12;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final H getManager() {
        return this.manager;
    }

    @Y61.k
    public final List<I> c() {
        return this.members;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g12 = (G) obj;
        return kotlin.jvm.internal.L.f(this.id, g12.id) && kotlin.jvm.internal.L.f(this.title, g12.title) && kotlin.jvm.internal.L.f(this.members, g12.members) && kotlin.jvm.internal.L.f(this.manager, g12.manager);
    }

    public final int hashCode() {
        int iE2 = androidx.compose.foundation.H.e(androidx.compose.foundation.H.d(this.id.hashCode() * 31, 31, this.title), 31, this.members);
        H h12 = this.manager;
        return iE2 + (h12 == null ? 0 : h12.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "ApplicationTeamItemValue(id=" + this.id + ", title=" + this.title + ", members=" + this.members + ", manager=" + this.manager + ')';
    }
}
