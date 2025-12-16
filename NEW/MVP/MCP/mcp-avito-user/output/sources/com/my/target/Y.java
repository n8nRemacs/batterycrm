package com.my.target;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.my.target.P0;
import com.my.target.U0;
import e11.C39884l0;
import e11.C39922y0;
import e11.C39924z;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public class Y extends ViewGroup implements U0.a {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39922y0 f364640b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C39924z f364641c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final e11.r f364642d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final b f364643e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final U0 f364644f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final FrameLayout f364645g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final ProgressBar f364646h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f364647i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f364648j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public P0 f364649k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public com.my.target.common.models.e f364650l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public Bitmap f364651m;

    /* renamed from: n, reason: collision with root package name */
    public int f364652n;

    /* renamed from: o, reason: collision with root package name */
    public int f364653o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f364654p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    public a f364655q;

    public interface a extends AudioManager.OnAudioFocusChangeListener, P0.a {
        void b();

        void c();

        void l();

        void n();
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Y y12 = Y.this;
            if (y12.f364655q == null) {
                return;
            }
            if (!y12.g() && !y12.f()) {
                y12.f364655q.l();
                return;
            }
            boolean zF2 = y12.f();
            a aVar = y12.f364655q;
            if (zF2) {
                aVar.n();
            } else {
                aVar.c();
            }
        }
    }

    public Y(@j.N Context context, @j.N C39924z c39924z, boolean z12, boolean z13) {
        super(context);
        this.f364654p = true;
        this.f364641c = c39924z;
        this.f364647i = z12;
        this.f364648j = z13;
        this.f364640b = new C39922y0(context);
        this.f364642d = new e11.r(context);
        this.f364646h = new ProgressBar(context, null, R.attr.progressBarStyleLarge);
        this.f364645g = new FrameLayout(context);
        U0 u02 = new U0(context);
        this.f364644f = u02;
        u02.setAdVideoViewListener(this);
        this.f364643e = new b();
    }

    public final void a(@j.N C39884l0 c39884l0) {
        this.f364645g.setVisibility(8);
        this.f364642d.setVisibility(8);
        this.f364646h.setVisibility(8);
        this.f364644f.setVisibility(8);
        C39922y0 c39922y0 = this.f364640b;
        c39922y0.setVisibility(0);
        com.my.target.common.models.b bVar = c39884l0.f394716o;
        if (bVar == null || bVar.a() == null) {
            return;
        }
        int i12 = bVar.f394305b;
        this.f364653o = i12;
        int i13 = bVar.f394306c;
        this.f364652n = i13;
        if (i12 == 0 || i13 == 0) {
            this.f364653o = bVar.a().getWidth();
            this.f364652n = bVar.a().getHeight();
        }
        c39922y0.setImageBitmap(bVar.a());
        c39922y0.setClickable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(boolean z12) {
        P0 p02;
        P0 p03;
        Uri uri;
        this.f364642d.setVisibility(8);
        this.f364646h.setVisibility(0);
        if (this.f364650l == null || (p02 = this.f364649k) == null) {
            return;
        }
        p02.a(this.f364655q);
        P0 p04 = this.f364649k;
        U0 u02 = this.f364644f;
        p04.b(u02);
        com.my.target.common.models.e eVar = this.f364650l;
        u02.b(eVar.f394305b, eVar.f394306c);
        com.my.target.common.models.e eVar2 = this.f364650l;
        String str = (String) eVar2.f394307d;
        if (!z12 || str == null) {
            p03 = this.f364649k;
            uri = Uri.parse(eVar2.f394304a);
        } else {
            p03 = this.f364649k;
            uri = Uri.parse(str);
        }
        p03.c(u02.getContext(), uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(@j.N e11.C39884l0 r10, int r11) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.Y.c(e11.l0, int):void");
    }

    public final void d(boolean z12) {
        P0 p02 = this.f364649k;
        if (p02 != null) {
            p02.e();
        }
        this.f364646h.setVisibility(8);
        C39922y0 c39922y0 = this.f364640b;
        c39922y0.setVisibility(0);
        c39922y0.setImageBitmap(this.f364651m);
        this.f364654p = z12;
        e11.r rVar = this.f364642d;
        if (z12) {
            rVar.setVisibility(0);
            return;
        }
        c39922y0.setOnClickListener(null);
        rVar.setOnClickListener(null);
        setOnClickListener(null);
    }

    public final void e() {
        View view = this.f364642d;
        C39924z.m(view, "play_button");
        C39922y0 c39922y0 = this.f364640b;
        C39924z.m(c39922y0, "media_image");
        View view2 = this.f364644f;
        C39924z.m(view2, "video_texture");
        View view3 = this.f364645g;
        C39924z.m(view3, "clickable_layout");
        c39922y0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        c39922y0.setAdjustViewBounds(true);
        addView(view2);
        View view4 = this.f364646h;
        view4.setVisibility(8);
        addView(c39922y0);
        addView(view4);
        addView(view3);
        addView(view);
    }

    public final boolean f() {
        P0 p02 = this.f364649k;
        return p02 != null && p02.i();
    }

    public final boolean g() {
        P0 p02 = this.f364649k;
        return p02 != null && p02.f();
    }

    @j.N
    public FrameLayout getClickableLayout() {
        return this.f364645g;
    }

    @j.N
    public C39922y0 getImageView() {
        return this.f364640b;
    }

    @j.P
    public P0 getVideoPlayer() {
        return this.f364649k;
    }

    public final void h() {
        P0 p02 = this.f364649k;
        if (p02 == null) {
            return;
        }
        p02.b();
        C39922y0 c39922y0 = this.f364640b;
        c39922y0.setVisibility(0);
        Bitmap screenShot = this.f364644f.getScreenShot();
        if (screenShot != null && this.f364649k.j()) {
            c39922y0.setImageBitmap(screenShot);
        }
        if (this.f364654p) {
            this.f364642d.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i17 = ((i14 - i12) - measuredWidth) / 2;
                int i18 = ((i15 - i13) - measuredHeight) / 2;
                childAt.layout(i17, i18, measuredWidth + i17, measuredHeight + i18);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int i14;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        int i15 = this.f364652n;
        if (i15 == 0 || (i14 = this.f364653o) == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            return;
        }
        if (mode2 == 0 && size2 == 0) {
            size2 = i15;
            size = i14;
            mode = Integer.MIN_VALUE;
            mode2 = Integer.MIN_VALUE;
        }
        if (size2 == 0 || mode2 == 0) {
            size2 = (int) ((size / i14) * i15);
        }
        if (size == 0 || mode == 0) {
            size = (int) ((size2 / i15) * i14);
        }
        float f12 = i14 / i15;
        float f13 = size / f12;
        float f14 = size2;
        if (f13 > f14) {
            size = (int) (f12 * f14);
        } else {
            size2 = (int) f13;
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int i17 = (childAt == this.f364640b || childAt == this.f364645g || childAt == this.f364644f) ? 1073741824 : Integer.MIN_VALUE;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, i17), View.MeasureSpec.makeMeasureSpec(size2, i17));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.U0.a
    public final void p() {
        a aVar;
        if (!(this.f364649k instanceof I)) {
            a aVar2 = this.f364655q;
            if (aVar2 != null) {
                aVar2.a("Playback within no hardware accelerated view is available only with ExoPlayer");
                return;
            }
            return;
        }
        U0 u02 = this.f364644f;
        u02.setViewMode(1);
        com.my.target.common.models.e eVar = this.f364650l;
        if (eVar != null) {
            u02.b(eVar.f394305b, eVar.f394306c);
        }
        this.f364649k.b(u02);
        if (!this.f364649k.f() || (aVar = this.f364655q) == null) {
            return;
        }
        aVar.b();
    }

    public void setInterstitialPromoViewListener(@j.P a aVar) {
        this.f364655q = aVar;
        P0 p02 = this.f364649k;
        if (p02 != null) {
            p02.a(aVar);
        }
    }
}
