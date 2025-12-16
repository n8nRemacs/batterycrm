package NP0;

import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GuestsParameter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNP0/a;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f11418a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PrintableText f11419b;

    public a(@Y61.k String str, @Y61.k PrintableText printableText) {
        this.f11418a = str;
        this.f11419b = printableText;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f11418a, aVar.f11418a) && L.f(this.f11419b, aVar.f11419b);
    }

    public final int hashCode() {
        return this.f11419b.hashCode() + (this.f11418a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Age(id=");
        sb2.append(this.f11418a);
        sb2.append(", title=");
        return AK.c.m(sb2, this.f11419b, ')');
    }
}
