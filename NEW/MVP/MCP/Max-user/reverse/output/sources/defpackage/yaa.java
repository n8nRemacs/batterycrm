package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.Iterator;
import java.util.Set;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;
import ru.ok.messages.video.widgets.PinchToZoomVideoViewWrapper;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;
import ru.ok.messages.video.widgets.VideoView;
import ru.ok.messages.video.widgets.doubleTap.DoubleTapVideoViewWrapper;
import ru.ok.messages.views.widgets.VideoThumbnailView;

/* loaded from: classes2.dex */
public final class yaa extends j3 implements m7g, SeekBar.OnSeekBarChangeListener {
    public View A0;
    public View B0;
    public LiveVideoPlaceHolderView C0;
    public ibh D0;
    public VideoView X;
    public PinchToZoomVideoViewWrapper Y;
    public ImageButton Z;
    public final zg d;
    public final dd o;
    public ImageButton s0;
    public ImageView t0;
    public VideoPlayerSeekBarPreview u0;
    public VideoThumbnailView v0;
    public TextView w0;
    public TextView x0;
    public ImageButton y0;
    public View z0;

    public yaa(Context context, View view, zg zgVar, dd ddVar) {
        super(context);
        this.d = zgVar;
        this.o = ddVar;
        this.c = view;
        i();
    }

    @Override // defpackage.m7g
    public final void b() {
        Context context = (Context) this.b;
        bwf bwfVar = q1g.a0;
        q1g q1gVarD = nca.d(context);
        ImageButton imageButton = this.Z;
        int i = q1gVarD.t;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageButton.setColorFilter(i, mode);
        this.s0.setColorFilter(q1gVarD.t, mode);
        ImageButton imageButton2 = this.Z;
        int i2 = q1gVarD.r;
        imageButton2.setBackground(uga.g(uga.d(Integer.valueOf(i2), null, null), uga.d(Integer.valueOf(zob.b(i2, 0.8f)), null, null), null));
        this.s0.setBackground(uga.g(uga.d(Integer.valueOf(i2), null, null), uga.d(Integer.valueOf(zob.b(i2, 0.8f)), null, null), null));
        TextView textView = this.x0;
        int i3 = q1gVarD.w;
        textView.setTextColor(i3);
        this.w0.setTextColor(i3);
        ImageButton imageButton3 = this.y0;
        mch mchVar = new mch(cei.h(ovd.a, i3, context));
        mchVar.Z = new RectF();
        mchVar.s0 = new Path();
        zm zmVar = zm.d;
        rw4 rw4VarA = rw4.a();
        mchVar.o = rw4VarA;
        Paint paint = new Paint();
        mchVar.X = paint;
        paint.setColor(-16777216);
        paint.setTextSize(rw4VarA.u);
        paint.setStrokeWidth(rw4VarA.a);
        paint.setTypeface(mch.t0);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        mchVar.Y = paint2;
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        imageButton3.setImageDrawable(mchVar);
        this.y0.setBackground(q1gVarD.a());
        this.u0.b();
        this.A0.setBackgroundColor(q1gVarD.m);
    }

    @Override // defpackage.j3
    public final void i() {
        this.X = (VideoView) ((View) this.c).findViewById(q0d.view_full_screen_video_player__v_video);
        this.Y = (PinchToZoomVideoViewWrapper) ((View) this.c).findViewById(q0d.view_full_screen_video_player__pinch_to_zoom_v_video_wrapper);
        this.Z = (ImageButton) ((View) this.c).findViewById(q0d.view_full_screen_video_player__btn_play);
        this.s0 = (ImageButton) ((View) this.c).findViewById(q0d.view_full_screen_video_player__btn_pause);
        ImageView imageView = (ImageView) ((View) this.c).findViewById(q0d.view_full_screen_video_player__progress);
        this.t0 = imageView;
        imageView.setImageDrawable(new c20(((View) this.c).getContext(), 0));
        this.u0 = (VideoPlayerSeekBarPreview) ((View) this.c).findViewById(q0d.view_video_player_controls__sb_seek_preview);
        this.v0 = (VideoThumbnailView) ((View) this.c).findViewById(q0d.view_full_screen_video_player__iv_thumbnail);
        this.w0 = (TextView) ((View) this.c).findViewById(q0d.view_video_player_controls__tv_time);
        this.x0 = (TextView) ((View) this.c).findViewById(q0d.view_video_player_controls__tv_duration);
        this.y0 = (ImageButton) ((View) this.c).findViewById(q0d.view_video_player_controls__btn_settings);
        this.z0 = ((View) this.c).findViewById(q0d.view_full_screen_video_player__controls);
        this.A0 = ((View) this.c).findViewById(q0d.view_video_player_controls__v_background);
        this.B0 = ((View) this.c).findViewById(q0d.view_video_player_controls__cl_content);
        this.C0 = (LiveVideoPlaceHolderView) ((View) this.c).findViewById(q0d.view_full_screen_video_player__live_placeholder);
        ((ViewGroup) this.z0).setClipChildren(false);
        ((ViewGroup) this.B0).setClipChildren(false);
        final int i = 0;
        u8j.a(this.Z, new p6(this) { // from class: xaa
            public final /* synthetic */ yaa b;

            {
                this.b = this;
            }

            @Override // defpackage.p6
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.j(new dk0(25));
                        break;
                    case 1:
                        this.b.j(new dk0(24));
                        break;
                    default:
                        Iterator it = ((Set) this.b.a).iterator();
                        while (it.hasNext()) {
                            ((iaa) it.next()).getClass();
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        u8j.a(this.s0, new p6(this) { // from class: xaa
            public final /* synthetic */ yaa b;

            {
                this.b = this;
            }

            @Override // defpackage.p6
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.j(new dk0(25));
                        break;
                    case 1:
                        this.b.j(new dk0(24));
                        break;
                    default:
                        Iterator it = ((Set) this.b.a).iterator();
                        while (it.hasNext()) {
                            ((iaa) it.next()).getClass();
                        }
                        break;
                }
            }
        });
        final int i3 = 2;
        u8j.a(this.y0, new p6(this) { // from class: xaa
            public final /* synthetic */ yaa b;

            {
                this.b = this;
            }

            @Override // defpackage.p6
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.j(new dk0(25));
                        break;
                    case 1:
                        this.b.j(new dk0(24));
                        break;
                    default:
                        Iterator it = ((Set) this.b.a).iterator();
                        while (it.hasNext()) {
                            ((iaa) it.next()).getClass();
                        }
                        break;
                }
            }
        });
        this.u0.a.add(this);
        b();
        Context context = (Context) this.b;
        uaa uaaVar = new uaa(context, (DoubleTapVideoViewWrapper) ((View) this.c).findViewById(q0d.view_full_screen_video_player__double_tap_wrapper), this.d);
        saa saaVar = new saa();
        saaVar.c = false;
        saaVar.a = 0;
        new w9a(uaaVar, new taa(saaVar), context, this.o).t0 = this;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        j(new dk0(23));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        for (iaa iaaVar : (Set) this.a) {
            int progress = seekBar.getProgress();
            xd8 xd8Var = iaaVar.c;
            xd8Var.i(progress);
            iaaVar.getClass();
            iaaVar.P0(new gaa(iaaVar, 0));
            if (xd8Var.d()) {
                iaaVar.M0();
                iaaVar.L0();
            }
        }
    }
}
