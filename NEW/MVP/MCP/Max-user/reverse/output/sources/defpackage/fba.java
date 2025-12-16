package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.c;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.LinkedHashMap;
import java.util.Map;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.location.TamOneMeSupportMapFragment;

/* loaded from: classes2.dex */
public final class fba extends j3 implements pva, xdg, m7g, oaa {
    public static final /* synthetic */ int L0 = 0;
    public SimpleDraweeView A0;
    public Group B0;
    public v9a C0;
    public ViewStub D0;
    public hba E0;
    public yn8 F0;
    public qn8 G0;
    public rw4 H0;
    public ValueAnimator I0;
    public kf8 J0;
    public final String K0;
    public final dd X;
    public final c Y;
    public final long Z;
    public final qv3 d;
    public final do8 o;
    public final zg s0;
    public final z7c t0;
    public final j0e u0;
    public final boolean v0;
    public final alf w0;
    public final zl3 x0;
    public TamOneMeSupportMapFragment y0;
    public AppCompatImageView z0;

    public fba(Context context, ViewGroup viewGroup, f7b f7bVar, qv3 qv3Var, do8 do8Var, dd ddVar, c cVar, long j, zg zgVar, z7c z7cVar, j0e j0eVar, lv4 lv4Var, boolean z, alf alfVar) {
        super(context);
        this.d = qv3Var;
        this.o = do8Var;
        this.X = ddVar;
        this.Y = cVar;
        this.Z = j;
        this.s0 = zgVar;
        this.t0 = z7cVar;
        this.u0 = j0eVar;
        this.v0 = z;
        this.w0 = alfVar;
        this.x0 = new zl3();
        t86 t86VarN = z7cVar.b.n();
        this.K0 = t86VarN != null ? (String) t86VarN.a : null;
        this.c = LayoutInflater.from((Context) this.b).inflate(n1d.frg_location_map, viewGroup, false);
        i();
    }

    public final void A(double d, double d2, boolean z) {
        if (this.F0 == null) {
            return;
        }
        if (z) {
            double[] dArrB = B();
            if (this.B0.getVisibility() == 0 && Math.abs(dArrB[0] - d) <= 0.001d && Math.abs(dArrB[1] - d2) <= 0.001d) {
                D();
            }
        }
        yn8 yn8Var = this.F0;
        yn8Var.getClass();
        yn8Var.e(yxi.b(new LatLng(d, d2)), true);
    }

    public final double[] B() {
        yn8 yn8Var = this.F0;
        if (yn8Var == null) {
            return new double[]{1.401298464324817E-45d, 1.401298464324817E-45d};
        }
        LatLng latLng = yn8Var.a.d().a;
        return new double[]{latLng.a, latLng.b};
    }

