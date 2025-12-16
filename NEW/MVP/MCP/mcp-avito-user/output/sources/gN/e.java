package gn;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CartSheetAfterAddingState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lgn/e;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class e extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f396817g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final e f396818h = new e(null, null, null, null, null, 31, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f396819b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f396820c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final h f396821d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Map<String, Object> f396822e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C40709a f396823f;

    /* compiled from: CartSheetAfterAddingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgn/e$a;", "", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e() {
        this(null, null, null, null, null, 31, null);
    }

    public static e a(e eVar, PrintableText printableText, g gVar, h hVar, Map map, C40709a c40709a, int i12) {
        if ((i12 & 1) != 0) {
            printableText = eVar.f396819b;
        }
        PrintableText printableText2 = printableText;
        if ((i12 & 2) != 0) {
            gVar = eVar.f396820c;
        }
        g gVar2 = gVar;
        if ((i12 & 4) != 0) {
            hVar = eVar.f396821d;
        }
        h hVar2 = hVar;
        if ((i12 & 8) != 0) {
            map = eVar.f396822e;
        }
        Map map2 = map;
        if ((i12 & 16) != 0) {
            c40709a = eVar.f396823f;
        }
        eVar.getClass();
        return new e(printableText2, gVar2, hVar2, map2, c40709a);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f396819b, eVar.f396819b) && L.f(this.f396820c, eVar.f396820c) && L.f(this.f396821d, eVar.f396821d) && L.f(this.f396822e, eVar.f396822e) && L.f(this.f396823f, eVar.f396823f);
    }

    public final int hashCode() {
        int iHashCode = (this.f396820c.hashCode() + (this.f396819b.hashCode() * 31)) * 31;
        h hVar = this.f396821d;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        Map<String, Object> map = this.f396822e;
        return this.f396823f.hashCode() + ((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "CartSheetAfterAddingState(screenTitle=" + this.f396819b + ", mainItem=" + this.f396820c + ", recommendations=" + this.f396821d + ", analyticsData=" + this.f396822e + ", bottomForm=" + this.f396823f + ')';
    }

    public /* synthetic */ e(PrintableText printableText, g gVar, h hVar, Map map, C40709a c40709a, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? com.avito.android.printable_text.b.a() : printableText, (i12 & 2) != 0 ? new g(null, null, null, null, null, null, null, null, null, null, 1023, null) : gVar, (i12 & 4) != 0 ? null : hVar, (i12 & 8) != 0 ? null : map, (i12 & 16) != 0 ? new C40709a(null) : c40709a);
    }

    public e(@k PrintableText printableText, @k g gVar, @l h hVar, @l Map<String, ? extends Object> map, @k C40709a c40709a) {
        this.f396819b = printableText;
        this.f396820c = gVar;
        this.f396821d = hVar;
        this.f396822e = map;
        this.f396823f = c40709a;
    }
}
