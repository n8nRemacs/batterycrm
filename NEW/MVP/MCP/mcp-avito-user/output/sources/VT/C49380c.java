package vt;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.user_profile.Phone;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JsxCvActualizationPhoneSelectState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvt/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vt.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C49380c extends q {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f441032b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f441033c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Phone> f441034d;

    public C49380c() {
        this(false, false, null, 7, null);
    }

    public static C49380c a(C49380c c49380c, boolean z12, boolean z13, List list, int i12) {
        if ((i12 & 2) != 0) {
            z13 = c49380c.f441033c;
        }
        if ((i12 & 4) != 0) {
            list = c49380c.f441034d;
        }
        c49380c.getClass();
        return new C49380c(list, z12, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49380c)) {
            return false;
        }
        C49380c c49380c = (C49380c) obj;
        return this.f441032b == c49380c.f441032b && this.f441033c == c49380c.f441033c && L.f(this.f441034d, c49380c.f441034d);
    }

    public final int hashCode() {
        return this.f441034d.hashCode() + r.i(Boolean.hashCode(this.f441032b) * 31, 31, this.f441033c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JsxCvActualizationPhoneSelectState(isLoading=");
        sb2.append(this.f441032b);
        sb2.append(", isError=");
        sb2.append(this.f441033c);
        sb2.append(", phones=");
        return H.p(sb2, this.f441034d, ')');
    }

    public C49380c(@k List list, boolean z12, boolean z13) {
        this.f441032b = z12;
        this.f441033c = z13;
        this.f441034d = list;
    }

    public C49380c(boolean z12, boolean z13, List list, int i12, C42822w c42822w) {
        this((i12 & 4) != 0 ? C42784z0.f406748b : list, (i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? false : z13);
    }
}
