package ru.ok.messages.media.mediabar;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import defpackage.az1;
import defpackage.bwd;
import defpackage.c5g;
import defpackage.ct4;
import defpackage.dk0;
import defpackage.efi;
import defpackage.ehg;
import defpackage.faa;
import defpackage.fwg;
import defpackage.g00;
import defpackage.gch;
import defpackage.gk0;
import defpackage.haa;
import defpackage.hch;
import defpackage.hfh;
import defpackage.hs8;
import defpackage.iaa;
import defpackage.j0e;
import defpackage.k2f;
import defpackage.k6g;
import defpackage.l8g;
import defpackage.m0c;
import defpackage.m0g;
import defpackage.m2f;
import defpackage.m7g;
import defpackage.mvd;
import defpackage.n0g;
import defpackage.n1d;
import defpackage.oaa;
import defpackage.p3f;
import defpackage.pd8;
import defpackage.q0d;
import defpackage.ql6;
import defpackage.qm3;
import defpackage.qu1;
import defpackage.sr8;
import defpackage.ssi;
import defpackage.t1b;
import defpackage.teh;
import defpackage.u0e;
import defpackage.u2f;
import defpackage.u39;
import defpackage.u8j;
import defpackage.v10;
import defpackage.veh;
import defpackage.w10;
import defpackage.wk3;
import defpackage.wo4;
import defpackage.wqi;
import defpackage.xd8;
import defpackage.xs8;
import defpackage.yaa;
import defpackage.z9a;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpStatus;
import ru.ok.messages.video.fetcher.FetcherException;
import ru.ok.messages.video.widgets.PinchToZoomVideoViewWrapper;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* loaded from: classes2.dex */
public class FrgLocalVideo extends FrgLocalMedia {
    public xd8 B1;
    public yaa C1;
    public iaa D1;
    public SimpleDraweeView E1;
    public xs8 F1;

    @Override // ru.ok.messages.media.mediabar.FrgLocalMedia
    public final void D0() {
        if (this.D1 == null) {
            return;
        }
        ql6 ql6VarB0 = B0();
        if (ql6VarB0 == null || !((ActLocalMedias) ql6VarB0).X0) {
            iaa iaaVar = this.D1;
            iaaVar.getClass();
            iaaVar.P0(new haa(false, 0));
            iaaVar.N0();
            return;
        }
        iaa iaaVar2 = this.D1;
        iaaVar2.getClass();
        iaaVar2.P0(new haa(true, 0));
        if (iaaVar2.s0.b) {
            iaaVar2.L0();
        }
    }

