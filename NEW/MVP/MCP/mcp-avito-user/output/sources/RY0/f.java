package Ry0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrCancellationSettingsResponse.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRy0/f;", "", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f14774a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f14775b;

    public f(@k String str, @k e eVar) {
        this.f14774a = str;
        this.f14775b = eVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f14774a, fVar.f14774a) && L.f(this.f14775b, fVar.f14775b);
    }

    public final int hashCode() {
        return this.f14775b.hashCode() + (this.f14774a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "StrCancellationExplanationsInfo(title=" + this.f14774a + ", blocks=" + this.f14775b + ')';
    }
}
