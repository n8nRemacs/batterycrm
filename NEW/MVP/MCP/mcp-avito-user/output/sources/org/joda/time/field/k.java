package org.joda.time.field;

import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;
import org.joda.time.AbstractC44872n;

/* compiled from: ImpreciseDateTimeField.java */
/* loaded from: classes7.dex */
public abstract class k extends c {

    /* renamed from: c, reason: collision with root package name */
    public final long f420701c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC44871m f420702d;

    /* compiled from: ImpreciseDateTimeField.java */
    public final class a extends d {
        private static final long serialVersionUID = -203813474600094134L;

        public a(AbstractC44872n abstractC44872n) {
            super(abstractC44872n);
        }

        @Override // org.joda.time.AbstractC44871m
        public final long a(int i12, long j12) {
            return k.this.a(i12, j12);
        }

        @Override // org.joda.time.AbstractC44871m
        public final long b(long j12, long j13) {
            return k.this.b(j12, j13);
        }

        @Override // org.joda.time.AbstractC44871m
        public final long d() {
            return k.this.f420701c;
        }

        @Override // org.joda.time.AbstractC44871m
        public final boolean e() {
            return false;
        }
    }

    public k(AbstractC44865g abstractC44865g, long j12) {
        super(abstractC44865g);
        this.f420701c = j12;
        this.f420702d = new a(abstractC44865g.a());
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m k() {
        return this.f420702d;
    }
}
