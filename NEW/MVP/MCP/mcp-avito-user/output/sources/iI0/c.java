package II0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.JobOnboardingButton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PanelConfigOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LII0/c;", "", "a", "b", "c", "LII0/c$a;", "LII0/c$b;", "LII0/c$c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface c {

    /* compiled from: PanelConfigOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LII0/c$a;", "LII0/c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final JobOnboardingButton f8099a;

        public a(@k JobOnboardingButton jobOnboardingButton) {
            this.f8099a = jobOnboardingButton;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f8099a, ((a) obj).f8099a);
        }

        public final int hashCode() {
            return this.f8099a.hashCode();
        }

        @k
        public final String toString() {
            return "AddJobOnboardingButton(jobOnboardingButton=" + this.f8099a + ')';
        }
    }

    /* compiled from: PanelConfigOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LII0/c$b;", "LII0/c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f8100a;

        public b(@k DeepLink deepLink) {
            this.f8100a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f8100a, ((b) obj).f8100a);
        }

        public final int hashCode() {
            return this.f8100a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deepLink="), this.f8100a, ')');
        }
    }

    /* compiled from: PanelConfigOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LII0/c$c;", "LII0/c;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: II0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0456c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0456c f8101a = new C0456c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0456c);
        }

        public final int hashCode() {
            return -1847829848;
        }

        @k
        public final String toString() {
            return "OpenVasPlanBalanceLack";
        }
    }
}
