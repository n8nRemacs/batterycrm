package org.joda.time;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: DateTimeComparator.java */
/* renamed from: org.joda.time.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44862d implements Comparator<Object>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final C44862d f420684d = new C44862d(null, null);

    /* renamed from: e, reason: collision with root package name */
    public static final C44862d f420685e;

    /* renamed from: f, reason: collision with root package name */
    public static final C44862d f420686f;
    private static final long serialVersionUID = -6097339773320178364L;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC44865g f420687b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC44865g f420688c;

    static {
        AbstractC44865g abstractC44865g = AbstractC44865g.f420886h;
        f420685e = new C44862d(abstractC44865g, null);
        f420686f = new C44862d(null, abstractC44865g);
    }

    public C44862d(AbstractC44865g abstractC44865g, AbstractC44865g abstractC44865g2) {
        this.f420687b = abstractC44865g;
        this.f420688c = abstractC44865g2;
    }

    private Object readResolve() {
        AbstractC44865g abstractC44865g = this.f420687b;
        AbstractC44865g abstractC44865g2 = this.f420688c;
        if (abstractC44865g == null && abstractC44865g2 == null) {
            return f420684d;
        }
        AbstractC44865g abstractC44865g3 = AbstractC44865g.f420886h;
        return (abstractC44865g == abstractC44865g3 && abstractC44865g2 == null) ? f420685e : (abstractC44865g == null && abstractC44865g2 == abstractC44865g3) ? f420686f : new C44862d(abstractC44865g, abstractC44865g2);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (org.joda.time.convert.d.f420665f == null) {
            org.joda.time.convert.d.f420665f = new org.joda.time.convert.d();
        }
        org.joda.time.convert.h hVarA = org.joda.time.convert.d.f420665f.a(obj);
        AbstractC44854a abstractC44854aB = hVarA.b(obj);
        long jC2 = hVarA.c(obj, abstractC44854aB);
        if (obj == obj2) {
            return 0;
        }
        if (org.joda.time.convert.d.f420665f == null) {
            org.joda.time.convert.d.f420665f = new org.joda.time.convert.d();
        }
        org.joda.time.convert.h hVarA2 = org.joda.time.convert.d.f420665f.a(obj2);
        AbstractC44854a abstractC44854aB2 = hVarA2.b(obj2);
        long jC3 = hVarA2.c(obj2, abstractC44854aB2);
        AbstractC44865g abstractC44865g = this.f420687b;
        if (abstractC44865g != null) {
            jC2 = abstractC44865g.b(abstractC44854aB).F(jC2);
            jC3 = abstractC44865g.b(abstractC44854aB2).F(jC3);
        }
        AbstractC44865g abstractC44865g2 = this.f420688c;
        if (abstractC44865g2 != null) {
            jC2 = abstractC44865g2.b(abstractC44854aB).C(jC2);
            jC3 = abstractC44865g2.b(abstractC44854aB2).C(jC3);
        }
        if (jC2 < jC3) {
            return -1;
        }
        return jC2 > jC3 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (!(obj instanceof C44862d)) {
            return false;
        }
        C44862d c44862d = (C44862d) obj;
        Object obj2 = c44862d.f420687b;
        AbstractC44865g abstractC44865g = this.f420687b;
        if (abstractC44865g != obj2 && (abstractC44865g == null || !abstractC44865g.equals(obj2))) {
            return false;
        }
        AbstractC44865g abstractC44865g2 = this.f420688c;
        AbstractC44865g abstractC44865g3 = c44862d.f420688c;
        return abstractC44865g2 == abstractC44865g3 || (abstractC44865g2 != null && abstractC44865g2.equals(abstractC44865g3));
    }

    public final int hashCode() {
        AbstractC44865g abstractC44865g = this.f420687b;
        int iHashCode = abstractC44865g == null ? 0 : abstractC44865g.hashCode();
        AbstractC44865g abstractC44865g2 = this.f420688c;
        return ((abstractC44865g2 != null ? abstractC44865g2.hashCode() : 0) * 123) + iHashCode;
    }

    public final String toString() {
        AbstractC44865g abstractC44865g = this.f420687b;
        AbstractC44865g abstractC44865g2 = this.f420688c;
        if (abstractC44865g == abstractC44865g2) {
            return AK.c.s(new StringBuilder("DateTimeComparator["), abstractC44865g != null ? abstractC44865g.f420904b : "", "]");
        }
        StringBuilder sb2 = new StringBuilder("DateTimeComparator[");
        sb2.append(abstractC44865g == null ? "" : abstractC44865g.f420904b);
        sb2.append("-");
        return AK.c.s(sb2, abstractC44865g2 != null ? abstractC44865g2.f420904b : "", "]");
    }
}
