package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.media.trim.ActTrimVideo;
import ru.ok.messages.media.trim.FrgTrimVideo;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.messages.video.widgets.VideoView;

/* loaded from: classes2.dex */
public final class kba extends j3 implements m7g, sva, oaa {
    public AppCompatImageButton A0;
    public AppCompatImageButton B0;
    public ProgressBar C0;
    public q1g D0;
    public final FrgTrimVideo X;
    public final zg Y;
    public qs3 Z;
    public final FrgTrimVideo d;
    public final py0 o;
    public VideoView s0;
    public ImageButton t0;
    public ImageButton u0;
    public TextView v0;
    public TextView w0;
    public RangeSeekBarView x0;
    public ViewGroup y0;
    public TextView z0;

    public kba(Context context, ViewGroup viewGroup, FrgTrimVideo frgTrimVideo, py0 py0Var, FrgTrimVideo frgTrimVideo2, zg zgVar) {
        super(context);
        this.d = frgTrimVideo;
        this.o = py0Var;
        this.X = frgTrimVideo2;
        this.Y = zgVar;
        this.c = LayoutInflater.from((Context) this.b).inflate(n1d.cl_trim_video, viewGroup, false);
        i();
    }

    public final void A(boolean z) {
        if (z) {
            this.z0.setAlpha(1.0f);
            this.z0.setBackground(this.D0.a());
        } else {
            this.z0.setAlpha(0.3f);
            this.z0.setBackground(null);
        }
    }

    public final void B(boolean z, boolean z2) {
        zg zgVar = this.Y;
        if (z) {
            zgVar.e((Toolbar) this.Z.c);
            zgVar.e(this.y0);
        } else {
            zgVar.f((Toolbar) this.Z.c);
            zgVar.f(this.y0);
        }
        FrgTrimVideo frgTrimVideo = this.X;
        if (z) {
            if (frgTrimVideo.t() != null) {
                ((ActTrimVideo) frgTrimVideo.t()).L(null);
            }
        } else if (frgTrimVideo.t() != null) {
            ActTrimVideo actTrimVideo = (ActTrimVideo) frgTrimVideo.t();
            View decorView = actTrimVideo.getWindow().getDecorView();
            decorView.setOnSystemUiVisibilityChangeListener(null);
            decorView.setSystemUiVisibility(actTrimVideo.f().c ? 3846 : 3862);
        }
        if (!z2) {
            if (z) {
                zgVar.e(this.t0);
            }
        } else if (z) {
            zgVar.e(this.u0);
        } else {
            zgVar.f(this.u0);
        }
    }

