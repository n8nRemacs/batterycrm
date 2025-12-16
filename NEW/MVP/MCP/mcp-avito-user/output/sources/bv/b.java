package Bv;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PriceReductionOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LBv/b;", "", "a", "b", "c", "LBv/b$a;", "LBv/b$b;", "LBv/b$c;", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: PriceReductionOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBv/b$a;", "LBv/b;", "<init>", "()V", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f1784a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1790101743;
        }

        @k
        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: PriceReductionOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBv/b$b;", "LBv/b;", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bv.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0079b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f1785a;

        public C0079b(@k ApiError apiError) {
            this.f1785a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0079b) && L.f(this.f1785a, ((C0079b) obj).f1785a);
        }

        public final int hashCode() {
            return this.f1785a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(apiError="), this.f1785a, ')');
        }
    }

    /* compiled from: PriceReductionOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBv/b$c;", "LBv/b;", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final long f1786a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f1787b;

        public c(long j12, boolean z12) {
            this.f1786a = j12;
            this.f1787b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f1786a == cVar.f1786a && this.f1787b == cVar.f1787b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1787b) + (Long.hashCode(this.f1786a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectPrice(price=");
            sb2.append(this.f1786a);
            sb2.append(", isNew=");
            return r.x(sb2, this.f1787b, ')');
        }
    }
}
