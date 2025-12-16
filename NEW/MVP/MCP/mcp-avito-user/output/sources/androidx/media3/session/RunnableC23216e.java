package androidx.media3.session;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.media3.session.AbstractServiceC23212c1;
import androidx.media3.session.O0;
import androidx.media3.session.T0;
import com.google.common.collect.AbstractC37401r1;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC23216e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52445b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T0 f52446c;

    public /* synthetic */ RunnableC23216e(T0 t02, int i12) {
        this.f52445b = i12;
        this.f52446c = t02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52445b) {
            case 0:
                T0 t02 = this.f52446c;
                if (t02.f()) {
                    return;
                }
                t02.f52290d.getClass();
                return;
            case 1:
                T0 t03 = this.f52446c;
                T0.b bVar = t03.f52303q;
                if (bVar != null) {
                    t03.f52302p.E(bVar);
                    return;
                }
                return;
            case 2:
                T0 t04 = this.f52446c;
                synchronized (t04.f52287a) {
                    try {
                        if (t04.f52306t) {
                            return;
                        }
                        final N1 n1P0 = t04.f52302p.p0();
                        if (!t04.f52289c.hasMessages(1) && C1.a(n1P0, t04.f52301o.f51977d)) {
                            C23225h<IBinder> c23225h = t04.f52292f.f51918q;
                            AbstractC37401r1<O0.g> abstractC37401r1D = c23225h.d();
                            for (int i12 = 0; i12 < abstractC37401r1D.size(); i12++) {
                                O0.g gVar = abstractC37401r1D.get(i12);
                                final boolean zH2 = c23225h.h(gVar, 16);
                                final boolean zH3 = c23225h.h(gVar, 17);
                                t04.b(gVar, new T0.c() { // from class: androidx.media3.session.R0
                                    @Override // androidx.media3.session.T0.c
                                    public final void b(O0.f fVar, int i13) {
                                        int i14 = T0.f52286w;
                                        fVar.d(i13, n1P0, zH2, zH3);
                                    }
                                });
                            }
                            try {
                                t04.f52293g.f52359d.d(0, n1P0, true, true);
                            } catch (RemoteException e12) {
                                androidx.media3.common.util.s.d("Exception in using media1 API", e12);
                            }
                        }
                        t04.l();
                        return;
                    } finally {
                    }
                }
            case 3:
                int i13 = T0.f52286w;
                this.f52446c.l();
                return;
            default:
                T0 t05 = this.f52446c;
                AbstractServiceC23212c1.d dVar = t05.f52304r;
                if (dVar != null) {
                    AbstractServiceC23212c1.this.f(t05.f52296j, false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC23216e(T0 t02, O0.g gVar) {
        this.f52445b = 0;
        this.f52446c = t02;
    }
}
