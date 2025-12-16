package NP0;

import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GuestsParameter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNP0/f;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f11441a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PrintableText f11442b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final PrintableText f11443c;

    public f(@Y61.k PrintableText printableText, @Y61.l PrintableText printableText2, @Y61.k String str) {
        this.f11441a = str;
        this.f11442b = printableText;
        this.f11443c = printableText2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f11441a, fVar.f11441a) && L.f(this.f11442b, fVar.f11442b) && L.f(this.f11443c, fVar.f11443c);
    }

    public final int hashCode() {
        int iF2 = com.avito.android.actions_sheet.a.f(this.f11442b, this.f11441a.hashCode() * 31, 31);
        PrintableText printableText = this.f11443c;
        return iF2 + (printableText == null ? 0 : printableText.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Child(ageId=");
        sb2.append(this.f11441a);
        sb2.append(", title=");
        sb2.append(this.f11442b);
        sb2.append(", description=");
        return AK.c.m(sb2, this.f11443c, ')');
    }
}