    @Override // defpackage.m7g
    public final void b() {
        String strY;
        Context context = (Context) this.b;
        if (((View) this.c) == null) {
            return;
        }
        bwf bwfVar = q1g.a0;
        q1g q1gVarD = nca.d(context);
        this.D0 = q1gVarD;
        ((View) this.c).setBackgroundColor(q1gVarD.m);
        View view = (View) this.c;
        q1g q1gVar = this.D0;
        Toolbar toolbar = (Toolbar) view.findViewById(q0d.trim_video__toolbar);
        int i = rw4.a().m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) toolbar.getLayoutParams();
        if (marginLayoutParams.topMargin != i) {
            marginLayoutParams.topMargin = i;
            toolbar.setLayoutParams(marginLayoutParams);
        }
        pea peaVar = new pea(this.o, toolbar);
        peaVar.b = q1gVar;
        qs3 qs3Var = new qs3(peaVar);
        this.Z = qs3Var;
        Toolbar toolbar2 = (Toolbar) qs3Var.c;
        if (toolbar2 != null) {
            toolbar2.setNavigationIcon((Drawable) null);
        }
        qs3 qs3Var2 = this.Z;
        int i2 = mvd.d2;
        py0 py0Var = (py0) qs3Var2.b;
        if (i2 == 0) {
            py0Var.getClass();
            strY = "";
        } else {
            WeakReference weakReference = (WeakReference) py0Var.c;
            WeakReference weakReference2 = (WeakReference) py0Var.b;
            if (weakReference.get() != null) {
                strY = ((ln) ((WeakReference) py0Var.c).get()).getString(i2);
            } else {
                if (weakReference2.get() == null) {
                    throw new IllegalStateException("ContextWeakWrapper should have Activity or Fragment");
                }
                strY = ((a) weakReference2.get()).y(i2);
            }
        }
        TextView textView = (TextView) qs3Var2.o;
        if (textView != null && i2 != -1) {
            textView.setText(strY);
        }
        qs3 qs3Var3 = this.Z;
        View view2 = (View) qs3Var3.Z;
        if (view2 != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view2.getLayoutParams();
            layoutParams.gravity = 17;
            ((View) qs3Var3.Z).setLayoutParams(layoutParams);
        } else {
            TextView textView2 = (TextView) qs3Var3.o;
            if (textView2 != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView2.getLayoutParams();
                layoutParams2.gravity = 17;
                ((TextView) qs3Var3.o).setLayoutParams(layoutParams2);
            }
        }
        TextView textView3 = (TextView) qs3Var3.X;
        if (textView3 != null) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) textView3.getLayoutParams();
            layoutParams3.gravity = 17;
            ((TextView) qs3Var3.X).setLayoutParams(layoutParams3);
        }
        this.t0.setColorFilter(this.D0.t);
        this.u0.setColorFilter(this.D0.t);
        ImageButton imageButton = this.t0;
        q1g q1gVar2 = this.D0;
        imageButton.setBackground(uga.g(uga.d(Integer.valueOf(q1gVar2.r), null, null), uga.d(Integer.valueOf(zob.b(q1gVar2.r, 0.8f)), null, null), null));
        ImageButton imageButton2 = this.u0;
        q1g q1gVar3 = this.D0;
        imageButton2.setBackground(uga.g(uga.d(Integer.valueOf(q1gVar3.r), null, null), uga.d(Integer.valueOf(zob.b(q1gVar3.r, 0.8f)), null, null), null));
        this.v0.setTextColor(this.D0.M);
        this.w0.setTextColor(this.D0.M);
        t35.g(this.A0.getDrawable(), this.D0.w);
        t35.g(this.B0.getDrawable(), this.D0.k);
        this.A0.setBackground(this.D0.a());
        this.B0.setBackground(this.D0.a());
        this.z0.setTextColor(this.D0.w);
        if (this.z0.getAlpha() == 1.0f) {
            this.z0.setBackground(this.D0.a());
        }
        this.z0.setBackground(this.D0.a());
        this.y0.setBackgroundColor(this.D0.m);
        t35.g(this.C0.getIndeterminateDrawable(), this.D0.k);
    }

    @Override // defpackage.j3
    public final void i() {
        ImageButton imageButton = (ImageButton) ((View) this.c).findViewById(q0d.trim_video__btn_play);
        this.t0 = imageButton;
        final int i = 0;
        u8j.a(imageButton, new p6(this) { // from class: jba
            public final /* synthetic */ kba b;

            {
                this.b = this;
            }

            @Override // defpackage.p6
            public final void run() {
                switch (i) {
                    case 0:
                        this.b.j(new bba(7));
                        break;
                    case 1:
                        this.b.j(new bba(4));
                        break;
                    case 2:
                        this.b.j(new bba(6));
                        break;
                    case 3:
                        this.b.j(new bba(5));
                        break;
                    case 4:
                        this.b.j(new bba(3));
                        break;
                    default:
                        this.b.j(new bba(8));
                        break;
                }
            }
        });
        ImageButton imageButton2 = (ImageButton) ((View) this.c).findViewById(q0d.trim_video__btn_pause);
        this.u0 = imageButton2;
        final int i2 = 1;
        u8j.a(imageButton2, new p6(this) { // from class: jba
            public final /* synthetic */ kba b;

            {
                this.b = this;
            }

            @Override // defpackage.p6
            public final void run() {
                switch (i2) {
                    case 0:
                        this.b.j(new bba(7));
                        break;
                    case 1:
                        this.b.j(new bba(4));
                        break;
                    case 2:
                        this.b.j(new bba(6));
                        break;
                    case 3:
                        this.b.j(new bba(5));
                        break;
                    case 4:
                        this.b.j(new bba(3));
                        break;
                    default:
                        this.b.j(new bba(8));
                        break;
                }
            }
        });
        RangeSeekBarView rangeSeekBarView = (RangeSeekBarView) ((View) this.c).findViewById(q0d.trim_video__range_seek_bar_view);
        this.x0 = rangeSeekBarView;
        rangeSeekBarView.setOnChangeRangeSeekBarListener(this);
        this.v0 = (TextView) ((View) this.c).findViewById(q0d.trim_video__startTime);
        this.w0 = (TextView) ((View) this.c).findViewById(q0d.trim_video__endTime);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ((View) this.c).findViewById(q0d.trim_video__close);
        this.A0 = appCompatImageButton;
        final int i3 = 2;
        u8j.a(appCompatImageButton, new p6(this) { // from class: jba
            public final /* synthetic */ kba b;

            {
                this.b = this;
            }

            @Override // defpackage.p6
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.j(new bba(7));
                        break;
                    case 1:
                        this.b.j(new bba(4));
                        break;
                    case 2:
                        this.b.j(new bba(6));
                        break;
                    case 3:
                        this.b.j(new bba(5));
                        break;
                    case 4:
                        this.b.j(new bba(3));
                        break;
                    default:
                        this.b.j(new bba(8));
                        break;
                }
            }
        });
        TextView textView = (TextView) ((View) this.c).findViewById(q0d.trim_video__reset);
        this.z0 = textView;
        final int i4 = 3;
        u8j.a(textView, new p6(this) { // from class: jba
            public final /* synthetic */ kba b;

            {
                this.b = this;
            }

            @Override // defpackage.p6
            public final void run() {
                switch (i4) {
                    case 0:
                        this.b.j(new bba(7));
                        break;
                    case 1:
                        this.b.j(new bba(4));
                        break;
                    case 2:
                        this.b.j(new bba(6));
                        break;
                    case 3:
                        this.b.j(new bba(5));
                        break;
                    case 4:
                        this.b.j(new bba(3));
                        break;
                    default:
                        this.b.j(new bba(8));
                        break;
                }
            }
        });
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ((View) this.c).findViewById(q0d.trim_video__apply);
        this.B0 = appCompatImageButton2;
        final int i5 = 4;
        u8j.a(appCompatImageButton2, new p6(this) { // from class: jba
            public final /* synthetic */ kba b;

            {
                this.b = this;
            }

            @Override // defpackage.p6
            public final void run() {
                switch (i5) {
                    case 0:
                        this.b.j(new bba(7));
                        break;
                    case 1:
                        this.b.j(new bba(4));
                        break;
                    case 2:
                        this.b.j(new bba(6));
                        break;
                    case 3:
                        this.b.j(new bba(5));
                        break;
                    case 4:
                        this.b.j(new bba(3));
                        break;
                    default:
                        this.b.j(new bba(8));
                        break;
                }
            }
        });
        this.C0 = (ProgressBar) ((View) this.c).findViewById(q0d.trim_video__apply_progress);
        this.y0 = (ViewGroup) ((View) this.c).findViewById(q0d.trim_video__bottom_group);
        VideoView videoView = (VideoView) ((View) this.c).findViewById(q0d.trim_video__view_video);
        this.s0 = videoView;
        final int i6 = 5;
        u8j.a(videoView, new p6(this) { // from class: jba
            public final /* synthetic */ kba b;

            {
                this.b = this;
            }

            @Override // defpackage.p6
            public final void run() {
                switch (i6) {
                    case 0:
                        this.b.j(new bba(7));
                        break;
                    case 1:
                        this.b.j(new bba(4));
                        break;
                    case 2:
                        this.b.j(new bba(6));
                        break;
                    case 3:
                        this.b.j(new bba(5));
                        break;
                    case 4:
                        this.b.j(new bba(3));
                        break;
                    default:
                        this.b.j(new bba(8));
                        break;
                }
            }
        });
        b();
        ViewGroup viewGroup = this.y0;
        xu9 xu9Var = new xu9(i6, this);
        WeakHashMap weakHashMap = hfh.a;
        veh.u(viewGroup, xu9Var);
        teh.c(this.y0);
    }

    @Override // defpackage.j3
    public final void p(Object obj) {
        naa naaVar = (naa) obj;
        super.p(naaVar);
        this.s0.a(naaVar);
    }

    public final void z(long j, long j2, long j3, long j4) {
        RangeSeekBarView rangeSeekBarView = this.x0;
        rangeSeekBarView.D0 = j4;
        rangeSeekBarView.H0 = this.d;
        float f = j4;
        rangeSeekBarView.C0 = j / f;
        rangeSeekBarView.A0 = j2 / f;
        rangeSeekBarView.B0 = j3 / f;
        rangeSeekBarView.y0 = 1000.0f / f;
        rangeSeekBarView.z0 = 1.0f;
        rangeSeekBarView.E0 = true;
        int i = RangeSeekBarView.P0;
        rangeSeekBarView.invalidate();
        TextView textView = this.v0;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        textView.setText(ml6.c(timeUnit.toSeconds(j2)));
        this.w0.setText(ml6.c(timeUnit.toSeconds(j3)));
    }
}
