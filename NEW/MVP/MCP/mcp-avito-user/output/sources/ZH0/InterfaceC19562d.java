package Zh0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckerboardOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LZh0/d;", "", "a", "LZh0/d$a;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zh0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC19562d {

    /* compiled from: CheckerboardOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZh0/d$a;", "LZh0/d;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zh0.d$a */
    public static final /* data */ class a implements InterfaceC19562d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f20454a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f20455b;

        public a(@k DeepLink deepLink, @l String str) {
            this.f20454a = deepLink;
            this.f20455b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f20454a, aVar.f20454a) && L.f(this.f20455b, aVar.f20455b);
        }

        public final int hashCode() {
            int iHashCode = this.f20454a.hashCode() * 31;
            String str = this.f20455b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f20454a);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f20455b, ')');
        }
    }
}
