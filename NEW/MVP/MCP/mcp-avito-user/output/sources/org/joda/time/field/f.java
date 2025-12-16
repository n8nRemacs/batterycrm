package org.joda.time.field;

import org.joda.time.AbstractC44871m;
import org.joda.time.AbstractC44872n;

/* compiled from: DecoratedDurationField.java */
/* loaded from: classes7.dex */
public class f extends d {
    private static final long serialVersionUID = 8019982251647420015L;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC44871m f420692c;

    public f(AbstractC44871m abstractC44871m, AbstractC44872n abstractC44872n) {
        super(abstractC44872n);
        if (abstractC44871m == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!abstractC44871m.f()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.f420692c = abstractC44871m;
    }

    @Override // org.joda.time.AbstractC44871m
    public long a(int i12, long j12) {
        return this.f420692c.a(i12, j12);
    }

    @Override // org.joda.time.AbstractC44871m
    public long b(long j12, long j13) {
        return this.f420692c.b(j12, j13);
    }

    @Override // org.joda.time.AbstractC44871m
    public long d() {
        return this.f420692c.d();
    }

    @Override // org.joda.time.AbstractC44871m
    public final boolean e() {
        return this.f420692c.e();
    }
}
