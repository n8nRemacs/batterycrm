package ru.ok.messages.media.mediabar;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.b;
import defpackage.avb;
import defpackage.bcg;
import defpackage.c2c;
import defpackage.cei;
import defpackage.d6;
import defpackage.dce;
import defpackage.dz7;
import defpackage.eaa;
import defpackage.fce;
import defpackage.l8g;
import defpackage.ln;
import defpackage.mvd;
import defpackage.n1d;
import defpackage.oe8;
import defpackage.pd8;
import defpackage.q0d;
import defpackage.q1d;
import defpackage.q1g;
import defpackage.qkb;
import defpackage.qm3;
import defpackage.qs3;
import defpackage.sf7;
import defpackage.t1b;
import defpackage.tfi;
import defpackage.vq3;
import defpackage.y9a;
import defpackage.zk6;
import defpackage.zub;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* loaded from: classes2.dex */
public class FrgLocalPhoto extends FrgLocalMedia implements oe8, vq3 {
    public LocalPhotoView B1;

    public final void E0() {
        dz7 dz7VarT = t();
        qs3 qs3Var = dz7VarT instanceof bcg ? ((ActLocalMedias) ((bcg) dz7VarT)).a1 : null;
        if (qs3Var == null) {
            return;
        }
        int i = q0d.menu_local_photo__clear_edit;
        Toolbar toolbar = (Toolbar) qs3Var.c;
        MenuItem menuItemFindItem = toolbar != null ? toolbar.getMenu().findItem(i) : null;
        if (menuItemFindItem == null) {
            return;
        }
        fce fceVarH = ((t1b) ((qm3) this.l1.b)).h().f.h(this.v1);
        if (fceVarH != null) {
            menuItemFindItem.setVisible(zub.b(fceVarH.c, fceVarH.a));
        } else {
            menuItemFindItem.setVisible(false);
        }
        b bVarT = t();
        if (bVarT instanceof ln) {
            bVarT.invalidateOptionsMenu();
        }
    }

    @Override // androidx.fragment.app.a
    public final void N(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(q1d.menu_local_photo, menu);
        q1g q1gVar = this.n1;
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            Drawable icon = menu.getItem(i).getIcon();
            if (icon != null) {
                cei.k(icon, q1gVar.w);
            }
        }
        E0();
    }

    @Override // androidx.fragment.app.a
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(n1d.frg_local_photo, viewGroup, false);
        slideOutLayout.setSlideOutListener(this);
        slideOutLayout.setBackgroundColor(this.n1.m);
        LocalPhotoView localPhotoView = (LocalPhotoView) slideOutLayout.findViewById(q0d.frg_local_photo__iv_photo);
        this.B1 = localPhotoView;
        localPhotoView.setListener(this);
        this.B1.setZoomEnabled(true);
        LocalPhotoView localPhotoView2 = this.B1;
        if (this.w1) {
            localPhotoView2.setTransitionName(this.v1.a());
        }
        return slideOutLayout;
    }

    @Override // androidx.fragment.app.a
    public final boolean W(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            y0();
            d6 d6VarU0 = u0();
            if (d6VarU0 == null || !this.k1) {
                return true;
            }
            d6VarU0.onBackPressed();
            return true;
        }
        if (menuItem.getItemId() != q0d.menu_local_photo__clear_edit) {
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", mvd.n1);
        bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", mvd.q1);
        bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", mvd.p);
        ConfirmationDialog confirmationDialog = new ConfirmationDialog();
        confirmationDialog.n0(bundle);
        confirmationDialog.q0(this, 0);
        confirmationDialog.x0(this.D0, "ru.ok.messages.views.dialogs.ConfirmationDialog");
        return true;
    }

    @Override // ru.ok.messages.media.mediabar.FrgLocalMedia, ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void a0() {
        super.a0();
        this.x1.b();
    }

    @Override // defpackage.oe8
    public final void c() {
        if (B0() != null) {
            ((ActLocalMedias) B0()).V(!r0.X0, false);
        }
    }

    @Override // ru.ok.messages.media.mediabar.FrgLocalMedia, androidx.fragment.app.a
    public final void e0(View view, Bundle bundle) {
        super.e0(view, bundle);
        this.x1.b();
    }

    @Override // defpackage.ne8
    public final void n(pd8 pd8Var, Uri uri, int i, Uri uri2) {
        sf7 sf7VarD = sf7.d(tfi.g(uri.toString()));
        if (uri2 != null) {
            sf7VarD.k = new qkb(uri2);
        }
        c2c c2cVarA = zk6.a.a();
        c2cVarA.b = sf7VarD.a();
        c2cVarA.i = this.B1.getController();
        dce dceVar = ((t1b) ((qm3) this.l1.b)).h().f;
        String str = pd8Var.d;
        int i2 = pd8Var.o;
        if (!l8g.c(str) && !zub.b(dceVar.e(pd8Var), pd8Var)) {
            sf7 sf7VarD2 = sf7.d(tfi.g(pd8Var.d));
            if (i2 != 0) {
                sf7VarD2.k = new avb(i2, 0);
            }
            c2cVarA.c = sf7VarD2.a();
        }
        this.B1.setController(c2cVarA.a());
        E0();
    }

    @Override // ru.ok.messages.views.fragments.FrgSlideOut, defpackage.k4f
    public final void o() {
        super.o();
        this.B1.getZoomableController().reset();
    }

    @Override // defpackage.vq3
    public final void q(Bundle bundle) {
        b bVarT = t();
        if (bVarT instanceof ActLocalMedias) {
            eaa eaaVar = ((ActLocalMedias) bVarT).f1;
            eaaVar.getClass();
            eaaVar.t0 = new zub(null, null, null, null, null);
            eaaVar.N0();
            eaaVar.P0(new y9a(eaaVar, 4));
            eaaVar.P0(new y9a(eaaVar, 0));
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final boolean y0() {
        this.B1.getZoomableController().reset();
        return false;
    }
}
