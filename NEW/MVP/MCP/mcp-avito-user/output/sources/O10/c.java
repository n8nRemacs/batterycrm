package O10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: MortgageCategoryHeader.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LO10/c;", "", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f11915a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11916b;

    public c(int i12, @k ArrayList arrayList) {
        this.f11915a = arrayList;
        this.f11916b = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11915a.equals(cVar.f11915a) && this.f11916b == cVar.f11916b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11916b) + (this.f11915a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageCategoryHeader(steps=");
        sb2.append(this.f11915a);
        sb2.append(", selectedStepIdx=");
        return r.t(sb2, this.f11916b, ')');
    }
}
