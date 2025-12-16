package Zy0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.lib.design.input.Input;
import com.avito.android.str_insurance.InsuranceData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrInsuranceState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LZy0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f20606g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final c f20607h;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final InsuranceData f20608b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f20609c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Integer> f20610d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20611e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final d f20612f;

    /* compiled from: StrInsuranceState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZy0/c$a;", "", "<init>", "()V", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        Input.f179303W.getClass();
        f20607h = new c(null, null, C42756l.e0(Input.f179304a0), false, new d(C42784z0.f406748b, false));
    }

    public c(@l InsuranceData insuranceData, @l String str, @k List<Integer> list, boolean z12, @k d dVar) {
        this.f20608b = insuranceData;
        this.f20609c = str;
        this.f20610d = list;
        this.f20611e = z12;
        this.f20612f = dVar;
    }

    public static c a(c cVar, InsuranceData insuranceData, String str, List list, boolean z12, d dVar, int i12) {
        if ((i12 & 1) != 0) {
            insuranceData = cVar.f20608b;
        }
        InsuranceData insuranceData2 = insuranceData;
        if ((i12 & 2) != 0) {
            str = cVar.f20609c;
        }
        String str2 = str;
        if ((i12 & 4) != 0) {
            list = cVar.f20610d;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            z12 = cVar.f20611e;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            dVar = cVar.f20612f;
        }
        cVar.getClass();
        return new c(insuranceData2, str2, list2, z13, dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f20608b, cVar.f20608b) && L.f(this.f20609c, cVar.f20609c) && L.f(this.f20610d, cVar.f20610d) && this.f20611e == cVar.f20611e && L.f(this.f20612f, cVar.f20612f);
    }

    public final int hashCode() {
        InsuranceData insuranceData = this.f20608b;
        int iHashCode = (insuranceData == null ? 0 : insuranceData.hashCode()) * 31;
        String str = this.f20609c;
        return this.f20612f.hashCode() + r.i(H.e((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f20610d), 31, this.f20611e);
    }

    @k
    public final String toString() {
        return "StrInsuranceState(data=" + this.f20608b + ", flatNumber=" + this.f20609c + ", flatNumberState=" + this.f20610d + ", isLoading=" + this.f20611e + ", viewState=" + this.f20612f + ')';
    }
}
