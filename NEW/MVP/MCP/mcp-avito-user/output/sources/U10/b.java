package U10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmArguments;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationClientFormOneTimeEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LU10/b;", "", "a", "b", "c", "d", "e", "f", "LU10/b$a;", "LU10/b$b;", "LU10/b$c;", "LU10/b$d;", "LU10/b$e;", "LU10/b$f;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: ApplicationClientFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LU10/b$b;", "LU10/b;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: U10.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1092b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1092b f16102a = new C1092b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1092b);
        }

        public final int hashCode() {
            return 136096875;
        }

        @k
        public final String toString() {
            return "HideKeyboard";
        }
    }

    /* compiled from: ApplicationClientFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU10/b$c;", "LU10/b;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final MortgageClientSearchArguments f16103a;

        public c(@k MortgageClientSearchArguments mortgageClientSearchArguments) {
            this.f16103a = mortgageClientSearchArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f16103a, ((c) obj).f16103a);
        }

        public final int hashCode() {
            return this.f16103a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenClientSearch(arguments=" + this.f16103a + ')';
        }
    }

    /* compiled from: ApplicationClientFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU10/b$d;", "LU10/b;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PhoneConfirmArguments f16104a;

        public d(@k PhoneConfirmArguments phoneConfirmArguments) {
            this.f16104a = phoneConfirmArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f16104a, ((d) obj).f16104a);
        }

        public final int hashCode() {
            return this.f16104a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenPhoneConfirm(arguments=" + this.f16104a + ')';
        }
    }

    /* compiled from: ApplicationClientFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU10/b$e;", "LU10/b;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final int f16105a;

        public e(int i12) {
            this.f16105a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f16105a == ((e) obj).f16105a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f16105a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToItem(itemIndex="), this.f16105a, ')');
        }
    }

    /* compiled from: ApplicationClientFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU10/b$f;", "LU10/b;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f16106a;

        public f(@k PrintableText printableText) {
            this.f16106a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.f16106a.equals(((f) obj).f16106a);
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + (this.f16106a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowToast(message=" + this.f16106a + ", isError=true)";
        }
    }

    /* compiled from: ApplicationClientFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU10/b$a;", "LU10/b;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f16100a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16101b;

        public a(@k DeepLink deepLink, boolean z12) {
            this.f16100a = deepLink;
            this.f16101b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f16100a, aVar.f16100a) && this.f16101b == aVar.f16101b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16101b) + (this.f16100a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f16100a);
            sb2.append(", shouldCloseScreen=");
            return r.x(sb2, this.f16101b, ')');
        }

        public /* synthetic */ a(DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? false : z12);
        }
    }
}
