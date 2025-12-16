package androidx.media3.session;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.AbstractServiceC23085i;
import androidx.media.C;
import androidx.media3.common.util.C23118i;
import androidx.media3.session.O0;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MediaSessionServiceLegacyStub.java */
/* renamed from: androidx.media3.session.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class ServiceC23218e1 extends AbstractServiceC23085i {

    /* renamed from: j, reason: collision with root package name */
    public final androidx.media.C f52448j;

    /* renamed from: k, reason: collision with root package name */
    public final T0 f52449k;

    /* renamed from: l, reason: collision with root package name */
    public final C23225h<C.b> f52450l;

    public ServiceC23218e1(T0 t02) {
        this.f52448j = androidx.media.C.a(t02.f52291e);
        this.f52449k = t02;
        this.f52450l = new C23225h<>(t02);
    }

    @Override // androidx.media.AbstractServiceC23085i
    @j.P
    public AbstractServiceC23085i.a d(String str, int i12, @j.P Bundle bundle) {
        C.b bVarB = b();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        O0.g gVarL = l(bVarB, bundle);
        AtomicReference atomicReference = new AtomicReference();
        C23118i c23118i = new C23118i();
        androidx.media3.common.util.M.I(this.f52449k.f52297k, new RunnableC23222g(this, atomicReference, gVarL, c23118i, 5));
        try {
            c23118i.a();
            O0.e eVar = (O0.e) atomicReference.get();
            if (!eVar.f52215a) {
                return null;
            }
            this.f52450l.a(bVarB, gVarL, eVar.f52216b, eVar.f52217c);
            return C1.f51933a;
        } catch (InterruptedException e12) {
            androidx.media3.common.util.s.d("Couldn't get a result from onConnect", e12);
            return null;
        }
    }

    @Override // androidx.media.AbstractServiceC23085i
    public void f(String str, AbstractServiceC23085i.C1812i<List<MediaBrowserCompat.MediaItem>> c1812i) {
        c1812i.f(null);
    }

    public O0.g l(C.b bVar, Bundle bundle) {
        return new O0.g(bVar, 0, this.f52448j.b(bVar), null);
    }

    public final void m(MediaSessionCompat.Token token) {
        attachBaseContext(this.f52449k.f52291e);
        onCreate();
        k(token);
    }
}
