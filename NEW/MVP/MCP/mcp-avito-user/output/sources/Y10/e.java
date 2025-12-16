package y10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputItem.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly10/e;", "", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f442852a;

    /* renamed from: b, reason: collision with root package name */
    public final long f442853b;

    public e(@k String str, long j12) {
        this.f442852a = str;
        this.f442853b = j12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f442852a, eVar.f442852a) && this.f442853b == eVar.f442853b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f442853b) + (this.f442852a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StringValueProperty(stringValue=");
        sb2.append(this.f442852a);
        sb2.append(", value=");
        return r.u(sb2, this.f442853b, ')');
    }
}
