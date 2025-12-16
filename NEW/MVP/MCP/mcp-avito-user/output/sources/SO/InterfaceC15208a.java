package So;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.UserDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PreRequestOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LSo/a;", "", "a", "b", "c", "d", "e", "LSo/a$a;", "LSo/a$b;", "LSo/a$c;", "LSo/a$d;", "LSo/a$e;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: So.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC15208a {

    /* compiled from: PreRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSo/a$a;", "LSo/a;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: So.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1034a implements InterfaceC15208a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f15145a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f15146b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f15147c;

        public C1034a() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1034a)) {
                return false;
            }
            C1034a c1034a = (C1034a) obj;
            return L.f(this.f15145a, c1034a.f15145a) && L.f(this.f15146b, c1034a.f15146b) && L.f(this.f15147c, c1034a.f15147c);
        }

        public final int hashCode() {
            PrintableText printableText = this.f15145a;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            ApiError apiError = this.f15146b;
            int iHashCode2 = (iHashCode + (apiError == null ? 0 : apiError.hashCode())) * 31;
            Throwable th2 = this.f15147c;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(message=");
            sb2.append(this.f15145a);
            sb2.append(", apiError=");
            sb2.append(this.f15146b);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f15147c, ')');
        }

        public C1034a(@l PrintableText printableText, @l ApiError apiError, @l Throwable th2) {
            this.f15145a = printableText;
            this.f15146b = apiError;
            this.f15147c = th2;
        }

        public /* synthetic */ C1034a(PrintableText printableText, ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : printableText, (i12 & 2) != 0 ? null : apiError, (i12 & 4) != 0 ? null : th2);
        }
    }

    /* compiled from: PreRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSo/a$b;", "LSo/a;", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: So.a$b */
    public static final class b implements InterfaceC15208a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f15148a = new b();
    }

    /* compiled from: PreRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSo/a$c;", "LSo/a;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: So.a$c */
    public static final /* data */ class c implements InterfaceC15208a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.code_check_public.a f15149a;

        public c(@k com.avito.android.code_check_public.a aVar) {
            this.f15149a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f15149a, ((c) obj).f15149a);
        }

        public final int hashCode() {
            return this.f15149a.hashCode();
        }

        @k
        public final String toString() {
            return "Navigate(destination=" + this.f15149a + ')';
        }
    }

    /* compiled from: PreRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSo/a$d;", "LSo/a;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: So.a$d */
    public static final /* data */ class d implements InterfaceC15208a {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
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

    /* compiled from: PreRequestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSo/a$e;", "LSo/a;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: So.a$e */
    public static final /* data */ class e implements InterfaceC15208a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.code_check_public.c<UserDialog> f15150a;

        public e(@k com.avito.android.code_check_public.c<UserDialog> cVar) {
            this.f15150a = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f15150a, ((e) obj).f15150a);
        }

        public final int hashCode() {
            return this.f15150a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowUserDialog(dialog=" + this.f15150a + ')';
        }
    }
}
