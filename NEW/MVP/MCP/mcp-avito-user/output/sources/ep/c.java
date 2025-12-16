package Ep;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.comfortable_deal.api.model.CalculationInfo;
import com.avito.android.comfortable_deal.api.model.DealIncome;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DealState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LEp/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f4324i = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f4325b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f4326c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f4327d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f4328e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DealIncome f4329f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final CalculationInfo f4330g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final d f4331h;

    /* compiled from: DealState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEp/c$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l String str, @l String str2, @l String str3, @l String str4, @l DealIncome dealIncome, @l CalculationInfo calculationInfo, @k d dVar) {
        this.f4325b = str;
        this.f4326c = str2;
        this.f4327d = str3;
        this.f4328e = str4;
        this.f4329f = dealIncome;
        this.f4330g = calculationInfo;
        this.f4331h = dVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f4325b, cVar.f4325b) && L.f(this.f4326c, cVar.f4326c) && L.f(this.f4327d, cVar.f4327d) && L.f(this.f4328e, cVar.f4328e) && L.f(this.f4329f, cVar.f4329f) && L.f(this.f4330g, cVar.f4330g) && L.f(this.f4331h, cVar.f4331h);
    }

    public final int hashCode() {
        String str = this.f4325b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f4326c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4327d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f4328e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DealIncome dealIncome = this.f4329f;
        int iHashCode5 = (iHashCode4 + (dealIncome == null ? 0 : dealIncome.hashCode())) * 31;
        CalculationInfo calculationInfo = this.f4330g;
        return this.f4331h.hashCode() + ((iHashCode5 + (calculationInfo != null ? calculationInfo.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "DealState(dealId=" + this.f4325b + ", agentId=" + this.f4326c + ", agencyId=" + this.f4327d + ", itemId=" + this.f4328e + ", dealIncome=" + this.f4329f + ", calculationInfo=" + this.f4330g + ", viewState=" + this.f4331h + ')';
    }
}
