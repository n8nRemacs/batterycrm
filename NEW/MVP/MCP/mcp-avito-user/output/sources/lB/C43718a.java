package lb;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.advert_stats.remote.model.detail_stats.AdvertStatTab;
import com.avito.android.advert_stats.remote.model.detail_stats.TransitionStats;
import com.avito.android.remote.model.Action;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DetailAdvertStatistics.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003BE\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Llb/a;", "Landroid/os/Parcelable;", "T", "", "", "Lcom/avito/android/advert_stats/remote/model/detail_stats/AdvertStatTab;", "tabs", "Lcom/avito/android/remote/model/Action;", "action", "extraAction", "spendings", "Lcom/avito/android/advert_stats/remote/model/detail_stats/TransitionStats;", "transition", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/Action;Lcom/avito/android/remote/model/Action;Landroid/os/Parcelable;Lcom/avito/android/advert_stats/remote/model/detail_stats/TransitionStats;)V", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/avito/android/remote/model/Action;", "a", "()Lcom/avito/android/remote/model/Action;", "b", "Landroid/os/Parcelable;", "c", "()Landroid/os/Parcelable;", "Lcom/avito/android/advert_stats/remote/model/detail_stats/TransitionStats;", "e", "()Lcom/avito/android/advert_stats/remote/model/detail_stats/TransitionStats;", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lb.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C43718a<T extends Parcelable> {

    @c("action")
    @l
    private final Action action;

    @c("extraAction")
    @l
    private final Action extraAction;

    @c("spendings")
    @l
    private final T spendings;

    @c("tabs")
    @k
    private final List<AdvertStatTab> tabs;

    @c("transition")
    @l
    private final TransitionStats transition;

    public C43718a(@k List<AdvertStatTab> list, @l Action action, @l Action action2, @l T t12, @l TransitionStats transitionStats) {
        this.tabs = list;
        this.action = action;
        this.extraAction = action2;
        this.spendings = t12;
        this.transition = transitionStats;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Action getExtraAction() {
        return this.extraAction;
    }

    @l
    public final T c() {
        return this.spendings;
    }

    @k
    public final List<AdvertStatTab> d() {
        return this.tabs;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final TransitionStats getTransition() {
        return this.transition;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43718a)) {
            return false;
        }
        C43718a c43718a = (C43718a) obj;
        return L.f(this.tabs, c43718a.tabs) && L.f(this.action, c43718a.action) && L.f(this.extraAction, c43718a.extraAction) && L.f(this.spendings, c43718a.spendings) && L.f(this.transition, c43718a.transition);
    }

    public final int hashCode() {
        int iHashCode = this.tabs.hashCode() * 31;
        Action action = this.action;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        Action action2 = this.extraAction;
        int iHashCode3 = (iHashCode2 + (action2 == null ? 0 : action2.hashCode())) * 31;
        T t12 = this.spendings;
        int iHashCode4 = (iHashCode3 + (t12 == null ? 0 : t12.hashCode())) * 31;
        TransitionStats transitionStats = this.transition;
        return iHashCode4 + (transitionStats != null ? transitionStats.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "DetailAdvertStatistics(tabs=" + this.tabs + ", action=" + this.action + ", extraAction=" + this.extraAction + ", spendings=" + this.spendings + ", transition=" + this.transition + ')';
    }

    public /* synthetic */ C43718a(List list, Action action, Action action2, Parcelable parcelable, TransitionStats transitionStats, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : action, (i12 & 4) != 0 ? null : action2, (i12 & 8) != 0 ? null : parcelable, (i12 & 16) != 0 ? null : transitionStats);
    }
}
