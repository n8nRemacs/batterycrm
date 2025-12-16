package eB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CprConfigureAdvanceManualDomainModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeB0/a;", "", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eB0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C39985a {

    /* renamed from: a, reason: collision with root package name */
    public final float f395046a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f395047b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f395048c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f395049d;

    public C39985a(float f12, @l String str, @l String str2, @k String str3) {
        this.f395046a = f12;
        this.f395047b = str;
        this.f395048c = str2;
        this.f395049d = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39985a)) {
            return false;
        }
        C39985a c39985a = (C39985a) obj;
        return Float.compare(this.f395046a, c39985a.f395046a) == 0 && L.f(this.f395047b, c39985a.f395047b) && L.f(this.f395048c, c39985a.f395048c) && L.f(this.f395049d, c39985a.f395049d);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f395046a) * 31;
        String str = this.f395047b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f395048c;
        return this.f395049d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvanceDomainModel(minValue=");
        sb2.append(this.f395046a);
        sb2.append(", minValueMessage=");
        sb2.append(this.f395047b);
        sb2.append(", placeholder=");
        sb2.append(this.f395048c);
        sb2.append(", currency=");
        return C22026a.c(sb2, this.f395049d, ')');
    }
}
