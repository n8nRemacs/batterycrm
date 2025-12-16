package GE;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import wZ.j;

/* compiled from: FeesMethodsV2State.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LGE/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f6389g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final c f6390h = new c(null, false, C42784z0.f406748b, null, false);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final j f6391b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6392c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f6393d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Throwable f6394e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6395f;

    /* compiled from: FeesMethodsV2State.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGE/c$a;", "", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@l j jVar, boolean z12, @k List<? extends com.avito.conveyor_item.a> list, @l Throwable th2, boolean z13) {
        this.f6391b = jVar;
        this.f6392c = z12;
        this.f6393d = list;
        this.f6394e = th2;
        this.f6395f = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    public static c a(c cVar, j jVar, boolean z12, List list, ApiException apiException, boolean z13, int i12) {
        if ((i12 & 1) != 0) {
            jVar = cVar.f6391b;
        }
        j jVar2 = jVar;
        if ((i12 & 2) != 0) {
            z12 = cVar.f6392c;
        }
        boolean z14 = z12;
        if ((i12 & 4) != 0) {
            list = cVar.f6393d;
        }
        List list2 = list;
        ApiException apiException2 = apiException;
        if ((i12 & 8) != 0) {
            apiException2 = cVar.f6394e;
        }
        ApiException apiException3 = apiException2;
        if ((i12 & 16) != 0) {
            z13 = cVar.f6395f;
        }
        cVar.getClass();
        return new c(jVar2, z14, list2, apiException3, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f6391b, cVar.f6391b) && this.f6392c == cVar.f6392c && L.f(this.f6393d, cVar.f6393d) && L.f(this.f6394e, cVar.f6394e) && this.f6395f == cVar.f6395f;
    }

    public final int hashCode() {
        j jVar = this.f6391b;
        int iE2 = H.e(r.i((jVar == null ? 0 : jVar.hashCode()) * 31, 31, this.f6392c), 31, this.f6393d);
        Throwable th2 = this.f6394e;
        return Boolean.hashCode(this.f6395f) + ((iE2 + (th2 != null ? th2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeesMethodsV2State(navBar=");
        sb2.append(this.f6391b);
        sb2.append(", isClosable=");
        sb2.append(this.f6392c);
        sb2.append(", items=");
        sb2.append(this.f6393d);
        sb2.append(", error=");
        sb2.append(this.f6394e);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f6395f, ')');
    }
}
