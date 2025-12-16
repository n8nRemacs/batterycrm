package SZ;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import j.InterfaceC42150f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationsListState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LSZ/d;", "", "a", "b", "c", "LSZ/d$a;", "LSZ/d$b;", "LSZ/d$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d {

    /* compiled from: ApplicationsListState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSZ/d$a;", "LSZ/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<TV0.a> f15064a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k List<? extends TV0.a> list) {
            this.f15064a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f15064a, ((a) obj).f15064a);
        }

        public final int hashCode() {
            return this.f15064a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Content(items="), this.f15064a, ')');
        }
    }

    /* compiled from: ApplicationsListState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSZ/d$b;", "LSZ/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f15065a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f15066b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15067c;

        public b(@InterfaceC42150f int i12, @k PrintableText printableText, @k PrintableText printableText2) {
            this.f15065a = printableText;
            this.f15066b = printableText2;
            this.f15067c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f15065a.equals(bVar.f15065a) && this.f15066b.equals(bVar.f15066b) && this.f15067c == bVar.f15067c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f15067c) + com.avito.android.actions_sheet.a.f(this.f15066b, this.f15065a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(errorMessage=");
            sb2.append(this.f15065a);
            sb2.append(", errorSubtitle=");
            sb2.append(this.f15066b);
            sb2.append(", errorIconAttr=");
            return r.t(sb2, this.f15067c, ')');
        }
    }

    /* compiled from: ApplicationsListState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSZ/d$c;", "LSZ/d;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f15068a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1093702807;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
