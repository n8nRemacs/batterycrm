package SZ;

import SZ.d;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.mortgage.api.model.ApplicationsItemModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationsListState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LSZ/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f15060d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final c f15061e = new c(null, d.c.f15068a);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<ApplicationsItemModel> f15062b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f15063c;

    /* compiled from: ApplicationsListState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSZ/c$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l List<ApplicationsItemModel> list, @k d dVar) {
        this.f15062b = list;
        this.f15063c = dVar;
    }

    public static c a(c cVar, d dVar) {
        List<ApplicationsItemModel> list = cVar.f15062b;
        cVar.getClass();
        return new c(list, dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f15062b, cVar.f15062b) && L.f(this.f15063c, cVar.f15063c);
    }

    public final int hashCode() {
        List<ApplicationsItemModel> list = this.f15062b;
        return this.f15063c.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    @k
    public final String toString() {
        return "ApplicationsListState(applications=" + this.f15062b + ", viewState=" + this.f15063c + ')';
    }
}
