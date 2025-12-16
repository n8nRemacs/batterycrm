package androidx.media3.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.AbstractServiceC23085i;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.InterfaceC23119j;
import androidx.media3.session.BinderC23267v0;
import androidx.media3.session.C23225h;
import androidx.media3.session.C23257s;
import androidx.media3.session.J;
import androidx.media3.session.O0;
import androidx.media3.session.T0;
import com.google.common.collect.N4;
import com.google.common.util.concurrent.C37568u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC23253q0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52622b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52623c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52624d;

    public /* synthetic */ RunnableC23253q0(int i12, Object obj, Object obj2) {
        this.f52622b = i12;
        this.f52623c = obj;
        this.f52624d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        O1 o12;
        K1 k12 = null;
        switch (this.f52622b) {
            case 0:
                MediaControllerImplLegacy mediaControllerImplLegacy = (MediaControllerImplLegacy) this.f52623c;
                MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(mediaControllerImplLegacy.f52146a, (MediaSessionCompat.Token) this.f52624d);
                mediaControllerImplLegacy.f52152g = mediaControllerCompat;
                mediaControllerCompat.registerCallback(mediaControllerImplLegacy.f52150e, mediaControllerImplLegacy.Z().f52080e);
                return;
            case 1:
                int i12 = BinderC23267v0.f52647p;
                C23229i0 c23229i0 = (C23229i0) this.f52623c;
                if (c23229i0.f52504m) {
                    return;
                }
                ((BinderC23267v0.a) this.f52624d).a(c23229i0);
                return;
            case 2:
                int i13 = B0.f51923o;
                if (((com.google.common.util.concurrent.e1) this.f52623c).isCancelled()) {
                    ((com.google.common.util.concurrent.D0) this.f52624d).cancel(false);
                    return;
                }
                return;
            case 3:
                int i14 = B0.f51923o;
                if (!((com.google.common.util.concurrent.e1) this.f52623c).isCancelled()) {
                    return;
                }
                int i15 = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) this.f52624d;
                    if (i15 >= arrayList.size()) {
                        return;
                    }
                    if (arrayList.get(i15) != null) {
                        ((com.google.common.util.concurrent.D0) arrayList.get(i15)).cancel(false);
                    }
                    i15++;
                }
            case 4:
                com.google.common.util.concurrent.D0 d02 = (com.google.common.util.concurrent.D0) this.f52623c;
                AbstractServiceC23085i.C1812i c1812i = (AbstractServiceC23085i.C1812i) this.f52624d;
                int i16 = B0.f51923o;
                try {
                    O1 o13 = (O1) d02.get();
                    C23110a.e(o13, "SessionResult must not be null");
                    c1812i.f(o13.f52231c);
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException e12) {
                    androidx.media3.common.util.s.h("Custom action failed", e12);
                    c1812i.e();
                    return;
                }
            case 5:
                J j12 = (J) this.f52623c;
                j12.c0();
                J.d dVar = j12.f52078c;
                N4<K1> it = (!dVar.isConnected() ? L1.f52123c : dVar.u()).f52126b.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    str = (String) this.f52624d;
                    if (zHasNext) {
                        K1 next = it.next();
                        if (next.f52115b == 0 && next.f52116c.equals(str)) {
                            k12 = next;
                        }
                    }
                }
                if (k12 != null) {
                    j12.c0();
                    L1 l1U = !dVar.isConnected() ? L1.f52123c : dVar.u();
                    l1U.getClass();
                    if (l1U.f52126b.contains(k12)) {
                        C37568u0.a(j12.b0(k12, Bundle.EMPTY), new L0(str), com.google.common.util.concurrent.Q0.a());
                        return;
                    }
                    return;
                }
                return;
            case 6:
                T0 t02 = (T0) this.f52623c;
                C23206a1 c23206a1 = t02.f52293g;
                G1 g12 = (G1) this.f52624d;
                t02.f52302p = g12;
                g12.f52052e = t02.f52308v;
                T0.b bVar = new T0.b(t02, g12);
                g12.F(bVar);
                t02.f52303q = bVar;
                try {
                    c23206a1.f52359d.j(0, g12);
                } catch (RemoteException e13) {
                    androidx.media3.common.util.s.d("Exception in using media1 API", e13);
                }
                c23206a1.f52362g.setActive(true);
                t02.f52301o = g12.n0();
                t02.d(g12.n());
                return;
            case 7:
                int i17 = T0.f52286w;
                ((T0) this.f52623c).getClass();
                ((Runnable) this.f52624d).run();
                return;
            case 8:
                int i18 = T0.f52286w;
                ((com.google.common.util.concurrent.e1) this.f52624d).n(Boolean.valueOf(((T0) this.f52623c).h()));
                return;
            case 9:
                com.google.common.util.concurrent.D0 d03 = (com.google.common.util.concurrent.D0) this.f52623c;
                int i19 = C23206a1.f52355o;
                try {
                    o12 = (O1) d03.get();
                    C23110a.e(o12, "SessionResult must not be null");
                } catch (InterruptedException e14) {
                    e = e14;
                    androidx.media3.common.util.s.h("Custom command failed", e);
                    o12 = new O1(-1);
                } catch (CancellationException e15) {
                    androidx.media3.common.util.s.h("Custom command cancelled", e15);
                    o12 = new O1(1);
                } catch (ExecutionException e16) {
                    e = e16;
                    androidx.media3.common.util.s.h("Custom command failed", e);
                    o12 = new O1(-1);
                }
                ((ResultReceiver) this.f52624d).send(o12.f52230b, o12.f52231c);
                return;
            case 10:
                int i22 = AbstractServiceC23212c1.f52402j;
                M0 m02 = (M0) this.f52623c;
                HashMap map = m02.f52138h;
                O0 o02 = (O0) this.f52624d;
                map.remove(o02);
                com.google.common.util.concurrent.D0 d04 = (com.google.common.util.concurrent.D0) m02.f52137g.remove(o02);
                if (d04 != null) {
                    J.Z(d04);
                }
                o02.f52204a.f52304r = null;
                return;
            case 11:
                int i23 = A1.f51915u;
                A1 a12 = (A1) this.f52623c;
                a12.getClass();
                IBinder iBinderAsBinder = ((InterfaceC23243n) this.f52624d).asBinder();
                C23225h<IBinder> c23225h = a12.f51918q;
                O0.g gVarE = c23225h.e(iBinderAsBinder);
                if (gVarE != null) {
                    c23225h.k(gVarE);
                    return;
                }
                return;
            case 12:
                A1 a13 = (A1) this.f52623c;
                O0.g gVar = (O0.g) this.f52624d;
                C23225h<IBinder> c23225h2 = a13.f51918q;
                synchronized (c23225h2.f52476a) {
                    try {
                        C23225h.b<IBinder> bVar2 = c23225h2.f52478c.get(gVar);
                        if (bVar2 != null && !bVar2.f52485f && !bVar2.f52482c.isEmpty()) {
                            bVar2.f52485f = true;
                            c23225h2.b(bVar2);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            default:
                ((InterfaceC23119j) this.f52623c).accept((C23257s.b) this.f52624d);
                return;
        }
    }

    public /* synthetic */ RunnableC23253q0(M0 m02, J j12, String str) {
        this.f52622b = 5;
        this.f52623c = j12;
        this.f52624d = str;
    }

    public /* synthetic */ RunnableC23253q0(T0 t02, O0.g gVar, Runnable runnable) {
        this.f52622b = 7;
        this.f52623c = t02;
        this.f52624d = runnable;
    }
}
