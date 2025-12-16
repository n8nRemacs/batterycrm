package org.joda.time.field;

import androidx.compose.runtime.C22026a;
import java.io.Serializable;
import java.util.HashMap;
import org.joda.time.AbstractC44871m;
import org.joda.time.AbstractC44872n;

/* compiled from: UnsupportedDurationField.java */
/* loaded from: classes7.dex */
public final class x extends AbstractC44871m implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static HashMap<AbstractC44872n, x> f420725c = null;
    private static final long serialVersionUID = -6390301302770925357L;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC44872n f420726b;

    public x(AbstractC44872n abstractC44872n) {
        this.f420726b = abstractC44872n;
    }

    public static synchronized x h(AbstractC44872n abstractC44872n) {
        x xVar;
        try {
            HashMap<AbstractC44872n, x> map = f420725c;
            if (map == null) {
                f420725c = new HashMap<>(7);
                xVar = null;
            } else {
                xVar = map.get(abstractC44872n);
            }
            if (xVar == null) {
                xVar = new x(abstractC44872n);
                f420725c.put(abstractC44872n, xVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return xVar;
    }

    private Object readResolve() {
        return h(this.f420726b);
    }

    @Override // org.joda.time.AbstractC44871m
    public final long a(int i12, long j12) {
        throw i();
    }

    @Override // org.joda.time.AbstractC44871m
    public final long b(long j12, long j13) {
        throw i();
    }

    @Override // org.joda.time.AbstractC44871m
    public final AbstractC44872n c() {
        return this.f420726b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(AbstractC44871m abstractC44871m) {
        return 0;
    }

    @Override // org.joda.time.AbstractC44871m
    public final long d() {
        return 0L;
    }

    @Override // org.joda.time.AbstractC44871m
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        String str = ((x) obj).f420726b.f420941b;
        AbstractC44872n abstractC44872n = this.f420726b;
        return str == null ? abstractC44872n.f420941b == null : str.equals(abstractC44872n.f420941b);
    }

    @Override // org.joda.time.AbstractC44871m
    public final boolean f() {
        return false;
    }

    public final int hashCode() {
        return this.f420726b.f420941b.hashCode();
    }

    public final UnsupportedOperationException i() {
        return new UnsupportedOperationException(this.f420726b + " field is unsupported");
    }

    public final String toString() {
        return C22026a.c(new StringBuilder("UnsupportedDurationField["), this.f420726b.f420941b, ']');
    }
}
