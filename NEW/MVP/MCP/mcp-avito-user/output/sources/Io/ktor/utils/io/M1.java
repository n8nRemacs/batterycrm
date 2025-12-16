package io.ktor.utils.io;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: ExceptionUtilsJvm.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002*(\b\u0002\u0010\u0002\"\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000¨\u0006\u0003"}, d2 = {"Lkotlin/Function1;", "", "Ctor", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class M1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f400687a = a(Throwable.class, -1);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final ReentrantReadWriteLock f400688b = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final WeakHashMap<Class<? extends Throwable>, Y41.l<Throwable, Throwable>> f400689c = new WeakHashMap<>();

    /* compiled from: Comparisons.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/d", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b(Integer.valueOf(((Constructor) t13).getParameterTypes().length), Integer.valueOf(((Constructor) t12).getParameterTypes().length));
        }
    }

    /* compiled from: ExceptionUtilsJvm.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "E", "", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l {

        /* renamed from: l, reason: collision with root package name */
        public static final b f400690l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: ExceptionUtilsJvm.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "E", "", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l {

        /* renamed from: l, reason: collision with root package name */
        public static final c f400691l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    public static final int a(Class<?> cls, int i12) {
        Object bVar;
        kotlin.jvm.internal.m0.f406844a.b(cls);
        try {
            int i13 = kotlin.Z.f406624c;
            int i14 = 0;
            do {
                int i15 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i15++;
                    }
                }
                i14 += i15;
                cls = cls.getSuperclass();
            } while (cls != null);
            bVar = Integer.valueOf(i14);
        } catch (Throwable th2) {
            int i16 = kotlin.Z.f406624c;
            bVar = new Z.b(th2);
        }
        Object objValueOf = Integer.valueOf(i12);
        int i17 = kotlin.Z.f406624c;
        if (bVar instanceof Z.b) {
            bVar = objValueOf;
        }
        return ((Number) bVar).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00fe A[EDGE_INSN: B:104:0x00fe->B:64:0x00fe BREAK  A[LOOP:3: B:41:0x00a7->B:107:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[LOOP:3: B:41:0x00a7->B:107:?, LOOP_END, SYNTHETIC] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E extends java.lang.Throwable> E b(@Y61.k E r12, @Y61.k java.lang.Throwable r13) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.M1.b(java.lang.Throwable, java.lang.Throwable):java.lang.Throwable");
    }
}
