package Tz0;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersCalendarResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTz0/i;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C15429c f16063a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16064b;

    public i(@Y61.k C15429c c15429c, int i12) {
        this.f16063a = c15429c;
        this.f16064b = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f16063a, iVar.f16063a) && this.f16064b == iVar.f16064b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16064b) + (this.f16063a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersCalendarPriceFooter(features=");
        sb2.append(this.f16063a);
        sb2.append(", minNights=");
        return r.t(sb2, this.f16064b, ')');
    }
}
