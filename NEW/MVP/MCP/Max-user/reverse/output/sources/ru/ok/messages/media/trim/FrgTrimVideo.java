package ru.ok.messages.media.trim;

import android.content.res.Configuration;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bwd;
import defpackage.kba;
import defpackage.naa;
import defpackage.oaa;
import defpackage.py0;
import defpackage.qm3;
import defpackage.t1b;
import defpackage.u39;
import defpackage.wqi;
import defpackage.xd8;
import ru.ok.messages.views.fragments.base.FrgBase;

/* loaded from: classes2.dex */
public class FrgTrimVideo extends FrgBase {
    public MediaMetadataRetriever u1;
    public naa v1;
    public Uri w1;

    public final void B0() {
        MediaMetadataRetriever mediaMetadataRetriever = this.u1;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable th) {
                wqi.e("ru.ok.messages.media.trim.FrgTrimVideo", "fail to release", th);
            }
            this.u1 = null;
        }
        naa naaVar = this.v1;
        if (naaVar != null) {
            ((kba) ((oaa) naaVar.b)).s0.b();
            xd8 xd8Var = naaVar.X;
            if (xd8Var.g == naaVar) {
                if (xd8Var.f != null) {
                    wqi.c("xd8", "Stop %s", xd8Var.a);
                    xd8Var.b.B();
                }
                xd8Var.e = null;
                xd8Var.j(null);
                xd8Var.g = null;
            }
            bwd.b(naaVar.w0);
            naaVar.w0 = null;
            bwd.b(naaVar.v0);
            naaVar.v0 = null;
            this.v1 = null;
        }
    }

    @Override // androidx.fragment.app.a
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.w1 = (Uri) this.X.getParcelable("ru.ok.tamtam.extra.VIDEO_URI");
        ((ActTrimVideo) t()).L(null);
        kba kbaVar = new kba(layoutInflater.getContext(), viewGroup, this, new py0(this), this, ((t1b) ((qm3) this.l1.b)).b());
        naa naaVar = new naa(kbaVar, this, ((t1b) ((qm3) this.l1.b)).a(), this.w1.toString(), ((u39) t()).a(), this.X.getLong("ru.ok.tamtam.extra.START_POSITION", 0L), this.X.getLong("ru.ok.tamtam.extra.END_POSITION", 0L), this.X.getBoolean("ru.ok.tamtam.extra.MUTE"));
        this.v1 = naaVar;
        if (bundle != null) {
            naaVar.t0 = bundle.getLong("ru.ok.tamtam.extra.POINTER_POSITION");
            naaVar.Z = bundle.getLong("ru.ok.tamtam.extra.START_POSITION");
            long j = bundle.getLong("ru.ok.tamtam.extra.END_POSITION");
            naaVar.s0 = j;
            kbaVar.z(naaVar.t0, naaVar.Z, j, naaVar.Y);
            naaVar.O0();
        }
        return (View) kbaVar.c;
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void P() {
        super.P();
        B0();
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void X() {
        super.X();
        naa naaVar = this.v1;
        if (naaVar != null) {
            naaVar.D0();
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void b0(Bundle bundle) {
        super.b0(bundle);
        naa naaVar = this.v1;
        if (naaVar != null) {
            bundle.putLong("ru.ok.tamtam.extra.POINTER_POSITION", naaVar.t0);
            bundle.putLong("ru.ok.tamtam.extra.START_POSITION", naaVar.Z);
            bundle.putLong("ru.ok.tamtam.extra.END_POSITION", naaVar.s0);
        }
    }

    @Override // androidx.fragment.app.a, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.Q0 = true;
        naa naaVar = this.v1;
        ((kba) ((oaa) naaVar.b)).z(naaVar.t0, naaVar.Z, naaVar.s0, naaVar.Y);
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final String t0() {
        return "TRIM_VIDEO";
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase
    public final boolean y0() {
        B0();
        return false;
    }
}
