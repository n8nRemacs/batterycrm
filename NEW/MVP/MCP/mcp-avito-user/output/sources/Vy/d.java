package vY;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.master_plan.mvi.entity.LoadingState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import rY.C47614a;

/* compiled from: MasterPlanState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LvY/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f440839f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final d f440840g = new d(null, C42784z0.f406748b, LoadingState.f186068b, "");

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C49283b f440841b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<C47614a> f440842c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LoadingState f440843d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f440844e;

    /* compiled from: MasterPlanState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvY/d$a;", "", "<init>", "()V", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@l C49283b c49283b, @l List<C47614a> list, @k LoadingState loadingState, @k String str) {
        this.f440841b = c49283b;
        this.f440842c = list;
        this.f440843d = loadingState;
        this.f440844e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d a(d dVar, C49283b c49283b, ArrayList arrayList, LoadingState loadingState, String str, int i12) {
        if ((i12 & 1) != 0) {
            c49283b = dVar.f440841b;
        }
        List list = arrayList;
        if ((i12 & 2) != 0) {
            list = dVar.f440842c;
        }
        if ((i12 & 4) != 0) {
            loadingState = dVar.f440843d;
        }
        if ((i12 & 8) != 0) {
            str = dVar.f440844e;
        }
        dVar.getClass();
        return new d(c49283b, list, loadingState, str);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f440841b, dVar.f440841b) && L.f(this.f440842c, dVar.f440842c) && this.f440843d == dVar.f440843d && L.f(this.f440844e, dVar.f440844e);
    }

    public final int hashCode() {
        C49283b c49283b = this.f440841b;
        int iHashCode = (c49283b == null ? 0 : c49283b.hashCode()) * 31;
        List<C47614a> list = this.f440842c;
        return this.f440844e.hashCode() + ((this.f440843d.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MasterPlanState(masterPlanData=");
        sb2.append(this.f440841b);
        sb2.append(", buildingsInfo=");
        sb2.append(this.f440842c);
        sb2.append(", loadingState=");
        sb2.append(this.f440843d);
        sb2.append(", selectedBuildingId=");
        return C22026a.c(sb2, this.f440844e, ')');
    }
}
