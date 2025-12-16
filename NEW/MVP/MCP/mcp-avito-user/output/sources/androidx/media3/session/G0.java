package androidx.media3.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media3.common.B;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.z;
import androidx.media3.session.AbstractServiceC23270w0;
import androidx.media3.session.O0;
import androidx.media3.session.T0;
import com.avito.android.R;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.util.concurrent.C37568u0;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: MediaLibrarySessionImpl.java */
/* loaded from: classes.dex */
class G0 extends T0 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f52048x = 0;

    @j.P
    public static <T> T s(Future<T> future) {
        C23110a.g(future.isDone());
        try {
            return future.get();
        } catch (InterruptedException | CancellationException | ExecutionException e12) {
            androidx.media3.common.util.s.h("Library operation failed", e12);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(int i12, C23252q c23252q) {
        if (c23252q.f52617b == 0) {
            AbstractC37401r1 abstractC37401r1 = (AbstractC37401r1) c23252q.f52619d;
            abstractC37401r1.getClass();
            if (abstractC37401r1.size() <= i12) {
                return;
            }
            throw new IllegalStateException("Invalid size=" + abstractC37401r1.size() + ", pageSize=" + i12);
        }
    }

    @Override // androidx.media3.session.T0
    public final ServiceC23218e1 a(MediaSessionCompat.Token token) {
        B0 b02 = new B0(this);
        b02.m(token);
        return b02;
    }

    @Override // androidx.media3.session.T0
    public final void c(T0.c cVar) {
        ServiceC23218e1 serviceC23218e1;
        super.c(cVar);
        synchronized (this.f52287a) {
            serviceC23218e1 = this.f52305s;
        }
        B0 b02 = (B0) serviceC23218e1;
        if (b02 != null) {
            try {
                cVar.b(b02.f51924m, 0);
            } catch (RemoteException e12) {
                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
            }
        }
    }

    @Override // androidx.media3.session.T0
    public final boolean e(O0.g gVar) {
        ServiceC23218e1 serviceC23218e1;
        if (super.e(gVar)) {
            return true;
        }
        synchronized (this.f52287a) {
            serviceC23218e1 = this.f52305s;
        }
        B0 b02 = (B0) serviceC23218e1;
        return b02 != null && b02.f52450l.g(gVar);
    }

    public final void n(C23252q<?> c23252q) {
        AbstractServiceC23270w0.b bVar;
        G1 g12 = this.f52302p;
        int i12 = c23252q.f52617b;
        C23206a1 c23206a1 = this.f52293g;
        if (i12 == -102 && (bVar = c23252q.f52621f) != null) {
            Bundle bundle = bVar.f52656b;
            if (bundle.containsKey("android.media.extras.ERROR_RESOLUTION_ACTION_INTENT")) {
                MediaSessionCompat mediaSessionCompat = c23206a1.f52362g;
                if (g12.f52049b != -102) {
                    String string = this.f52291e.getString(R.string.authentication_required);
                    g12.f52049b = 3;
                    g12.f52050c = string;
                    g12.f52051d = bundle;
                    mediaSessionCompat.setPlaybackState(g12.m0());
                    return;
                }
                return;
            }
        }
        if (g12.f52049b != 0) {
            g12.f52049b = -1;
            g12.f52050c = null;
            g12.f52051d = null;
            c23206a1.f52362g.setPlaybackState(g12.m0());
        }
    }

    public final com.google.common.util.concurrent.D0 o(String str, int i12, @j.P AbstractServiceC23270w0.b bVar) {
        if (!Objects.equals(str, "androidx.media3.session.recent.root")) {
            throw null;
        }
        if (!this.f52293g.f52365j) {
            return C37568u0.d(C23252q.b(-6, null));
        }
        if (this.f52302p.getPlaybackState() == 1) {
            new com.google.common.util.concurrent.e1();
            throw null;
        }
        z.c cVar = new z.c();
        cVar.f47988a = "androidx.media3.session.recent.item";
        B.b bVar2 = new B.b();
        bVar2.f47201p = Boolean.FALSE;
        bVar2.f47202q = Boolean.TRUE;
        cVar.f47998k = bVar2.a();
        return C37568u0.d(C23252q.g(AbstractC37401r1.E(cVar.a()), bVar));
    }

    public final com.google.common.util.concurrent.D0<C23252q<androidx.media3.common.z>> p(O0.g gVar, @j.P AbstractServiceC23270w0.b bVar) {
        if (bVar == null || !bVar.f52657c || !Objects.equals(gVar.f52219a.a(), "com.android.systemui")) {
            throw null;
        }
        if (!this.f52293g.f52365j) {
            return C37568u0.d(C23252q.b(-6, null));
        }
        z.c cVar = new z.c();
        cVar.f47988a = "androidx.media3.session.recent.root";
        B.b bVar2 = new B.b();
        bVar2.f47201p = Boolean.TRUE;
        bVar2.f47202q = Boolean.FALSE;
        cVar.f47998k = bVar2.a();
        androidx.media3.common.z zVarA = cVar.a();
        C23252q.j(zVarA);
        return C37568u0.d(new C23252q(0, SystemClock.elapsedRealtime(), bVar, zVarA, 2));
    }

    public final com.google.common.util.concurrent.D0 q(O0.g gVar, String str) {
        C23110a.h(gVar.f52222d);
        synchronized (this.f52287a) {
            throw null;
        }
    }

    public final void r(O0.f fVar, String str) {
        synchronized (this.f52287a) {
            throw null;
        }
    }
}
