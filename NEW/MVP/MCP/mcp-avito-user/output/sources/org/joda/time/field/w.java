package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;

/* compiled from: UnsupportedDateTimeField.java */
/* loaded from: classes7.dex */
public final class w extends AbstractC44864f implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static HashMap<AbstractC44865g, w> f420722d = null;
    private static final long serialVersionUID = -1934618396111902255L;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC44865g f420723b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC44871m f420724c;

    public w(AbstractC44865g abstractC44865g, AbstractC44871m abstractC44871m) {
        if (abstractC44865g == null || abstractC44871m == null) {
            throw new IllegalArgumentException();
        }
        this.f420723b = abstractC44865g;
        this.f420724c = abstractC44871m;
    }

    public static synchronized w J(AbstractC44865g abstractC44865g, AbstractC44871m abstractC44871m) {
        w wVar;
        try {
            HashMap<AbstractC44865g, w> map = f420722d;
            wVar = null;
            if (map == null) {
                f420722d = new HashMap<>(7);
            } else {
                w wVar2 = map.get(abstractC44865g);
                if (wVar2 == null || wVar2.f420724c == abstractC44871m) {
                    wVar = wVar2;
                }
            }
            if (wVar == null) {
                wVar = new w(abstractC44865g, abstractC44871m);
                f420722d.put(abstractC44865g, wVar);
            }
        } finally {
        }
        return wVar;
    }

    private Object readResolve() {
        return J(this.f420723b, this.f420724c);
    }

    @Override // org.joda.time.AbstractC44864f
    public final boolean A() {
        return false;
    }

    @Override // org.joda.time.AbstractC44864f
    public final boolean B() {
        return false;
    }

    @Override // org.joda.time.AbstractC44864f
    public final long C(long j12) {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final long E(long j12) {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final long F(long j12) {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final long G(int i12, long j12) {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final long H(long j12, String str, Locale locale) {
        throw K();
    }

    public final UnsupportedOperationException K() {
        return new UnsupportedOperationException(this.f420723b + " field is unsupported");
    }

    @Override // org.joda.time.AbstractC44864f
    public final long a(int i12, long j12) {
        return this.f420724c.a(i12, j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public final long b(long j12, long j13) {
        return this.f420724c.b(j12, j13);
    }

    @Override // org.joda.time.AbstractC44864f
    public final int c(long j12) {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final String d(int i12, Locale locale) {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final String e(long j12, Locale locale) {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final String f(org.joda.time.base.e eVar, Locale locale) {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final String g(int i12, Locale locale) {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final String h(long j12, Locale locale) {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final String i(org.joda.time.base.e eVar, Locale locale) {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m k() {
        return this.f420724c;
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m l() {
        return null;
    }

    @Override // org.joda.time.AbstractC44864f
    public final int m(Locale locale) {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final int n() {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final int o(long j12) {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final int p(org.joda.time.base.k kVar) {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final int q(org.joda.time.base.k kVar, int[] iArr) {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final int s() {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final int t(long j12) {
        throw K();
    }

    public final String toString() {
        return "UnsupportedDateTimeField";
    }

    @Override // org.joda.time.AbstractC44864f
    public final int u(org.joda.time.base.k kVar) {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final int v(org.joda.time.base.k kVar, int[] iArr) {
        throw K();
    }

    @Override // org.joda.time.AbstractC44864f
    public final String w() {
        return this.f420723b.f420904b;
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m x() {
        return null;
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44865g y() {
        return this.f420723b;
    }

    @Override // org.joda.time.AbstractC44864f
    public final boolean z(long j12) {
        throw K();
    }
}
