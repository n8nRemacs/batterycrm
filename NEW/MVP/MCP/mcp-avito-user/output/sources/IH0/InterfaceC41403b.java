package ih0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.step.dialog.DialogInfo;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.select.Arguments;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormStepOneTimeEvent.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lih0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "Lih0/b$a;", "Lih0/b$b;", "Lih0/b$c;", "Lih0/b$d;", "Lih0/b$e;", "Lih0/b$f;", "Lih0/b$g;", "Lih0/b$h;", "Lih0/b$i;", "Lih0/b$j;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ih0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC41403b {

    /* compiled from: RatingFormStepOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lih0/b$a;", "Lih0/b;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.b$a */
    public static final /* data */ class a implements InterfaceC41403b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f398655a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1193307700;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: RatingFormStepOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/b$b;", "Lih0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11386b implements InterfaceC41403b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f398656a;

        public C11386b(@k DeepLink deepLink) {
            this.f398656a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11386b) && L.f(this.f398656a, ((C11386b) obj).f398656a);
        }

        public final int hashCode() {
            return this.f398656a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f398656a, ')');
        }
    }

    /* compiled from: RatingFormStepOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/b$c;", "Lih0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.b$c */
    public static final /* data */ class c implements InterfaceC41403b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f398657a;

        public c(@k String str) {
            this.f398657a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f398657a, ((c) obj).f398657a);
        }

        public final int hashCode() {
            return this.f398657a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f398657a, ')');
        }
    }

    /* compiled from: RatingFormStepOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/b$d;", "Lih0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.b$d */
    public static final /* data */ class d implements InterfaceC41403b {

        /* renamed from: a, reason: collision with root package name */
        public final long f398658a;

        public d(long j12) {
            this.f398658a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f398658a == ((d) obj).f398658a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f398658a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("RequestFocus(fieldId="), this.f398658a, ')');
        }
    }

    /* compiled from: RatingFormStepOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/b$e;", "Lih0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.b$e */
    public static final /* data */ class e implements InterfaceC41403b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DialogInfo f398659a;

        public e(@k DialogInfo dialogInfo) {
            this.f398659a = dialogInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f398659a, ((e) obj).f398659a);
        }

        public final int hashCode() {
            return this.f398659a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowDialog(dialogInfo=" + this.f398659a + ')';
        }
    }

    /* compiled from: RatingFormStepOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/b$f;", "Lih0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.b$f */
    public static final /* data */ class f implements InterfaceC41403b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f398660a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final InterfaceC41402a f398661b;

        /* JADX WARN: Multi-variable type inference failed */
        public f() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f398660a, fVar.f398660a) && L.f(this.f398661b, fVar.f398661b);
        }

        public final int hashCode() {
            PrintableText printableText = this.f398660a;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            InterfaceC41402a interfaceC41402a = this.f398661b;
            return iHashCode + (interfaceC41402a != null ? interfaceC41402a.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ShowErrorToast(text=" + this.f398660a + ", action=" + this.f398661b + ')';
        }

        public f(@l PrintableText printableText, @l InterfaceC41402a interfaceC41402a) {
            this.f398660a = printableText;
            this.f398661b = interfaceC41402a;
        }

        public /* synthetic */ f(PrintableText printableText, InterfaceC41402a interfaceC41402a, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : printableText, (i12 & 2) != 0 ? null : interfaceC41402a);
        }
    }

    /* compiled from: RatingFormStepOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/b$g;", "Lih0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.b$g */
    public static final /* data */ class g implements InterfaceC41403b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final FieldIdentifier f398662a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<String> f398663b;

        public g(@k FieldIdentifier fieldIdentifier, @k List<String> list) {
            this.f398662a = fieldIdentifier;
            this.f398663b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f398662a, gVar.f398662a) && L.f(this.f398663b, gVar.f398663b);
        }

        public final int hashCode() {
            return this.f398663b.hashCode() + (this.f398662a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowFilePicker(fieldIdentifier=");
            sb2.append(this.f398662a);
            sb2.append(", memeTypes=");
            return H.p(sb2, this.f398663b, ')');
        }
    }

    /* compiled from: RatingFormStepOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/b$h;", "Lih0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.b$h */
    public static final /* data */ class h implements InterfaceC41403b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f398664a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AddressParameter.ValidationRules f398665b;

        public h(@l String str, @l AddressParameter.ValidationRules validationRules) {
            this.f398664a = str;
            this.f398665b = validationRules;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f398664a, hVar.f398664a) && L.f(this.f398665b, hVar.f398665b);
        }

        public final int hashCode() {
            String str = this.f398664a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AddressParameter.ValidationRules validationRules = this.f398665b;
            return iHashCode + (validationRules != null ? validationRules.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "StartAddressScreen(address=" + this.f398664a + ", minimalPrecision=" + this.f398665b + ')';
        }
    }

    /* compiled from: RatingFormStepOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/b$i;", "Lih0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.b$i */
    public static final /* data */ class i implements InterfaceC41403b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Long f398666a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f398667b;

        public i(@l Long l12, @l String str) {
            this.f398666a = l12;
            this.f398667b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f398666a, iVar.f398666a) && L.f(this.f398667b, iVar.f398667b);
        }

        public final int hashCode() {
            Long l12 = this.f398666a;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            String str = this.f398667b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("StartDevelopmentScreen(development=");
            sb2.append(this.f398666a);
            sb2.append(", displayedValue=");
            return C22026a.c(sb2, this.f398667b, ')');
        }
    }

    /* compiled from: RatingFormStepOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lih0/b$j;", "Lih0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ih0.b$j */
    public static final /* data */ class j implements InterfaceC41403b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Arguments f398668a;

        public j(@k Arguments arguments) {
            this.f398668a = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f398668a, ((j) obj).f398668a);
        }

        public final int hashCode() {
            return this.f398668a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.p(new StringBuilder("StartSelectBottomSheet(arguments="), this.f398668a, ')');
        }
    }
}
