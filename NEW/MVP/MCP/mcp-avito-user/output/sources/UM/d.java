package um;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.campaigns_sale_search.mvi.entity.Filter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import um.e;
import um.g;

/* compiled from: CampaignsSaleSearchState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lum/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f440260h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final d f440261i = new d(null, null, null, null, null, null, 63, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f440262b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Filter f440263c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<List<String>> f440264d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f440265e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e f440266f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final g f440267g;

    /* compiled from: CampaignsSaleSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lum/d$a;", "", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d a(d dVar, String str, Filter filter, ArrayList arrayList, String str2, e eVar, g gVar, int i12) {
        if ((i12 & 1) != 0) {
            str = dVar.f440262b;
        }
        String str3 = str;
        if ((i12 & 2) != 0) {
            filter = dVar.f440263c;
        }
        Filter filter2 = filter;
        List list = arrayList;
        if ((i12 & 4) != 0) {
            list = dVar.f440264d;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            str2 = dVar.f440265e;
        }
        String str4 = str2;
        if ((i12 & 16) != 0) {
            eVar = dVar.f440266f;
        }
        e eVar2 = eVar;
        if ((i12 & 32) != 0) {
            gVar = dVar.f440267g;
        }
        dVar.getClass();
        return new d(str3, filter2, list2, str4, eVar2, gVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f440262b, dVar.f440262b) && this.f440263c == dVar.f440263c && L.f(this.f440264d, dVar.f440264d) && L.f(this.f440265e, dVar.f440265e) && L.f(this.f440266f, dVar.f440266f) && L.f(this.f440267g, dVar.f440267g);
    }

    public final int hashCode() {
        int iE2 = H.e((this.f440263c.hashCode() + (this.f440262b.hashCode() * 31)) * 31, 31, this.f440264d);
        String str = this.f440265e;
        return this.f440267g.hashCode() + ((this.f440266f.hashCode() + ((iE2 + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "CampaignsSaleSearchState(query=" + this.f440262b + ", filter=" + this.f440263c + ", itemIds=" + this.f440264d + ", previousQuery=" + this.f440265e + ", navigationState=" + this.f440266f + ", viewState=" + this.f440267g + ')';
    }

    public d(String str, Filter filter, List list, String str2, e eVar, g gVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? Filter.f114746d : filter, (i12 & 4) != 0 ? C42784z0.f406748b : list, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? e.a.f440268a : eVar, (i12 & 32) != 0 ? g.b.f440271a : gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k String str, @k Filter filter, @k List<? extends List<String>> list, @l String str2, @k e eVar, @k g gVar) {
        this.f440262b = str;
        this.f440263c = filter;
        this.f440264d = list;
        this.f440265e = str2;
        this.f440266f = eVar;
        this.f440267g = gVar;
    }
}
