package bM0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.vas_planning.remote.model.Action;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasPlanner.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LbM0/a;", "", "", "LbM0/c;", "list", "Lcom/avito/android/vas_planning/remote/model/Action;", "planningAdvantage", "", "title", "<init>", "(Ljava/util/List;Lcom/avito/android/vas_planning/remote/model/Action;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/vas_planning/remote/model/Action;", "b", "()Lcom/avito/android/vas_planning/remote/model/Action;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bM0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C25529a {

    @com.google.gson.annotations.c("list")
    @k
    private final List<C25531c> list;

    @com.google.gson.annotations.c("planningAdvantage")
    @l
    private final Action planningAdvantage;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C25529a(@k List<C25531c> list, @l Action action, @k String str) {
        this.list = list;
        this.planningAdvantage = action;
        this.title = str;
    }

    @k
    public final List<C25531c> a() {
        return this.list;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Action getPlanningAdvantage() {
        return this.planningAdvantage;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25529a)) {
            return false;
        }
        C25529a c25529a = (C25529a) obj;
        return L.f(this.list, c25529a.list) && L.f(this.planningAdvantage, c25529a.planningAdvantage) && L.f(this.title, c25529a.title);
    }

    public final int hashCode() {
        int iHashCode = this.list.hashCode() * 31;
        Action action = this.planningAdvantage;
        return this.title.hashCode() + ((iHashCode + (action == null ? 0 : action.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasPlanner(list=");
        sb2.append(this.list);
        sb2.append(", planningAdvantage=");
        sb2.append(this.planningAdvantage);
        sb2.append(", title=");
        return C22026a.c(sb2, this.title, ')');
    }
}
