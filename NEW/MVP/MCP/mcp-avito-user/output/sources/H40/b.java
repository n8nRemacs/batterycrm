package H40;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnboardingStepsAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LH40/b;", "", "a", "b", "c", "d", "LH40/b$a;", "LH40/b$b;", "LH40/b$c;", "LH40/b$d;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: OnboardingStepsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LH40/b$a;", "LH40/b;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final int f6936a;

        public a(int i12) {
            this.f6936a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f6936a == ((a) obj).f6936a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f6936a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ButtonClicked(page="), this.f6936a, ')');
        }
    }

    /* compiled from: OnboardingStepsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LH40/b$b;", "LH40/b;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: H40.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0395b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f6937a;

        public C0395b(@k DeepLink deepLink) {
            this.f6937a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0395b) && L.f(this.f6937a, ((C0395b) obj).f6937a);
        }

        public final int hashCode() {
            return this.f6937a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("LinkClicked(deeplink="), this.f6937a, ')');
        }
    }

    /* compiled from: OnboardingStepsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LH40/b$c;", "LH40/b;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final int f6938a;

        public c(int i12) {
            this.f6938a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f6938a == ((c) obj).f6938a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f6938a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnPageSelected(page="), this.f6938a, ')');
        }
    }

    /* compiled from: OnboardingStepsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LH40/b$d;", "LH40/b;", "<init>", "()V", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f6939a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1169637528;
        }

        @k
        public final String toString() {
            return "OnRetryClicked";
        }
    }
}
