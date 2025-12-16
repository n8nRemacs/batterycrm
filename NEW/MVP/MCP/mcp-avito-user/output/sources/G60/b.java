package g60;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectBusinessVrfOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lg60/b;", "", "a", "b", "c", "d", "Lg60/b$a;", "Lg60/b$b;", "Lg60/b$c;", "Lg60/b$d;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: SelectBusinessVrfOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg60/b$a;", "Lg60/b;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f396293a = new a();
    }

    /* compiled from: SelectBusinessVrfOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg60/b$b;", "Lg60/b;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: g60.b$b, reason: collision with other inner class name */
    public static final class C11191b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11191b f396294a = new C11191b();
    }

    /* compiled from: SelectBusinessVrfOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg60/b$c;", "Lg60/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f396295a;

        public c(@k Throwable th2) {
            this.f396295a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f396295a, ((c) obj).f396295a);
        }

        public final int hashCode() {
            return this.f396295a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("MergeError(throwable="), this.f396295a, ')');
        }
    }

    /* compiled from: SelectBusinessVrfOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg60/b$d;", "Lg60/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f396296a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f396297b;

        public d(@l PrintableText printableText, boolean z12) {
            this.f396296a = z12;
            this.f396297b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f396296a == dVar.f396296a && L.f(this.f396297b, dVar.f396297b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f396296a) * 31;
            PrintableText printableText = this.f396297b;
            return iHashCode + (printableText == null ? 0 : printableText.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MergeFinished(isMergeSuccess=");
            sb2.append(this.f396296a);
            sb2.append(", successText=");
            return AK.c.m(sb2, this.f396297b, ')');
        }

        public /* synthetic */ d(boolean z12, PrintableText printableText, int i12, C42822w c42822w) {
            this(printableText, (i12 & 1) != 0 ? true : z12);
        }
    }
}
