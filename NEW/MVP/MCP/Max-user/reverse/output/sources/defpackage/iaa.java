package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalVideo;
import ru.ok.messages.video.widgets.VideoPlayerSeekBar;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;
import ru.ok.messages.views.widgets.VideoThumbnailView;

/* loaded from: classes2.dex */
public final class iaa extends i3 implements gdh, t39, s39 {
    public final m0g X;
    public final FrgLocalVideo Y;
    public final hch Z;
    public final xd8 c;
    public final Context d;
    public final dce o;
    public ibh s0;
    public qu1 t0;
    public v08 u0;
    public v08 v0;
    public final xs8 w0;

    public iaa(yaa yaaVar, xd8 xd8Var, Context context, dce dceVar, m0g m0gVar, FrgLocalVideo frgLocalVideo, hch hchVar, xs8 xs8Var) {
        super(0, yaaVar);
        this.c = xd8Var;
        this.d = context;
        this.o = dceVar;
        this.X = m0gVar;
        this.Y = frgLocalVideo;
        this.Z = hchVar;
        this.w0 = xs8Var;
        hbh hbhVar = new hbh();
        hbhVar.a = true;
        this.s0 = new ibh(hbhVar);
        yaaVar.p(this);
        xd8Var.e = this;
    }

    @Override // defpackage.gdh
    public final int B() {
        return this.c.f == null ? 0 : 2;
    }

    @Override // defpackage.gdh
    public final int F() {
        xd8 xd8Var = this.c;
        if (xd8Var.f == null) {
            return 0;
        }
        fl5 fl5Var = xd8Var.b;
        if (fl5Var.Y == null) {
            return 0;
        }
        return fl5Var.u0;
    }

    @Override // defpackage.t39
    public final void G() {
        wqi.c("iaa", "onMediaPlayerControllerDetach", new Object[0]);
    }

    @Override // defpackage.gdh
    public final void J(Surface surface) {
        this.c.j(surface);
    }

    @Override // defpackage.t39
    public final void K(int i, int i2, int i3) {
        yaa yaaVar = (yaa) ((oaa) this.b);
        yaaVar.X.d();
        VideoThumbnailView videoThumbnailView = yaaVar.v0;
        videoThumbnailView.getClass();
        videoThumbnailView.requestLayout();
    }

    public final void L0() {
        N0();
        if (this.s0.a) {
            ssa ssaVarL = vqa.j(2L, 2L, TimeUnit.SECONDS, u0e.a()).l(de.a());
            v08 v08Var = new v08(new faa(this, 3), new p89(23), pdf.d);
            ssaVarL.a(v08Var);
            this.v0 = v08Var;
        }
    }

    @Override // defpackage.gdh
    public final int M() {
        xd8 xd8Var = this.c;
        if (xd8Var.f == null) {
            return 0;
        }
        return xd8Var.b.v0;
    }

    public final void M0() {
        O0();
        ssa ssaVarL = vqa.j(100L, 100L, TimeUnit.MILLISECONDS, u0e.a()).l(de.a());
        v08 v08Var = new v08(new faa(this, 0), new p89(22), pdf.d);
        ssaVarL.a(v08Var);
        this.u0 = v08Var;
    }

    @Override // defpackage.t39
    public final void N() {
        wqi.c("iaa", "onPlaybackPrepared", new Object[0]);
        boolean zD = this.c.d();
        P0(new haa(zD, 1));
        if (zD) {
            M0();
            L0();
        }
    }

    public final void N0() {
        bwd.b(this.v0);
    }

    public final void O0() {
        bwd.b(this.u0);
    }

