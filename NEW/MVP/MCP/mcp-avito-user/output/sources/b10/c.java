package B10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.F3;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RequirementsBlock.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB10/c;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f796a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f797b;

    public c(@k String str, @k ArrayList arrayList) {
        this.f796a = str;
        this.f797b = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f796a, cVar.f796a) && this.f797b.equals(cVar.f797b);
    }

    public final int hashCode() {
        return this.f797b.hashCode() + (this.f796a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RequirementsBlock(title=");
        sb2.append(this.f796a);
        sb2.append(", requirements=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f797b, ')');
    }
}
