package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.C22783k;
import java.util.ArrayList;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42754k;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;

/* compiled from: AndroidUiDispatcher.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/g0;", "Lkotlinx/coroutines/M;", "c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22475g0 extends kotlinx.coroutines.M {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final c f41448m = new c(null);

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C<CoroutineContext> f41449n = C42727D.c(a.f41461l);

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final b f41450o = new b();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Choreographer f41451c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Handler f41452d;

    /* renamed from: i, reason: collision with root package name */
    public boolean f41457i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41458j;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C22487j0 f41460l;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f41453e = new Object();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C42754k<Runnable> f41454f = new C42754k<>();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public ArrayList f41455g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public ArrayList f41456h = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ChoreographerFrameCallbackC22479h0 f41459k = new ChoreographerFrameCallbackC22479h0(this);

    /* compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.g0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<CoroutineContext> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f41461l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final CoroutineContext invoke() {
            Choreographer choreographer;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                choreographer = Choreographer.getInstance();
            } else {
                kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
                choreographer = (Choreographer) C43259k.e(kotlinx.coroutines.internal.K.f411877a, new C22471f0(2, null));
            }
            C22475g0 c22475g0 = new C22475g0(choreographer, C22783k.a(Looper.getMainLooper()), null);
            return c22475g0.plus(c22475g0.f41460l);
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/compose/ui/platform/g0$b", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/CoroutineContext;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.g0$b */
    public static final class b extends ThreadLocal<CoroutineContext> {
        @Override // java.lang.ThreadLocal
        public final CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            C22475g0 c22475g0 = new C22475g0(choreographer, C22783k.a(looperMyLooper), null);
            return c22475g0.plus(c22475g0.f41460l);
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/g0$c;", "", "<init>", "()V", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/CoroutineContext;", "currentThread", "Ljava/lang/ThreadLocal;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.g0$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    public C22475g0(Choreographer choreographer, Handler handler, C42822w c42822w) {
        this.f41451c = choreographer;
        this.f41452d = handler;
        this.f41460l = new C22487j0(choreographer, this);
    }

    public static final void y(C22475g0 c22475g0) {
        Runnable runnableV;
        boolean z12;
        do {
            synchronized (c22475g0.f41453e) {
                runnableV = c22475g0.f41454f.v();
            }
            while (runnableV != null) {
                runnableV.run();
                synchronized (c22475g0.f41453e) {
                    runnableV = c22475g0.f41454f.v();
                }
            }
            synchronized (c22475g0.f41453e) {
                if (c22475g0.f41454f.isEmpty()) {
                    z12 = false;
                    c22475g0.f41457i = false;
                } else {
                    z12 = true;
                }
            }
        } while (z12);
    }

    @Override // kotlinx.coroutines.M
    public final void h(@Y61.k CoroutineContext coroutineContext, @Y61.k Runnable runnable) {
        synchronized (this.f41453e) {
            try {
                this.f41454f.addLast(runnable);
                if (!this.f41457i) {
                    this.f41457i = true;
                    this.f41452d.post(this.f41459k);
                    if (!this.f41458j) {
                        this.f41458j = true;
                        this.f41451c.postFrameCallback(this.f41459k);
                    }
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
