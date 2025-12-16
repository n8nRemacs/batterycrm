package SO0;

import SO0.d;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PaymentHistoryDetailsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LSO0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f14964d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final c f14965e = new c(b.C1013c.f14970a, d.c.f14980a);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f14966b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f14967c;

    /* compiled from: PaymentHistoryDetailsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSO0/c$a;", "", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PaymentHistoryDetailsState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LSO0/c$b;", "", "a", "b", "c", "d", "LSO0/c$b$a;", "LSO0/c$b$b;", "LSO0/c$b$c;", "LSO0/c$b$d;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: PaymentHistoryDetailsState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSO0/c$b$a;", "LSO0/c$b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final UO0.a f14968a;

            public a(@k UO0.a aVar) {
                this.f14968a = aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f14968a, ((a) obj).f14968a);
            }

            public final int hashCode() {
                return this.f14968a.hashCode();
            }

            @k
            public final String toString() {
                return "Details(operationDetails=" + this.f14968a + ')';
            }
        }

        /* compiled from: PaymentHistoryDetailsState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSO0/c$b$b;", "LSO0/c$b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: SO0.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C1012b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiException f14969a;

            public C1012b(@k ApiException apiException) {
                this.f14969a = apiException;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1012b) && this.f14969a.equals(((C1012b) obj).f14969a);
            }

            public final int hashCode() {
                return this.f14969a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.q(new StringBuilder("Error(error="), this.f14969a, ')');
            }
        }

        /* compiled from: PaymentHistoryDetailsState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSO0/c$b$c;", "LSO0/c$b;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: SO0.c$b$c, reason: collision with other inner class name */
        public static final /* data */ class C1013c implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C1013c f14970a = new C1013c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C1013c);
            }

            public final int hashCode() {
                return -2014579371;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: PaymentHistoryDetailsState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSO0/c$b$d;", "LSO0/c$b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f14971a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f14972b;

            public d(@k String str, @k String str2) {
                this.f14971a = str;
                this.f14972b = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return L.f(this.f14971a, dVar.f14971a) && L.f(this.f14972b, dVar.f14972b);
            }

            public final int hashCode() {
                return this.f14972b.hashCode() + (this.f14971a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Refund(amount=");
                sb2.append(this.f14971a);
                sb2.append(", subtitle=");
                return C22026a.c(sb2, this.f14972b, ')');
            }
        }
    }

    public c(@k b bVar, @k d dVar) {
        this.f14966b = bVar;
        this.f14967c = dVar;
    }

    public static c a(c cVar, b bVar, d dVar, int i12) {
        if ((i12 & 1) != 0) {
            bVar = cVar.f14966b;
        }
        if ((i12 & 2) != 0) {
            dVar = cVar.f14967c;
        }
        cVar.getClass();
        return new c(bVar, dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f14966b, cVar.f14966b) && L.f(this.f14967c, cVar.f14967c);
    }

    public final int hashCode() {
        return this.f14967c.hashCode() + (this.f14966b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "PaymentHistoryDetailsState(contentState=" + this.f14966b + ", viewState=" + this.f14967c + ')';
    }
}
