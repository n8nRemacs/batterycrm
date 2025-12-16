package E10;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import x10.C49742a;

/* compiled from: CalculatorViewState.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE10/e;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PrintableText f3698a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<d> f3699b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f3700c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final G10.b f3701d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C49742a f3702e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C49742a f3703f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final x10.b f3704g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final b f3705h;

    public e(@k PrintableText printableText, @k List<d> list, @k a aVar, @k G10.b bVar, @k C49742a c49742a, @l C49742a c49742a2, @l x10.b bVar2, @k b bVar3) {
        this.f3698a = printableText;
        this.f3699b = list;
        this.f3700c = aVar;
        this.f3701d = bVar;
        this.f3702e = c49742a;
        this.f3703f = c49742a2;
        this.f3704g = bVar2;
        this.f3705h = bVar3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f3698a, eVar.f3698a) && L.f(this.f3699b, eVar.f3699b) && L.f(this.f3700c, eVar.f3700c) && L.f(this.f3701d, eVar.f3701d) && L.f(this.f3702e, eVar.f3702e) && L.f(this.f3703f, eVar.f3703f) && L.f(this.f3704g, eVar.f3704g) && L.f(this.f3705h, eVar.f3705h);
    }

    public final int hashCode() {
        int iHashCode = (this.f3702e.hashCode() + ((this.f3701d.hashCode() + ((this.f3700c.hashCode() + H.e(this.f3698a.hashCode() * 31, 31, this.f3699b)) * 31)) * 31)) * 31;
        C49742a c49742a = this.f3703f;
        int iHashCode2 = (iHashCode + (c49742a == null ? 0 : c49742a.hashCode())) * 31;
        x10.b bVar = this.f3704g;
        return this.f3705h.hashCode() + ((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "CalculatorViewState(title=" + this.f3698a + ", tabs=" + this.f3699b + ", form=" + this.f3700c + ", offers=" + this.f3701d + ", primaryButton=" + this.f3702e + ", secondaryButton=" + this.f3703f + ", disclaimer=" + this.f3704g + ", loadingState=" + this.f3705h + ')';
    }
}
