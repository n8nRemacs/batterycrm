package ru.ok.messages.location;

import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import defpackage.alf;
import defpackage.aw6;
import defpackage.bwd;
import defpackage.cf8;
import defpackage.dd;
import defpackage.dj6;
import defpackage.do8;
import defpackage.efi;
import defpackage.ew6;
import defpackage.f1e;
import defpackage.f7b;
import defpackage.fba;
import defpackage.fvd;
import defpackage.gda;
import defpackage.jf8;
import defpackage.jp8;
import defpackage.kf8;
import defpackage.kp8;
import defpackage.ku3;
import defpackage.laa;
import defpackage.lf8;
import defpackage.lfi;
import defpackage.lv4;
import defpackage.m0g;
import defpackage.mvd;
import defpackage.n0g;
import defpackage.np8;
import defpackage.oaa;
import defpackage.of8;
import defpackage.ol6;
import defpackage.pb2;
import defpackage.q0d;
import defpackage.qm3;
import defpackage.qmb;
import defpackage.qn8;
import defpackage.qv3;
import defpackage.rn8;
import defpackage.t1b;
import defpackage.te8;
import defpackage.ti6;
import defpackage.ty4;
import defpackage.ue0;
import defpackage.v08;
import defpackage.wqi;
import defpackage.xn8;
import defpackage.xzf;
import defpackage.yi5;
import defpackage.yn8;
import defpackage.z7c;
import defpackage.zg;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import org.apache.http.HttpStatus;
import ru.ok.messages.views.fragments.base.FrgBase;

/* loaded from: classes2.dex */
public class FrgLocationMap extends FrgBase implements ol6 {
    public int A1;
    public boolean B1;
    public dj6 u1;
    public laa v1;
    public te8 w1;
    public xzf x1;
    public kf8 y1;
    public long z1;

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final void A0(int i, String[] strArr, int[] iArr) {
        Context contextV;
        Context contextV2;
        if (i == 169 || i == 175) {
            te8 te8Var = this.w1;
            te8Var.getClass();
            FrgLocationMap frgLocationMap = (FrgLocationMap) te8Var.b;
            if (i == 169) {
                if (!lfi.e(frgLocationMap, strArr, iArr, lfi.b, mvd.f1) || (contextV2 = frgLocationMap.v()) == null) {
                    return;
                }
                te8Var.u().getClass();
                ew6.a(contextV2, te8Var);
                return;
            }
            if (i != 175 || Build.VERSION.SDK_INT < 29 || !lfi.e(frgLocationMap, strArr, iArr, lfi.c, mvd.X0) || (contextV = frgLocationMap.v()) == null) {
                return;
            }
            te8Var.u().getClass();
            ew6.a(contextV, te8Var);
        }
    }

    public final void B0(kp8 kp8Var) throws UnsupportedEncodingException {
        Context contextV = v();
        if (contextV == null) {
            return;
        }
        cf8 cf8Var = kp8Var.a;
        double d = cf8Var.a;
        double d2 = cf8Var.b;
        String str = kp8Var.e;
        ((aw6) ((t1b) ((qm3) this.l1.b)).getAccessor().c(103)).getClass();
        String str2 = "https://maps.google.com/maps?f=d&daddr=" + d + "," + d2;
        if (str != null && str.length() != 0) {
            try {
                str2 = str2 + " (" + URLEncoder.encode(str, "utf-8") + ")";
            } catch (UnsupportedEncodingException e) {
                wqi.e(aw6.class.getName(), "Can't encode name ".concat(str), e);
            }
        }
        try {
            contextV.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
        } catch (ActivityNotFoundException e2) {
            wqi.e("tmi", "openDirections: ", e2);
            int i = mvd.a;
            efi.r(contextV, contextV.getString(mvd.I0), 0);
        }
        this.m1.a().e("LOCATION_MAP_DIRECTION_CLICK");
    }

