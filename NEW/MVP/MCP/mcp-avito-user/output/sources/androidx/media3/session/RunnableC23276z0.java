package androidx.media3.session;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import androidx.media.AbstractServiceC23085i;
import androidx.media3.common.util.C23110a;
import androidx.media3.session.A1;
import androidx.media3.session.AbstractServiceC23212c1.d;
import androidx.media3.session.J;
import androidx.media3.session.M0;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.util.concurrent.AbstractC37532c;
import com.google.common.util.concurrent.C37568u0;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.session.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC23276z0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52682b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52683c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f52684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f52685e;

    public /* synthetic */ RunnableC23276z0(B0 b02, O0.g gVar, AbstractServiceC23085i.C1812i c1812i, String str) {
        this.f52682b = 1;
        this.f52683c = b02;
        this.f52684d = gVar;
        this.f52685e = c1812i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap = null;
        Object obj = this.f52685e;
        Object obj2 = this.f52684d;
        Object obj3 = this.f52683c;
        switch (this.f52682b) {
            case 0:
                com.google.common.util.concurrent.D0 d02 = (com.google.common.util.concurrent.D0) obj3;
                int i12 = B0.f51923o;
                try {
                    bitmap = (Bitmap) C37568u0.b(d02);
                } catch (CancellationException | ExecutionException e12) {
                    androidx.media3.common.util.s.a("failed to get bitmap", e12);
                    androidx.media3.common.util.s.b();
                }
                ((com.google.common.util.concurrent.e1) obj2).n(C1.c((androidx.media3.common.z) obj, bitmap));
                return;
            case 1:
                int i13 = B0.f51923o;
                B0 b02 = (B0) obj3;
                AbstractServiceC23085i.C1812i c1812i = (AbstractServiceC23085i.C1812i) obj;
                if (b02.f52450l.i((O0.g) obj2, 50004)) {
                    b02.f51925n.getClass();
                    throw null;
                }
                c1812i.f(null);
                return;
            case 2:
                int i14 = B0.f51923o;
                B0 b03 = (B0) obj3;
                if (b03.f52450l.i((O0.g) obj2, 50002)) {
                    b03.f51925n.getClass();
                    throw null;
                }
                return;
            case 3:
                int i15 = G0.f52048x;
                G0 g02 = (G0) obj3;
                g02.getClass();
                O0.f fVar = ((O0.g) obj2).f52222d;
                C23110a.h(fVar);
                g02.r(fVar, (String) obj);
                return;
            case 4:
                M0 m02 = (M0) obj3;
                m02.f52132b.getClass();
                m02.f52135e.execute(new RunnableC23253q0(m02, (J) obj, (String) obj2));
                return;
            case 5:
                int i16 = AbstractServiceC23212c1.f52402j;
                AbstractServiceC23212c1 abstractServiceC23212c1 = (AbstractServiceC23212c1) obj3;
                abstractServiceC23212c1.getClass();
                M0 m03 = (M0) obj2;
                HashMap map = m03.f52137g;
                O0 o02 = (O0) obj;
                boolean zContainsKey = map.containsKey(o02);
                T0 t02 = o02.f52204a;
                if (!zContainsKey) {
                    HashMap map2 = m03.f52138h;
                    map2.put(o02, AbstractC37401r1.C());
                    AbstractServiceC23212c1 abstractServiceC23212c12 = m03.f52131a;
                    M0.c cVar = new M0.c(abstractServiceC23212c12, o02, map2);
                    J.a aVar = new J.a(abstractServiceC23212c12, t02.f52295i);
                    aVar.f52087d = cVar;
                    Looper mainLooper = Looper.getMainLooper();
                    mainLooper.getClass();
                    aVar.f52088e = mainLooper;
                    com.google.common.util.concurrent.D0<J> d0A = aVar.a();
                    map.put(o02, d0A);
                    ((AbstractC37532c) d0A).N(new RunnableC23222g(m03, d0A, cVar, o02, 4), m03.f52135e);
                }
                t02.f52304r = abstractServiceC23212c1.new d(null);
                return;
            default:
                int i17 = A1.f51915u;
                T0 t03 = (T0) obj3;
                if (t03.f()) {
                    return;
                }
                ((A1.d) obj2).c(t03.f52302p, (O0.i) obj);
                return;
        }
    }

    public /* synthetic */ RunnableC23276z0(M0 m02, O0 o02, String str, Bundle bundle, J j12) {
        this.f52682b = 4;
        this.f52683c = m02;
        this.f52684d = str;
        this.f52685e = j12;
    }

    public /* synthetic */ RunnableC23276z0(Object obj, Object obj2, Object obj3, int i12) {
        this.f52682b = i12;
        this.f52683c = obj;
        this.f52684d = obj2;
        this.f52685e = obj3;
    }
}
