package Mq0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PriceState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LMq0/b;", "", "a", "b", "LMq0/b$a;", "LMq0/b$b;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: PriceState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMq0/b$a;", "LMq0/b;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11027a;

        public a(@k String str) {
            this.f11027a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f11027a, ((a) obj).f11027a);
        }

        public final int hashCode() {
            return this.f11027a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("FullPriceOnly(fullPriceFormatted="), this.f11027a, ')');
        }
    }

    /* compiled from: PriceState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMq0/b$b;", "LMq0/b;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mq0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0703b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11028a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f11029b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f11030c;

        public C0703b(@k String str, @k String str2, @k String str3) {
            this.f11028a = str;
            this.f11029b = str2;
            this.f11030c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0703b)) {
                return false;
            }
            C0703b c0703b = (C0703b) obj;
            return L.f(this.f11028a, c0703b.f11028a) && L.f(this.f11029b, c0703b.f11029b) && L.f(this.f11030c, c0703b.f11030c);
        }

        public final int hashCode() {
            return this.f11030c.hashCode() + H.d(this.f11028a.hashCode() * 31, 31, this.f11029b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HasDiscount(discountedPriceFormatted=");
            sb2.append(this.f11028a);
            sb2.append(", discountPercentsFormatted=");
            sb2.append(this.f11029b);
            sb2.append(", fullPriceFormatted=");
            return C22026a.c(sb2, this.f11030c, ')');
        }
    }
}
