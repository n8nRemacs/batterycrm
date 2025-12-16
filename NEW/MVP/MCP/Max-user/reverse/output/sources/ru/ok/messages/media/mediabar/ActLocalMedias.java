package ru.ok.messages.media.mediabar;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.a92;
import defpackage.ao6;
import defpackage.b92;
import defpackage.bce;
import defpackage.bcg;
import defpackage.bwd;
import defpackage.bwf;
import defpackage.c1e;
import defpackage.c92;
import defpackage.cei;
import defpackage.d1e;
import defpackage.d6;
import defpackage.da4;
import defpackage.dce;
import defpackage.de;
import defpackage.dhh;
import defpackage.dnf;
import defpackage.eaa;
import defpackage.eba;
import defpackage.efi;
import defpackage.epi;
import defpackage.es2;
import defpackage.f1e;
import defpackage.f6;
import defpackage.fa9;
import defpackage.fce;
import defpackage.fl5;
import defpackage.fni;
import defpackage.fs4;
import defpackage.fvd;
import defpackage.g6;
import defpackage.gda;
import defpackage.hfh;
import defpackage.i6;
import defpackage.ivd;
import defpackage.j08;
import defpackage.j6;
import defpackage.jih;
import defpackage.k6;
import defpackage.l29;
import defpackage.l4;
import defpackage.l6;
import defpackage.l8g;
import defpackage.l95;
import defpackage.lfi;
import defpackage.m6;
import defpackage.m8;
import defpackage.mvd;
import defpackage.n1d;
import defpackage.n45;
import defpackage.nd8;
import defpackage.oaa;
import defpackage.p2h;
import defpackage.pd8;
import defpackage.pea;
import defpackage.pl6;
import defpackage.pt8;
import defpackage.py0;
import defpackage.py4;
import defpackage.q0d;
import defpackage.q1g;
import defpackage.ql6;
import defpackage.qm3;
import defpackage.qmb;
import defpackage.qs3;
import defpackage.qt6;
import defpackage.rqi;
import defpackage.rw4;
import defpackage.sd8;
import defpackage.ss4;
import defpackage.t1b;
import defpackage.tyd;
import defpackage.u10;
import defpackage.u39;
import defpackage.u4e;
import defpackage.v39;
import defpackage.veh;
import defpackage.vo6;
import defpackage.vw4;
import defpackage.w39;
import defpackage.wb3;
import defpackage.wqi;
import defpackage.xd8;
import defpackage.xs8;
import defpackage.y9a;
import defpackage.yi5;
import defpackage.zbe;
import defpackage.zg;
import defpackage.zua;
import defpackage.zub;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.media.crop.ActTamCropImage;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;

/* loaded from: classes2.dex */
public class ActLocalMedias extends d6 implements ql6, pl6, bcg, pt8, View.OnSystemUiVisibilityChangeListener, bce, zbe, u39, xs8, m8 {
    public static final /* synthetic */ int p1 = 0;
    public String U0;
    public nd8 V0;
    public l29 W0;
    public ViewPager2 Z0;
    public qs3 a1;
    public View b1;
    public MediaBarPreviewLayout c1;
    public j08 d1;
    public py4 e1;
    public eaa f1;
    public eba g1;
    public xd8 h1;
    public xd8 i1;
    public Toast j1;
    public fa9 l1;
    public final ArrayList S0 = new ArrayList();
    public int T0 = 0;
    public boolean X0 = true;
    public boolean Y0 = true;
    public boolean k1 = true;
    public l4 m1 = null;
    public final bwf n1 = new bwf(new i6(0, this));
    public final k6 o1 = new k6(this, 0);

    @Override // defpackage.d6
    public final String G() {
        return "LOCAL_MEDIA_VIEWER";
    }

