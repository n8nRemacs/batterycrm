package org.joda.time.field;

import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44865g;
import org.joda.time.IllegalFieldValueException;

/* compiled from: SkipDateTimeField.java */
/* loaded from: classes7.dex */
public final class t extends g {
    private static final long serialVersionUID = -8869148464118507846L;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC44854a f420718e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f420719f;

    public t(AbstractC44854a abstractC44854a, AbstractC44864f abstractC44864f) {
        super(abstractC44864f, null, null);
        this.f420718e = abstractC44854a;
        int iS2 = this.f420693b.s();
        if (iS2 < 0) {
            this.f420719f = iS2 - 1;
        } else if (iS2 == 0) {
            this.f420719f = 1;
        } else {
            this.f420719f = iS2;
        }
    }

    private Object readResolve() {
        return this.f420695d.b(this.f420718e);
    }

    @Override // org.joda.time.field.g, org.joda.time.AbstractC44864f
    public final long G(int i12, long j12) {
        AbstractC44864f abstractC44864f = this.f420693b;
        j.d(this, i12, this.f420719f, abstractC44864f.n());
        if (i12 <= 0) {
            if (i12 == 0) {
                throw new IllegalFieldValueException(AbstractC44865g.f420885g, Integer.valueOf(i12), null, null);
            }
            i12++;
        }
        return abstractC44864f.G(i12, j12);
    }

    @Override // org.joda.time.field.g, org.joda.time.AbstractC44864f
    public final int c(long j12) {
        int iC2 = this.f420693b.c(j12);
        return iC2 <= 0 ? iC2 - 1 : iC2;
    }

    @Override // org.joda.time.field.g, org.joda.time.AbstractC44864f
    public final int s() {
        return this.f420719f;
    }
}
