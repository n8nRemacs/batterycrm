package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import one.me.geo.view.OneMeSupportMapFragment;
import ru.ok.messages.location.FrgLocationMap;
import ru.ok.messages.location.TamOneMeSupportMapFragment;

/* loaded from: classes2.dex */
public final class laa extends i3 implements mf8 {
    public final of8 X;
    public final xzf Y;
    public final te8 Z;
    public final ConcurrentHashMap c;
    public final ConcurrentHashMap d;
    public final zl3 o;
    public final z7c s0;
    public final FrgLocationMap t0;
    public kf8 u0;
    public cf8 v0;
    public kp8 w0;
    public boolean x0;
    public final lqc y0;

    public laa(kf8 kf8Var, qn8 qn8Var, cf8 cf8Var, boolean z, final fba fbaVar, of8 of8Var, xzf xzfVar, kp8 kp8Var, FrgLocationMap frgLocationMap, te8 te8Var, m0g m0gVar, z7c z7cVar) {
        super(0, fbaVar);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.c = concurrentHashMap;
        this.d = new ConcurrentHashMap();
        zl3 zl3Var = new zl3();
        this.o = zl3Var;
        this.u0 = kf8Var;
        this.v0 = cf8Var;
        this.x0 = z;
        this.X = of8Var;
        this.Y = xzfVar;
        jp8 jp8Var = new jp8(cf8.Y);
        jp8Var.i = true;
        this.w0 = new kp8(jp8Var);
        this.t0 = frgLocationMap;
        this.Z = te8Var;
        this.s0 = z7cVar;
        if (kp8Var != null) {
            concurrentHashMap.put(Long.valueOf(kp8Var.c), kp8Var);
        }
        fbaVar.p(this);
        fbaVar.G0 = qn8Var;
        final TamOneMeSupportMapFragment tamOneMeSupportMapFragment = fbaVar.y0;
        if (tamOneMeSupportMapFragment != null) {
            final String str = fbaVar.K0;
            tamOneMeSupportMapFragment.n1 = str;
            pva pvaVar = new pva() { // from class: ydb
                @Override // defpackage.pva
                public final void R(iw6 iw6Var) {
                    OneMeSupportMapFragment oneMeSupportMapFragment = tamOneMeSupportMapFragment;
                    oneMeSupportMapFragment.m1 = iw6Var;
                    iw6Var.h();
                    iw6Var.i();
                    iw6Var.p();
                    String str2 = str;
                    if (str2 != null && str2.length() != 0) {
                        o8g o8gVar = new o8g();
                        o8gVar.c = Float.MAX_VALUE;
                        o8gVar.b(oq5.a);
                        o8gVar.b = true;
                        iw6Var.b(o8gVar);
                        oneMeSupportMapFragment.s0(a93.s0.x(oneMeSupportMapFragment.k0()).k());
                    }
                    try {
                        pni pniVar = iw6Var.a;
                        Parcel parcelT = pniVar.T();
                        parcelT.writeInt(0);
                        parcelT.writeInt(0);
                        parcelT.writeInt(0);
                        parcelT.writeInt(0);
                        pniVar.V(parcelT, 39);
                        fbaVar.R(iw6Var);
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    }
                }
            };
            if (Looper.getMainLooper() != Looper.myLooper()) {
                throw new IllegalStateException("getMapAsync must be called on the main thread.");
            }
            idi idiVar = tamOneMeSupportMapFragment.i1;
            y38 y38Var = (y38) idiVar.a;
            if (y38Var != null) {
                ((nei) y38Var).b(pvaVar);
            } else {
                idiVar.g.add(pvaVar);
            }
        }
        S0();
        N0();
        Q0();
        lqc lqcVar = new lqc();
        this.y0 = lqcVar;
        yqa yqaVarG = lqcVar.l(((n0g) m0gVar).a()).g(new p89(24));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        j0e j0eVarA = u0e.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(j0eVarA, "scheduler is null");
        ssa ssaVarL = new ora(new jta(yqaVarG, 500L, timeUnit, j0eVarA), new jaa(this, 0), 2).l(de.a());
        v08 v08Var = new v08(new jaa(this, 1), new p89(25), pdf.d);
        ssaVarL.a(v08Var);
        zl3Var.a(v08Var);
    }

    @Override // defpackage.mf8
    public final void E() {
    }

    public final void L0(int i) {
        this.s0.c.g(i, "app.location.map.type");
        fba fbaVar = (fba) ((oaa) this.b);
        yn8 yn8Var = fbaVar.F0;
        if (yn8Var == null || yn8Var.a.e() == i) {
            return;
        }
        fbaVar.F0.a.k(i);
    }

    public final void M0(ju3 ju3Var) {
        kf8 kf8Var = this.u0;
        kf8Var.getClass();
        jf8 jf8Var = new jf8();
        jf8Var.a = kf8Var.a;
        jf8Var.b = kf8Var.b;
        jf8Var.c = kf8Var.c;
        jf8Var.d = kf8Var.d;
        jf8Var.e = kf8Var.e;
        jf8Var.f = kf8Var.f;
        jf8Var.g = kf8Var.g;
        jf8Var.h = kf8Var.h;
        jf8Var.i = kf8Var.i;
        jf8Var.j = kf8Var.j;
        jf8Var.k = kf8Var.k;
        jf8Var.l = kf8Var.l;
        jf8Var.m = kf8Var.m;
        jf8Var.n = kf8Var.n;
        jf8Var.o = kf8Var.o;
        ju3Var.accept(jf8Var);
        this.u0 = new kf8(jf8Var);
    }

