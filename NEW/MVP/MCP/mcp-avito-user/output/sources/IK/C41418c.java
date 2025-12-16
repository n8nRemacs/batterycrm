package ik;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.beduin.v2.engine.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BrandspaceBeduinV2State.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lik/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ik.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C41418c extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f398709c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C41418c f398710d = new C41418c(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f398711b;

    /* compiled from: BrandspaceBeduinV2State.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lik/c$a;", "", "a", "b", "Lik/c$a$a;", "Lik/c$a$b;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ik.c$a */
    public interface a {

        /* compiled from: BrandspaceBeduinV2State.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/c$a$a;", "Lik/c$a;", "<init>", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ik.c$a$a, reason: collision with other inner class name */
        public static final /* data */ class C11391a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C11391a f398712a = new C11391a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C11391a);
            }

            public final int hashCode() {
                return 66403072;
            }

            @k
            public final String toString() {
                return "Blank";
            }
        }

        /* compiled from: BrandspaceBeduinV2State.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lik/c$a$b;", "Lik/c$a;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ik.c$a$b */
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final D f398713a;

            public b(@k D d12) {
                this.f398713a = d12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f398713a, ((b) obj).f398713a);
            }

            public final int hashCode() {
                return this.f398713a.hashCode();
            }

            @k
            public final String toString() {
                return "Content(rendererState=" + this.f398713a + ')';
            }
        }
    }

    /* compiled from: BrandspaceBeduinV2State.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/c$b;", "", "<init>", "()V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ik.c$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41418c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41418c) && L.f(this.f398711b, ((C41418c) obj).f398711b);
    }

    public final int hashCode() {
        return this.f398711b.hashCode();
    }

    @k
    public final String toString() {
        return "BrandspaceBeduinV2State(viewState=" + this.f398711b + ')';
    }

    public /* synthetic */ C41418c(a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? a.C11391a.f398712a : aVar);
    }

    public C41418c(@k a aVar) {
        this.f398711b = aVar;
    }
}
