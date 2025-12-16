package org.joda.time.tz;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import org.joda.time.AbstractC44868j;

/* compiled from: CachedDateTimeZone.java */
/* loaded from: classes7.dex */
public class a extends AbstractC44868j {

    /* renamed from: i, reason: collision with root package name */
    public static final int f420965i;
    private static final long serialVersionUID = 5472298452022250685L;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC44868j f420966g;

    /* renamed from: h, reason: collision with root package name */
    public final transient C12209a[] f420967h;

    /* compiled from: CachedDateTimeZone.java */
    /* renamed from: org.joda.time.tz.a$a, reason: collision with other inner class name */
    public static final class C12209a {

        /* renamed from: a, reason: collision with root package name */
        public final long f420968a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC44868j f420969b;

        /* renamed from: c, reason: collision with root package name */
        public C12209a f420970c;

        /* renamed from: d, reason: collision with root package name */
        public String f420971d;

        /* renamed from: e, reason: collision with root package name */
        public int f420972e = BeduinInputModel.MIN_TEXT_VERSION;

        /* renamed from: f, reason: collision with root package name */
        public int f420973f = BeduinInputModel.MIN_TEXT_VERSION;

        public C12209a(long j12, AbstractC44868j abstractC44868j) {
            this.f420968a = j12;
            this.f420969b = abstractC44868j;
        }

        public final String a(long j12) {
            C12209a c12209a = this.f420970c;
            if (c12209a != null && j12 >= c12209a.f420968a) {
                return c12209a.a(j12);
            }
            if (this.f420971d == null) {
                this.f420971d = this.f420969b.g(this.f420968a);
            }
            return this.f420971d;
        }

        public final int b(long j12) {
            C12209a c12209a = this.f420970c;
            if (c12209a != null && j12 >= c12209a.f420968a) {
                return c12209a.b(j12);
            }
            if (this.f420972e == Integer.MIN_VALUE) {
                this.f420972e = this.f420969b.i(this.f420968a);
            }
            return this.f420972e;
        }

        public final int c(long j12) {
            C12209a c12209a = this.f420970c;
            if (c12209a != null && j12 >= c12209a.f420968a) {
                return c12209a.c(j12);
            }
            if (this.f420973f == Integer.MIN_VALUE) {
                this.f420973f = this.f420969b.m(this.f420968a);
            }
            return this.f420973f;
        }
    }

    static {
        Integer integer;
        int i12;
        try {
            integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            integer = null;
        }
        if (integer == null) {
            i12 = 512;
        } else {
            int i13 = 0;
            for (int iIntValue = integer.intValue() - 1; iIntValue > 0; iIntValue >>= 1) {
                i13++;
            }
            i12 = 1 << i13;
        }
        f420965i = i12 - 1;
    }

    public a(AbstractC44868j abstractC44868j) {
        super(abstractC44868j.f420915b);
        this.f420967h = new C12209a[f420965i + 1];
        this.f420966g = abstractC44868j;
    }

    @Override // org.joda.time.AbstractC44868j
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f420966g.equals(((a) obj).f420966g);
    }

    @Override // org.joda.time.AbstractC44868j
    public final String g(long j12) {
        return s(j12).a(j12);
    }

    @Override // org.joda.time.AbstractC44868j
    public final int hashCode() {
        return this.f420966g.hashCode();
    }

    @Override // org.joda.time.AbstractC44868j
    public final int i(long j12) {
        return s(j12).b(j12);
    }

    @Override // org.joda.time.AbstractC44868j
    public final int m(long j12) {
        return s(j12).c(j12);
    }

    @Override // org.joda.time.AbstractC44868j
    public final boolean n() {
        return this.f420966g.n();
    }

    @Override // org.joda.time.AbstractC44868j
    public final long o(long j12) {
        return this.f420966g.o(j12);
    }

    @Override // org.joda.time.AbstractC44868j
    public final long p(long j12) {
        return this.f420966g.p(j12);
    }

    public final C12209a s(long j12) {
        int i12 = (int) (j12 >> 32);
        int i13 = f420965i & i12;
        C12209a[] c12209aArr = this.f420967h;
        C12209a c12209a = c12209aArr[i13];
        if (c12209a == null || ((int) (c12209a.f420968a >> 32)) != i12) {
            long j13 = j12 & (-4294967296L);
            AbstractC44868j abstractC44868j = this.f420966g;
            c12209a = new C12209a(j13, abstractC44868j);
            long j14 = 4294967295L | j13;
            C12209a c12209a2 = c12209a;
            while (true) {
                long jO2 = abstractC44868j.o(j13);
                if (jO2 == j13 || jO2 > j14) {
                    break;
                }
                C12209a c12209a3 = new C12209a(jO2, abstractC44868j);
                c12209a2.f420970c = c12209a3;
                c12209a2 = c12209a3;
                j13 = jO2;
            }
            c12209aArr[i13] = c12209a;
        }
        return c12209a;
    }
}
