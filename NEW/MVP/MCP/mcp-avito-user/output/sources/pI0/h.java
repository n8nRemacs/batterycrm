package pI0;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertActionEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LpI0/h;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f428494b;

    /* compiled from: UserAdvertActionEvent.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LpI0/h$a;", "", "a", "b", "c", "LpI0/h$a$a;", "LpI0/h$a$b;", "LpI0/h$a$c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: UserAdvertActionEvent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpI0/h$a$a;", "LpI0/h$a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: pI0.h$a$a, reason: collision with other inner class name */
        public static final /* data */ class C12264a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C12264a f428495a = new C12264a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C12264a);
            }

            public final int hashCode() {
                return -1110826576;
            }

            @Y61.k
            public final String toString() {
                return "Click";
            }
        }

        /* compiled from: UserAdvertActionEvent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpI0/h$a$b;", "LpI0/h$a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f428496a = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1903881442;
            }

            @Y61.k
            public final String toString() {
                return "Edit";
            }
        }

        /* compiled from: UserAdvertActionEvent.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpI0/h$a$c;", "LpI0/h$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f428497a;

            public c(@Y61.k String str) {
                this.f428497a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f428497a, ((c) obj).f428497a);
            }

            public final int hashCode() {
                return this.f428497a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Other(name="), this.f428497a, ')');
            }
        }
    }

    public h(@Y61.k String str, @Y61.k a aVar, @Y61.k String str2) {
        String str3;
        Q q12 = new Q("item_id", str);
        if (aVar instanceof a.C12264a) {
            str3 = "click";
        } else if (aVar instanceof a.b) {
            str3 = "edit";
        } else {
            if (!(aVar instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            str3 = ((a.c) aVar).f428497a;
        }
        this.f428494b = new ParametrizedClickStreamEvent(16678, 0, P0.g(q12, new Q("action_type", str3), new Q("profile_tab", str2)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f428494b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f428494b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f428494b.f90248c;
    }
}
