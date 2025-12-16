package e11;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.my.target.common.MyTargetActivity;
import e11.C39924z;
import java.net.URI;

/* renamed from: e11.x1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39920x1 extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final int f394886o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f394887p;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39924z f394888b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final ImageButton f394889c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final LinearLayout f394890d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final TextView f394891e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final TextView f394892f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final FrameLayout f394893g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final View f394894h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    public final FrameLayout f394895i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    public final ImageButton f394896j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    public final RelativeLayout f394897k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    public final C39912v f394898l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    public final ProgressBar f394899m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    public d f394900n;

    /* renamed from: e11.x1$a */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            C39920x1.this.f394891e.setText(C39920x1.a(str));
            return true;
        }
    }

    /* renamed from: e11.x1$b */
    public class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i12) {
            C39920x1 c39920x1 = C39920x1.this;
            if (i12 < 100 && c39920x1.f394899m.getVisibility() == 8) {
                c39920x1.f394899m.setVisibility(0);
                c39920x1.f394894h.setVisibility(8);
            }
            c39920x1.f394899m.setProgress(i12);
            if (i12 >= 100) {
                c39920x1.f394899m.setVisibility(8);
                c39920x1.f394894h.setVisibility(0);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            C39920x1 c39920x1 = C39920x1.this;
            c39920x1.f394892f.setText(webView.getTitle());
            c39920x1.f394892f.setVisibility(0);
        }
    }

    /* renamed from: e11.x1$c */
    public class c implements View.OnClickListener {
        public c(a aVar) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C39920x1 c39920x1 = C39920x1.this;
            if (view == c39920x1.f394889c) {
                d dVar = c39920x1.f394900n;
                if (dVar != null) {
                    dVar.a();
                    return;
                }
                return;
            }
            if (view == c39920x1.f394896j) {
                String url = c39920x1.f394898l.getUrl();
                if (TextUtils.isEmpty(url)) {
                    return;
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
                    if (!(c39920x1.getContext() instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    c39920x1.getContext().startActivity(intent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: e11.x1$d */
    public interface d {
        void a();
    }

    static {
        int i12 = C39924z.f394913b;
        f394886o = View.generateViewId();
        f394887p = View.generateViewId();
    }

    public C39920x1(@j.N MyTargetActivity myTargetActivity) {
        super(myTargetActivity);
        this.f394897k = new RelativeLayout(myTargetActivity);
        this.f394898l = new C39912v(myTargetActivity);
        this.f394889c = new ImageButton(myTargetActivity);
        this.f394890d = new LinearLayout(myTargetActivity);
        this.f394891e = new TextView(myTargetActivity);
        this.f394892f = new TextView(myTargetActivity);
        this.f394893g = new FrameLayout(myTargetActivity);
        this.f394895i = new FrameLayout(myTargetActivity);
        this.f394896j = new ImageButton(myTargetActivity);
        this.f394899m = new ProgressBar(myTargetActivity, null, R.attr.progressBarStyleHorizontal);
        this.f394894h = new View(myTargetActivity);
        this.f394888b = new C39924z(myTargetActivity);
    }

    public static String a(String str) {
        try {
            URI uri = new URI(str);
            return uri.getScheme() + "://" + uri.getHost();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return str;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void b() {
        C39912v c39912v = this.f394898l;
        WebSettings settings = c39912v.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
            settings.setDomStorageEnabled(true);
            settings.setAppCacheEnabled(true);
            settings.setAppCachePath(getContext().getCacheDir().getAbsolutePath());
        }
        c39912v.setWebViewClient(new a());
        c39912v.setWebChromeClient(new b());
        setOrientation(1);
        setGravity(16);
        c cVar = new c(null);
        c39912v.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        TypedValue typedValue = new TypedValue();
        C39924z c39924z = this.f394888b;
        int iA2 = c39924z.a(50);
        if (getContext().getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            iA2 = TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, iA2);
        RelativeLayout relativeLayout = this.f394897k;
        relativeLayout.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iA2, iA2);
        FrameLayout frameLayout = this.f394893g;
        frameLayout.setLayoutParams(layoutParams2);
        int i12 = f394886o;
        frameLayout.setId(i12);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        ImageButton imageButton = this.f394889c;
        imageButton.setLayoutParams(layoutParams3);
        int i13 = iA2 / 4;
        float f12 = 2;
        int iA3 = c39924z.a(f12);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i13, i13, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(iA3);
        paint.setAntiAlias(true);
        paint.setColor(-7829368);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setStyle(Paint.Style.STROKE);
        float f13 = i13;
        canvas.drawLine(0.0f, 0.0f, f13, f13, paint);
        canvas.drawLine(0.0f, f13, f13, 0.0f, paint);
        imageButton.setImageBitmap(bitmapCreateBitmap);
        imageButton.setContentDescription("Close");
        imageButton.setOnClickListener(cVar);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(iA2, iA2);
        layoutParams4.addRule(21);
        FrameLayout frameLayout2 = this.f394895i;
        frameLayout2.setLayoutParams(layoutParams4);
        int i14 = f394887p;
        frameLayout2.setId(i14);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams5.gravity = 17;
        ImageButton imageButton2 = this.f394896j;
        imageButton2.setLayoutParams(layoutParams5);
        getContext();
        byte[] bArrDecode = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAGAAAABgCAQAAABIkb+zAAAAAmJLR0QAAKqNIzIAAAAJcEhZcwAACxMAAAsTAQCanBgAAAAHdElNRQfgAR0KGztQKbC4AAAA8UlEQVR42u2aQQ6EMAzE6IhH8wR+DfeVoCAySRfs82plQ0FNxTQBAAAAAMBXab0frFut4NIeBFTLX4lo4+ufJ+i1z8BI1//sHvz9HSCAAAIIIIAAAiqZo/bl0Vzdi7GECCCAAAJGDlg392wtr77/eEBufXeC/PreBGXoOxOUo+9LUJa+K0F5+p4EZeo7EpSrH5+gbP3oBOXrxyaoQj8yQTX6cQmq0o9KUJ1+TML89A+Ozot+1VznSkxkBBBAAAEEEEAAAQQQ4J8HeqPH3f3+UDMxS4iAgDXt5cVf7iruvVJx/Tuv0aWN//k9AAAAAAB8lx0xVUXCRDTw+wAAAABJRU5ErkJggg==", 0);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = 640;
        int i15 = C39924z.f394913b;
        options.inTargetDensity = C39924z.a.f394916b;
        imageButton2.setImageBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
        imageButton2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageButton2.setContentDescription("Open outside");
        imageButton2.setOnClickListener(cVar);
        C39924z.g(imageButton, 0, -3355444);
        C39924z.g(imageButton2, 0, -3355444);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(15, -1);
        layoutParams6.addRule(1, i12);
        layoutParams6.addRule(0, i14);
        LinearLayout linearLayout = this.f394890d;
        linearLayout.setLayoutParams(layoutParams6);
        linearLayout.setOrientation(1);
        float f14 = 4;
        linearLayout.setPadding(c39924z.a(f14), c39924z.a(f14), c39924z.a(f14), c39924z.a(f14));
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        TextView textView = this.f394892f;
        textView.setVisibility(8);
        textView.setLayoutParams(layoutParams7);
        textView.setTextColor(-16777216);
        textView.setTextSize(2, 18.0f);
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
        textView.setEllipsize(truncateAt);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        TextView textView2 = this.f394891e;
        textView2.setLayoutParams(layoutParams8);
        textView2.setSingleLine();
        textView2.setTextSize(2, 12.0f);
        textView2.setEllipsize(truncateAt);
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(-16537100), 8388611, 1);
        ColorDrawable colorDrawable = new ColorDrawable(-1968642);
        ProgressBar progressBar = this.f394899m;
        LayerDrawable layerDrawable = (LayerDrawable) progressBar.getProgressDrawable();
        layerDrawable.setDrawableByLayerId(R.id.background, colorDrawable);
        layerDrawable.setDrawableByLayerId(R.id.progress, clipDrawable);
        progressBar.setProgressDrawable(layerDrawable);
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, c39924z.a(f12)));
        progressBar.setProgress(0);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        frameLayout.addView(imageButton);
        frameLayout2.addView(imageButton2);
        relativeLayout.addView(frameLayout);
        relativeLayout.addView(linearLayout);
        relativeLayout.addView(frameLayout2);
        addView(relativeLayout);
        View view = this.f394894h;
        view.setBackgroundColor(-5592406);
        ViewGroup.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, 1);
        view.setVisibility(8);
        view.setLayoutParams(layoutParams9);
        addView(progressBar);
        addView(view);
        addView(c39912v);
    }

    public void setListener(@j.P d dVar) {
        this.f394900n = dVar;
    }

    public void setUrl(@j.N String str) {
        WebView webView = this.f394898l.f394853b;
        if (webView != null) {
            try {
                webView.loadUrl(str);
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        this.f394891e.setText(a(str));
    }
}
