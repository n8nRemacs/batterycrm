package pg;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoFinanceBlockEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lpg/b;", "", "a", "Lpg/b$a;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pg.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC47076b {

    /* compiled from: AvitoFinanceBlockEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpg/b$a;", "Lpg/b;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pg.b$a */
    public static final /* data */ class a implements InterfaceC47076b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f428720a;

        public a(@k DeepLink deepLink) {
            this.f428720a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f428720a, ((a) obj).f428720a);
        }

        public final int hashCode() {
            return this.f428720a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deepLink="), this.f428720a, ')');
        }
    }
}
