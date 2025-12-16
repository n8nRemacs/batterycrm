package x10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.F3;
import com.avito.android.mortgage_calculator.internal.items.DisclaimerDescription;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DisclaimerItem.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx10/b;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f442085a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DisclaimerDescription f442086b;

    public b(@k c cVar, @k DisclaimerDescription disclaimerDescription) {
        this.f442085a = cVar;
        this.f442086b = disclaimerDescription;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f442085a, bVar.f442085a) && L.f(this.f442086b, bVar.f442086b);
    }

    public final int hashCode() {
        return this.f442086b.hashCode() + (this.f442085a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "DisclaimerItem(text=" + this.f442085a + ", description=" + this.f442086b + ')';
    }
}
