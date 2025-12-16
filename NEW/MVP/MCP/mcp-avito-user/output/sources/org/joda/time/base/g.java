package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.AbstractC44854a;
import org.joda.time.AbstractC44868j;
import org.joda.time.C44866h;
import org.joda.time.I;
import org.joda.time.chrono.x;

/* compiled from: BaseDateTime.java */
/* loaded from: classes7.dex */
public abstract class g extends a implements I, Serializable {
    private static final long serialVersionUID = -6728882245981L;

    /* renamed from: b, reason: collision with root package name */
    public volatile long f420462b;

    /* renamed from: c, reason: collision with root package name */
    public volatile AbstractC44854a f420463c;

    public g() {
        this(C44866h.a(), x.V());
    }

    public final void e() {
        if (this.f420462b == Long.MIN_VALUE || this.f420462b == Long.MAX_VALUE) {
            this.f420463c = this.f420463c.N();
        }
    }

    @Override // org.joda.time.K
    public final long getMillis() {
        return this.f420462b;
    }

    @Override // org.joda.time.K
    public final AbstractC44854a y() {
        return this.f420463c;
    }

    public g(long j12, AbstractC44868j abstractC44868j) {
        this(j12, x.W(abstractC44868j));
    }

    public g(long j12, AbstractC44854a abstractC44854a) {
        C44866h.b bVar = C44866h.f420908a;
        this.f420463c = abstractC44854a == null ? x.V() : abstractC44854a;
        this.f420462b = f(j12, this.f420463c);
        e();
    }

    public long f(long j12, AbstractC44854a abstractC44854a) {
        return j12;
    }
}
