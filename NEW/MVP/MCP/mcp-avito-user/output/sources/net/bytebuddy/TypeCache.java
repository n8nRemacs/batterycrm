package net.bytebuddy;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.bytebuddy.build.k;
import org.mockito.internal.creation.bytebuddy.B;

/* loaded from: classes8.dex */
public class TypeCache<T> extends ReferenceQueue<ClassLoader> {

    /* renamed from: a, reason: collision with root package name */
    public final Sort f415324a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f415325b;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @net.bytebuddy.utility.nullability.b
        public final ClassLoader f415330a;

        /* renamed from: b, reason: collision with root package name */
        public final int f415331b;

        public b(@net.bytebuddy.utility.nullability.b ClassLoader classLoader) {
            this.f415330a = classLoader;
            this.f415331b = System.identityHashCode(classLoader);
        }

        @SuppressFBWarnings(justification = "Cross-comparison is intended.", value = {"EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS"})
        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            boolean z12 = obj instanceof b;
            ClassLoader classLoader = this.f415330a;
            if (z12) {
                return classLoader == ((b) obj).f415330a;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f415331b == dVar.f415334a && classLoader == dVar.get();
        }

        public final int hashCode() {
            return this.f415331b;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f415332a;

        /* renamed from: b, reason: collision with root package name */
        public transient /* synthetic */ int f415333b;

        public c() {
            throw null;
        }

        public c(Class cls, Set set) {
            List listC = net.bytebuddy.utility.a.c(cls, new ArrayList(set));
            this.f415332a = new HashSet();
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                this.f415332a.add(((Class) it.next()).getName());
            }
        }

