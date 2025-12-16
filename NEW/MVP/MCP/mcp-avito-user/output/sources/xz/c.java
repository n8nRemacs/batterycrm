package XZ;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageConsultationOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LXZ/c;", "", "a", "b", "LXZ/c$a;", "LXZ/c$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: MortgageConsultationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXZ/c$a;", "LXZ/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f18910a;

        public a(@k PrintableText printableText) {
            this.f18910a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f18910a, ((a) obj).f18910a);
        }

        public final int hashCode() {
            return this.f18910a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("DismissWithSuccess(message="), this.f18910a, ')');
        }
    }

    /* compiled from: MortgageConsultationOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXZ/c$b;", "LXZ/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f18911a;

        public b(@k PrintableText printableText) {
            this.f18911a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f18911a, ((b) obj).f18911a);
        }

        public final int hashCode() {
            return this.f18911a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowToast(message="), this.f18911a, ')');
        }
    }
}
