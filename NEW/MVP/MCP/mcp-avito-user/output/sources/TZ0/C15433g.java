package Tz0;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersCalendarResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTz0/g;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tz0.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C15433g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f16054a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C15432f f16055b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<C15428b> f16056c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<C15430d> f16057d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<C15434h> f16058e;

    public C15433g(@Y61.k String str, @Y61.k C15432f c15432f, @Y61.k List<C15428b> list, @Y61.k List<C15430d> list2, @Y61.k List<C15434h> list3) {
        this.f16054a = str;
        this.f16055b = c15432f;
        this.f16056c = list;
        this.f16057d = list2;
        this.f16058e = list3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15433g)) {
            return false;
        }
        C15433g c15433g = (C15433g) obj;
        return L.f(this.f16054a, c15433g.f16054a) && L.f(this.f16055b, c15433g.f16055b) && L.f(this.f16056c, c15433g.f16056c) && L.f(this.f16057d, c15433g.f16057d) && L.f(this.f16058e, c15433g.f16058e);
    }

    public final int hashCode() {
        return this.f16058e.hashCode() + H.e(H.e((this.f16055b.hashCode() + (this.f16054a.hashCode() * 31)) * 31, 31, this.f16056c), 31, this.f16057d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrOrdersCalendarListItem(id=");
        sb2.append(this.f16054a);
        sb2.append(", mainInfo=");
        sb2.append(this.f16055b);
        sb2.append(", cellInfos=");
        sb2.append(this.f16056c);
        sb2.append(", disabledIntervals=");
        sb2.append(this.f16057d);
        sb2.append(", orders=");
        return H.p(sb2, this.f16058e, ')');
    }
}
