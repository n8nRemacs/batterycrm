package org.joda.time.field;

import org.joda.time.AbstractC44864f;

/* compiled from: SkipUndoDateTimeField.java */
/* loaded from: classes7.dex */
public final class u extends g {
    private static final long serialVersionUID = -5875876968979L;

    /* renamed from: e, reason: collision with root package name */
    public final org.joda.time.chrono.m f420720e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f420721f;

    public u(org.joda.time.chrono.m mVar, AbstractC44864f abstractC44864f) {
        super(abstractC44864f, null, null);
        this.f420720e = mVar;
        int iS2 = this.f420693b.s();
        if (iS2 < 0) {
            this.f420721f = iS2 + 1;
        } else if (iS2 == 1) {
            this.f420721f = 0;
        } else {
            this.f420721f = iS2;
        }
    }

    private Object readResolve() {
        return this.f420695d.b(this.f420720e);
    }

    @Override // org.joda.time.field.g, org.joda.time.AbstractC44864f
    public final long G(int i12, long j12) {
        AbstractC44864f abstractC44864f = this.f420693b;
        j.d(this, i12, this.f420721f, abstractC44864f.n());
        if (i12 <= 0) {
            i12--;
        }
        return abstractC44864f.G(i12, j12);
    }

    @Override // org.joda.time.field.g, org.joda.time.AbstractC44864f
    public final int c(long j12) {
        int iC2 = this.f420693b.c(j12);
        return iC2 < 0 ? iC2 + 1 : iC2;
    }

    @Override // org.joda.time.field.g, org.joda.time.AbstractC44864f
    public final int s() {
        return this.f420721f;
    }
}
