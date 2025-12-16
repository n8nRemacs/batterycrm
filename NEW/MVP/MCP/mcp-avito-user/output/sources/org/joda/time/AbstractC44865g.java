package org.joda.time;

import com.avito.android.remote.model.category_parameters.SelectionType;
import java.io.Serializable;
import org.joda.time.C44866h;

/* compiled from: DateTimeFieldType.java */
/* renamed from: org.joda.time.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC44865g implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC44865g f420881c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC44865g f420882d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC44865g f420883e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC44865g f420884f;

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC44865g f420885g;

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC44865g f420886h;

    /* renamed from: i, reason: collision with root package name */
    public static final AbstractC44865g f420887i;

    /* renamed from: j, reason: collision with root package name */
    public static final AbstractC44865g f420888j;

    /* renamed from: k, reason: collision with root package name */
    public static final AbstractC44865g f420889k;

    /* renamed from: l, reason: collision with root package name */
    public static final AbstractC44865g f420890l;

    /* renamed from: m, reason: collision with root package name */
    public static final AbstractC44865g f420891m;

    /* renamed from: n, reason: collision with root package name */
    public static final AbstractC44865g f420892n;

    /* renamed from: o, reason: collision with root package name */
    public static final AbstractC44865g f420893o;

    /* renamed from: p, reason: collision with root package name */
    public static final AbstractC44865g f420894p;

    /* renamed from: q, reason: collision with root package name */
    public static final AbstractC44865g f420895q;

    /* renamed from: r, reason: collision with root package name */
    public static final AbstractC44865g f420896r;

    /* renamed from: s, reason: collision with root package name */
    public static final AbstractC44865g f420897s;
    private static final long serialVersionUID = -42615285973990L;

    /* renamed from: t, reason: collision with root package name */
    public static final AbstractC44865g f420898t;

    /* renamed from: u, reason: collision with root package name */
    public static final AbstractC44865g f420899u;

    /* renamed from: v, reason: collision with root package name */
    public static final AbstractC44865g f420900v;

    /* renamed from: w, reason: collision with root package name */
    public static final AbstractC44865g f420901w;

    /* renamed from: x, reason: collision with root package name */
    public static final AbstractC44865g f420902x;

    /* renamed from: y, reason: collision with root package name */
    public static final AbstractC44865g f420903y;

    /* renamed from: b, reason: collision with root package name */
    public final String f420904b;

    /* compiled from: DateTimeFieldType.java */
    /* renamed from: org.joda.time.g$a */
    public static class a extends AbstractC44865g {
        private static final long serialVersionUID = -9937958251642L;

        /* renamed from: A, reason: collision with root package name */
        public final transient AbstractC44872n f420905A;

        /* renamed from: B, reason: collision with root package name */
        public final transient AbstractC44872n f420906B;

        /* renamed from: z, reason: collision with root package name */
        public final byte f420907z;

        public a(String str, byte b12, AbstractC44872n abstractC44872n, AbstractC44872n abstractC44872n2) {
            super(str);
            this.f420907z = b12;
            this.f420905A = abstractC44872n;
            this.f420906B = abstractC44872n2;
        }

        private Object readResolve() {
            switch (this.f420907z) {
                case 1:
                    return AbstractC44865g.f420881c;
                case 2:
                    return AbstractC44865g.f420882d;
                case 3:
                    return AbstractC44865g.f420883e;
                case 4:
                    return AbstractC44865g.f420884f;
                case 5:
                    return AbstractC44865g.f420885g;
                case 6:
                    return AbstractC44865g.f420886h;
                case 7:
                    return AbstractC44865g.f420887i;
                case 8:
                    return AbstractC44865g.f420888j;
                case 9:
                    return AbstractC44865g.f420889k;
                case 10:
                    return AbstractC44865g.f420890l;
                case 11:
                    return AbstractC44865g.f420891m;
                case 12:
                    return AbstractC44865g.f420892n;
                case 13:
                    return AbstractC44865g.f420893o;
                case 14:
                    return AbstractC44865g.f420894p;
                case 15:
                    return AbstractC44865g.f420895q;
                case 16:
                    return AbstractC44865g.f420896r;
                case 17:
                    return AbstractC44865g.f420897s;
                case 18:
                    return AbstractC44865g.f420898t;
                case 19:
                    return AbstractC44865g.f420899u;
                case 20:
                    return AbstractC44865g.f420900v;
                case 21:
                    return AbstractC44865g.f420901w;
                case 22:
                    return AbstractC44865g.f420902x;
                case 23:
                    return AbstractC44865g.f420903y;
                default:
                    return this;
            }
        }

        @Override // org.joda.time.AbstractC44865g
        public final AbstractC44872n a() {
            return this.f420905A;
        }

        @Override // org.joda.time.AbstractC44865g
        public final AbstractC44864f b(AbstractC44854a abstractC44854a) {
            C44866h.b bVar = C44866h.f420908a;
            if (abstractC44854a == null) {
                abstractC44854a = org.joda.time.chrono.x.V();
            }
            switch (this.f420907z) {
                case 1:
                    return abstractC44854a.i();
                case 2:
                    return abstractC44854a.R();
                case 3:
                    return abstractC44854a.b();
                case 4:
                    return abstractC44854a.Q();
                case 5:
                    return abstractC44854a.P();
                case 6:
                    return abstractC44854a.g();
                case 7:
                    return abstractC44854a.A();
                case 8:
                    return abstractC44854a.e();
                case 9:
                    return abstractC44854a.K();
                case 10:
                    return abstractC44854a.J();
                case 11:
                    return abstractC44854a.H();
                case 12:
                    return abstractC44854a.f();
                case 13:
                    return abstractC44854a.p();
                case 14:
                    return abstractC44854a.s();
                case 15:
                    return abstractC44854a.d();
                case 16:
                    return abstractC44854a.c();
                case 17:
                    return abstractC44854a.r();
                case 18:
                    return abstractC44854a.x();
                case 19:
                    return abstractC44854a.y();
                case 20:
                    return abstractC44854a.C();
                case 21:
                    return abstractC44854a.E();
                case 22:
                    return abstractC44854a.v();
                case 23:
                    return abstractC44854a.w();
                default:
                    throw new InternalError();
            }
        }

        @Override // org.joda.time.AbstractC44865g
        public final AbstractC44872n c() {
            return this.f420906B;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f420907z == ((a) obj).f420907z;
            }
            return false;
        }

        public final int hashCode() {
            return 1 << this.f420907z;
        }
    }

    static {
        AbstractC44872n abstractC44872n = AbstractC44872n.f420929c;
        f420881c = new a("era", (byte) 1, abstractC44872n, null);
        AbstractC44872n abstractC44872n2 = AbstractC44872n.f420932f;
        f420882d = new a("yearOfEra", (byte) 2, abstractC44872n2, abstractC44872n);
        AbstractC44872n abstractC44872n3 = AbstractC44872n.f420930d;
        f420883e = new a("centuryOfEra", (byte) 3, abstractC44872n3, abstractC44872n);
        f420884f = new a("yearOfCentury", (byte) 4, abstractC44872n2, abstractC44872n3);
        f420885g = new a(SelectionType.TYPE_YEAR, (byte) 5, abstractC44872n2, null);
        AbstractC44872n abstractC44872n4 = AbstractC44872n.f420935i;
        f420886h = new a("dayOfYear", (byte) 6, abstractC44872n4, abstractC44872n2);
        AbstractC44872n abstractC44872n5 = AbstractC44872n.f420933g;
        f420887i = new a("monthOfYear", (byte) 7, abstractC44872n5, abstractC44872n2);
        f420888j = new a("dayOfMonth", (byte) 8, abstractC44872n4, abstractC44872n5);
        AbstractC44872n abstractC44872n6 = AbstractC44872n.f420931e;
        f420889k = new a("weekyearOfCentury", (byte) 9, abstractC44872n6, abstractC44872n3);
        f420890l = new a("weekyear", (byte) 10, abstractC44872n6, null);
        AbstractC44872n abstractC44872n7 = AbstractC44872n.f420934h;
        f420891m = new a("weekOfWeekyear", (byte) 11, abstractC44872n7, abstractC44872n6);
        f420892n = new a("dayOfWeek", (byte) 12, abstractC44872n4, abstractC44872n7);
        AbstractC44872n abstractC44872n8 = AbstractC44872n.f420936j;
        f420893o = new a("halfdayOfDay", (byte) 13, abstractC44872n8, abstractC44872n4);
        AbstractC44872n abstractC44872n9 = AbstractC44872n.f420937k;
        f420894p = new a("hourOfHalfday", (byte) 14, abstractC44872n9, abstractC44872n8);
        f420895q = new a("clockhourOfHalfday", (byte) 15, abstractC44872n9, abstractC44872n8);
        f420896r = new a("clockhourOfDay", (byte) 16, abstractC44872n9, abstractC44872n4);
        f420897s = new a("hourOfDay", (byte) 17, abstractC44872n9, abstractC44872n4);
        AbstractC44872n abstractC44872n10 = AbstractC44872n.f420938l;
        f420898t = new a("minuteOfDay", (byte) 18, abstractC44872n10, abstractC44872n4);
        f420899u = new a("minuteOfHour", (byte) 19, abstractC44872n10, abstractC44872n9);
        AbstractC44872n abstractC44872n11 = AbstractC44872n.f420939m;
        f420900v = new a("secondOfDay", (byte) 20, abstractC44872n11, abstractC44872n4);
        f420901w = new a("secondOfMinute", (byte) 21, abstractC44872n11, abstractC44872n10);
        AbstractC44872n abstractC44872n12 = AbstractC44872n.f420940n;
        f420902x = new a("millisOfDay", (byte) 22, abstractC44872n12, abstractC44872n4);
        f420903y = new a("millisOfSecond", (byte) 23, abstractC44872n12, abstractC44872n11);
    }

    public AbstractC44865g(String str) {
        this.f420904b = str;
    }

    public abstract AbstractC44872n a();

    public abstract AbstractC44864f b(AbstractC44854a abstractC44854a);

    public abstract AbstractC44872n c();

    public final String toString() {
        return this.f420904b;
    }
}
