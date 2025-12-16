package fB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CprConfigureAdvanceManualOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LfB0/b;", "", "a", "b", "LfB0/b$a;", "LfB0/b$b;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: CprConfigureAdvanceManualOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfB0/b$a;", "LfB0/b;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f395772a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f395773b;

        public a(@l DeepLink deepLink, @l String str) {
            this.f395772a = deepLink;
            this.f395773b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f395772a, aVar.f395772a) && L.f(this.f395773b, aVar.f395773b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f395772a;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            String str = this.f395773b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deepLink=");
            sb2.append(this.f395772a);
            sb2.append(", advance=");
            return C22026a.c(sb2, this.f395773b, ')');
        }
    }

    /* compiled from: CprConfigureAdvanceManualOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LfB0/b$b;", "LfB0/b;", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fB0.b$b, reason: collision with other inner class name */
    public static final class C11135b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11135b f395774a = new C11135b();
    }
}
