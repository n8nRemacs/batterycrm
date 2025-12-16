package nb0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UserDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddPhoneOneTimeEvent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lnb0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "Lnb0/b$a;", "Lnb0/b$b;", "Lnb0/b$c;", "Lnb0/b$d;", "Lnb0/b$e;", "Lnb0/b$f;", "Lnb0/b$g;", "Lnb0/b$h;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nb0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC44372b {

    /* compiled from: AddPhoneOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnb0/b$a;", "Lnb0/b;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nb0.b$a */
    public static final /* data */ class a implements InterfaceC44372b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f415197a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f415198b;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f415197a, aVar.f415197a) && L.f(this.f415198b, aVar.f415198b);
        }

        public final int hashCode() {
            PrintableText printableText = this.f415197a;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            String str = this.f415198b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Finish(message=");
            sb2.append(this.f415197a);
            sb2.append(", phone=");
            return C22026a.c(sb2, this.f415198b, ')');
        }

        public /* synthetic */ a(PrintableText printableText, String str, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : str, (i12 & 1) != 0 ? null : printableText);
        }

        public a(@l String str, @l PrintableText printableText) {
            this.f415197a = printableText;
            this.f415198b = str;
        }
    }

    /* compiled from: AddPhoneOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnb0/b$b;", "Lnb0/b;", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nb0.b$b, reason: collision with other inner class name */
    public static final class C11864b implements InterfaceC44372b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11864b f415199a = new C11864b();
    }

    /* compiled from: AddPhoneOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnb0/b$c;", "Lnb0/b;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nb0.b$c */
    public static final /* data */ class c implements InterfaceC44372b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f415200a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f415201b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f415202c;

        public c(@k String str, @k String str2, @l String str3) {
            this.f415200a = str;
            this.f415201b = str2;
            this.f415202c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f415200a, cVar.f415200a) && L.f(this.f415201b, cVar.f415201b) && L.f(this.f415202c, cVar.f415202c);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f415200a.hashCode() * 31, 31, this.f415201b);
            String str = this.f415202c;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GoToPhoneAllowReverificationInfo(phone=");
            sb2.append(this.f415200a);
            sb2.append(", phoneFormatted=");
            sb2.append(this.f415201b);
            sb2.append(", userEmail=");
            return C22026a.c(sb2, this.f415202c, ')');
        }
    }

    /* compiled from: AddPhoneOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnb0/b$d;", "Lnb0/b;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nb0.b$d */
    public static final /* data */ class d implements InterfaceC44372b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f415203a;

        /* renamed from: b, reason: collision with root package name */
        public final long f415204b;

        public d(@k String str, long j12) {
            this.f415203a = str;
            this.f415204b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f415203a, dVar.f415203a) && this.f415204b == dVar.f415204b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f415204b) + r.e(5, this.f415203a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GoToPhoneConfirmation(phone=");
            sb2.append(this.f415203a);
            sb2.append(", codeLength=5, timeout=");
            return r.u(sb2, this.f415204b, ')');
        }
    }

    /* compiled from: AddPhoneOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnb0/b$e;", "Lnb0/b;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nb0.b$e */
    public static final /* data */ class e implements InterfaceC44372b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f415205a;

        public e(@k String str) {
            this.f415205a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f415205a, ((e) obj).f415205a);
        }

        public final int hashCode() {
            return this.f415205a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("GoToPhoneConfirmationWithRequestCode(phone="), this.f415205a, ')');
        }
    }

    /* compiled from: AddPhoneOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnb0/b$f;", "Lnb0/b;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nb0.b$f */
    public static final /* data */ class f implements InterfaceC44372b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f415206a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f415207b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f415208c;

        public f(@k String str, @k String str2, @l String str3) {
            this.f415206a = str;
            this.f415207b = str2;
            this.f415208c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f415206a, fVar.f415206a) && L.f(this.f415207b, fVar.f415207b) && L.f(this.f415208c, fVar.f415208c);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f415206a.hashCode() * 31, 31, this.f415207b);
            String str = this.f415208c;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("GoToPhoneDisallowReverificationInfo(phone=");
            sb2.append(this.f415206a);
            sb2.append(", phoneFormatted=");
            sb2.append(this.f415207b);
            sb2.append(", userEmail=");
            return C22026a.c(sb2, this.f415208c, ')');
        }
    }

    /* compiled from: AddPhoneOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnb0/b$g;", "Lnb0/b;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nb0.b$g */
    public static final /* data */ class g implements InterfaceC44372b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f415209a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f415210b;

        public g(@k PrintableText printableText, @l Throwable th2) {
            this.f415209a = printableText;
            this.f415210b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f415209a, gVar.f415209a) && L.f(this.f415210b, gVar.f415210b);
        }

        public final int hashCode() {
            int iHashCode = this.f415209a.hashCode() * 31;
            Throwable th2 = this.f415210b;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowToastBar(text=");
            sb2.append(this.f415209a);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f415210b, ')');
        }
    }

    /* compiled from: AddPhoneOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnb0/b$h;", "Lnb0/b;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nb0.b$h */
    public static final /* data */ class h implements InterfaceC44372b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserDialog f415211a;

        public h(@k UserDialog userDialog) {
            this.f415211a = userDialog;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f415211a, ((h) obj).f415211a);
        }

        public final int hashCode() {
            return this.f415211a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowUserDialog(userDialog=" + this.f415211a + ')';
        }
    }
}
