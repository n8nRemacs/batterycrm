package w00;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage_invite.model.participant.ParticipantArguments;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.select.Arguments;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LandingOneTimeEvent.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lw00/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "Lw00/c$a;", "Lw00/c$b;", "Lw00/c$c;", "Lw00/c$d;", "Lw00/c$e;", "Lw00/c$f;", "Lw00/c$g;", "Lw00/c$h;", "Lw00/c$i;", "Lw00/c$j;", "Lw00/c$k;", "Lw00/c$l;", "Lw00/c$m;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w00.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC49417c {

    /* compiled from: LandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw00/c$a;", "Lw00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w00.c$a */
    public static final /* data */ class a implements InterfaceC49417c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f441126a;

        public a(@Y61.k String str) {
            this.f441126a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f441126a, ((a) obj).f441126a);
        }

        public final int hashCode() {
            return this.f441126a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ApplicationCreated(applicationId="), this.f441126a, ')');
        }
    }

    /* compiled from: LandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw00/c$b;", "Lw00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w00.c$b */
    public static final /* data */ class b implements InterfaceC49417c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f441127a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1937934074;
        }

        @Y61.k
        public final String toString() {
            return "Authorize";
        }
    }

    /* compiled from: LandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw00/c$c;", "Lw00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w00.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12804c implements InterfaceC49417c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C12804c f441128a = new C12804c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C12804c);
        }

        public final int hashCode() {
            return -2010608247;
        }

        @Y61.k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: LandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw00/c$d;", "Lw00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w00.c$d */
    public static final /* data */ class d implements InterfaceC49417c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f441129a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 201850921;
        }

        @Y61.k
        public final String toString() {
            return "CollapseHeader";
        }
    }

    /* compiled from: LandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw00/c$e;", "Lw00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w00.c$e */
    public static final /* data */ class e implements InterfaceC49417c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f441130a;

        public e(@Y61.k DeepLink deepLink) {
            this.f441130a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f441130a, ((e) obj).f441130a);
        }

        public final int hashCode() {
            return this.f441130a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f441130a, ')');
        }
    }

    /* compiled from: LandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw00/c$f;", "Lw00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w00.c$f */
    public static final /* data */ class f implements InterfaceC49417c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f441131a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1058822641;
        }

        @Y61.k
        public final String toString() {
            return "OpenAlreadyHaveApplicationDialog";
        }
    }

    /* compiled from: LandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw00/c$g;", "Lw00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w00.c$g */
    public static final /* data */ class g implements InterfaceC49417c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f441132a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f441133b;

        public g(@Y61.k String str, @Y61.k DeepLink deepLink) {
            this.f441132a = str;
            this.f441133b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f441132a, gVar.f441132a) && L.f(this.f441133b, gVar.f441133b);
        }

        public final int hashCode() {
            return this.f441133b.hashCode() + (this.f441132a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenApplicationScreen(applicationId=");
            sb2.append(this.f441132a);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f441133b, ')');
        }
    }

    /* compiled from: LandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw00/c$h;", "Lw00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w00.c$h */
    public static final /* data */ class h implements InterfaceC49417c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ParticipantArguments f441134a;

        public h(@Y61.k ParticipantArguments participantArguments) {
            this.f441134a = participantArguments;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f441134a, ((h) obj).f441134a);
        }

        public final int hashCode() {
            return this.f441134a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenParticipantsScreen(arguments=" + this.f441134a + ')';
        }
    }

    /* compiled from: LandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw00/c$i;", "Lw00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w00.c$i */
    public static final /* data */ class i implements InterfaceC49417c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f441135a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f441136b;

        public i(@Y61.k String str, @Y61.k ArrayList arrayList) {
            this.f441135a = str;
            this.f441136b = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f441135a.equals(iVar.f441135a) && this.f441136b.equals(iVar.f441136b);
        }

        public final int hashCode() {
            return this.f441136b.hashCode() + (this.f441135a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenProgramsDialog(selectedProgram=");
            sb2.append(this.f441135a);
            sb2.append(", programs=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f441136b, ')');
        }
    }

    /* compiled from: LandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw00/c$j;", "Lw00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w00.c$j */
    public static final /* data */ class j implements InterfaceC49417c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Arguments f441137a;

        public j(@Y61.k Arguments arguments) {
            this.f441137a = arguments;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f441137a, ((j) obj).f441137a);
        }

        public final int hashCode() {
            return this.f441137a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.p(new StringBuilder("OpenSelectorDialog(arguments="), this.f441137a, ')');
        }
    }

    /* compiled from: LandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw00/c$k;", "Lw00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w00.c$k */
    public static final /* data */ class k implements InterfaceC49417c {

        /* renamed from: a, reason: collision with root package name */
        public final int f441138a;

        public k(int i12) {
            this.f441138a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f441138a == ((k) obj).f441138a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f441138a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToPosition(position="), this.f441138a, ')');
        }
    }

    /* compiled from: LandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw00/c$l;", "Lw00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w00.c$l */
    public static final /* data */ class l implements InterfaceC49417c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f441139a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final ApiError f441140b;

        public l(@Y61.k PrintableText printableText, @Y61.l ApiError apiError) {
            this.f441139a = printableText;
            this.f441140b = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f441139a, lVar.f441139a) && L.f(this.f441140b, lVar.f441140b);
        }

        public final int hashCode() {
            int iHashCode = this.f441139a.hashCode() * 31;
            ApiError apiError = this.f441140b;
            return iHashCode + (apiError == null ? 0 : apiError.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowError(message=");
            sb2.append(this.f441139a);
            sb2.append(", error=");
            return AK.c.n(sb2, this.f441140b, ')');
        }

        public /* synthetic */ l(PrintableText printableText, ApiError apiError, int i12, C42822w c42822w) {
            this(printableText, (i12 & 2) != 0 ? null : apiError);
        }
    }

    /* compiled from: LandingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw00/c$m;", "Lw00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w00.c$m */
    public static final /* data */ class m implements InterfaceC49417c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f441141a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -416007938;
        }

        @Y61.k
        public final String toString() {
            return "UpdateCalculationRequest";
        }
    }
}
