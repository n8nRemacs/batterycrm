package org.threeten.bp;

import java.io.Serializable;

/* compiled from: Clock.java */
/* loaded from: classes8.dex */
public abstract class a {

    /* compiled from: Clock.java */
    /* renamed from: org.threeten.bp.a$a, reason: collision with other inner class name */
    public static final class C12238a extends a implements Serializable {
        private static final long serialVersionUID = 7430389292664866958L;

        public final boolean equals(Object obj) {
            if (!(obj instanceof C12238a)) {
                return false;
            }
            ((C12238a) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "FixedClock[null,null]";
        }
    }

    /* compiled from: Clock.java */
    public static final class b extends a implements Serializable {
        private static final long serialVersionUID = 2007484719125426256L;

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OffsetClock[null,null]";
        }
    }

    /* compiled from: Clock.java */
    public static final class c extends a implements Serializable {
        private static final long serialVersionUID = 6740630888130243051L;

        /* renamed from: b, reason: collision with root package name */
        public final o f421846b;

        public c(o oVar) {
            this.f421846b = oVar;
        }

        public final org.threeten.bp.d a() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            org.threeten.bp.d dVar = org.threeten.bp.d.f421934d;
            return org.threeten.bp.d.o(w81.d.e(1000, jCurrentTimeMillis) * 1000000, w81.d.c(jCurrentTimeMillis, 1000L));
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return this.f421846b.equals(((c) obj).f421846b);
        }

        public final int hashCode() {
            return this.f421846b.hashCode() + 1;
        }

        public final String toString() {
            return "SystemClock[" + this.f421846b + "]";
        }
    }

    /* compiled from: Clock.java */
    public static final class d extends a implements Serializable {
        private static final long serialVersionUID = 6504659149906368850L;

        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "TickClock[null," + org.threeten.bp.c.c(0L) + "]";
        }
    }
}
