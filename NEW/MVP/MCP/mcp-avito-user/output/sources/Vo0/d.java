package VO0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PaymentHistoryState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LVO0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f17122e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final d f17123f = new d(C42784z0.f406748b, null, b.c.f17129a);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f17124b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f17125c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f17126d;

    /* compiled from: PaymentHistoryState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVO0/d$a;", "", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PaymentHistoryState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LVO0/d$b;", "", "a", "b", "c", "LVO0/d$b$a;", "LVO0/d$b$b;", "LVO0/d$b$c;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: PaymentHistoryState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVO0/d$b$a;", "LVO0/d$b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiException f17127a;

            public a(@k ApiException apiException) {
                this.f17127a = apiException;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f17127a.equals(((a) obj).f17127a);
            }

            public final int hashCode() {
                return this.f17127a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.q(new StringBuilder("Error(error="), this.f17127a, ')');
            }
        }

        /* compiled from: PaymentHistoryState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVO0/d$b$b;", "LVO0/d$b;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: VO0.d$b$b, reason: collision with other inner class name */
        public static final /* data */ class C1179b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C1179b f17128a = new C1179b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C1179b);
            }

            public final int hashCode() {
                return 1218861619;
            }

            @k
            public final String toString() {
                return "Loaded";
            }
        }

        /* compiled from: PaymentHistoryState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVO0/d$b$c;", "LVO0/d$b;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f17129a = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -869991218;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }
    }

    public d(@k List<? extends VO0.b> list, @l String str, @k b bVar) {
        this.f17124b = list;
        this.f17125c = str;
        this.f17126d = bVar;
    }

    public static d a(d dVar, List list, b bVar, int i12) {
        String str = dVar.f17125c;
        if ((i12 & 4) != 0) {
            bVar = dVar.f17126d;
        }
        dVar.getClass();
        return new d(list, str, bVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f17124b, dVar.f17124b) && L.f(this.f17125c, dVar.f17125c) && L.f(this.f17126d, dVar.f17126d);
    }

    public final int hashCode() {
        int iHashCode = this.f17124b.hashCode() * 31;
        String str = this.f17125c;
        return this.f17126d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "PaymentHistoryState(items=" + this.f17124b + ", nextPageKey=" + this.f17125c + ", initialLoadState=" + this.f17126d + ')';
    }
}
