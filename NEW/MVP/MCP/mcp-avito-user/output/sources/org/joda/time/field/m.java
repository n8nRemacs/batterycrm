package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.AbstractC44871m;
import org.joda.time.AbstractC44872n;

/* compiled from: MillisDurationField.java */
/* loaded from: classes7.dex */
public final class m extends AbstractC44871m implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final m f420705b = new m();
    private static final long serialVersionUID = 2656707858124633367L;

    private Object readResolve() {
        return f420705b;
    }

    @Override // org.joda.time.AbstractC44871m
    public final long a(int i12, long j12) {
        return j.b(j12, i12);
    }

    @Override // org.joda.time.AbstractC44871m
    public final long b(long j12, long j13) {
        return j.b(j12, j13);
    }

    @Override // org.joda.time.AbstractC44871m
    public final AbstractC44872n c() {
        return AbstractC44872n.f420940n;
    }

    @Override // java.lang.Comparable
    public final int compareTo(AbstractC44871m abstractC44871m) {
        long jD2 = abstractC44871m.d();
        if (1 == jD2) {
            return 0;
        }
        return 1 < jD2 ? -1 : 1;
    }

    @Override // org.joda.time.AbstractC44871m
    public final long d() {
        return 1L;
    }

    @Override // org.joda.time.AbstractC44871m
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        ((m) obj).getClass();
        return true;
    }

    @Override // org.joda.time.AbstractC44871m
    public final boolean f() {
        return true;
    }

    public final int hashCode() {
        return (int) 1;
    }

    public final String toString() {
        return "DurationField[millis]";
    }
}