    public final void P0(ju3 ju3Var) {
        ibh ibhVar = this.s0;
        hbh hbhVar = new hbh();
        hbhVar.a = ibhVar.a;
        hbhVar.b = ibhVar.b;
        hbhVar.c = ibhVar.c;
        hbhVar.d = ibhVar.d;
        hbhVar.e = ibhVar.e;
        hbhVar.f = ibhVar.f;
        hbhVar.g = ibhVar.g;
        hbhVar.h = ibhVar.h;
        hbhVar.i = ibhVar.i;
        ju3Var.accept(hbhVar);
        ibh ibhVar2 = new ibh(hbhVar);
        this.s0 = ibhVar2;
        yaa yaaVar = (yaa) ((oaa) this.b);
        yaaVar.D0 = ibhVar2;
        if (yaaVar.d.a()) {
            big bigVar = new big();
            bigVar.R(new sp5());
            bigVar.I(200L);
            bigVar.p(q0d.view_full_screen_video_player__v_video);
            bigVar.p(q0d.view_full_screen_video_player__iv_thumbnail);
            zhg.a((ViewGroup) ((View) yaaVar.c), bigVar);
        }
        boolean z = ibhVar2.a;
        boolean z2 = ibhVar2.c;
        if (z) {
            yaaVar.z0.setVisibility(0);
            boolean z3 = ibhVar2.b;
            if (z2) {
                if (z3) {
                    yaaVar.s0.setVisibility(0);
                    yaaVar.Z.setVisibility(8);
                } else {
                    yaaVar.s0.setVisibility(8);
                    yaaVar.Z.setVisibility(0);
                }
                yaaVar.t0.setVisibility(0);
            } else {
                if (z3) {
                    yaaVar.s0.setVisibility(0);
                    yaaVar.Z.setVisibility(8);
                } else {
                    yaaVar.s0.setVisibility(8);
                    yaaVar.Z.setVisibility(0);
                }
                yaaVar.t0.setVisibility(8);
            }
            yaaVar.w0.setVisibility(0);
            yaaVar.w0.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            yaaVar.u0.setVisibility(0);
            VideoPlayerSeekBar videoPlayerSeekBar = yaaVar.u0.b;
            long j = ibhVar2.e;
            videoPlayerSeekBar.setMax((int) j);
            long j2 = ibhVar2.f;
            videoPlayerSeekBar.setProgress((int) j2);
            yaaVar.u0.setSecondaryProgress(ibhVar2.g);
            if (j >= 0) {
                TextView textView = yaaVar.x0;
                String[] strArr = l6g.b;
                textView.setText(z7i.a(j));
                yaaVar.x0.setVisibility(0);
            } else {
                yaaVar.x0.setVisibility(8);
            }
            yaaVar.x0.setVisibility(0);
            TextView textView2 = yaaVar.w0;
            String[] strArr2 = l6g.b;
            textView2.setText(z7i.a(j2));
            VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = yaaVar.u0;
            int i = -yaaVar.w0.getWidth();
            int width = yaaVar.x0.getWidth();
            videoPlayerSeekBarPreview.B0 = i;
            videoPlayerSeekBarPreview.C0 = width;
            yaaVar.y0.setVisibility(8);
        } else {
            yaaVar.z0.setVisibility(8);
            ImageView imageView = yaaVar.t0;
            if (z2) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
            yaaVar.Z.setVisibility(8);
            yaaVar.s0.setVisibility(8);
            yaaVar.u0.setVisibility(8);
            yaaVar.x0.setVisibility(8);
            yaaVar.w0.setVisibility(8);
            yaaVar.y0.setVisibility(8);
        }
        f2h f2hVar = ibhVar2.h;
        if (f2hVar != null) {
            yaaVar.u0.setVideoContent(f2hVar);
        }
        yaaVar.X.setVisibility(ibhVar2.i ? 0 : 4);
        yaaVar.Y.setEnabled(false);
        yaaVar.C0.setVisibility(8);
    }

    @Override // defpackage.t39
    public final void Z() {
        wqi.c("iaa", "onTrackChanged", new Object[0]);
    }

    @Override // defpackage.t39
    public final void c() {
        wqi.c("iaa", "onRenderedFirstFrame", new Object[0]);
        N();
    }

    @Override // defpackage.t39
    public final void d() {
        ql6 ql6VarB0;
        wqi.c("iaa", "onPlaybackEnded", new Object[0]);
        O0();
        N0();
        P0(new dk0(18));
        FrgLocalVideo frgLocalVideo = this.Y;
        if (frgLocalVideo == null || (ql6VarB0 = frgLocalVideo.B0()) == null) {
            return;
        }
        ((ActLocalMedias) ql6VarB0).V(true, false);
    }

    @Override // defpackage.gdh
    public final int m() {
        xd8 xd8Var = this.c;
        if (xd8Var.f == null) {
            return 0;
        }
        fl5 fl5Var = xd8Var.b;
        if (fl5Var.Y == null) {
            return 0;
        }
        return fl5Var.t0;
    }

    @Override // defpackage.t39
    public final void o() {
        O0();
        N0();
        P0(new dk0(16));
        FrgLocalVideo frgLocalVideo = this.Y;
        if (frgLocalVideo != null) {
            frgLocalVideo.F0(true);
        }
    }

    @Override // defpackage.t39
    public final void r() {
        P0(new gaa(this, 1));
    }

    @Override // defpackage.t39
    public final void w() {
        wqi.c("iaa", "onPlaybackBuffering", new Object[0]);
        P0(new dk0(19));
    }

    @Override // defpackage.t39
    public final void z(Throwable th) {
        wqi.c("iaa", "onPlaybackError", new Object[0]);
        P0(new dk0(17));
        FrgLocalVideo frgLocalVideo = this.Y;
        if (frgLocalVideo == null) {
            return;
        }
        frgLocalVideo.I0(th);
    }
}
