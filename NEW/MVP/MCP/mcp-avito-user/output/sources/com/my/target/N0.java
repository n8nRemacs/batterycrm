package com.my.target;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import e11.C39852a1;
import e11.C39855b1;
import e11.C39875i0;
import e11.C39880k;
import e11.C39899q0;
import e11.C39906t;
import e11.C39922y0;
import e11.C39924z;
import e11.E1;
import e11.i2;
import e11.k2;
import java.lang.ref.WeakReference;
import org.webrtc.MediaStreamTrack;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public abstract class N0 extends ViewGroup implements I0, View.OnClickListener {

    /* renamed from: A, reason: collision with root package name */
    public final int f364474A;

    /* renamed from: B, reason: collision with root package name */
    public final int f364475B;

    /* renamed from: C, reason: collision with root package name */
    public final int f364476C;

    /* renamed from: D, reason: collision with root package name */
    public final int f364477D;

    /* renamed from: E, reason: collision with root package name */
    public final int f364478E;

    /* renamed from: F, reason: collision with root package name */
    public final int f364479F;

    /* renamed from: G, reason: collision with root package name */
    public final int f364480G;

    /* renamed from: H, reason: collision with root package name */
    public final int f364481H;

    /* renamed from: I, reason: collision with root package name */
    public final int f364482I;

    /* renamed from: J, reason: collision with root package name */
    public final int f364483J;

    /* renamed from: K, reason: collision with root package name */
    @j.P
    public final FrameLayout f364484K;

    /* renamed from: L, reason: collision with root package name */
    public int f364485L;

    /* renamed from: M, reason: collision with root package name */
    public int f364486M;

    /* renamed from: N, reason: collision with root package name */
    public final int f364487N;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39880k f364488b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C39906t f364489c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final C39880k f364490d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final m7 f364491e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final C39852a1 f364492f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final b4 f364493g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final e11.I0 f364494h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    public final Button f364495i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    public final C39922y0 f364496j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    public final C39922y0 f364497k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    public final C39875i0 f364498l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    public final ProgressBar f364499m;

    /* renamed from: n, reason: collision with root package name */
    @j.N
    public final View f364500n;

    /* renamed from: o, reason: collision with root package name */
    @j.N
    public final View f364501o;

    /* renamed from: p, reason: collision with root package name */
    @j.N
    public final View f364502p;

    /* renamed from: q, reason: collision with root package name */
    @j.N
    public final Button f364503q;

    /* renamed from: r, reason: collision with root package name */
    @j.N
    public final TextView f364504r;

    /* renamed from: s, reason: collision with root package name */
    @j.N
    public final TextView f364505s;

    /* renamed from: t, reason: collision with root package name */
    @j.N
    public final TextView f364506t;

    /* renamed from: u, reason: collision with root package name */
    @j.N
    public final C39899q0 f364507u;

    /* renamed from: v, reason: collision with root package name */
    @j.P
    public final Bitmap f364508v;

    /* renamed from: w, reason: collision with root package name */
    @j.P
    public final Bitmap f364509w;

    /* renamed from: x, reason: collision with root package name */
    @j.P
    public final Bitmap f364510x;

    /* renamed from: y, reason: collision with root package name */
    @j.P
    public final Bitmap f364511y;

    /* renamed from: z, reason: collision with root package name */
    @j.P
    public final Bitmap f364512z;

    public N0(@j.N m7 m7Var, @j.N C39852a1 c39852a1, @j.N b4 b4Var, @j.P FrameLayout frameLayout, @j.N C39906t c39906t, @j.N Context context) {
        super(context);
        this.f364493g = b4Var;
        this.f364484K = frameLayout;
        this.f364492f = c39852a1;
        this.f364491e = m7Var;
        this.f364489c = c39906t;
        int i12 = c39906t.f394842a.get(C39906t.f394824i);
        this.f364478E = i12;
        int i13 = C39906t.f394813U;
        SparseIntArray sparseIntArray = c39906t.f394842a;
        int i14 = sparseIntArray.get(i13);
        this.f364481H = sparseIntArray.get(C39906t.f394811S);
        this.f364482I = sparseIntArray.get(C39906t.f394799G);
        this.f364483J = sparseIntArray.get(C39906t.f394814V);
        this.f364479F = sparseIntArray.get(C39906t.f394816X);
        C39880k c39880k = new C39880k(context);
        this.f364490d = c39880k;
        c39880k.setVisibility(8);
        c39880k.setOnClickListener(this);
        c39880k.setPadding(i12);
        e11.I0 i02 = new e11.I0(context);
        this.f364494h = i02;
        i02.setVisibility(8);
        i02.setOnClickListener(this);
        C39924z.i(i02, -2013265920, -1, -1, sparseIntArray.get(C39906t.f394819d), sparseIntArray.get(C39906t.f394820e));
        Button button = new Button(context);
        this.f364495i = button;
        button.setTextColor(-1);
        button.setLines(sparseIntArray.get(C39906t.f394821f));
        button.setTextSize(1, sparseIntArray.get(C39906t.f394822g));
        button.setMaxWidth(sparseIntArray.get(C39906t.f394818c));
        button.setOnClickListener(this);
        button.setBackgroundColor(0);
        button.setIncludeFontPadding(false);
        int i15 = sparseIntArray.get(C39906t.f394823h);
        this.f364474A = i15;
        this.f364475B = sparseIntArray.get(C39906t.f394827l);
        this.f364476C = sparseIntArray.get(C39906t.f394828m);
        int i16 = sparseIntArray.get(C39906t.f394832q);
        this.f364477D = i16;
        this.f364487N = sparseIntArray.get(C39906t.f394829n);
        this.f364480G = sparseIntArray.get(C39906t.f394830o);
        C39875i0 c39875i0 = new C39875i0(context);
        this.f364498l = c39875i0;
        c39875i0.setFixedHeight(i16);
        this.f364510x = e11.C0.a(420, "iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCy8fw79+rQAAAhVJREFUeNrt2y9IXlEYx3H3ooIiiCAIC4JgMRgsCyaLwWaxLK0srZhWVtYWVtYWlpYMNsvK0sKKRTANBivDIIggIiLiZ+URDncHFgzbznN+8d77nvPwvec99zz/xsa6uv4oPMWjzADgK55kBnCvj3icGQBc4hWmsgK41w/sZAPwswLiC9ayAJjGa1wNrt/hAxaaBlBcW8ReZTVc4CUmmwZQ3FvHYQXEd2w3DyDuj/AMJxUQn7HaNIDiuRm8wfUAwi3eY75pAMXzS9ivrIZz7GKiaQDF7zZwVAHxDVvNAyj2h+c4rYD4hJWmARRjzOItbir7wzvMNQ2gGGsZB5XVcIYXGG8aQDHmJo4rII6x2TyAGHc83vpZBcQBlpsGUIw/F/vA7QDCTewbs00DKOZZiS/DUKfxJRk1DaCYbyvOCkMdYaN5ADHnRJwazysg9rHUNIBi7vnwI4b7w3X4HTNNAyhsWA3PcqiT8ERHTQMobNmOWMNQh1hvHkDYMxlRp4sKiD0sNg2gsGsh4pB3AwhXEbecbhpAYd9aRKZVItgPT+v96wAKO3ciVzHUw9J6/wuAsHUqslaXFRC/pfVGY139L9A3wf4Z7AehfhTuzlB3h3tApIfE/jqAtEHRtGHx1ImRtKmxtMnRtOnx1AUSaUtk0hZJpS2TS10ombZUNm2xdPpy+d4w0VtmetNU2ra51I2TuVtnuxrWL/YiKQ6CN9uRAAAAAElFTkSuQmCC");
        this.f364511y = e11.C0.a(420, "iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCjM59gfMOgAAA59JREFUeNrtmkloFEEUhl/N6KgxriiJOHEXF4gENYlgRFA8uyAoCNGggl68CCJ6EQx6cCFqUFzABQQRMYh4EfSi4IJbiFERQVxRgxuRMWri5yE1UBY9yWh6Znq6+z+96a6ZV/8/tbz3qkRChAgRwiMAFgJngWgQyVcDHXTiFKCCRH4Df6MFKAkK+W0W+VfAxCAQV8A+i/wTIB4E8lHgpEX+LjA8COQHAM8t8o3ATKC338kXA59IjXbgEVAPLAb6+k2AHRbhVrrGV+AwMNVPIpx3INncjRi/gTPAWL+IcMIieBGIAXFgGXAU+OggRALY7ItIEdhvkTsNRIz3MWCp3h1sXAGK/RAHnLKIHUzRdgnwwmr7Epjsh3jggkWsNkXbQuC4Q8g8Ld9F6ANctYht7KL9GiNpAnib94ujDo5uaUIdwMo00uafhghNQL98F2EYcA9YlGb75daoOeqHnSHyj+23WyLMC1oRJQpct7LJXkETYSrwyxBhlQQNwAFrFKigCTDK2hXmBnEUnDMEOBZEARYaArwLogAF1jRIq4YQ8YsASqmEiNw2HpUHSgCNB4Y9KYgCPDXs8UEU4LNhF6bzhW7DRmCEiFTqjx+VUtc8LECrYfd3RQA9lxq03SgiZR4WIGbYv9yaAt8Me5DHp8DAFP3ukQDvDTvu8WxrnGG/dUUApdQrEUkYU2a8hwWYnGJH6PEu0GzYczwaCSoRqTIeNbkpwFXDnu/Rf79URJKnyz9E5Kab6i4wYuxvQKEHR8BO8+DE7R+PAu8MB6s9Rj4GvDH6tzYTTvZaVZeIhwSoMfr2HRiUCSd21aXGI+T7WRcu6jLp7Ijh6AMw1AMCmKXxtozeLgOKgC+Gw4ZcFiCB2fpWSRLbsuF0nXUYsSlH5EfqE+IknmblSo0+1m6wRKjOMvnB+jzQHPpl2ezAEOCx0YEOYH2WfMct8rlZkIES4LXVkXqgTwZ9Vjn43JrLFXgC8Mzq0H2g0mU/BTrSa7d8bfHCPlwE3HC41XWyp9fbdIS3Tt8fxprzq7wUivYGdmnithCXgRXpxgw67K4A9ljhdxKPgVK3+q5cFqJcRA6JyAyn1zpFfaBz9RZdtYnpStNonc/PEpEhDt9vE5FaEdmtlPrh2YoEEAEWpbje9j9o1aNrhOQbgOlAncNC2R0SwCVgZaZTb5VFMUpEpEJEpojIGBEZLJ21+zbpLGe3iMgTEXkoIneUUj8lRIgQIUKECJFJ/AEepzU1TSID5QAAAABJRU5ErkJggg==");
        this.f364512z = e11.C0.a(420, "iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCjITNKc0rQAAAJFJREFUeNrt2tENgCAMQEEwLuD+QzpC3cBURWLsvV+JNRfhi9YkSSpbP3sYETF0WO89s27m3KX6H1AeYL2wdrs5Y3/4ja/OTZ8B2f074h0z5zoDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/lr6rvDoK+xfmWsLNEmSVLUD47EiX/OuE8UAAAAASUVORK5CYII=");
        this.f364508v = e11.C0.a(320, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAMAAACfWMssAAAAdVBMVEUAAAAAAAAgICDf398QEBDv7+/Pz8+fn58gICAQEBDe3t5AQEBwcHDv7+9/f3/f398wMDCAgIBgYGCQkJDAwMC/v7/Pz8+fn59QUFBAQECvr69QUFCPj4+/v79wcHBvb29gYGBfX1++vr6urq6Ojo5hYWH///+8blWlAAAAJnRSTlOAAJDviPfnzyAQ3qC478DfmICvx9/fz59QQK+oj79wb2Bfvq6OsPCmZBAAAAJhSURBVEjHndbXYuIwEAXQiSQXueAGtmkhJNn7/5+4I8JmbJAWw33iQYex7FGhN0/s9jT0FTjVcXfavvlC92o8lpil3J0fQ9s4FXdtrYij8qKLXeUhDUFhm8LQLKp1tknDcKyY5eRJnQDZOQDtwcOkrAa+rQ+mPaKC/pMiQpbew7SCVgEiRUWSuNjQg5hYJP26hBYkYTmFluvRosTo7QQeoM0yaDS+BX4gUrQwKsJ4hW6CRfBF6ruvgsxeYROcYB4BdJs1mh+YAoEHXQEemKO0FzgEvoRJAKbkL8mwQh3okygnhv6SxK80DkxPKxI4Lzky3KH1Ty8x9AM14mQ/f7GfDEso//SIfiEwWwEGpaUtYhke4Ro3vX+QU//hCdfTxtvSOzrpYIkigS6mm3ZXh3faSddEN8PlUTet+9vNL2wx0BH5ZFAAuhmbSEbW6KmCegTJFGC0kkZRyGRMEHIYbXi0ngxdCA0i9/sViNdggQ3ViCdDl72cFdBSO385PeqFn0NjL+vjkwa0DxsgcidDBz3p8t3ilktuWi7U5Ho/hWoV3TW5LWGWLKuN1COFktfjEcXDhayT2fHXYsdwxJo82evw1hHjzNCWyAObld57YY3ssss1WD+3PSYYHJSSCzdkBaQOSknfRD1QX48ALpk9eeikF8gZnzvmzi8erIfpUd4vP8ozO7s8ZK9dHpx8+roi8skLksjHV7I+DV0C42DRfA0cbODa+ZEBSR1i2Ri+6KYNuGp7U9YUzMpGygmc0CFztivyi1Z128UQ5oPywF+3l/njKEygL9vT12cGTtUPp631DfkLyeFPR/ZOiKIAAAAASUVORK5CYII=");
        this.f364509w = e11.C0.a(320, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAMAAACfWMssAAAAclBMVEUAAAAAAAAgICDf39+goKAgICAQEBDe3t7Pz88QEBDv7+9wcHBAQEDf39+AgIDv7+/AwMCQkJDPz8+/v7+vr69gYGCfn5+Pj49fX19QUFBAQEAwMDBQUFDu7u5/f39/f39wcHBvb2+/v78wMDCvr6////9R0hTPAAAAJXRSTlOAAJDvzyAQ3ueI97ig34Dv38fPv6+vn49fUECYqO7Av3Bv35fYiozA+AAAAjJJREFUSMe91um2mjAUBeBDGMOkjDJoe63d7/+KTbyxpzZJgXat7j8i8nkICUkocCRZ7mNbQaXq+vsSuEK2mrsT3nLqp22Y1FplzbAKUhFl0WS68hj7ILNvhaS3iEHbOvbDuVKsJEfWCEgnD0wuzOyIELgkLhi3yAv6Q4ocaWzDuEIoPISLsiR2maSNyIwl/XQR7Uj0lAwTVY92JUOb/AIvCOU+KENcGE7IBe2MyDEbqBtYeB9kaPUK0sTA2tvAMgesk2fUnzAGhNt9ARywxC15wtHTEzICvhpoldSwwuoZJ3lJBlolFZyQeZoXCjLQKjkr2GNwNy+S5IEFOgVPEO7mEfmgVPdKCzK+PIeJbp4fUoaFPtDwCOYIYihfXx5k0uCDeh41+dvlfBSGwvzx1ZwdMFKHki9yH0VQ0nx8ZkVLFcQGNIQdkUCqf9mEGrHTAXZBLdn9Fxgh/P4mgb9/OC3WLdhY3VGioxHD8QFQoN8z5IR89TvxkPMN8vC6NciTE+TR10rgFlDQoTj6Ig/oFZxxJkeuoX/qyDApqO61dEmh5NUJV6TPWa7G+dj0GGHUkEvunJAFEGvIJZ0NtWFolgBVMj246MQGBvOxZW7694U1SNr9S3mavG0e0uObh5c8vF1heXCDxHJ7S9bGvk1g5i1anq1NIGdKgejhY+ns3+jGNYBs+K2sLBQ71UnggEzHVNumKJ9aPIYmAzMH5Ez9DRytupkZQ1eWe9+l2lTteF+UsvMDBKFIvMRHIr8AAAAASUVORK5CYII=");
        C39922y0 c39922y0 = new C39922y0(context);
        this.f364496j = c39922y0;
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleLarge);
        this.f364499m = progressBar;
        progressBar.setVisibility(8);
        View view = new View(context);
        this.f364500n = view;
        view.setBackgroundColor(-1728053248);
        view.setVisibility(8);
        View view2 = new View(context);
        this.f364502p = view2;
        View view3 = new View(context);
        this.f364501o = view3;
        TextView textView = new TextView(context);
        this.f364504r = textView;
        textView.setTextSize(1, sparseIntArray.get(C39906t.f394833r));
        textView.setTextColor(-1);
        textView.setMaxLines(sparseIntArray.get(C39906t.f394834s));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        TextView textView2 = new TextView(context);
        this.f364505s = textView2;
        textView2.setTextSize(1, sparseIntArray.get(C39906t.f394835t));
        textView2.setTextColor(-1);
        textView2.setMaxLines(sparseIntArray.get(C39906t.f394836u));
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        Button button2 = new Button(context);
        this.f364503q = button2;
        button2.setLines(1);
        button2.setTextSize(1, sparseIntArray.get(C39906t.f394837v));
        button2.setEllipsize(truncateAt);
        button2.setIncludeFontPadding(false);
        button2.setMinimumWidth(i14);
        button2.setPadding(i15, 0, i15, 0);
        TextView textView3 = new TextView(context);
        this.f364506t = textView3;
        textView3.setPadding(sparseIntArray.get(C39906t.f394839x), 0, 0, 0);
        textView3.setTextColor(-1);
        textView3.setMaxLines(sparseIntArray.get(C39906t.f394793A));
        textView3.setIncludeFontPadding(false);
        textView3.setTextSize(1, sparseIntArray.get(C39906t.f394815W));
        C39899q0 c39899q0 = new C39899q0(context);
        this.f364507u = c39899q0;
        C39880k c39880k2 = new C39880k(context);
        this.f364488b = c39880k2;
        c39880k2.setPadding(i12);
        C39922y0 c39922y02 = new C39922y0(context);
        this.f364497k = c39922y02;
        setContentDescription("ad_view");
        C39924z.m(this, "ad_view");
        textView.setContentDescription("title");
        C39924z.m(textView, "title");
        textView2.setContentDescription("description");
        C39924z.m(textView2, "description");
        c39922y0.setContentDescription("image");
        C39924z.m(c39922y0, "image");
        button2.setContentDescription("cta");
        C39924z.m(button2, "cta");
        c39880k.setContentDescription("dismiss");
        C39924z.m(c39880k, "dismiss");
        i02.setContentDescription("play");
        C39924z.m(i02, "play");
        c39922y02.setContentDescription("ads_logo");
        C39924z.m(c39922y02, "ads_logo");
        view.setContentDescription("media_dim");
        C39924z.m(view, "media_dim");
        view3.setContentDescription("top_dim");
        C39924z.m(view3, "top_dim");
        view2.setContentDescription("bot_dim");
        C39924z.m(view2, "bot_dim");
        textView3.setContentDescription("age_bordering");
        C39924z.m(textView3, "age_bordering");
        c39875i0.setContentDescription("ad_choices");
        C39924z.m(c39875i0, "ad_choices");
        C39924z.m(c39880k2, "sound_button");
        if (frameLayout != null) {
            addView(frameLayout);
        }
        addView(c39922y0);
        addView(view);
        addView(view2);
        addView(view3);
        addView(m7Var);
        addView(c39880k);
        addView(textView);
        addView(textView2);
        addView(button2);
        addView(textView3);
        addView(c39922y02);
        addView(c39875i0);
        addView(c39899q0);
    }

    private void setClickArea(@j.N E1 e12) {
        boolean z12 = e12.f394344m;
        Button button = this.f364503q;
        if (z12) {
            setOnClickListener(this);
            button.setOnClickListener(this);
            return;
        }
        setOnClickListener(e12.f394343l ? this : null);
        boolean z13 = e12.f394338g;
        button.setEnabled(z13);
        button.setOnClickListener(z13 ? this : null);
        this.f364504r.setOnClickListener(e12.f394332a ? this : null);
        this.f364506t.setOnClickListener((e12.f394339h || e12.f394340i) ? this : null);
        this.f364505s.setOnClickListener(e12.f394333b ? this : null);
        this.f364496j.setOnClickListener(e12.f394335d ? this : null);
    }

    public final void a(int i12, @j.P String str) {
        e11.I0 i02 = this.f364494h;
        i02.setVisibility(0);
        i02.setImageBitmap(i12 == 1 ? this.f364512z : i12 == 2 ? this.f364511y : this.f364510x);
        Button button = this.f364495i;
        if (str == null) {
            button.setVisibility(8);
        } else {
            button.setVisibility(0);
            button.setText(str);
        }
    }

    public final void b(boolean z12) {
        this.f364496j.setVisibility(z12 ? 0 : 4);
    }

    public final boolean c(int i12) {
        FrameLayout frameLayout = this.f364484K;
        return ((double) C39924z.d(frameLayout != null ? frameLayout.getMeasuredWidth() : 0, this.f364496j.getMeasuredWidth())) * 1.6d <= ((double) i12);
    }

    public final void d(boolean z12) {
        this.f364499m.setVisibility(z12 ? 0 : 8);
    }

    public final void e(boolean z12) {
        this.f364500n.setVisibility(z12 ? 0 : 8);
    }

    public final void f() {
        this.f364507u.setVisibility(8);
    }

    public final void g() {
        this.f364494h.setVisibility(8);
        this.f364495i.setVisibility(8);
    }

    @Override // com.my.target.I0
    @j.N
    public View getCloseButton() {
        return this.f364490d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AudioManager audioManager;
        C39880k c39880k = this.f364490d;
        b4 b4Var = this.f364493g;
        if (view == c39880k) {
            s1 s1Var = b4Var.f364738k;
            if (s1Var != null) {
                r1 r1Var = s1Var.f365136f;
                if (!r1Var.c()) {
                    k2.a(r1Var.f365126e, r1Var.f365125d.e("closedByUser"));
                }
                s1Var.d();
                s1Var.f365134d.destroy();
                C39855b1 c39855b1 = s1Var.f365135e;
                WeakReference<View> weakReference = c39855b1.f394538c;
                if (weakReference != null) {
                    weakReference.clear();
                }
                c39855b1.f394537b.clear();
                c39855b1.f394536a.clear();
                c39855b1.f394538c = null;
            }
            b4Var.i();
            b4Var.f364731d.a();
            return;
        }
        if (view == this.f364488b) {
            s1 s1Var2 = b4Var.f364738k;
            if (s1Var2 != null) {
                s1Var2.f365134d.h();
                s1Var2.f365136f.d(!r0.l());
                return;
            }
            return;
        }
        if (view == this.f364494h || view == this.f364495i) {
            s1 s1Var3 = b4Var.f364738k;
            if (s1Var3 != null) {
                P0 p02 = s1Var3.f365134d;
                boolean zF2 = p02.f();
                r1 r1Var2 = s1Var3.f365136f;
                if (zF2) {
                    s1Var3.d();
                    r1Var2.f();
                } else if (p02.q() > 0) {
                    p02.a();
                    boolean zL2 = p02.l();
                    U0 u02 = s1Var3.f365138h;
                    if (zL2) {
                        AudioManager audioManager2 = (AudioManager) u02.getContext().getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                        if (audioManager2 != null) {
                            audioManager2.abandonAudioFocus(s1Var3);
                        }
                    } else if (p02.f() && (audioManager = (AudioManager) u02.getContext().getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND)) != null) {
                        audioManager.requestAudioFocus(s1Var3, 3, 2);
                    }
                    r1Var2.i();
                } else {
                    s1Var3.e();
                }
            }
            b4Var.i();
            return;
        }
        if (view == this.f364484K) {
            if (b4Var.f364737j) {
                b4Var.a(b4Var.f364729b);
                return;
            }
            if (b4Var.f364744q) {
                if (b4Var.f364730c.f394335d) {
                    b4Var.a(null);
                    return;
                }
                return;
            }
            N0 n02 = b4Var.f364732e;
            n02.e(true);
            n02.a(1, null);
            n02.d(false);
            b4Var.i();
            b4Var.f364735h.postDelayed(b4Var.f364736i, 4000L);
            b4Var.f364743p = true;
            return;
        }
        if (view == this.f364500n) {
            if (b4Var.f364737j) {
                b4Var.a(b4Var.f364729b);
                return;
            }
            boolean z12 = b4Var.f364743p;
            if (z12 && z12) {
                b4Var.i();
                N0 n03 = b4Var.f364732e;
                n03.e(false);
                n03.g();
                b4Var.f364743p = false;
                return;
            }
            return;
        }
        if (view == this.f364497k) {
            b4Var.i();
            String str = b4Var.f364729b.f394676Q;
            if (str == null) {
                return;
            }
            N0 n04 = b4Var.f364732e;
            n04.getClass();
            i2.a(str, n04.getContext());
            return;
        }
        if (view != this.f364498l) {
            b4Var.a(null);
            return;
        }
        C37788h c37788h = b4Var.f364729b.f394698D;
        if (c37788h == null) {
            return;
        }
        b4Var.i();
        D d12 = b4Var.f364739l;
        if (d12 == null || !d12.c()) {
            N0 n05 = b4Var.f364732e;
            n05.getClass();
            Context context = n05.getContext();
            D d13 = b4Var.f364739l;
            if (d13 == null) {
                i2.a(c37788h.f364852b, context);
            } else {
                d13.b(context);
            }
        }
    }

    @Override // com.my.target.I0
    public void setBackgroundImage(@j.P com.my.target.common.models.b bVar) {
        this.f364496j.setImageData(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    @Override // com.my.target.I0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setBanner(@j.N e11.C39884l0 r9) {
        /*
            r8 = this;
            e11.p1 r0 = r9.f394671L
            int r1 = r0.f394733d
            r8.setBackgroundColor(r1)
            int r1 = r0.f394734e
            android.widget.TextView r2 = r8.f364504r
            int r3 = r0.f394735f
            r2.setTextColor(r3)
            android.widget.TextView r3 = r8.f364505s
            r3.setTextColor(r1)
            java.lang.String r1 = r9.f394708g
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            android.widget.TextView r4 = r8.f364506t
            r5 = 0
            r6 = 8
            if (r1 == 0) goto L2f
            java.lang.String r1 = r9.f394715n
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2b
            goto L2f
        L2b:
            r4.setVisibility(r6)
            goto L5a
        L2f:
            java.lang.String r1 = r9.f394715n
            java.lang.String r7 = r9.f394708g
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L47
            java.lang.String r7 = r9.f394715n
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L47
            java.lang.String r7 = " "
            java.lang.String r1 = androidx.appcompat.app.r.q(r1, r7)
        L47:
            java.lang.StringBuilder r1 = androidx.compose.foundation.H.r(r1)
            java.lang.String r7 = r9.f394708g
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r4.setVisibility(r5)
            r4.setText(r1)
        L5a:
            com.my.target.common.models.b r1 = r9.f394741H
            e11.k r4 = r8.f364490d
            if (r1 == 0) goto L6f
            android.graphics.Bitmap r7 = r1.a()
            if (r7 == 0) goto L6f
            android.graphics.Bitmap r1 = r1.a()
            r5 = 1
        L6b:
            r4.a(r1, r5)
            goto L80
        L6f:
            int r1 = e11.C39906t.f394832q
            e11.t r7 = r8.f364489c
            android.util.SparseIntArray r7 = r7.f394842a
            int r1 = r7.get(r1)
            android.graphics.Bitmap r1 = e11.C39898q.a(r1)
            if (r1 == 0) goto L80
            goto L6b
        L80:
            android.widget.Button r1 = r8.f364503q
            int r4 = r0.f394730a
            int r5 = r0.f394731b
            int r7 = r8.f364487N
            e11.C39924z.n(r1, r4, r5, r7)
            int r0 = r0.f394734e
            r1.setTextColor(r0)
            java.lang.String r0 = r9.a()
            r1.setText(r0)
            java.lang.String r0 = r9.f394706e
            r2.setText(r0)
            java.lang.String r0 = r9.f394704c
            r3.setText(r0)
            com.my.target.common.models.b r0 = r9.f394675P
            if (r0 == 0) goto Lb3
            android.graphics.Bitmap r1 = r0.a()
            if (r1 == 0) goto Lb3
            e11.y0 r1 = r8.f364497k
            r1.setImageData(r0)
            r1.setOnClickListener(r8)
        Lb3:
            com.my.target.h r0 = r9.f394698D
            e11.i0 r1 = r8.f364498l
            if (r0 == 0) goto Lc6
            com.my.target.common.models.b r0 = r0.f364851a
            android.graphics.Bitmap r0 = r0.a()
            r1.setImageBitmap(r0)
            r1.setOnClickListener(r8)
            goto Lc9
        Lc6:
            r1.setVisibility(r6)
        Lc9:
            e11.E1 r9 = r9.f394718q
            r8.setClickArea(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.N0.setBanner(e11.l0):void");
    }

    @Override // com.my.target.I0
    public void setPanelColor(int i12) {
        this.f364502p.setBackgroundColor(i12);
        this.f364501o.setBackgroundColor(i12);
    }

    @Override // com.my.target.I0
    public void setSoundState(boolean z12) {
        String str;
        C39880k c39880k = this.f364488b;
        if (z12) {
            c39880k.a(this.f364508v, false);
            str = "sound_on";
        } else {
            c39880k.a(this.f364509w, false);
            str = "sound_off";
        }
        c39880k.setContentDescription(str);
    }
}
