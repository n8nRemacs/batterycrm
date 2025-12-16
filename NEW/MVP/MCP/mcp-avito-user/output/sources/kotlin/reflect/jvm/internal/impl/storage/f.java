package kotlin.reflect.jvm.internal.impl.storage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.G0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: LockBasedStorageManager.java */
/* loaded from: classes8.dex */
public class f implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final String f409975d;

    /* renamed from: e, reason: collision with root package name */
    public static final p f409976e;

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.storage.m f409977a;

    /* renamed from: b, reason: collision with root package name */
    public final e f409978b;

    /* renamed from: c, reason: collision with root package name */
    public final String f409979c;

    /* compiled from: LockBasedStorageManager.java */
    public static class a extends f {
        @Override // kotlin.reflect.jvm.internal.impl.storage.f
        @Y61.k
        public final n j(Object obj, @Y61.k String str) {
            return new n(null, true);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LockBasedStorageManager.java */
    public class b<T> extends j<T> {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Y41.l f409980f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Y41.l f409981g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, Y41.a aVar, Y41.l lVar, Y41.l lVar2) {
            super(fVar, aVar);
            this.f409980f = lVar;
            this.f409981g = lVar2;
            if (fVar == null) {
                j.a(0);
                throw null;
            }
            this.f409988e = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.g
        @Y61.k
        public final n<T> d(boolean z12) {
            Y41.l lVar = this.f409980f;
            return lVar == null ? super.d(z12) : new n<>(lVar.invoke(Boolean.valueOf(z12)), false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.h
        public final void f(@Y61.k T t12) {
            if (t12 == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "value", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5", "doPostCompute"));
            }
            this.f409981g.invoke(t12);
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    public static class c<K, V> extends d<K, V> implements kotlin.reflect.jvm.internal.impl.storage.a<K, V> {
        public c() {
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f fVar, ConcurrentMap concurrentMap, a aVar) {
            super(fVar, concurrentMap, null);
            if (fVar == null) {
                b(0);
                throw null;
            }
            if (concurrentMap != null) {
            } else {
                b(1);
                throw null;
            }
        }

        public static /* synthetic */ void b(int i12) {
            String str = i12 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i12 != 3 ? 3 : 2];
            if (i12 == 1) {
                objArr[0] = "map";
            } else if (i12 == 2) {
                objArr[0] = "computation";
            } else if (i12 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i12 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i12 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i12 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i12 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.a
        @Y61.k
        public final Object a(@Y61.k Y41.a aVar, Object obj) throws Throwable {
            V vInvoke = invoke(new C11693f((kotlin.reflect.jvm.internal.impl.name.c) obj, aVar));
            if (vInvoke != null) {
                return vInvoke;
            }
            b(3);
            throw null;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    public static class d<K, V> extends k<C11693f<K, V>, V> implements kotlin.reflect.jvm.internal.impl.storage.b<K, V> {
        public d() {
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f fVar, ConcurrentMap concurrentMap, a aVar) {
            super(fVar, concurrentMap, new kotlin.reflect.jvm.internal.impl.storage.h());
            if (fVar == null) {
                b(0);
                throw null;
            }
            if (concurrentMap != null) {
            } else {
                b(1);
                throw null;
            }
        }

        public static /* synthetic */ void b(int i12) {
            Object[] objArr = new Object[3];
            if (i12 == 1) {
                objArr[0] = "map";
            } else if (i12 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i12 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.storage.f$f, reason: collision with other inner class name */
    public static class C11693f<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.name.c f409983a;

        /* renamed from: b, reason: collision with root package name */
        public final N f409984b;

        /* JADX WARN: Multi-variable type inference failed */
        public C11693f(kotlin.reflect.jvm.internal.impl.name.c cVar, Y41.a aVar) {
            this.f409983a = cVar;
            this.f409984b = (N) aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f409983a.equals(((C11693f) obj).f409983a);
        }

        public final int hashCode() {
            return this.f409983a.hashCode();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    public static abstract class h<T> extends g<T> {

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public volatile kotlin.reflect.jvm.internal.impl.storage.n<T> f409988e;

        public h() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.g
        public final void b(T t12) {
            this.f409988e = new kotlin.reflect.jvm.internal.impl.storage.n<>(t12);
            try {
                f(t12);
            } finally {
                this.f409988e = null;
            }
        }

        public abstract void f(T t12);

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.g, Y41.a
        public T invoke() {
            kotlin.reflect.jvm.internal.impl.storage.n<T> nVar = this.f409988e;
            if (nVar == null || nVar.f410002b != Thread.currentThread()) {
                return (T) super.invoke();
            }
            if (nVar.f410002b == Thread.currentThread()) {
                return nVar.f410001a;
            }
            throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    public static class i<T> extends g<T> implements kotlin.reflect.jvm.internal.impl.storage.k<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(@Y61.k f fVar, @Y61.k Y41.a<? extends T> aVar) {
            super(fVar, aVar);
            if (fVar == null) {
                a(0);
                throw null;
            }
            if (aVar != null) {
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i12) {
            String str = i12 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i12 != 2 ? 3 : 2];
            if (i12 == 1) {
                objArr[0] = "computable";
            } else if (i12 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i12 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i12 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i12 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.g, Y41.a
        @Y61.k
        public final T invoke() {
            T t12 = (T) super.invoke();
            if (t12 != null) {
                return t12;
            }
            a(2);
            throw null;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    public static abstract class j<T> extends h<T> implements kotlin.reflect.jvm.internal.impl.storage.k<T> {
        public j() {
            throw null;
        }

        public static /* synthetic */ void a(int i12) {
            String str = i12 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i12 != 2 ? 3 : 2];
            if (i12 == 1) {
                objArr[0] = "computable";
            } else if (i12 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i12 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i12 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i12 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.h, kotlin.reflect.jvm.internal.impl.storage.f.g, Y41.a
        @Y61.k
        public final T invoke() {
            T t12 = (T) super.invoke();
            if (t12 != null) {
                return t12;
            }
            a(2);
            throw null;
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    public static class k<K, V> implements kotlin.reflect.jvm.internal.impl.storage.j<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final f f409989b;

        /* renamed from: c, reason: collision with root package name */
        public final ConcurrentMap<K, Object> f409990c;

        /* renamed from: d, reason: collision with root package name */
        public final Y41.l<? super K, ? extends V> f409991d;

        public k(@Y61.k f fVar, @Y61.k ConcurrentMap<K, Object> concurrentMap, @Y61.k Y41.l<? super K, ? extends V> lVar) {
            if (fVar == null) {
                b(0);
                throw null;
            }
            this.f409989b = fVar;
            this.f409990c = concurrentMap;
            this.f409991d = lVar;
        }

        public static /* synthetic */ void b(int i12) {
            String str = (i12 == 3 || i12 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i12 == 3 || i12 == 4) ? 2 : 3];
            if (i12 == 1) {
                objArr[0] = "map";
            } else if (i12 == 2) {
                objArr[0] = "compute";
            } else if (i12 == 3 || i12 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i12 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i12 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i12 != 3 && i12 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i12 != 3 && i12 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public final AssertionError d(K k12, Object obj) {
            AssertionError assertionError = new AssertionError("Inconsistent key detected. " + m.f409993c + " is expected, was: " + obj + ", most probably race condition detected on input " + k12 + " under " + this.f409989b);
            f.k(assertionError);
            return assertionError;
        }

        @Y61.k
        public final AssertionError f(K k12, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k12 + ". Old value is " + obj + " under " + this.f409989b);
            f.k(assertionError);
            return assertionError;
        }

        public final AssertionError g(K k12, Throwable th2) {
            AssertionError assertionError = new AssertionError("Unable to remove " + k12 + " under " + this.f409989b, th2);
            f.k(assertionError);
            return assertionError;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.j
        public final boolean h(kotlin.reflect.jvm.internal.impl.name.c cVar) {
            Object obj = this.f409990c.get(cVar);
            return (obj == null || obj == m.f409993c) ? false : true;
        }

        /* JADX WARN: Removed duplicated region for block: B:75:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // Y41.l
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public V invoke(K r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.f.k.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    public static class l<K, V> extends k<K, V> implements kotlin.reflect.jvm.internal.impl.storage.i<K, V> {
        public l() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.f.k, Y41.l
        @Y61.k
        public final V invoke(K k12) {
            V v12 = (V) super.invoke(k12);
            if (v12 != null) {
                return v12;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LockBasedStorageManager.java */
    public static final class m {

        /* renamed from: b, reason: collision with root package name */
        public static final m f409992b;

        /* renamed from: c, reason: collision with root package name */
        public static final m f409993c;

        /* renamed from: d, reason: collision with root package name */
        public static final m f409994d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ m[] f409995e;

        static {
            m mVar = new m("NOT_COMPUTED", 0);
            f409992b = mVar;
            m mVar2 = new m("COMPUTING", 1);
            f409993c = mVar2;
            m mVar3 = new m("RECURSION_WAS_DETECTED", 2);
            f409994d = mVar3;
            f409995e = new m[]{mVar, mVar2, mVar3};
        }

        public m() {
            throw null;
        }

        public static m valueOf(String str) {
            return (m) Enum.valueOf(m.class, str);
        }

        public static m[] values() {
            return (m[]) f409995e.clone();
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    public static class n<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f409996a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f409997b;

        public n(T t12, boolean z12) {
            this.f409996a = t12;
            this.f409997b = z12;
        }

        public final String toString() {
            return this.f409997b ? "FALL_THROUGH" : String.valueOf(this.f409996a);
        }
    }

    static {
        String canonicalName = f.class.getCanonicalName();
        int iN2 = C43066x.N(6, canonicalName, ".");
        f409975d = iN2 == -1 ? "" : canonicalName.substring(0, iN2);
        f409976e = new a("NO_LOCKS", e.f409982a, kotlin.reflect.jvm.internal.impl.storage.e.f409974b, null);
    }

    public f() {
        throw null;
    }

    public /* synthetic */ f(String str, e eVar, kotlin.reflect.jvm.internal.impl.storage.m mVar, a aVar) {
        this(str, eVar, mVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void h(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.f.h(int):void");
    }

    @Y61.k
    public static void k(@Y61.k AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i12 = -1;
                break;
            } else if (!stackTrace[i12].getClassName().startsWith(f409975d)) {
                break;
            } else {
                i12++;
            }
        }
        List listSubList = Arrays.asList(stackTrace).subList(i12, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.p
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k a(@Y61.k Y41.a aVar, @Y61.k C42784z0 c42784z0) {
        if (c42784z0 != null) {
            return new kotlin.reflect.jvm.internal.impl.storage.g(this, aVar, c42784z0);
        }
        h(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.p
    @Y61.k
    public final <K, V> kotlin.reflect.jvm.internal.impl.storage.j<K, V> b(@Y61.k Y41.l<? super K, ? extends V> lVar) {
        return new k(this, new ConcurrentHashMap(3, 1.0f, 2), lVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.p
    @Y61.k
    public final <K, V> kotlin.reflect.jvm.internal.impl.storage.i<K, V> c(@Y61.k Y41.l<? super K, ? extends V> lVar) {
        return new l(this, new ConcurrentHashMap(3, 1.0f, 2), lVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.p
    @Y61.k
    public final <T> kotlin.reflect.jvm.internal.impl.storage.k<T> d(@Y61.k Y41.a<? extends T> aVar, Y41.l<? super Boolean, ? extends T> lVar, @Y61.k Y41.l<? super T, G0> lVar2) {
        return new b(this, aVar, lVar, lVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.p
    @Y61.k
    public final <K, V> kotlin.reflect.jvm.internal.impl.storage.a<K, V> e() {
        return new c(this, new ConcurrentHashMap(3, 1.0f, 2), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.p
    @Y61.k
    public final <T> kotlin.reflect.jvm.internal.impl.storage.l<T> f(@Y61.k Y41.a<? extends T> aVar) {
        return new g(this, aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.p
    @Y61.k
    public final <T> kotlin.reflect.jvm.internal.impl.storage.k<T> g(@Y61.k Y41.a<? extends T> aVar) {
        if (aVar != null) {
            return new i(this, aVar);
        }
        h(23);
        throw null;
    }

    @Y61.k
    public final <K, V> kotlin.reflect.jvm.internal.impl.storage.b<K, V> i() {
        return new d(this, new ConcurrentHashMap(3, 1.0f, 2), null);
    }

    @Y61.k
    public n j(Object obj, @Y61.k String str) {
        StringBuilder sb2 = new StringBuilder("Recursion detected ");
        sb2.append(str);
        sb2.append(obj == null ? "" : androidx.camera.view.k.a(obj, "on input: "));
        sb2.append(" under ");
        sb2.append(this);
        AssertionError assertionError = new AssertionError(sb2.toString());
        k(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(" (");
        return AK.c.s(sb2, this.f409979c, ")");
    }

    public f(@Y61.k String str, @Y61.k e eVar, @Y61.k kotlin.reflect.jvm.internal.impl.storage.m mVar) {
        if (str == null) {
            h(4);
            throw null;
        }
        if (eVar == null) {
            h(5);
            throw null;
        }
        if (mVar == null) {
            h(6);
            throw null;
        }
        this.f409977a = mVar;
        this.f409978b = eVar;
        this.f409979c = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(String str) {
        e eVar = e.f409982a;
        kotlin.reflect.jvm.internal.impl.storage.m.f409999a.getClass();
        this(str, eVar, new kotlin.reflect.jvm.internal.impl.storage.d(null, 1, null));
    }

    /* compiled from: LockBasedStorageManager.java */
    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f409982a = new a();

        @Y61.k
        RuntimeException a(@Y61.k Throwable th2);

        /* compiled from: LockBasedStorageManager.java */
        public static class a implements e {
            @Override // kotlin.reflect.jvm.internal.impl.storage.f.e
            @Y61.k
            public final RuntimeException a(@Y61.k Throwable th2) throws Throwable {
                throw th2;
            }
        }
    }

    /* compiled from: LockBasedStorageManager.java */
    public static class g<T> implements kotlin.reflect.jvm.internal.impl.storage.l<T> {

        /* renamed from: b, reason: collision with root package name */
        public final f f409985b;

        /* renamed from: c, reason: collision with root package name */
        public final Y41.a<? extends T> f409986c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public volatile Object f409987d;

        public g(@Y61.k f fVar, @Y61.k Y41.a<? extends T> aVar) {
            if (fVar == null) {
                a(0);
                throw null;
            }
            if (aVar == null) {
                a(1);
                throw null;
            }
            this.f409987d = m.f409992b;
            this.f409985b = fVar;
            this.f409986c = aVar;
        }

        public static /* synthetic */ void a(int i12) {
            String str = (i12 == 2 || i12 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i12 == 2 || i12 == 3) ? 2 : 3];
            if (i12 == 1) {
                objArr[0] = "computable";
            } else if (i12 == 2 || i12 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i12 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i12 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i12 != 2 && i12 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i12 != 2 && i12 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Y61.k
        public n<T> d(boolean z12) {
            n<T> nVarJ = this.f409985b.j(null, "in a lazy value");
            if (nVarJ != null) {
                return nVarJ;
            }
            a(2);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:16:0x002a, B:18:0x0035, B:20:0x003a, B:22:0x0043, B:23:0x0046, B:27:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x0065, B:33:0x006d, B:34:0x006e, B:35:0x0074, B:24:0x0048), top: B:38:0x0011, inners: #1 }] */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public T invoke() throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f409987d
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.storage.f.m
                if (r1 != 0) goto La
                kotlin.reflect.jvm.internal.impl.utils.WrappedValues.c(r0)
                return r0
            La:
                kotlin.reflect.jvm.internal.impl.storage.f r0 = r5.f409985b
                kotlin.reflect.jvm.internal.impl.storage.m r0 = r0.f409977a
                r0.lock()
                java.lang.Object r0 = r5.f409987d     // Catch: java.lang.Throwable -> L22
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.storage.f.m     // Catch: java.lang.Throwable -> L22
                if (r1 != 0) goto L24
                kotlin.reflect.jvm.internal.impl.utils.WrappedValues.c(r0)     // Catch: java.lang.Throwable -> L22
            L1a:
                kotlin.reflect.jvm.internal.impl.storage.f r1 = r5.f409985b
                kotlin.reflect.jvm.internal.impl.storage.m r1 = r1.f409977a
                r1.unlock()
                return r0
            L22:
                r0 = move-exception
                goto L75
            L24:
                kotlin.reflect.jvm.internal.impl.storage.f$m r1 = kotlin.reflect.jvm.internal.impl.storage.f.m.f409993c
                kotlin.reflect.jvm.internal.impl.storage.f$m r2 = kotlin.reflect.jvm.internal.impl.storage.f.m.f409994d
                if (r0 != r1) goto L38
                r5.f409987d = r2     // Catch: java.lang.Throwable -> L22
                r3 = 1
                kotlin.reflect.jvm.internal.impl.storage.f$n r3 = r5.d(r3)     // Catch: java.lang.Throwable -> L22
                boolean r4 = r3.f409997b     // Catch: java.lang.Throwable -> L22
                if (r4 != 0) goto L38
                T r0 = r3.f409996a     // Catch: java.lang.Throwable -> L22
                goto L1a
            L38:
                if (r0 != r2) goto L46
                r0 = 0
                kotlin.reflect.jvm.internal.impl.storage.f$n r0 = r5.d(r0)     // Catch: java.lang.Throwable -> L22
                boolean r2 = r0.f409997b     // Catch: java.lang.Throwable -> L22
                if (r2 != 0) goto L46
                T r0 = r0.f409996a     // Catch: java.lang.Throwable -> L22
                goto L1a
            L46:
                r5.f409987d = r1     // Catch: java.lang.Throwable -> L22
                Y41.a<? extends T> r0 = r5.f409986c     // Catch: java.lang.Throwable -> L54
                java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L54
                r5.b(r0)     // Catch: java.lang.Throwable -> L54
                r5.f409987d = r0     // Catch: java.lang.Throwable -> L54
                goto L1a
            L54:
                r0 = move-exception
                boolean r2 = kotlin.reflect.jvm.internal.impl.utils.d.a(r0)     // Catch: java.lang.Throwable -> L22
                if (r2 != 0) goto L6e
                java.lang.Object r2 = r5.f409987d     // Catch: java.lang.Throwable -> L22
                if (r2 != r1) goto L65
                java.lang.Object r1 = kotlin.reflect.jvm.internal.impl.utils.WrappedValues.b(r0)     // Catch: java.lang.Throwable -> L22
                r5.f409987d = r1     // Catch: java.lang.Throwable -> L22
            L65:
                kotlin.reflect.jvm.internal.impl.storage.f r1 = r5.f409985b     // Catch: java.lang.Throwable -> L22
                kotlin.reflect.jvm.internal.impl.storage.f$e r1 = r1.f409978b     // Catch: java.lang.Throwable -> L22
                r1.a(r0)     // Catch: java.lang.Throwable -> L22
                r0 = 0
                throw r0     // Catch: java.lang.Throwable -> L22
            L6e:
                kotlin.reflect.jvm.internal.impl.storage.f$m r1 = kotlin.reflect.jvm.internal.impl.storage.f.m.f409992b     // Catch: java.lang.Throwable -> L22
                r5.f409987d = r1     // Catch: java.lang.Throwable -> L22
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch: java.lang.Throwable -> L22
                throw r0     // Catch: java.lang.Throwable -> L22
            L75:
                kotlin.reflect.jvm.internal.impl.storage.f r1 = r5.f409985b
                kotlin.reflect.jvm.internal.impl.storage.m r1 = r1.f409977a
                r1.unlock()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.f.g.invoke():java.lang.Object");
        }

        public final boolean k() {
            return (this.f409987d == m.f409992b || this.f409987d == m.f409993c) ? false : true;
        }

        public void b(T t12) {
        }
    }
}
