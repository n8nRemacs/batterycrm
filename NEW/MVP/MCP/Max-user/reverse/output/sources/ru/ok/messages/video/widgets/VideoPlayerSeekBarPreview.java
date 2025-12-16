package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.as8;
import defpackage.bwd;
import defpackage.bwf;
import defpackage.cj4;
import defpackage.de;
import defpackage.f2h;
import defpackage.fwg;
import defpackage.gbh;
import defpackage.gk0;
import defpackage.gu3;
import defpackage.hd8;
import defpackage.j0e;
import defpackage.l6g;
import defpackage.lkd;
import defpackage.lv4;
import defpackage.m0g;
import defpackage.m7g;
import defpackage.m8j;
import defpackage.ml0;
import defpackage.n0g;
import defpackage.n1d;
import defpackage.nca;
import defpackage.nm0;
import defpackage.ny1;
import defpackage.or8;
import defpackage.pdf;
import defpackage.pe4;
import defpackage.pr8;
import defpackage.q0d;
import defpackage.q1g;
import defpackage.r0;
import defpackage.raj;
import defpackage.rw4;
import defpackage.ry;
import defpackage.sf7;
import defpackage.sl6;
import defpackage.sr8;
import defpackage.ssa;
import defpackage.t1b;
import defpackage.tr8;
import defpackage.u0e;
import defpackage.v08;
import defpackage.vj6;
import defpackage.vk3;
import defpackage.vqa;
import defpackage.vw4;
import defpackage.wj6;
import defpackage.wqi;
import defpackage.wra;
import defpackage.xr8;
import defpackage.xt4;
import defpackage.xxg;
import defpackage.yi5;
import defpackage.yni;
import defpackage.z7i;
import defpackage.zb8;
import defpackage.zg;
import defpackage.zm;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.widgets.VideoFramePreview;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;

/* loaded from: classes2.dex */
public class VideoPlayerSeekBarPreview extends LinearLayout implements SeekBar.OnSeekBarChangeListener, m7g {
    public static final /* synthetic */ int D0 = 0;
    public long A0;
    public int B0;
    public int C0;
    public final HashSet a;
    public final VideoPlayerSeekBar b;
    public final VideoFramePreview c;
    public final wj6 d;
    public final zg o;
    public pr8 s0;
    public v08 t0;
    public f2h u0;
    public xt4 v0;
    public xt4 w0;
    public final int x0;
    public final int y0;
    public long z0;

    public VideoPlayerSeekBarPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new HashSet();
        rw4.a();
        this.x0 = vw4.b((int) 120.0f);
        this.y0 = vw4.b((int) 146.0f);
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        View viewInflate = View.inflate(context, n1d.view_video_player_seekbar_preview, this);
        this.c = (VideoFramePreview) viewInflate.findViewById(q0d.video_frame_preview);
        VideoPlayerSeekBar videoPlayerSeekBar = (VideoPlayerSeekBar) viewInflate.findViewById(q0d.video_player_seek_bar);
        this.b = videoPlayerSeekBar;
        videoPlayerSeekBar.setOnSeekBarChangeListener(this);
        this.o = ((t1b) zm.a()).b();
        vj6 vj6Var = (vj6) ((t1b) zm.a()).getAccessor().c(641);
        vj6Var.getClass();
        this.d = new wj6((m0g) vj6Var.d.getValue(), (yi5) vj6Var.b.getValue(), vj6Var.a, (lv4) vj6Var.c.getValue());
        b();
    }

    public final void a() {
        xt4 xt4Var = this.v0;
        VideoFramePreview videoFramePreview = this.c;
        if (xt4Var != null) {
            xt4Var.k();
            this.v0 = null;
            videoFramePreview.setVisibility(4);
            videoFramePreview.setAlpha(1.0f);
        }
        if (videoFramePreview.getVisibility() == 0 && this.w0 == null) {
            xt4 xt4VarF = this.o.f(videoFramePreview);
            xt4VarF.C(new gbh(this, 1));
            this.w0 = xt4VarF;
        }
    }

    @Override // defpackage.m7g
    public final void b() {
        Context context = getContext();
        bwf bwfVar = q1g.a0;
        q1g q1gVarD = nca.d(context);
        int i = q1gVarD.w;
        VideoPlayerSeekBar videoPlayerSeekBar = this.b;
        videoPlayerSeekBar.setProgressColor(i);
        videoPlayerSeekBar.setThumbColor(q1gVarD.w);
        this.c.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bwd.b(this.s0);
        bwd.b(this.t0);
        xt4 xt4Var = this.v0;
        if (xt4Var != null) {
            xt4Var.k();
        }
        xt4 xt4Var2 = this.w0;
        if (xt4Var2 != null) {
            xt4Var2.k();
        }
        wj6 wj6Var = this.d;
        hd8 hd8Var = wj6Var.h;
        if (hd8Var != null) {
            bwd.b(hd8Var.g);
            try {
                hd8Var.h.release();
            } catch (Throwable th) {
                wqi.e("hd8", "fail to release", th);
            }
            hd8Var.j = 0L;
            List<Bitmap> list = (List) hd8Var.f.u();
            if (list != null) {
                for (Bitmap bitmap : list) {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
            }
        }
        lkd lkdVar = wj6Var.i;
        if (lkdVar != null) {
            r0 r0Var = lkdVar.g;
            if (r0Var != null) {
                r0Var.close();
                lkdVar.g = null;
            }
            pe4 pe4Var = lkdVar.h;
            if (pe4Var != null) {
                pe4Var.close();
                lkdVar.h = null;
            }
        }
        this.a.clear();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        float fMin;
        or8 xr8Var;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onProgressChanged(seekBar, i, z);
        }
        if (z && this.u0 == null) {
            return;
        }
        if (!z) {
            a();
            return;
        }
        long j = i;
        wj6 wj6Var = this.d;
        VideoPlayerSeekBar videoPlayerSeekBar = this.b;
        VideoFramePreview videoFramePreview = this.c;
        if (this.u0 == null) {
            return;
        }
        final int i2 = 0;
        if (wj6Var.b() && (((ml0) this.u0).a == 0 || Math.abs(this.z0 - j) > ((ml0) this.u0).a * 0.01d)) {
            if (bwd.c(this.t0)) {
                ssa ssaVarL = vqa.r(1000L, TimeUnit.MILLISECONDS, u0e.a()).l(de.a());
                v08 v08Var = new v08(new gu3(this) { // from class: fbh
                    public final /* synthetic */ VideoPlayerSeekBarPreview b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.gu3
                    public final void accept(Object obj) {
                        int i3 = i2;
                        VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.b;
                        switch (i3) {
                            case 0:
                                int i4 = VideoPlayerSeekBarPreview.D0;
                                videoPlayerSeekBarPreview.getClass();
                                if (System.currentTimeMillis() - videoPlayerSeekBarPreview.A0 > 1000) {
                                    videoPlayerSeekBarPreview.c.a(true);
                                    break;
                                }
                                break;
                            default:
                                int i5 = VideoPlayerSeekBarPreview.D0;
                                videoPlayerSeekBarPreview.A0 = System.currentTimeMillis();
                                bwd.b(videoPlayerSeekBarPreview.t0);
                                VideoFramePreview videoFramePreview2 = videoPlayerSeekBarPreview.c;
                                videoFramePreview2.o.setImageBitmap((Bitmap) obj);
                                videoFramePreview2.a(false);
                                break;
                        }
                    }
                }, new fwg(15), pdf.d);
                ssaVarL.a(v08Var);
                this.t0 = v08Var;
            }
            bwd.b(this.s0);
            f2h f2hVar = wj6Var.e;
            final int i3 = 1;
            if (f2hVar == null) {
                wqi.e("wj6", "You should call setVideoContent before extractFrame!", null);
                xr8Var = tr8.a;
            } else {
                Uri uriA = ((ml0) f2hVar).a();
                int i4 = xxg.a;
                String scheme = uriA.getScheme();
                if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                    hd8 hd8Var = wj6Var.h;
                    int iMin = Math.min(hd8Var.i - 1, (int) Math.floor(j / (hd8Var.j / hd8Var.i)));
                    xr8Var = new xr8(new wra(hd8Var.f.g(new cj4(iMin, 5))), new cj4(iMin, 6), 0);
                } else {
                    lkd lkdVar = wj6Var.i;
                    pe4 pe4Var = lkdVar.h;
                    if (pe4Var != null) {
                        pe4Var.close();
                        lkdVar.h = null;
                    }
                    xr8Var = new sr8(new ny1(lkdVar, j, 10));
                }
            }
            j0e j0eVarA = de.a();
            pr8 pr8Var = new pr8(new gu3(this) { // from class: fbh
                public final /* synthetic */ VideoPlayerSeekBarPreview b;

                {
                    this.b = this;
                }

                @Override // defpackage.gu3
                public final void accept(Object obj) {
                    int i32 = i3;
                    VideoPlayerSeekBarPreview videoPlayerSeekBarPreview = this.b;
                    switch (i32) {
                        case 0:
                            int i42 = VideoPlayerSeekBarPreview.D0;
                            videoPlayerSeekBarPreview.getClass();
                            if (System.currentTimeMillis() - videoPlayerSeekBarPreview.A0 > 1000) {
                                videoPlayerSeekBarPreview.c.a(true);
                                break;
                            }
                            break;
                        default:
                            int i5 = VideoPlayerSeekBarPreview.D0;
                            videoPlayerSeekBarPreview.A0 = System.currentTimeMillis();
                            bwd.b(videoPlayerSeekBarPreview.t0);
                            VideoFramePreview videoFramePreview2 = videoPlayerSeekBarPreview.c;
                            videoFramePreview2.o.setImageBitmap((Bitmap) obj);
                            videoFramePreview2.a(false);
                            break;
                    }
                }
            }, new ny1(this, j, 13), new gk0(15, this));
            try {
                xr8Var.e(new as8(pr8Var, j0eVarA, 0));
                this.s0 = pr8Var;
                this.z0 = j;
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                raj.c(th);
                NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        }
        xt4 xt4Var = this.w0;
        if (xt4Var != null) {
            xt4Var.k();
            this.w0 = null;
            videoFramePreview.setVisibility(0);
            videoFramePreview.setAlpha(1.0f);
        }
        if (videoFramePreview.getVisibility() != 0 && this.v0 == null) {
            videoFramePreview.setAlpha(0.0f);
            xt4 xt4VarE = this.o.e(videoFramePreview);
            xt4VarE.C(new gbh(this, 0));
            this.v0 = xt4VarE;
        }
        AppCompatTextView appCompatTextView = videoFramePreview.s0;
        String[] strArr = l6g.b;
        appCompatTextView.setText(z7i.a(j));
        if (m8j.d(this)) {
            fMin = Math.min(-this.B0, Math.max((videoFramePreview.getWidth() - this.C0) - videoPlayerSeekBar.getWidth(), (videoFramePreview.getWidth() / 2.0f) + ((videoPlayerSeekBar.getThumbOffset() + (getPaddingLeft() + videoPlayerSeekBar.getThumb().getBounds().centerX())) - videoPlayerSeekBar.getWidth())));
        } else {
            fMin = Math.min((videoPlayerSeekBar.getWidth() + this.C0) - videoFramePreview.getWidth(), Math.max(this.B0, (videoPlayerSeekBar.getThumbOffset() + (getPaddingLeft() + videoPlayerSeekBar.getThumb().getBounds().centerX())) - (videoFramePreview.getWidth() / 2.0f)));
        }
        videoFramePreview.setTranslationX(fMin);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((SeekBar.OnSeekBarChangeListener) it.next()).onStopTrackingTouch(seekBar);
        }
        if (this.u0 == null) {
            return;
        }
        a();
    }

    public void setSecondaryProgress(long j) {
        this.b.setSecondaryProgress((int) j);
    }

    public void setVideoContent(f2h f2hVar) {
        int i;
        if (f2hVar.equals(this.u0)) {
            return;
        }
        this.u0 = f2hVar;
        int width = f2hVar.getWidth();
        int height = f2hVar.getHeight();
        int i2 = this.x0;
        if (width <= 0 || height <= 0) {
            i = i2;
        } else if (width < height) {
            int[] iArrD = yni.d(i2, i2, width, height);
            i2 = iArrD[0];
            i = iArrD[1];
        } else {
            int i3 = this.y0;
            int[] iArrD2 = yni.d(i3, i3, width, height);
            i2 = iArrD2[0];
            i = iArrD2[1];
        }
        VideoFramePreview videoFramePreview = this.c;
        ViewGroup.LayoutParams layoutParams = videoFramePreview.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i;
        videoFramePreview.setLayoutParams(layoutParams);
        wj6 wj6Var = this.d;
        wj6Var.a(f2hVar, i2, i);
        if (!wj6Var.b()) {
            videoFramePreview.setPreviewEnabled(false);
            videoFramePreview.a(false);
            return;
        }
        videoFramePreview.setPreviewEnabled(true);
        if (wj6Var.e == null) {
            wqi.e("wj6", "You should call setVideoContent before prepare!", null);
            return;
        }
        if (wj6Var.b()) {
            Uri uriA = ((ml0) wj6Var.e).a();
            int i4 = xxg.a;
            String scheme = uriA.getScheme();
            if (!TextUtils.isEmpty(scheme) && !"file".equals(scheme)) {
                lkd lkdVar = wj6Var.i;
                f2h f2hVar2 = lkdVar.e;
                if (f2hVar2 == null) {
                    wqi.e("lkd", "You should call setVideoContent before prepare!", null);
                    return;
                }
                ry ryVar = ((ml0) f2hVar2).e;
                if (ryVar == null) {
                    wqi.e("lkd", "Video collage is null", null);
                    return;
                } else {
                    lkdVar.g = lkdVar.f.e(sf7.d(Uri.parse((String) ryVar.X)).a(), null);
                    return;
                }
            }
            hd8 hd8Var = wj6Var.h;
            m0g m0gVar = hd8Var.a;
            if (hd8Var.e == null) {
                wqi.e("hd8", "You should call setVideoContent before prepare!", null);
                return;
            }
            vk3 vk3Var = new vk3(2, new sl6(10, hd8Var));
            m0gVar.getClass();
            n0g n0gVar = (n0g) m0gVar;
            ssa ssaVarL = vk3Var.p(n0gVar.a()).l(n0gVar.b());
            nm0 nm0Var = hd8Var.f;
            Objects.requireNonNull(nm0Var);
            v08 v08Var = new v08(new sl6(11, nm0Var), new zb8(1), pdf.d);
            ssaVarL.a(v08Var);
            hd8Var.g = v08Var;
        }
    }
}
