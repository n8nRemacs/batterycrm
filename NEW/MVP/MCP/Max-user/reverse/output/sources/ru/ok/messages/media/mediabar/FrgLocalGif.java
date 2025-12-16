package ru.ok.messages.media.mediabar;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import defpackage.c20;
import defpackage.c2c;
import defpackage.f8j;
import defpackage.gr6;
import defpackage.l8g;
import defpackage.n1d;
import defpackage.oe8;
import defpackage.pd8;
import defpackage.q0d;
import defpackage.rf7;
import defpackage.tfi;
import defpackage.ye6;
import defpackage.zk6;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* loaded from: classes2.dex */
public class FrgLocalGif extends FrgLocalMedia implements oe8 {
    public SimpleDraweeView B1;

    @Override // androidx.fragment.app.a
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(n1d.frg_local_gif, viewGroup, false);
        slideOutLayout.setSlideOutListener(this);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) slideOutLayout.findViewById(q0d.frg_local_gif__drawee);
        this.B1 = simpleDraweeView;
        ((gr6) simpleDraweeView.getHierarchy()).i(new c20(v(), -1), 3);
        f8j.d(this.B1, 300L, new ye6(1, this));
        SimpleDraweeView simpleDraweeView2 = this.B1;
        if (this.w1) {
            simpleDraweeView2.setTransitionName(this.v1.a());
        }
        return slideOutLayout;
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

    @Override // defpackage.ne8
    public final void n(pd8 pd8Var, Uri uri, int i, Uri uri2) {
        c2c c2cVarA = zk6.a.a();
        c2cVarA.c(tfi.g(uri.toString()));
        c2cVarA.i = this.B1.getController();
        c2cVarA.g = true;
        if (!l8g.c(pd8Var.d)) {
            c2cVarA.c = rf7.a(tfi.g(pd8Var.d));
        }
        this.B1.setController(c2cVarA.a());
    }
}
