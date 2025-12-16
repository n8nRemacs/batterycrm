package org.joda.time.field;

import androidx.compose.runtime.C22026a;
import java.io.Serializable;
import org.joda.time.AbstractC44871m;
import org.joda.time.AbstractC44872n;

/* compiled from: BaseDurationField.java */
/* loaded from: classes7.dex */
public abstract class d extends AbstractC44871m implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC44872n f420690b;

    public d(AbstractC44872n abstractC44872n) {
        if (abstractC44872n == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.f420690b = abstractC44872n;
    }

    @Override // org.joda.time.AbstractC44871m
    public final AbstractC44872n c() {
        return this.f420690b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(AbstractC44871m abstractC44871m) {
        long jD2 = abstractC44871m.d();
        long jD3 = d();
        if (jD3 == jD2) {
            return 0;
        }
        return jD3 < jD2 ? -1 : 1;
    }

    @Override // org.joda.time.AbstractC44871m
    public final boolean f() {
        return true;
    }

    public final String toString() {
        return C22026a.c(new StringBuilder("DurationField["), this.f420690b.f420941b, ']');
    }
}
