package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.my.target.nativeads.views.MediaAdView;
import e11.C39924z;
import e11.C39925z0;
import e11.a2;
import i11.C41211a;

/* loaded from: classes7.dex */
public class S extends ViewGroup {

    /* renamed from: B, reason: collision with root package name */
    public static final int f364544B;

    /* renamed from: C, reason: collision with root package name */
    public static final int f364545C;

    /* renamed from: D, reason: collision with root package name */
    public static final int f364546D;

    /* renamed from: E, reason: collision with root package name */
    public static final int f364547E;

    /* renamed from: F, reason: collision with root package name */
    public static final int f364548F;

    /* renamed from: G, reason: collision with root package name */
    public static final int f364549G;

    /* renamed from: H, reason: collision with root package name */
    public static final int f364550H;

    /* renamed from: I, reason: collision with root package name */
    public static final int f364551I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f364552J;

    /* renamed from: K, reason: collision with root package name */
    public static final int f364553K;

    /* renamed from: L, reason: collision with root package name */
    public static final int f364554L;

    /* renamed from: M, reason: collision with root package name */
    public static final int f364555M;

    /* renamed from: N, reason: collision with root package name */
    public static final int f364556N;

    /* renamed from: A, reason: collision with root package name */
    public boolean f364557A;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final TextView f364558b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C41211a f364559c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final Button f364560d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final Button f364561e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final C39924z f364562f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final LinearLayout f364563g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final TextView f364564h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    public final FrameLayout f364565i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    public final MediaAdView f364566j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    public final TextView f364567k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    public final C39925z0 f364568l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    public final e11.r f364569m;

    /* renamed from: n, reason: collision with root package name */
    @j.N
    public final U0 f364570n;

    /* renamed from: o, reason: collision with root package name */
    @j.N
    public final e11.N0 f364571o;

    /* renamed from: p, reason: collision with root package name */
    @j.N
    public final e11.N0 f364572p;

    /* renamed from: q, reason: collision with root package name */
    @j.N
    public final e11.N0 f364573q;

    /* renamed from: r, reason: collision with root package name */
    @j.N
    public final c f364574r;

    /* renamed from: s, reason: collision with root package name */
    @j.N
    public final d f364575s;

    /* renamed from: t, reason: collision with root package name */
    @j.N
    public final b f364576t;

    /* renamed from: u, reason: collision with root package name */
    @j.P
    public final Bitmap f364577u;

    /* renamed from: v, reason: collision with root package name */
    @j.P
    public final Bitmap f364578v;

    /* renamed from: w, reason: collision with root package name */
    public final int f364579w;

    /* renamed from: x, reason: collision with root package name */
    public final int f364580x;

    /* renamed from: y, reason: collision with root package name */
    @j.P
    public e f364581y;

    /* renamed from: z, reason: collision with root package name */
    public int f364582z;

