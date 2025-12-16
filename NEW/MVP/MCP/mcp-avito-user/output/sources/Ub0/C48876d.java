package uB0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import wZ.k;

/* compiled from: TariffCpxInfoCardContentProgressItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuB0/d;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uB0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C48876d {

    /* renamed from: a, reason: collision with root package name */
    public final float f439845a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final k f439846b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final k f439847c;

    static {
        k.a aVar = k.f441571d;
    }

    public C48876d(float f12, @l k kVar, @l k kVar2) {
        this.f439845a = f12;
        this.f439846b = kVar;
        this.f439847c = kVar2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48876d)) {
            return false;
        }
        C48876d c48876d = (C48876d) obj;
        return Float.compare(this.f439845a, c48876d.f439845a) == 0 && L.f(this.f439846b, c48876d.f439846b) && L.f(this.f439847c, c48876d.f439847c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f439845a) * 31;
        k kVar = this.f439846b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        k kVar2 = this.f439847c;
        return iHashCode2 + (kVar2 != null ? kVar2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "TariffCpxInfoCardContentProgressItem(value=" + this.f439845a + ", fillColor=" + this.f439846b + ", emptyColor=" + this.f439847c + ')';
    }
}
