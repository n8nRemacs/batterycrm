package pw0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RefundToggles.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lpw0/k;", "", "a", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f428883a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f428884b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f428885c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f428886d;

    /* compiled from: RefundToggles.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpw0/k$a;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f428887a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f428888b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f428889c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final DeepLink f428890d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f428891e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f428892f;

        public a(@Y61.k DeepLink deepLink, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5) {
            this.f428887a = str;
            this.f428888b = str2;
            this.f428889c = str3;
            this.f428890d = deepLink;
            this.f428891e = str4;
            this.f428892f = str5;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f428887a, aVar.f428887a) && L.f(this.f428888b, aVar.f428888b) && L.f(this.f428889c, aVar.f428889c) && L.f(this.f428890d, aVar.f428890d) && L.f(this.f428891e, aVar.f428891e) && L.f(this.f428892f, aVar.f428892f);
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.f428890d, H.d(H.d(this.f428887a.hashCode() * 31, 31, this.f428888b), 31, this.f428889c), 31);
            String str = this.f428891e;
            int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f428892f;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Toggle(id=");
            sb2.append(this.f428887a);
            sb2.append(", title=");
            sb2.append(this.f428888b);
            sb2.append(", price=");
            sb2.append(this.f428889c);
            sb2.append(", tooltip=");
            sb2.append(this.f428890d);
            sb2.append(", discount=");
            sb2.append(this.f428891e);
            sb2.append(", strikethroughPrice=");
            return C22026a.c(sb2, this.f428892f, ')');
        }
    }

    public k(@Y61.k String str, @Y61.k String str2, @Y61.k a aVar, @Y61.k a aVar2) {
        this.f428883a = str;
        this.f428884b = str2;
        this.f428885c = aVar;
        this.f428886d = aVar2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f428883a, kVar.f428883a) && L.f(this.f428884b, kVar.f428884b) && L.f(this.f428885c, kVar.f428885c) && L.f(this.f428886d, kVar.f428886d);
    }

    public final int hashCode() {
        return this.f428886d.hashCode() + ((this.f428885c.hashCode() + H.d(this.f428883a.hashCode() * 31, 31, this.f428884b)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "RefundToggles(title=" + this.f428883a + ", activeToggleId=" + this.f428884b + ", leftToggle=" + this.f428885c + ", rightToggle=" + this.f428886d + ')';
    }
}
