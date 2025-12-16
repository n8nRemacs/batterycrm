package To;

import Y61.k;
import Y61.l;
import com.avito.android.code_check_public.i;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CodeConfirmResult.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LTo/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LTo/a$a;", "LTo/a$b;", "LTo/a$c;", "LTo/a$d;", "LTo/a$e;", "LTo/a$f;", "LTo/a$g;", "LTo/a$h;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: To.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15383a {

    /* compiled from: CodeConfirmResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo/a$a;", "LTo/a;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: To.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1082a implements InterfaceC15383a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final To.b f15844a;

        /* JADX WARN: Multi-variable type inference failed */
        public C1082a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1082a) && L.f(this.f15844a, ((C1082a) obj).f15844a);
        }

        public final int hashCode() {
            To.b bVar = this.f15844a;
            if (bVar == null) {
                return 0;
            }
            return bVar.f15854a.hashCode();
        }

        @k
        public final String toString() {
            return "CodeConfirmed(packResult=" + this.f15844a + ')';
        }

        public C1082a(@l To.b bVar) {
            this.f15844a = bVar;
        }

        public /* synthetic */ C1082a(To.b bVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : bVar);
        }
    }

    /* compiled from: CodeConfirmResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTo/a$b;", "LTo/a;", "<init>", "()V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: To.a$b */
    public static final /* data */ class b implements InterfaceC15383a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f15845a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1051575888;
        }

        @k
        public final String toString() {
            return "DisableAutofill";
        }
    }

    /* compiled from: CodeConfirmResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo/a$c;", "LTo/a;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: To.a$c */
    public static final /* data */ class c implements InterfaceC15383a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f15846a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f15847b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f15848c;

        public c() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f15846a, cVar.f15846a) && L.f(this.f15847b, cVar.f15847b) && L.f(this.f15848c, cVar.f15848c);
        }

        public final int hashCode() {
            PrintableText printableText = this.f15846a;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            ApiError apiError = this.f15847b;
            int iHashCode2 = (iHashCode + (apiError == null ? 0 : apiError.hashCode())) * 31;
            Throwable th2 = this.f15848c;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(message=");
            sb2.append(this.f15846a);
            sb2.append(", apiError=");
            sb2.append(this.f15847b);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f15848c, ')');
        }

        public c(PrintableText printableText, ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
            printableText = (i12 & 1) != 0 ? null : printableText;
            apiError = (i12 & 2) != 0 ? null : apiError;
            th2 = (i12 & 4) != 0 ? null : th2;
            this.f15846a = printableText;
            this.f15847b = apiError;
            this.f15848c = th2;
        }
    }

    /* compiled from: CodeConfirmResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LTo/a$d;", "LTo/a;", "a", "b", "LTo/a$d$a;", "LTo/a$d$b;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: To.a$d */
    public interface d extends InterfaceC15383a {

        /* compiled from: CodeConfirmResult.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTo/a$d$a;", "LTo/a$d;", "<init>", "()V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: To.a$d$a, reason: collision with other inner class name */
        public static final class C1083a implements d {
            static {
                new C1083a();
            }
        }

        /* compiled from: CodeConfirmResult.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo/a$d$b;", "LTo/a$d;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: To.a$d$b */
        public static final /* data */ class b implements d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PrintableText f15849a;

            public b(@k PrintableText printableText) {
                this.f15849a = printableText;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f15849a, ((b) obj).f15849a);
            }

            public final int hashCode() {
                return this.f15849a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.m(new StringBuilder("Text(text="), this.f15849a, ')');
            }
        }
    }

    /* compiled from: CodeConfirmResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo/a$e;", "LTo/a;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: To.a$e */
    public static final /* data */ class e implements InterfaceC15383a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.code_check_public.a f15850a;

        public e(@k com.avito.android.code_check_public.a aVar) {
            this.f15850a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f15850a, ((e) obj).f15850a);
        }

        public final int hashCode() {
            return this.f15850a.hashCode();
        }

        @k
        public final String toString() {
            return "Navigate(destination=" + this.f15850a + ')';
        }
    }

    /* compiled from: CodeConfirmResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo/a$f;", "LTo/a;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: To.a$f */
    public static final /* data */ class f implements InterfaceC15383a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f15851a;

        public f(@k PrintableText printableText) {
            this.f15851a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f15851a, ((f) obj).f15851a);
        }

        public final int hashCode() {
            return this.f15851a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowToast(text="), this.f15851a, ')');
        }
    }

    /* compiled from: CodeConfirmResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo/a$g;", "LTo/a;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: To.a$g */
    public static final /* data */ class g implements InterfaceC15383a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final i f15852a;

        public g(@k i iVar) {
            this.f15852a = iVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f15852a, ((g) obj).f15852a);
        }

        public final int hashCode() {
            return this.f15852a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowUserDialog(dialog=" + this.f15852a + ')';
        }
    }

    /* compiled from: CodeConfirmResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTo/a$h;", "LTo/a;", "<init>", "()V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: To.a$h */
    public static final /* data */ class h implements InterfaceC15383a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f15853a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -291013256;
        }

        @k
        public final String toString() {
            return "TrackContent";
        }
    }
}
