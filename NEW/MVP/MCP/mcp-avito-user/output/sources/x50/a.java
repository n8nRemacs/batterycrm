package X50;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.VerificationDisclaimer;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateProfileResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LX50/a;", "", "a", "b", "c", "d", "e", "LX50/a$a;", "LX50/a$b;", "LX50/a$c;", "LX50/a$d;", "LX50/a$e;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: CreateProfileResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX50/a$a;", "LX50/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: X50.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1318a implements a {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1318a)) {
                return false;
            }
            ((C1318a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        @k
        public final String toString() {
            return "FinalizedCreatePassport(userId=0)";
        }
    }

    /* compiled from: CreateProfileResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LX50/a$b;", "LX50/a;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f18579a = new b();
    }

    /* compiled from: CreateProfileResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX50/a$c;", "LX50/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f18580a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final VerificationDisclaimer f18581b;

        public c(@k DeepLink deepLink, @l VerificationDisclaimer verificationDisclaimer) {
            this.f18580a = deepLink;
            this.f18581b = verificationDisclaimer;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f18580a, cVar.f18580a) && L.f(this.f18581b, cVar.f18581b);
        }

        public final int hashCode() {
            int iHashCode = this.f18580a.hashCode() * 31;
            VerificationDisclaimer verificationDisclaimer = this.f18581b;
            return iHashCode + (verificationDisclaimer == null ? 0 : verificationDisclaimer.hashCode());
        }

        @k
        public final String toString() {
            return "NeedVerification(verificationDeepLink=" + this.f18580a + ", disclaimer=" + this.f18581b + ')';
        }
    }

    /* compiled from: CreateProfileResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX50/a$d;", "LX50/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f18582a;

        public d(@k DeepLink deepLink) {
            this.f18582a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f18582a, ((d) obj).f18582a);
        }

        public final int hashCode() {
            return this.f18582a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("NextStepLink(nextStepLink="), this.f18582a, ')');
        }
    }

    /* compiled from: CreateProfileResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LX50/a$e;", "LX50/a;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f18583a = new e();
    }
}
