package pq0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectDistrictsState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lpq0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "d", "Lpq0/c$a;", "Lpq0/c$b;", "Lpq0/c$c;", "Lpq0/c$d;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class c extends q {

    /* compiled from: SelectDistrictsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpq0/c$a;", "Lpq0/c;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f428808b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f428809c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f428810d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final PrintableText f428811e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Integer f428812f;

        public /* synthetic */ a(List list, boolean z12, boolean z13, PrintableText printableText, Integer num, int i12, C42822w c42822w) {
            this(list, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? null : printableText, (i12 & 16) != 0 ? null : num);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f428808b, aVar.f428808b) && this.f428809c == aVar.f428809c && this.f428810d == aVar.f428810d && L.f(this.f428811e, aVar.f428811e) && L.f(this.f428812f, aVar.f428812f);
        }

        public final int hashCode() {
            int i12 = r.i(r.i(this.f428808b.hashCode() * 31, 31, this.f428809c), 31, this.f428810d);
            PrintableText printableText = this.f428811e;
            int iHashCode = (i12 + (printableText == null ? 0 : printableText.hashCode())) * 31;
            Integer num = this.f428812f;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(items=");
            sb2.append(this.f428808b);
            sb2.append(", isSearch=");
            sb2.append(this.f428809c);
            sb2.append(", isClearButtonEnabled=");
            sb2.append(this.f428810d);
            sb2.append(", mainButtonTitle=");
            sb2.append(this.f428811e);
            sb2.append(", scrollToItemPosition=");
            return s.j(sb2, this.f428812f, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k List<? extends com.avito.conveyor_item.a> list, boolean z12, boolean z13, @l PrintableText printableText, @l Integer num) {
            super(null);
            this.f428808b = list;
            this.f428809c = z12;
            this.f428810d = z13;
            this.f428811e = printableText;
            this.f428812f = num;
        }
    }

    /* compiled from: SelectDistrictsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpq0/c$b;", "Lpq0/c;", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f428813b = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -911664546;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: SelectDistrictsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpq0/c$c;", "Lpq0/c;", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pq0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12294c extends c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C12294c f428814b = new C12294c();

        public C12294c() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12294c);
        }

        public final int hashCode() {
            return 1879338002;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: SelectDistrictsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpq0/c$d;", "Lpq0/c;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f428815b;

        public d() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f428815b == ((d) obj).f428815b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f428815b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ShowSearchEmptyStub(isClearButtonEnabled="), this.f428815b, ')');
        }

        public d(boolean z12) {
            super(null);
            this.f428815b = z12;
        }

        public /* synthetic */ d(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }
}
