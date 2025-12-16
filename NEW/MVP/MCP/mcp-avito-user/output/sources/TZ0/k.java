package Tz0;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: StrOrdersCalendarResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTz0/k;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f16067a;

    public k(@Y61.k ArrayList arrayList) {
        this.f16067a = arrayList;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f16067a.equals(((k) obj).f16067a);
    }

    public final int hashCode() {
        return this.f16067a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("StrOrdersCalendarResponseV2(list="), this.f16067a, ')');
    }
}
