package io.reactivex.rxjava3.internal.functions;

import com.google.common.util.concurrent.D0;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.schedulers.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import l41.InterfaceC43543a;
import l41.InterfaceC43544b;
import l41.c;
import l41.g;
import l41.h;
import l41.i;
import l41.j;
import org.reactivestreams.e;
import s41.C47998a;

/* compiled from: Functions.java */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final l41.o<Object, Object> f401991a = new x();

    /* renamed from: b, reason: collision with root package name */
    public static final Runnable f401992b = new r();

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC43543a f401993c = new o();

    /* renamed from: d, reason: collision with root package name */
    public static final g<Object> f401994d = new p();

    /* renamed from: e, reason: collision with root package name */
    public static final g<Throwable> f401995e = new t();

    /* renamed from: f, reason: collision with root package name */
    public static final g<Throwable> f401996f = new G();

    /* renamed from: g, reason: collision with root package name */
    public static final l41.q f401997g = new q();

    /* renamed from: h, reason: collision with root package name */
    public static final l41.r<Object> f401998h = new L();

    /* compiled from: Functions.java */
    public static final class A implements g<e> {
        @Override // l41.g
        public final void accept(e eVar) {
            eVar.request(Long.MAX_VALUE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Functions.java */
    public static final class B implements Comparator<Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ B[] f401999b = {new B("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        B EF5;

        public B() {
            throw null;
        }

        public static B valueOf(String str) {
            return (B) Enum.valueOf(B.class, str);
        }

        public static B[] values() {
            return (B[]) f401999b.clone();
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* compiled from: Functions.java */
    public static final class C<T> implements InterfaceC43543a {

        /* renamed from: b, reason: collision with root package name */
        public final g<? super io.reactivex.rxjava3.core.y<T>> f402000b;

        public C(g<? super io.reactivex.rxjava3.core.y<T>> gVar) {
            this.f402000b = gVar;
        }

        @Override // l41.InterfaceC43543a
        public final void run() {
            this.f402000b.accept(io.reactivex.rxjava3.core.y.f401974b);
        }
    }

    /* compiled from: Functions.java */
    public static final class D<T> implements g<Throwable> {

        /* renamed from: b, reason: collision with root package name */
        public final g<? super io.reactivex.rxjava3.core.y<T>> f402001b;

        public D(g<? super io.reactivex.rxjava3.core.y<T>> gVar) {
            this.f402001b = gVar;
        }

        @Override // l41.g
        public final void accept(Throwable th2) {
            this.f402001b.accept(io.reactivex.rxjava3.core.y.a(th2));
        }
    }

    /* compiled from: Functions.java */
    public static final class E<T> implements g<T> {

        /* renamed from: b, reason: collision with root package name */
        public final g<? super io.reactivex.rxjava3.core.y<T>> f402002b;

        public E(g<? super io.reactivex.rxjava3.core.y<T>> gVar) {
            this.f402002b = gVar;
        }

        @Override // l41.g
        public final void accept(T t12) {
            Objects.requireNonNull(t12, "value is null");
            this.f402002b.accept(new io.reactivex.rxjava3.core.y(t12));
        }
    }

    /* compiled from: Functions.java */
    public static final class F implements l41.s<Object> {
        @Override // l41.s
        public final Object get() {
            return null;
        }
    }

    /* compiled from: Functions.java */
    public static final class G implements g<Throwable> {
        @Override // l41.g
        public final void accept(Throwable th2) {
            C47998a.b(new OnErrorNotImplementedException(th2));
        }
    }

    /* compiled from: Functions.java */
    public static final class H<T> implements l41.o<T, d<T>> {

        /* renamed from: b, reason: collision with root package name */
        public final TimeUnit f402003b;

        /* renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.H f402004c;

        public H(TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
            this.f402003b = timeUnit;
            this.f402004c = h12;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            io.reactivex.rxjava3.core.H h12 = this.f402004c;
            TimeUnit timeUnit = this.f402003b;
            return new d(obj, h12.c(timeUnit), timeUnit);
        }
    }

    /* compiled from: Functions.java */
    public static final class I<K, T> implements InterfaceC43544b<Map<K, T>, T> {
        @Override // l41.InterfaceC43544b
        public final void accept(Object obj, Object obj2) {
            throw null;
        }
    }

    /* compiled from: Functions.java */
    public static final class J<K, V, T> implements InterfaceC43544b<Map<K, V>, T> {
        @Override // l41.InterfaceC43544b
        public final void accept(Object obj, Object obj2) {
            throw null;
        }
    }

    /* compiled from: Functions.java */
    public static final class K<K, V, T> implements InterfaceC43544b<Map<K, Collection<V>>, T> {
        @Override // l41.InterfaceC43544b
        public final void accept(Object obj, Object obj2) {
            throw null;
        }
    }

    /* compiled from: Functions.java */
    public static final class L implements l41.r<Object> {
        @Override // l41.r
        public final boolean test(Object obj) {
            return true;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: io.reactivex.rxjava3.internal.functions.a$a, reason: collision with other inner class name */
    public static final class C11441a<T> implements g<T> {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC43543a f402005b;

        public C11441a(InterfaceC43543a interfaceC43543a) {
            this.f402005b = interfaceC43543a;
        }

        @Override // l41.g
        public final void accept(T t12) {
            this.f402005b.run();
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: io.reactivex.rxjava3.internal.functions.a$b, reason: case insensitive filesystem */
    public static final class C41784b<T1, T2, R> implements l41.o<Object[], R> {

        /* renamed from: b, reason: collision with root package name */
        public final c<? super T1, ? super T2, ? extends R> f402006b;

        public C41784b(c<? super T1, ? super T2, ? extends R> cVar) {
            this.f402006b = cVar;
        }

        @Override // l41.o
        public final Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length == 2) {
                return this.f402006b.apply(objArr2[0], objArr2[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr2.length);
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: io.reactivex.rxjava3.internal.functions.a$c, reason: case insensitive filesystem */
    public static final class C41785c<T1, T2, T3, R> implements l41.o<Object[], R> {

        /* renamed from: b, reason: collision with root package name */
        public final h<T1, T2, T3, R> f402007b;

        public C41785c(h<T1, T2, T3, R> hVar) {
            this.f402007b = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length != 3) {
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr2.length);
            }
            return this.f402007b.a(objArr2[0], objArr2[1], objArr2[2]);
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: io.reactivex.rxjava3.internal.functions.a$d, reason: case insensitive filesystem */
    public static final class C41786d<T1, T2, T3, T4, R> implements l41.o<Object[], R> {

        /* renamed from: b, reason: collision with root package name */
        public final i<T1, T2, T3, T4, R> f402008b;

        public C41786d(i<T1, T2, T3, T4, R> iVar) {
            this.f402008b = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr2.length);
            }
            return this.f402008b.a(objArr2[0], objArr2[1], objArr2[2], objArr2[3]);
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: io.reactivex.rxjava3.internal.functions.a$e, reason: case insensitive filesystem */
    public static final class C41787e<T1, T2, T3, T4, T5, R> implements l41.o<Object[], R> {

        /* renamed from: b, reason: collision with root package name */
        public final j<T1, T2, T3, T4, T5, R> f402009b;

        public C41787e(j<T1, T2, T3, T4, T5, R> jVar) {
            this.f402009b = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr2.length);
            }
            return this.f402009b.a(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4]);
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: io.reactivex.rxjava3.internal.functions.a$f, reason: case insensitive filesystem */
    public static final class C41788f<T1, T2, T3, T4, T5, T6, R> implements l41.o<Object[], R> {
        @Override // l41.o
        public final Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length != 6) {
                throw new IllegalArgumentException("Array of size 6 expected but got " + objArr2.length);
            }
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            Object obj4 = objArr2[3];
            Object obj5 = objArr2[4];
            Object obj6 = objArr2[5];
            throw null;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: io.reactivex.rxjava3.internal.functions.a$g, reason: case insensitive filesystem */
    public static final class C41789g<T1, T2, T3, T4, T5, T6, T7, R> implements l41.o<Object[], R> {
        @Override // l41.o
        public final Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr2.length);
            }
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            Object obj4 = objArr2[3];
            Object obj5 = objArr2[4];
            Object obj6 = objArr2[5];
            Object obj7 = objArr2[6];
            throw null;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: io.reactivex.rxjava3.internal.functions.a$h, reason: case insensitive filesystem */
    public static final class C41790h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements l41.o<Object[], R> {
        @Override // l41.o
        public final Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length != 8) {
                throw new IllegalArgumentException("Array of size 8 expected but got " + objArr2.length);
            }
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            Object obj4 = objArr2[3];
            Object obj5 = objArr2[4];
            Object obj6 = objArr2[5];
            Object obj7 = objArr2[6];
            Object obj8 = objArr2[7];
            throw null;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: io.reactivex.rxjava3.internal.functions.a$i, reason: case insensitive filesystem */
    public static final class C41791i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements l41.o<Object[], R> {
        @Override // l41.o
        public final Object apply(Object[] objArr) {
            Object[] objArr2 = objArr;
            if (objArr2.length != 9) {
                throw new IllegalArgumentException("Array of size 9 expected but got " + objArr2.length);
            }
            Object obj = objArr2[0];
            Object obj2 = objArr2[1];
            Object obj3 = objArr2[2];
            Object obj4 = objArr2[3];
            Object obj5 = objArr2[4];
            Object obj6 = objArr2[5];
            Object obj7 = objArr2[6];
            Object obj8 = objArr2[7];
            Object obj9 = objArr2[8];
            throw null;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: io.reactivex.rxjava3.internal.functions.a$j, reason: case insensitive filesystem */
    public static final class C41792j<T> implements l41.s<List<T>> {
        @Override // l41.s
        public final Object get() {
            return new ArrayList(16);
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: io.reactivex.rxjava3.internal.functions.a$k, reason: case insensitive filesystem */
    public static final class C41793k<T> implements l41.r<T> {
        @Override // l41.r
        public final boolean test(T t12) {
            throw null;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: io.reactivex.rxjava3.internal.functions.a$l, reason: case insensitive filesystem */
    public static class C41794l implements g<e> {
        @Override // l41.g
        public final void accept(e eVar) {
            eVar.request(0);
        }
    }

    /* compiled from: Functions.java */
    public static final class m<T, U> implements l41.o<T, U> {

        /* renamed from: b, reason: collision with root package name */
        public final Class<U> f402010b;

        public m(Class<U> cls) {
            this.f402010b = cls;
        }

        @Override // l41.o
        public final U apply(T t12) {
            return this.f402010b.cast(t12);
        }
    }

    /* compiled from: Functions.java */
    public static final class n<T, U> implements l41.r<T> {

        /* renamed from: b, reason: collision with root package name */
        public final Class<U> f402011b;

        public n(Class<U> cls) {
            this.f402011b = cls;
        }

        @Override // l41.r
        public final boolean test(T t12) {
            return this.f402011b.isInstance(t12);
        }
    }

    /* compiled from: Functions.java */
    public static final class q implements l41.q {
    }

    /* compiled from: Functions.java */
    public static final class s<T> implements l41.r<T> {
        @Override // l41.r
        public final boolean test(T t12) {
            return Objects.equals(t12, null);
        }
    }

    /* compiled from: Functions.java */
    public static final class t implements g<Throwable> {
        @Override // l41.g
        public final void accept(Throwable th2) {
            C47998a.b(th2);
        }
    }

    /* compiled from: Functions.java */
    public static final class u implements l41.r<Object> {
        @Override // l41.r
        public final boolean test(Object obj) {
            return false;
        }
    }

    /* compiled from: Functions.java */
    public static final class v implements InterfaceC43543a {

        /* renamed from: b, reason: collision with root package name */
        public final D0 f402012b;

        public v(D0 d02) {
            this.f402012b = d02;
        }

        @Override // l41.InterfaceC43543a
        public final void run() throws ExecutionException, InterruptedException {
            this.f402012b.get();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Functions.java */
    public static final class w implements l41.s<Set<Object>> {

        /* renamed from: b, reason: collision with root package name */
        public static final w f402013b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ w[] f402014c;

        static {
            w wVar = new w("INSTANCE", 0);
            f402013b = wVar;
            f402014c = new w[]{wVar};
        }

        public w() {
            throw null;
        }

        public static w valueOf(String str) {
            return (w) Enum.valueOf(w.class, str);
        }

        public static w[] values() {
            return (w[]) f402014c.clone();
        }

        @Override // l41.s
        public final Set<Object> get() {
            return new HashSet();
        }
    }

    /* compiled from: Functions.java */
    public static final class y<T, U> implements Callable<U>, l41.s<U>, l41.o<T, U> {

        /* renamed from: b, reason: collision with root package name */
        public final U f402015b;

        public y(U u12) {
            this.f402015b = u12;
        }

        @Override // l41.o
        public final U apply(T t12) {
            return this.f402015b;
        }

        @Override // java.util.concurrent.Callable
        public final U call() {
            return this.f402015b;
        }

        @Override // l41.s
        public final U get() {
            return this.f402015b;
        }
    }

    /* compiled from: Functions.java */
    public static final class z<T> implements l41.o<List<T>, List<T>> {
        @Override // l41.o
        public final Object apply(Object obj) {
            List list = (List) obj;
            Collections.sort(list, null);
            return list;
        }
    }

    static {
        new u();
        new F();
        new A();
    }

    public a() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> g<T> a(InterfaceC43543a interfaceC43543a) {
        return new C11441a(interfaceC43543a);
    }

    @j41.e
    public static <T, U> l41.o<T, U> b(@j41.e Class<U> cls) {
        return new m(cls);
    }

    public static l41.s c() {
        return new C41792j();
    }

    public static <T> l41.s<Set<T>> d() {
        return w.f402013b;
    }

    @j41.e
    public static InterfaceC43543a e(@j41.e D0 d02) {
        return new v(d02);
    }

    public static <T, U> l41.r<T> f(Class<U> cls) {
        return new n(cls);
    }

    @j41.e
    public static <T, U> l41.o<T, U> g(@j41.e U u12) {
        return new y(u12);
    }

    @j41.e
    public static <T> l41.s<T> h(@j41.e T t12) {
        return new y(t12);
    }

    public static <T> InterfaceC43543a i(g<? super io.reactivex.rxjava3.core.y<T>> gVar) {
        return new C(gVar);
    }

    public static <T> g<Throwable> j(g<? super io.reactivex.rxjava3.core.y<T>> gVar) {
        return new D(gVar);
    }

    public static <T> g<T> k(g<? super io.reactivex.rxjava3.core.y<T>> gVar) {
        return new E(gVar);
    }

    public static <T> l41.o<T, d<T>> l(TimeUnit timeUnit, io.reactivex.rxjava3.core.H h12) {
        return new H(timeUnit, h12);
    }

    @j41.e
    public static <T1, T2, R> l41.o<Object[], R> m(@j41.e c<? super T1, ? super T2, ? extends R> cVar) {
        return new C41784b(cVar);
    }

    @j41.e
    public static <T1, T2, T3, R> l41.o<Object[], R> n(@j41.e h<T1, T2, T3, R> hVar) {
        return new C41785c(hVar);
    }

    @j41.e
    public static <T1, T2, T3, T4, R> l41.o<Object[], R> o(@j41.e i<T1, T2, T3, T4, R> iVar) {
        return new C41786d(iVar);
    }

    @j41.e
    public static <T1, T2, T3, T4, T5, R> l41.o<Object[], R> p(@j41.e j<T1, T2, T3, T4, T5, R> jVar) {
        return new C41787e(jVar);
    }

    /* compiled from: Functions.java */
    public static final class o implements InterfaceC43543a {
        public final String toString() {
            return "EmptyAction";
        }

        @Override // l41.InterfaceC43543a
        public final void run() {
        }
    }

    /* compiled from: Functions.java */
    public static final class r implements Runnable {
        public final String toString() {
            return "EmptyRunnable";
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* compiled from: Functions.java */
    public static final class p implements g<Object> {
        public final String toString() {
            return "EmptyConsumer";
        }

        @Override // l41.g
        public final void accept(Object obj) {
        }
    }

    /* compiled from: Functions.java */
    public static final class x implements l41.o<Object, Object> {
        public final String toString() {
            return "IdentityFunction";
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return obj;
        }
    }
}
