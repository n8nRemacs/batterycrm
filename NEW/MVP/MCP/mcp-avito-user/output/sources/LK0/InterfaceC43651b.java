package lK0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserViewedOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LlK0/b;", "", "a", "LlK0/b$a;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lK0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC43651b {

    /* compiled from: UserViewedOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlK0/b$a;", "LlK0/b;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lK0.b$a */
    public static final /* data */ class a implements InterfaceC43651b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f413725a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f413726b;

        public a(@k DeepLink deepLink, @l Bundle bundle) {
            this.f413725a = deepLink;
            this.f413726b = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f413725a, aVar.f413725a) && L.f(this.f413726b, aVar.f413726b);
        }

        public final int hashCode() {
            int iHashCode = this.f413725a.hashCode() * 31;
            Bundle bundle = this.f413726b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deeplink=");
            sb2.append(this.f413725a);
            sb2.append(", bundle=");
            return H.m(sb2, this.f413726b, ')');
        }
    }
}
