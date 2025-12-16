package org.joda.time.field;

import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;

/* compiled from: DividedDateTimeField.java */
/* loaded from: classes7.dex */
public class i extends e {

    /* renamed from: d, reason: collision with root package name */
    public final int f420696d;

    /* renamed from: e, reason: collision with root package name */
    public final s f420697e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC44871m f420698f;

    /* renamed from: g, reason: collision with root package name */
    public final int f420699g;

    /* renamed from: h, reason: collision with root package name */
    public final int f420700h;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(e eVar, AbstractC44871m abstractC44871m) {
        AbstractC44865g abstractC44865g = AbstractC44865g.f420883e;
        super(eVar, abstractC44865g);
        AbstractC44871m abstractC44871mK = eVar.k();
        if (abstractC44871mK == null) {
            this.f420697e = null;
        } else {
            this.f420697e = new s(abstractC44871mK, abstractC44865g.a());
        }
        this.f420698f = abstractC44871m;
        this.f420696d = 100;
        int iS2 = eVar.s();
        int i12 = iS2 >= 0 ? iS2 / 100 : ((iS2 + 1) / 100) - 1;
        int iN2 = eVar.n();
        int i13 = iN2 >= 0 ? iN2 / 100 : ((iN2 + 1) / 100) - 1;
        this.f420699g = i12;
        this.f420700h = i13;
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long C(long j12) {
        return G(c(this.f420691c.C(j12)), j12);
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final long F(long j12) {
        int iC2 = c(j12) * this.f420696d;
        AbstractC44864f abstractC44864f = this.f420691c;
        return abstractC44864f.F(abstractC44864f.G(iC2, j12));
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final long G(int i12, long j12) {
        int i13;
        j.d(this, i12, this.f420699g, this.f420700h);
        AbstractC44864f abstractC44864f = this.f420691c;
        int iC2 = abstractC44864f.c(j12);
        int i14 = this.f420696d;
        if (iC2 >= 0) {
            i13 = iC2 % i14;
        } else {
            i13 = ((iC2 + 1) % i14) + (i14 - 1);
        }
        return abstractC44864f.G((i12 * i14) + i13, j12);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long a(int i12, long j12) {
        return this.f420691c.a(i12 * this.f420696d, j12);
    }

    @Override // org.joda.time.field.c, org.joda.time.AbstractC44864f
    public final long b(long j12, long j13) {
        return this.f420691c.b(j12, j13 * this.f420696d);
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final int c(long j12) {
        int iC2 = this.f420691c.c(j12);
        return iC2 >= 0 ? iC2 / this.f420696d : ((iC2 + 1) / r3) - 1;
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final AbstractC44871m k() {
        return this.f420697e;
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final int n() {
        return this.f420700h;
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final int s() {
        return this.f420699g;
    }

    @Override // org.joda.time.field.e, org.joda.time.AbstractC44864f
    public final AbstractC44871m x() {
        AbstractC44871m abstractC44871m = this.f420698f;
        return abstractC44871m != null ? abstractC44871m : super.x();
    }
}