        public boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f415332a.equals(((c) obj).f415332a);
        }

        @k.c
        public int hashCode() {
            int iHashCode = this.f415333b != 0 ? 0 : this.f415332a.hashCode();
            if (iHashCode == 0) {
                return this.f415333b;
            }
            this.f415333b = iHashCode;
            return iHashCode;
        }
    }

    public static class d extends WeakReference<ClassLoader> {

        /* renamed from: a, reason: collision with root package name */
        public final int f415334a;

        public d(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, TypeCache typeCache) {
            super(classLoader, typeCache);
            this.f415334a = System.identityHashCode(classLoader);
        }

        @SuppressFBWarnings(justification = "Cross-comparison is intended.", value = {"EQ_CHECK_FOR_OPERAND_NOT_COMPATIBLE_WITH_THIS"})
        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            boolean z12 = obj instanceof b;
            int i12 = this.f415334a;
            if (z12) {
                b bVar = (b) obj;
                return i12 == bVar.f415331b && get() == bVar.f415330a;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return i12 == dVar.f415334a && get() == dVar.get();
        }

        public final int hashCode() {
            return this.f415334a;
        }
    }

    public static class e<S> extends TypeCache<S> {
        public e() {
            super(Sort.f415328d);
        }

        @Override // net.bytebuddy.TypeCache
        public final Class<?> b(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, S s5) {
            try {
                return super.b(classLoader, s5);
            } finally {
                a();
            }
        }

        @Override // net.bytebuddy.TypeCache
        public final Class c(ClassLoader classLoader, Object obj, B b12) {
            try {
                return super.c(classLoader, obj, b12);
            } finally {
                a();
            }
        }

        @Override // net.bytebuddy.TypeCache
        public final Class d(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, Object obj, B b12, Object obj2) {
            try {
                return super.d(classLoader, obj, b12, obj2);
            } finally {
                a();
            }
        }

        @Override // net.bytebuddy.TypeCache
        public final Class<?> e(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, S s5, Class<?> cls) {
            try {
                return super.e(classLoader, s5, cls);
            } finally {
                a();
            }
        }
    }

    public TypeCache() {
        this(Sort.f415328d);
    }

    public final void a() {
        while (true) {
            Reference<? extends T> referencePoll = poll();
            if (referencePoll == null) {
                return;
            } else {
                this.f415325b.remove(referencePoll);
            }
        }
    }

    @SuppressFBWarnings(justification = "Cross-comparison is intended.", value = {"GC_UNRELATED_TYPES"})
    @net.bytebuddy.utility.nullability.b
    public Class<?> b(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, T t12) {
        Object obj;
        ConcurrentMap concurrentMap = (ConcurrentMap) this.f415325b.get(new b(classLoader));
        if (concurrentMap == null || (obj = concurrentMap.get(t12)) == null) {
            return null;
        }
        return obj instanceof Reference ? (Class) ((Reference) obj).get() : (Class) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Class c(ClassLoader classLoader, Object obj, B b12) {
        Class<?> clsB = b(classLoader, obj);
        if (clsB != null) {
            return clsB;
        }
        try {
            return e(classLoader, obj, (Class) b12.call());
        } catch (Throwable th2) {
            throw new IllegalArgumentException("Could not create type", th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Class d(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, Object obj, B b12, Object obj2) {
        Class clsC;
        Class<?> clsB = b(classLoader, obj);
        if (clsB != null) {
            return clsB;
        }
        synchronized (obj2) {
            clsC = c(classLoader, obj, b12);
        }
        return clsC;
    }

    @SuppressFBWarnings(justification = "Cross-comparison is intended.", value = {"GC_UNRELATED_TYPES"})
    public Class<?> e(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, T t12, Class<?> cls) {
        ConcurrentHashMap concurrentHashMap = this.f415325b;
        ConcurrentMap concurrentHashMap2 = (ConcurrentMap) concurrentHashMap.get(new b(classLoader));
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap();
            ConcurrentMap concurrentMap = (ConcurrentMap) concurrentHashMap.putIfAbsent(new d(classLoader, this), concurrentHashMap2);
            if (concurrentMap != null) {
                concurrentHashMap2 = concurrentMap;
            }
        }
        Object objA = this.f415324a.a(cls);
        Object objPutIfAbsent = concurrentHashMap2.putIfAbsent(t12, objA);
        while (objPutIfAbsent != null) {
            Class<?> cls2 = (Class) (objPutIfAbsent instanceof Reference ? ((Reference) objPutIfAbsent).get() : objPutIfAbsent);
            if (cls2 != null) {
                return cls2;
            }
            if (concurrentHashMap2.remove(t12, objPutIfAbsent)) {
                objPutIfAbsent = concurrentHashMap2.putIfAbsent(t12, objA);
            } else {
                objPutIfAbsent = concurrentHashMap2.get(t12);
                if (objPutIfAbsent == null) {
                    objPutIfAbsent = concurrentHashMap2.putIfAbsent(t12, objA);
                }
            }
        }
        return cls;
    }

    public TypeCache(Sort sort) {
        this.f415324a = sort;
        this.f415325b = new ConcurrentHashMap();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Sort {

        /* renamed from: b, reason: collision with root package name */
        public static final Sort f415326b;

        /* renamed from: c, reason: collision with root package name */
        public static final Sort f415327c;

        /* renamed from: d, reason: collision with root package name */
        public static final Sort f415328d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Sort[] f415329e;

        public enum a extends Sort {
            @Override // net.bytebuddy.TypeCache.Sort
            public final Object a(Class cls) {
                return new WeakReference(cls);
            }
        }

        public enum b extends Sort {
            @Override // net.bytebuddy.TypeCache.Sort
            public final Object a(Class cls) {
                return new SoftReference(cls);
            }
        }

        static {
            a aVar = new a("WEAK", 0, null);
            f415326b = aVar;
            b bVar = new b("SOFT", 1, null);
            f415327c = bVar;
            c cVar = new c("STRONG", 2, null);
            f415328d = cVar;
            f415329e = new Sort[]{aVar, bVar, cVar};
        }

        public Sort() {
            throw null;
        }

        public Sort(String str, int i12, a aVar) {
        }

        public static Sort valueOf(String str) {
            return (Sort) Enum.valueOf(Sort.class, str);
        }

        public static Sort[] values() {
            return (Sort[]) f415329e.clone();
        }

        public abstract Object a(Class<?> cls);

        public enum c extends Sort {
            @Override // net.bytebuddy.TypeCache.Sort
            public final Object a(Class cls) {
                return cls;
            }
        }
    }
}