    @Override // defpackage.d6
    public final void H(int i, int i2, Intent intent) {
        qt6 qt6Var;
        qt6 qt6Var2;
        ArrayList arrayList = this.S0;
        if (arrayList.isEmpty()) {
            return;
        }
        pd8 pd8Var = (pd8) arrayList.get(this.T0);
        if (i == 1) {
            if (i2 == -1) {
                long longExtra = intent.getLongExtra("ru.ok.tamtam.extra.START_POSITION", 0L);
                long longExtra2 = intent.getLongExtra("ru.ok.tamtam.extra.END_POSITION", 0L);
                String stringExtra = intent.getStringExtra("ru.ok.tamtam.extra.THUMBNAIL_URI");
                eaa eaaVar = this.f1;
                u10 u10VarA = eaaVar.s0.a();
                float f = eaaVar.Z;
                u10VarA.a = longExtra / f;
                u10VarA.b = longExtra2 / f;
                eaaVar.s0 = new p2h(u10VarA);
                eaaVar.O0();
                dce dceVar = eaaVar.v0;
                pd8 pd8Var2 = eaaVar.o;
                dceVar.a(pd8Var2, dceVar.a.size());
                fce fceVarH = dceVar.h(pd8Var2);
                if (fceVarH != null) {
                    fceVarH.d = stringExtra;
                    Iterator it = dceVar.g.iterator();
                    while (it.hasNext()) {
                        ((zbe) it.next()).n(fceVarH);
                    }
                }
                if (pd8Var != null) {
                    FrgLocalMedia frgLocalMediaF = this.W0.F(pd8Var.b);
                    if (frgLocalMediaF instanceof FrgLocalVideo) {
                        ((FrgLocalVideo) frgLocalMediaF).G0();
                    }
                    this.m1 = new c92(pd8Var, stringExtra);
                }
            }
        } else if (i == 2) {
            if (i2 == -1) {
                Uri uri = (Uri) intent.getParcelableExtra("ru.ok.tamtam.extra.RESULT_URI");
                da4 da4Var = (da4) intent.getParcelableExtra("ru.ok.tamtam.extra.CROP_STATE");
                if (uri != null) {
                    eaa eaaVar2 = this.f1;
                    boolean z = eaaVar2.z0;
                    dce dceVar2 = eaaVar2.v0;
                    zub zubVar = eaaVar2.t0;
                    if (zubVar != null) {
                        qt6Var2 = new qt6();
                        qt6Var2.b = zubVar.a;
                        qt6Var2.c = zubVar.b;
                        qt6Var2.d = zubVar.c;
                        qt6Var2.o = zubVar.d;
                        qt6Var2.X = zubVar.o;
                    } else {
                        qt6Var2 = new qt6();
                    }
                    if (zubVar == null || zubVar.o == null) {
                        qt6Var2.d = da4Var;
                    } else {
                        qt6Var2.X = null;
                        qt6Var2.d = null;
                    }
                    qt6Var2.c = uri;
                    if (da4Var == null) {
                        qt6Var2.c = null;
                    }
                    eaaVar2.t0 = new zub((Uri) qt6Var2.b, (Uri) qt6Var2.c, (da4) qt6Var2.d, (l95) qt6Var2.o, (Uri) qt6Var2.X);
                    eaaVar2.N0();
                    if (!dceVar2.j(eaaVar2.o) && z) {
                        eaaVar2.M0();
                    }
                    if (dceVar2.j(eaaVar2.o) && !z) {
                        eaaVar2.M0();
                    }
                    eaaVar2.P0(new y9a(eaaVar2, 4));
                    eaaVar2.P0(new y9a(eaaVar2, 3));
                    pd8 pd8Var3 = (pd8) arrayList.get(this.T0);
                    if (pd8Var3 != null) {
                        this.m1 = new a92(pd8Var3, uri);
                    }
                } else {
                    wqi.f("ru.ok.messages.media.mediabar.ActLocalMedias", "crop", new IllegalStateException("no crop result data").getMessage());
                    efi.r(this, getString(mvd.g), 1);
                    finish();
                }
            }
        } else if (i == 3 && i2 == -1) {
            Uri uri2 = (Uri) intent.getParcelableExtra("photo_editor:result_uri");
            l95 l95Var = (l95) intent.getParcelableExtra("photo_editor:editor_state");
            eaa eaaVar3 = this.f1;
            zub zubVar2 = eaaVar3.t0;
            if (zubVar2 != null) {
                qt6Var = new qt6();
                qt6Var.b = zubVar2.a;
                qt6Var.c = zubVar2.b;
                qt6Var.d = zubVar2.c;
                qt6Var.o = zubVar2.d;
                qt6Var.X = zubVar2.o;
            } else {
                qt6Var = new qt6();
            }
            qt6Var.X = uri2;
            qt6Var.o = l95Var;
            eaaVar3.t0 = new zub((Uri) qt6Var.b, (Uri) qt6Var.c, (da4) qt6Var.d, l95Var, uri2);
            eaaVar3.N0();
            eaaVar3.P0(new y9a(eaaVar3, 0));
            if (pd8Var != null) {
                this.m1 = new b92(pd8Var, uri2);
            }
        }
        a0();
    }

