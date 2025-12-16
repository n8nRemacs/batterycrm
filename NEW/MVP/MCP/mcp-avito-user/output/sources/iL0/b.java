package IL0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AppliedServicesOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LIL0/b;", "", "a", "b", "LIL0/b$a;", "LIL0/b$b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: AppliedServicesOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIL0/b$a;", "LIL0/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f8152a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f8153b;

        public a(@k DeepLink deepLink, boolean z12) {
            this.f8152a = deepLink;
            this.f8153b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f8152a, aVar.f8152a) && this.f8153b == aVar.f8153b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f8153b) + (this.f8152a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeepLink(deepLink=");
            sb2.append(this.f8152a);
            sb2.append(", shouldFinish=");
            return r.x(sb2, this.f8153b, ')');
        }
    }

    /* compiled from: AppliedServicesOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIL0/b$b;", "LIL0/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: IL0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0461b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f8154a;

        public C0461b(@k String str) {
            this.f8154a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0461b) && L.f(this.f8154a, ((C0461b) obj).f8154a);
        }

        public final int hashCode() {
            return this.f8154a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowRemovalError(message="), this.f8154a, ')');
        }
    }
}
