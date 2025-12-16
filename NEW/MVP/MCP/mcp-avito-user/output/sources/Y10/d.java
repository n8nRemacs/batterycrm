package y10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputItem.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly10/d;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C50038c f442849a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C50038c f442850b;

    /* renamed from: c, reason: collision with root package name */
    public final float f442851c;

    public d(@k C50038c c50038c, @k C50038c c50038c2, float f12) {
        this.f442849a = c50038c;
        this.f442850b = c50038c2;
        this.f442851c = f12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f442849a, dVar.f442849a) && L.f(this.f442850b, dVar.f442850b) && Float.compare(this.f442851c, dVar.f442851c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f442851c) + ((this.f442850b.hashCode() + (this.f442849a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SliderValue(min=");
        sb2.append(this.f442849a);
        sb2.append(", max=");
        sb2.append(this.f442850b);
        sb2.append(", value=");
        return r.k(')', this.f442851c, sb2);
    }
}
