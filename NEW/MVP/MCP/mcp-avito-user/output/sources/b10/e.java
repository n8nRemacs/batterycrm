package B10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TitleStringValueBlock.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB10/e;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f800a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f801b;

    public e(@k String str, @k String str2) {
        this.f800a = str;
        this.f801b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f800a, eVar.f800a) && L.f(this.f801b, eVar.f801b);
    }

    public final int hashCode() {
        return this.f801b.hashCode() + (this.f800a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TitleStringValueBlock(title=");
        sb2.append(this.f800a);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f801b, ')');
    }
}
