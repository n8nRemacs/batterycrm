package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import defpackage.a59;
import defpackage.avc;
import defpackage.b59;
import defpackage.bwc;
import defpackage.c59;
import defpackage.d1d;
import defpackage.d59;
import defpackage.d69;
import defpackage.dvi;
import defpackage.e59;
import defpackage.f59;
import defpackage.fvc;
import defpackage.g59;
import defpackage.h1d;
import defpackage.j4d;
import defpackage.k69;
import defpackage.l69;
import defpackage.pkb;
import defpackage.pxc;
import defpackage.r69;
import defpackage.r98;
import defpackage.rf3;
import defpackage.t49;
import defpackage.vc;
import defpackage.xo8;
import defpackage.z0d;
import defpackage.z49;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d extends vc {
    public static final boolean y1 = Log.isLoggable("MediaRouteCtrlDialog", 3);
    public static final int z1 = (int) TimeUnit.SECONDS.toMillis(30);
    public FrameLayout A0;
    public LinearLayout B0;
    public FrameLayout C0;
    public ImageView D0;
    public TextView E0;
    public TextView F0;
    public TextView G0;
    public final boolean H0;
    public final boolean I0;
    public LinearLayout J0;
    public RelativeLayout K0;
    public LinearLayout L0;
    public View M0;
    public OverlayListView N0;
    public c O0;
    public ArrayList P0;
    public HashSet Q0;
    public HashSet R0;
    public HashSet S0;
    public SeekBar T0;
    public g59 U0;
    public k69 V0;
    public int W0;
    public int X0;
    public final l69 Y;
    public int Y0;
    public final t49 Z;
    public final int Z0;
    public HashMap a1;
    public MediaControllerCompat b1;
    public final f59 c1;
    public PlaybackStateCompat d1;
    public MediaDescriptionCompat e1;
    public e59 f1;
    public Bitmap g1;
    public Uri h1;
    public boolean i1;
    public Bitmap j1;
    public int k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public int q1;
    public int r1;
    public final k69 s0;
    public int s1;
    public final Context t0;
    public Interpolator t1;
    public boolean u0;
    public final Interpolator u1;
    public int v0;
    public final Interpolator v1;
    public Button w0;
    public final AccessibilityManager w1;
    public Button x0;
    public final r98 x1;
    public ImageButton y0;
    public MediaRouteExpandCollapseButton z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context) {
        boolean z = true;
        ContextThemeWrapper contextThemeWrapperA = r69.a(context, true);
        int iG = r69.g(contextThemeWrapperA, avc.mediaRouteTheme);
        super(contextThemeWrapperA, iG == 0 ? r69.e(contextThemeWrapperA) : iG);
        this.H0 = true;
        this.x1 = new r98(5, this);
        Context context2 = getContext();
        this.t0 = context2;
        this.c1 = new f59(this);
        this.Y = l69.d(context2);
        if (l69.d == null) {
            z = false;
        } else {
            l69.c().getClass();
        }
        this.I0 = z;
        this.Z = new t49(this, 2);
        l69.b();
        this.s0 = l69.c().e();
        q();
        this.Z0 = context2.getResources().getDimensionPixelSize(bwc.mr_controller_volume_group_list_padding_top);
        this.w1 = (AccessibilityManager) context2.getSystemService("accessibility");
        this.u1 = AnimationUtils.loadInterpolator(contextThemeWrapperA, d1d.mr_linear_out_slow_in);
        this.v1 = AnimationUtils.loadInterpolator(contextThemeWrapperA, d1d.mr_fast_out_slow_in);
        new AccelerateDecelerateInterpolator();
    }

    public static void o(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public final void g(View view, int i) {
        c59 c59Var = new c59(view, view.getLayoutParams().height, i, 0);
        c59Var.setDuration(this.q1);
        c59Var.setInterpolator(this.t1);
        view.startAnimation(c59Var);
    }

    public final boolean h() {
        return (this.e1 == null && this.d1 == null) ? false : true;
    }

    public final void i(boolean z) {
        HashSet hashSet;
        int firstVisiblePosition = this.N0.getFirstVisiblePosition();
        for (int i = 0; i < this.N0.getChildCount(); i++) {
            View childAt = this.N0.getChildAt(i);
            k69 k69Var = (k69) this.O0.getItem(firstVisiblePosition + i);
            if (!z || (hashSet = this.Q0) == null || !hashSet.contains(k69Var)) {
                ((LinearLayout) childAt.findViewById(pxc.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        Iterator it = this.N0.a.iterator();
        while (it.hasNext()) {
            pkb pkbVar = (pkb) it.next();
            pkbVar.j = true;
            pkbVar.k = true;
            xo8 xo8Var = pkbVar.l;
            if (xo8Var != null) {
                d dVar = (d) xo8Var.c;
                dVar.S0.remove((k69) xo8Var.b);
                dVar.O0.notifyDataSetChanged();
            }
        }
        if (z) {
            return;
        }
        j(false);
    }

    public final void j(boolean z) {
        this.Q0 = null;
        this.R0 = null;
        this.o1 = false;
        if (this.p1) {
            this.p1 = false;
            u(z);
        }
        this.N0.setEnabled(true);
    }

    public final int k(int i, int i2) {
        return i >= i2 ? (int) (((this.v0 * i2) / i) + 0.5f) : (int) (((this.v0 * 9.0f) / 16.0f) + 0.5f);
    }

    public final int m(boolean z) {
        if (!z && this.L0.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.J0.getPaddingBottom() + this.J0.getPaddingTop();
        if (z) {
            paddingBottom += this.K0.getMeasuredHeight();
        }
        if (this.L0.getVisibility() == 0) {
            paddingBottom += this.L0.getMeasuredHeight();
        }
        return (z && this.L0.getVisibility() == 0) ? this.M0.getMeasuredHeight() + paddingBottom : paddingBottom;
    }

    public final boolean n() {
        k69 k69Var = this.s0;
        return k69Var.e() && Collections.unmodifiableList(k69Var.u).size() > 1;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y.a(d69.c, this.Z, 2);
        boolean z = l69.c;
        q();
    }

    @Override // defpackage.vc, defpackage.jo, defpackage.pl3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        setContentView(h1d.mr_controller_material_dialog_b);
        findViewById(R.id.button3).setVisibility(8);
        d59 d59Var = new d59(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(pxc.mr_expandable_area);
        this.A0 = frameLayout;
        frameLayout.setOnClickListener(new z49(this, 0));
        LinearLayout linearLayout = (LinearLayout) findViewById(pxc.mr_dialog_area);
        this.B0 = linearLayout;
        linearLayout.setOnClickListener(new a59());
        int i = fvc.colorPrimary;
        Context context = this.t0;
        int iF = r69.f(context, i);
        if (rf3.d(iF, r69.f(context, R.attr.colorBackground)) < 3.0d) {
            iF = r69.f(context, fvc.colorAccent);
        }
        Button button = (Button) findViewById(R.id.button2);
        this.w0 = button;
        button.setText(j4d.mr_controller_disconnect);
        this.w0.setTextColor(iF);
        this.w0.setOnClickListener(d59Var);
        Button button2 = (Button) findViewById(R.id.button1);
        this.x0 = button2;
        button2.setText(j4d.mr_controller_stop_casting);
        this.x0.setTextColor(iF);
        this.x0.setOnClickListener(d59Var);
        this.G0 = (TextView) findViewById(pxc.mr_name);
        ((ImageButton) findViewById(pxc.mr_close)).setOnClickListener(d59Var);
        this.C0 = (FrameLayout) findViewById(pxc.mr_default_control);
        z49 z49Var = new z49(this, 1);
        ImageView imageView = (ImageView) findViewById(pxc.mr_art);
        this.D0 = imageView;
        imageView.setOnClickListener(z49Var);
        findViewById(pxc.mr_control_title_container).setOnClickListener(z49Var);
        this.J0 = (LinearLayout) findViewById(pxc.mr_media_main_control);
        this.M0 = findViewById(pxc.mr_control_divider);
        this.K0 = (RelativeLayout) findViewById(pxc.mr_playback_control);
        this.E0 = (TextView) findViewById(pxc.mr_control_title);
        this.F0 = (TextView) findViewById(pxc.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(pxc.mr_control_playback_ctrl);
        this.y0 = imageButton;
        imageButton.setOnClickListener(d59Var);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(pxc.mr_volume_control);
        this.L0 = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(pxc.mr_volume_slider);
        this.T0 = seekBar;
        k69 k69Var = this.s0;
        seekBar.setTag(k69Var);
        g59 g59Var = new g59(this);
        this.U0 = g59Var;
        this.T0.setOnSeekBarChangeListener(g59Var);
        this.N0 = (OverlayListView) findViewById(pxc.mr_volume_group_list);
        this.P0 = new ArrayList();
        c cVar = new c(this, this.N0.getContext(), this.P0);
        this.O0 = cVar;
        this.N0.setAdapter((ListAdapter) cVar);
        this.S0 = new HashSet();
        LinearLayout linearLayout3 = this.J0;
        OverlayListView overlayListView = this.N0;
        boolean zN = n();
        int iF2 = r69.f(context, fvc.colorPrimary);
        int iF3 = r69.f(context, fvc.colorPrimaryDark);
        if (zN && r69.b(context) == -570425344) {
            iF3 = iF2;
            iF2 = -1;
        }
        linearLayout3.setBackgroundColor(iF2);
        overlayListView.setBackgroundColor(iF3);
        linearLayout3.setTag(Integer.valueOf(iF2));
        overlayListView.setTag(Integer.valueOf(iF3));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.T0;
        LinearLayout linearLayout4 = this.J0;
        int iB = r69.b(context);
        if (Color.alpha(iB) != 255) {
            iB = rf3.g(iB, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(iB, iB);
        HashMap map = new HashMap();
        this.a1 = map;
        map.put(k69Var, this.T0);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(pxc.mr_group_expand_collapse);
        this.z0 = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.v0 = new z49(this, 2);
        this.t1 = this.n1 ? this.u1 : this.v1;
        this.q1 = context.getResources().getInteger(z0d.mr_controller_volume_group_list_animation_duration_ms);
        this.r1 = context.getResources().getInteger(z0d.mr_controller_volume_group_list_fade_in_duration_ms);
        this.s1 = context.getResources().getInteger(z0d.mr_controller_volume_group_list_fade_out_duration_ms);
        this.u0 = true;
        t();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.Y.f(this.Z);
        q();
        super.onDetachedFromWindow();
    }

    @Override // defpackage.vc, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.I0 || !this.n1) {
            this.s0.k(i == 25 ? -1 : 1);
        }
        return true;
    }

    @Override // defpackage.vc, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final void q() {
        MediaControllerCompat mediaControllerCompat = this.b1;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.c1);
            this.b1 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(boolean r13) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.d.r(boolean):void");
    }

    public final void s() {
        MediaDescriptionCompat mediaDescriptionCompat = this.e1;
        Bitmap iconBitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.getIconBitmap();
        MediaDescriptionCompat mediaDescriptionCompat2 = this.e1;
        Uri iconUri = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.getIconUri() : null;
        e59 e59Var = this.f1;
        Bitmap bitmap = e59Var == null ? this.g1 : e59Var.a;
        Uri uri = e59Var == null ? this.h1 : e59Var.b;
        if (bitmap == iconBitmap) {
            if (bitmap != null) {
                return;
            }
            if (uri != null && uri.equals(iconUri)) {
                return;
            }
            if (uri == null && iconUri == null) {
                return;
            }
        }
        if (!n() || this.I0) {
            e59 e59Var2 = this.f1;
            if (e59Var2 != null) {
                e59Var2.cancel(true);
            }
            e59 e59Var3 = new e59(this);
            this.f1 = e59Var3;
            e59Var3.execute(new Void[0]);
        }
    }

    public final void t() {
        Context context = this.t0;
        int iA = dvi.a(context);
        getWindow().setLayout(iA, -2);
        View decorView = getWindow().getDecorView();
        this.v0 = (iA - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.W0 = resources.getDimensionPixelSize(bwc.mr_controller_volume_group_list_item_icon_size);
        this.X0 = resources.getDimensionPixelSize(bwc.mr_controller_volume_group_list_item_height);
        this.Y0 = resources.getDimensionPixelSize(bwc.mr_controller_volume_group_list_max_height);
        this.g1 = null;
        this.h1 = null;
        s();
        r(false);
    }

    public final void u(boolean z) {
        this.C0.requestLayout();
        this.C0.getViewTreeObserver().addOnGlobalLayoutListener(new b59(this, z));
    }

    public final void v(boolean z) {
        int i = 0;
        this.M0.setVisibility((this.L0.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.J0;
        if (this.L0.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }
}
