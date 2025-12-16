package Zu0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: ServicesOnboardingOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LZu0/b;", "", "a", "b", "c", "LZu0/b$a;", "LZu0/b$b;", "LZu0/b$c;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: ServicesOnboardingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZu0/b$a;", "LZu0/b;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f20552a;

        public a(@k DeepLink deepLink) {
            this.f20552a = deepLink;
        }
    }

    /* compiled from: ServicesOnboardingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZu0/b$b;", "LZu0/b;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zu0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1470b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final int f20553a;

        public C1470b(int i12) {
            this.f20553a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1470b) && this.f20553a == ((C1470b) obj).f20553a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f20553a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("RestoreStepEvent(step="), this.f20553a, ')');
        }
    }

    /* compiled from: ServicesOnboardingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZu0/b$c;", "LZu0/b;", "<init>", "()V", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f20554a = new c();
    }
}
