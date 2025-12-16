package com.avito.android.analytics.inhouse_transport;

import com.avito.android.util.V2;
import java.util.List;
import javax.inject.Provider;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HotSwapEventStorage.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/inhouse_transport/j;", "", "T", "Lcom/avito/android/analytics/inhouse_transport/u;", "_common_analytics-transport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j<T> implements u<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<v<T>> f90198a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<x<T>> f90199b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f90200c = new Object();

    /* renamed from: d, reason: collision with root package name */
    @J41.a
    @Y61.l
    public u<T> f90201d;

    public j(@Y61.k Provider<v<T>> provider, @Y61.k h31.e<x<T>> eVar) {
        this.f90198a = provider;
        this.f90199b = eVar;
    }

    public static void h(u uVar, Throwable th2) {
        if (uVar instanceof x) {
            V2.f318762a.f(new y(th2));
        } else {
            V2.f318762a.f(new w(th2));
        }
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    public final int a() {
        int iA2;
        synchronized (this.f90200c) {
            try {
                iA2 = f().a();
            } catch (Throwable th2) {
                h(f(), th2);
                f().c();
                g();
                iA2 = f().a();
            }
        }
        return iA2;
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    public final void add(@Y61.k T t12) {
        synchronized (this.f90200c) {
            try {
                f().add(t12);
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                h(f(), th2);
                f().c();
                g();
                f().add(t12);
                G0 g03 = G0.f406611a;
            }
        }
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    public final void b(@Y61.k List<? extends T> list) {
        synchronized (this.f90200c) {
            try {
                f().b(list);
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                h(f(), th2);
                f().c();
                g();
                f().b(list);
                G0 g03 = G0.f406611a;
            }
        }
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    @Y61.k
    public final List<T> d() {
        List<T> listD;
        synchronized (this.f90200c) {
            try {
                listD = f().d();
            } catch (Throwable th2) {
                h(f(), th2);
                f().c();
                g();
                listD = f().d();
            }
        }
        return listD;
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    @Y61.k
    public final List<T> e(int i12) {
        List<T> listE;
        synchronized (this.f90200c) {
            try {
                listE = f().e(i12);
            } catch (Throwable th2) {
                h(f(), th2);
                f().c();
                g();
                listE = f().e(i12);
            }
        }
        return listE;
    }

    public final u<T> f() {
        v<T> vVar;
        u<T> uVar = this.f90201d;
        if (uVar != null) {
            return uVar;
        }
        synchronized (this.f90200c) {
            try {
                vVar = this.f90199b.get();
            } catch (Throwable unused) {
                vVar = this.f90198a.get();
            }
            this.f90201d = vVar;
        }
        return vVar;
    }

    public final void g() {
        v<T> vVar = this.f90198a.get();
        synchronized (this.f90200c) {
            this.f90201d = vVar;
            G0 g02 = G0.f406611a;
        }
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f90200c) {
            try {
                zIsEmpty = f().isEmpty();
            } catch (Throwable th2) {
                h(f(), th2);
                f().c();
                g();
                zIsEmpty = f().isEmpty();
            }
        }
        return zIsEmpty;
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    public final void c() {
    }
}
