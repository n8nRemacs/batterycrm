package androidx.work;

import androidx.core.util.InterfaceC22791e;
import androidx.work.impl.C23550e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43262l0;

/* compiled from: Configuration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/b;", "", "a", "b", "c", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23538b {

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final InterfaceC22791e<Throwable> f55454h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final InterfaceC22791e<d0> f55455i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f55456j;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ExecutorService f55447a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC23539c(false));

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.M f55448b = C43262l0.f411945a;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ExecutorService f55449c = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC23539c(true));

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final X f55450d = new X();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C23634s f55451e = C23634s.f56210a;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final I f55452f = I.f55384a;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C23550e f55453g = new C23550e();

    /* renamed from: k, reason: collision with root package name */
    public final int f55457k = 4;

    /* renamed from: l, reason: collision with root package name */
    public final int f55458l = Integer.MAX_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public final int f55460n = 20;

    /* renamed from: m, reason: collision with root package name */
    public final int f55459m = 8;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f55461o = true;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C23540d f55462p = new C23540d();

    /* compiled from: Configuration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/b$a;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public InterfaceC22791e<Throwable> f55463a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public InterfaceC22791e<d0> f55464b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public String f55465c;
    }

    /* compiled from: Configuration.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/work/b$b;", "", "<init>", "()V", "", "MIN_SCHEDULER_LIMIT", "I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.b$b, reason: collision with other inner class name */
    public static final class C1951b {
        public /* synthetic */ C1951b(C42822w c42822w) {
            this();
        }

        public C1951b() {
        }
    }

    /* compiled from: Configuration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/work/b$c;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.b$c */
    public interface c {
        @Y61.k
        C23538b c();
    }

    static {
        new C1951b(null);
    }

    public C23538b(@Y61.k a aVar) {
        this.f55454h = aVar.f55463a;
        this.f55455i = aVar.f55464b;
        this.f55456j = aVar.f55465c;
    }
}
