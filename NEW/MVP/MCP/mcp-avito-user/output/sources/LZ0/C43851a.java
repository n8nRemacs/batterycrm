package lz0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersTab.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llz0/a;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C43851a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PrintableText f414254a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f414255b;

    public C43851a(@k String str, @k PrintableText printableText) {
        this.f414254a = printableText;
        this.f414255b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43851a)) {
            return false;
        }
        C43851a c43851a = (C43851a) obj;
        return L.f(this.f414254a, c43851a.f414254a) && L.f(this.f414255b, c43851a.f414255b);
    }

    public final int hashCode() {
        return this.f414255b.hashCode() + (this.f414254a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersTab(title=");
        sb2.append(this.f414254a);
        sb2.append(", shortcut=");
        return C22026a.c(sb2, this.f414255b, ')');
    }
}
