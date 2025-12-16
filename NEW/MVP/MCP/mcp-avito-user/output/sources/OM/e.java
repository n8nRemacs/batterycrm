package Om;

import Pm.C14806a;
import Pm.C14809d;
import Y61.k;
import Y61.l;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrueCartBundlesInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LOm/e;", "LOm/b;", "a", "b", "c", "LOm/e$a;", "LOm/e$b;", "LOm/e$c;", "_avito_cart-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface e extends Om.b {

    /* compiled from: TrueCartBundlesInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LOm/e$a;", "LOm/e;", "LPm/d;", "sellerHash", "LPm/a;", "bundleInfo", "<init>", "(Ljava/lang/String;LPm/a;Lkotlin/jvm/internal/w;)V", "_avito_cart-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f12509a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C14806a f12510b;

        public a(String str, C14806a c14806a, C42822w c42822w) {
            this.f12509a = str;
            this.f12510b = c14806a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f12509a, aVar.f12509a) && L.f(this.f12510b, aVar.f12510b);
        }

        public final int hashCode() {
            return this.f12510b.hashCode() + (this.f12509a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "AddBundleInfoForSeller(sellerHash=" + ((Object) C14809d.b(this.f12509a)) + ", bundleInfo=" + this.f12510b + ')';
        }
    }

    /* compiled from: TrueCartBundlesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOm/e$b;", "LOm/e;", "_avito_cart-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiException f12511a;

        public b(@k ApiException apiException) {
            this.f12511a = apiException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f12511a.equals(((b) obj).f12511a);
        }

        public final int hashCode() {
            return this.f12511a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.q(new StringBuilder("BundleInfoUpdateError(throwable="), this.f12511a, ')');
        }
    }

    /* compiled from: TrueCartBundlesInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOm/e$c;", "LOm/e;", "_avito_cart-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements e {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "OverwriteBundleInfoBySellers(bundleInfos=null)";
        }
    }
}
