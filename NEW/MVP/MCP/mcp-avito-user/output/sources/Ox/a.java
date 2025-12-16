package OX;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: MandatoryVerificationStartResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOX/a;", "", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12299a;

    public a(boolean z12) {
        this.f12299a = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f12299a == ((a) obj).f12299a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12299a);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("MandatoryVerificationStartResponse(success="), this.f12299a, ')');
    }
}
