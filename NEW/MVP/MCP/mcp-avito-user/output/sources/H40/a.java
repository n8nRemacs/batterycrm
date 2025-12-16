package H40;

import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnboardingStepsState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LH40/a;", "", "a", "b", "c", "LH40/a$a;", "LH40/a$b;", "LH40/a$c;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: OnboardingStepsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LH40/a$a;", "LH40/a;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: H40.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0394a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f6933a;

        public C0394a(@k ApiError apiError) {
            this.f6933a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0394a) && L.f(this.f6933a, ((C0394a) obj).f6933a);
        }

        public final int hashCode() {
            return this.f6933a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(error="), this.f6933a, ')');
        }
    }

    /* compiled from: OnboardingStepsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LH40/a$b;", "LH40/a;", "<init>", "()V", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f6934a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1200431760;
        }

        @k
        public final String toString() {
            return "Loaded";
        }
    }

    /* compiled from: OnboardingStepsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LH40/a$c;", "LH40/a;", "<init>", "()V", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f6935a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1441325361;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
