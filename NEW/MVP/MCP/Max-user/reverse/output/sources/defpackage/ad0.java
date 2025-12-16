package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final /* synthetic */ class ad0 implements gu3, yu, pa8, oa8, w2f, jy8, uy8, fu3, uu6, v5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ad0(int i, zjd zjdVar, int i2) {
        this.a = i2;
        this.b = i;
        this.c = zjdVar;
    }

    @Override // defpackage.uu6
    public void a(vu6 vu6Var, tu6 tu6Var, long j) {
        f7a f7aVar = (f7a) this.c;
        int i = this.b;
        ah4.a();
        ir4 ir4Var = f7aVar.p;
        ir4Var.getClass();
        gf3 gf3Var = f7aVar.b;
        synchronized (ir4Var) {
            try {
                hsi.g(zxg.k(ir4Var.f, i));
                hr4 hr4Var = (hr4) ir4Var.f.get(i);
                int i2 = 1;
                hsi.g(!hr4Var.b);
                gf3 gf3Var2 = gf3.h;
                if (ir4Var.l == null) {
                    ir4Var.l = gf3Var;
                }
                hsi.f("Mixing different ColorInfos is not supported.", ir4Var.l.equals(gf3Var));
                h9g h9gVar = new h9g(tu6Var, j);
                ir4Var.k.getClass();
                hr4Var.a.add(new gr4(vu6Var, h9gVar, new slf()));
                if (i == ir4Var.o) {
                    ir4Var.d();
                } else {
                    ir4Var.e(hr4Var);
                }
                ir4Var.e.g(new er4(ir4Var, i2), true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        b38 b38Var;
        b38 b38Var2;
        int i = this.a;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Drawable drawable = (Drawable) obj;
                drawable.setBounds(0, 0, i2, i2);
                drawable.draw((Canvas) obj2);
                break;
            case 6:
                yn8 yn8Var = (yn8) obj2;
                eo8 eo8Var = (eo8) obj;
                yn8Var.f.put(Integer.valueOf(i2), eo8Var);
                yn8Var.a.j(eo8Var);
                break;
            default:
                u69 u69Var = (u69) obj2;
                try {
                    try {
                        b38Var2 = (b38) ((ha8) obj).get();
                        hsi.e(b38Var2, "LibraryResult must not be null");
                    } catch (InterruptedException e) {
                        e = e;
                        a8i.m("MediaSessionStub", "Library operation failed", e);
                        String str = b38.g;
                        mie mieVar = new mie("no error message provided", -1, Bundle.EMPTY);
                        b38Var = new b38(mieVar.a, SystemClock.elapsedRealtime(), null, mieVar, null, 4);
                        b38Var2 = b38Var;
                        t69 t69Var = u69Var.d;
                        hsi.h(t69Var);
                        t69Var.e(i2, b38Var2);
                        return;
                    } catch (CancellationException e2) {
                        a8i.m("MediaSessionStub", "Library operation cancelled", e2);
                        String str2 = b38.g;
                        mie mieVar2 = new mie("no error message provided", 1, Bundle.EMPTY);
                        b38Var = new b38(mieVar2.a, SystemClock.elapsedRealtime(), null, mieVar2, null, 4);
                        b38Var2 = b38Var;
                        t69 t69Var2 = u69Var.d;
                        hsi.h(t69Var2);
                        t69Var2.e(i2, b38Var2);
                        return;
                    } catch (ExecutionException e3) {
                        e = e3;
                        a8i.m("MediaSessionStub", "Library operation failed", e);
                        String str3 = b38.g;
                        mie mieVar3 = new mie("no error message provided", -1, Bundle.EMPTY);
                        b38Var = new b38(mieVar3.a, SystemClock.elapsedRealtime(), null, mieVar3, null, 4);
                        b38Var2 = b38Var;
                        t69 t69Var22 = u69Var.d;
                        hsi.h(t69Var22);
                        t69Var22.e(i2, b38Var2);
                        return;
                    }
                    t69 t69Var222 = u69Var.d;
                    hsi.h(t69Var222);
                    t69Var222.e(i2, b38Var2);
                } catch (RemoteException e4) {
                    a8i.m("MediaSessionStub", "Failed to send result to browser " + u69Var, e4);
                }
        }
    }

    @Override // defpackage.yu
    public ha8 apply(Object obj) {
        sz1 sz1Var = (sz1) this.c;
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        if (w30.h(this.b, totalCaptureResult)) {
            sz1Var.g = sz1.k;
        }
        return sz1Var.i.a(totalCaptureResult);
    }

    @Override // defpackage.uy8
    public void c(ly8 ly8Var) {
        switch (this.a) {
            case 8:
                wg7 wg7Var = (wg7) this.c;
                if (ly8Var.isConnected()) {
                    zjd zjdVar = ly8Var.s;
                    zjd zjdVar2 = ly8Var.t;
                    ly8Var.r = wg7.j(wg7Var);
                    zjd zjdVarX = ly8.X(wg7Var, ly8Var.q, ly8Var.u, ly8Var.x, ly8Var.D);
                    ly8Var.s = zjdVarX;
                    ly8Var.t = ly8.W(zjdVarX, ly8Var.q, ly8Var.D, ly8Var.u, ly8Var.x);
                    boolean zEquals = ly8Var.s.equals(zjdVar);
                    ly8Var.t.equals(zjdVar2);
                    px8 px8Var = ly8Var.a;
                    px8Var.getClass();
                    hsi.g(Looper.myLooper() == px8Var.o.getLooper());
                    nx8 nx8Var = px8Var.d;
                    nx8Var.getClass();
                    bg7 bg7VarC = a6a.c(new yie(-6));
                    if (!zEquals) {
                        nx8Var.z();
                    }
                    bg7VarC.d(new mn1(ly8Var, bg7VarC, this.b, 14), dx4.a);
                    break;
                }
                break;
            case 9:
                List list = (List) this.c;
                if (ly8Var.isConnected()) {
                    zjd zjdVar3 = ly8Var.s;
                    zjd zjdVar4 = ly8Var.t;
                    ly8Var.q = wg7.j(list);
                    zjd zjdVarX2 = ly8.X(ly8Var.r, list, ly8Var.u, ly8Var.x, ly8Var.D);
                    ly8Var.s = zjdVarX2;
                    ly8Var.t = ly8.W(zjdVarX2, list, ly8Var.D, ly8Var.u, ly8Var.x);
                    boolean zEquals2 = ly8Var.s.equals(zjdVar3);
                    ly8Var.t.equals(zjdVar4);
                    px8 px8Var2 = ly8Var.a;
                    px8Var2.getClass();
                    hsi.g(Looper.myLooper() == px8Var2.o.getLooper());
                    nx8 nx8Var2 = px8Var2.d;
                    nx8Var2.getClass();
                    bg7 bg7VarC2 = a6a.c(new yie(-6));
                    if (!zEquals2) {
                        nx8Var2.z();
                    }
                    bg7VarC2.d(new mn1(ly8Var, bg7VarC2, this.b, 14), dx4.a);
                    break;
                }
                break;
            default:
                aie aieVar = (aie) this.c;
                px8 px8Var3 = ly8Var.a;
                if (ly8Var.isConnected()) {
                    px8Var3.getClass();
                    hsi.g(Looper.myLooper() == px8Var3.o.getLooper());
                    bg7 bg7VarI = px8Var3.d.I(aieVar);
                    bg7VarI.d(new mn1(ly8Var, bg7VarI, this.b, 14), dx4.a);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.jy8
    public void d(eb7 eb7Var, int i) {
        ly8 ly8Var = (ly8) this.c;
        eb7Var.y(ly8Var.c, i, this.b);
    }

    @Override // defpackage.v5
    public boolean h(View view) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
        int i = SideSheetBehavior.x;
        sideSheetBehavior.x(this.b);
        return true;
    }

    @Override // defpackage.w2f
    public void i(i2f i2fVar) {
        i2fVar.a(eo8.b((Context) this.c, this.b));
    }

    @Override // defpackage.pa8, defpackage.oa8
    public void invoke(Object obj) {
        switch (this.a) {
            case 2:
                ((r3c) obj).n0(((a3c) this.c).a, this.b);
                break;
            case 3:
                ((r3c) obj).G0((k09) this.c, this.b);
                break;
            default:
                ((q3c) obj).A((i09) this.c, this.b);
                break;
        }
    }

    public /* synthetic */ ad0(int i, aie aieVar, Bundle bundle) {
        this.a = 10;
        this.b = i;
        this.c = aieVar;
    }

    public /* synthetic */ ad0(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
