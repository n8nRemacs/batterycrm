package Ov;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TarifikatorSettings.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOv/n;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f12699a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<f> f12700b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Map<Long, g> f12701c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Map<Long, h> f12702d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12703e;

    public n(@Y61.k j jVar, @Y61.k List<f> list, @Y61.k Map<Long, g> map, @Y61.k Map<Long, h> map2, boolean z12) {
        this.f12699a = jVar;
        this.f12700b = list;
        this.f12701c = map;
        this.f12702d = map2;
        this.f12703e = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.f12699a, nVar.f12699a) && L.f(this.f12700b, nVar.f12700b) && L.f(this.f12701c, nVar.f12701c) && L.f(this.f12702d, nVar.f12702d) && this.f12703e == nVar.f12703e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12703e) + AK.c.c(AK.c.c(H.e(this.f12699a.hashCode() * 31, 31, this.f12700b), 31, this.f12701c), 31, this.f12702d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TarifikatorSettings(config=");
        sb2.append(this.f12699a);
        sb2.append(", regions=");
        sb2.append(this.f12700b);
        sb2.append(", locationSettings=");
        sb2.append(this.f12701c);
        sb2.append(", invalidSettings=");
        sb2.append(this.f12702d);
        sb2.append(", hasChanges=");
        return r.x(sb2, this.f12703e, ')');
    }
}
