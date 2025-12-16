package ZE0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelOnboardingOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LZE0/b;", "", "a", "b", "c", "LZE0/b$a;", "LZE0/b$b;", "LZE0/b$c;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: TravelOnboardingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZE0/b$a;", "LZE0/b;", "<init>", "()V", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f20005a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -52771958;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: TravelOnboardingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZE0/b$b;", "LZE0/b;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ZE0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1429b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f20006a;

        public C1429b(@k DeepLink deepLink) {
            this.f20006a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1429b) && L.f(this.f20006a, ((C1429b) obj).f20006a);
        }

        public final int hashCode() {
            return this.f20006a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenAuthWithRedirectDeeplink(redirectDeeplink="), this.f20006a, ')');
        }
    }

    /* compiled from: TravelOnboardingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZE0/b$c;", "LZE0/b;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f20007a;

        public c(@k DeepLink deepLink) {
            this.f20007a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f20007a, ((c) obj).f20007a);
        }

        public final int hashCode() {
            return this.f20007a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f20007a, ')');
        }
    }
}
