package y10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputItem.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly10/c;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y10.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C50038c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PrintableText f442847a;

    /* renamed from: b, reason: collision with root package name */
    public final float f442848b;

    public C50038c(@k PrintableText printableText, float f12) {
        this.f442847a = printableText;
        this.f442848b = f12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50038c)) {
            return false;
        }
        C50038c c50038c = (C50038c) obj;
        return L.f(this.f442847a, c50038c.f442847a) && Float.compare(this.f442848b, c50038c.f442848b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f442848b) + (this.f442847a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PrintableValueProperty(printableValue=");
        sb2.append(this.f442847a);
        sb2.append(", value=");
        return r.k(')', this.f442848b, sb2);
    }
}