    public class b implements View.OnClickListener {
        public b(a aVar) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            S s5 = S.this;
            if (s5.f364581y != null) {
                int id2 = view.getId();
                if (id2 == S.f364545C) {
                    s5.f364581y.a(view);
                    return;
                }
                if (id2 == S.f364546D) {
                    s5.f364581y.e();
                    return;
                }
                if (id2 == S.f364548F) {
                    s5.f364581y.h();
                    return;
                }
                if (id2 == S.f364547E) {
                    s5.f364581y.m();
                } else if (id2 == S.f364544B) {
                    s5.f364581y.a();
                } else if (id2 == S.f364553K) {
                    s5.f364581y.d();
                }
            }
        }
    }

    public class c implements Runnable {
        public c(a aVar) {
        }

        @Override // java.lang.Runnable
        public final void run() {
            S s5 = S.this;
            if (s5.f364582z == 2) {
                S.a(s5);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d(a aVar) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            S s5 = S.this;
            s5.removeCallbacks(s5.f364574r);
            int i12 = s5.f364582z;
            if (i12 == 2) {
                S.a(s5);
                return;
            }
            if (i12 == 0 && i12 != 2) {
                s5.f364582z = 2;
                MediaAdView mediaAdView = s5.f364566j;
                mediaAdView.getImageView().setVisibility(8);
                mediaAdView.getProgressBarView().setVisibility(8);
                s5.f364563g.setVisibility(8);
                s5.f364572p.setVisibility(8);
                s5.f364571o.setVisibility(0);
                s5.f364565i.setVisibility(8);
            }
            s5.postDelayed(s5.f364574r, 4000L);
        }
    }

    public interface e {
        void a();

        void a(View view);

        void d();

        void e();

        void h();

        void m();
    }

    static {
        int i12 = C39924z.f394913b;
        f364544B = View.generateViewId();
        f364545C = View.generateViewId();
        f364546D = View.generateViewId();
        f364547E = View.generateViewId();
        f364548F = View.generateViewId();
        f364549G = View.generateViewId();
        f364550H = View.generateViewId();
        f364551I = View.generateViewId();
        f364552J = View.generateViewId();
        f364553K = View.generateViewId();
        f364554L = View.generateViewId();
        f364555M = View.generateViewId();
        f364556N = View.generateViewId();
    }

    public S(@j.N Context context) {
        Bitmap bitmapCreateBitmap;
        TextView textView;
        e11.N0 n02;
        e11.N0 n03;
        e11.N0 n04;
        FrameLayout frameLayout;
        Bitmap bitmap;
        Bitmap bitmapCreateBitmap2;
        super(context);
        Button button = new Button(context);
        this.f364561e = button;
        TextView textView2 = new TextView(context);
        this.f364558b = textView2;
        C41211a c41211a = new C41211a(context);
        this.f364559c = c41211a;
        Button button2 = new Button(context);
        this.f364560d = button2;
        TextView textView3 = new TextView(context);
        this.f364564h = textView3;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f364565i = frameLayout2;
        e11.N0 n05 = new e11.N0(context);
        this.f364571o = n05;
        e11.N0 n06 = new e11.N0(context);
        this.f364572p = n06;
        e11.N0 n07 = new e11.N0(context);
        this.f364573q = n07;
        TextView textView4 = new TextView(context);
        this.f364567k = textView4;
        MediaAdView mediaAdView = new MediaAdView(context);
        this.f364566j = mediaAdView;
        C39925z0 c39925z0 = new C39925z0(context);
        this.f364568l = c39925z0;
        e11.r rVar = new e11.r(context);
        this.f364569m = rVar;
        this.f364563g = new LinearLayout(context);
        C39924z c39924z = new C39924z(context);
        this.f364562f = c39924z;
        this.f364574r = new c(null);
        this.f364575s = new d(null);
        this.f364576t = new b(null);
        this.f364570n = new U0(context);
        float f12 = 28;
        int iA2 = c39924z.a(f12);
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(iA2, iA2, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            frameLayout = frameLayout2;
            n04 = n05;
            n03 = n06;
            n02 = n07;
            textView = textView4;
            bitmap = null;
        } else {
            float f13 = iA2 / 100.0f;
            textView = textView4;
            Paint paint = new Paint();
            n02 = n07;
            paint.setColor(0);
            paint.setStyle(Paint.Style.STROKE);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            a2.a(f13, iA2, paint, canvas);
            n03 = n06;
            n04 = n05;
            frameLayout = frameLayout2;
            canvas.drawArc(new RectF(f13 * 57.0f, f13 * 45.0f, f13 * 67.0f, f13 * 55.0f), 90.0f, -180.0f, false, paint);
            canvas.drawArc(new RectF(52.0f * f13, f13 * 40.0f, 72.0f * f13, f13 * 60.0f), 90.0f, -180.0f, false, paint);
            bitmap = bitmapCreateBitmap;
        }
        this.f364577u = bitmap;
        int iA3 = c39924z.a(f12);
        try {
            bitmapCreateBitmap2 = Bitmap.createBitmap(iA3, iA3, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused2) {
            bitmapCreateBitmap2 = null;
        }
        if (bitmapCreateBitmap2 == null) {
            bitmapCreateBitmap2 = null;
        } else {
            float f14 = iA3 / 100.0f;
            Paint paint2 = new Paint();
            paint2.setColor(0);
            paint2.setStyle(Paint.Style.STROKE);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            a2.a(f14, iA3, paint2, canvas2);
            Path path = new Path();
            path.setFillType(Path.FillType.EVEN_ODD);
            float f15 = 62.0f * f14;
            float f16 = f14 * 40.0f;
            path.moveTo(f15, f16);
            float f17 = 82.0f * f14;
            float f18 = f14 * 60.0f;
            path.lineTo(f17, f18);
            path.moveTo(f15, f18);
            path.lineTo(f17, f16);
            canvas2.drawPath(path, paint2);
        }
        this.f364578v = bitmapCreateBitmap2;
        C39924z.m(button, "dismiss_button");
        C39924z.m(textView2, "title_text");
        C39924z.m(c41211a, "stars_view");
        C39924z.m(button2, "cta_button");
        C39924z.m(textView3, "replay_text");
        C39924z.m(frameLayout, "shadow");
        C39924z.m(n04, "pause_button");
        C39924z.m(n03, "play_button");
        C39924z.m(n02, "replay_button");
        C39924z.m(textView, "domain_text");
        C39924z.m(mediaAdView, "media_view");
        C39924z.m(c39925z0, "video_progress_wheel");
        C39924z.m(rVar, "sound_button");
        this.f364580x = c39924z.a(f12);
        float f19 = 16;
        int iA4 = c39924z.a(f19);
        this.f364579w = iA4;
        setBackgroundColor(-16777216);
        View view = this.f364569m;
        view.setId(f364553K);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        MediaAdView mediaAdView2 = this.f364566j;
        mediaAdView2.setId(f364556N);
        mediaAdView2.setLayoutParams(layoutParams);
        mediaAdView2.setId(f364552J);
        mediaAdView2.setOnClickListener(this.f364575s);
        mediaAdView2.setBackgroundColor(-16777216);
        View view2 = this.f364565i;
        view2.setBackgroundColor(-1728053248);
        view2.setVisibility(8);
        Button button3 = this.f364561e;
        button3.setId(f364544B);
        button3.setTextSize(2, 16.0f);
        button3.setTransformationMethod(null);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button3.setEllipsize(truncateAt);
        button3.setMaxLines(2);
        button3.setPadding(iA4, iA4, iA4, iA4);
        button3.setTextColor(-1);
        float f22 = 1;
        C39924z c39924z2 = this.f364562f;
        float f23 = 4;
        C39924z.i(this.f364561e, -2013265920, -1, -1, c39924z2.a(f22), c39924z2.a(f23));
        TextView textView5 = this.f364558b;
        textView5.setId(f364550H);
        textView5.setMaxLines(2);
        textView5.setEllipsize(truncateAt);
        textView5.setTextSize(2, 18.0f);
        textView5.setTextColor(-1);
        C39924z.i(this.f364560d, -2013265920, -1, -1, c39924z2.a(f22), c39924z2.a(f23));
        Button button4 = this.f364560d;
        button4.setId(f364545C);
        button4.setTextColor(-1);
        button4.setTransformationMethod(null);
        button4.setGravity(1);
        button4.setTextSize(2, 16.0f);
        button4.setLines(1);
        button4.setEllipsize(truncateAt);
        button4.setMinimumWidth(c39924z2.a(100));
        button4.setPadding(iA4, iA4, iA4, iA4);
        textView5.setShadowLayer(c39924z2.a(f22), c39924z2.a(f22), c39924z2.a(f22), -16777216);
        TextView textView6 = this.f364567k;
        textView6.setId(f364551I);
        textView6.setTextColor(-3355444);
        textView6.setMaxEms(10);
        textView6.setShadowLayer(c39924z2.a(f22), c39924z2.a(f22), c39924z2.a(f22), -16777216);
        LinearLayout linearLayout = this.f364563g;
        linearLayout.setId(f364546D);
        View.OnClickListener onClickListener = this.f364576t;
        linearLayout.setOnClickListener(onClickListener);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        float f24 = 8;
        linearLayout.setPadding(c39924z2.a(f24), 0, c39924z2.a(f24), 0);
        TextView textView7 = this.f364564h;
        textView7.setSingleLine();
        textView7.setEllipsize(truncateAt);
        textView7.setTypeface(textView7.getTypeface(), 1);
        textView7.setTextColor(-1);
        textView7.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = c39924z2.a(f23);
        this.f364573q.setPadding(c39924z2.a(f19), c39924z2.a(f19), c39924z2.a(f19), c39924z2.a(f19));
        e11.N0 n08 = this.f364571o;
        n08.setId(f364548F);
        n08.setOnClickListener(onClickListener);
        n08.setVisibility(8);
        n08.setPadding(c39924z2.a(f19), c39924z2.a(f19), c39924z2.a(f19), c39924z2.a(f19));
        e11.N0 n09 = this.f364572p;
        n09.setId(f364547E);
        n09.setOnClickListener(onClickListener);
        n09.setVisibility(8);
        n09.setPadding(c39924z2.a(f19), c39924z2.a(f19), c39924z2.a(f19), c39924z2.a(f19));
        view2.setId(f364554L);
        byte[] bArrDecode = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCy8fw79+rQAAAhVJREFUeNrt2y9IXlEYx3H3ooIiiCAIC4JgMRgsCyaLwWaxLK0srZhWVtYWVtYWlpYMNsvK0sKKRTANBivDIIggIiLiZ+URDncHFgzbznN+8d77nvPwvec99zz/xsa6uv4oPMWjzADgK55kBnCvj3icGQBc4hWmsgK41w/sZAPwswLiC9ayAJjGa1wNrt/hAxaaBlBcW8ReZTVc4CUmmwZQ3FvHYQXEd2w3DyDuj/AMJxUQn7HaNIDiuRm8wfUAwi3eY75pAMXzS9ivrIZz7GKiaQDF7zZwVAHxDVvNAyj2h+c4rYD4hJWmARRjzOItbir7wzvMNQ2gGGsZB5XVcIYXGG8aQDHmJo4rII6x2TyAGHc83vpZBcQBlpsGUIw/F/vA7QDCTewbs00DKOZZiS/DUKfxJRk1DaCYbyvOCkMdYaN5ADHnRJwazysg9rHUNIBi7vnwI4b7w3X4HTNNAyhsWA3PcqiT8ERHTQMobNmOWMNQh1hvHkDYMxlRp4sKiD0sNg2gsGsh4pB3AwhXEbecbhpAYd9aRKZVItgPT+v96wAKO3ciVzHUw9J6/wuAsHUqslaXFRC/pfVGY139L9A3wf4Z7AehfhTuzlB3h3tApIfE/jqAtEHRtGHx1ImRtKmxtMnRtOnx1AUSaUtk0hZJpS2TS10ombZUNm2xdPpy+d4w0VtmetNU2ra51I2TuVtnuxrWL/YiKQ6CN9uRAAAAAElFTkSuQmCC", 0);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = 420;
        int i12 = C39924z.a.f394916b;
        options.inTargetDensity = i12;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
        if (bitmapDecodeByteArray != null) {
            n09.setImageBitmap(bitmapDecodeByteArray);
        }
        byte[] bArrDecode2 = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCjITNKc0rQAAAJFJREFUeNrt2tENgCAMQEEwLuD+QzpC3cBURWLsvV+JNRfhi9YkSSpbP3sYETF0WO89s27m3KX6H1AeYL2wdrs5Y3/4ja/OTZ8B2f074h0z5zoDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/lr6rvDoK+xfmWsLNEmSVLUD47EiX/OuE8UAAAAASUVORK5CYII=", 0);
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inDensity = 420;
        options2.inTargetDensity = i12;
        Bitmap bitmapDecodeByteArray2 = BitmapFactory.decodeByteArray(bArrDecode2, 0, bArrDecode2.length, options2);
        if (bitmapDecodeByteArray2 != null) {
            n08.setImageBitmap(bitmapDecodeByteArray2);
        }
        C39924z.i(this.f364571o, -2013265920, -1, -1, c39924z2.a(f22), c39924z2.a(f23));
        C39924z.i(this.f364572p, -2013265920, -1, -1, c39924z2.a(f22), c39924z2.a(f23));
        C39924z.i(this.f364573q, -2013265920, -1, -1, c39924z2.a(f22), c39924z2.a(f23));
        C41211a c41211a2 = this.f364559c;
        c41211a2.setId(f364555M);
        c41211a2.setStarSize(c39924z2.a(12));
        this.f364568l.setId(f364549G);
        this.f364568l.setVisibility(8);
        mediaAdView2.addView(this.f364570n, new ViewGroup.LayoutParams(-1, -1));
        addView(mediaAdView2);
        addView(view2);
        addView(view);
        addView(button3);
        addView(this.f364568l);
        addView(linearLayout);
        addView(n08);
        addView(n09);
        addView(c41211a2);
        addView(textView6);
        addView(button4);
        addView(textView5);
        linearLayout.addView(this.f364573q);
        linearLayout.addView(textView7, layoutParams2);
        button4.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        view.setOnClickListener(onClickListener);
    }

    public static void a(S s5) {
        if (s5.f364582z != 0) {
            s5.f364582z = 0;
            MediaAdView mediaAdView = s5.f364566j;
            mediaAdView.getImageView().setVisibility(8);
            mediaAdView.getProgressBarView().setVisibility(8);
            s5.f364563g.setVisibility(8);
            s5.f364572p.setVisibility(8);
            s5.f364571o.setVisibility(8);
            s5.f364565i.setVisibility(8);
        }
    }

    @j.N
    public U0 getAdVideoView() {
        return this.f364570n;
    }

    @j.N
    public MediaAdView getMediaAdView() {
        return this.f364566j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int i16 = i14 - i12;
        int i17 = i15 - i13;
        MediaAdView mediaAdView = this.f364566j;
        int measuredWidth = mediaAdView.getMeasuredWidth();
        int measuredHeight = mediaAdView.getMeasuredHeight();
        int i18 = (i16 - measuredWidth) >> 1;
        int i19 = (i17 - measuredHeight) >> 1;
        mediaAdView.layout(i18, i19, measuredWidth + i18, measuredHeight + i19);
        this.f364565i.layout(mediaAdView.getLeft(), mediaAdView.getTop(), mediaAdView.getRight(), mediaAdView.getBottom());
        e11.N0 n02 = this.f364572p;
        int i22 = i14 >> 1;
        int measuredWidth2 = n02.getMeasuredWidth() >> 1;
        int i23 = i15 >> 1;
        int measuredHeight2 = n02.getMeasuredHeight() >> 1;
        n02.layout(i22 - measuredWidth2, i23 - measuredHeight2, measuredWidth2 + i22, measuredHeight2 + i23);
        e11.N0 n03 = this.f364571o;
        int measuredWidth3 = n03.getMeasuredWidth() >> 1;
        int measuredHeight3 = n03.getMeasuredHeight() >> 1;
        n03.layout(i22 - measuredWidth3, i23 - measuredHeight3, measuredWidth3 + i22, measuredHeight3 + i23);
        LinearLayout linearLayout = this.f364563g;
        int measuredWidth4 = linearLayout.getMeasuredWidth() >> 1;
        int measuredHeight4 = linearLayout.getMeasuredHeight() >> 1;
        linearLayout.layout(i22 - measuredWidth4, i23 - measuredHeight4, i22 + measuredWidth4, i23 + measuredHeight4);
        Button button = this.f364561e;
        int measuredWidth5 = button.getMeasuredWidth();
        int i24 = this.f364579w;
        button.layout(i24, i24, measuredWidth5 + i24, button.getMeasuredHeight() + i24);
        C39925z0 c39925z0 = this.f364568l;
        TextView textView = this.f364567k;
        C41211a c41211a = this.f364559c;
        TextView textView2 = this.f364558b;
        e11.r rVar = this.f364569m;
        Button button2 = this.f364560d;
        if (i16 > i17) {
            int iMax = Math.max(button2.getMeasuredHeight(), Math.max(textView2.getMeasuredHeight(), c41211a.getMeasuredHeight()));
            button2.layout((i16 - i24) - button2.getMeasuredWidth(), ((i17 - i24) - button2.getMeasuredHeight()) - ((iMax - button2.getMeasuredHeight()) >> 1), i16 - i24, (i17 - i24) - ((iMax - button2.getMeasuredHeight()) >> 1));
            rVar.layout(rVar.getPadding() + (button2.getRight() - rVar.getMeasuredWidth()), rVar.getPadding() + (((mediaAdView.getBottom() - (i24 << 1)) - rVar.getMeasuredHeight()) - iMax), rVar.getPadding() + button2.getRight(), rVar.getPadding() + ((mediaAdView.getBottom() - (i24 << 1)) - iMax));
            c41211a.layout((button2.getLeft() - i24) - c41211a.getMeasuredWidth(), ((i17 - i24) - c41211a.getMeasuredHeight()) - ((iMax - c41211a.getMeasuredHeight()) >> 1), button2.getLeft() - i24, (i17 - i24) - ((iMax - c41211a.getMeasuredHeight()) >> 1));
            textView.layout((button2.getLeft() - i24) - textView.getMeasuredWidth(), ((i17 - i24) - textView.getMeasuredHeight()) - ((iMax - textView.getMeasuredHeight()) >> 1), button2.getLeft() - i24, (i17 - i24) - ((iMax - textView.getMeasuredHeight()) >> 1));
            int iMin = Math.min(c41211a.getLeft(), textView.getLeft());
            textView2.layout((iMin - i24) - textView2.getMeasuredWidth(), ((i17 - i24) - textView2.getMeasuredHeight()) - ((iMax - textView2.getMeasuredHeight()) >> 1), iMin - i24, (i17 - i24) - ((iMax - textView2.getMeasuredHeight()) >> 1));
            c39925z0.layout(i24, ((i17 - i24) - c39925z0.getMeasuredHeight()) - ((iMax - c39925z0.getMeasuredHeight()) >> 1), c39925z0.getMeasuredWidth() + i24, (i17 - i24) - ((iMax - c39925z0.getMeasuredHeight()) >> 1));
            return;
        }
        rVar.layout(rVar.getPadding() + ((mediaAdView.getRight() - i24) - rVar.getMeasuredWidth()), rVar.getPadding() + ((mediaAdView.getBottom() - i24) - rVar.getMeasuredHeight()), rVar.getPadding() + (mediaAdView.getRight() - i24), rVar.getPadding() + (mediaAdView.getBottom() - i24));
        int i25 = i16 >> 1;
        textView2.layout(i25 - (textView2.getMeasuredWidth() >> 1), mediaAdView.getBottom() + i24, (textView2.getMeasuredWidth() >> 1) + i25, textView2.getMeasuredHeight() + mediaAdView.getBottom() + i24);
        c41211a.layout(i25 - (c41211a.getMeasuredWidth() >> 1), textView2.getBottom() + i24, (c41211a.getMeasuredWidth() >> 1) + i25, c41211a.getMeasuredHeight() + textView2.getBottom() + i24);
        textView.layout(i25 - (textView.getMeasuredWidth() >> 1), textView2.getBottom() + i24, (textView.getMeasuredWidth() >> 1) + i25, textView.getMeasuredHeight() + textView2.getBottom() + i24);
        button2.layout(i25 - (button2.getMeasuredWidth() >> 1), c41211a.getBottom() + i24, i25 + (button2.getMeasuredWidth() >> 1), button2.getMeasuredHeight() + c41211a.getBottom() + i24);
        c39925z0.layout(i24, (mediaAdView.getBottom() - i24) - c39925z0.getMeasuredHeight(), c39925z0.getMeasuredWidth() + i24, mediaAdView.getBottom() - i24);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int i14 = this.f364580x;
        this.f364569m.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        C39925z0 c39925z0 = this.f364568l;
        c39925z0.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, BeduinInputModel.MIN_TEXT_VERSION);
        int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, BeduinInputModel.MIN_TEXT_VERSION);
        MediaAdView mediaAdView = this.f364566j;
        mediaAdView.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
        int i15 = this.f364579w;
        int i16 = i15 << 1;
        int i17 = size - i16;
        int i18 = size2 - i16;
        this.f364561e.measure(View.MeasureSpec.makeMeasureSpec(i17 / 2, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
        this.f364571o.measure(View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
        this.f364572p.measure(View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
        this.f364563g.measure(View.MeasureSpec.makeMeasureSpec(i17 - (i15 * 4), BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
        int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION);
        int iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION);
        C41211a c41211a = this.f364559c;
        c41211a.measure(iMakeMeasureSpec5, iMakeMeasureSpec6);
        this.f364565i.measure(View.MeasureSpec.makeMeasureSpec(mediaAdView.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(mediaAdView.getMeasuredHeight(), 1073741824));
        Button button = this.f364560d;
        button.measure(View.MeasureSpec.makeMeasureSpec(i17 - (i15 * 4), BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
        TextView textView = this.f364558b;
        textView.measure(View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
        TextView textView2 = this.f364567k;
        textView2.measure(View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
        if (size > size2) {
            int measuredWidth = button.getMeasuredWidth();
            int measuredWidth2 = textView.getMeasuredWidth();
            if ((i15 * 3) + c39925z0.getMeasuredWidth() + measuredWidth2 + Math.max(c41211a.getMeasuredWidth(), textView2.getMeasuredWidth()) + measuredWidth > i17) {
                int measuredWidth3 = (i17 - c39925z0.getMeasuredWidth()) - (i15 * 3);
                int i19 = measuredWidth3 / 3;
                button.measure(View.MeasureSpec.makeMeasureSpec(i19, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
                c41211a.measure(View.MeasureSpec.makeMeasureSpec(i19, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
                textView2.measure(View.MeasureSpec.makeMeasureSpec(i19, BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
                textView.measure(View.MeasureSpec.makeMeasureSpec(((measuredWidth3 - button.getMeasuredWidth()) - textView2.getMeasuredWidth()) - c41211a.getMeasuredWidth(), BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(i18, BeduinInputModel.MIN_TEXT_VERSION));
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setVideoDialogViewListener(@j.P e eVar) {
        this.f364581y = eVar;
    }
}
