package P40;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LP40/b;", "", "a", "b", "LP40/b$a;", "LP40/b$b;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: OrderOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LP40/b$a;", "LP40/b;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f12818a;

        public a(@k ApiError apiError) {
            this.f12818a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f12818a, ((a) obj).f12818a);
        }

        public final int hashCode() {
            return this.f12818a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowExecutingError(error="), this.f12818a, ')');
        }
    }

    /* compiled from: OrderOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LP40/b$b;", "LP40/b;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: P40.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0830b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f12819a;

        public C0830b(@k String str) {
            this.f12819a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0830b) && L.f(this.f12819a, ((C0830b) obj).f12819a);
        }

        public final int hashCode() {
            return this.f12819a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowUniversalMapSelectError(message="), this.f12819a, ')');
        }
    }
}
