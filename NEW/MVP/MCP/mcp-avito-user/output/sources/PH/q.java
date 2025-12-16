package pH;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigSlotOneTimeEvent.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LpH/q;", "", "<init>", "()V", "a", "b", "c", "LpH/q$a;", "LpH/q$b;", "LpH/q$c;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class q {

    /* compiled from: GigSlotOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/q$a;", "LpH/q;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f428419a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<String> f428420b;

        public a(@Y61.k PrintableText printableText, @Y61.k List<String> list) {
            super(null);
            this.f428419a = printableText;
            this.f428420b = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f428419a, aVar.f428419a) && L.f(this.f428420b, aVar.f428420b);
        }

        public final int hashCode() {
            return this.f428420b.hashCode() + (this.f428419a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenItemDetailsDialog(title=");
            sb2.append(this.f428419a);
            sb2.append(", items=");
            return H.p(sb2, this.f428420b, ')');
        }
    }

    /* compiled from: GigSlotOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/q$b;", "LpH/q;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f428421a;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f428421a, ((b) obj).f428421a);
        }

        public final int hashCode() {
            String str = this.f428421a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToast(message="), this.f428421a, ')');
        }

        public b(@Y61.l String str) {
            super(null);
            this.f428421a = str;
        }

        public /* synthetic */ b(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: GigSlotOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpH/q$c;", "LpH/q;", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f428422a;

        public c(@Y61.k String str) {
            super(null);
            this.f428422a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f428422a, ((c) obj).f428422a);
        }

        public final int hashCode() {
            return this.f428422a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToast(text="), this.f428422a, ')');
        }
    }

    public /* synthetic */ q(C42822w c42822w) {
        this();
    }

    public q() {
    }
}
