package Qn0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalDeliveryTypeCourierOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LQn0/b;", "", "a", "b", "LQn0/b$a;", "LQn0/b$b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: UniversalDeliveryTypeCourierOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQn0/b$a;", "LQn0/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f13999a;

        public a(@k ApiError apiError) {
            this.f13999a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f13999a, ((a) obj).f13999a);
        }

        public final int hashCode() {
            return this.f13999a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowExecutingError(error="), this.f13999a, ')');
        }
    }

    /* compiled from: UniversalDeliveryTypeCourierOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQn0/b$b;", "LQn0/b;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qn0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0927b implements b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0927b)) {
                return false;
            }
            ((C0927b) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            return 0;
        }

        @k
        public final String toString() {
            return "StoredActions(actions=null)";
        }
    }
}
