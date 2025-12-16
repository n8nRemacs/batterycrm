package Ov;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryRegion.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOv/f;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f12682a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f12683b;

    public f(@Y61.k String str, @Y61.k ArrayList arrayList) {
        this.f12682a = str;
        this.f12683b = arrayList;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f12682a, fVar.f12682a) && this.f12683b.equals(fVar.f12683b);
    }

    public final int hashCode() {
        return this.f12683b.hashCode() + (this.f12682a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryRegion(name=");
        sb2.append(this.f12682a);
        sb2.append(", locations=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f12683b, ')');
    }
}
