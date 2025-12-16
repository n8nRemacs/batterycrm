package Ry0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrCancellationSettingsResponse.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRy0/c;", "", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f14765a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f14766b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14767c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C15096a f14768d;

    public c(@k String str, @k String str2, boolean z12, @k C15096a c15096a) {
        this.f14765a = str;
        this.f14766b = str2;
        this.f14767c = z12;
        this.f14768d = c15096a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f14765a, cVar.f14765a) && L.f(this.f14766b, cVar.f14766b) && this.f14767c == cVar.f14767c && L.f(this.f14768d, cVar.f14768d);
    }

    public final int hashCode() {
        return this.f14768d.hashCode() + r.i(H.d(this.f14765a.hashCode() * 31, 31, this.f14766b), 31, this.f14767c);
    }

    @k
    public final String toString() {
        return "StrCancellationDiscountInfo(title=" + this.f14765a + ", subtitle=" + this.f14766b + ", discountEnabled=" + this.f14767c + ", input=" + this.f14768d + ')';
    }
}
