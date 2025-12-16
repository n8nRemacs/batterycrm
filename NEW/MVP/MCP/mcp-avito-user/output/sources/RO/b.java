package Ro;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.code_check_public.i;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhoneRequestOneTimeEvent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LRo/b;", "", "a", "b", "c", "d", "e", "f", "g", "LRo/b$a;", "LRo/b$b;", "LRo/b$c;", "LRo/b$d;", "LRo/b$e;", "LRo/b$f;", "LRo/b$g;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: PhoneRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRo/b$a;", "LRo/b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f14623a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f14624b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f14625c;

        public a() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f14623a, aVar.f14623a) && L.f(this.f14624b, aVar.f14624b) && L.f(this.f14625c, aVar.f14625c);
        }

        public final int hashCode() {
            PrintableText printableText = this.f14623a;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            ApiError apiError = this.f14624b;
            int iHashCode2 = (iHashCode + (apiError == null ? 0 : apiError.hashCode())) * 31;
            Throwable th2 = this.f14625c;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(message=");
            sb2.append(this.f14623a);
            sb2.append(", apiError=");
            sb2.append(this.f14624b);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f14625c, ')');
        }

        public a(@l PrintableText printableText, @l ApiError apiError, @l Throwable th2) {
            this.f14623a = printableText;
            this.f14624b = apiError;
            this.f14625c = th2;
        }

        public /* synthetic */ a(PrintableText printableText, ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : printableText, (i12 & 2) != 0 ? null : apiError, (i12 & 4) != 0 ? null : th2);
        }
    }

    /* compiled from: PhoneRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRo/b$b;", "LRo/b;", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ro.b$b, reason: collision with other inner class name */
    public static final class C0979b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0979b f14626a = new C0979b();
    }

    /* compiled from: PhoneRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRo/b$c;", "LRo/b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.code_check_public.a f14627a;

        public c(@k com.avito.android.code_check_public.a aVar) {
            this.f14627a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f14627a, ((c) obj).f14627a);
        }

        public final int hashCode() {
            return this.f14627a.hashCode();
        }

        @k
        public final String toString() {
            return "Navigate(destination=" + this.f14627a + ')';
        }
    }

    /* compiled from: PhoneRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRo/b$d;", "LRo/b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f14628a;

        public d(@k PrintableText printableText) {
            this.f14628a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f14628a, ((d) obj).f14628a);
        }

        public final int hashCode() {
            return this.f14628a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("NoInputError(message="), this.f14628a, ')');
        }
    }

    /* compiled from: PhoneRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRo/b$e;", "LRo/b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f14629a;

        public e(@k String str) {
            this.f14629a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f14629a, ((e) obj).f14629a);
        }

        public final int hashCode() {
            return this.f14629a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetPhone(phone="), this.f14629a, ')');
        }
    }

    /* compiled from: PhoneRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRo/b$f;", "LRo/b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowToast(text=null)";
        }
    }

    /* compiled from: PhoneRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRo/b$g;", "LRo/b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final i f14630a;

        public g(@k i iVar) {
            this.f14630a = iVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f14630a, ((g) obj).f14630a);
        }

        public final int hashCode() {
            return this.f14630a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowUserDialog(dialog=" + this.f14630a + ')';
        }
    }
}
