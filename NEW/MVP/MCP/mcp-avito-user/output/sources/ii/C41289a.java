package iI;

import AK.c;
import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Age.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiI/a;", "", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iI.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C41289a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f398464a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f398465b;

    public C41289a(@k String str, @k PrintableText printableText) {
        this.f398464a = str;
        this.f398465b = printableText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41289a)) {
            return false;
        }
        C41289a c41289a = (C41289a) obj;
        return L.f(this.f398464a, c41289a.f398464a) && L.f(this.f398465b, c41289a.f398465b);
    }

    public final int hashCode() {
        return this.f398465b.hashCode() + (this.f398464a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Age(id=");
        sb2.append(this.f398464a);
        sb2.append(", title=");
        return c.m(sb2, this.f398465b, ')');
    }
}
