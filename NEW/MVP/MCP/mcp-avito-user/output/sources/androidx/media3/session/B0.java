package androidx.media3.session;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.text.TextUtils;
import androidx.media.AbstractServiceC23085i;
import androidx.media.C;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.C23118i;
import androidx.media3.session.AbstractServiceC23270w0;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MediaLibraryServiceLegacyStub.java */
/* loaded from: classes.dex */
class B0 extends ServiceC23218e1 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f51923o = 0;

    /* renamed from: m, reason: collision with root package name */
    public final c f51924m;

    /* renamed from: n, reason: collision with root package name */
    public final G0 f51925n;

    /* compiled from: MediaLibraryServiceLegacyStub.java */
    public final class b implements O0.f {

        /* renamed from: b, reason: collision with root package name */
        public final C.b f51927b;

        /* renamed from: a, reason: collision with root package name */
        public final Object f51926a = new Object();

        /* renamed from: c, reason: collision with root package name */
        @j.B
        public final ArrayList f51928c = new ArrayList();

        public b(C.b bVar) {
            this.f51927b = bVar;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return androidx.media3.common.util.M.a(this.f51927b, ((b) obj).f51927b);
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.f51927b);
        }
    }

    /* compiled from: MediaLibraryServiceLegacyStub.java */
    public final class c implements O0.f {
        public c(B0 b02, a aVar) {
        }
    }

    /* compiled from: MediaLibraryServiceLegacyStub.java */
    public static class d {
        public d() {
            throw null;
        }
    }

    public B0(G0 g02) {
        super(g02);
        this.f51925n = g02;
        this.f51924m = new c(this, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.common.util.concurrent.e1 n(B0 b02, C23252q c23252q) {
        V v12;
        b02.getClass();
        C23110a.e(c23252q, "LibraryResult must not be null");
        com.google.common.util.concurrent.e1 e1VarR = com.google.common.util.concurrent.e1.r();
        if (c23252q.f52617b != 0 || (v12 = c23252q.f52619d) == 0) {
            e1VarR.n(null);
        } else {
            AbstractC37401r1 abstractC37401r1 = (AbstractC37401r1) v12;
            if (abstractC37401r1.isEmpty()) {
                e1VarR.n(new ArrayList());
            } else {
                ArrayList arrayList = new ArrayList();
                e1VarR.N(new RunnableC23253q0(3, e1VarR, arrayList), com.google.common.util.concurrent.Q0.a());
                RunnableC23219f runnableC23219f = new RunnableC23219f(b02, new AtomicInteger(0), abstractC37401r1, arrayList, e1VarR, 1);
                for (int i12 = 0; i12 < abstractC37401r1.size(); i12++) {
                    androidx.media3.common.B b12 = ((androidx.media3.common.z) abstractC37401r1.get(i12)).f47981e;
                    if (b12.f47163k == null) {
                        arrayList.add(null);
                        runnableC23219f.run();
                    } else {
                        com.google.common.util.concurrent.D0<Bitmap> d0B = b02.f51925n.f52298l.b(b12.f47163k);
                        arrayList.add(d0B);
                        d0B.N(runnableC23219f, com.google.common.util.concurrent.Q0.a());
                    }
                }
            }
        }
        return e1VarR;
    }

    @Override // androidx.media.AbstractServiceC23085i
    public final void c(Bundle bundle, AbstractServiceC23085i.C1812i c1812i, String str) {
        O0.g gVarO = o();
        if (gVarO == null) {
            c1812i.e();
        } else {
            c1812i.a();
            androidx.media3.common.util.M.I(this.f51925n.f52297k, new A0(this, str, gVarO, c1812i, bundle));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.session.ServiceC23218e1, androidx.media.AbstractServiceC23085i
    @j.P
    public final AbstractServiceC23085i.a d(String str, int i12, @j.P Bundle bundle) {
        O0.g gVarO;
        C23252q c23252q;
        V v12;
        Bundle bundle2;
        if (super.d(str, i12, bundle) == null || (gVarO = o()) == null) {
            return null;
        }
        C23225h<C.b> c23225h = this.f52450l;
        if (!c23225h.i(gVarO, 50000)) {
            return null;
        }
        G0 g02 = this.f51925n;
        AbstractServiceC23270w0.b bVarJ = C1.j(g02.f52291e, bundle);
        AtomicReference atomicReference = new AtomicReference();
        C23118i c23118i = new C23118i();
        androidx.media3.common.util.M.I(g02.f52297k, new RunnableC23219f(this, atomicReference, gVarO, bVarJ, c23118i, 2));
        try {
            c23118i.a();
            c23252q = (C23252q) ((com.google.common.util.concurrent.D0) atomicReference.get()).get();
            C23110a.e(c23252q, "LibraryResult must not be null");
        } catch (InterruptedException | CancellationException | ExecutionException e12) {
            androidx.media3.common.util.s.d("Couldn't get a result from onGetLibraryRoot", e12);
            c23252q = null;
        }
        if (c23252q == null || c23252q.f52617b != 0 || (v12 = c23252q.f52619d) == 0) {
            if (c23252q == null || c23252q.f52617b == 0) {
                return C1.f51933a;
            }
            return null;
        }
        AbstractServiceC23270w0.b bVar = c23252q.f52621f;
        if (bVar != null) {
            Bundle bundle3 = bVar.f52656b;
            bundle2 = new Bundle(bundle3);
            if (bundle3.containsKey("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY")) {
                boolean z12 = bundle3.getBoolean("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY", false);
                bundle2.remove("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY");
                bundle2.putInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", z12 ? 1 : 3);
            }
            bundle2.putBoolean("android.service.media.extra.RECENT", bVar.f52657c);
            bundle2.putBoolean("android.service.media.extra.OFFLINE", bVar.f52658d);
            bundle2.putBoolean("android.service.media.extra.SUGGESTED", bVar.f52659e);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putBoolean("android.media.browse.SEARCH_SUPPORTED", c23225h.i(gVarO, 50005));
        return new AbstractServiceC23085i.a(bundle2, ((androidx.media3.common.z) v12).f47978b);
    }

    @Override // androidx.media.AbstractServiceC23085i
    public final void e(@j.P Bundle bundle, AbstractServiceC23085i.C1812i c1812i, String str) {
        O0.g gVarO = o();
        if (gVarO == null) {
            c1812i.f(null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            c1812i.a();
            androidx.media3.common.util.M.I(this.f51925n.f52297k, new A0(this, gVarO, c1812i, bundle, str));
        } else {
            gVarO.toString();
            androidx.media3.common.util.s.g();
            c1812i.f(null);
        }
    }

    @Override // androidx.media3.session.ServiceC23218e1, androidx.media.AbstractServiceC23085i
    public final void f(String str, AbstractServiceC23085i.C1812i<List<MediaBrowserCompat.MediaItem>> c1812i) {
        e(null, c1812i, str);
    }

    @Override // androidx.media.AbstractServiceC23085i
    public final void g(String str, AbstractServiceC23085i.C1812i<MediaBrowserCompat.MediaItem> c1812i) {
        O0.g gVarO = o();
        if (gVarO == null) {
            c1812i.f(null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            c1812i.a();
            androidx.media3.common.util.M.I(this.f51925n.f52297k, new RunnableC23276z0(this, gVarO, c1812i, str));
        } else {
            gVarO.toString();
            androidx.media3.common.util.s.g();
            c1812i.f(null);
        }
    }

    @Override // androidx.media.AbstractServiceC23085i
    public final void h(@j.P Bundle bundle, AbstractServiceC23085i.C1812i c1812i, String str) {
        O0.g gVarO = o();
        if (gVarO == null) {
            c1812i.f(null);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            gVarO.toString();
            androidx.media3.common.util.s.g();
            c1812i.f(null);
        } else if (gVarO.f52222d instanceof b) {
            c1812i.a();
            androidx.media3.common.util.M.I(this.f51925n.f52297k, new RunnableC23222g(this, gVarO, c1812i, bundle, str));
        }
    }

    @Override // androidx.media.AbstractServiceC23085i
    @SuppressLint({"RestrictedApi"})
    public final void i(Bundle bundle, String str) {
        O0.g gVarO = o();
        if (gVarO == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            androidx.media3.common.util.M.I(this.f51925n.f52297k, new RunnableC23222g(this, gVarO, bundle, str, 1));
        } else {
            gVarO.toString();
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media.AbstractServiceC23085i
    @SuppressLint({"RestrictedApi"})
    public final void j(String str) {
        O0.g gVarO = o();
        if (gVarO == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            androidx.media3.common.util.M.I(this.f51925n.f52297k, new RunnableC23276z0(this, gVarO, str, 2));
        } else {
            gVarO.toString();
            androidx.media3.common.util.s.g();
        }
    }

    @Override // androidx.media3.session.ServiceC23218e1
    public final O0.g l(C.b bVar, Bundle bundle) {
        return new O0.g(bVar, 0, this.f52448j.b(bVar), new b(bVar));
    }

    @j.P
    public final O0.g o() {
        return this.f52450l.e(b());
    }
}
