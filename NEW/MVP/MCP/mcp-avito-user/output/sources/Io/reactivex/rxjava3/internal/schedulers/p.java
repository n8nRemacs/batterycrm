package io.reactivex.rxjava3.internal.schedulers;

/* compiled from: SchedulerPoolFactory.java */
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f404743a;

    /* compiled from: SchedulerPoolFactory.java */
    public static final class a implements l41.o<String, String> {
        @Override // l41.o
        public final String apply(String str) {
            return System.getProperty(str);
        }
    }

    static {
        boolean zEquals = true;
        try {
            String str = (String) new a().apply("rx3.purge-enabled");
            if (str != null) {
                zEquals = "true".equals(str);
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
        }
        f404743a = zEquals;
    }

    public p() {
        throw new IllegalStateException("No instances!");
    }
}
