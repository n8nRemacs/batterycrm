package org.joda.time;

import java.io.Serializable;

/* compiled from: TimeOfDay.java */
@Deprecated
/* loaded from: classes7.dex */
public final class P extends org.joda.time.base.k implements M, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC44865g[] f420444d = {AbstractC44865g.f420897s, AbstractC44865g.f420899u, AbstractC44865g.f420901w, AbstractC44865g.f420903y};
    private static final long serialVersionUID = 3633353405803318660L;

    /* compiled from: TimeOfDay.java */
    @Deprecated
    public static class a extends org.joda.time.field.a implements Serializable {
        private static final long serialVersionUID = 5598459141741063833L;

        @Override // org.joda.time.field.a
        public final int a() {
            throw null;
        }

        @Override // org.joda.time.field.a
        public final AbstractC44864f b() {
            throw null;
        }
    }

    static {
        new P(new int[]{0, 0, 0, 0});
    }

    @Override // org.joda.time.base.e, org.joda.time.M
    public final AbstractC44865g I(int i12) {
        return f420444d[i12];
    }

    @Override // org.joda.time.base.e
    public final AbstractC44864f c(int i12, AbstractC44854a abstractC44854a) {
        if (i12 == 0) {
            return abstractC44854a.r();
        }
        if (i12 == 1) {
            return abstractC44854a.y();
        }
        if (i12 == 2) {
            return abstractC44854a.E();
        }
        if (i12 == 3) {
            return abstractC44854a.w();
        }
        throw new IndexOutOfBoundsException(AK.c.g(i12, "Invalid index: "));
    }

    @Override // org.joda.time.M
    public final int size() {
        return 4;
    }

    public final String toString() {
        return org.joda.time.format.j.i().d(this);
    }
}
