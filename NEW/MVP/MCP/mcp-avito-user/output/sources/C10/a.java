package C10;

import F10.a;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import x10.C49742a;
import y10.C50036a;

/* compiled from: InitialValuesModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LC10/a;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f1859a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f1860b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f1861c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.b f1862d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.C0271a f1863e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C50036a f1864f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C49742a f1865g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final C49742a f1866h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final x10.b f1867i;

    public a(long j12, @k String str, @k PrintableText printableText, @k a.b bVar, @k a.C0271a c0271a, @k C50036a c50036a, @k C49742a c49742a, @l C49742a c49742a2, @l x10.b bVar2) {
        this.f1859a = j12;
        this.f1860b = str;
        this.f1861c = printableText;
        this.f1862d = bVar;
        this.f1863e = c0271a;
        this.f1864f = c50036a;
        this.f1865g = c49742a;
        this.f1866h = c49742a2;
        this.f1867i = bVar2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1859a == aVar.f1859a && L.f(this.f1860b, aVar.f1860b) && L.f(this.f1861c, aVar.f1861c) && L.f(this.f1862d, aVar.f1862d) && L.f(this.f1863e, aVar.f1863e) && L.f(this.f1864f, aVar.f1864f) && L.f(this.f1865g, aVar.f1865g) && L.f(this.f1866h, aVar.f1866h) && L.f(this.f1867i, aVar.f1867i);
    }

    public final int hashCode() {
        int iHashCode = (this.f1865g.hashCode() + ((this.f1864f.hashCode() + ((this.f1863e.hashCode() + ((this.f1862d.hashCode() + com.avito.android.actions_sheet.a.f(this.f1861c, H.d(Long.hashCode(this.f1859a) * 31, 31, this.f1860b), 31)) * 31)) * 31)) * 31)) * 31;
        C49742a c49742a = this.f1866h;
        int iHashCode2 = (iHashCode + (c49742a == null ? 0 : c49742a.hashCode())) * 31;
        x10.b bVar = this.f1867i;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "InitialValuesModel(locationId=" + this.f1859a + ", purpose=" + this.f1860b + ", title=" + this.f1861c + ", propertyCostBasis=" + this.f1862d + ", monthlyPaymentBasis=" + this.f1863e + ", creditTerm=" + this.f1864f + ", primaryButton=" + this.f1865g + ", secondaryButton=" + this.f1866h + ", disclaimer=" + this.f1867i + ')';
    }
}
