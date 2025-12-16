package NP0;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersOnboarding.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNP0/s;", "LNP0/q;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class s implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final r f11514a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f11515b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f11516c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11517d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f11518e;

    public s(@Y61.k r rVar, @Y61.l String str, @Y61.l String str2, boolean z12, @Y61.k String str3) {
        this.f11514a = rVar;
        this.f11515b = str;
        this.f11516c = str2;
        this.f11517d = z12;
        this.f11518e = str3;
    }

    @Override // NP0.q
    @Y61.k
    /* renamed from: A1, reason: from getter */
    public final String getF11518e() {
        return this.f11518e;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return L.f(this.f11514a, sVar.f11514a) && L.f(this.f11515b, sVar.f11515b) && L.f(this.f11516c, sVar.f11516c) && this.f11517d == sVar.f11517d && L.f(this.f11518e, sVar.f11518e);
    }

    @Override // NP0.q
    @Y61.k
    /* renamed from: getType, reason: from getter */
    public final r getF11514a() {
        return this.f11514a;
    }

    public final int hashCode() {
        int iHashCode = this.f11514a.hashCode() * 31;
        String str = this.f11515b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11516c;
        return this.f11518e.hashCode() + androidx.appcompat.app.r.i((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f11517d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WidgetFiltersTooltipOnboarding(type=");
        sb2.append(this.f11514a);
        sb2.append(", title=");
        sb2.append(this.f11515b);
        sb2.append(", description=");
        sb2.append(this.f11516c);
        sb2.append(", isCloseButtonVisible=");
        sb2.append(this.f11517d);
        sb2.append(", idempotencyKey=");
        return C22026a.c(sb2, this.f11518e, ')');
    }
}
