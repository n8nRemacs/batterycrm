package mB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureAdvanceOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LmB0/d;", "", "a", "b", "LmB0/d$a;", "LmB0/d$b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface d {

    /* compiled from: CpxConfigureAdvanceOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LmB0/d$a;", "LmB0/d;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f414377a = new a();
    }

    /* compiled from: CpxConfigureAdvanceOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmB0/d$b;", "LmB0/d;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f414378a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f414379b;

        public b(@k DeepLink deepLink, @l String str) {
            this.f414378a = deepLink;
            this.f414379b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f414378a, bVar.f414378a) && L.f(this.f414379b, bVar.f414379b);
        }

        public final int hashCode() {
            int iHashCode = this.f414378a.hashCode() * 31;
            String str = this.f414379b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeepLink(deepLink=");
            sb2.append(this.f414378a);
            sb2.append(", advance=");
            return C22026a.c(sb2, this.f414379b, ')');
        }
    }
}
