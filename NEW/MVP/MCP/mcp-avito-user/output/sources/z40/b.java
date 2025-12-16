package Z40;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinOrdersOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LZ40/b;", "", "a", "LZ40/b$a;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: BeduinOrdersOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ40/b$a;", "LZ40/b;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f19860a;

        public a(@k ApiError apiError) {
            this.f19860a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f19860a, ((a) obj).f19860a);
        }

        public final int hashCode() {
            return this.f19860a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowRefreshError(error="), this.f19860a, ')');
        }
    }
}
