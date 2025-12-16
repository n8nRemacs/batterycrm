package ru.rustore.sdk.core.tasks;

import Oa1.B;
import android.os.Handler;
import com.google.firebase.crashlytics.internal.common.b0;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.Z;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: Task.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/rustore/sdk/core/tasks/f;", "T", "", "<init>", "()V", "a", "b", "sdk-public-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class f<T> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f436778d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ArrayList f436779a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f436780b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public volatile Z<? extends T> f436781c;

    /* compiled from: Task.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/core/tasks/f$a;", "", "<init>", "()V", "sdk-public-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static Q a() {
            f fVar = new f(null);
            return new Q(fVar, new b());
        }

        public a() {
        }
    }

    /* compiled from: Task.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/core/tasks/f$b;", "", "sdk-public-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public final class b {
        public b() {
        }

        public final void a(@Y61.k Throwable th2) {
            a aVar = f.f436778d;
            f.this.e(th2);
        }

        public final void b(T t12) {
            f<T> fVar = f.this;
            a aVar = f.f436778d;
            synchronized (fVar) {
                if (fVar.f436781c != null) {
                    return;
                }
                fVar.f436781c = Z.a(t12);
                s.a(new m(fVar, t12), fVar.f436779a);
                s.a(new k(fVar, null), fVar.f436780b);
                G0 g02 = G0.f406611a;
            }
        }
    }

    /* compiled from: Task.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lru/rustore/sdk/core/tasks/b;", "listener", "Lkotlin/G0;", "invoke", "(Lru/rustore/sdk/core/tasks/b;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class c extends N implements Y41.l<ru.rustore.sdk.core.tasks.b<T>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f<T> f436783l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Throwable f436784m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f<T> fVar, Throwable th2) {
            super(1);
            this.f436783l = fVar;
            this.f436784m = th2;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            ru.rustore.sdk.core.tasks.b bVar = (ru.rustore.sdk.core.tasks.b) obj;
            d dVar = bVar.f436776b;
            if (dVar != null) {
                n nVar = new n(dVar, this.f436784m);
                a aVar = f.f436778d;
                this.f436783l.getClass();
                f.d(bVar.f436777c, nVar);
            }
            return G0.f406611a;
        }
    }

    public /* synthetic */ f(C42822w c42822w) {
        this();
    }

    public static void d(Executor executor, Y41.a aVar) {
        if (executor != null) {
            executor.execute(new B(6, aVar));
        } else {
            t.f436805a.getClass();
            ((Handler) t.f436807c.getValue()).post(new B(7, aVar));
        }
    }

    public final void a(ru.rustore.sdk.core.tasks.c cVar, Executor executor) {
        synchronized (this) {
            try {
                Z<? extends T> z12 = this.f436781c;
                if (z12 == null) {
                    this.f436780b.add(new ru.rustore.sdk.core.tasks.a(cVar, executor));
                } else {
                    d(executor, new g(cVar, Z.b(z12.f406625b)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(e eVar, d dVar, Executor executor) {
        synchronized (this) {
            try {
                Z<? extends T> z12 = this.f436781c;
                if (z12 == null) {
                    this.f436779a.add(new ru.rustore.sdk.core.tasks.b(eVar, dVar, executor));
                } else {
                    Object obj = z12.f406625b;
                    Object obj2 = obj instanceof Z.b ? null : obj;
                    Throwable thB = Z.b(obj);
                    if (obj2 != null && eVar != null) {
                        d(executor, new h(eVar, obj2));
                    }
                    if (thB != null && dVar != null) {
                        d(executor, new i(dVar, thB));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final T c() throws InterruptedException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (this.f436781c != null) {
            countDownLatch.countDown();
        } else {
            b0 b0Var = new b0(countDownLatch);
            t.f436805a.getClass();
            a(b0Var, (ExecutorService) t.f436806b.getValue());
        }
        countDownLatch.await();
        Z<? extends T> z12 = this.f436781c;
        if (z12 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        T t12 = (T) z12.f406625b;
        C42729a0.b(t12);
        return t12;
    }

    public final void e(Throwable th2) {
        synchronized (this) {
            if (this.f436781c != null) {
                return;
            }
            this.f436781c = Z.a(new Z.b(th2));
            s.a(new c(this, th2), this.f436779a);
            s.a(new k(this, th2), this.f436780b);
            G0 g02 = G0.f406611a;
        }
    }

    public f() {
        this.f436779a = new ArrayList();
        this.f436780b = new ArrayList();
    }
}
