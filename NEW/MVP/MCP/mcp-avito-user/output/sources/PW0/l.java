package pw0;

import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.StrBookingCalculateDetailsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ResponseData.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lpw0/l;", "", "a", "b", "Lpw0/l$a;", "Lpw0/l$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface l {

    /* compiled from: ResponseData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpw0/l$a;", "Lpw0/l;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final StrBookingCalculateDetailsResponse f428893a;

        public a(@Y61.k StrBookingCalculateDetailsResponse strBookingCalculateDetailsResponse) {
            this.f428893a = strBookingCalculateDetailsResponse;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f428893a, ((a) obj).f428893a);
        }

        public final int hashCode() {
            return this.f428893a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Content(data=" + this.f428893a + ')';
        }
    }

    /* compiled from: ResponseData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpw0/l$b;", "Lpw0/l;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f428894a;

        public b(@Y61.k ApiError apiError) {
            this.f428894a = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f428894a, ((b) obj).f428894a);
        }

        public final int hashCode() {
            return this.f428894a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(error="), this.f428894a, ')');
        }
    }
}
