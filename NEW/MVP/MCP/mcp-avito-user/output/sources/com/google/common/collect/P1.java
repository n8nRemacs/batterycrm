package com.google.common.collect;

import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.t4;
import com.google.common.collect.v4;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ImmutableTable.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class P1<R, C, V> extends AbstractC37405s<R, C, V> implements Serializable {
    private static final long serialVersionUID = 912559;

    /* compiled from: ImmutableTable.java */
    @aZ0.f
    public static final class a<R, C, V> {
        public a() {
            new ArrayList();
        }
    }

    /* compiled from: ImmutableTable.java */
    public static final class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final Object[] f359536b;

        /* renamed from: c, reason: collision with root package name */
        public final Object[] f359537c;

        /* renamed from: d, reason: collision with root package name */
        public final Object[] f359538d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f359539e;

        /* renamed from: f, reason: collision with root package name */
        public final int[] f359540f;

        public b(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.f359536b = objArr;
            this.f359537c = objArr2;
            this.f359538d = objArr3;
            this.f359539e = iArr;
            this.f359540f = iArr2;
        }

        public static b a(P1<?, ?, ?> p12, int[] iArr, int[] iArr2) {
            H1<?> h1R = p12.r();
            Object[] objArr = AbstractC37378n1.f359865b;
            return new b(h1R.toArray(objArr), p12.l().toArray(objArr), p12.t().toArray(objArr), iArr, iArr2);
        }

        public Object readResolve() {
            Object[] objArr = this.f359538d;
            if (objArr.length == 0) {
                return C37369l4.f359822h;
            }
            int length = objArr.length;
            Object[] objArr2 = this.f359537c;
            Object[] objArr3 = this.f359536b;
            if (length == 1) {
                return new C37315c4(objArr3[0], objArr2[0], objArr[0]);
            }
            AbstractC37401r1.a aVar = new AbstractC37401r1.a(objArr.length);
            for (int i12 = 0; i12 < objArr.length; i12++) {
                aVar.g(P1.i(objArr3[this.f359539e[i12]], objArr2[this.f359540f[i12]], objArr[i12]));
            }
            AbstractC37401r1 abstractC37401r1I = aVar.i();
            H1 h1W = H1.w(objArr3);
            H1 h1W2 = H1.w(objArr2);
            return ((long) ((I3) abstractC37401r1I).f359392e) > (((long) h1W.size()) * ((long) h1W2.size())) / 2 ? new Z(abstractC37401r1I, h1W, h1W2) : new C37369l4(abstractC37401r1I, h1W, h1W2);
        }
    }

    public static <R, C, V> t4.a<R, C, V> i(R r12, C c12, V v12) {
        com.google.common.base.M.j(r12, "rowKey");
        com.google.common.base.M.j(c12, "columnKey");
        com.google.common.base.M.j(v12, "value");
        InterfaceC37276u<? extends Map<?, ?>, ? extends Map<?, ?>> interfaceC37276u = v4.f360041a;
        return new v4.c(r12, c12, v12);
    }

    @XY0.c
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.AbstractC37405s, com.google.common.collect.t4
    public final Set U() {
        return (H1) super.U();
    }

    @Override // com.google.common.collect.AbstractC37405s
    public final Iterator a() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC37405s
    @aZ0.e
    @Deprecated
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC37405s
    public final boolean c(@I41.a Object obj) {
        return ((AbstractC37378n1) super.g()).contains(obj);
    }

    @Override // com.google.common.collect.AbstractC37405s
    public final Iterator<V> h() {
        throw new AssertionError("should never be called");
    }

    public final H1<t4.a<R, C, V>> k() {
        return (H1) super.U();
    }

    public final H1<C> l() {
        return m().keySet();
    }

    public abstract AbstractC37412t1<C, Map<R, V>> m();

    @Override // com.google.common.collect.AbstractC37405s
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public abstract H1<t4.a<R, C, V>> e();

    public abstract b o();

    @Override // com.google.common.collect.AbstractC37405s
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC37378n1<V> f();

    @I41.a
    public Object q(@I41.a Object obj, @I41.a Object obj2) {
        Map map = (Map) M2.j(d(), obj);
        if (map == null) {
            return null;
        }
        return M2.j(map, obj2);
    }

    public final H1<R> r() {
        return d().keySet();
    }

    @Override // com.google.common.collect.t4, com.google.common.collect.R3
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC37412t1<R, Map<C, V>> d();

    public final AbstractC37378n1<V> t() {
        return (AbstractC37378n1) super.g();
    }

    public final Object writeReplace() {
        return o();
    }
}
