package is;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.priceinput.CpxPromoInputSource;
import kotlin.Metadata;

/* compiled from: CpxPromoPriceInputOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lis/b;", "", "a", "Lis/b$a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: is.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC42097b {

    /* compiled from: CpxPromoPriceInputOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lis/b$a;", "Lis/b;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: is.b$a */
    public static final /* data */ class a implements InterfaceC42097b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CpxPromoInputSource f405316a;

        /* renamed from: b, reason: collision with root package name */
        public final long f405317b;

        public a(@k CpxPromoInputSource cpxPromoInputSource, long j12) {
            this.f405316a = cpxPromoInputSource;
            this.f405317b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f405316a == aVar.f405316a && this.f405317b == aVar.f405317b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f405317b) + (this.f405316a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Save(source=");
            sb2.append(this.f405316a);
            sb2.append(", selectedValue=");
            return r.u(sb2, this.f405317b, ')');
        }
    }
}
