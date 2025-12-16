package dF;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FreemiumContactHistoryState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"LdF/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final b f393758g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final c f393759h = new c(true, null, new d("", "", ""), null, C42784z0.f406748b);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f393760b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ApiException f393761c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final d f393762d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final a f393763e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Object f393764f;

    /* compiled from: FreemiumContactHistoryState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdF/c$a;", "", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f393765a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f393766b;

        public a(@k String str, @k DeepLink deepLink) {
            this.f393765a = str;
            this.f393766b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f393765a, aVar.f393765a) && L.f(this.f393766b, aVar.f393766b);
        }

        public final int hashCode() {
            return this.f393766b.hashCode() + (this.f393765a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.f393765a);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f393766b, ')');
        }
    }

    /* compiled from: FreemiumContactHistoryState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LdF/c$b;", "", "<init>", "()V", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: FreemiumContactHistoryState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdF/c$c;", "", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dF.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11020c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f393767a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f393768b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f393769c;

        public C11020c(@k String str, @k String str2, @k String str3) {
            this.f393767a = str;
            this.f393768b = str2;
            this.f393769c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11020c)) {
                return false;
            }
            C11020c c11020c = (C11020c) obj;
            return L.f(this.f393767a, c11020c.f393767a) && L.f(this.f393768b, c11020c.f393768b) && L.f(this.f393769c, c11020c.f393769c);
        }

        public final int hashCode() {
            return this.f393769c.hashCode() + H.d(this.f393767a.hashCode() * 31, 31, this.f393768b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Event(title=");
            sb2.append(this.f393767a);
            sb2.append(", diff=");
            sb2.append(this.f393768b);
            sb2.append(", date=");
            return C22026a.c(sb2, this.f393769c, ')');
        }
    }

    /* compiled from: FreemiumContactHistoryState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdF/c$d;", "", "_avito_freemium_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f393770a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f393771b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f393772c;

        public d(@k String str, @k String str2, @k String str3) {
            this.f393770a = str;
            this.f393771b = str2;
            this.f393772c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f393770a, dVar.f393770a) && L.f(this.f393771b, dVar.f393771b) && L.f(this.f393772c, dVar.f393772c);
        }

        public final int hashCode() {
            return this.f393772c.hashCode() + H.d(this.f393770a.hashCode() * 31, 31, this.f393771b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Headers(title=");
            sb2.append(this.f393770a);
            sb2.append(", event=");
            sb2.append(this.f393771b);
            sb2.append(", diff=");
            return C22026a.c(sb2, this.f393772c, ')');
        }
    }

    public c(boolean z12, @l ApiException apiException, @k d dVar, @l a aVar, @k List list) {
        this.f393760b = z12;
        this.f393761c = apiException;
        this.f393762d = dVar;
        this.f393763e = aVar;
        this.f393764f = list;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public static c a(c cVar, boolean z12, ApiException apiException) {
        d dVar = cVar.f393762d;
        a aVar = cVar.f393763e;
        ?? r52 = cVar.f393764f;
        cVar.getClass();
        return new c(z12, apiException, dVar, aVar, r52);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f393760b == cVar.f393760b && L.f(this.f393761c, cVar.f393761c) && L.f(this.f393762d, cVar.f393762d) && L.f(this.f393763e, cVar.f393763e) && L.f(this.f393764f, cVar.f393764f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f393760b) * 31;
        ApiException apiException = this.f393761c;
        int iHashCode2 = (this.f393762d.hashCode() + ((iHashCode + (apiException == null ? 0 : apiException.hashCode())) * 31)) * 31;
        a aVar = this.f393763e;
        return this.f393764f.hashCode() + ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FreemiumContactHistoryState(isLoading=");
        sb2.append(this.f393760b);
        sb2.append(", error=");
        sb2.append(this.f393761c);
        sb2.append(", headers=");
        sb2.append(this.f393762d);
        sb2.append(", button=");
        sb2.append(this.f393763e);
        sb2.append(", events=");
        return H.n(sb2, this.f393764f, ')');
    }
}
