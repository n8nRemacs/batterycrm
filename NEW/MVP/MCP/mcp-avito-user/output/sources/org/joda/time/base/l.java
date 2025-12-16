package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.AbstractC44872n;
import org.joda.time.C44866h;
import org.joda.time.D;
import org.joda.time.N;
import org.joda.time.chrono.x;

/* compiled from: BasePeriod.java */
/* loaded from: classes7.dex */
public abstract class l extends f implements N, Serializable {
    private static final long serialVersionUID = -2110953284060001145L;

    /* renamed from: b, reason: collision with root package name */
    public final D f420467b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f420468c;

    /* compiled from: BasePeriod.java */
    public static class a extends f {
        @Override // org.joda.time.N
        public final D a() {
            D d12 = D.f420427e;
            if (d12 != null) {
                return d12;
            }
            D d13 = new D("Time", new AbstractC44872n[]{AbstractC44872n.f420937k, AbstractC44872n.f420938l, AbstractC44872n.f420939m, AbstractC44872n.f420940n});
            D.f420427e = d13;
            return d13;
        }

        @Override // org.joda.time.N
        public final int g(int i12) {
            return 0;
        }
    }

    static {
        new a();
    }

    public l() {
        C44866h.b bVar = C44866h.f420908a;
        D d12 = D.f420426d;
        if (d12 == null) {
            d12 = new D("Standard", new AbstractC44872n[]{AbstractC44872n.f420932f, AbstractC44872n.f420933g, AbstractC44872n.f420934h, AbstractC44872n.f420935i, AbstractC44872n.f420937k, AbstractC44872n.f420938l, AbstractC44872n.f420939m, AbstractC44872n.f420940n});
            D.f420426d = d12;
        }
        x.V();
        this.f420467b = d12;
        this.f420468c = new int[size()];
    }

    @Override // org.joda.time.N
    public final D a() {
        return this.f420467b;
    }

    @Override // org.joda.time.N
    public final int g(int i12) {
        return this.f420468c[i12];
    }
}
