package ne0;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.scanner_v2.ScannerOpenParams;
import com.avito.android.remote.model.category_parameters.ManualVin;
import com.avito.android.remote.model.category_parameters.VinSuggest;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputVinMviOneTimeEvent.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lne0/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "Lne0/c$a;", "Lne0/c$b;", "Lne0/c$c;", "Lne0/c$d;", "Lne0/c$e;", "Lne0/c$f;", "Lne0/c$g;", "Lne0/c$h;", "Lne0/c$i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ne0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC44386c {

    /* compiled from: InputVinMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lne0/c$a;", "Lne0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.c$a */
    public static final /* data */ class a implements InterfaceC44386c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f415248a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -117490836;
        }

        @k
        public final String toString() {
            return "ClosePublish";
        }
    }

    /* compiled from: InputVinMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lne0/c$b;", "Lne0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.c$b */
    public static final /* data */ class b implements InterfaceC44386c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f415249a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -916713865;
        }

        @k
        public final String toString() {
            return "GoToNextStep";
        }
    }

    /* compiled from: InputVinMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lne0/c$c;", "Lne0/c;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11868c implements InterfaceC44386c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11868c f415250a = new C11868c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11868c);
        }

        public final int hashCode() {
            return 767676539;
        }

        @k
        public final String toString() {
            return "GoToPreviousStep";
        }
    }

    /* compiled from: InputVinMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/c$d;", "Lne0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.c$d */
    public static final /* data */ class d implements InterfaceC44386c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Uri f415251a;

        public d(@k Uri uri) {
            this.f415251a = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f415251a, ((d) obj).f415251a);
        }

        public final int hashCode() {
            return this.f415251a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.t(new StringBuilder("OpenLink(url="), this.f415251a, ')');
        }
    }

    /* compiled from: InputVinMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/c$e;", "Lne0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.c$e */
    public static final /* data */ class e implements InterfaceC44386c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ManualVin f415252a;

        public e(@k ManualVin manualVin) {
            this.f415252a = manualVin;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f415252a, ((e) obj).f415252a);
        }

        public final int hashCode() {
            return this.f415252a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenVinManual(manualVin=" + this.f415252a + ')';
        }
    }

    /* compiled from: InputVinMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/c$f;", "Lne0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.c$f */
    public static final /* data */ class f implements InterfaceC44386c {

        /* renamed from: a, reason: collision with root package name */
        public final int f415253a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ScannerOpenParams f415254b;

        public f(int i12, @k ScannerOpenParams scannerOpenParams) {
            this.f415253a = i12;
            this.f415254b = scannerOpenParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f415253a == fVar.f415253a && L.f(this.f415254b, fVar.f415254b);
        }

        public final int hashCode() {
            return this.f415254b.hashCode() + (Integer.hashCode(this.f415253a) * 31);
        }

        @k
        public final String toString() {
            return "OpenVinScanner(stepIndex=" + this.f415253a + ", scannerOpenParams=" + this.f415254b + ')';
        }
    }

    /* compiled from: InputVinMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/c$g;", "Lne0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.c$g */
    public static final /* data */ class g implements InterfaceC44386c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final VinSuggest f415255a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f415256b;

        /* renamed from: c, reason: collision with root package name */
        public final int f415257c;

        public g(@k VinSuggest vinSuggest, @k String str, int i12) {
            this.f415255a = vinSuggest;
            this.f415256b = str;
            this.f415257c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f415255a, gVar.f415255a) && L.f(this.f415256b, gVar.f415256b) && this.f415257c == gVar.f415257c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f415257c) + H.d(this.f415255a.hashCode() * 31, 31, this.f415256b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenVinSuggest(vinSuggest=");
            sb2.append(this.f415255a);
            sb2.append(", vinId=");
            sb2.append(this.f415256b);
            sb2.append(", stepIndex=");
            return r.t(sb2, this.f415257c, ')');
        }
    }

    /* compiled from: InputVinMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/c$h;", "Lne0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.c$h */
    public static final /* data */ class h implements InterfaceC44386c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f415258a;

        public h(@k String str) {
            this.f415258a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f415258a, ((h) obj).f415258a);
        }

        public final int hashCode() {
            return this.f415258a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorMessage(message="), this.f415258a, ')');
        }
    }

    /* compiled from: InputVinMviOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/c$i;", "Lne0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.c$i */
    public static final /* data */ class i implements InterfaceC44386c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ru.avito.component.toolbar.d f415259a;

        public i(@k ru.avito.component.toolbar.d dVar) {
            this.f415259a = dVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f415259a, ((i) obj).f415259a);
        }

        public final int hashCode() {
            return this.f415259a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowOnboarding(onboardingData=" + this.f415259a + ')';
        }
    }
}
