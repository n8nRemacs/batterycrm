package f90;

import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: ActivityAnalyticsStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lf90/a;", "", "a", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f90.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC40252a {

    /* compiled from: ActivityAnalyticsStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf90/a$a;", "", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f90.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11130a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f395695a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f395696b;

        public C11130a(@Y61.k String str, @Y61.k String str2) {
            this.f395695a = str;
            this.f395696b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11130a)) {
                return false;
            }
            C11130a c11130a = (C11130a) obj;
            return kotlin.jvm.internal.L.f(this.f395695a, c11130a.f395695a) && kotlin.jvm.internal.L.f(this.f395696b, c11130a.f395696b);
        }

        public final int hashCode() {
            return this.f395696b.hashCode() + (this.f395695a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActivityRecord(id=");
            sb2.append(this.f395695a);
            sb2.append(", name=");
            return C22026a.c(sb2, this.f395696b, ')');
        }
    }

    void a(@Y61.k C11130a c11130a);

    @Y61.k
    ArrayList b();

    void c(@Y61.k C11130a c11130a);
}
