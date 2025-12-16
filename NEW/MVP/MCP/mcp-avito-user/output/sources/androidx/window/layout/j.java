package androidx.window.layout;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.a;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import m2.InterfaceC43864a;

/* compiled from: WindowInfoTracker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/window/layout/j;", "", "a", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f55330a = a.f55331a;

    /* compiled from: WindowInfoTracker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/layout/j$a;", "", "<init>", "()V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f55331a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final InterfaceC42726C<InterfaceC43864a> f55332b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final k f55333c;

        /* compiled from: WindowInfoTracker.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm2/a;", "invoke", "()Lm2/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.window.layout.j$a$a, reason: collision with other inner class name */
        public static final class C1946a extends N implements Y41.a<InterfaceC43864a> {

            /* renamed from: l, reason: collision with root package name */
            public static final C1946a f55334l = new C1946a();

            public C1946a() {
                super(0);
            }

            @Override // Y41.a
            public final InterfaceC43864a invoke() {
                WindowLayoutComponent windowLayoutComponentA;
                try {
                    ClassLoader classLoader = j.class.getClassLoader();
                    i iVar = classLoader != null ? new i(classLoader, new androidx.window.core.e(classLoader)) : null;
                    if (iVar == null || (windowLayoutComponentA = iVar.a()) == null) {
                        return null;
                    }
                    a.C1942a c1942a = androidx.window.layout.adapter.extensions.a.f55258a;
                    androidx.window.core.e eVar = new androidx.window.core.e(classLoader);
                    c1942a.getClass();
                    androidx.window.core.j.f55190a.getClass();
                    int iA2 = androidx.window.core.j.a();
                    return iA2 >= 2 ? new androidx.window.layout.adapter.extensions.d(windowLayoutComponentA) : iA2 == 1 ? new androidx.window.layout.adapter.extensions.c(windowLayoutComponentA, eVar) : new androidx.window.layout.adapter.extensions.b();
                } catch (Throwable unused) {
                    a aVar = a.f55331a;
                    return null;
                }
            }
        }

        static {
            m0.f406844a.b(j.class).l0();
            f55332b = C42727D.c(C1946a.f55334l);
            f55333c = b.f55308a;
        }
    }

    @X41.n
    @X41.i
    @Y61.k
    static m a(@Y61.k Context context) {
        f55330a.getClass();
        InterfaceC43864a value = a.f55332b.getValue();
        if (value == null) {
            androidx.window.layout.adapter.sidecar.h.f55296c.getClass();
            if (androidx.window.layout.adapter.sidecar.h.f55297d == null) {
                ReentrantLock reentrantLock = androidx.window.layout.adapter.sidecar.h.f55298e;
                reentrantLock.lock();
                try {
                    if (androidx.window.layout.adapter.sidecar.h.f55297d == null) {
                        SidecarCompat sidecarCompat = null;
                        try {
                            SidecarCompat.f55275f.getClass();
                            androidx.window.core.p pVarC = SidecarCompat.a.c();
                            if (pVarC != null) {
                                androidx.window.core.p.f55200g.getClass();
                                if (((BigInteger) pVarC.f55206f.getValue()).compareTo((BigInteger) androidx.window.core.p.f55201h.f55206f.getValue()) >= 0) {
                                    SidecarCompat sidecarCompat2 = new SidecarCompat(context);
                                    if (sidecarCompat2.i()) {
                                        sidecarCompat = sidecarCompat2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        androidx.window.layout.adapter.sidecar.h.f55297d = new androidx.window.layout.adapter.sidecar.h(sidecarCompat);
                    }
                    G0 g02 = G0.f406611a;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            value = androidx.window.layout.adapter.sidecar.h.f55297d;
        }
        m mVar = new m(s.f55349b, value);
        ((b) a.f55333c).getClass();
        return mVar;
    }
}
