package org.joda.time.field;

import androidx.compose.runtime.C22026a;
import java.util.Locale;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;
import org.joda.time.IllegalFieldValueException;

/* compiled from: BaseDateTimeField.java */
/* loaded from: classes7.dex */
public abstract class c extends AbstractC44864f {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC44865g f420689b;

    public c(AbstractC44865g abstractC44865g) {
        if (abstractC44865g == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.f420689b = abstractC44865g;
    }

    @Override // org.joda.time.AbstractC44864f
    public final boolean B() {
        return true;
    }

    @Override // org.joda.time.AbstractC44864f
    public long C(long j12) {
        return j12 - F(j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public long E(long j12) {
        long jF2 = F(j12);
        return jF2 != j12 ? a(1, jF2) : j12;
    }

    @Override // org.joda.time.AbstractC44864f
    public long H(long j12, String str, Locale locale) {
        return G(J(str, locale), j12);
    }

    public int J(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new IllegalFieldValueException(this.f420689b, str);
        }
    }

    @Override // org.joda.time.AbstractC44864f
    public long a(int i12, long j12) {
        return k().a(i12, j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public long b(long j12, long j13) {
        return k().b(j12, j13);
    }

    @Override // org.joda.time.AbstractC44864f
    public String d(int i12, Locale locale) {
        return g(i12, locale);
    }

    @Override // org.joda.time.AbstractC44864f
    public String e(long j12, Locale locale) {
        return d(c(j12), locale);
    }

    @Override // org.joda.time.AbstractC44864f
    public final String f(org.joda.time.base.e eVar, Locale locale) {
        return d(eVar.I1(this.f420689b), locale);
    }

    @Override // org.joda.time.AbstractC44864f
    public String g(int i12, Locale locale) {
        return Integer.toString(i12);
    }

    @Override // org.joda.time.AbstractC44864f
    public String h(long j12, Locale locale) {
        return g(c(j12), locale);
    }

    @Override // org.joda.time.AbstractC44864f
    public final String i(org.joda.time.base.e eVar, Locale locale) {
        return g(eVar.I1(this.f420689b), locale);
    }

    @Override // org.joda.time.AbstractC44864f
    public AbstractC44871m l() {
        return null;
    }

    @Override // org.joda.time.AbstractC44864f
    public int m(Locale locale) {
        int iN2 = n();
        if (iN2 >= 0) {
            if (iN2 < 10) {
                return 1;
            }
            if (iN2 < 100) {
                return 2;
            }
            if (iN2 < 1000) {
                return 3;
            }
        }
        return Integer.toString(iN2).length();
    }

    @Override // org.joda.time.AbstractC44864f
    public int o(long j12) {
        return n();
    }

    @Override // org.joda.time.AbstractC44864f
    public int p(org.joda.time.base.k kVar) {
        return n();
    }

    @Override // org.joda.time.AbstractC44864f
    public int q(org.joda.time.base.k kVar, int[] iArr) {
        return p(kVar);
    }

    @Override // org.joda.time.AbstractC44864f
    public int t(long j12) {
        return s();
    }

    public final String toString() {
        return C22026a.c(new StringBuilder("DateTimeField["), this.f420689b.f420904b, ']');
    }

    @Override // org.joda.time.AbstractC44864f
    public int u(org.joda.time.base.k kVar) {
        return s();
    }

    @Override // org.joda.time.AbstractC44864f
    public int v(org.joda.time.base.k kVar, int[] iArr) {
        return u(kVar);
    }

    @Override // org.joda.time.AbstractC44864f
    public final String w() {
        return this.f420689b.f420904b;
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44865g y() {
        return this.f420689b;
    }

    @Override // org.joda.time.AbstractC44864f
    public boolean z(long j12) {
        return false;
    }
}
