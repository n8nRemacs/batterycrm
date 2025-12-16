package ZD0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffSelectOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LZD0/b;", "", "a", "b", "LZD0/b$a;", "LZD0/b$b;", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: TariffSelectOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZD0/b$a;", "LZD0/b;", "<init>", "()V", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f19991a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 101016403;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: TariffSelectOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZD0/b$b;", "LZD0/b;", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ZD0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1427b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f19992a;

        public C1427b(@k DeepLink deepLink) {
            this.f19992a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1427b) && L.f(this.f19992a, ((C1427b) obj).f19992a);
        }

        public final int hashCode() {
            return this.f19992a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f19992a, ')');
        }
    }
}
