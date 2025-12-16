package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.my.target.InterfaceC37815v;
import com.my.target.Q0;
import e11.C39875i0;
import e11.C39884l0;
import e11.C39899q0;
import e11.C39913v0;
import e11.C39924z;
import e11.E1;
import e11.ViewOnClickListenerC39879j1;
import i11.C41211a;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.my.target.v0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37816v0 extends ViewGroup implements InterfaceC37806q {

    /* renamed from: A, reason: collision with root package name */
    @j.P
    public InterfaceC37815v.a f365166A;

    /* renamed from: B, reason: collision with root package name */
    @j.P
    public Q0.a f365167B;

    /* renamed from: C, reason: collision with root package name */
    public int f365168C;

    /* renamed from: D, reason: collision with root package name */
    public float f365169D;

    /* renamed from: E, reason: collision with root package name */
    public float f365170E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f365171F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f365172G;

    /* renamed from: H, reason: collision with root package name */
    @j.P
    public String f365173H;

    /* renamed from: I, reason: collision with root package name */
    @j.P
    public String f365174I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f365175J;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final LinearLayout f365176b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Y f365177c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final e11.I0 f365178d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final e11.I0 f365179e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final C39875i0 f365180f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final c f365181g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final b f365182h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    public final TextView f365183i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    public final C41211a f365184j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    public final Button f365185k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    public final TextView f365186l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    public final C39924z f365187m;

    /* renamed from: n, reason: collision with root package name */
    @j.N
    public final TextView f365188n;

    /* renamed from: o, reason: collision with root package name */
    @j.N
    public final C39899q0 f365189o;

    /* renamed from: p, reason: collision with root package name */
    @j.N
    public final e11.r f365190p;

    /* renamed from: q, reason: collision with root package name */
    @j.N
    public final e11.I0 f365191q;

    /* renamed from: r, reason: collision with root package name */
    @j.N
    public final d f365192r;

    /* renamed from: s, reason: collision with root package name */
    @j.N
    public final a f365193s;

    /* renamed from: t, reason: collision with root package name */
    @j.N
    public final TextView f365194t;

    /* renamed from: u, reason: collision with root package name */
    @j.N
    public final FrameLayout f365195u;

    /* renamed from: v, reason: collision with root package name */
    public final int f365196v;

    /* renamed from: w, reason: collision with root package name */
    public final int f365197w;

    /* renamed from: x, reason: collision with root package name */
    @j.P
    public final Bitmap f365198x;

    /* renamed from: y, reason: collision with root package name */
    @j.P
    public final Bitmap f365199y;

    /* renamed from: z, reason: collision with root package name */
    public final int f365200z;

    /* renamed from: com.my.target.v0$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            InterfaceC37815v.a aVar;
            Q0.a aVar2;
            C37816v0 c37816v0 = C37816v0.this;
            if (view == c37816v0.f365176b) {
                Q0.a aVar3 = c37816v0.f365167B;
                if (aVar3 != null) {
                    aVar3.l();
                }
            } else {
                e11.I0 i02 = c37816v0.f365178d;
                Y y12 = c37816v0.f365177c;
                if (view == i02) {
                    if (!y12.g() || (aVar2 = c37816v0.f365167B) == null) {
                        return;
                    }
                    aVar2.c();
                    return;
                }
                if (view != c37816v0.f365179e) {
                    if (view != c37816v0.f365180f || (aVar = c37816v0.f365166A) == null) {
                        return;
                    }
                    aVar.d();
                    return;
                }
                if (c37816v0.f365167B != null) {
                    if (y12.f()) {
                        c37816v0.f365167B.n();
                    } else {
                        c37816v0.f365167B.l();
                    }
                }
            }
            c37816v0.g();
        }
    }

    /* renamed from: com.my.target.v0$b */
    public final class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            InterfaceC37815v.a aVar;
            if (!view.isEnabled() || (aVar = C37816v0.this.f365166A) == null) {
                return;
            }
            aVar.e();
        }
    }

    /* renamed from: com.my.target.v0$c */
    public final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C37816v0 c37816v0 = C37816v0.this;
            int i12 = c37816v0.f365168C;
            if (i12 == 2 || i12 == 0) {
                c37816v0.g();
            }
        }
    }

    /* renamed from: com.my.target.v0$d */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C37816v0 c37816v0 = C37816v0.this;
            c37816v0.removeCallbacks(c37816v0.f365181g);
            int i12 = c37816v0.f365168C;
            c cVar = c37816v0.f365181g;
            if (i12 == 2) {
                c37816v0.g();
                c37816v0.postDelayed(cVar, 4000L);
            } else if (i12 == 0 || i12 == 3) {
                c37816v0.f365168C = 2;
                c37816v0.f365176b.setVisibility(8);
                c37816v0.f365179e.setVisibility(8);
                c37816v0.f365178d.setVisibility(0);
                c37816v0.f365195u.setVisibility(8);
                c37816v0.postDelayed(cVar, 4000L);
            }
        }
    }

    public C37816v0(@j.N Context context, boolean z12) {
        super(context);
        TextView textView = new TextView(context);
        this.f365186l = textView;
        TextView textView2 = new TextView(context);
        this.f365183i = textView2;
        C41211a c41211a = new C41211a(context);
        this.f365184j = c41211a;
        Button button = new Button(context);
        this.f365185k = button;
        TextView textView3 = new TextView(context);
        this.f365194t = textView3;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f365195u = frameLayout;
        e11.I0 i02 = new e11.I0(context);
        this.f365178d = i02;
        e11.I0 i03 = new e11.I0(context);
        this.f365179e = i03;
        e11.I0 i04 = new e11.I0(context);
        this.f365191q = i04;
        TextView textView4 = new TextView(context);
        this.f365188n = textView4;
        Y y12 = new Y(context, new C39924z(context), false, z12);
        this.f365177c = y12;
        C39899q0 c39899q0 = new C39899q0(context);
        this.f365189o = c39899q0;
        e11.r rVar = new e11.r(context);
        this.f365190p = rVar;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f365176b = linearLayout;
        C39924z c39924z = new C39924z(context);
        this.f365187m = c39924z;
        this.f365181g = new c();
        this.f365192r = new d();
        a aVar = new a();
        this.f365193s = aVar;
        C39875i0 c39875i0 = new C39875i0(context);
        this.f365180f = c39875i0;
        C39924z.m(textView, "dismiss_button");
        C39924z.m(textView2, "title_text");
        C39924z.m(c41211a, "stars_view");
        C39924z.m(button, "cta_button");
        C39924z.m(textView3, "replay_text");
        C39924z.m(frameLayout, "shadow");
        C39924z.m(i02, "pause_button");
        C39924z.m(i03, "play_button");
        C39924z.m(i04, "replay_button");
        C39924z.m(textView4, "domain_text");
        C39924z.m(y12, "media_view");
        C39924z.m(c39899q0, "video_progress_wheel");
        C39924z.m(rVar, "sound_button");
        int iA2 = c39924z.a(28);
        this.f365200z = iA2;
        float f12 = 16;
        int iA3 = c39924z.a(f12);
        this.f365196v = iA3;
        float f13 = 4;
        this.f365197w = c39924z.a(f13);
        this.f365198x = e11.C0.a(320, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAMAAACfWMssAAAAdVBMVEUAAAAAAAAgICDf398QEBDv7+/Pz8+fn58gICAQEBDe3t5AQEBwcHDv7+9/f3/f398wMDCAgIBgYGCQkJDAwMC/v7/Pz8+fn59QUFBAQECvr69QUFCPj4+/v79wcHBvb29gYGBfX1++vr6urq6Ojo5hYWH///+8blWlAAAAJnRSTlOAAJDviPfnzyAQ3qC478DfmICvx9/fz59QQK+oj79wb2Bfvq6OsPCmZBAAAAJhSURBVEjHndbXYuIwEAXQiSQXueAGtmkhJNn7/5+4I8JmbJAWw33iQYex7FGhN0/s9jT0FTjVcXfavvlC92o8lpil3J0fQ9s4FXdtrYij8qKLXeUhDUFhm8LQLKp1tknDcKyY5eRJnQDZOQDtwcOkrAa+rQ+mPaKC/pMiQpbew7SCVgEiRUWSuNjQg5hYJP26hBYkYTmFluvRosTo7QQeoM0yaDS+BX4gUrQwKsJ4hW6CRfBF6ruvgsxeYROcYB4BdJs1mh+YAoEHXQEemKO0FzgEvoRJAKbkL8mwQh3okygnhv6SxK80DkxPKxI4Lzky3KH1Ty8x9AM14mQ/f7GfDEso//SIfiEwWwEGpaUtYhke4Ro3vX+QU//hCdfTxtvSOzrpYIkigS6mm3ZXh3faSddEN8PlUTet+9vNL2wx0BH5ZFAAuhmbSEbW6KmCegTJFGC0kkZRyGRMEHIYbXi0ngxdCA0i9/sViNdggQ3ViCdDl72cFdBSO385PeqFn0NjL+vjkwa0DxsgcidDBz3p8t3ilktuWi7U5Ho/hWoV3TW5LWGWLKuN1COFktfjEcXDhayT2fHXYsdwxJo82evw1hHjzNCWyAObld57YY3ssss1WD+3PSYYHJSSCzdkBaQOSknfRD1QX48ALpk9eeikF8gZnzvmzi8erIfpUd4vP8ozO7s8ZK9dHpx8+roi8skLksjHV7I+DV0C42DRfA0cbODa+ZEBSR1i2Ri+6KYNuGp7U9YUzMpGygmc0CFztivyi1Z128UQ5oPywF+3l/njKEygL9vT12cGTtUPp631DfkLyeFPR/ZOiKIAAAAASUVORK5CYII=");
        this.f365199y = e11.C0.a(320, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAMAAACfWMssAAAAclBMVEUAAAAAAAAgICDf39+goKAgICAQEBDe3t7Pz88QEBDv7+9wcHBAQEDf39+AgIDv7+/AwMCQkJDPz8+/v7+vr69gYGCfn5+Pj49fX19QUFBAQEAwMDBQUFDu7u5/f39/f39wcHBvb2+/v78wMDCvr6////9R0hTPAAAAJXRSTlOAAJDvzyAQ3ueI97ig34Dv38fPv6+vn49fUECYqO7Av3Bv35fYiozA+AAAAjJJREFUSMe91um2mjAUBeBDGMOkjDJoe63d7/+KTbyxpzZJgXat7j8i8nkICUkocCRZ7mNbQaXq+vsSuEK2mrsT3nLqp22Y1FplzbAKUhFl0WS68hj7ILNvhaS3iEHbOvbDuVKsJEfWCEgnD0wuzOyIELgkLhi3yAv6Q4ocaWzDuEIoPISLsiR2maSNyIwl/XQR7Uj0lAwTVY92JUOb/AIvCOU+KENcGE7IBe2MyDEbqBtYeB9kaPUK0sTA2tvAMgesk2fUnzAGhNt9ARywxC15wtHTEzICvhpoldSwwuoZJ3lJBlolFZyQeZoXCjLQKjkr2GNwNy+S5IEFOgVPEO7mEfmgVPdKCzK+PIeJbp4fUoaFPtDwCOYIYihfXx5k0uCDeh41+dvlfBSGwvzx1ZwdMFKHki9yH0VQ0nx8ZkVLFcQGNIQdkUCqf9mEGrHTAXZBLdn9Fxgh/P4mgb9/OC3WLdhY3VGioxHD8QFQoN8z5IR89TvxkPMN8vC6NciTE+TR10rgFlDQoTj6Ig/oFZxxJkeuoX/qyDApqO61dEmh5NUJV6TPWa7G+dj0GGHUkEvunJAFEGvIJZ0NtWFolgBVMj246MQGBvOxZW7694U1SNr9S3mavG0e0uObh5c8vF1heXCDxHJ7S9bGvk1g5i1anq1NIGdKgejhY+ns3+jGNYBs+K2sLBQ71UnggEzHVNumKJ9aPIYmAzMH5Ez9DRytupkZQ1eWe9+l2lTteF+UsvMDBKFIvMRHIr8AAAAASUVORK5CYII=");
        this.f365182h = new b();
        setBackgroundColor(-16777216);
        y12.setBackgroundColor(-16777216);
        y12.e();
        frameLayout.setBackgroundColor(-1728053248);
        frameLayout.setVisibility(8);
        textView.setTextSize(2, 16.0f);
        textView.setTransformationMethod(null);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setVisibility(8);
        textView.setTextAlignment(4);
        textView.setTextColor(-1);
        float f14 = 1;
        C39924z.i(textView, -2013265920, -1, -1, c39924z.a(f14), c39924z.a(f13));
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView2.setTextSize(2, 18.0f);
        textView2.setTextColor(-1);
        C39924z.i(button, -2013265920, -1, -1, c39924z.a(f14), c39924z.a(f13));
        button.setTextColor(-1);
        button.setTransformationMethod(null);
        button.setGravity(1);
        button.setTextSize(2, 16.0f);
        button.setMinimumWidth(c39924z.a(100));
        button.setPadding(iA3, iA3, iA3, iA3);
        textView2.setShadowLayer(c39924z.a(f14), c39924z.a(f14), c39924z.a(f14), -16777216);
        textView4.setTextColor(-3355444);
        textView4.setMaxEms(10);
        textView4.setShadowLayer(c39924z.a(f14), c39924z.a(f14), c39924z.a(f14), -16777216);
        linearLayout.setOnClickListener(aVar);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        float f15 = 8;
        linearLayout.setPadding(c39924z.a(f15), 0, c39924z.a(f15), 0);
        textView3.setSingleLine();
        textView3.setEllipsize(truncateAt);
        textView3.setTypeface(textView3.getTypeface(), 1);
        textView3.setTextColor(-1);
        textView3.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = c39924z.a(f13);
        i04.setPadding(c39924z.a(f12), c39924z.a(f12), c39924z.a(f12), c39924z.a(f12));
        i02.setOnClickListener(aVar);
        i02.setVisibility(8);
        i02.setPadding(c39924z.a(f12), c39924z.a(f12), c39924z.a(f12), c39924z.a(f12));
        i03.setOnClickListener(aVar);
        i03.setVisibility(8);
        i03.setPadding(c39924z.a(f12), c39924z.a(f12), c39924z.a(f12), c39924z.a(f12));
        getContext();
        Bitmap bitmapA = e11.C0.a(420, "iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCy8fw79+rQAAAhVJREFUeNrt2y9IXlEYx3H3ooIiiCAIC4JgMRgsCyaLwWaxLK0srZhWVtYWVtYWlpYMNsvK0sKKRTANBivDIIggIiLiZ+URDncHFgzbznN+8d77nvPwvec99zz/xsa6uv4oPMWjzADgK55kBnCvj3icGQBc4hWmsgK41w/sZAPwswLiC9ayAJjGa1wNrt/hAxaaBlBcW8ReZTVc4CUmmwZQ3FvHYQXEd2w3DyDuj/AMJxUQn7HaNIDiuRm8wfUAwi3eY75pAMXzS9ivrIZz7GKiaQDF7zZwVAHxDVvNAyj2h+c4rYD4hJWmARRjzOItbir7wzvMNQ2gGGsZB5XVcIYXGG8aQDHmJo4rII6x2TyAGHc83vpZBcQBlpsGUIw/F/vA7QDCTewbs00DKOZZiS/DUKfxJRk1DaCYbyvOCkMdYaN5ADHnRJwazysg9rHUNIBi7vnwI4b7w3X4HTNNAyhsWA3PcqiT8ERHTQMobNmOWMNQh1hvHkDYMxlRp4sKiD0sNg2gsGsh4pB3AwhXEbecbhpAYd9aRKZVItgPT+v96wAKO3ciVzHUw9J6/wuAsHUqslaXFRC/pfVGY139L9A3wf4Z7AehfhTuzlB3h3tApIfE/jqAtEHRtGHx1ImRtKmxtMnRtOnx1AUSaUtk0hZJpS2TS10ombZUNm2xdPpy+d4w0VtmetNU2ra51I2TuVtnuxrWL/YiKQ6CN9uRAAAAAElFTkSuQmCC");
        if (bitmapA != null) {
            i03.setImageBitmap(bitmapA);
        }
        getContext();
        Bitmap bitmapA2 = e11.C0.a(420, "iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCjITNKc0rQAAAJFJREFUeNrt2tENgCAMQEEwLuD+QzpC3cBURWLsvV+JNRfhi9YkSSpbP3sYETF0WO89s27m3KX6H1AeYL2wdrs5Y3/4ja/OTZ8B2f074h0z5zoDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/lr6rvDoK+xfmWsLNEmSVLUD47EiX/OuE8UAAAAASUVORK5CYII=");
        if (bitmapA2 != null) {
            i02.setImageBitmap(bitmapA2);
        }
        C39924z.i(i02, -2013265920, -1, -1, c39924z.a(f14), c39924z.a(f13));
        C39924z.i(i03, -2013265920, -1, -1, c39924z.a(f14), c39924z.a(f13));
        C39924z.i(i04, -2013265920, -1, -1, c39924z.a(f14), c39924z.a(f13));
        c41211a.setStarSize(c39924z.a(12));
        c39899q0.setVisibility(8);
        c39875i0.setFixedHeight(iA2);
        addView(y12);
        addView(frameLayout);
        addView(rVar);
        addView(textView);
        addView(c39899q0);
        addView(linearLayout);
        addView(i02);
        addView(i03);
        addView(c41211a);
        addView(textView4);
        addView(button);
        addView(textView2);
        addView(c39875i0);
        linearLayout.addView(i04);
        linearLayout.addView(textView3, layoutParams);
    }

    @Override // com.my.target.InterfaceC37806q
    public final void a() {
        Y y12 = this.f365177c;
        y12.f364642d.setVisibility(8);
        P0 p02 = y12.f364649k;
        if (p02 == null || y12.f364650l == null) {
            return;
        }
        p02.a();
        y12.f364640b.setVisibility(8);
    }

    @Override // com.my.target.InterfaceC37806q
    public final void b() {
        int i12 = this.f365168C;
        if (i12 == 0 || i12 == 2) {
            this.f365168C = 1;
            this.f365176b.setVisibility(8);
            this.f365179e.setVisibility(0);
            this.f365178d.setVisibility(8);
            this.f365195u.setVisibility(0);
            this.f365177c.h();
        }
    }

    @Override // com.my.target.InterfaceC37806q
    public final void c() {
        Y y12 = this.f365177c;
        y12.f364640b.setVisibility(8);
        y12.f364646h.setVisibility(8);
        this.f365176b.setVisibility(8);
        this.f365179e.setVisibility(8);
        if (this.f365168C != 2) {
            this.f365178d.setVisibility(8);
        }
    }

    @Override // com.my.target.InterfaceC37815v
    public final void d() {
        TextView textView = this.f365186l;
        textView.setText(this.f365173H);
        textView.setTextSize(2, 16.0f);
        textView.setVisibility(0);
        textView.setTextColor(-1);
        textView.setEnabled(true);
        int i12 = this.f365196v;
        textView.setPadding(i12, i12, i12, i12);
        C39924z c39924z = this.f365187m;
        C39924z.i(textView, -2013265920, -1, -1, c39924z.a(1), c39924z.a(4));
        this.f365175J = true;
    }

    @Override // com.my.target.InterfaceC37806q
    public final void destroy() {
        Y y12 = this.f365177c;
        P0 p02 = y12.f364649k;
        if (p02 != null) {
            p02.destroy();
        }
        y12.f364649k = null;
    }

    @Override // com.my.target.InterfaceC37806q
    public final void e() {
        this.f365189o.setVisibility(8);
        this.f365168C = 4;
        if (this.f365172G) {
            this.f365176b.setVisibility(0);
            this.f365195u.setVisibility(0);
        }
        this.f365179e.setVisibility(8);
        this.f365178d.setVisibility(8);
    }

    @Override // com.my.target.InterfaceC37806q
    public final boolean f() {
        return this.f365177c.g();
    }

    public final void g() {
        this.f365168C = 0;
        this.f365176b.setVisibility(8);
        this.f365179e.setVisibility(8);
        this.f365178d.setVisibility(8);
        this.f365195u.setVisibility(8);
    }

    @Override // com.my.target.InterfaceC37815v
    @j.N
    public View getCloseButton() {
        return this.f365186l;
    }

    @Override // com.my.target.InterfaceC37806q
    @j.N
    public Y getPromoMediaView() {
        return this.f365177c;
    }

    @Override // com.my.target.InterfaceC37806q
    public final boolean i() {
        return this.f365177c.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int i16 = i14 - i12;
        int i17 = i15 - i13;
        Y y12 = this.f365177c;
        int measuredWidth = y12.getMeasuredWidth();
        int measuredHeight = y12.getMeasuredHeight();
        int i18 = (i16 - measuredWidth) >> 1;
        int i19 = (i17 - measuredHeight) >> 1;
        y12.layout(i18, i19, measuredWidth + i18, measuredHeight + i19);
        this.f365195u.layout(y12.getLeft(), y12.getTop(), y12.getRight(), y12.getBottom());
        e11.I0 i02 = this.f365179e;
        int i22 = i14 >> 1;
        int measuredWidth2 = i02.getMeasuredWidth() >> 1;
        int i23 = i15 >> 1;
        int measuredHeight2 = i02.getMeasuredHeight() >> 1;
        i02.layout(i22 - measuredWidth2, i23 - measuredHeight2, measuredWidth2 + i22, measuredHeight2 + i23);
        e11.I0 i03 = this.f365178d;
        int measuredWidth3 = i03.getMeasuredWidth() >> 1;
        int measuredHeight3 = i03.getMeasuredHeight() >> 1;
        i03.layout(i22 - measuredWidth3, i23 - measuredHeight3, measuredWidth3 + i22, measuredHeight3 + i23);
        LinearLayout linearLayout = this.f365176b;
        int measuredWidth4 = linearLayout.getMeasuredWidth() >> 1;
        int measuredHeight4 = linearLayout.getMeasuredHeight() >> 1;
        linearLayout.layout(i22 - measuredWidth4, i23 - measuredHeight4, i22 + measuredWidth4, i23 + measuredHeight4);
        TextView textView = this.f365186l;
        int measuredWidth5 = textView.getMeasuredWidth();
        int i24 = this.f365196v;
        textView.layout(i24, i24, measuredWidth5 + i24, textView.getMeasuredHeight() + i24);
        C39875i0 c39875i0 = this.f365180f;
        C39899q0 c39899q0 = this.f365189o;
        TextView textView2 = this.f365188n;
        C41211a c41211a = this.f365184j;
        TextView textView3 = this.f365183i;
        e11.r rVar = this.f365190p;
        Button button = this.f365185k;
        if (i16 > i17) {
            int iMax = Math.max(button.getMeasuredHeight(), Math.max(textView3.getMeasuredHeight(), c41211a.getMeasuredHeight()));
            button.layout((i16 - i24) - button.getMeasuredWidth(), ((i17 - i24) - button.getMeasuredHeight()) - ((iMax - button.getMeasuredHeight()) >> 1), i16 - i24, (i17 - i24) - ((iMax - button.getMeasuredHeight()) >> 1));
            rVar.layout(rVar.getPadding() + (button.getRight() - rVar.getMeasuredWidth()), rVar.getPadding() + (((y12.getBottom() - (i24 << 1)) - rVar.getMeasuredHeight()) - iMax), rVar.getPadding() + button.getRight(), rVar.getPadding() + ((y12.getBottom() - (i24 << 1)) - iMax));
            c39875i0.layout(button.getRight() - c39875i0.getMeasuredWidth(), i24, button.getRight(), c39875i0.getMeasuredHeight() + i24);
            c41211a.layout((button.getLeft() - i24) - c41211a.getMeasuredWidth(), ((i17 - i24) - c41211a.getMeasuredHeight()) - ((iMax - c41211a.getMeasuredHeight()) >> 1), button.getLeft() - i24, (i17 - i24) - ((iMax - c41211a.getMeasuredHeight()) >> 1));
            textView2.layout((button.getLeft() - i24) - textView2.getMeasuredWidth(), ((i17 - i24) - textView2.getMeasuredHeight()) - ((iMax - textView2.getMeasuredHeight()) >> 1), button.getLeft() - i24, (i17 - i24) - ((iMax - textView2.getMeasuredHeight()) >> 1));
            int iMin = Math.min(c41211a.getLeft(), textView2.getLeft());
            textView3.layout((iMin - i24) - textView3.getMeasuredWidth(), ((i17 - i24) - textView3.getMeasuredHeight()) - ((iMax - textView3.getMeasuredHeight()) >> 1), iMin - i24, (i17 - i24) - ((iMax - textView3.getMeasuredHeight()) >> 1));
            c39899q0.layout(i24, ((i17 - i24) - c39899q0.getMeasuredHeight()) - ((iMax - c39899q0.getMeasuredHeight()) >> 1), c39899q0.getMeasuredWidth() + i24, (i17 - i24) - ((iMax - c39899q0.getMeasuredHeight()) >> 1));
            return;
        }
        rVar.layout(rVar.getPadding() + ((y12.getRight() - i24) - rVar.getMeasuredWidth()), rVar.getPadding() + ((y12.getBottom() - i24) - rVar.getMeasuredHeight()), rVar.getPadding() + (y12.getRight() - i24), rVar.getPadding() + (y12.getBottom() - i24));
        c39875i0.layout((y12.getRight() - i24) - c39875i0.getMeasuredWidth(), y12.getTop() + i24, y12.getRight() - i24, c39875i0.getMeasuredHeight() + y12.getTop() + i24);
        int measuredHeight5 = button.getMeasuredHeight() + textView2.getMeasuredHeight() + c41211a.getMeasuredHeight() + textView3.getMeasuredHeight();
        int bottom = getBottom() - y12.getBottom();
        int i25 = (i24 * 3) + measuredHeight5 > bottom ? (bottom - measuredHeight5) / 3 : i24;
        int i26 = i16 >> 1;
        textView3.layout(i26 - (textView3.getMeasuredWidth() >> 1), y12.getBottom() + i25, (textView3.getMeasuredWidth() >> 1) + i26, textView3.getMeasuredHeight() + y12.getBottom() + i25);
        c41211a.layout(i26 - (c41211a.getMeasuredWidth() >> 1), textView3.getBottom() + i25, (c41211a.getMeasuredWidth() >> 1) + i26, c41211a.getMeasuredHeight() + textView3.getBottom() + i25);
        textView2.layout(i26 - (textView2.getMeasuredWidth() >> 1), textView3.getBottom() + i25, (textView2.getMeasuredWidth() >> 1) + i26, textView2.getMeasuredHeight() + textView3.getBottom() + i25);
        button.layout(i26 - (button.getMeasuredWidth() >> 1), c41211a.getBottom() + i25, i26 + (button.getMeasuredWidth() >> 1), button.getMeasuredHeight() + c41211a.getBottom() + i25);
        c39899q0.layout(i24, (y12.getBottom() - i24) - c39899q0.getMeasuredHeight(), c39899q0.getMeasuredWidth() + i24, y12.getBottom() - i24);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int i14 = this.f365200z;
        this.f365190p.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        C39899q0 c39899q0 = this.f365189o;
        c39899q0.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, BeduinInputModel.MIN_TEXT_VERSION);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, BeduinInputModel.MIN_TEXT_VERSION);
        Y y12 = this.f365177c;
        y12.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
        int i15 = this.f365196v;
        int i16 = i15 << 1;
        int i17 = size - i16;
        int i18 = size2 - i16;
        this.f365186l.measure(View.MeasureSpec.makeMeasureSpec(i17 / 2, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
        this.f365180f.measure(View.MeasureSpec.makeMeasureSpec(i14, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i14, BeduinInputModel.MIN_TEXT_VERSION));
        this.f365178d.measure(View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
        this.f365179e.measure(View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
        this.f365176b.measure(View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
        int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION);
        int iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION);
        C41211a c41211a = this.f365184j;
        c41211a.measure(iMakeMeasureSpec5, iMakeMeasureSpec6);
        this.f365195u.measure(View.MeasureSpec.makeMeasureSpec(y12.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(y12.getMeasuredHeight(), 1073741824));
        Button button = this.f365185k;
        button.measure(View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
        TextView textView = this.f365183i;
        textView.measure(View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
        TextView textView2 = this.f365188n;
        textView2.measure(View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
        if (size > size2) {
            int measuredWidth = button.getMeasuredWidth();
            int measuredWidth2 = textView.getMeasuredWidth();
            if ((i15 * 3) + c39899q0.getMeasuredWidth() + measuredWidth2 + Math.max(c41211a.getMeasuredWidth(), textView2.getMeasuredWidth()) + measuredWidth > i17) {
                int measuredWidth3 = (i17 - c39899q0.getMeasuredWidth()) - (i15 * 3);
                int i19 = measuredWidth3 / 3;
                button.measure(View.MeasureSpec.makeMeasureSpec(i19, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
                c41211a.measure(View.MeasureSpec.makeMeasureSpec(i19, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
                textView2.measure(View.MeasureSpec.makeMeasureSpec(i19, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
                textView.measure(View.MeasureSpec.makeMeasureSpec(((measuredWidth3 - button.getMeasuredWidth()) - textView2.getMeasuredWidth()) - c41211a.getMeasuredWidth(), BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
            }
        } else {
            int measuredHeight = button.getMeasuredHeight() + textView2.getMeasuredHeight() + c41211a.getMeasuredHeight() + textView.getMeasuredHeight();
            if ((i15 * 3) + measuredHeight > (size2 - y12.getMeasuredHeight()) / 2) {
                int i22 = i15 / 2;
                button.setPadding(i15, i22, i15, i22);
                button.measure(View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.InterfaceC37815v
    public void setBanner(@j.N C39884l0 c39884l0) {
        String str;
        this.f365177c.c(c39884l0, 1);
        C39913v0<com.my.target.common.models.e> c39913v0 = c39884l0.f394673N;
        if (c39913v0 == null) {
            return;
        }
        this.f365189o.setMax(c39884l0.f394724w);
        this.f365172G = c39913v0.f394865S;
        this.f365171F = c39884l0.f394743J;
        this.f365185k.setText(c39884l0.a());
        this.f365183i.setText(c39884l0.f394706e);
        boolean zEquals = "store".equals(c39884l0.f394714m);
        TextView textView = this.f365188n;
        C41211a c41211a = this.f365184j;
        if (zEquals) {
            if (c39884l0.f394709h > 0.0f) {
                c41211a.setVisibility(0);
                c41211a.setRating(c39884l0.f394709h);
            } else {
                c41211a.setVisibility(8);
            }
            textView.setVisibility(8);
        } else {
            c41211a.setVisibility(8);
            textView.setVisibility(0);
            textView.setText(c39884l0.f394713l);
        }
        String str2 = c39913v0.f394859M;
        this.f365173H = str2;
        this.f365174I = c39913v0.f394861O;
        TextView textView2 = this.f365186l;
        textView2.setText(str2);
        if (c39913v0.f394867U && c39913v0.f394863Q) {
            float f12 = c39913v0.f394872Z;
            if (f12 > 0.0f) {
                this.f365170E = f12;
                textView2.setEnabled(false);
                textView2.setTextColor(-3355444);
                int i12 = this.f365197w;
                textView2.setPadding(i12, i12, i12, i12);
                C39924z c39924z = this.f365187m;
                C39924z.i(textView2, -2013265920, -2013265920, -3355444, c39924z.a(1), c39924z.a(4));
                textView2.setTextSize(2, 12.0f);
            } else {
                int i13 = this.f365196v;
                textView2.setPadding(i13, i13, i13, i13);
                textView2.setVisibility(0);
            }
        }
        this.f365194t.setText(c39913v0.f394860N);
        getContext();
        Bitmap bitmapA = e11.C0.a(420, "iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCjM59gfMOgAAA59JREFUeNrtmkloFEEUhl/N6KgxriiJOHEXF4gENYlgRFA8uyAoCNGggl68CCJ6EQx6cCFqUFzABQQRMYh4EfSi4IJbiFERQVxRgxuRMWri5yE1UBY9yWh6Znq6+z+96a6ZV/8/tbz3qkRChAgRwiMAFgJngWgQyVcDHXTiFKCCRH4Df6MFKAkK+W0W+VfAxCAQV8A+i/wTIB4E8lHgpEX+LjA8COQHAM8t8o3ATKC338kXA59IjXbgEVAPLAb6+k2AHRbhVrrGV+AwMNVPIpx3INncjRi/gTPAWL+IcMIieBGIAXFgGXAU+OggRALY7ItIEdhvkTsNRIz3MWCp3h1sXAGK/RAHnLKIHUzRdgnwwmr7Epjsh3jggkWsNkXbQuC4Q8g8Ld9F6ANctYht7KL9GiNpAnib94ujDo5uaUIdwMo00uafhghNQL98F2EYcA9YlGb75daoOeqHnSHyj+23WyLMC1oRJQpct7LJXkETYSrwyxBhlQQNwAFrFKigCTDK2hXmBnEUnDMEOBZEARYaArwLogAF1jRIq4YQ8YsASqmEiNw2HpUHSgCNB4Y9KYgCPDXs8UEU4LNhF6bzhW7DRmCEiFTqjx+VUtc8LECrYfd3RQA9lxq03SgiZR4WIGbYv9yaAt8Me5DHp8DAFP3ukQDvDTvu8WxrnGG/dUUApdQrEUkYU2a8hwWYnGJH6PEu0GzYczwaCSoRqTIeNbkpwFXDnu/Rf79URJKnyz9E5Kab6i4wYuxvQKEHR8BO8+DE7R+PAu8MB6s9Rj4GvDH6tzYTTvZaVZeIhwSoMfr2HRiUCSd21aXGI+T7WRcu6jLp7Ijh6AMw1AMCmKXxtozeLgOKgC+Gw4ZcFiCB2fpWSRLbsuF0nXUYsSlH5EfqE+IknmblSo0+1m6wRKjOMvnB+jzQHPpl2ezAEOCx0YEOYH2WfMct8rlZkIES4LXVkXqgTwZ9Vjn43JrLFXgC8Mzq0H2g0mU/BTrSa7d8bfHCPlwE3HC41XWyp9fbdIS3Tt8fxprzq7wUivYGdmnithCXgRXpxgw67K4A9ljhdxKPgVK3+q5cFqJcRA6JyAyn1zpFfaBz9RZdtYnpStNonc/PEpEhDt9vE5FaEdmtlPrh2YoEEAEWpbje9j9o1aNrhOQbgOlAncNC2R0SwCVgZaZTb5VFMUpEpEJEpojIGBEZLJ21+zbpLGe3iMgTEXkoIneUUj8lRIgQIUKECJFJ/AEepzU1TSID5QAAAABJRU5ErkJggg==");
        if (bitmapA != null) {
            this.f365191q.setImageBitmap(bitmapA);
        }
        if (c39913v0.f394863Q) {
            c(true);
            g();
        } else {
            this.f365168C = 1;
            this.f365176b.setVisibility(8);
            this.f365179e.setVisibility(0);
            this.f365178d.setVisibility(8);
            this.f365195u.setVisibility(0);
        }
        this.f365169D = c39913v0.f394724w;
        ViewOnClickListenerC39879j1 viewOnClickListenerC39879j1 = new ViewOnClickListenerC39879j1(this, 0);
        e11.r rVar = this.f365190p;
        rVar.setOnClickListener(viewOnClickListenerC39879j1);
        if (c39913v0.f394862P) {
            rVar.a(this.f365199y, false);
            str = "sound_off";
        } else {
            rVar.a(this.f365198x, false);
            str = "sound_on";
        }
        rVar.setContentDescription(str);
        C37788h c37788h = c39884l0.f394698D;
        C39875i0 c39875i0 = this.f365180f;
        if (c37788h == null) {
            c39875i0.setVisibility(8);
        } else {
            c39875i0.setImageBitmap(c37788h.f364851a.a());
            c39875i0.setOnClickListener(this.f365193s);
        }
    }

    @Override // com.my.target.InterfaceC37815v
    public void setClickArea(@j.N E1 e12) {
        int i12 = e12.f394346o;
        boolean z12 = e12.f394343l;
        View.OnClickListener onClickListener = this.f365182h;
        boolean z13 = e12.f394344m;
        setOnClickListener((z12 || z13) ? onClickListener : null);
        this.f365185k.setOnClickListener((e12.f394338g || z13) ? onClickListener : null);
        this.f365183i.setOnClickListener((e12.f394332a || z13) ? onClickListener : null);
        this.f365184j.setOnClickListener((e12.f394336e || z13) ? onClickListener : null);
        this.f365188n.setOnClickListener((e12.f394341j || z13) ? onClickListener : null);
        FrameLayout clickableLayout = this.f365177c.getClickableLayout();
        if (!e12.f394345n && !z13) {
            onClickListener = this.f365192r;
        }
        clickableLayout.setOnClickListener(onClickListener);
    }

    @Override // com.my.target.InterfaceC37815v
    public void setInterstitialPromoViewListener(@j.P InterfaceC37815v.a aVar) {
        this.f365166A = aVar;
    }

    @Override // com.my.target.InterfaceC37806q
    public void setMediaListener(@j.P Q0.a aVar) {
        this.f365167B = aVar;
        this.f365177c.setInterstitialPromoViewListener(aVar);
    }

    @Override // com.my.target.InterfaceC37806q
    public void setTimeChanged(float f12) {
        if (!this.f365175J && this.f365171F) {
            float f13 = this.f365170E;
            if (f13 > 0.0f && f13 >= f12) {
                TextView textView = this.f365186l;
                if (textView.getVisibility() != 0) {
                    textView.setVisibility(0);
                }
                if (this.f365174I != null) {
                    int iCeil = (int) Math.ceil(this.f365170E - f12);
                    String strValueOf = String.valueOf(iCeil);
                    if (this.f365170E > 9.0f && iCeil <= 9) {
                        strValueOf = androidx.camera.camera2.internal.G.f("0", strValueOf);
                    }
                    textView.setText(this.f365174I.replace("%d", strValueOf));
                }
            }
        }
        C39899q0 c39899q0 = this.f365189o;
        if (c39899q0.getVisibility() != 0) {
            c39899q0.setVisibility(0);
        }
        c39899q0.setProgress(f12 / this.f365169D);
        c39899q0.setDigit((int) Math.ceil(this.f365169D - f12));
    }

    @Override // com.my.target.InterfaceC37806q
    public final void a(int i12) {
        P0 p02 = this.f365177c.f364649k;
        if (p02 != null) {
            if (i12 == 0) {
                p02.r();
            } else if (i12 != 1) {
                p02.m();
            } else {
                p02.o();
            }
        }
    }

    @Override // com.my.target.InterfaceC37806q
    public final void b(boolean z12) {
        String str;
        e11.r rVar = this.f365190p;
        if (z12) {
            rVar.a(this.f365199y, false);
            str = "sound_off";
        } else {
            rVar.a(this.f365198x, false);
            str = "sound_on";
        }
        rVar.setContentDescription(str);
    }

    @Override // com.my.target.InterfaceC37806q
    public final void c(boolean z12) {
        this.f365177c.b(z12);
        g();
    }

    @Override // com.my.target.InterfaceC37806q
    public final void a(@j.N C39884l0 c39884l0) {
        Y y12 = this.f365177c;
        y12.setOnClickListener(null);
        this.f365190p.setVisibility(8);
        P0 p02 = y12.f364649k;
        if (p02 != null) {
            p02.destroy();
        }
        y12.f364649k = null;
        y12.a(c39884l0);
        d();
        this.f365168C = 4;
        this.f365176b.setVisibility(8);
        this.f365179e.setVisibility(8);
        this.f365178d.setVisibility(8);
        this.f365195u.setVisibility(8);
        this.f365189o.setVisibility(8);
    }

    @Override // com.my.target.InterfaceC37806q
    public final void a(boolean z12) {
        this.f365177c.d(true);
    }

    @Override // com.my.target.InterfaceC37815v
    @j.N
    public View getView() {
        return this;
    }
}
