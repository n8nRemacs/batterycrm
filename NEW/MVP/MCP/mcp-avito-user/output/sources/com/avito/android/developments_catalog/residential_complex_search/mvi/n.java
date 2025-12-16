package com.avito.android.developments_catalog.residential_complex_search.mvi;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ResidentialComplexState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/mvi/n;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class n extends q {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f139225g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final n f139226h;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f139227b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ApiError f139228c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f139229d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f139230e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final o f139231f;

    /* compiled from: ResidentialComplexState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/mvi/n$a;", "", "<init>", "()V", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        o.f139232b.getClass();
        f139226h = new n(false, null, false, null, o.f139233c, 15, null);
    }

    public n(boolean z12, @Y61.l ApiError apiError, boolean z13, @Y61.k String str, @Y61.k o oVar) {
        this.f139227b = z12;
        this.f139228c = apiError;
        this.f139229d = z13;
        this.f139230e = str;
        this.f139231f = oVar;
    }

    public static n a(n nVar, boolean z12, ApiError apiError, String str, o oVar, int i12) {
        boolean z13 = (i12 & 4) != 0 ? nVar.f139229d : true;
        if ((i12 & 8) != 0) {
            str = nVar.f139230e;
        }
        String str2 = str;
        if ((i12 & 16) != 0) {
            oVar = nVar.f139231f;
        }
        nVar.getClass();
        return new n(z12, apiError, z13, str2, oVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f139227b == nVar.f139227b && L.f(this.f139228c, nVar.f139228c) && this.f139229d == nVar.f139229d && L.f(this.f139230e, nVar.f139230e) && L.f(this.f139231f, nVar.f139231f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f139227b) * 31;
        ApiError apiError = this.f139228c;
        return this.f139231f.hashCode() + H.d(r.i((iHashCode + (apiError == null ? 0 : apiError.hashCode())) * 31, 31, this.f139229d), 31, this.f139230e);
    }

    @Y61.k
    public final String toString() {
        return "ResidentialComplexState(isLoading=" + this.f139227b + ", errorMessage=" + this.f139228c + ", clearButtonVisible=" + this.f139229d + ", searchText=" + this.f139230e + ", listState=" + this.f139231f + ')';
    }

    public /* synthetic */ n(boolean z12, ApiError apiError, boolean z13, String str, o oVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : apiError, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? "" : str, oVar);
    }
}
