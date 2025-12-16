package fW0;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsDynamics.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LfW0/B;", "", "LfW0/v;", "legend", "LfW0/b;", "chart", "LfW0/E;", "tabs", "", "LfW0/t;", "groupings", "<init>", "(LfW0/v;LfW0/b;LfW0/E;Ljava/util/List;)V", "LfW0/v;", "getLegend", "()LfW0/v;", "LfW0/b;", "getChart", "()LfW0/b;", "LfW0/E;", "getTabs", "()LfW0/E;", "Ljava/util/List;", "getGroupings", "()Ljava/util/List;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fW0.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40346B {

    @com.google.gson.annotations.c("chart")
    @Y61.l
    private final C40349b chart;

    @com.google.gson.annotations.c("groupings")
    @Y61.k
    private final List<t> groupings;

    @com.google.gson.annotations.c("legend")
    @Y61.l
    private final v legend;

    @com.google.gson.annotations.c("tabs")
    @Y61.k
    private final E tabs;

    public C40346B(@Y61.l v vVar, @Y61.l C40349b c40349b, @Y61.k E e12, @Y61.k List<t> list) {
        this.legend = vVar;
        this.chart = c40349b;
        this.tabs = e12;
        this.groupings = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40346B)) {
            return false;
        }
        C40346B c40346b = (C40346B) obj;
        return L.f(this.legend, c40346b.legend) && L.f(this.chart, c40346b.chart) && L.f(this.tabs, c40346b.tabs) && L.f(this.groupings, c40346b.groupings);
    }

    public final int hashCode() {
        v vVar = this.legend;
        int iHashCode = (vVar == null ? 0 : vVar.hashCode()) * 31;
        C40349b c40349b = this.chart;
        return this.groupings.hashCode() + ((this.tabs.hashCode() + ((iHashCode + (c40349b != null ? c40349b.hashCode() : 0)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatsDynamics(legend=");
        sb2.append(this.legend);
        sb2.append(", chart=");
        sb2.append(this.chart);
        sb2.append(", tabs=");
        sb2.append(this.tabs);
        sb2.append(", groupings=");
        return H.p(sb2, this.groupings, ')');
    }
}
