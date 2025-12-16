package sB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxConfigureLevelsState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsB0/a;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sB0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C48023a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Float f437507a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final b f437508b;

    public C48023a(@l Float f12, @l b bVar) {
        this.f437507a = f12;
        this.f437508b = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48023a)) {
            return false;
        }
        C48023a c48023a = (C48023a) obj;
        return L.f(this.f437507a, c48023a.f437507a) && L.f(this.f437508b, c48023a.f437508b);
    }

    public final int hashCode() {
        Float f12 = this.f437507a;
        int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
        b bVar = this.f437508b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AppBar(progress=" + this.f437507a + ", button=" + this.f437508b + ')';
    }
}
