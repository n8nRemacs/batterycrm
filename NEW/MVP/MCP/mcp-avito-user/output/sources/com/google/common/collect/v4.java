package com.google.common.collect;

import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.t4;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: Tables.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public final class v4 {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC37276u<? extends Map<?, ?>, ? extends Map<?, ?>> f360041a = new a();

    /* compiled from: Tables.java */
    public class a implements InterfaceC37276u<Map<Object, Object>, Map<Object, Object>> {
        @Override // com.google.common.base.InterfaceC37276u
        public final Object apply(Object obj) {
            return Collections.unmodifiableMap((Map) obj);
        }
    }

    /* compiled from: Tables.java */
    public static abstract class b<R, C, V> implements t4.a<R, C, V> {
        public final boolean equals(@I41.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof t4.a)) {
                return false;
            }
            t4.a aVar = (t4.a) obj;
            return com.google.common.base.F.a(b(), aVar.b()) && com.google.common.base.F.a(a(), aVar.a()) && com.google.common.base.F.a(getValue(), aVar.getValue());
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{b(), a(), getValue()});
        }

        public final String toString() {
            return "(" + b() + "," + a() + ")=" + getValue();
        }
    }

    /* compiled from: Tables.java */
    public static final class c<R, C, V> extends b<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC37434x3
        public final R f360042b;

        /* renamed from: c, reason: collision with root package name */
        @InterfaceC37434x3
        public final C f360043c;

        /* renamed from: d, reason: collision with root package name */
        @InterfaceC37434x3
        public final V f360044d;

        public c(@InterfaceC37434x3 R r12, @InterfaceC37434x3 C c12, @InterfaceC37434x3 V v12) {
            this.f360042b = r12;
            this.f360043c = c12;
            this.f360044d = v12;
        }

        @Override // com.google.common.collect.t4.a
        @InterfaceC37434x3
        public final C a() {
            return this.f360043c;
        }

        @Override // com.google.common.collect.t4.a
        @InterfaceC37434x3
        public final R b() {
            return this.f360042b;
        }

        @Override // com.google.common.collect.t4.a
        @InterfaceC37434x3
        public final V getValue() {
            return this.f360044d;
        }
    }

    /* compiled from: Tables.java */
    public static class d<R, C, V1, V2> extends AbstractC37405s<R, C, V2> {

        /* compiled from: Tables.java */
        public class a implements InterfaceC37276u<Map<C, V1>, Map<C, V2>> {
            @Override // com.google.common.base.InterfaceC37276u
            public final Object apply(Object obj) {
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractC37405s
        public final Iterator<t4.a<R, C, V2>> a() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37405s
        public final void b() {
            throw null;
        }

        @Override // com.google.common.collect.t4, com.google.common.collect.R3
        public final Map<R, Map<C, V2>> d() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37405s
        public final Collection<V2> f() {
            throw null;
        }

        @Override // com.google.common.collect.t4
        public final int size() {
            throw null;
        }
    }

    /* compiled from: Tables.java */
    public static class e<C, R, V> extends AbstractC37405s<C, R, V> {

        /* renamed from: d, reason: collision with root package name */
        public static final InterfaceC37276u f360045d = null;

        /* compiled from: Tables.java */
        public class a implements InterfaceC37276u<t4.a<?, ?, ?>, t4.a<?, ?, ?>> {
            @Override // com.google.common.base.InterfaceC37276u
            public final Object apply(Object obj) {
                t4.a aVar = (t4.a) obj;
                Object objA = aVar.a();
                Object objB = aVar.b();
                Object value = aVar.getValue();
                InterfaceC37276u<? extends Map<?, ?>, ? extends Map<?, ?>> interfaceC37276u = v4.f360041a;
                return new c(objA, objB, value);
            }
        }

        static {
            new a();
        }

        @Override // com.google.common.collect.AbstractC37405s
        public final Iterator<t4.a<C, R, V>> a() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37405s
        public final void b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37405s
        public final boolean c(@I41.a Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.t4, com.google.common.collect.R3
        public final Map<C, Map<R, V>> d() {
            throw null;
        }

        @Override // com.google.common.collect.t4
        public final int size() {
            throw null;
        }
    }

    /* compiled from: Tables.java */
    public static class g<R, C, V> extends AbstractC37300a1<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.AbstractC37300a1, com.google.common.collect.t4
        public final Set<t4.a<R, C, V>> U() {
            return Collections.unmodifiableSet(super.U());
        }

        @Override // com.google.common.collect.AbstractC37300a1, com.google.common.collect.S0
        public /* bridge */ /* synthetic */ Object X() {
            return null;
        }

        @Override // com.google.common.collect.AbstractC37300a1, com.google.common.collect.t4, com.google.common.collect.R3
        public Map<R, Map<C, V>> d() {
            return Collections.unmodifiableMap(M2.l(super.d(), v4.f360041a));
        }
    }

    /* compiled from: Tables.java */
    public static final class f<R, C, V> extends g<R, C, V> implements R3<R, C, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.v4.g, com.google.common.collect.AbstractC37300a1, com.google.common.collect.S0
        public final /* bridge */ /* synthetic */ Object X() {
            return null;
        }

        @Override // com.google.common.collect.v4.g, com.google.common.collect.AbstractC37300a1, com.google.common.collect.t4, com.google.common.collect.R3
        public final Map d() {
            InterfaceC37276u<? extends Map<?, ?>, ? extends Map<?, ?>> interfaceC37276u = v4.f360041a;
            throw null;
        }

        @Override // com.google.common.collect.v4.g, com.google.common.collect.AbstractC37300a1, com.google.common.collect.t4, com.google.common.collect.R3
        public final SortedMap<R, Map<C, V>> d() {
            InterfaceC37276u<? extends Map<?, ?>, ? extends Map<?, ?>> interfaceC37276u = v4.f360041a;
            throw null;
        }
    }
}
