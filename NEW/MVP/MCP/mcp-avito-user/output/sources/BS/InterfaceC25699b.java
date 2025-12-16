package bs;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxPromoDelayedStartOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lbs/b;", "", "a", "b", "Lbs/b$a;", "Lbs/b$b;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bs.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC25699b {

    /* compiled from: CpxPromoDelayedStartOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbs/b$a;", "Lbs/b;", "<init>", "()V", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bs.b$a */
    public static final /* data */ class a implements InterfaceC25699b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f57495a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 715435970;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: CpxPromoDelayedStartOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbs/b$b;", "Lbs/b;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bs.b$b, reason: collision with other inner class name */
    public static final /* data */ class C2020b implements InterfaceC25699b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f57496a;

        public C2020b(@k DeepLink deepLink) {
            this.f57496a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2020b) && L.f(this.f57496a, ((C2020b) obj).f57496a);
        }

        public final int hashCode() {
            return this.f57496a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f57496a, ')');
        }
    }
}
