package NP0;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FlexSearchParameter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNP0/h;", "", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f11455a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f11456b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11457c;

    public h(int i12, @Y61.k String str, boolean z12) {
        this.f11455a = i12;
        this.f11456b = str;
        this.f11457c = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f11455a == hVar.f11455a && L.f(this.f11456b, hVar.f11456b) && this.f11457c == hVar.f11457c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11457c) + H.d(Integer.hashCode(this.f11455a) * 31, 31, this.f11456b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlexSearchOption(id=");
        sb2.append(this.f11455a);
        sb2.append(", title=");
        sb2.append(this.f11456b);
        sb2.append(", hasPlaceholder=");
        return androidx.appcompat.app.r.x(sb2, this.f11457c, ')');
    }
}
