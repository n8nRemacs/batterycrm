package Tz0;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersCalendarResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTz0/b;", "", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Tz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C15428b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f16037a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f16038b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final i f16039c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final j f16040d;

    public C15428b(@Y61.k String str, @Y61.k String str2, @Y61.k i iVar, @Y61.k j jVar) {
        this.f16037a = str;
        this.f16038b = str2;
        this.f16039c = iVar;
        this.f16040d = jVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15428b)) {
            return false;
        }
        C15428b c15428b = (C15428b) obj;
        return L.f(this.f16037a, c15428b.f16037a) && L.f(this.f16038b, c15428b.f16038b) && L.f(this.f16039c, c15428b.f16039c) && L.f(this.f16040d, c15428b.f16040d);
    }

    public final int hashCode() {
        return this.f16040d.hashCode() + ((this.f16039c.hashCode() + H.d(this.f16037a.hashCode() * 31, 31, this.f16038b)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "StrOrdersCalendarCellInfo(id=" + this.f16037a + ", date=" + this.f16038b + ", footer=" + this.f16039c + ", priceInfo=" + this.f16040d + ')';
    }
}
