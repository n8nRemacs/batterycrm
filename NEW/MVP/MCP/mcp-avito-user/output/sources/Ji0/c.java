package ji0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import ji0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import oi0.C44782a;

/* compiled from: LocationSuggestState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lji0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f405768f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final c f405769g = new c(null, "", null, d.b.f405775a);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f405770b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f405771c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C44782a f405772d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final d f405773e;

    /* compiled from: LocationSuggestState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lji0/c$a;", "", "<init>", "()V", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l String str, @k String str2, @l C44782a c44782a, @k d dVar) {
        this.f405770b = str;
        this.f405771c = str2;
        this.f405772d = c44782a;
        this.f405773e = dVar;
    }

    public static c a(c cVar, String str, String str2, C44782a c44782a, d dVar, int i12) {
        if ((i12 & 1) != 0) {
            str = cVar.f405770b;
        }
        if ((i12 & 2) != 0) {
            str2 = cVar.f405771c;
        }
        if ((i12 & 4) != 0) {
            c44782a = cVar.f405772d;
        }
        if ((i12 & 8) != 0) {
            dVar = cVar.f405773e;
        }
        cVar.getClass();
        return new c(str, str2, c44782a, dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f405770b, cVar.f405770b) && L.f(this.f405771c, cVar.f405771c) && L.f(this.f405772d, cVar.f405772d) && L.f(this.f405773e, cVar.f405773e);
    }

    public final int hashCode() {
        String str = this.f405770b;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f405771c);
        C44782a c44782a = this.f405772d;
        return this.f405773e.hashCode() + ((iD2 + (c44782a != null ? c44782a.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "LocationSuggestState(preselectedLocationId=" + this.f405770b + ", lastQueryString=" + this.f405771c + ", suggestLocationResponse=" + this.f405772d + ", viewState=" + this.f405773e + ')';
    }
}
