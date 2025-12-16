package pg;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoFinanceBlockAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lpg/a;", "", "a", "b", "c", "d", "Lpg/a$a;", "Lpg/a$b;", "Lpg/a$c;", "Lpg/a$d;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pg.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC47075a {

    /* compiled from: AvitoFinanceBlockAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpg/a$a;", "Lpg/a;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pg.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12282a implements InterfaceC47075a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f428713a;

        public C12282a(@k DeepLink deepLink) {
            this.f428713a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12282a) && L.f(this.f428713a, ((C12282a) obj).f428713a);
        }

        public final int hashCode() {
            return this.f428713a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deepLink="), this.f428713a, ')');
        }
    }

    /* compiled from: AvitoFinanceBlockAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpg/a$b;", "Lpg/a;", "<init>", "()V", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pg.a$b */
    public static final /* data */ class b implements InterfaceC47075a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f428714a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 245428428;
        }

        @k
        public final String toString() {
            return "Reset";
        }
    }

    /* compiled from: AvitoFinanceBlockAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpg/a$c;", "Lpg/a;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pg.a$c */
    public static final /* data */ class c implements InterfaceC47075a {

        /* renamed from: a, reason: collision with root package name */
        public final long f428715a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Map<String, Object> f428716b;

        /* renamed from: c, reason: collision with root package name */
        public final long f428717c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Boolean f428718d;

        public c(long j12, @l Map<String, ? extends Object> map, long j13, @l Boolean bool) {
            this.f428715a = j12;
            this.f428716b = map;
            this.f428717c = j13;
            this.f428718d = bool;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f428715a == cVar.f428715a && L.f(this.f428716b, cVar.f428716b) && this.f428717c == cVar.f428717c && L.f(this.f428718d, cVar.f428718d);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f428715a) * 31;
            Map<String, Object> map = this.f428716b;
            int iG2 = r.g((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.f428717c);
            Boolean bool = this.f428718d;
            return iG2 + (bool != null ? bool.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SendAnalytics(id=");
            sb2.append(this.f428715a);
            sb2.append(", params=");
            sb2.append(this.f428716b);
            sb2.append(", version=");
            sb2.append(this.f428717c);
            sb2.append(", hasSensitiveData=");
            return C0.g(sb2, this.f428718d, ')');
        }
    }

    /* compiled from: AvitoFinanceBlockAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpg/a$d;", "Lpg/a;", "<init>", "()V", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pg.a$d */
    public static final /* data */ class d implements InterfaceC47075a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f428719a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1315825571;
        }

        @k
        public final String toString() {
            return "StartLoading";
        }
    }
}
