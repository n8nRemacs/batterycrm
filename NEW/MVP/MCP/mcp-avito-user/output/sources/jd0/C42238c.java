package jD0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.util.ApiException;
import kD0.C42572a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConstructorLandingState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LjD0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jD0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C42238c extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f405518e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C42238c f405519f = new C42238c(true, null, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f405520b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C42572a f405521c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ApiException f405522d;

    /* compiled from: ConstructorLandingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjD0/c$a;", "", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jD0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C42238c(boolean z12, @l C42572a c42572a, @l ApiException apiException) {
        this.f405520b = z12;
        this.f405521c = c42572a;
        this.f405522d = apiException;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42238c)) {
            return false;
        }
        C42238c c42238c = (C42238c) obj;
        return this.f405520b == c42238c.f405520b && L.f(this.f405521c, c42238c.f405521c) && L.f(this.f405522d, c42238c.f405522d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f405520b) * 31;
        C42572a c42572a = this.f405521c;
        int iHashCode2 = (iHashCode + (c42572a == null ? 0 : c42572a.hashCode())) * 31;
        ApiException apiException = this.f405522d;
        return iHashCode2 + (apiException != null ? apiException.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConstructorLandingState(isLoading=");
        sb2.append(this.f405520b);
        sb2.append(", data=");
        sb2.append(this.f405521c);
        sb2.append(", error=");
        return AK.c.q(sb2, this.f405522d, ')');
    }
}
