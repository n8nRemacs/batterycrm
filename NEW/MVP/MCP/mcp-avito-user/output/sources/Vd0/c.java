package VD0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import wZ.C49578b;

/* compiled from: TariffLfPublicationRegionState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LVD0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f17018h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final c f17019i = new c(true, null, C42784z0.f406748b, null, false, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17020b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Throwable f17021c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f17022d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C49578b f17023e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17024f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f17025g;

    /* compiled from: TariffLfPublicationRegionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVD0/c$a;", "", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(boolean z12, @l Throwable th2, @k List<? extends com.avito.conveyor_item.a> list, @l C49578b c49578b, boolean z13, @l String str) {
        this.f17020b = z12;
        this.f17021c = th2;
        this.f17022d = list;
        this.f17023e = c49578b;
        this.f17024f = z13;
        this.f17025g = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Throwable] */
    public static c a(c cVar, boolean z12, ApiException apiException, List list, C49578b c49578b, boolean z13, String str, int i12) {
        if ((i12 & 1) != 0) {
            z12 = cVar.f17020b;
        }
        boolean z14 = z12;
        ApiException apiException2 = apiException;
        if ((i12 & 2) != 0) {
            apiException2 = cVar.f17021c;
        }
        ApiException apiException3 = apiException2;
        if ((i12 & 4) != 0) {
            list = cVar.f17022d;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            c49578b = cVar.f17023e;
        }
        C49578b c49578b2 = c49578b;
        if ((i12 & 16) != 0) {
            z13 = cVar.f17024f;
        }
        boolean z15 = z13;
        if ((i12 & 32) != 0) {
            str = cVar.f17025g;
        }
        cVar.getClass();
        return new c(z14, apiException3, list2, c49578b2, z15, str);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f17020b == cVar.f17020b && L.f(this.f17021c, cVar.f17021c) && L.f(this.f17022d, cVar.f17022d) && L.f(this.f17023e, cVar.f17023e) && this.f17024f == cVar.f17024f && L.f(this.f17025g, cVar.f17025g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f17020b) * 31;
        Throwable th2 = this.f17021c;
        int iE2 = H.e((iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31, 31, this.f17022d);
        C49578b c49578b = this.f17023e;
        int i12 = r.i((iE2 + (c49578b == null ? 0 : c49578b.hashCode())) * 31, 31, this.f17024f);
        String str = this.f17025g;
        return i12 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffLfPublicationRegionState(isLoading=");
        sb2.append(this.f17020b);
        sb2.append(", error=");
        sb2.append(this.f17021c);
        sb2.append(", items=");
        sb2.append(this.f17022d);
        sb2.append(", nextButton=");
        sb2.append(this.f17023e);
        sb2.append(", isNextButtonLoading=");
        sb2.append(this.f17024f);
        sb2.append(", regionId=");
        return C22026a.c(sb2, this.f17025g, ')');
    }
}
