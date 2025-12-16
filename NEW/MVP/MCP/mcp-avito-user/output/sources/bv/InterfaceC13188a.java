package Bv;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: PriceReductionAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LBv/a;", "", "a", "b", "c", "LBv/a$a;", "LBv/a$b;", "LBv/a$c;", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC13188a {

    /* compiled from: PriceReductionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBv/a$a;", "LBv/a;", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bv.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0078a implements InterfaceC13188a {

        /* renamed from: a, reason: collision with root package name */
        public final long f1779a;

        /* renamed from: b, reason: collision with root package name */
        public final long f1780b;

        /* renamed from: c, reason: collision with root package name */
        public final long f1781c;

        public C0078a(long j12, long j13, long j14) {
            this.f1779a = j12;
            this.f1780b = j13;
            this.f1781c = j14;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0078a)) {
                return false;
            }
            C0078a c0078a = (C0078a) obj;
            return this.f1779a == c0078a.f1779a && this.f1780b == c0078a.f1780b && this.f1781c == c0078a.f1781c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f1781c) + r.g(Long.hashCode(this.f1779a) * 31, 31, this.f1780b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AcceptNewPrice(itemId=");
            sb2.append(this.f1779a);
            sb2.append(", newPrice=");
            sb2.append(this.f1780b);
            sb2.append(", oldPrice=");
            return r.u(sb2, this.f1781c, ')');
        }
    }

    /* compiled from: PriceReductionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBv/a$b;", "LBv/a;", "<init>", "()V", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bv.a$b */
    public static final /* data */ class b implements InterfaceC13188a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f1782a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1088564416;
        }

        @k
        public final String toString() {
            return "Dismiss";
        }
    }

    /* compiled from: PriceReductionAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBv/a$c;", "LBv/a;", "_avito_delivery-abuse_price-reduction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bv.a$c */
    public static final /* data */ class c implements InterfaceC13188a {

        /* renamed from: a, reason: collision with root package name */
        public final long f1783a;

        public c(long j12) {
            this.f1783a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f1783a == ((c) obj).f1783a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f1783a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("SaveOldPrice(price="), this.f1783a, ')');
        }
    }
}
