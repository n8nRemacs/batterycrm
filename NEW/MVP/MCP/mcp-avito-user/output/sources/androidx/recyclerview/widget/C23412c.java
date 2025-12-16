package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C23424o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: AsyncDifferConfig.java */
/* renamed from: androidx.recyclerview.widget.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23412c<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final ExecutorService f53982a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C23424o.f<T> f53983b;

    /* compiled from: AsyncDifferConfig.java */
    /* renamed from: androidx.recyclerview.widget.c$a */
    public static final class a<T> {

        /* renamed from: c, reason: collision with root package name */
        public static final Object f53984c = new Object();

        /* renamed from: d, reason: collision with root package name */
        public static ExecutorService f53985d;

        /* renamed from: a, reason: collision with root package name */
        public ExecutorService f53986a;

        /* renamed from: b, reason: collision with root package name */
        public final C23424o.f<T> f53987b;

        public a(@j.N C23424o.f<T> fVar) {
            this.f53987b = fVar;
        }

        @j.N
        public final C23412c<T> a() {
            if (this.f53986a == null) {
                synchronized (f53984c) {
                    try {
                        if (f53985d == null) {
                            f53985d = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f53986a = f53985d;
            }
            return new C23412c<>(this.f53986a, this.f53987b);
        }
    }

    public C23412c(@j.N ExecutorService executorService, @j.N C23424o.f fVar) {
        this.f53982a = executorService;
        this.f53983b = fVar;
    }
}
