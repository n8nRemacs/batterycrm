package androidx.media3.session;

import android.os.Binder;
import android.os.Bundle;
import androidx.media3.common.H;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.session.D1;
import androidx.media3.session.InterfaceC23243n;
import java.lang.ref.WeakReference;

/* compiled from: MediaControllerStub.java */
/* renamed from: androidx.media3.session.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class BinderC23267v0 extends InterfaceC23243n.b {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f52647p = 0;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference<C23229i0> f52648b;

    /* compiled from: MediaControllerStub.java */
    /* renamed from: androidx.media3.session.v0$a */
    public interface a<T extends C23229i0> {
        void a(T t12);
    }

    public BinderC23267v0(C23229i0 c23229i0) {
        this.f52648b = new WeakReference<>(c23229i0);
    }

    @Override // androidx.media3.session.InterfaceC23243n
    public final void L3(int i12, Bundle bundle) {
        try {
            f4(new C23264u0((N1) N1.f52189x.fromBundle(bundle), 1));
        } catch (RuntimeException e12) {
            androidx.media3.common.util.s.h("Ignoring malformed Bundle for SessionPositionInfo", e12);
        }
    }

    @Override // androidx.media3.session.InterfaceC23243n
    @Deprecated
    public final void M1(int i12, Bundle bundle, boolean z12) {
        N3(i12, bundle, new D1.b(z12, true).k());
    }

    @Override // androidx.media3.session.InterfaceC23243n
    public final void N3(int i12, Bundle bundle, Bundle bundle2) {
        try {
            try {
                f4(new N(6, (D1) D1.f51968m0.fromBundle(bundle), (D1.b) D1.b.f52034g.fromBundle(bundle2)));
            } catch (RuntimeException e12) {
                androidx.media3.common.util.s.h("Ignoring malformed Bundle for BundlingExclusions", e12);
            }
        } catch (RuntimeException e13) {
            androidx.media3.common.util.s.h("Ignoring malformed Bundle for PlayerInfo", e13);
        }
    }

    @Override // androidx.media3.session.InterfaceC23243n
    public final void a2(int i12, Bundle bundle) {
        try {
            f4(new C23264u0((C23234k) C23234k.f52553v.fromBundle(bundle), 0));
        } catch (RuntimeException e12) {
            androidx.media3.common.util.s.h("Malformed Bundle for ConnectionResult. Disconnected from the session.", e12);
            f();
        }
    }

    @Override // androidx.media3.session.InterfaceC23243n
    public final void b1(int i12, Bundle bundle) {
        try {
            C23252q.f52616l.getClass();
            g4(i12, C23252q.a(bundle, null));
        } catch (RuntimeException e12) {
            androidx.media3.common.util.s.h("Ignoring malformed Bundle for LibraryResult", e12);
        }
    }

    @Override // androidx.media3.session.InterfaceC23243n
    public final void f() {
        f4(new C23228i(3));
    }

    public final <T extends C23229i0> void f4(a<T> aVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            C23229i0 c23229i0 = this.f52648b.get();
            if (c23229i0 == null) {
                return;
            }
            androidx.media3.common.util.M.I(c23229i0.c0().f52080e, new RunnableC23253q0(1, c23229i0, aVar));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media3.session.InterfaceC23243n
    public final void g(int i12) {
        f4(new C23228i(2));
    }

    public final void g4(int i12, InterfaceC23096j interfaceC23096j) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            C23229i0 c23229i0 = this.f52648b.get();
            if (c23229i0 == null) {
                return;
            }
            c23229i0.f52493b.c(i12, interfaceC23096j);
            c23229i0.c0().a0(new E1(i12, 2, c23229i0));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // androidx.media3.session.InterfaceC23243n
    public final void m2(int i12, Bundle bundle) {
        try {
            g4(i12, (O1) O1.f52229h.fromBundle(bundle));
        } catch (RuntimeException e12) {
            androidx.media3.common.util.s.h("Ignoring malformed Bundle for SessionResult", e12);
        }
    }

    @Override // androidx.media3.session.InterfaceC23243n
    public final void t0(int i12, Bundle bundle) {
        try {
            f4(new C23258s0((H.c) H.c.f47241e.fromBundle(bundle)));
        } catch (RuntimeException e12) {
            androidx.media3.common.util.s.h("Ignoring malformed Bundle for Commands", e12);
        }
    }
}
