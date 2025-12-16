package Rq;

import Sq.j;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LRq/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f14690e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final d f14691f = new d(false, null, null, 7, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14692b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final b f14693c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final j f14694d;

    /* compiled from: ComparisonState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRq/d$a;", "", "<init>", "()V", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ComparisonState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/d$b;", "", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f14695a;

        public b(@k String str) {
            this.f14695a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f14695a, ((b) obj).f14695a);
        }

        public final int hashCode() {
            return this.f14695a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OverlayError(message="), this.f14695a, ')');
        }
    }

    public d() {
        this(false, null, null, 7, null);
    }

    public static d a(d dVar, b bVar, int i12) {
        if ((i12 & 2) != 0) {
            bVar = dVar.f14693c;
        }
        j jVar = dVar.f14694d;
        dVar.getClass();
        return new d(false, bVar, jVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f14692b == dVar.f14692b && L.f(this.f14693c, dVar.f14693c) && L.f(this.f14694d, dVar.f14694d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f14692b) * 31;
        b bVar = this.f14693c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.f14695a.hashCode())) * 31;
        j jVar = this.f14694d;
        return iHashCode2 + (jVar != null ? jVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ComparisonState(isLoadInProgress=" + this.f14692b + ", overlayError=" + this.f14693c + ", comparisonItems=" + this.f14694d + ')';
    }

    public /* synthetic */ d(boolean z12, b bVar, j jVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : bVar, (i12 & 4) != 0 ? null : jVar);
    }

    public d(boolean z12, @l b bVar, @l j jVar) {
        this.f14692b = z12;
        this.f14693c = bVar;
        this.f14694d = jVar;
    }
}