    public final void E0() {
        if (this.D1 == null) {
            return;
        }
        pd8 pd8Var = this.v1;
        if (pd8Var == null || ((pd8Var instanceof g00) && l8g.c(((g00) pd8Var).t0.s))) {
            wqi.c("ru.ok.messages.media.mediabar.FrgLocalMedia", "bindLocalMedia: Can't bind local media. Skip", new Object[0]);
            ((View) this.C1.c).setVisibility(8);
            return;
        }
        wqi.c("ru.ok.messages.media.mediabar.FrgLocalMedia", "bindLocalMedia: Bind local media success", new Object[0]);
        int i = 0;
        ((View) this.C1.c).setVisibility(0);
        iaa iaaVar = this.D1;
        pd8 pd8Var2 = this.v1;
        m0g m0gVar = iaaVar.X;
        wqi.c("iaa", "Bind local media %s", Long.valueOf(pd8Var2.b));
        iaaVar.c.j = false;
        bwd.b(iaaVar.t0);
        iaaVar.O0();
        iaaVar.N0();
        iaaVar.P0(new dk0(14));
        int i2 = 1;
        int i3 = 2;
        if (pd8Var2 instanceof g00) {
            g00 g00Var = (g00) pd8Var2;
            if (l8g.c(g00Var.t0.s)) {
                hch hchVar = iaaVar.Z;
                w10 w10Var = g00Var.t0;
                long j = g00Var.u0;
                long j2 = g00Var.v0;
                hchVar.getClass();
                wqi.c("VideoRipper", "getVideoContent chatServerId=%d, messageServerId=%d", Long.valueOf(j), Long.valueOf(j2));
                v10 v10Var = ssi.h(w10Var) ? w10Var.j.d.d : w10Var.d;
                sr8 sr8Var = new sr8(new gch(hchVar, v10Var, w10Var));
                v10 v10Var2 = ssi.h(w10Var) ? w10Var.j.d.d : w10Var.d;
                int i4 = 16;
                m2f m2fVar = new m2f(new wk3(i3, new ct4(hchVar, w10Var, j, j2, v10Var2, 2)), new fwg(i4), i);
                long j3 = hchVar.l;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                j0e j0eVarA = u0e.a();
                Objects.requireNonNull(timeUnit, "unit is null");
                Objects.requireNonNull(j0eVarA, "scheduler is null");
                int i5 = 0;
                n0g n0gVar = (n0g) m0gVar;
                u2f u2fVarI = new hs8(sr8Var, i5, new k2f(new k2f(new p3f(m2fVar, j3, j0eVarA), new gch(hchVar, w10Var, v10Var2), i2), new c5g(hchVar, i4, v10Var2), i5)).h(new ehg(15, v10Var)).m(n0gVar.a()).i(n0gVar.b());
                int i6 = 2;
                qu1 qu1Var = new qu1(new faa(iaaVar, i2), i6, new faa(iaaVar, i6));
                u2fVarI.k(qu1Var);
                iaaVar.t0 = qu1Var;
                return;
            }
        }
        wk3 wk3Var = new wk3(i3, new z9a(iaaVar, i2, pd8Var2));
        m0gVar.getClass();
        n0g n0gVar2 = (n0g) m0gVar;
        u2f u2fVarI2 = wk3Var.m(n0gVar2.a()).i(n0gVar2.b());
        qu1 qu1Var2 = new qu1(new faa(iaaVar, i2), i3, new faa(iaaVar, i3));
        u2fVarI2.k(qu1Var2);
        iaaVar.t0 = qu1Var2;
    }

    public final void F0(boolean z) {
        ql6 ql6VarB0 = B0();
        if (ql6VarB0 == null) {
            return;
        }
        ((ActLocalMedias) ql6VarB0).V(z, false);
    }

    public final void G0() {
        H0();
        View view = (View) this.C1.c;
        if (view != null) {
            view.setVisibility(0);
        }
        this.D1 = new iaa(this.C1, this.B1, v(), ((t1b) ((qm3) this.l1.b)).h().f, (m0g) ((t1b) ((qm3) this.l1.b)).getAccessor().c(HttpStatus.SC_FORBIDDEN), this, (hch) ((t1b) ((qm3) this.l1.b)).getAccessor().c(633), this.F1);
        E0();
    }

    public final void H0() {
        if (this.D1 == null) {
            return;
        }
        wqi.c("ru.ok.messages.media.mediabar.FrgLocalMedia", "Release", new Object[0]);
        this.D1.c.g();
        iaa iaaVar = this.D1;
        oaa oaaVar = (oaa) iaaVar.b;
        wqi.c("iaa", "Release", new Object[0]);
        bwd.b(iaaVar.t0);
        iaaVar.O0();
        iaaVar.N0();
        xd8 xd8Var = iaaVar.c;
        if (xd8Var.g == iaaVar) {
            if (xd8Var.f != null) {
                wqi.c("xd8", "Stop %s", xd8Var.a);
                xd8Var.b.B();
            }
            xd8Var.e = null;
            xd8Var.j(null);
            xd8Var.g = null;
        }
        yaa yaaVar = (yaa) oaaVar;
        ((Set) yaaVar.a).remove(iaaVar);
        yaaVar.X.b();
        PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = yaaVar.Y;
        pinchToZoomVideoViewWrapper.c = m0c.b;
        pinchToZoomVideoViewWrapper.o = 1.0f;
        this.D1 = null;
    }

