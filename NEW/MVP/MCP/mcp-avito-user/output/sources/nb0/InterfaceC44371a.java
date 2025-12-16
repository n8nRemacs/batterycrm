package nb0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.profile_phones.landline_verification.LandlinePhoneVerificationViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddPhoneAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lnb0/a;", "", "a", "b", "c", "d", "e", "Lnb0/a$a;", "Lnb0/a$b;", "Lnb0/a$c;", "Lnb0/a$d;", "Lnb0/a$e;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nb0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC44371a {

    /* compiled from: AddPhoneAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnb0/a$a;", "Lnb0/a;", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nb0.a$a, reason: collision with other inner class name */
    public static final class C11863a implements InterfaceC44371a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11863a f415191a = new C11863a();
    }

    /* compiled from: AddPhoneAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnb0/a$b;", "Lnb0/a;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nb0.a$b */
    public static final /* data */ class b implements InterfaceC44371a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f415192a;

        public b(@k String str) {
            this.f415192a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f415192a, ((b) obj).f415192a);
        }

        public final int hashCode() {
            return this.f415192a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ContinueClicked(phone="), this.f415192a, ')');
        }
    }

    /* compiled from: AddPhoneAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnb0/a$c;", "Lnb0/a;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nb0.a$c */
    public static final /* data */ class c implements InterfaceC44371a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f415193a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final LandlinePhoneVerificationViewModel.ResultStatus f415194b;

        public c(@k String str, @l LandlinePhoneVerificationViewModel.ResultStatus resultStatus) {
            this.f415193a = str;
            this.f415194b = resultStatus;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f415193a, cVar.f415193a) && this.f415194b == cVar.f415194b;
        }

        public final int hashCode() {
            int iHashCode = this.f415193a.hashCode() * 31;
            LandlinePhoneVerificationViewModel.ResultStatus resultStatus = this.f415194b;
            return iHashCode + (resultStatus == null ? 0 : resultStatus.hashCode());
        }

        @k
        public final String toString() {
            return "PhoneConfirmedResult(phone=" + this.f415193a + ", status=" + this.f415194b + ')';
        }
    }

    /* compiled from: AddPhoneAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnb0/a$d;", "Lnb0/a;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nb0.a$d */
    public static final /* data */ class d implements InterfaceC44371a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f415195a;

        public d(@k String str) {
            this.f415195a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f415195a, ((d) obj).f415195a);
        }

        public final int hashCode() {
            return this.f415195a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PhoneReverificationInfoAccepted(phone="), this.f415195a, ')');
        }
    }

    /* compiled from: AddPhoneAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnb0/a$e;", "Lnb0/a;", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nb0.a$e */
    public static final class e implements InterfaceC44371a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f415196a = new e();
    }
}
