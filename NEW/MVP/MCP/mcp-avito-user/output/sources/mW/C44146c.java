package mw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.developments_advice.remote.model.CallInterval;
import com.avito.android.remote.model.ConsultationFormData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DevelopmentsAdviceState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lmw/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mw.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C44146c extends q {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f414817l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final C44146c f414818m = new C44146c(false, null, "", null, C42784z0.f406748b, null, null, null, false, Boolean.FALSE);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f414819b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ConsultationFormData f414820c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f414821d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f414822e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<String> f414823f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f414824g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final CallInterval f414825h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final List<CallInterval> f414826i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f414827j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Boolean f414828k;

    /* compiled from: DevelopmentsAdviceState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmw/c$a;", "", "<init>", "()V", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mw.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C44146c(boolean z12, @l ConsultationFormData consultationFormData, @k String str, @l String str2, @k List<String> list, @l String str3, @l CallInterval callInterval, @l List<CallInterval> list2, boolean z13, @l Boolean bool) {
        this.f414819b = z12;
        this.f414820c = consultationFormData;
        this.f414821d = str;
        this.f414822e = str2;
        this.f414823f = list;
        this.f414824g = str3;
        this.f414825h = callInterval;
        this.f414826i = list2;
        this.f414827j = z13;
        this.f414828k = bool;
    }

    public static C44146c a(C44146c c44146c, ConsultationFormData consultationFormData, String str, String str2, List list, String str3, CallInterval callInterval, List list2, boolean z12, Boolean bool, int i12) {
        boolean z13 = (i12 & 1) != 0 ? c44146c.f414819b : true;
        ConsultationFormData consultationFormData2 = (i12 & 2) != 0 ? c44146c.f414820c : consultationFormData;
        String str4 = (i12 & 4) != 0 ? c44146c.f414821d : str;
        String str5 = (i12 & 8) != 0 ? c44146c.f414822e : str2;
        List list3 = (i12 & 16) != 0 ? c44146c.f414823f : list;
        String str6 = (i12 & 32) != 0 ? c44146c.f414824g : str3;
        CallInterval callInterval2 = (i12 & 64) != 0 ? c44146c.f414825h : callInterval;
        List list4 = (i12 & 128) != 0 ? c44146c.f414826i : list2;
        boolean z14 = (i12 & 256) != 0 ? c44146c.f414827j : z12;
        Boolean bool2 = (i12 & 512) != 0 ? c44146c.f414828k : bool;
        c44146c.getClass();
        return new C44146c(z13, consultationFormData2, str4, str5, list3, str6, callInterval2, list4, z14, bool2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44146c)) {
            return false;
        }
        C44146c c44146c = (C44146c) obj;
        return this.f414819b == c44146c.f414819b && L.f(this.f414820c, c44146c.f414820c) && L.f(this.f414821d, c44146c.f414821d) && L.f(this.f414822e, c44146c.f414822e) && L.f(this.f414823f, c44146c.f414823f) && L.f(this.f414824g, c44146c.f414824g) && L.f(this.f414825h, c44146c.f414825h) && L.f(this.f414826i, c44146c.f414826i) && this.f414827j == c44146c.f414827j && L.f(this.f414828k, c44146c.f414828k);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f414819b) * 31;
        ConsultationFormData consultationFormData = this.f414820c;
        int iD2 = H.d((iHashCode + (consultationFormData == null ? 0 : consultationFormData.hashCode())) * 31, 31, this.f414821d);
        String str = this.f414822e;
        int iE2 = H.e((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f414823f);
        String str2 = this.f414824g;
        int iHashCode2 = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CallInterval callInterval = this.f414825h;
        int iHashCode3 = (iHashCode2 + (callInterval == null ? 0 : callInterval.hashCode())) * 31;
        List<CallInterval> list = this.f414826i;
        int i12 = r.i((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f414827j);
        Boolean bool = this.f414828k;
        return i12 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DevelopmentsAdviceState(initialDataLoaded=");
        sb2.append(this.f414819b);
        sb2.append(", formData=");
        sb2.append(this.f414820c);
        sb2.append(", name=");
        sb2.append(this.f414821d);
        sb2.append(", phone=");
        sb2.append(this.f414822e);
        sb2.append(", availablePhones=");
        sb2.append(this.f414823f);
        sb2.append(", question=");
        sb2.append(this.f414824g);
        sb2.append(", selectedInterval=");
        sb2.append(this.f414825h);
        sb2.append(", callIntervals=");
        sb2.append(this.f414826i);
        sb2.append(", isLoading=");
        sb2.append(this.f414827j);
        sb2.append(", chooseCallbackTime=");
        return C0.g(sb2, this.f414828k, ')');
    }
}
