package To;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.code_check_public.i;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhoneRequestResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LTo/d;", "", "a", "b", "c", "d", "e", "f", "LTo/d$a;", "LTo/d$b;", "LTo/d$c;", "LTo/d$d;", "LTo/d$e;", "LTo/d$f;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface d {

    /* compiled from: PhoneRequestResult.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LTo/d$a;", "LTo/d;", "Lcom/avito/android/code_check_public/model/Phone;", "phone", "", "timeLeft", "", "codeLength", "Lcom/avito/android/code_check_public/a;", "nextNavigation", "<init>", "(Ljava/lang/String;JLjava/lang/Integer;Lcom/avito/android/code_check_public/a;Lkotlin/jvm/internal/w;)V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f15855a;

        /* renamed from: b, reason: collision with root package name */
        public final long f15856b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f15857c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final com.avito.android.code_check_public.a f15858d;

        public /* synthetic */ a(String str, long j12, Integer num, com.avito.android.code_check_public.a aVar, int i12, C42822w c42822w) {
            this(str, j12, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? null : aVar, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            String str = aVar.f15855a;
            Parcelable.Creator<Phone> creator = Phone.CREATOR;
            return L.f(this.f15855a, str) && this.f15856b == aVar.f15856b && L.f(this.f15857c, aVar.f15857c) && L.f(this.f15858d, aVar.f15858d);
        }

        public final int hashCode() {
            Parcelable.Creator<Phone> creator = Phone.CREATOR;
            int iG2 = r.g(this.f15855a.hashCode() * 31, 31, this.f15856b);
            Integer num = this.f15857c;
            int iHashCode = (iG2 + (num == null ? 0 : num.hashCode())) * 31;
            com.avito.android.code_check_public.a aVar = this.f15858d;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "CodeRequested(phone=" + ((Object) Phone.c(this.f15855a)) + ", timeLeft=" + this.f15856b + ", codeLength=" + this.f15857c + ", nextNavigation=" + this.f15858d + ')';
        }

        public a(String str, long j12, Integer num, com.avito.android.code_check_public.a aVar, C42822w c42822w) {
            this.f15855a = str;
            this.f15856b = j12;
            this.f15857c = num;
            this.f15858d = aVar;
        }
    }

    /* compiled from: PhoneRequestResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo/d$b;", "LTo/d;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f15859a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f15860b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f15861c;

        public b() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f15859a, bVar.f15859a) && L.f(this.f15860b, bVar.f15860b) && L.f(this.f15861c, bVar.f15861c);
        }

        public final int hashCode() {
            PrintableText printableText = this.f15859a;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            ApiError apiError = this.f15860b;
            int iHashCode2 = (iHashCode + (apiError == null ? 0 : apiError.hashCode())) * 31;
            Throwable th2 = this.f15861c;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(message=");
            sb2.append(this.f15859a);
            sb2.append(", apiError=");
            sb2.append(this.f15860b);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f15861c, ')');
        }

        public b(@l PrintableText printableText, @l ApiError apiError, @l Throwable th2) {
            this.f15859a = printableText;
            this.f15860b = apiError;
            this.f15861c = th2;
        }

        public /* synthetic */ b(PrintableText printableText, ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : printableText, (i12 & 2) != 0 ? null : apiError, (i12 & 4) != 0 ? null : th2);
        }
    }

    /* compiled from: PhoneRequestResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LTo/d$c;", "LTo/d;", "a", "b", "LTo/d$c$a;", "LTo/d$c$b;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends d {

        /* compiled from: PhoneRequestResult.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTo/d$c$a;", "LTo/d$c;", "<init>", "()V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f15862a = new a();
        }

        /* compiled from: PhoneRequestResult.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo/d$c$b;", "LTo/d$c;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final PrintableText f15863a;

            public b(@k PrintableText printableText) {
                this.f15863a = printableText;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f15863a, ((b) obj).f15863a);
            }

            public final int hashCode() {
                return this.f15863a.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.m(new StringBuilder("Text(text="), this.f15863a, ')');
            }
        }
    }

    /* compiled from: PhoneRequestResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo/d$d;", "LTo/d;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: To.d$d, reason: collision with other inner class name */
    public static final /* data */ class C1084d implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.code_check_public.a f15864a;

        public C1084d(@k com.avito.android.code_check_public.a aVar) {
            this.f15864a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1084d) && L.f(this.f15864a, ((C1084d) obj).f15864a);
        }

        public final int hashCode() {
            return this.f15864a.hashCode();
        }

        @k
        public final String toString() {
            return "Navigate(destination=" + this.f15864a + ')';
        }
    }

    /* compiled from: PhoneRequestResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo/d$e;", "LTo/d;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements d {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
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

    /* compiled from: PhoneRequestResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo/d$f;", "LTo/d;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final i f15865a;

        public f(@k i iVar) {
            this.f15865a = iVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f15865a, ((f) obj).f15865a);
        }

        public final int hashCode() {
            return this.f15865a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowUserDialog(dialog=" + this.f15865a + ')';
        }
    }
}
