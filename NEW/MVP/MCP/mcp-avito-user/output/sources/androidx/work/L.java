package androidx.work;

import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.D0;

/* compiled from: Operation.java */
/* loaded from: classes10.dex */
public interface L {

    /* renamed from: a, reason: collision with root package name */
    @RestrictTo
    public static final b.c f55386a;

    /* renamed from: b, reason: collision with root package name */
    @RestrictTo
    public static final b.C1950b f55387b;

    /* compiled from: Operation.java */
    public static abstract class b {

        /* compiled from: Operation.java */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f55388a;

            public a(@j.N Throwable th2) {
                this.f55388a = th2;
            }

            @j.N
            public final String toString() {
                return "FAILURE (" + this.f55388a.getMessage() + ")";
            }
        }

        /* compiled from: Operation.java */
        /* renamed from: androidx.work.L$b$b, reason: collision with other inner class name */
        public static final class C1950b extends b {
            @j.N
            public final String toString() {
                return "IN_PROGRESS";
            }

            public C1950b() {
            }
        }

        /* compiled from: Operation.java */
        public static final class c extends b {
            @j.N
            public final String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }

        @RestrictTo
        public b() {
        }
    }

    static {
        f55386a = new b.c();
        f55387b = new b.C1950b();
    }

    @j.N
    D0<b.c> a();
}
