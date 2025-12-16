package Om;

import Y61.k;
import Y61.l;
import com.avito.android.util.ApiException;
import kotlin.Metadata;

/* compiled from: CartBundlesOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LOm/c;", "", "a", "LOm/c$a;", "_avito_cart-bundles_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface c {

    /* compiled from: CartBundlesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOm/c$a;", "LOm/c;", "_avito_cart-bundles_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiException f12507a;

        public a(@k ApiException apiException) {
            this.f12507a = apiException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f12507a.equals(((a) obj).f12507a);
        }

        public final int hashCode() {
            return this.f12507a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.q(new StringBuilder("BundleInfoUpdateError(throwable="), this.f12507a, ')');
        }
    }
}