    @Override // androidx.fragment.app.a
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long j;
        String str;
        Context context;
        of8 of8Var;
        cf8 cf8Var;
        String strE;
        kp8 kp8Var;
        rn8 rn8Var;
        lf8 lf8Var;
        Context contextV = v();
        c cVar = this.D0;
        if (contextV == null || cVar == null || this.X == null) {
            wqi.e("ru.ok.messages.location.FrgLocationMap", "Context or fragmentManager is null", null);
            return null;
        }
        yi5 yi5Var = (yi5) this.m1.getAccessor().c(9);
        te8 te8Var = new te8();
        te8Var.a = yi5Var;
        te8Var.b = this;
        this.w1 = te8Var;
        f7b f7bVar = (f7b) this.m1.getAccessor().c(HttpStatus.SC_GONE);
        qv3 qv3VarD = this.m1.d();
        do8 do8Var = (do8) ((t1b) ((qm3) this.l1.b)).getAccessor().c(639);
        dd ddVarA = this.m1.a();
        of8 of8Var2 = (of8) this.m1.getAccessor().c(HttpStatus.SC_EXPECTATION_FAILED);
        this.x1 = (xzf) this.m1.getAccessor().c(91);
        this.m1.h().a.s();
        int i = fvd.K;
        y(i);
        this.z1 = this.X.getLong("ru.ok.tamtam.extra.CHAT_ID");
        this.A1 = this.X.getInt("ru.ok.tamtam.extra.REQUEST_CODE");
        pb2 pb2VarM = this.m1.c().M(this.z1);
        if (pb2VarM == null) {
            wqi.e("ru.ok.messages.location.FrgLocationMap", "Chat is null", null);
            return null;
        }
        boolean zQ = pb2VarM.Q();
        Bundle bundle2 = this.X;
        cf8 cf8Var2 = cf8.Y;
        if (bundle2 == null) {
            str = "ru.ok.messages.location.FrgLocationMap";
            kp8Var = null;
            of8Var = of8Var2;
            cf8Var = cf8Var2;
            context = contextV;
            j = 0;
        } else {
            j = 0;
            long j2 = bundle2.getLong("ru.ok.tamtam.extra.MESSAGE_ID");
            long j3 = this.X.getLong("ru.ok.tamtam.extra.CONTACT_ID");
            cf8 cf8Var3 = (cf8) this.X.getSerializable("ru.ok.tamtam.extra.LOCATION");
            if (cf8Var3 == null) {
                cf8Var3 = cf8Var2;
            }
            boolean z = this.X.getBoolean("ru.ok.tamtam.extra.LIVE");
            str = "ru.ok.messages.location.FrgLocationMap";
            context = contextV;
            long j4 = this.X.getLong("ru.ok.tamtam.extra.DATE");
            of8Var = of8Var2;
            boolean z2 = this.X.getBoolean("ru.ok.tamtam.extra.ACTIVE");
            cf8Var = cf8Var2;
            String string = this.X.getString("ru.ok.tamtam.extra.DEVICE_ID");
            if (j2 == 0) {
                kp8Var = null;
            } else {
                if (j3 == this.m1.h().a.s()) {
                    strE = y(i);
                } else {
                    ku3 ku3VarI = qv3VarD.i(j3, false);
                    strE = ku3VarI != null ? ku3VarI.e() : null;
                }
                jp8 jp8Var = new jp8(cf8Var3);
                jp8Var.c = j2;
                jp8Var.b = j3;
                jp8Var.e = strE;
                jp8Var.h = z;
                jp8Var.j = j4;
                jp8Var.d = np8.c;
                jp8Var.k = z2;
                jp8Var.l = string;
                kp8Var = new kp8(jp8Var);
            }
        }
        this.B1 = kp8Var == null;
        kf8 kf8Var = (bundle == null || (lf8Var = (lf8) bundle.getParcelable("ru.ok.tamtam.extra.VIEW_STATE")) == null) ? null : lf8Var.a;
        if (kf8Var == null) {
            jf8 jf8Var = new jf8();
            if (kp8Var == null) {
                jf8Var.a = 2;
                jf8Var.b = 2;
                jf8Var.e = -1L;
            } else {
                jf8Var.a = 1;
                jf8Var.b = 1;
                jf8Var.e = kp8Var.c;
            }
            jf8Var.f = zQ;
            kf8Var = new kf8(jf8Var);
        }
        this.y1 = kf8Var;
        z7c z7cVarJ = ((t1b) ((qm3) this.l1.b)).j();
        int i2 = z7cVarJ.c.g.getInt("app.location.map.type", 1);
        qn8 qn8Var = (bundle == null || (rn8Var = (rn8) bundle.getParcelable("ru.ok.tamtam.extra.MAP_CONFIG")) == null) ? null : rn8Var.a;
        if (qn8Var == null) {
            if (kp8Var == null) {
                qn8 qn8Var2 = new qn8();
                qn8Var2.a = 1.401298464324817E-45d;
                qn8Var2.b = 1.401298464324817E-45d;
                qn8Var2.c = false;
                qn8Var2.d = true;
                qn8Var2.e = true;
                qn8Var2.f = i2;
                qn8Var2.g = 14.0f;
                qn8Var2.h = 0.0f;
                qn8Var2.i = 0.0f;
                qn8Var = new qn8(qn8Var2);
            } else {
                Bundle bundle3 = this.X;
                float f = bundle3 == null ? 14.0f : bundle3.getFloat("ru.ok.tamtam.extra.ZOOM", 14.0f);
                cf8 cf8Var4 = kp8Var.a;
                double d = cf8Var4.a;
                double d2 = cf8Var4.b;
                float f2 = f > 0.0f ? f : 14.0f;
                qn8 qn8Var3 = new qn8();
                qn8Var3.a = d;
                qn8Var3.b = d2;
                qn8Var3.c = false;
                qn8Var3.d = true;
                qn8Var3.e = true;
                qn8Var3.f = i2;
                qn8Var3.g = f2;
                qn8Var3.h = 0.0f;
                qn8Var3.i = 0.0f;
                qn8Var = new qn8(qn8Var3);
            }
        }
        cf8 cf8Var5 = bundle != null ? (cf8) bundle.getSerializable("ru.ok.tamtam.extra.LAST_LOCATION") : null;
        if (cf8Var5 == null) {
            cf8Var5 = cf8Var;
        }
        boolean z3 = bundle != null ? bundle.getBoolean("ru.ok.tamtam.extra.KEEP_CURRENT_LOCATION", true) : true;
        zg zgVarB = ((t1b) ((qm3) this.l1.b)).b();
        m0g m0gVar = (m0g) ((t1b) ((qm3) this.l1.b)).getAccessor().c(HttpStatus.SC_FORBIDDEN);
        lv4 lv4Var = (lv4) this.m1.getAccessor().c(35);
        long j5 = kp8Var == null ? j : kp8Var.c;
        c cVar2 = this.D0;
        m0gVar.getClass();
        fba fbaVar = new fba(context, viewGroup, f7bVar, qv3VarD, do8Var, ddVarA, cVar2, j5, zgVarB, z7cVarJ, ((n0g) m0gVar).a(), lv4Var, j0().getBoolean("ru.ok.tamtam.extra.REGULAR_SENDING", true), (alf) ((t1b) ((qm3) this.l1.b)).getAccessor().c(80));
        String str2 = str;
        this.v1 = new laa(this.y1, qn8Var, cf8Var5, z3, fbaVar, of8Var, this.x1, kp8Var, this, this.w1, m0gVar, this.m1.h());
        if (this.y1.a != 1 && bundle == null) {
            this.w1.E();
        }
        fbaVar.b();
        View view = (View) fbaVar.c;
        if (view != null) {
            return view;
        }
        wqi.e(str2, "Root view is null", null);
        return null;
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void P() {
        ti6 ti6VarZ;
        a aVarC;
        super.P();
        b bVarT = t();
        if (bVarT == null || (bVarT instanceof ActLocationMap) || (aVarC = (ti6VarZ = bVarT.z()).C(q0d.frg_location_map__map)) == null) {
            return;
        }
        ue0 ue0Var = new ue0(ti6VarZ);
        ue0Var.h(aVarC);
        ue0Var.d(true);
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void Q() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        super.Q();
        laa laaVar = this.v1;
        if (laaVar != null) {
            laaVar.y0.b();
            bwd.b(laaVar.o);
            fba fbaVar = (fba) ((oaa) laaVar.b);
            yn8 yn8Var = fbaVar.F0;
            if (yn8Var != null) {
                LinkedHashMap linkedHashMap = yn8Var.d;
                for (xn8 xn8Var : linkedHashMap.values()) {
                    xn8Var.b.a();
                    v08 v08Var = xn8Var.c;
                    if (v08Var != null) {
                        ty4.a(v08Var);
                    }
                }
                linkedHashMap.clear();
                yn8Var.b();
                yn8Var.a();
            }
            AppCompatImageView appCompatImageView = fbaVar.z0;
            if (appCompatImageView != null && (viewPropertyAnimatorAnimate = appCompatImageView.animate()) != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
            ValueAnimator valueAnimator = fbaVar.I0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            fbaVar.x0.dispose();
            this.v1 = null;
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void X() {
        super.X();
        laa laaVar = this.v1;
        if (laaVar != null) {
            laaVar.X.b(laaVar);
            ((fba) ((oaa) laaVar.b)).getClass();
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void a0() {
        super.a0();
        ((gda) ((t1b) ((qm3) this.l1.b)).getAccessor().c(151)).f(this.B1 ? f1e.CHAT_SHARE_LOCATION : f1e.CHAT_LOCATION_VIEWER, qmb.g);
        laa laaVar = this.v1;
        if (laaVar != null) {
            laaVar.N0();
            ((fba) ((oaa) laaVar.b)).getClass();
        }
    }

    @Override // defpackage.ol6
    public final void b() {
        this.v1.N0();
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void b0(Bundle bundle) {
        super.b0(bundle);
        laa laaVar = this.v1;
        kf8 kf8Var = laaVar.u0;
        qn8 qn8VarC = ((fba) ((oaa) laaVar.b)).C();
        cf8 cf8Var = laaVar.v0;
        boolean z = laaVar.x0;
        bundle.putParcelable("ru.ok.tamtam.extra.VIEW_STATE", new lf8(kf8Var));
        bundle.putParcelable("ru.ok.tamtam.extra.MAP_CONFIG", new rn8(qn8VarC));
        bundle.putSerializable("ru.ok.tamtam.extra.LAST_LOCATION", cf8Var);
        bundle.putBoolean("ru.ok.tamtam.extra.KEEP_CURRENT_LOCATION", z);
    }

    @Override // defpackage.ol6
    public final void g() {
    }

    @Override // defpackage.ol6
    public final void i() {
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final String t0() {
        return "PICK_LOCATION";
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final void w0(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 301) {
            this.w1.E();
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final boolean y0() {
        this.v1.getClass();
        return false;
    }
}
