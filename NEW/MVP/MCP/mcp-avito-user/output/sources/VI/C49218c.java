package vI;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import uI.C48901b;
import uI.C48904e;

/* compiled from: HistoricalSuggestsState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LvI/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vI.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C49218c extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f440658h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final C49218c f440659i = new C49218c(null, null, null, false, false, true);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<C48904e> f440660b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C48901b f440661c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AddressParameter.Value f440662d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f440663e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f440664f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f440665g;

    /* compiled from: HistoricalSuggestsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvI/c$a;", "", "<init>", "()V", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vI.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C49218c(@l List<C48904e> list, @l C48901b c48901b, @l AddressParameter.Value value, boolean z12, boolean z13, boolean z14) {
        this.f440660b = list;
        this.f440661c = c48901b;
        this.f440662d = value;
        this.f440663e = z12;
        this.f440664f = z13;
        this.f440665g = z14;
    }

    public static C49218c a(C49218c c49218c, List list, C48901b c48901b, AddressParameter.Value value, boolean z12, boolean z13, boolean z14, int i12) {
        if ((i12 & 1) != 0) {
            list = c49218c.f440660b;
        }
        List list2 = list;
        if ((i12 & 2) != 0) {
            c48901b = c49218c.f440661c;
        }
        C48901b c48901b2 = c48901b;
        if ((i12 & 4) != 0) {
            value = c49218c.f440662d;
        }
        AddressParameter.Value value2 = value;
        if ((i12 & 8) != 0) {
            z12 = c49218c.f440663e;
        }
        boolean z15 = z12;
        if ((i12 & 16) != 0) {
            z13 = c49218c.f440664f;
        }
        boolean z16 = z13;
        if ((i12 & 32) != 0) {
            z14 = c49218c.f440665g;
        }
        c49218c.getClass();
        return new C49218c(list2, c48901b2, value2, z15, z16, z14);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49218c)) {
            return false;
        }
        C49218c c49218c = (C49218c) obj;
        return L.f(this.f440660b, c49218c.f440660b) && L.f(this.f440661c, c49218c.f440661c) && L.f(this.f440662d, c49218c.f440662d) && this.f440663e == c49218c.f440663e && this.f440664f == c49218c.f440664f && this.f440665g == c49218c.f440665g;
    }

    public final int hashCode() {
        List<C48904e> list = this.f440660b;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        C48901b c48901b = this.f440661c;
        int iHashCode2 = (iHashCode + (c48901b == null ? 0 : c48901b.hashCode())) * 31;
        AddressParameter.Value value = this.f440662d;
        return Boolean.hashCode(this.f440665g) + r.i(r.i((iHashCode2 + (value != null ? value.hashCode() : 0)) * 31, 31, this.f440663e), 31, this.f440664f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HistoricalSuggestsState(blocks=");
        sb2.append(this.f440660b);
        sb2.append(", selectedSuggest=");
        sb2.append(this.f440661c);
        sb2.append(", addressInput=");
        sb2.append(this.f440662d);
        sb2.append(", isLoading=");
        sb2.append(this.f440663e);
        sb2.append(", isError=");
        sb2.append(this.f440664f);
        sb2.append(", showUi=");
        return r.x(sb2, this.f440665g, ')');
    }
}
