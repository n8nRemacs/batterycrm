package hQ0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.beduin.v2.engine.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AboutMeState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LhQ0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hQ0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40868c extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f397195c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C40868c f397196d = new C40868c(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f397197b;

    /* compiled from: AboutMeState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LhQ0/c$a;", "", "a", "b", "c", "LhQ0/c$a$a;", "LhQ0/c$a$b;", "LhQ0/c$a$c;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hQ0.c$a */
    public interface a {

        /* compiled from: AboutMeState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhQ0/c$a$a;", "LhQ0/c$a;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: hQ0.c$a$a, reason: collision with other inner class name */
        public static final class C11257a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final D f397198a;

            public C11257a(@k D d12) {
                this.f397198a = d12;
            }
        }

        /* compiled from: AboutMeState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhQ0/c$a$b;", "LhQ0/c$a;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: hQ0.c$a$b */
        public static final class b implements a {
        }

        /* compiled from: AboutMeState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhQ0/c$a$c;", "LhQ0/c$a;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: hQ0.c$a$c, reason: collision with other inner class name */
        public static final class C11258c implements a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f397199a;

            public C11258c() {
                this(false, 1, null);
            }

            public C11258c(boolean z12) {
                this.f397199a = z12;
            }

            public /* synthetic */ C11258c(boolean z12, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? true : z12);
            }
        }
    }

    /* compiled from: AboutMeState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LhQ0/c$b;", "", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: hQ0.c$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C40868c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40868c) && L.f(this.f397197b, ((C40868c) obj).f397197b);
    }

    public final int hashCode() {
        return this.f397197b.hashCode();
    }

    @k
    public final String toString() {
        return "AboutMeState(viewState=" + this.f397197b + ')';
    }

    public /* synthetic */ C40868c(a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new a.C11258c(false, 1, null) : aVar);
    }

    public C40868c(@k a aVar) {
        this.f397197b = aVar;
    }
}