    public final void N0() {
        jaa jaaVar = new jaa(this, 2);
        of8 of8Var = this.X;
        Context context = of8Var.d;
        if (lfi.b(context, lfi.b)) {
            ew6 ew6Var = (ew6) of8Var.X.get();
            a3b a3bVar = new a3b(23, jaaVar);
            ew6Var.getClass();
            ew6.a(context, a3bVar);
            return;
        }
        try {
            jaaVar.accept(Boolean.FALSE);
        } catch (Throwable th) {
            wqi.e("of8", "isServiceAvailable", th);
        }
    }

    public final void O0() {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            this.y0.f((kp8) it.next());
        }
        if (this.u0.b == 2) {
            jp8 jp8VarA = this.w0.a();
            jp8VarA.i = true;
            kp8 kp8Var = new kp8(jp8VarA);
            this.w0 = kp8Var;
            this.y0.f(kp8Var);
            Q0();
        }
    }

    @Override // defpackage.mf8
    public final void P(cf8 cf8Var) {
        Float fValueOf = Float.valueOf(0.0f);
        oaa oaaVar = (oaa) this.b;
        if (!this.v0.a()) {
            fba fbaVar = (fba) oaaVar;
            yn8 yn8Var = fbaVar.F0;
            if (yn8Var != null) {
                yn8Var.g((Context) fbaVar.b, true);
            }
            if (this.u0.b != 1) {
                double d = cf8Var.a;
                double d2 = cf8Var.b;
                yn8 yn8Var2 = fbaVar.F0;
                if (yn8Var2 != null) {
                    yn8Var2.d(d, d2, Float.valueOf(14.0f), fValueOf, fValueOf);
                }
            }
        }
        if (this.u0.b != 1 && this.x0 && this.v0.a()) {
            ((fba) oaaVar).A(cf8Var.a, cf8Var.b, false);
        }
        if (this.u0.b == 2 && this.x0) {
            jp8 jp8VarA = this.w0.a();
            jp8VarA.a = cf8Var;
            this.w0 = new kp8(jp8VarA);
        }
        double d3 = cf8Var.a;
        double d4 = cf8Var.b;
        cf8 cf8Var2 = this.v0;
        if (!this.Y.c(d3, d4, cf8Var2.a, cf8Var2.b)) {
            O0();
        }
        this.v0 = cf8Var;
        if (this.w0.a.a()) {
            return;
        }
        double[] dArrB = ((fba) oaaVar).B();
        jp8 jp8VarA2 = this.w0.a();
        jp8VarA2.a = new cf8(dArrB[0], dArrB[1]);
        this.w0 = new kp8(jp8VarA2);
        if (this.u0.b == 2) {
            O0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P0() {
        /*
            Method dump skipped, instructions count: 1079
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.laa.P0():void");
    }

    public final void Q0() {
        fba fbaVar = (fba) ((oaa) this.b);
        kp8 kp8Var = this.w0;
        hba hbaVar = fbaVar.E0;
        if (hbaVar == null) {
            return;
        }
        Context context = (Context) hbaVar.b;
        kf8 kf8Var = hbaVar.s0;
        if (kf8Var == null || kf8Var.b != 2) {
            return;
        }
        boolean z = kp8Var.i;
        String str = kp8Var.f;
        if (z) {
            hbaVar.Z.setSubtitle(context.getString(mvd.m0));
        } else if (l8g.c(str)) {
            hbaVar.Z.setSubtitle(context.getString(mvd.f2));
        } else {
            hbaVar.Z.setSubtitle(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R0(long r18) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.laa.R0(long):void");
    }

    public final void S0() {
        fba fbaVar = (fba) ((oaa) this.b);
        kf8 kf8Var = this.u0;
        kf8 kf8Var2 = fbaVar.J0;
        fbaVar.J0 = kf8Var;
        zg zgVar = fbaVar.s0;
        if (zgVar.a()) {
            big bigVar = new big();
            bigVar.R(new v72());
            bigVar.I(200L);
            bigVar.Z = shg.o(bigVar.Z, q0d.layout_contact_location__rv_markers);
            bigVar.p(q0d.frg_location_map__top_no_permission_panel_anchor);
            if (kf8Var2 == null) {
                i4f i4fVar = new i4f();
                i4fVar.S0 = i4f.V0;
                i4fVar.H0 = new uha(10);
                bigVar.R(i4fVar);
            } else {
                bigVar.R(new sp5());
            }
            zhg.b((ViewGroup) ((View) fbaVar.c));
            zhg.a((ViewGroup) ((View) fbaVar.c), bigVar);
        }
        kf8 kf8Var3 = fbaVar.J0;
        int i = kf8Var3.b;
        int i2 = i == 0 ? -1 : hk0.$EnumSwitchMapping$0[az1.v(i)];
        if (i2 == 1) {
            View view = (View) fbaVar.E0.c;
            if (view != null) {
                view.setVisibility(8);
            }
            fbaVar.B0.setVisibility(8);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            hba hbaVar = fbaVar.E0;
            if (((View) hbaVar.c) == null) {
                int i3 = hba.t0;
                ViewStub viewStub = fbaVar.D0;
                viewStub.setLayoutResource(i3);
                hbaVar.c = viewStub.inflate();
                hbaVar.i();
                fbaVar.E0.p(fbaVar);
            }
            ((View) fbaVar.E0.c).setVisibility(0);
            hba hbaVar2 = fbaVar.E0;
            hbaVar2.s0 = kf8Var3;
            if (az1.v(kf8Var3.b) == 1) {
                hbaVar2.o.setVisibility(8);
                hbaVar2.Z.setTitle(((Context) hbaVar2.b).getString(hbaVar2.d ? mvd.Q1 : mvd.E1));
            }
            fbaVar.B0.setVisibility(0);
        }
        zgVar.a();
    }
}
