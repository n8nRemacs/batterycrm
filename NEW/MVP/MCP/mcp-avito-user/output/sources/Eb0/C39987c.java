package eB0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CprConfigureAdvanceManualDomainModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeB0/c;", "", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eB0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C39987c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f395052a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f395053b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f395054c;

    public C39987c(@k String str, @k String str2, @k String str3) {
        this.f395052a = str;
        this.f395053b = str2;
        this.f395054c = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39987c)) {
            return false;
        }
        C39987c c39987c = (C39987c) obj;
        return L.f(this.f395052a, c39987c.f395052a) && L.f(this.f395053b, c39987c.f395053b) && L.f(this.f395054c, c39987c.f395054c);
    }

    public final int hashCode() {
        return this.f395054c.hashCode() + H.d(this.f395052a.hashCode() * 31, 31, this.f395053b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessagePatternPluralsDomainModel(one=");
        sb2.append(this.f395052a);
        sb2.append(", few=");
        sb2.append(this.f395053b);
        sb2.append(", other=");
        return C22026a.c(sb2, this.f395054c, ')');
    }
}
