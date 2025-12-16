package Ry0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrCancellationSettingsResponse.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRy0/h;", "", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f14781a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final c f14782b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f14783c;

    public h(@k g gVar, @l c cVar, @k f fVar) {
        this.f14781a = gVar;
        this.f14782b = cVar;
        this.f14783c = fVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f14781a, hVar.f14781a) && L.f(this.f14782b, hVar.f14782b) && L.f(this.f14783c, hVar.f14783c);
    }

    public final int hashCode() {
        int iHashCode = this.f14781a.hashCode() * 31;
        c cVar = this.f14782b;
        return this.f14783c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "StrCancellationSettingsResponse(cancellationParametersInfo=" + this.f14781a + ", cancellationDiscountInfo=" + this.f14782b + ", explanations=" + this.f14783c + ')';
    }
}