    public final qn8 C() {
        yn8 yn8Var = this.F0;
        if (yn8Var == null) {
            return null;
        }
        iw6 iw6Var = yn8Var.a;
        CameraPosition cameraPositionD = iw6Var.d();
        LatLng latLng = cameraPositionD.a;
        zgi zgiVar = (zgi) iw6Var.f().b;
        try {
            Parcel parcelS = zgiVar.S(zgiVar.T(), 9);
            int i = mgi.a;
            boolean z = parcelS.readInt() != 0;
            parcelS.recycle();
            try {
                Parcel parcelS2 = zgiVar.S(zgiVar.T(), 13);
                boolean z2 = parcelS2.readInt() != 0;
                parcelS2.recycle();
                qn8 qn8Var = new qn8();
                qn8Var.a = latLng.a;
                qn8Var.b = latLng.b;
                qn8Var.c = z;
                qn8Var.d = z2;
                try {
                    pni pniVar = iw6Var.a;
                    Parcel parcelS3 = pniVar.S(pniVar.T(), 21);
                    boolean z3 = parcelS3.readInt() != 0;
                    parcelS3.recycle();
                    qn8Var.e = z3;
                    qn8Var.f = iw6Var.e();
                    qn8Var.g = cameraPositionD.b;
                    qn8Var.h = cameraPositionD.c;
                    qn8Var.i = cameraPositionD.d;
                    return new qn8(qn8Var);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        } catch (RemoteException e3) {
            throw new RuntimeRemoteException(e3);
        }
    }

    public final void D() {
        ValueAnimator valueAnimator = this.I0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -this.H0.l);
        valueAnimatorOfFloat.setInterpolator(this.s0.a.f());
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.setRepeatCount(1);
        valueAnimatorOfFloat.addUpdateListener(new q00(4, this));
        this.I0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public final void E(SimpleDraweeView simpleDraweeView) {
        t86 t86VarN = this.t0.b.n();
        String str = null;
        String str2 = t86VarN != null ? (String) t86VarN.a : null;
        if (str2 == null || vmf.F(str2)) {
            simpleDraweeView.setVisibility(8);
            return;
        }
        if (a93.s0.x(simpleDraweeView.getContext()).l()) {
            if (t86VarN != null) {
                str = (String) t86VarN.e;
            }
        } else if (t86VarN != null) {
            str = (String) t86VarN.d;
        }
        if (str == null || vmf.F(str)) {
            simpleDraweeView.setVisibility(8);
            return;
        }
        c2c c2cVarA = zk6.a.a();
        if (str.isEmpty()) {
            c2cVarA.b = rf7.b(str);
        } else {
            c2cVarA.c(Uri.parse(str));
        }
        c2cVarA.i = simpleDraweeView.getController();
        simpleDraweeView.setController(c2cVarA.a());
        simpleDraweeView.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    @Override // defpackage.pva
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(defpackage.iw6 r11) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fba.R(iw6):void");
    }

    @Override // defpackage.m7g
    public final void b() {
        if (((View) this.c) == null) {
            return;
        }
        yeb yebVarK = a93.s0.x((Context) this.b).k();
        ((View) this.c).setBackgroundColor(yebVarK.b().h);
        this.z0.setImageTintList(ColorStateList.valueOf(yebVarK.getIcon().k));
        SimpleDraweeView simpleDraweeView = this.A0;
        if (simpleDraweeView != null) {
            E(simpleDraweeView);
        }
    }

    @Override // defpackage.j3
    public final void i() {
        Context context = (Context) this.b;
        ViewGroup viewGroup = (ViewGroup) ((View) this.c);
        View yfbVar = new yfb(viewGroup.getContext(), 4);
        yfbVar.setId(q0d.frg_location_map__toolbar);
        yfbVar.setLayoutParams(new kt3(-1, -2));
        kt3 kt3Var = (kt3) yfbVar.getLayoutParams();
        kt3Var.i = 0;
        kt3Var.t = 0;
        kt3Var.v = 0;
        yfbVar.setLayoutParams(kt3Var);
        viewGroup.addView(yfbVar);
        ((View) this.c).getContext();
        this.H0 = rw4.a();
        yfb yfbVar2 = (yfb) ((View) this.c).findViewById(q0d.frg_location_map__toolbar);
        yfbVar2.setTitle(mvd.T1);
        yfbVar2.setForm(qfb.a);
        yfbVar2.setLeftActions(new hfb(new k(13, this)));
        this.y0 = (TamOneMeSupportMapFragment) this.Y.C(q0d.frg_location_map__map);
        this.z0 = (AppCompatImageView) ((View) this.c).findViewById(q0d.frg_location_map__marker_head);
        this.B0 = (Group) ((View) this.c).findViewById(q0d.frg_location_map__marker_group);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ((View) this.c).findViewById(q0d.frg_location_map__maps_logo);
        this.A0 = simpleDraweeView;
        if (simpleDraweeView != null) {
            E(simpleDraweeView);
        }
        OneMeButton oneMeButton = (OneMeButton) ((View) this.c).findViewById(q0d.frg_location_map__current_location_fab);
        jza jzaVar = jza.c;
        oneMeButton.setSize(jzaVar);
        iza izaVar = iza.a;
        oneMeButton.setMode(izaVar);
        gza gzaVar = gza.a;
        oneMeButton.setAppearance(gzaVar);
        oneMeButton.d(Integer.valueOf(yud.t0));
        OneMeButton oneMeButton2 = (OneMeButton) ((View) this.c).findViewById(q0d.frg_location_map__layer_fab);
        oneMeButton2.setSize(jzaVar);
        oneMeButton2.setMode(izaVar);
        oneMeButton2.setAppearance(gzaVar);
        oneMeButton2.d(Integer.valueOf(ivd.b0));
        final int i = 0;
        cm6 cm6Var = new cm6(this) { // from class: fk0
            public final /* synthetic */ fba b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        fba fbaVar = this.b;
                        fbaVar.X.e("LOCATION_MAP_TYPE_NORMAL");
                        fbaVar.j(new dk0(8));
                        break;
                    case 1:
                        fba fbaVar2 = this.b;
                        fbaVar2.X.e("LOCATION_MAP_TYPE_SATELLITE");
                        fbaVar2.j(new dk0(7));
                        break;
                    default:
                        fba fbaVar3 = this.b;
                        fbaVar3.X.e("LOCATION_MAP_TYPE_HYBRID");
                        fbaVar3.j(new dk0(1));
                        break;
                }
                return qqg.a;
            }
        };
        final int i2 = 1;
        cm6 cm6Var2 = new cm6(this) { // from class: fk0
            public final /* synthetic */ fba b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        fba fbaVar = this.b;
                        fbaVar.X.e("LOCATION_MAP_TYPE_NORMAL");
                        fbaVar.j(new dk0(8));
                        break;
                    case 1:
                        fba fbaVar2 = this.b;
                        fbaVar2.X.e("LOCATION_MAP_TYPE_SATELLITE");
                        fbaVar2.j(new dk0(7));
                        break;
                    default:
                        fba fbaVar3 = this.b;
                        fbaVar3.X.e("LOCATION_MAP_TYPE_HYBRID");
                        fbaVar3.j(new dk0(1));
                        break;
                }
                return qqg.a;
            }
        };
        final int i3 = 2;
        cm6 cm6Var3 = new cm6(this) { // from class: fk0
            public final /* synthetic */ fba b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        fba fbaVar = this.b;
                        fbaVar.X.e("LOCATION_MAP_TYPE_NORMAL");
                        fbaVar.j(new dk0(8));
                        break;
                    case 1:
                        fba fbaVar2 = this.b;
                        fbaVar2.X.e("LOCATION_MAP_TYPE_SATELLITE");
                        fbaVar2.j(new dk0(7));
                        break;
                    default:
                        fba fbaVar3 = this.b;
                        fbaVar3.X.e("LOCATION_MAP_TYPE_HYBRID");
                        fbaVar3.j(new dk0(1));
                        break;
                }
                return qqg.a;
            }
        };
        e18 e18Var = new e18(context, kti.d(240 * vw4.d().getDisplayMetrics().density));
        e18Var.c = false;
        e18Var.a.a(ve3.j(new a44(new n5g(mvd.p0), null, cm6Var, 14), new a44(new n5g(mvd.q0), null, cm6Var2, 14), new a44(new n5g(mvd.o0), null, cm6Var3, 14)), new qk(8, e18Var));
        this.C0 = new v9a(new raa(context, this.d, (ViewStub) ((View) this.c).findViewById(q0d.frg_location_map__contact_location)), new ip8(this.Z, 0), this);
        this.D0 = (ViewStub) ((View) this.c).findViewById(q0d.frg_location_map__send_location);
        this.E0 = new hba(context, this.v0);
        TamOneMeSupportMapFragment tamOneMeSupportMapFragment = this.y0;
        if (tamOneMeSupportMapFragment == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ydg ydgVar = tamOneMeSupportMapFragment.p1;
        if (ydgVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ydgVar.setListener(this);
        u8j.a(oneMeButton, new gk0(0, this));
        this.w0.getClass();
    }

    public final void z(final long j, final boolean z) {
        wk3 wk3Var;
        final yn8 yn8Var = this.F0;
        if (yn8Var == null) {
            return;
        }
        Context context = (Context) this.b;
        final long j2 = yn8Var.j;
        yn8Var.j = j;
        bwd.b(yn8Var.k);
        do8 do8Var = yn8Var.b;
        synchronized (do8Var) {
            wk3Var = new wk3(2, new dq4(context, 11, do8Var));
        }
        u2f u2fVarI = wk3Var.m(yn8Var.c).i(de.a());
        qu1 qu1Var = new qu1(new gu3() { // from class: wn8
            @Override // defpackage.gu3
            public final void accept(Object obj) {
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = yn8Var.e;
                xn8 xn8Var = (xn8) linkedHashMap.get(Long.valueOf(j2));
                boolean z2 = z;
                if (xn8Var != null) {
                    hp8 hp8Var = xn8Var.b;
                    if (z2) {
                        hp8Var.b((xo0) map.get(co8.a));
                    } else {
                        hp8Var.b((xo0) map.get(co8.c));
                    }
                    hp8Var.d();
                }
                xn8 xn8Var2 = (xn8) linkedHashMap.get(Long.valueOf(j));
                if (xn8Var2 != null) {
                    hp8 hp8Var2 = xn8Var2.b;
                    if (z2) {
                        hp8Var2.b((xo0) map.get(co8.b));
                    } else {
                        hp8Var2.b((xo0) map.get(co8.d));
                    }
                    hp8Var2.d();
                }
            }
        }, 2, new zb8(18));
        u2fVarI.k(qu1Var);
        yn8Var.k = qu1Var;
    }
}
