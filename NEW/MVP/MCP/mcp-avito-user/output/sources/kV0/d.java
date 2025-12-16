package kv0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PortfolioProjectSellerState.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lkv0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "d", "Lkv0/d$b;", "Lkv0/d$c;", "Lkv0/d$d;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class d extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f413276b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C11764d f413277c = C11764d.f413280d;

    /* compiled from: PortfolioProjectSellerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkv0/d$a;", "", "<init>", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PortfolioProjectSellerState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkv0/d$b;", "Lkv0/d;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final e f413278d;

        public b(@k e eVar) {
            super(null);
            this.f413278d = eVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f413278d, ((b) obj).f413278d);
        }

        public final int hashCode() {
            return this.f413278d.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(projectSeller=" + this.f413278d + ')';
        }
    }

    /* compiled from: PortfolioProjectSellerState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkv0/d$c;", "Lkv0/d;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends d {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ApiError f413279d;

        public c(@k ApiError apiError) {
            super(null);
            this.f413279d = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f413279d, ((c) obj).f413279d);
        }

        public final int hashCode() {
            return this.f413279d.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(error="), this.f413279d, ')');
        }
    }

    /* compiled from: PortfolioProjectSellerState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkv0/d$d;", "Lkv0/d;", "<init>", "()V", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kv0.d$d, reason: collision with other inner class name */
    public static final /* data */ class C11764d extends d {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final C11764d f413280d = new C11764d();

        public C11764d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11764d);
        }

        public final int hashCode() {
            return -886576688;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ d(C42822w c42822w) {
        this();
    }

    public d() {
    }
}
