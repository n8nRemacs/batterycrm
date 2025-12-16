package defpackage;

import androidx.camera.core.ImageCaptureException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class xc7 implements fie {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xc7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fie
    public final void a(hie hieVar) {
        switch (this.a) {
            case 0:
                dd7 dd7Var = (dd7) this.b;
                if (dd7Var.c() == null) {
                    return;
                }
                jei.b();
                eie eieVar = dd7Var.u;
                if (eieVar != null) {
                    eieVar.b();
                    dd7Var.u = null;
                }
                cg7 cg7Var = dd7Var.t;
                if (cg7Var != null) {
                    cg7Var.a();
                    dd7Var.t = null;
                }
                dd7Var.p.c();
                dd7Var.e();
                id7 id7Var = (id7) dd7Var.f;
                ob0 ob0Var = dd7Var.g;
                ob0Var.getClass();
                die dieVarF = dd7Var.F(id7Var, ob0Var);
                dd7Var.s = dieVarF;
                Object[] objArr = {dieVarF.h()};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                dd7Var.E(Collections.unmodifiableList(arrayList));
                dd7Var.q();
                return;
            case 1:
                ee7 ee7Var = (ee7) this.b;
                if (ee7Var.c() == null) {
                    return;
                }
                zyf zyfVar = ee7Var.x;
                zyfVar.getClass();
                jei.b();
                zyfVar.X = true;
                knd kndVar = zyfVar.d;
                if (kndVar != null) {
                    jei.b();
                    if (!kndVar.d.b.isDone()) {
                        ImageCaptureException imageCaptureException = new ImageCaptureException("The request is aborted silently and retried.", null);
                        jei.b();
                        kndVar.g = true;
                        q72 q72Var = kndVar.i;
                        Objects.requireNonNull(q72Var);
                        q72Var.cancel(true);
                        kndVar.e.d(imageCaptureException);
                        kndVar.f.b(null);
                        kndVar.b.d(kndVar.a);
                    }
                }
                ee7Var.F(true);
                String strE = ee7Var.e();
                fe7 fe7Var = (fe7) ee7Var.f;
                ob0 ob0Var2 = ee7Var.g;
                ob0Var2.getClass();
                die dieVarG = ee7Var.G(strE, fe7Var, ob0Var2);
                ee7Var.v = dieVarG;
                Object[] objArr2 = {dieVarG.h()};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr2[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                ee7Var.E(Collections.unmodifiableList(arrayList2));
                ee7Var.q();
                zyf zyfVar2 = ee7Var.x;
                zyfVar2.getClass();
                jei.b();
                zyfVar2.X = false;
                zyfVar2.c();
                return;
            case 2:
                lz9 lz9Var = (lz9) this.b;
                lz9Var.b = lz9Var.e();
                uy1 uy1Var = (uy1) lz9Var.o;
                if (uy1Var != null) {
                    ez1 ez1Var = uy1Var.b;
                    try {
                        if (((Boolean) ixi.a(new uy1(ez1Var, 2)).b.get()).booleanValue()) {
                            lz9 lz9Var2 = ez1Var.G0;
                            hie hieVar2 = (hie) lz9Var2.b;
                            kz9 kz9Var = (kz9) lz9Var2.c;
                            ob0 ob0Var3 = null;
                            ez1Var.c.execute(new ty1(ez1Var, ez1.w(lz9Var2), hieVar2, kz9Var, ob0Var3, Collections.singletonList(zwg.X), 0));
                            return;
                        }
                        return;
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e);
                    }
                }
                return;
            case 3:
                r8c r8cVar = (r8c) this.b;
                if (r8cVar.c() == null) {
                    return;
                }
                r8cVar.H((s8c) r8cVar.f, r8cVar.g);
                r8cVar.q();
                return;
            case 4:
                Iterator it = ((gie) this.b).l.iterator();
                while (it.hasNext()) {
                    ((fie) it.next()).a(hieVar);
                }
                return;
            default:
                ((s1h) this.b).N();
                return;
        }
    }
}
