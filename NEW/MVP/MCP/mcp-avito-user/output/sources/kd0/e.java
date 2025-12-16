package Kd0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FieldState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKd0/e;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f9562a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9563b;

    public e(@k String str, boolean z12) {
        this.f9562a = str;
        this.f9563b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f9562a, eVar.f9562a) && this.f9563b && eVar.f9563b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9563b) + (this.f9562a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FieldState(value=");
        sb2.append(this.f9562a);
        sb2.append(", isValid=");
        return r.x(sb2, this.f9563b, ')');
    }

    public /* synthetic */ e(String str, boolean z12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? true : z12);
    }
}
