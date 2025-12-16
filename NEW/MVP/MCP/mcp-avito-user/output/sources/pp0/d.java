package Pp0;

import Op0.C14723a;
import Y61.k;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.search.suggest.HistorySuggestItem;
import com.avito.android.remote.model.search.suggest.SuggestBubbleItem;
import com.avito.android.search.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SearchSuggestState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LPp0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class d extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f13322h = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f13323b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<l> f13324c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Q<C14723a, List<SuggestBubbleItem>> f13325d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final HistorySuggestItem f13326e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13327f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f13328g;

    /* compiled from: SearchSuggestState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPp0/d$a;", "", "<init>", "()V", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k String str, @k List<? extends l> list, @k Q<C14723a, ? extends List<SuggestBubbleItem>> q12, @k HistorySuggestItem historySuggestItem, boolean z12, @Y61.l String str2) {
        this.f13323b = str;
        this.f13324c = list;
        this.f13325d = q12;
        this.f13326e = historySuggestItem;
        this.f13327f = z12;
        this.f13328g = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d a(d dVar, String str, ArrayList arrayList, Q q12, HistorySuggestItem historySuggestItem, boolean z12, String str2, int i12) {
        if ((i12 & 1) != 0) {
            str = dVar.f13323b;
        }
        String str3 = str;
        List list = arrayList;
        if ((i12 & 2) != 0) {
            list = dVar.f13324c;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            q12 = dVar.f13325d;
        }
        Q q13 = q12;
        if ((i12 & 8) != 0) {
            historySuggestItem = dVar.f13326e;
        }
        HistorySuggestItem historySuggestItem2 = historySuggestItem;
        if ((i12 & 16) != 0) {
            z12 = dVar.f13327f;
        }
        boolean z13 = z12;
        if ((i12 & 32) != 0) {
            str2 = dVar.f13328g;
        }
        dVar.getClass();
        return new d(str3, list2, q13, historySuggestItem2, z13, str2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f13323b, dVar.f13323b) && L.f(this.f13324c, dVar.f13324c) && L.f(this.f13325d, dVar.f13325d) && L.f(this.f13326e, dVar.f13326e) && this.f13327f == dVar.f13327f && L.f(this.f13328g, dVar.f13328g);
    }

    public final int hashCode() {
        int i12 = r.i((this.f13326e.hashCode() + ((this.f13325d.hashCode() + H.e(this.f13323b.hashCode() * 31, 31, this.f13324c)) * 31)) * 31, 31, this.f13327f);
        String str = this.f13328g;
        return i12 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchSuggestState(query=");
        sb2.append(this.f13323b);
        sb2.append(", searchItems=");
        sb2.append(this.f13324c);
        sb2.append(", bubbles=");
        sb2.append(this.f13325d);
        sb2.append(", history=");
        sb2.append(this.f13326e);
        sb2.append(", bubblesUsed=");
        sb2.append(this.f13327f);
        sb2.append(", xSgt=");
        return C22026a.c(sb2, this.f13328g, ')');
    }

    public d(String str, List list, Q q12, HistorySuggestItem historySuggestItem, boolean z12, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? new Q(new C14723a(), C42784z0.f406748b) : q12, (i12 & 8) != 0 ? new HistorySuggestItem(C42784z0.f406748b, 0) : historySuggestItem, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? null : str2);
    }
}
