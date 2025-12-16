package W50;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationPopupOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LW50/b;", "", "a", "b", "LW50/b$a;", "LW50/b$b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: VerificationPopupOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW50/b$a;", "LW50/b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f17744a;

        public a(@k DeepLink deepLink) {
            this.f17744a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f17744a.equals(((a) obj).f17744a);
            }
            return false;
        }

        public final int hashCode() {
            return (this.f17744a.hashCode() * 31) - 1084338561;
        }

        @k
        public final String toString() {
            return "HandleDeeplink(deeplink=" + this.f17744a + ", requestKey=passport.add_profile.verification_popup.start_verification)";
        }
    }

    /* compiled from: VerificationPopupOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW50/b$b;", "LW50/b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: W50.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1251b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Navigation f17745a;

        public C1251b(@k Navigation navigation2) {
            this.f17745a = navigation2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1251b) && L.f(this.f17745a, ((C1251b) obj).f17745a);
        }

        public final int hashCode() {
            return this.f17745a.hashCode();
        }

        @k
        public final String toString() {
            return "Navigate(navigation=" + this.f17745a + ')';
        }
    }
}