    public final void I0(Throwable th) {
        int i;
        Context contextV = v();
        Context contextV2 = v();
        int i2 = k6g.a;
        if (th instanceof FetcherException) {
            switch (az1.v(((FetcherException) th).a)) {
                case 5:
                    i = mvd.i2;
                    break;
                case 6:
                    i = mvd.n2;
                    break;
                case 7:
                    i = mvd.l2;
                    break;
                case 8:
                    i = mvd.k2;
                    break;
                case 9:
                    i = mvd.j2;
                    break;
                case 10:
                    i = mvd.h2;
                    break;
                default:
                    i = mvd.F;
                    break;
            }
        } else {
            i = mvd.h2;
        }
        efi.r(contextV, contextV2.getString(i), 0);
    }

    @Override // androidx.fragment.app.a
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrgLocalVideo frgLocalVideo;
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(n1d.frg_local_video, viewGroup, false);
        slideOutLayout.setSlideOutListener(this);
        slideOutLayout.setBackgroundColor(this.n1.m);
        this.B1 = ((u39) t()).a();
        this.F1 = t() instanceof xs8 ? (xs8) t() : null;
        this.C1 = new yaa(v(), slideOutLayout.findViewById(q0d.frg_local_video__player), ((t1b) ((qm3) this.l1.b)).b(), ((t1b) ((qm3) this.l1.b)).a());
        if (bundle == null && this.X.getBoolean("ru.ok.messages.extra.ANIMATED_FRAGMENT")) {
            frgLocalVideo = this;
            frgLocalVideo.D1 = new iaa(this.C1, this.B1, v(), ((t1b) ((qm3) this.l1.b)).h().f, (m0g) ((t1b) ((qm3) this.l1.b)).getAccessor().c(HttpStatus.SC_FORBIDDEN), frgLocalVideo, (hch) ((t1b) ((qm3) this.l1.b)).getAccessor().c(633), this.F1);
            E0();
        } else {
            frgLocalVideo = this;
            ((View) frgLocalVideo.C1.c).setVisibility(8);
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) slideOutLayout.findViewById(q0d.frg_local_video__iv_video);
        frgLocalVideo.E1 = simpleDraweeView;
        u8j.a(simpleDraweeView, new gk0(6, this));
        SimpleDraweeView simpleDraweeView2 = frgLocalVideo.E1;
        if (frgLocalVideo.w1) {
            simpleDraweeView2.setTransitionName(frgLocalVideo.v1.a());
        }
        wo4 wo4Var = new wo4(29, this);
        WeakHashMap weakHashMap = hfh.a;
        veh.u(slideOutLayout, wo4Var);
        teh.c(slideOutLayout);
        return slideOutLayout;
    }

    @Override // ru.ok.messages.media.mediabar.FrgLocalMedia, ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void P() {
        super.P();
        H0();
    }

    @Override // androidx.fragment.app.a
    public final boolean W(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || !this.k1) {
            return true;
        }
        s0();
        return true;
    }

    @Override // ru.ok.messages.media.mediabar.FrgLocalMedia, ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void X() {
        super.X();
        H0();
    }

    @Override // ru.ok.messages.media.mediabar.FrgLocalMedia, ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void a0() {
        super.a0();
        this.x1.c();
    }

    @Override // defpackage.ne8
    public final void n(pd8 pd8Var, Uri uri, int i, Uri uri2) {
        if (uri != null) {
            this.E1.setImageURI(uri);
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final void v0() {
        iaa iaaVar = this.D1;
        if (iaaVar == null) {
            return;
        }
        oaa oaaVar = (oaa) iaaVar.b;
        if (oaaVar instanceof m7g) {
            ((m7g) oaaVar).b();
        }
    }
}
