package androidx.media3.session;

import android.graphics.Bitmap;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import androidx.media.AbstractServiceC23085i;
import androidx.media3.common.util.C23110a;
import androidx.media3.session.O0;
import com.google.common.util.concurrent.InterfaceC37569v;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class A0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f51909b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B0 f51910c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f51911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O0.g f51912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC23085i.C1812i f51913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bundle f51914g;

    public /* synthetic */ A0(B0 b02, O0.g gVar, AbstractServiceC23085i.C1812i c1812i, Bundle bundle, String str) {
        this.f51910c = b02;
        this.f51912e = gVar;
        this.f51913f = c1812i;
        this.f51914g = bundle;
        this.f51911d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final int i12 = 0;
        final int i13 = 1;
        Bundle bundle = this.f51914g;
        final AbstractServiceC23085i.C1812i c1812i = this.f51913f;
        O0.g gVar = this.f51912e;
        String str = this.f51911d;
        final B0 b02 = this.f51910c;
        switch (this.f51909b) {
            case 0:
                int i14 = B0.f51923o;
                if (!b02.f52450l.i(gVar, 50003)) {
                    c1812i.f(null);
                    break;
                } else {
                    G0 g02 = b02.f51925n;
                    if (bundle != null) {
                        bundle.setClassLoader(g02.f52291e.getClassLoader());
                        try {
                            int i15 = bundle.getInt("android.media.browse.extra.PAGE");
                            int i16 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE);
                            if (i15 >= 0 && i16 > 0) {
                                final com.google.common.util.concurrent.e1 e1VarP = androidx.media3.common.util.M.P(g02.o(str, i16, C1.j(g02.f52291e, bundle)), new InterfaceC37569v() { // from class: androidx.media3.session.x0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // com.google.common.util.concurrent.InterfaceC37569v
                                    public final com.google.common.util.concurrent.D0 apply(Object obj) {
                                        V v12;
                                        B0 b03 = b02;
                                        C23252q c23252q = (C23252q) obj;
                                        switch (i13) {
                                            case 0:
                                                int i17 = B0.f51923o;
                                                b03.getClass();
                                                C23110a.e(c23252q, "LibraryResult must not be null");
                                                com.google.common.util.concurrent.e1 e1Var = new com.google.common.util.concurrent.e1();
                                                if (c23252q.f52617b != 0 || (v12 = c23252q.f52619d) == 0) {
                                                    e1Var.n(null);
                                                } else {
                                                    androidx.media3.common.z zVar = (androidx.media3.common.z) v12;
                                                    byte[] bArr = zVar.f47981e.f47163k;
                                                    if (bArr == null) {
                                                        e1Var.n(C1.c(zVar, null));
                                                    } else {
                                                        com.google.common.util.concurrent.D0<Bitmap> d0B = b03.f51925n.f52298l.b(bArr);
                                                        e1Var.N(new RunnableC23253q0(2, e1Var, d0B), com.google.common.util.concurrent.Q0.a());
                                                        d0B.N(new RunnableC23276z0(d0B, e1Var, zVar, 0), com.google.common.util.concurrent.Q0.a());
                                                    }
                                                }
                                                return e1Var;
                                            default:
                                                return B0.n(b03, c23252q);
                                        }
                                    }
                                });
                                e1VarP.N(new Runnable() { // from class: androidx.media3.session.y0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractServiceC23085i.C1812i c1812i2 = c1812i;
                                        com.google.common.util.concurrent.e1 e1Var = e1VarP;
                                        switch (i12) {
                                            case 0:
                                                int i17 = B0.f51923o;
                                                try {
                                                    List list = (List) e1Var.get();
                                                    c1812i2.f(list == null ? null : C1.F(list));
                                                    break;
                                                } catch (InterruptedException | CancellationException | ExecutionException e12) {
                                                    androidx.media3.common.util.s.h("Library operation failed", e12);
                                                    c1812i2.f(null);
                                                    return;
                                                }
                                            default:
                                                int i18 = B0.f51923o;
                                                try {
                                                    c1812i2.f((MediaBrowserCompat.MediaItem) e1Var.get());
                                                    break;
                                                } catch (InterruptedException | CancellationException | ExecutionException e13) {
                                                    androidx.media3.common.util.s.h("Library operation failed", e13);
                                                    c1812i2.f(null);
                                                }
                                        }
                                    }
                                }, com.google.common.util.concurrent.Q0.a());
                                break;
                            }
                        } catch (BadParcelableException unused) {
                        }
                    }
                    final com.google.common.util.concurrent.e1 e1VarP2 = androidx.media3.common.util.M.P(g02.o(str, Integer.MAX_VALUE, null), new InterfaceC37569v() { // from class: androidx.media3.session.x0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.common.util.concurrent.InterfaceC37569v
                        public final com.google.common.util.concurrent.D0 apply(Object obj) {
                            V v12;
                            B0 b03 = b02;
                            C23252q c23252q = (C23252q) obj;
                            switch (i13) {
                                case 0:
                                    int i17 = B0.f51923o;
                                    b03.getClass();
                                    C23110a.e(c23252q, "LibraryResult must not be null");
                                    com.google.common.util.concurrent.e1 e1Var = new com.google.common.util.concurrent.e1();
                                    if (c23252q.f52617b != 0 || (v12 = c23252q.f52619d) == 0) {
                                        e1Var.n(null);
                                    } else {
                                        androidx.media3.common.z zVar = (androidx.media3.common.z) v12;
                                        byte[] bArr = zVar.f47981e.f47163k;
                                        if (bArr == null) {
                                            e1Var.n(C1.c(zVar, null));
                                        } else {
                                            com.google.common.util.concurrent.D0<Bitmap> d0B = b03.f51925n.f52298l.b(bArr);
                                            e1Var.N(new RunnableC23253q0(2, e1Var, d0B), com.google.common.util.concurrent.Q0.a());
                                            d0B.N(new RunnableC23276z0(d0B, e1Var, zVar, 0), com.google.common.util.concurrent.Q0.a());
                                        }
                                    }
                                    return e1Var;
                                default:
                                    return B0.n(b03, c23252q);
                            }
                        }
                    });
                    e1VarP2.N(new Runnable() { // from class: androidx.media3.session.y0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractServiceC23085i.C1812i c1812i2 = c1812i;
                            com.google.common.util.concurrent.e1 e1Var = e1VarP2;
                            switch (i12) {
                                case 0:
                                    int i17 = B0.f51923o;
                                    try {
                                        List list = (List) e1Var.get();
                                        c1812i2.f(list == null ? null : C1.F(list));
                                        break;
                                    } catch (InterruptedException | CancellationException | ExecutionException e12) {
                                        androidx.media3.common.util.s.h("Library operation failed", e12);
                                        c1812i2.f(null);
                                        return;
                                    }
                                default:
                                    int i18 = B0.f51923o;
                                    try {
                                        c1812i2.f((MediaBrowserCompat.MediaItem) e1Var.get());
                                        break;
                                    } catch (InterruptedException | CancellationException | ExecutionException e13) {
                                        androidx.media3.common.util.s.h("Library operation failed", e13);
                                        c1812i2.f(null);
                                    }
                            }
                        }
                    }, com.google.common.util.concurrent.Q0.a());
                    break;
                }
            default:
                int i17 = B0.f51923o;
                b02.getClass();
                K1 k12 = new K1(Bundle.EMPTY, str);
                if (!b02.f52450l.j(gVar, k12)) {
                    c1812i.e();
                    break;
                } else {
                    com.google.common.util.concurrent.D0<O1> d0G = b02.f51925n.g(gVar, k12, bundle);
                    d0G.N(new RunnableC23253q0(4, d0G, c1812i), com.google.common.util.concurrent.Q0.a());
                    break;
                }
        }
    }

    public /* synthetic */ A0(B0 b02, String str, O0.g gVar, AbstractServiceC23085i.C1812i c1812i, Bundle bundle) {
        this.f51910c = b02;
        this.f51911d = str;
        this.f51912e = gVar;
        this.f51913f = c1812i;
        this.f51914g = bundle;
    }
}
