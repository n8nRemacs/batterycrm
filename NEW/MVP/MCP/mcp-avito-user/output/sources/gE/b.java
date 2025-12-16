package GE;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FeesMethodsV2OneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LGE/b;", "", "a", "b", "c", "LGE/b$a;", "LGE/b$b;", "LGE/b$c;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: FeesMethodsV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGE/b$a;", "LGE/b;", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f6385a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -533411528;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: FeesMethodsV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGE/b$b;", "LGE/b;", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: GE.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0334b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0334b f6386a = new C0334b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0334b);
        }

        public final int hashCode() {
            return -1973877774;
        }

        @k
        public final String toString() {
            return "FinishFlow";
        }
    }

    /* compiled from: FeesMethodsV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGE/b$c;", "LGE/b;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f6387a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f6388b;

        public c(@k DeepLink deepLink, boolean z12) {
            this.f6387a = deepLink;
            this.f6388b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f6387a, cVar.f6387a) && this.f6388b == cVar.f6388b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f6388b) + (this.f6387a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f6387a);
            sb2.append(", shouldFinish=");
            return r.x(sb2, this.f6388b, ')');
        }
    }
}
