package org.joda.time;

import java.io.Serializable;
import org.joda.time.C44866h;

/* compiled from: DurationFieldType.java */
/* renamed from: org.joda.time.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC44872n implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC44872n f420929c = new a("eras", (byte) 1);

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC44872n f420930d = new a("centuries", (byte) 2);

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC44872n f420931e = new a("weekyears", (byte) 3);

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC44872n f420932f = new a("years", (byte) 4);

    /* renamed from: g, reason: collision with root package name */
    public static final AbstractC44872n f420933g = new a("months", (byte) 5);

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC44872n f420934h = new a("weeks", (byte) 6);

    /* renamed from: i, reason: collision with root package name */
    public static final AbstractC44872n f420935i = new a("days", (byte) 7);

    /* renamed from: j, reason: collision with root package name */
    public static final AbstractC44872n f420936j = new a("halfdays", (byte) 8);

    /* renamed from: k, reason: collision with root package name */
    public static final AbstractC44872n f420937k = new a("hours", (byte) 9);

    /* renamed from: l, reason: collision with root package name */
    public static final AbstractC44872n f420938l = new a("minutes", (byte) 10);

    /* renamed from: m, reason: collision with root package name */
    public static final AbstractC44872n f420939m = new a("seconds", (byte) 11);

    /* renamed from: n, reason: collision with root package name */
    public static final AbstractC44872n f420940n = new a("millis", (byte) 12);
    private static final long serialVersionUID = 8765135187319L;

    /* renamed from: b, reason: collision with root package name */
    public final String f420941b;

    /* compiled from: DurationFieldType.java */
    /* renamed from: org.joda.time.n$a */
    public static class a extends AbstractC44872n {
        private static final long serialVersionUID = 31156755687123L;

        /* renamed from: o, reason: collision with root package name */
        public final byte f420942o;

        public a(String str, byte b12) {
            super(str);
            this.f420942o = b12;
        }

        private Object readResolve() {
            switch (this.f420942o) {
                case 1:
                    return AbstractC44872n.f420929c;
                case 2:
                    return AbstractC44872n.f420930d;
                case 3:
                    return AbstractC44872n.f420931e;
                case 4:
                    return AbstractC44872n.f420932f;
                case 5:
                    return AbstractC44872n.f420933g;
                case 6:
                    return AbstractC44872n.f420934h;
                case 7:
                    return AbstractC44872n.f420935i;
                case 8:
                    return AbstractC44872n.f420936j;
                case 9:
                    return AbstractC44872n.f420937k;
                case 10:
                    return AbstractC44872n.f420938l;
                case 11:
                    return AbstractC44872n.f420939m;
                case 12:
                    return AbstractC44872n.f420940n;
                default:
                    return this;
            }
        }

        @Override // org.joda.time.AbstractC44872n
        public final AbstractC44871m a(AbstractC44854a abstractC44854a) {
            C44866h.b bVar = C44866h.f420908a;
            if (abstractC44854a == null) {
                abstractC44854a = org.joda.time.chrono.x.V();
            }
            switch (this.f420942o) {
                case 1:
                    return abstractC44854a.k();
                case 2:
                    return abstractC44854a.a();
                case 3:
                    return abstractC44854a.L();
                case 4:
                    return abstractC44854a.S();
                case 5:
                    return abstractC44854a.B();
                case 6:
                    return abstractC44854a.I();
                case 7:
                    return abstractC44854a.h();
                case 8:
                    return abstractC44854a.q();
                case 9:
                    return abstractC44854a.t();
                case 10:
                    return abstractC44854a.z();
                case 11:
                    return abstractC44854a.F();
                case 12:
                    return abstractC44854a.u();
                default:
                    throw new InternalError();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f420942o == ((a) obj).f420942o;
            }
            return false;
        }

        public final int hashCode() {
            return 1 << this.f420942o;
        }
    }

    public AbstractC44872n(String str) {
        this.f420941b = str;
    }

    public abstract AbstractC44871m a(AbstractC44854a abstractC44854a);

    public final String toString() {
        return this.f420941b;
    }
}