    @Override // defpackage.d6
    public final void I() {
        Intent intent = getIntent();
        if (intent == null || intent.getBooleanExtra("ru.ok.tamtam.extra.PROFILE_CREATION", false)) {
            return;
        }
        super.I();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ru.ok.messages.media.mediabar.FrgLocalMedia O() {
        /*
            r4 = this;
            androidx.viewpager2.widget.ViewPager2 r0 = r4.Z0
            r1 = 0
            if (r0 != 0) goto L7
        L5:
            r0 = r1
            goto L1d
        L7:
            int r0 = r0.getCurrentItem()
            if (r0 < 0) goto L5
            java.util.ArrayList r2 = r4.S0
            int r3 = r2.size()
            int r3 = r3 + (-1)
            if (r0 > r3) goto L5
            java.lang.Object r0 = r2.get(r0)
            pd8 r0 = (defpackage.pd8) r0
        L1d:
            if (r0 == 0) goto L28
            l29 r1 = r4.W0
            long r2 = r0.b
            ru.ok.messages.media.mediabar.FrgLocalMedia r0 = r1.F(r2)
            return r0
        L28:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.ActLocalMedias.O():ru.ok.messages.media.mediabar.FrgLocalMedia");
    }

    public final void P() {
        wqi.c("ru.ok.messages.media.mediabar.ActLocalMedias", "endTransition: onStart", new Object[0]);
        if (this.c1.getVisibility() != 0) {
            wqi.c("ru.ok.messages.media.mediabar.ActLocalMedias", "endTransition: bottom visible", new Object[0]);
            if (this.V0.a) {
                MediaBarPreviewLayout mediaBarPreviewLayout = this.c1;
                mediaBarPreviewLayout.U0.a();
                mediaBarPreviewLayout.setTranslationY(0.0f);
                mediaBarPreviewLayout.setVisibility(0);
            }
            W();
        }
        if (((Toolbar) this.a1.c).getVisibility() != 0) {
            wqi.c("ru.ok.messages.media.mediabar.ActLocalMedias", "endTransition: top visible", new Object[0]);
            Toolbar toolbar = (Toolbar) this.a1.c;
            if (toolbar != null) {
                toolbar.setVisibility(0);
            }
        }
    }

    public final sd8 Q() {
        return ((t1b) ((qm3) this.J0.b)).h();
    }

    public final void R() {
        ArrayList arrayList = this.S0;
        if (arrayList.size() == 0) {
            return;
        }
        int iMax = Math.max(this.T0, 0);
        this.T0 = iMax;
        if (iMax >= arrayList.size()) {
            this.T0 = arrayList.size() - 1;
        }
        this.f1.L0((pd8) arrayList.get(this.T0));
    }

    public final void S() {
        int iOrdinal = ((es2) this.n1.getValue()).ordinal();
        if (iOrdinal == 0) {
            U(null);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            ScheduledSendPickerDialogFragment.C0("ru.ok.messages.media.mediabar.ActLocalMedias", z(), this, new g6(0, this));
            ScheduledSendPickerDialogFragment.D0("ru.ok.messages.media.mediabar.ActLocalMedias", z());
        }
    }

    public final void T(boolean z, boolean z2) throws Resources.NotFoundException {
        if (z) {
            this.h1.l(1.0f);
            if (z2) {
                int i = mvd.P1;
                Toast toast = this.j1;
                if (toast != null) {
                    toast.cancel();
                }
                Toast toastMakeText = Toast.makeText(this, i, 0);
                this.j1 = toastMakeText;
                toastMakeText.show();
                return;
            }
            return;
        }
        this.h1.m();
        if (z2) {
            int i2 = mvd.N1;
            Toast toast2 = this.j1;
            if (toast2 != null) {
                toast2.cancel();
            }
            Toast toastMakeText2 = Toast.makeText(this, i2, 0);
            this.j1 = toastMakeText2;
            toastMakeText2.show();
        }
    }

    public final void U(ss4 ss4Var) {
        ArrayList arrayList = this.S0;
        if (arrayList.isEmpty()) {
            return;
        }
        if (Q().f.b() == 0 && !this.V0.b && O() != null) {
            this.f1.M0();
        }
        Intent intent = new Intent();
        intent.putExtra("act:local_medias:send_result", (Parcelable) arrayList.get(this.T0));
        intent.putExtra("act:local_medias:delayed_attrs", ss4Var);
        setResult(-1, intent);
        if (!this.V0.a) {
            F();
            return;
        }
        dce dceVar = Q().f;
        dceVar.getClass();
        Iterator it = new ArrayList(dceVar.a).iterator();
        while (it.hasNext()) {
            ((fce) it.next()).e = false;
        }
        super.finish();
    }

    public final void V(boolean z, boolean z2) {
        this.X0 = z;
        py4 py4Var = this.e1;
        if (py4Var != null && !py4Var.e()) {
            this.e1.dispose();
            this.e1 = null;
        }
        if (!z) {
            c0(z2);
            epi.d(this);
            this.e1 = de.a().c(new f6(this, 4), 100L, TimeUnit.MILLISECONDS);
            return;
        }
        if (this.Y0) {
            c0(z2);
            return;
        }
        L(this);
        getWindow().getDecorView().post(new f6(this, 3));
        if (dnf.n(Build.BRAND, "meizu", true)) {
            c0(z2);
        }
    }

    public final void W() {
        MediaBarPreviewLayout mediaBarPreviewLayout = this.c1;
        if (mediaBarPreviewLayout != null) {
            if (this.V0.a) {
                final int i = 0;
                zua zuaVar = new zua(this) { // from class: h6
                    public final /* synthetic */ ActLocalMedias b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.zua
                    public final g4i I(View view, g4i g4iVar) {
                        switch (i) {
                            case 0:
                                MediaBarPreviewLayout mediaBarPreviewLayout2 = this.b.c1;
                                int iB = g4iVar.b();
                                int iC = g4iVar.c();
                                int iA = g4iVar.a();
                                View view2 = mediaBarPreviewLayout2.H0;
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                if (marginLayoutParams.getMarginStart() != iB) {
                                    marginLayoutParams.setMarginStart(iB);
                                    view2.setLayoutParams(marginLayoutParams);
                                }
                                View view3 = mediaBarPreviewLayout2.G0;
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                                if (marginLayoutParams2.getMarginStart() != iB) {
                                    marginLayoutParams2.setMarginStart(iB);
                                    view3.setLayoutParams(marginLayoutParams2);
                                }
                                yni.f(view2, iC);
                                yni.f(view3, iC);
                                if (mediaBarPreviewLayout2.getPaddingTop() != 0) {
                                    mediaBarPreviewLayout2.setPadding(mediaBarPreviewLayout2.getPaddingLeft(), 0, mediaBarPreviewLayout2.getPaddingRight(), mediaBarPreviewLayout2.getPaddingBottom());
                                }
                                if (mediaBarPreviewLayout2.getPaddingBottom() != iA) {
                                    mediaBarPreviewLayout2.setPadding(mediaBarPreviewLayout2.getPaddingLeft(), mediaBarPreviewLayout2.getPaddingTop(), mediaBarPreviewLayout2.getPaddingRight(), iA);
                                    break;
                                }
                                break;
                            default:
                                View view4 = this.b.b1;
                                int iA2 = g4iVar.a();
                                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) view4.getLayoutParams();
                                if (marginLayoutParams3.bottomMargin != iA2) {
                                    marginLayoutParams3.bottomMargin = iA2;
                                    view4.setLayoutParams(marginLayoutParams3);
                                    break;
                                }
                                break;
                        }
                        return g4iVar;
                    }
                };
                WeakHashMap weakHashMap = hfh.a;
                veh.u(mediaBarPreviewLayout, zuaVar);
                this.c1.post(new f6(this, 5));
                return;
            }
            View view = this.b1;
            final int i2 = 1;
            zua zuaVar2 = new zua(this) { // from class: h6
                public final /* synthetic */ ActLocalMedias b;

                {
                    this.b = this;
                }

                @Override // defpackage.zua
                public final g4i I(View view2, g4i g4iVar) {
                    switch (i2) {
                        case 0:
                            MediaBarPreviewLayout mediaBarPreviewLayout2 = this.b.c1;
                            int iB = g4iVar.b();
                            int iC = g4iVar.c();
                            int iA = g4iVar.a();
                            View view22 = mediaBarPreviewLayout2.H0;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view22.getLayoutParams();
                            if (marginLayoutParams.getMarginStart() != iB) {
                                marginLayoutParams.setMarginStart(iB);
                                view22.setLayoutParams(marginLayoutParams);
                            }
                            View view3 = mediaBarPreviewLayout2.G0;
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                            if (marginLayoutParams2.getMarginStart() != iB) {
                                marginLayoutParams2.setMarginStart(iB);
                                view3.setLayoutParams(marginLayoutParams2);
                            }
                            yni.f(view22, iC);
                            yni.f(view3, iC);
                            if (mediaBarPreviewLayout2.getPaddingTop() != 0) {
                                mediaBarPreviewLayout2.setPadding(mediaBarPreviewLayout2.getPaddingLeft(), 0, mediaBarPreviewLayout2.getPaddingRight(), mediaBarPreviewLayout2.getPaddingBottom());
                            }
                            if (mediaBarPreviewLayout2.getPaddingBottom() != iA) {
                                mediaBarPreviewLayout2.setPadding(mediaBarPreviewLayout2.getPaddingLeft(), mediaBarPreviewLayout2.getPaddingTop(), mediaBarPreviewLayout2.getPaddingRight(), iA);
                                break;
                            }
                            break;
                        default:
                            View view4 = this.b.b1;
                            int iA2 = g4iVar.a();
                            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) view4.getLayoutParams();
                            if (marginLayoutParams3.bottomMargin != iA2) {
                                marginLayoutParams3.bottomMargin = iA2;
                                view4.setLayoutParams(marginLayoutParams3);
                                break;
                            }
                            break;
                    }
                    return g4iVar;
                }
            };
            WeakHashMap weakHashMap2 = hfh.a;
            veh.u(view, zuaVar2);
            this.c1.post(new f6(this, 6));
        }
    }

    @Override // defpackage.bce
    public final void X(Set set) {
        a0();
    }

    public final void Y(Uri uri, File file, da4 da4Var) {
        Uri uriFromFile = Uri.fromFile(file);
        Intent intent = new Intent(this, (Class<?>) ActTamCropImage.class);
        intent.putExtra("ru.ok.tamtam.extra.SOURCE_URI", uri);
        intent.putExtra("ru.ok.tamtam.extra.RESULT_URI", uriFromFile);
        intent.putExtra("ru.ok.tamtam.extra.CROP_STATE", da4Var);
        intent.putExtra("ru.ok.tamtam.extra.SAVE_AS_PNG", false);
        startActivityForResult(intent, 2);
    }

    public final void Z() {
        V(!this.X0, false);
    }

    @Override // defpackage.u39
    public final xd8 a() {
        if (this.h1 == null) {
            v39 v39VarI = ((t1b) ((qm3) this.J0.b)).i();
            HashMap map = v39VarI.b;
            w39 w39Var = w39.c;
            xd8 xd8Var = (xd8) map.get(w39Var);
            if (xd8Var != null) {
                xd8Var.c();
                xd8Var.g = null;
            }
            HashMap map2 = v39VarI.a;
            fl5 fl5Var = (fl5) map2.get(w39Var);
            if (fl5Var == null) {
                fl5 fl5Var2 = new fl5(v39VarI.d, v39VarI.e, v39VarI.k, v39VarI.i, v39VarI.f.a);
                map2.put(w39Var, fl5Var2);
                fl5Var = fl5Var2;
            }
            xd8 xd8Var2 = new xd8(w39Var, fl5Var, v39VarI, v39VarI.d, 1.0f, false, false);
            map.put(w39Var, xd8Var2);
            this.h1 = xd8Var2;
        }
        return this.h1;
    }

    public final void a0() {
        this.c1.z();
        W();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    public final void b0(int i) {
        vo6 vo6Var;
        int iB;
        qs3 qs3Var = this.a1;
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i + 1);
        String string = getString(fvd.I);
        if (fni.a(this.U0, "SELECTED_MEDIA_ALBUM")) {
            iB = this.W0.w0.size();
        } else {
            sd8 sd8VarQ = Q();
            String str = this.U0;
            sd8VarQ.getClass();
            iB = fni.a(str, "SELECTED_MEDIA_ALBUM") ? sd8VarQ.f.b() : (str == null || (vo6Var = (vo6) sd8VarQ.g.get(str)) == null) ? 0 : vo6Var.b;
        }
        String str2 = String.format(locale, "%d %s %d", numValueOf, string, Integer.valueOf(iB));
        TextView textView = (TextView) qs3Var.o;
        if (textView != null) {
            textView.setText(str2);
        }
    }

    @Override // defpackage.m8
    public final boolean c() {
        return true;
    }

    public final void c0(boolean z) {
        zg zgVarB = ((t1b) ((qm3) this.J0.b)).b();
        qs3 qs3Var = this.a1;
        boolean z2 = this.X0;
        Toolbar toolbar = (Toolbar) qs3Var.c;
        if (toolbar != null) {
            if (z2) {
                zgVarB.e(toolbar);
            } else {
                zgVarB.f(toolbar);
            }
        }
        if (this.X0) {
            final eba ebaVar = (eba) ((oaa) this.f1.b);
            dhh dhhVarA = hfh.a((View) ebaVar.c);
            WeakReference weakReference = dhhVarA.a;
            final int i = 0;
            Runnable runnable = new Runnable() { // from class: dba
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            ((View) ebaVar.c).setVisibility(0);
                            break;
                        default:
                            eba ebaVar2 = ebaVar;
                            ebaVar2.Z.requestLayout();
                            ebaVar2.s0.requestLayout();
                            ebaVar2.Y.requestLayout();
                            ebaVar2.t0.requestLayout();
                            ebaVar2.v0.requestLayout();
                            break;
                    }
                }
            };
            View view = (View) weakReference.get();
            if (view != null) {
                view.animate().withStartAction(runnable);
            }
            dhhVarA.a(1.0f);
            final int i2 = 1;
            Runnable runnable2 = new Runnable() { // from class: dba
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            ((View) ebaVar.c).setVisibility(0);
                            break;
                        default:
                            eba ebaVar2 = ebaVar;
                            ebaVar2.Z.requestLayout();
                            ebaVar2.s0.requestLayout();
                            ebaVar2.Y.requestLayout();
                            ebaVar2.t0.requestLayout();
                            ebaVar2.v0.requestLayout();
                            break;
                    }
                }
            };
            View view2 = (View) weakReference.get();
            if (view2 != null) {
                view2.animate().withEndAction(runnable2);
            }
            fs4 fs4Var = ebaVar.d.a;
            dhhVarA.c(200L);
            View view3 = (View) weakReference.get();
            if (view3 != null) {
                view3.animate().start();
            }
        } else {
            eba ebaVar2 = (eba) ((oaa) this.f1.b);
            ebaVar2.A((View) ebaVar2.c, false);
        }
        if (this.V0.a) {
            if (this.X0) {
                zgVarB.e(this.c1);
            } else {
                zgVarB.f(this.c1);
            }
        }
        l29 l29Var = this.W0;
        if (l29Var != null) {
            Iterator it = l29Var.y0.values().iterator();
            while (it.hasNext()) {
                FrgLocalMedia frgLocalMedia = (FrgLocalMedia) ((WeakReference) it.next()).get();
                if (frgLocalMedia != null) {
                    frgLocalMedia.D0();
                }
            }
        }
    }

    @Override // defpackage.d6, defpackage.i7g
    public final q1g f() {
        if (this.l1 == null) {
            this.l1 = fa9.e0;
        }
        return this.l1;
    }

    @Override // defpackage.d6, android.app.Activity
    public final void finish() {
        ((gda) ((t1b) ((qm3) this.J0.b)).getAccessor().c(151)).f(f1e.CHAT_ATTACH_PICKER, qmb.g);
        dce dceVar = Q().f;
        dceVar.getClass();
        Iterator it = new ArrayList(dceVar.a).iterator();
        while (it.hasNext()) {
            ((fce) it.next()).e = false;
        }
        MediaBarPreviewLayout mediaBarPreviewLayout = this.c1;
        Pair<Integer, Integer> scrollPosition = mediaBarPreviewLayout != null ? mediaBarPreviewLayout.getScrollPosition() : new Pair<>(0, 0);
        Intent intent = new Intent();
        intent.putExtra("ru.ok.tamtam.extra.PREVIEW_LAYOUT_SCROLL_POSITION", (Serializable) scrollPosition.first);
        intent.putExtra("ru.ok.tamtam.extra.PREVIEW_LAYOUT_SCROLL_OFFSET", (Serializable) scrollPosition.second);
        intent.putExtra("ru.ok.tamtam.extra.EXTRA_CHANGE_LOCAL_MEDIA_RESULT", this.m1);
        setResult(0, intent);
        super.finish();
    }

    @Override // defpackage.m8
    public final boolean j() {
        return false;
    }

    @Override // defpackage.zbe
    public final void n(fce fceVar) {
        a0();
    }

    @Override // defpackage.d6, defpackage.nl3, android.app.Activity
    public final void onBackPressed() {
        if (!this.V0.t0) {
            dce dceVar = Q().f;
            dceVar.a.clear();
            dceVar.n();
            dceVar.b.clear();
            if (dceVar.h.g.getBoolean("app.send.media.as.collage", true)) {
                dceVar.k = 3;
            } else {
                dceVar.k = 1;
            }
        }
        super.onBackPressed();
    }

    @Override // defpackage.ln, defpackage.nl3, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        qs3 qs3Var = this.a1;
        if (qs3Var != null) {
            py0 py0Var = (py0) qs3Var.b;
            Toolbar toolbar = (Toolbar) qs3Var.c;
            if (toolbar != null && py0Var.z() != null) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = vw4.a(py0Var.z());
                toolbar.setLayoutParams(layoutParams);
            }
        }
        W();
        j08 j08Var = this.d1;
        j08Var.getClass();
        int i = configuration.orientation;
        int i2 = 0;
        if (i != j08Var.c) {
            j08Var.c = i;
            j08Var.b.d = 0;
        }
        de.a().c(new f6(this, i2), 300L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.d6, androidx.fragment.app.b, defpackage.nl3, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String[] strArr;
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        this.h1 = a();
        if (this.i1 == null) {
            v39 v39VarI = ((t1b) ((qm3) this.J0.b)).i();
            HashMap map = v39VarI.b;
            w39 w39Var = w39.a;
            xd8 xd8Var = (xd8) map.get(w39Var);
            if (xd8Var != null) {
                xd8Var.c();
                xd8Var.g = null;
            }
            HashMap map2 = v39VarI.a;
            fl5 fl5Var = (fl5) map2.get(w39Var);
            if (fl5Var == null) {
                fl5Var = new fl5(v39VarI.d, v39VarI.e, v39VarI.k, v39VarI.i, v39VarI.f.a);
                map2.put(w39Var, fl5Var);
            }
            xd8 xd8Var2 = new xd8(w39Var, fl5Var, v39VarI, v39VarI.d, 0.0f, true, true);
            map.put(w39Var, xd8Var2);
            this.i1 = xd8Var2;
        }
        this.i1 = this.i1;
        if (bundle != null) {
            xd8 xd8Var3 = this.h1;
            xd8Var3.h = bundle.getFloat(xd8Var3.b("MediaPlayerController.Volume"));
            xd8Var3.i = bundle.getBoolean(xd8Var3.b("MediaPlayerController.Looping"));
            xd8Var3.j = bundle.getBoolean(xd8Var3.b("MediaPlayerController.PlayWhenReady"));
            xd8 xd8Var4 = this.i1;
            xd8Var4.h = bundle.getFloat(xd8Var4.b("MediaPlayerController.Volume"));
            xd8Var4.i = bundle.getBoolean(xd8Var4.b("MediaPlayerController.Looping"));
            xd8Var4.j = bundle.getBoolean(xd8Var4.b("MediaPlayerController.PlayWhenReady"));
        }
        setContentView(n1d.act_local_medias);
        pea peaVar = new pea(new py0(this), (Toolbar) findViewById(q0d.toolbar));
        peaVar.b = f();
        qs3 qs3Var = new qs3(peaVar);
        Toolbar toolbar = (Toolbar) qs3Var.c;
        if (toolbar != null) {
            u4e u4eVar = new u4e(29, qs3Var);
            WeakHashMap weakHashMap = hfh.a;
            veh.u(toolbar, u4eVar);
        }
        this.a1 = qs3Var;
        if (i >= 33) {
            strArr = lfi.d;
        } else {
            d1e.a.getClass();
            strArr = c1e.c;
        }
        int i2 = 1;
        int i3 = 0;
        if (!(lfi.b(this, strArr) ? true : i >= 34 ? lfi.b(this, new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"}) : false)) {
            finish();
            return;
        }
        j08 j08Var = new j08(getWindow().getDecorView(), this);
        this.d1 = j08Var;
        this.a.a(j08Var);
        this.V0 = (nd8) getIntent().getParcelableExtra("ru.ok.tamtam.extra.OPTIONS");
        K(f().L);
        qs3 qs3Var2 = this.a1;
        j6 j6Var = new j6(i3, this);
        Toolbar toolbar2 = (Toolbar) qs3Var2.c;
        if (toolbar2 != null) {
            toolbar2.setNavigationOnClickListener(j6Var);
        }
        qs3 qs3Var3 = this.a1;
        int i4 = ivd.B;
        q1g q1gVar = (q1g) qs3Var3.d;
        Toolbar toolbar3 = (Toolbar) qs3Var3.c;
        int i5 = q1gVar.w;
        if (toolbar3 != null) {
            toolbar3.setNavigationIcon(i4);
            Drawable navigationIcon = toolbar3.getNavigationIcon();
            if (navigationIcon != null) {
                cei.k(navigationIcon, i5);
            }
        }
        qs3 qs3Var4 = this.a1;
        int i6 = this.l1.w;
        Drawable navigationIcon2 = ((Toolbar) qs3Var4.c).getNavigationIcon();
        if (navigationIcon2 != null) {
            cei.k(navigationIcon2, i6);
        }
        qs3 qs3Var5 = this.a1;
        int i7 = this.l1.N;
        Toolbar toolbar4 = (Toolbar) qs3Var5.c;
        if (toolbar4 != null) {
            toolbar4.setBackgroundColor(i7);
        }
        qs3 qs3Var6 = this.a1;
        int i8 = this.l1.F;
        TextView textView = (TextView) qs3Var6.o;
        if (textView != null) {
            textView.setTextColor(i8);
        }
        qs3 qs3Var7 = this.a1;
        int i9 = ((rw4) this.J0.c).a;
        Toolbar toolbar5 = (Toolbar) qs3Var7.c;
        if (toolbar5 != null) {
            WeakHashMap weakHashMap2 = hfh.a;
            veh.s(toolbar5, i9);
        }
        nd8 nd8Var = this.V0;
        this.U0 = nd8Var.o;
        if (bundle == null) {
            this.T0 = nd8Var.Y;
        } else {
            this.T0 = bundle.getInt("ru.ok.tamtam.extra.SELECTED_POS", 0);
            this.X0 = bundle.getBoolean("ru.ok.tamtam.extra.UI_VISIBILITY", true);
        }
        List listA = Q().a(this.U0);
        ArrayList arrayList = this.S0;
        arrayList.addAll(listA);
        MediaBarPreviewLayout mediaBarPreviewLayout = (MediaBarPreviewLayout) findViewById(q0d.act_local_medias__preview);
        this.c1 = mediaBarPreviewLayout;
        mediaBarPreviewLayout.setShouldApplyHighlight(fni.a(this.U0, "SELECTED_MEDIA_ALBUM"));
        this.c1.setMessageEdit(this.V0.b);
        this.c1.setFullScreen(true);
        this.c1.setListener(this);
        this.c1.I0.setVisibility(8);
        this.c1.setChatMode((es2) this.n1.getValue());
        MediaBarPreviewLayout mediaBarPreviewLayout2 = this.c1;
        ((t1b) ((qm3) this.J0.b)).j().b.getClass();
        Set set = Collections.EMPTY_SET;
        mediaBarPreviewLayout2.setAnimojisEnabled(rqi.b(3));
        if (!this.V0.a) {
            this.c1.setVisibility(8);
        }
        View viewFindViewById = findViewById(q0d.act_local_medias__fl_root);
        this.g1 = new eba(viewFindViewById.getContext(), (ViewStub) viewFindViewById.findViewById(q0d.act_local_medias__vs_toolbox), ((t1b) ((qm3) this.J0.b)).b());
        qm3 qm3Var = (qm3) this.J0.b;
        eba ebaVar = this.g1;
        nd8 nd8Var2 = this.V0;
        t1b t1bVar = (t1b) qm3Var;
        this.f1 = new eaa(ebaVar, this, nd8Var2.a, nd8Var2.c, t1bVar.a(), t1bVar.h().f, t1bVar.f(), new ao6(26, this), (yi5) t1bVar.getAccessor().c(9), t1bVar.j().c.o());
        this.b1 = findViewById(q0d.act_local_medias__vs_toolbox);
        a0();
        R();
        this.Z0 = (ViewPager2) findViewById(q0d.act_local_medias__view_pager);
        this.W0 = new l29(this, arrayList, this.V0);
        this.Z0.b(this.o1);
        this.Z0.setOffscreenPageLimit(2);
        this.Z0.setAdapter(this.W0);
        if (l8g.a(this.U0, "SELECTED_MEDIA_ALBUM")) {
            this.Z0.b(new k6(this, i2));
            fce fceVarI = Q().f.i(this.T0);
            if (fceVarI != null) {
                fceVarI.e = true;
            }
        }
        this.Z0.e(this.T0, false);
        b0(this.T0);
        a0();
        MediaBarPreviewLayout mediaBarPreviewLayout3 = this.c1;
        nd8 nd8Var3 = this.V0;
        int i10 = nd8Var3.u0;
        int i11 = nd8Var3.v0;
        RecyclerView recyclerView = mediaBarPreviewLayout3.J0;
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            ((LinearLayoutManager) recyclerView.getLayoutManager()).o1(i10, i11);
        }
        if (getIntent().getBooleanExtra("ru.ok.tamtam.extra.WITH_TRANSITION", false)) {
            Toolbar toolbar6 = (Toolbar) this.a1.c;
            if (toolbar6 != null) {
                toolbar6.setVisibility(4);
            }
            tyd tydVar = tyd.c;
            tyd tydVar2 = tyd.f;
            int i12 = n45.c;
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new ChangeBounds());
            transitionSet.addTransition(new n45(tydVar, tydVar2));
            Rect rect = this.V0.Z;
            if (rect != null) {
                transitionSet.addTransition(new wb3(rect, true));
            }
            transitionSet.addTransition(new n45(tydVar, tydVar2));
            setEnterSharedElementCallback(new l6(this, rect));
            transitionSet.addListener((Transition.TransitionListener) new m6(i3, this));
            fs4 fs4Var = ((t1b) ((qm3) this.J0.b)).b().a;
            transitionSet.setDuration(200L);
            getWindow().setSharedElementEnterTransition(transitionSet);
            postponeEnterTransition();
            ViewPager2 viewPager2 = this.Z0;
            f6 f6Var = new f6(this, i2);
            ViewTreeObserver viewTreeObserver = viewPager2.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new jih(viewTreeObserver, f6Var));
            TransitionSet transitionSet2 = new TransitionSet();
            transitionSet2.addTransition(new ChangeBounds());
            transitionSet2.addTransition(new n45(tydVar2, tydVar));
            if (rect != null) {
                transitionSet2.addTransition(new wb3(rect, false));
            }
            fs4 fs4Var2 = ((t1b) ((qm3) this.J0.b)).b().a;
            transitionSet2.setDuration(200L);
            getWindow().setSharedElementReturnTransition(transitionSet2);
        } else {
            P();
        }
        L(null);
    }

    @Override // defpackage.d6, defpackage.ln, androidx.fragment.app.b, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.h1 != null) {
            ((t1b) ((qm3) this.J0.b)).i().p(this.h1);
        }
        if (this.i1 != null) {
            ((t1b) ((qm3) this.J0.b)).i().p(this.i1);
        }
        ViewPager2 viewPager2 = this.Z0;
        if (viewPager2 != null) {
            viewPager2.g(this.o1);
        }
        Toast toast = this.j1;
        if (toast != null) {
            toast.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    @defpackage.vnf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEvent(defpackage.td8 r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.mediabar.ActLocalMedias.onEvent(td8):void");
    }

    @Override // defpackage.d6, androidx.fragment.app.b, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.h1 != null) {
            ((t1b) ((qm3) this.J0.b)).i().l(this.h1);
        }
        if (this.i1 != null) {
            ((t1b) ((qm3) this.J0.b)).i().l(this.i1);
        }
    }

    @Override // defpackage.d6, androidx.fragment.app.b, android.app.Activity
    public final void onResume() {
        pd8 pd8Var;
        super.onResume();
        ((gda) ((t1b) ((qm3) this.J0.b)).getAccessor().c(151)).f(f1e.CHAT_ATTACH_PICKER_MEDIA_VIEWER, qmb.g);
        W();
        if (this.h1 != null) {
            ((t1b) ((qm3) this.J0.b)).i().k(this.h1);
        }
        if (this.i1 != null) {
            ((t1b) ((qm3) this.J0.b)).i().k(this.i1);
        }
        if (!this.k1) {
            V(this.X0, false);
        }
        this.k1 = false;
        ArrayList arrayList = this.S0;
        if (arrayList.size() == 0 || (pd8Var = (pd8) arrayList.get(this.T0)) == null) {
            return;
        }
        FrgLocalMedia frgLocalMediaF = this.W0.F(pd8Var.b);
        if (frgLocalMediaF instanceof FrgLocalVideo) {
            ((FrgLocalVideo) frgLocalMediaF).G0();
        }
    }

    @Override // defpackage.d6, defpackage.nl3, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ru.ok.tamtam.extra.SELECTED_POS", this.T0);
        bundle.putBoolean("ru.ok.tamtam.extra.UI_VISIBILITY", this.X0);
        xd8 xd8Var = this.h1;
        if (xd8Var != null) {
            bundle.putFloat(xd8Var.b("MediaPlayerController.Volume"), xd8Var.h);
            bundle.putBoolean(xd8Var.b("MediaPlayerController.Looping"), xd8Var.i);
            bundle.putBoolean(xd8Var.b("MediaPlayerController.PlayWhenReady"), xd8Var.j);
        }
        xd8 xd8Var2 = this.i1;
        if (xd8Var2 != null) {
            bundle.putFloat(xd8Var2.b("MediaPlayerController.Volume"), xd8Var2.h);
            bundle.putBoolean(xd8Var2.b("MediaPlayerController.Looping"), xd8Var2.i);
            bundle.putBoolean(xd8Var2.b("MediaPlayerController.PlayWhenReady"), xd8Var2.j);
        }
    }

    @Override // defpackage.d6, defpackage.ln, androidx.fragment.app.b, android.app.Activity
    public final void onStart() {
        super.onStart();
        dce dceVar = Q().f;
        dceVar.c.add(this);
        dceVar.g.add(this);
        eaa eaaVar = this.f1;
        dce dceVar2 = eaaVar.v0;
        pd8 pd8Var = eaaVar.o;
        if (pd8Var != null) {
            eaaVar.L0(pd8Var);
        }
        dceVar2.c.add(eaaVar);
        dceVar2.d.add(eaaVar);
        dceVar2.f.add(eaaVar);
    }

    @Override // defpackage.d6, defpackage.ln, androidx.fragment.app.b, android.app.Activity
    public final void onStop() {
        super.onStop();
        dce dceVar = Q().f;
        dceVar.c.remove(this);
        dceVar.g.remove(this);
        eaa eaaVar = this.f1;
        dce dceVar2 = eaaVar.v0;
        dceVar2.c.remove(eaaVar);
        dceVar2.d.remove(eaaVar);
        dceVar2.f.remove(eaaVar);
        bwd.b(eaaVar.B0);
        bwd.b(null);
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        int i2 = 2;
        boolean z = i == 0 || i == 2;
        this.Y0 = z;
        if (this.X0 && z) {
            this.e1 = de.a().c(new f6(this, i2), 100L, TimeUnit.MILLISECONDS);
        }
    }
}
