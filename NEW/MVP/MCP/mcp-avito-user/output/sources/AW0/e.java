package aw0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Law0/e;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f56797a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.android.short_term_rent.bookingform.domain.validation.a> f56798b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f56799c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@l String str, @k List<? extends com.avito.android.short_term_rent.bookingform.domain.validation.a> list, boolean z12) {
        this.f56797a = str;
        this.f56798b = list;
        this.f56799c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f56797a, eVar.f56797a) && L.f(this.f56798b, eVar.f56798b) && this.f56799c == eVar.f56799c;
    }

    public final int hashCode() {
        String str = this.f56797a;
        return Boolean.hashCode(this.f56799c) + H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f56798b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormInputData(value=");
        sb2.append(this.f56797a);
        sb2.append(", constraints=");
        sb2.append(this.f56798b);
        sb2.append(", reloadsForm=");
        return r.x(sb2, this.f56799c, ')');
    }
}
