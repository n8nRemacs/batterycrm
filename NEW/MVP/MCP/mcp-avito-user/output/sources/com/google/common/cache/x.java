package com.google.common.cache;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* compiled from: Striped64.java */
@XY0.c
@h
/* loaded from: classes6.dex */
abstract class x extends Number {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<int[]> f359237e = new ThreadLocal<>();

    /* renamed from: f, reason: collision with root package name */
    public static final Random f359238f = new Random();

    /* renamed from: g, reason: collision with root package name */
    public static final int f359239g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h, reason: collision with root package name */
    public static final Unsafe f359240h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f359241i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f359242j;

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    public volatile transient b[] f359243b;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient long f359244c;

    /* renamed from: d, reason: collision with root package name */
    public volatile transient int f359245d;

    /* compiled from: Striped64.java */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() throws IllegalAccessException, SecurityException, IllegalArgumentException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    /* compiled from: Striped64.java */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final Unsafe f359246b;

        /* renamed from: c, reason: collision with root package name */
        public static final long f359247c;

        /* renamed from: a, reason: collision with root package name */
        public volatile long f359248a;

        static {
            try {
                Unsafe unsafeE = x.e();
                f359246b = unsafeE;
                f359247c = unsafeE.objectFieldOffset(b.class.getDeclaredField("a"));
            } catch (Exception e12) {
                throw new Error(e12);
            }
        }

        public b(long j12) {
            this.f359248a = j12;
        }

        public final boolean a(long j12, long j13) {
            return f359246b.compareAndSwapLong(this, f359247c, j12, j13);
        }
    }

    static {
        try {
            Unsafe unsafeE = e();
            f359240h = unsafeE;
            f359241i = unsafeE.objectFieldOffset(x.class.getDeclaredField("c"));
            f359242j = unsafeE.objectFieldOffset(x.class.getDeclaredField("d"));
        } catch (Exception e12) {
            throw new Error(e12);
        }
    }

    public static Unsafe e() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e12) {
                throw new RuntimeException("Could not initialize intrinsics", e12.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new a());
        }
    }

    public final boolean c(long j12, long j13) {
        return f359240h.compareAndSwapLong(this, f359241i, j12, j13);
    }

    public final boolean d() {
        return f359240h.compareAndSwapInt(this, f359242j, 0, 1);
    }
}
