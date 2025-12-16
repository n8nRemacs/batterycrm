package ce;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FactorUnavailableReasonOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lce/a;", "", "a", "b", "Lce/a$a;", "Lce/a$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ce.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC27180a {

    /* compiled from: FactorUnavailableReasonOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lce/a$a;", "Lce/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ce.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2051a implements InterfaceC27180a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f58054a;

        public C2051a() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2051a) && this.f58054a == ((C2051a) obj).f58054a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f58054a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SetOkResult(andFinish="), this.f58054a, ')');
        }

        public C2051a(boolean z12) {
            this.f58054a = z12;
        }

        public /* synthetic */ C2051a(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: FactorUnavailableReasonOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lce/a$b;", "Lce/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ce.a$b */
    public static final /* data */ class b implements InterfaceC27180a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f58055a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f58056b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f58057c;

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
            return L.f(this.f58055a, bVar.f58055a) && L.f(this.f58056b, bVar.f58056b) && L.f(this.f58057c, bVar.f58057c);
        }

        public final int hashCode() {
            PrintableText printableText = this.f58055a;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            ApiError apiError = this.f58056b;
            int iHashCode2 = (iHashCode + (apiError == null ? 0 : apiError.hashCode())) * 31;
            Throwable th2 = this.f58057c;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowError(message=");
            sb2.append(this.f58055a);
            sb2.append(", apiError=");
            sb2.append(this.f58056b);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f58057c, ')');
        }

        public b(@l PrintableText printableText, @l ApiError apiError, @l Throwable th2) {
            this.f58055a = printableText;
            this.f58056b = apiError;
            this.f58057c = th2;
        }

        public /* synthetic */ b(PrintableText printableText, ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : printableText, (i12 & 2) != 0 ? null : apiError, (i12 & 4) != 0 ? null : th2);
        }
    }
}
