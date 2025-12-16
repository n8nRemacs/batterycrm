package defpackage;

import android.util.Pair;
import com.facebook.fresco.middleware.HasExtraData;
import java.io.Closeable;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class kp0 implements nac {
    public final HashMap a;
    public final nac b;
    public final String c;
    public final String d;
    public final /* synthetic */ int e;
    public final kk4 f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kp0(kk4 kk4Var, mp0 mp0Var) {
        this(mp0Var, "BitmapMemoryCacheKeyMultiplexProducer", HasExtraData.KEY_MULTIPLEX_BITMAP_COUNT);
        this.e = 0;
        this.f = kk4Var;
    }

    @Override // defpackage.nac
    public final void a(hj0 hj0Var, oac oacVar) {
        g7a g7aVar;
        int i;
        boolean z;
        try {
            ml6.i();
            ((mk0) oacVar).c.j(oacVar, this.c);
            Pair pairD = d(oacVar);
            do {
                synchronized (this) {
                    synchronized (this) {
                        g7aVar = (g7a) this.a.get(pairD);
                    }
                }
                i = 1;
                if (g7aVar == null) {
                    synchronized (this) {
                        g7aVar = new g7a(this, pairD);
                        this.a.put(pairD, g7aVar);
                        z = true;
                    }
                } else {
                    z = false;
                }
            } while (!g7aVar.a(hj0Var, oacVar));
            if (z) {
                if (!((mk0) oacVar).g()) {
                    i = 2;
                }
                g7aVar.i(i);
            }
        } finally {
            ml6.i();
        }
    }

    public final Closeable c(Closeable closeable) {
        switch (this.e) {
            case 0:
                return vc3.y((vc3) closeable);
            default:
                return ce5.c((ce5) closeable);
        }
    }

    public final Pair d(oac oacVar) {
        switch (this.e) {
            case 0:
                mk0 mk0Var = (mk0) oacVar;
                return Pair.create(this.f.p(mk0Var.a, mk0Var.d), mk0Var.o);
            default:
                mk0 mk0Var2 = (mk0) oacVar;
                rf7 rf7Var = mk0Var2.a;
                kk4 kk4Var = this.f;
                kk4Var.getClass();
                return Pair.create(kk4Var.s(rf7Var.b), mk0Var2.o);
        }
    }

    public final synchronized void e(Object obj, g7a g7aVar) {
        if (this.a.get(obj) == g7aVar) {
            this.a.remove(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kp0(kk4 kk4Var, nac nacVar) {
        this(nacVar, "EncodedCacheKeyMultiplexProducer", HasExtraData.KEY_MULTIPLEX_ENCODED_COUNT);
        this.e = 1;
        this.f = kk4Var;
    }

    public kp0(nac nacVar, String str, String str2) {
        this.b = nacVar;
        this.a = new HashMap();
        this.c = str;
        this.d = str2;
    }
}
