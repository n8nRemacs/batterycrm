package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: MultimapBuilder.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class W2<K0, V0> {

    /* compiled from: MultimapBuilder.java */
    public static final class a<V> implements com.google.common.base.e0<List<V>>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final int f359590b;

        public a() {
            F.b(2, "expectedValuesPerKey");
            this.f359590b = 2;
        }

        @Override // com.google.common.base.e0
        public final Object get() {
            return new ArrayList(this.f359590b);
        }
    }

    /* compiled from: MultimapBuilder.java */
    public static final class b<V extends Enum<V>> implements com.google.common.base.e0<Set<V>>, Serializable {
        @Override // com.google.common.base.e0
        public final Object get() {
            return EnumSet.noneOf(null);
        }
    }

    /* compiled from: MultimapBuilder.java */
    public static final class c<V> implements com.google.common.base.e0<Set<V>>, Serializable {
        @Override // com.google.common.base.e0
        public final Object get() {
            return new L(0);
        }
    }

    /* compiled from: MultimapBuilder.java */
    public static final class d<V> implements com.google.common.base.e0<Set<V>>, Serializable {
        @Override // com.google.common.base.e0
        public final Object get() {
            return new O(0);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MultimapBuilder.java */
    public static final class e implements com.google.common.base.e0<List<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ e[] f359591b = {new e("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        e EF5;

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f359591b.clone();
        }

        @Override // com.google.common.base.e0
        public final List<?> get() {
            return new LinkedList();
        }
    }

    /* compiled from: MultimapBuilder.java */
    public static abstract class f<K0, V0> extends W2<K0, V0> {
        public f() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> InterfaceC37408s2<K, V> c();
    }

    /* compiled from: MultimapBuilder.java */
    public static abstract class g<K0> {
        public final f<K0, Object> a() {
            F.b(2, "expectedValuesPerKey");
            return new X2(this);
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> b();
    }

    /* compiled from: MultimapBuilder.java */
    public static abstract class h<K0, V0> extends W2<K0, V0> {
        public h() {
            super(null);
        }
    }

    /* compiled from: MultimapBuilder.java */
    public static abstract class i<K0, V0> extends h<K0, V0> {
    }

    /* compiled from: MultimapBuilder.java */
    public static final class j<V> implements com.google.common.base.e0<SortedSet<V>>, Serializable {
        @Override // com.google.common.base.e0
        public final Object get() {
            return new TreeSet((Comparator) null);
        }
    }

    public /* synthetic */ W2(S2 s22) {
        this();
    }

    public static g<Object> a() {
        F.b(8, "expectedKeys");
        return new S2();
    }

    public static g<Comparable> b() {
        C37392p3 c37392p3 = C37392p3.f359948d;
        c37392p3.getClass();
        return new U2(c37392p3);
    }

    public W2() {
    }
}
