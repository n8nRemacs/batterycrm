package bM0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.vas_planning.remote.model.Action;
import com.avito.android.vas_planning.remote.model.Balance;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasPlannerResult.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"LbM0/f;", "", "Lcom/avito/android/vas_planning/remote/model/Action;", "action", "", "attention", "", "Lcom/avito/android/vas_planning/remote/model/Balance;", "balance", "title", "<init>", "(Lcom/avito/android/vas_planning/remote/model/Action;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Lcom/avito/android/vas_planning/remote/model/Action;", "a", "()Lcom/avito/android/vas_planning/remote/model/Action;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class f {

    @com.google.gson.annotations.c("action")
    @l
    private final Action action;

    @com.google.gson.annotations.c("attention")
    @k
    private final String attention;

    @com.google.gson.annotations.c("balance")
    @k
    private final List<Balance> balance;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public f(@l Action action, @k String str, @k List<Balance> list, @k String str2) {
        this.action = action;
        this.attention = str;
        this.balance = list;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getAttention() {
        return this.attention;
    }

    @k
    public final List<Balance> c() {
        return this.balance;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.action, fVar.action) && L.f(this.attention, fVar.attention) && L.f(this.balance, fVar.balance) && L.f(this.title, fVar.title);
    }

    public final int hashCode() {
        Action action = this.action;
        return this.title.hashCode() + H.e(H.d((action == null ? 0 : action.hashCode()) * 31, 31, this.attention), 31, this.balance);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Warning(action=");
        sb2.append(this.action);
        sb2.append(", attention=");
        sb2.append(this.attention);
        sb2.append(", balance=");
        sb2.append(this.balance);
        sb2.append(", title=");
        return C22026a.c(sb2, this.title, ')');
    }
}
