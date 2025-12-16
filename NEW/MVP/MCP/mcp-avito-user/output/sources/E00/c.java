package E00;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.person_form.suggestion.model.SuggestionArguments;
import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmArguments;
import com.avito.android.remote.error.ApiError;
import com.avito.android.select.Arguments;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PersonFormOneTimeEvent.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LE00/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LE00/c$a;", "LE00/c$b;", "LE00/c$c;", "LE00/c$d;", "LE00/c$e;", "LE00/c$f;", "LE00/c$g;", "LE00/c$h;", "LE00/c$i;", "LE00/c$j;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: PersonFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE00/c$a;", "LE00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f3656a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 982431854;
        }

        @k
        public final String toString() {
            return "CloseFlow";
        }
    }

    /* compiled from: PersonFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE00/c$b;", "LE00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f3657a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 664240583;
        }

        @k
        public final String toString() {
            return "GoBack";
        }
    }

    /* compiled from: PersonFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE00/c$c;", "LE00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: E00.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0209c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f3658a;

        public C0209c(@k DeepLink deepLink) {
            this.f3658a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0209c) && L.f(this.f3658a, ((C0209c) obj).f3658a);
        }

        public final int hashCode() {
            return this.f3658a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f3658a, ')');
        }
    }

    /* compiled from: PersonFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LE00/c$d;", "LE00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f3659a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 602194209;
        }

        @k
        public final String toString() {
            return "HideKeyboard";
        }
    }

    /* compiled from: PersonFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE00/c$e;", "LE00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PhoneConfirmArguments f3660a;

        public e(@k PhoneConfirmArguments phoneConfirmArguments) {
            this.f3660a = phoneConfirmArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f3660a, ((e) obj).f3660a);
        }

        public final int hashCode() {
            return this.f3660a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenPhoneConfirmationDialog(arguments=" + this.f3660a + ')';
        }
    }

    /* compiled from: PersonFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE00/c$f;", "LE00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Arguments f3661a;

        public f(@k Arguments arguments) {
            this.f3661a = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f3661a, ((f) obj).f3661a);
        }

        public final int hashCode() {
            return this.f3661a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.p(new StringBuilder("OpenSelector(arguments="), this.f3661a, ')');
        }
    }

    /* compiled from: PersonFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE00/c$g;", "LE00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f3662a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3663b;

        public g(@k List<String> list, int i12) {
            this.f3662a = list;
            this.f3663b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f3662a, gVar.f3662a) && this.f3663b == gVar.f3663b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f3663b) + (this.f3662a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenStep(steps=");
            sb2.append(this.f3662a);
            sb2.append(", stepIdx=");
            return r.t(sb2, this.f3663b, ')');
        }
    }

    /* compiled from: PersonFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE00/c$h;", "LE00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SuggestionArguments f3664a;

        public h(@k SuggestionArguments suggestionArguments) {
            this.f3664a = suggestionArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f3664a, ((h) obj).f3664a);
        }

        public final int hashCode() {
            return this.f3664a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenSuggestion(arguments=" + this.f3664a + ')';
        }
    }

    /* compiled from: PersonFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE00/c$i;", "LE00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f3665a;

        public i(int i12) {
            this.f3665a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f3665a == ((i) obj).f3665a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f3665a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollTo(position="), this.f3665a, ')');
        }
    }

    /* compiled from: PersonFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE00/c$j;", "LE00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f3666a;

        public j(@k ApiError apiError) {
            this.f3666a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f3666a, ((j) obj).f3666a);
        }

        public final int hashCode() {
            return this.f3666a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowApiError(error="), this.f3666a, ')');
        }
    }
}
