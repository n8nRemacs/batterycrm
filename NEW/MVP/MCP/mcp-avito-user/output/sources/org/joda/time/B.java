package org.joda.time;

import java.io.Serializable;
import org.joda.time.C44866h;

/* compiled from: Partial.java */
/* loaded from: classes7.dex */
public final class B extends org.joda.time.base.e implements M, Serializable {
    private static final long serialVersionUID = 12324121189002L;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC44854a f420422b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC44865g[] f420423c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f420424d;

    /* renamed from: e, reason: collision with root package name */
    public transient org.joda.time.format.b[] f420425e;

    /* compiled from: Partial.java */
    public static class a extends org.joda.time.field.a implements Serializable {
        private static final long serialVersionUID = 53278362873888L;

        @Override // org.joda.time.field.a
        public final int a() {
            throw null;
        }

        @Override // org.joda.time.field.a
        public final AbstractC44864f b() {
            throw null;
        }
    }

    public B() {
        C44866h.b bVar = C44866h.f420908a;
        org.joda.time.chrono.x.V();
        this.f420422b = org.joda.time.chrono.x.f420650N;
        this.f420423c = new AbstractC44865g[0];
        this.f420424d = new int[0];
    }

    @Override // org.joda.time.base.e, org.joda.time.M
    public final AbstractC44865g I(int i12) {
        return this.f420423c[i12];
    }

    @Override // org.joda.time.base.e
    public final AbstractC44864f c(int i12, AbstractC44854a abstractC44854a) {
        return this.f420423c[i12].b(abstractC44854a);
    }

    public final String d() {
        AbstractC44865g[] abstractC44865gArr = this.f420423c;
        int length = abstractC44865gArr.length;
        StringBuilder sb2 = new StringBuilder(length * 20);
        sb2.append('[');
        for (int i12 = 0; i12 < length; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(abstractC44865gArr[i12].f420904b);
            sb2.append('=');
            sb2.append(this.f420424d[i12]);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // org.joda.time.M
    public final int g(int i12) {
        return this.f420424d[i12];
    }

    @Override // org.joda.time.M
    public final int size() {
        return this.f420423c.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            org.joda.time.format.b[] r0 = r5.f420425e
            r1 = 1
            if (r0 != 0) goto L38
            r2 = 0
            if (r0 != 0) goto L2d
            org.joda.time.g[] r0 = r5.f420423c
            int r3 = r0.length
            if (r3 != 0) goto Le
            goto L2f
        Le:
            r3 = 2
            org.joda.time.format.b[] r3 = new org.joda.time.format.b[r3]
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.IllegalArgumentException -> L2a
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.IllegalArgumentException -> L2a
            r4.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L2a
            org.joda.time.format.b r0 = org.joda.time.format.j.g(r4, r2)     // Catch: java.lang.IllegalArgumentException -> L2a
            r3[r2] = r0     // Catch: java.lang.IllegalArgumentException -> L2a
            int r0 = r4.size()     // Catch: java.lang.IllegalArgumentException -> L2a
            if (r0 != 0) goto L2a
            r0 = r3[r2]     // Catch: java.lang.IllegalArgumentException -> L2a
            r3[r1] = r0     // Catch: java.lang.IllegalArgumentException -> L2a
        L2a:
            r5.f420425e = r3
            r0 = r3
        L2d:
            r0 = r0[r2]
        L2f:
            org.joda.time.format.b[] r0 = r5.f420425e
            if (r0 != 0) goto L38
            java.lang.String r0 = r5.d()
            return r0
        L38:
            r0 = r0[r1]
            if (r0 != 0) goto L41
            java.lang.String r0 = r5.d()
            return r0
        L41:
            java.lang.String r0 = r0.d(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.B.toString():java.lang.String");
    }

    @Override // org.joda.time.M
    public final AbstractC44854a y() {
        return this.f420422b;
    }
}
