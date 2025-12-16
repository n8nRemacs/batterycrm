package BL;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacWatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LBL/a;", "", "a", "b", "_avito_iac-dialer-watcher_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: IacWatcher.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBL/a$a;", "", "_avito_iac-dialer-watcher_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: BL.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0053a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f1351a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f1352b;

        public C0053a(@k String str, @k String str2) {
            this.f1351a = str;
            this.f1352b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0053a)) {
                return false;
            }
            C0053a c0053a = (C0053a) obj;
            return L.f(this.f1351a, c0053a.f1351a) && L.f(this.f1352b, c0053a.f1352b);
        }

        public final int hashCode() {
            return this.f1352b.hashCode() + (this.f1351a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Call(callId=");
            sb2.append(this.f1351a);
            sb2.append(", scenario=");
            return C22026a.c(sb2, this.f1352b, ')');
        }
    }

    /* compiled from: IacWatcher.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBL/a$b;", "", "_avito_iac-dialer-watcher_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Set<C0053a> f1353a;

        public b(@k Set<C0053a> set) {
            this.f1353a = set;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f1353a, ((b) obj).f1353a);
        }

        public final int hashCode() {
            return this.f1353a.hashCode();
        }

        @k
        public final String toString() {
            return c.u(new StringBuilder("State(watchingCalls="), this.f1353a, ')');
        }
    }

    @k
    io.reactivex.rxjava3.internal.operators.observable.L M0();

    void N0(@k String str);

    void O0(@k String str, @k String str2);

    void P0(@k String str, @k String str2);
}
