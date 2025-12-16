package org.joda.time.field;

import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;

/* compiled from: DecoratedDateTimeField.java */
/* loaded from: classes7.dex */
public abstract class e extends c {

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC44864f f420691c;

    public e(AbstractC44864f abstractC44864f, AbstractC44865g abstractC44865g) {
        super(abstractC44865g);
        if (abstractC44864f == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!abstractC44864f.B()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.f420691c = abstractC44864f;
    }

    @Override // org.joda.time.AbstractC44864f
    public final boolean A() {
        return this.f420691c.A();
    }

    @Override // org.joda.time.AbstractC44864f
    public long F(long j12) {
        return this.f420691c.F(j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public long G(int i12, long j12) {
        return this.f420691c.G(i12, j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public int c(long j12) {
        return this.f420691c.c(j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public AbstractC44871m k() {
        return this.f420691c.k();
    }

    @Override // org.joda.time.AbstractC44864f
    public int n() {
        return this.f420691c.n();
    }

    @Override // org.joda.time.AbstractC44864f
    public int s() {
        return this.f420691c.s();
    }

    @Override // org.joda.time.AbstractC44864f
    public AbstractC44871m x() {
        return this.f420691c.x();
    }
}
