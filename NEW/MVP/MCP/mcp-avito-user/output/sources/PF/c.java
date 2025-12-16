package Pf;

import Bf.C13142a;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaReportState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"LPf/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "LPf/c$b;", "LPf/c$c;", "LPf/c$d;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class c extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f13218c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C0858c f13219d = new C0858c(new com.avito.android.autoteka.items.skeleton.report.c(null, 1, null));

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.conveyor_item.a f13220b;

    /* compiled from: AutotekaReportState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPf/c$a;", "", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutotekaReportState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPf/c$b;", "LPf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: e, reason: collision with root package name */
        @k
        public final com.avito.android.autoteka.items.fullScreenError.report.c f13221e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final ApiError f13222f;

        public b(@k com.avito.android.autoteka.items.fullScreenError.report.c cVar, @k ApiError apiError) {
            super(cVar, null);
            this.f13221e = cVar;
            this.f13222f = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f13221e, bVar.f13221e) && L.f(this.f13222f, bVar.f13222f);
        }

        public final int hashCode() {
            return this.f13222f.hashCode() + (this.f13221e.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(reportErrorItem=");
            sb2.append(this.f13221e);
            sb2.append(", apiError=");
            return AK.c.n(sb2, this.f13222f, ')');
        }
    }

    /* compiled from: AutotekaReportState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPf/c$c;", "LPf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pf.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0858c extends c {

        /* renamed from: e, reason: collision with root package name */
        @k
        public final com.avito.android.autoteka.items.skeleton.report.c f13223e;

        public C0858c(@k com.avito.android.autoteka.items.skeleton.report.c cVar) {
            super(cVar, null);
            this.f13223e = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0858c) && L.f(this.f13223e, ((C0858c) obj).f13223e);
        }

        public final int hashCode() {
            return this.f13223e.hashCode();
        }

        @k
        public final String toString() {
            return "Loading(reportSkeletonItem=" + this.f13223e + ')';
        }
    }

    /* compiled from: AutotekaReportState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPf/c$d;", "LPf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* renamed from: e, reason: collision with root package name */
        @k
        public final C13142a f13224e;

        public d(@k C13142a c13142a) {
            super(c13142a, null);
            this.f13224e = c13142a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f13224e, ((d) obj).f13224e);
        }

        public final int hashCode() {
            return this.f13224e.hashCode();
        }

        @k
        public final String toString() {
            return "Success(reportItem=" + this.f13224e + ')';
        }
    }

    public c(com.avito.conveyor_item.a aVar, C42822w c42822w) {
        this.f13220b = aVar;
    }
}
