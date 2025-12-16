package org.joda.time.format;

import java.util.Arrays;
import java.util.Locale;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44868j;
import org.joda.time.AbstractC44871m;
import org.joda.time.AbstractC44872n;
import org.joda.time.C44866h;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.chrono.x;

/* compiled from: DateTimeParserBucket.java */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC44854a f420770a;

    /* renamed from: b, reason: collision with root package name */
    public final Locale f420771b;

    /* renamed from: c, reason: collision with root package name */
    public final int f420772c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC44868j f420773d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f420774e;

    /* renamed from: f, reason: collision with root package name */
    public a[] f420775f;

    /* renamed from: g, reason: collision with root package name */
    public int f420776g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f420777h;

    /* renamed from: i, reason: collision with root package name */
    public Object f420778i;

    /* compiled from: DateTimeParserBucket.java */
    public static class a implements Comparable<a> {

        /* renamed from: b, reason: collision with root package name */
        public AbstractC44864f f420779b;

        /* renamed from: c, reason: collision with root package name */
        public int f420780c;

        /* renamed from: d, reason: collision with root package name */
        public String f420781d;

        /* renamed from: e, reason: collision with root package name */
        public Locale f420782e;

        public final long a(long j12, boolean z12) {
            String str = this.f420781d;
            long jI2 = str == null ? this.f420779b.I(this.f420780c, j12) : this.f420779b.H(j12, str, this.f420782e);
            return z12 ? this.f420779b.F(jI2) : jI2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            AbstractC44864f abstractC44864f = aVar.f420779b;
            int iA2 = e.a(this.f420779b.x(), abstractC44864f.x());
            return iA2 != 0 ? iA2 : e.a(this.f420779b.k(), abstractC44864f.k());
        }
    }

    /* compiled from: DateTimeParserBucket.java */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC44868j f420783a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f420784b;

        /* renamed from: c, reason: collision with root package name */
        public final a[] f420785c;

        /* renamed from: d, reason: collision with root package name */
        public final int f420786d;

        public b() {
            this.f420783a = e.this.f420773d;
            this.f420784b = e.this.f420774e;
            this.f420785c = e.this.f420775f;
            this.f420786d = e.this.f420776g;
        }
    }

    public e(AbstractC44854a abstractC44854a) {
        C44866h.b bVar = C44866h.f420908a;
        abstractC44854a = abstractC44854a == null ? x.V() : abstractC44854a;
        AbstractC44868j abstractC44868jO = abstractC44854a.o();
        this.f420770a = abstractC44854a.N();
        this.f420771b = Locale.getDefault();
        this.f420772c = 2000;
        this.f420773d = abstractC44868jO;
        this.f420775f = new a[8];
    }

    public static int a(AbstractC44871m abstractC44871m, AbstractC44871m abstractC44871m2) {
        if (abstractC44871m == null || !abstractC44871m.f()) {
            return (abstractC44871m2 == null || !abstractC44871m2.f()) ? 0 : -1;
        }
        if (abstractC44871m2 == null || !abstractC44871m2.f()) {
            return 1;
        }
        return -abstractC44871m.compareTo(abstractC44871m2);
    }

    public final long b(String str) {
        a[] aVarArr = this.f420775f;
        int i12 = this.f420776g;
        if (this.f420777h) {
            aVarArr = (a[]) aVarArr.clone();
            this.f420775f = aVarArr;
            this.f420777h = false;
        }
        if (i12 > 10) {
            Arrays.sort(aVarArr, 0, i12);
        } else {
            for (int i13 = 0; i13 < i12; i13++) {
                for (int i14 = i13; i14 > 0; i14--) {
                    int i15 = i14 - 1;
                    a aVar = aVarArr[i15];
                    a aVar2 = aVarArr[i14];
                    aVar.getClass();
                    AbstractC44864f abstractC44864f = aVar2.f420779b;
                    int iA2 = a(aVar.f420779b.x(), abstractC44864f.x());
                    if (iA2 == 0) {
                        iA2 = a(aVar.f420779b.k(), abstractC44864f.k());
                    }
                    if (iA2 > 0) {
                        a aVar3 = aVarArr[i14];
                        aVarArr[i14] = aVarArr[i15];
                        aVarArr[i15] = aVar3;
                    }
                }
            }
        }
        if (i12 > 0) {
            AbstractC44872n abstractC44872n = AbstractC44872n.f420933g;
            AbstractC44854a abstractC44854a = this.f420770a;
            AbstractC44871m abstractC44871mA = abstractC44872n.a(abstractC44854a);
            AbstractC44871m abstractC44871mA2 = AbstractC44872n.f420935i.a(abstractC44854a);
            AbstractC44871m abstractC44871mK = aVarArr[0].f420779b.k();
            if (a(abstractC44871mK, abstractC44871mA) >= 0 && a(abstractC44871mK, abstractC44871mA2) <= 0) {
                AbstractC44865g abstractC44865g = AbstractC44865g.f420885g;
                a aVarC = c();
                aVarC.f420779b = abstractC44865g.b(abstractC44854a);
                aVarC.f420780c = this.f420772c;
                aVarC.f420781d = null;
                aVarC.f420782e = null;
                return b(str);
            }
        }
        long jA2 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            try {
                jA2 = aVarArr[i16].a(jA2, true);
            } catch (IllegalFieldValueException e12) {
                if (str != null) {
                    String str2 = "Cannot parse \"" + ((Object) str) + '\"';
                    if (e12.f420437b == null) {
                        e12.f420437b = str2;
                    } else if (str2 != null) {
                        StringBuilder sbZ = androidx.appcompat.app.r.z(str2, ": ");
                        sbZ.append(e12.f420437b);
                        e12.f420437b = sbZ.toString();
                    }
                }
                throw e12;
            }
        }
        int i17 = 0;
        while (i17 < i12) {
            if (!aVarArr[i17].f420779b.A()) {
                jA2 = aVarArr[i17].a(jA2, i17 == i12 + (-1));
            }
            i17++;
        }
        if (this.f420774e != null) {
            return jA2 - r0.intValue();
        }
        AbstractC44868j abstractC44868j = this.f420773d;
        if (abstractC44868j == null) {
            return jA2;
        }
        int iK2 = abstractC44868j.k(jA2);
        long j12 = jA2 - iK2;
        if (iK2 == this.f420773d.i(j12)) {
            return j12;
        }
        String str3 = "Illegal instant due to time zone offset transition (" + this.f420773d + ')';
        if (str != null) {
            str3 = "Cannot parse \"" + ((Object) str) + "\": " + str3;
        }
        throw new IllegalInstantException(str3);
    }

    public final a c() {
        a[] aVarArr = this.f420775f;
        int i12 = this.f420776g;
        if (i12 == aVarArr.length || this.f420777h) {
            a[] aVarArr2 = new a[i12 == aVarArr.length ? i12 * 2 : aVarArr.length];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, i12);
            this.f420775f = aVarArr2;
            this.f420777h = false;
            aVarArr = aVarArr2;
        }
        this.f420778i = null;
        a aVar = aVarArr[i12];
        if (aVar == null) {
            aVar = new a();
            aVarArr[i12] = aVar;
        }
        this.f420776g = i12 + 1;
        return aVar;
    }

    public final void d(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this != e.this) {
                return;
            }
            this.f420773d = bVar.f420783a;
            this.f420774e = bVar.f420784b;
            this.f420775f = bVar.f420785c;
            int i12 = this.f420776g;
            int i13 = bVar.f420786d;
            if (i13 < i12) {
                this.f420777h = true;
            }
            this.f420776g = i13;
            this.f420778i = obj;
        }
    }
}
