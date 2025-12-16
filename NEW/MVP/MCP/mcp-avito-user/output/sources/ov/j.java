package Ov;

import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: SettingsConfig.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOv/j;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f12694a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12695b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12696c;

    public j(long j12, long j13, boolean z12) {
        this.f12694a = j12;
        this.f12695b = j13;
        this.f12696c = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f12694a == jVar.f12694a && this.f12695b == jVar.f12695b && this.f12696c == jVar.f12696c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12696c) + r.g(Long.hashCode(this.f12694a) * 31, 31, this.f12695b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SettingsConfig(maxPrice=");
        sb2.append(this.f12694a);
        sb2.append(", maxDeliveryDays=");
        sb2.append(this.f12695b);
        sb2.append(", hasDeliveryDays=");
        return r.x(sb2, this.f12696c, ')');
    }
}
