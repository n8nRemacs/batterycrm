package coil.util;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import coil.memory.MemoryCache;
import coil.network.f;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SystemCallbacks.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcoil/util/y;", "Landroid/content/ComponentCallbacks2;", "Lcoil/network/f$a;", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class y implements ComponentCallbacks2, f.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final WeakReference<coil.n> f58803b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Context f58804c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public coil.network.f f58805d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f58806e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f58807f = true;

    /* compiled from: SystemCallbacks.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcoil/util/y$a;", "", "<init>", "()V", "", "OFFLINE", "Ljava/lang/String;", "ONLINE", "TAG", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public y(@Y61.k coil.n nVar) {
        this.f58803b = new WeakReference<>(nVar);
    }

    public final synchronized void a() {
        G0 g02;
        try {
            coil.n nVar = this.f58803b.get();
            if (nVar != null) {
                if (this.f58805d == null) {
                    coil.network.f fVarA = nVar.f58546g.f58795b ? coil.network.g.a(nVar.f58540a, this, nVar.f58547h) : new coil.network.e();
                    this.f58805d = fVarA;
                    this.f58807f = fVarA.a();
                }
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f58806e) {
                return;
            }
            this.f58806e = true;
            Context context = this.f58804c;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            coil.network.f fVar = this.f58805d;
            if (fVar != null) {
                fVar.shutdown();
            }
            this.f58803b.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(@Y61.k Configuration configuration) {
        try {
            if ((this.f58803b.get() != null ? G0.f406611a : null) == null) {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i12) {
        try {
            coil.n nVar = this.f58803b.get();
            G0 g02 = null;
            if (nVar != null) {
                o oVar = nVar.f58547h;
                if (oVar != null && oVar.f58787a <= 2) {
                    oVar.a(2, "NetworkObserver", "trimMemory, level=" + i12, null);
                }
                MemoryCache value = nVar.f58542c.getValue();
                if (value != null) {
                    value.a(i12);
                }
                g02 = G0.f406611a;
            }
            if (g02 == null) {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
