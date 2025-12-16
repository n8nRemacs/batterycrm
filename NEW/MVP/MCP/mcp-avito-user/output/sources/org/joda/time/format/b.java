package org.joda.time.format;

import androidx.compose.ui.platform.C22491k0;
import java.io.IOException;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44868j;
import org.joda.time.C44866h;
import org.joda.time.chrono.x;

/* compiled from: DateTimeFormatter.java */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final n f420731a;

    /* renamed from: b, reason: collision with root package name */
    public final l f420732b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC44854a f420733c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC44868j f420734d;

    public b(n nVar, l lVar) {
        this.f420731a = nVar;
        this.f420732b = lVar;
        this.f420733c = null;
        this.f420734d = null;
    }

    public final d a() {
        return m.d(this.f420732b);
    }

    public final long b(String str) {
        String strA;
        l lVar = this.f420732b;
        if (lVar == null) {
            throw new UnsupportedOperationException("Parsing not supported");
        }
        C44866h.b bVar = C44866h.f420908a;
        AbstractC44854a abstractC44854aO = this.f420733c;
        AbstractC44854a abstractC44854aV = abstractC44854aO == null ? x.V() : abstractC44854aO;
        if (abstractC44854aO == null) {
            abstractC44854aO = abstractC44854aV;
        }
        AbstractC44868j abstractC44868j = this.f420734d;
        if (abstractC44868j != null) {
            abstractC44854aO = abstractC44854aO.O(abstractC44868j);
        }
        e eVar = new e(abstractC44854aO);
        int iB2 = lVar.b(eVar, str, 0);
        if (iB2 < 0) {
            iB2 = ~iB2;
        } else if (iB2 >= str.length()) {
            return eVar.b(str);
        }
        String string = str.toString();
        int i12 = i.f420790b;
        String strConcat = string.length() <= iB2 + 35 ? string : string.substring(0, iB2 + 32).concat("...");
        if (iB2 <= 0) {
            strA = C22491k0.a('\"', "Invalid format: \"", strConcat);
        } else if (iB2 >= string.length()) {
            strA = AK.c.k("Invalid format: \"", strConcat, "\" is too short");
        } else {
            StringBuilder sbA = androidx.appcompat.app.r.A("Invalid format: \"", strConcat, "\" is malformed at \"");
            sbA.append(strConcat.substring(iB2));
            sbA.append('\"');
            strA = sbA.toString();
        }
        throw new IllegalArgumentException(strA);
    }

    public final String c(org.joda.time.base.c cVar) {
        n nVar = this.f420731a;
        if (nVar == null) {
            throw new UnsupportedOperationException("Printing not supported");
        }
        StringBuilder sb2 = new StringBuilder(nVar.d());
        try {
            C44866h.b bVar = C44866h.f420908a;
            long millis = cVar.getMillis();
            AbstractC44854a abstractC44854aY = cVar.y();
            if (abstractC44854aY == null) {
                abstractC44854aY = x.V();
            }
            e(sb2, millis, abstractC44854aY);
        } catch (IOException unused) {
        }
        return sb2.toString();
    }

    public final String d(org.joda.time.base.e eVar) {
        n nVar = this.f420731a;
        if (nVar == null) {
            throw new UnsupportedOperationException("Printing not supported");
        }
        StringBuilder sb2 = new StringBuilder(nVar.d());
        if (nVar == null) {
            throw new UnsupportedOperationException("Printing not supported");
        }
        nVar.e(sb2, eVar, null);
        return sb2.toString();
    }

    public final void e(Appendable appendable, long j12, AbstractC44854a abstractC44854a) {
        n nVar = this.f420731a;
        if (nVar == null) {
            throw new UnsupportedOperationException("Printing not supported");
        }
        C44866h.b bVar = C44866h.f420908a;
        AbstractC44854a abstractC44854aV = abstractC44854a == null ? x.V() : abstractC44854a;
        AbstractC44854a abstractC44854a2 = this.f420733c;
        if (abstractC44854a2 != null) {
            abstractC44854aV = abstractC44854a2;
        }
        AbstractC44868j abstractC44868j = this.f420734d;
        if (abstractC44868j != null) {
            abstractC44854aV = abstractC44854aV.O(abstractC44868j);
        }
        AbstractC44868j abstractC44868jO = abstractC44854aV.o();
        int i12 = abstractC44868jO.i(j12);
        long j13 = i12;
        long j14 = j12 + j13;
        if ((j12 ^ j14) < 0 && (j13 ^ j12) >= 0) {
            abstractC44868jO = AbstractC44868j.f420911c;
            i12 = 0;
            j14 = j12;
        }
        nVar.c(appendable, j14, abstractC44854aV.N(), i12, abstractC44868jO, null);
    }

    public final b f(AbstractC44854a abstractC44854a) {
        if (this.f420733c == abstractC44854a) {
            return this;
        }
        return new b(this.f420731a, this.f420732b, abstractC44854a, this.f420734d);
    }

    public final b g() {
        AbstractC44868j abstractC44868j = AbstractC44868j.f420911c;
        return this.f420734d == abstractC44868j ? this : new b(this.f420731a, this.f420732b, this.f420733c, abstractC44868j);
    }

    public b(n nVar, l lVar, AbstractC44854a abstractC44854a, AbstractC44868j abstractC44868j) {
        this.f420731a = nVar;
        this.f420732b = lVar;
        this.f420733c = abstractC44854a;
        this.f420734d = abstractC44868j;
    }
}
