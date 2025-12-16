package ZE0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TravelOnboardingState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"LZE0/d;", "", "a", "b", "c", "d", "LZE0/d$b;", "LZE0/d$c;", "LZE0/d$d;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f20015a = a.f20016a;

    /* compiled from: TravelOnboardingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZE0/d$a;", "", "<init>", "()V", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f20016a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C1430d f20017b = C1430d.f20020b;
    }

    /* compiled from: TravelOnboardingState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZE0/d$b;", "LZE0/d;", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final YE0.b f20018b;

        public b(@k YE0.b bVar) {
            this.f20018b = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f20018b, ((b) obj).f20018b);
        }

        public final int hashCode() {
            return this.f20018b.hashCode();
        }

        @k
        public final String toString() {
            return "Content(blocksInfo=" + this.f20018b + ')';
        }
    }

    /* compiled from: TravelOnboardingState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZE0/d$c;", "LZE0/d;", "<init>", "()V", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f20019b = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1880879443;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: TravelOnboardingState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZE0/d$d;", "LZE0/d;", "<init>", "()V", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ZE0.d$d, reason: collision with other inner class name */
    public static final /* data */ class C1430d implements d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C1430d f20020b = new C1430d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1430d);
        }

        public final int hashCode() {
            return -1823242079;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
