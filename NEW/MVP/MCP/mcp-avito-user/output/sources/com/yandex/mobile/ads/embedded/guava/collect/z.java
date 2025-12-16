package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.l90;
import com.yandex.mobile.ads.impl.z71;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class z<K0, V0> {

    public static final class a<V> implements z71<List<V>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final int f382817a;

        public a(int i12) {
            this.f382817a = h.a(i12, "expectedValuesPerKey");
        }

        @Override // com.yandex.mobile.ads.impl.z71
        public final Object get() {
            return new ArrayList(this.f382817a);
        }
    }

    public static abstract class b<K0, V0> extends z<K0, V0> {
        public b() {
            super(0);
        }

        public abstract <K extends K0, V extends V0> l90<K, V> b();
    }

    public static abstract class c<K0> {
        public final b<K0, Object> a() {
            h.a(2, "expectedValuesPerKey");
            return new a0(this);
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> b();
    }

    public /* synthetic */ z(int i12) {
        this();
    }

    public static c<Comparable> a() {
        c0 c0Var = c0.f382712a;
        c0Var.getClass();
        return new y(c0Var);
    }

    private z() {
    }
}
