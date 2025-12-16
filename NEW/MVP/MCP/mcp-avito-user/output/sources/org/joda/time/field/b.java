package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44864f;

/* compiled from: AbstractReadableInstantFieldProperty.java */
/* loaded from: classes7.dex */
public abstract class b implements Serializable {
    private static final long serialVersionUID = 1971226328211649661L;

    public AbstractC44854a a() {
        throw new UnsupportedOperationException("The method getChronology() was added in v1.4 and needs to be implemented by subclasses of AbstractReadableInstantFieldProperty");
    }

    public abstract AbstractC44864f b();

    public abstract long c();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return b().c(c()) == bVar.b().c(bVar.c()) && b().y().equals(bVar.b().y()) && j.a(a(), bVar.a());
    }

    public final int hashCode() {
        return a().hashCode() + b().y().hashCode() + (b().c(c()) * 17);
    }

    public final String toString() {
        return "Property[" + b().w() + "]";
    }
}
