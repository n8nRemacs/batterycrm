package org.joda.time.field;

import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;

/* compiled from: RemainderDateTimeField.java */
/* loaded from: classes7.dex */
public class r extends e {

    /* renamed from: d, reason: collision with root package name */
    public final int f420714d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC44871m f420715e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC44871m f420716f;

    public r(i iVar) {
        this(iVar, iVar.f420691c.k(), iVar.f420689b);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long C(long j12) {
        return this.f420691c.C(j12);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long E(long j12) {
        return this.f420691c.E(j12);
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final long F(long j12) {
        return this.f420691c.F(j12);
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final long G(int i12, long j12) {
        int i13 = this.f420714d;
        j.d(this, i12, 0, i13 - 1);
        AbstractC44864f abstractC44864f = this.f420691c;
        int iC2 = abstractC44864f.c(j12);
        return abstractC44864f.G(((iC2 >= 0 ? iC2 / i13 : ((iC2 + 1) / i13) - 1) * i13) + i12, j12);
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final int c(long j12) {
        int iC2 = this.f420691c.c(j12);
        int i12 = this.f420714d;
        if (iC2 >= 0) {
            return iC2 % i12;
        }
        return ((iC2 + 1) % i12) + (i12 - 1);
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final AbstractC44871m k() {
        return this.f420715e;
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final int n() {
        return this.f420714d - 1;
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final int s() {
        return 0;
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final AbstractC44871m x() {
        return this.f420716f;
    }

    public r(i iVar, AbstractC44871m abstractC44871m, AbstractC44865g abstractC44865g) {
        super(iVar.f420691c, abstractC44865g);
        this.f420714d = iVar.f420696d;
        this.f420715e = abstractC44871m;
        this.f420716f = iVar.f420697e;
    }

    public r(AbstractC44864f abstractC44864f, AbstractC44871m abstractC44871m) {
        super(abstractC44864f, AbstractC44865g.f420889k);
        this.f420716f = abstractC44871m;
        this.f420715e = abstractC44864f.k();
        this.f420714d = 100;
    }
}
