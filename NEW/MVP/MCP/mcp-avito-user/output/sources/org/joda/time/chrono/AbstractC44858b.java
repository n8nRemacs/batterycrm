package org.joda.time.chrono;

import java.io.Serializable;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;
import org.joda.time.AbstractC44872n;

/* compiled from: BaseChronology.java */
/* renamed from: org.joda.time.chrono.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC44858b extends AbstractC44854a implements Serializable {
    private static final long serialVersionUID = -7310865996721419676L;

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f A() {
        return org.joda.time.field.w.J(AbstractC44865g.f420887i, B());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44871m B() {
        return org.joda.time.field.x.h(AbstractC44872n.f420933g);
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f C() {
        return org.joda.time.field.w.J(AbstractC44865g.f420900v, F());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f E() {
        return org.joda.time.field.w.J(AbstractC44865g.f420901w, F());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44871m F() {
        return org.joda.time.field.x.h(AbstractC44872n.f420939m);
    }

    @Override // org.joda.time.AbstractC44854a
    public final long G(org.joda.time.base.e eVar) {
        int size = eVar.size();
        long jG2 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            jG2 = eVar.I(i12).b(this).G(eVar.g(i12), jG2);
        }
        return jG2;
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f H() {
        return org.joda.time.field.w.J(AbstractC44865g.f420891m, I());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44871m I() {
        return org.joda.time.field.x.h(AbstractC44872n.f420934h);
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f J() {
        return org.joda.time.field.w.J(AbstractC44865g.f420890l, L());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f K() {
        return org.joda.time.field.w.J(AbstractC44865g.f420889k, L());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44871m L() {
        return org.joda.time.field.x.h(AbstractC44872n.f420931e);
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f P() {
        return org.joda.time.field.w.J(AbstractC44865g.f420885g, S());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f Q() {
        return org.joda.time.field.w.J(AbstractC44865g.f420884f, S());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f R() {
        return org.joda.time.field.w.J(AbstractC44865g.f420882d, S());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44871m S() {
        return org.joda.time.field.x.h(AbstractC44872n.f420932f);
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44871m a() {
        return org.joda.time.field.x.h(AbstractC44872n.f420930d);
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f b() {
        return org.joda.time.field.w.J(AbstractC44865g.f420883e, a());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f c() {
        return org.joda.time.field.w.J(AbstractC44865g.f420896r, t());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f d() {
        return org.joda.time.field.w.J(AbstractC44865g.f420895q, t());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f e() {
        return org.joda.time.field.w.J(AbstractC44865g.f420888j, h());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f f() {
        return org.joda.time.field.w.J(AbstractC44865g.f420892n, h());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f g() {
        return org.joda.time.field.w.J(AbstractC44865g.f420886h, h());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44871m h() {
        return org.joda.time.field.x.h(AbstractC44872n.f420935i);
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f i() {
        return org.joda.time.field.w.J(AbstractC44865g.f420881c, k());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44871m k() {
        return org.joda.time.field.x.h(AbstractC44872n.f420929c);
    }

    @Override // org.joda.time.AbstractC44854a
    public long l(int i12, int i13, int i14, int i15) {
        return v().G(i15, e().G(i14, A().G(i13, P().G(i12, 0L))));
    }

    @Override // org.joda.time.AbstractC44854a
    public long m(int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        return w().G(i18, E().G(i17, y().G(i16, r().G(i15, e().G(i14, A().G(i13, P().G(i12, 0L)))))));
    }

    @Override // org.joda.time.AbstractC44854a
    public long n(long j12) {
        return w().G(0, E().G(0, y().G(0, r().G(0, j12))));
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f p() {
        return org.joda.time.field.w.J(AbstractC44865g.f420893o, q());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44871m q() {
        return org.joda.time.field.x.h(AbstractC44872n.f420936j);
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f r() {
        return org.joda.time.field.w.J(AbstractC44865g.f420897s, t());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f s() {
        return org.joda.time.field.w.J(AbstractC44865g.f420894p, t());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44871m t() {
        return org.joda.time.field.x.h(AbstractC44872n.f420937k);
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44871m u() {
        return org.joda.time.field.x.h(AbstractC44872n.f420940n);
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f v() {
        return org.joda.time.field.w.J(AbstractC44865g.f420902x, u());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f w() {
        return org.joda.time.field.w.J(AbstractC44865g.f420903y, u());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f x() {
        return org.joda.time.field.w.J(AbstractC44865g.f420898t, z());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44864f y() {
        return org.joda.time.field.w.J(AbstractC44865g.f420899u, z());
    }

    @Override // org.joda.time.AbstractC44854a
    public AbstractC44871m z() {
        return org.joda.time.field.x.h(AbstractC44872n.f420938l);
    }
}
