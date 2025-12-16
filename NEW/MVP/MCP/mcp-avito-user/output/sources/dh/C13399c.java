package Dh;

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

/* compiled from: BblContactHistoryState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"LDh/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dh.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C13399c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final b f3358g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C13399c f3359h = new C13399c(true, null, new d("", "", ""), null, C42784z0.f406748b);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3360b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ApiException f3361c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final d f3362d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final a f3363e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Object f3364f;

    /* compiled from: BblContactHistoryState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDh/c$a;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dh.c$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f3365a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f3366b;

        public a(@k String str, @k DeepLink deepLink) {
            this.f3365a = str;
            this.f3366b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f3365a, aVar.f3365a) && L.f(this.f3366b, aVar.f3366b);
        }

        public final int hashCode() {
            return this.f3366b.hashCode() + (this.f3365a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.f3365a);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f3366b, ')');
        }
    }

    /* compiled from: BblContactHistoryState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDh/c$b;", "", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dh.c$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: BblContactHistoryState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDh/c$c;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dh.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0183c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f3367a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f3368b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f3369c;

        public C0183c(@k String str, @k String str2, @k String str3) {
            this.f3367a = str;
            this.f3368b = str2;
            this.f3369c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0183c)) {
                return false;
            }
            C0183c c0183c = (C0183c) obj;
            return L.f(this.f3367a, c0183c.f3367a) && L.f(this.f3368b, c0183c.f3368b) && L.f(this.f3369c, c0183c.f3369c);
        }

        public final int hashCode() {
            return this.f3369c.hashCode() + H.d(this.f3367a.hashCode() * 31, 31, this.f3368b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Event(title=");
            sb2.append(this.f3367a);
            sb2.append(", diff=");
            sb2.append(this.f3368b);
            sb2.append(", date=");
            return C22026a.c(sb2, this.f3369c, ')');
        }
    }

    /* compiled from: BblContactHistoryState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDh/c$d;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dh.c$d */
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f3370a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f3371b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f3372c;

        public d(@k String str, @k String str2, @k String str3) {
            this.f3370a = str;
            this.f3371b = str2;
            this.f3372c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f3370a, dVar.f3370a) && L.f(this.f3371b, dVar.f3371b) && L.f(this.f3372c, dVar.f3372c);
        }

        public final int hashCode() {
            return this.f3372c.hashCode() + H.d(this.f3370a.hashCode() * 31, 31, this.f3371b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Headers(title=");
            sb2.append(this.f3370a);
            sb2.append(", event=");
            sb2.append(this.f3371b);
            sb2.append(", diff=");
            return C22026a.c(sb2, this.f3372c, ')');
        }
    }

    public C13399c(boolean z12, @l ApiException apiException, @k d dVar, @l a aVar, @k List list) {
        this.f3360b = z12;
        this.f3361c = apiException;
        this.f3362d = dVar;
        this.f3363e = aVar;
        this.f3364f = list;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public static C13399c a(C13399c c13399c, boolean z12, ApiException apiException) {
        d dVar = c13399c.f3362d;
        a aVar = c13399c.f3363e;
        ?? r52 = c13399c.f3364f;
        c13399c.getClass();
        return new C13399c(z12, apiException, dVar, aVar, r52);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13399c)) {
            return false;
        }
        C13399c c13399c = (C13399c) obj;
        return this.f3360b == c13399c.f3360b && L.f(this.f3361c, c13399c.f3361c) && L.f(this.f3362d, c13399c.f3362d) && L.f(this.f3363e, c13399c.f3363e) && L.f(this.f3364f, c13399c.f3364f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f3360b) * 31;
        ApiException apiException = this.f3361c;
        int iHashCode2 = (this.f3362d.hashCode() + ((iHashCode + (apiException == null ? 0 : apiException.hashCode())) * 31)) * 31;
        a aVar = this.f3363e;
        return this.f3364f.hashCode() + ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BblContactHistoryState(isLoading=");
        sb2.append(this.f3360b);
        sb2.append(", error=");
        sb2.append(this.f3361c);
        sb2.append(", headers=");
        sb2.append(this.f3362d);
        sb2.append(", button=");
        sb2.append(this.f3363e);
        sb2.append(", events=");
        return H.n(sb2, this.f3364f, ')');
    }
}
