package com.yandex.mobile.ads.nativeads.template;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.cb;
import com.yandex.mobile.ads.impl.dq;
import com.yandex.mobile.ads.impl.jv;
import com.yandex.mobile.ads.impl.l41;
import com.yandex.mobile.ads.impl.nv;
import com.yandex.mobile.ads.impl.qw0;
import com.yandex.mobile.ads.impl.rj1;
import com.yandex.mobile.ads.impl.uv;
import com.yandex.mobile.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import com.yandex.mobile.ads.nativeads.NativeAdType;
import com.yandex.mobile.ads.nativeads.j0;
import com.yandex.mobile.ads.nativeads.n;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import com.yandex.mobile.ads.nativeads.template.a;
import com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance;
import com.yandex.mobile.ads.nativeads.u;
import j.K;
import j.N;
import j.P;
import j.k0;
import java.util.Arrays;

@K
/* loaded from: classes8.dex */
public final class NativeBannerView extends n<j0> {

    /* renamed from: A, reason: collision with root package name */
    private LinearLayout f392737A;

    /* renamed from: B, reason: collision with root package name */
    private CustomizableMediaView f392738B;

    /* renamed from: C, reason: collision with root package name */
    private LinearLayout f392739C;

    /* renamed from: D, reason: collision with root package name */
    private NativeAdType f392740D;

    /* renamed from: E, reason: collision with root package name */
    private NativeAdAssets f392741E;

    /* renamed from: F, reason: collision with root package name */
    private e f392742F;

    /* renamed from: G, reason: collision with root package name */
    private d f392743G;

    /* renamed from: H, reason: collision with root package name */
    private NativeAd f392744H;

    /* renamed from: I, reason: collision with root package name */
    private com.yandex.mobile.ads.nativeads.template.b f392745I;

    /* renamed from: J, reason: collision with root package name */
    private final NativeAdImageLoadingListener f392746J;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final dq f392747b;

    /* renamed from: c, reason: collision with root package name */
    private final int f392748c;

    /* renamed from: d, reason: collision with root package name */
    private final int f392749d;

    /* renamed from: e, reason: collision with root package name */
    private final int f392750e;

    /* renamed from: f, reason: collision with root package name */
    private NativeTemplateAppearance f392751f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f392752g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f392753h;

    /* renamed from: i, reason: collision with root package name */
    private Button f392754i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f392755j;

    /* renamed from: k, reason: collision with root package name */
    @N
    private ImageView f392756k;

    /* renamed from: l, reason: collision with root package name */
    private ImageView f392757l;

    /* renamed from: m, reason: collision with root package name */
    private f f392758m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f392759n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f392760o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f392761p;

    /* renamed from: q, reason: collision with root package name */
    private qw0 f392762q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f392763r;

    /* renamed from: s, reason: collision with root package name */
    private ImageView f392764s;

    /* renamed from: t, reason: collision with root package name */
    private ImageView f392765t;

    /* renamed from: u, reason: collision with root package name */
    private LinearLayout f392766u;

    /* renamed from: v, reason: collision with root package name */
    @N
    private FrameLayout f392767v;

    /* renamed from: w, reason: collision with root package name */
    @N
    private LinearLayout f392768w;

    /* renamed from: x, reason: collision with root package name */
    private LinearLayout f392769x;

    /* renamed from: y, reason: collision with root package name */
    private LinearLayout f392770y;

    /* renamed from: z, reason: collision with root package name */
    private ImageView f392771z;

    public class a implements NativeAdImageLoadingListener {
        public a() {
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener
        public final void onFinishLoadingImages() {
            if (NativeBannerView.this.f392744H != null) {
                NativeBannerView.this.f392744H.removeImageLoadingListener(this);
            }
            NativeBannerView.this.f392745I.a();
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f392773a;

        static {
            int[] iArr = new int[SizeConstraint.SizeConstraintType.values().length];
            f392773a = iArr;
            try {
                iArr[SizeConstraint.SizeConstraintType.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f392773a[SizeConstraint.SizeConstraintType.FIXED_RATIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f392773a[SizeConstraint.SizeConstraintType.PREFERRED_RATIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public NativeBannerView(@N Context context) {
        super(context);
        this.f392748c = rj1.a(getContext(), 4.0f);
        this.f392749d = rj1.a(getContext(), 8.0f);
        this.f392750e = rj1.a(getContext(), 12.0f);
        this.f392746J = new a();
        this.f392747b = new dq();
        p();
    }

    private void p() {
        this.f392751f = new NativeTemplateAppearance.Builder().build();
        ImageView imageView = new ImageView(getContext());
        imageView.setAdjustViewBounds(true);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        imageView.setScaleType(scaleType);
        this.f392765t = imageView;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f392768w = linearLayout2;
        linearLayout2.setOrientation(0);
        this.f392768w.setGravity(17);
        this.f392768w.setWeightSum(4.0f);
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setGravity(17);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 2.0f));
        f fVar = new f(getContext());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        fVar.setEllipsize(truncateAt);
        fVar.setMaxLines(1);
        fVar.setGravity(17);
        fVar.setPadding(0, 0, 0, rj1.a(getContext(), 4.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        fVar.setLayoutParams(layoutParams);
        this.f392758m = fVar;
        linearLayout3.addView(fVar);
        LinearLayout linearLayout4 = new LinearLayout(getContext());
        linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(getContext());
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(8388611);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.rightMargin = this.f392748c;
        textView.setLayoutParams(layoutParams2);
        this.f392752g = textView;
        linearLayout4.addView(textView);
        this.f392768w.addView(linearLayout4);
        this.f392768w.addView(linearLayout3);
        this.f392768w.addView(view);
        LinearLayout linearLayout5 = this.f392768w;
        LinearLayout linearLayout6 = new LinearLayout(getContext());
        this.f392769x = linearLayout6;
        linearLayout6.setOrientation(0);
        this.f392769x.setBaselineAligned(false);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = this.f392748c;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(layoutParams3);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setAdjustViewBounds(true);
        imageView2.setScaleType(scaleType);
        this.f392761p = imageView2;
        ImageView imageView3 = new ImageView(getContext());
        imageView3.setAdjustViewBounds(true);
        imageView3.setScaleType(scaleType);
        this.f392757l = imageView3;
        ImageView imageView4 = new ImageView(getContext());
        imageView4.setAdjustViewBounds(true);
        imageView4.setScaleType(scaleType);
        this.f392764s = imageView4;
        frameLayout.addView(this.f392761p);
        frameLayout.addView(this.f392757l);
        frameLayout.addView(this.f392764s);
        LinearLayout linearLayout7 = new LinearLayout(getContext());
        linearLayout7.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout7.setOrientation(1);
        TextView textView2 = new TextView(getContext());
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(2);
        textView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f392759n = textView2;
        TextView textView3 = new TextView(getContext());
        textView3.setEllipsize(truncateAt);
        textView3.setMaxLines(3);
        textView3.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f392753h = textView3;
        TextView textView4 = new TextView(getContext());
        textView4.setEllipsize(truncateAt);
        textView4.setMaxLines(1);
        textView4.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f392755j = textView4;
        linearLayout7.addView(this.f392759n);
        linearLayout7.addView(this.f392753h);
        linearLayout7.addView(this.f392755j);
        LinearLayout linearLayout8 = new LinearLayout(getContext());
        this.f392770y = linearLayout8;
        linearLayout8.setOrientation(0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = this.f392749d;
        this.f392770y.setLayoutParams(layoutParams4);
        LinearLayout linearLayout9 = new LinearLayout(getContext());
        linearLayout9.setOrientation(1);
        linearLayout9.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        qw0 qw0Var = new qw0(getContext(), null, R.attr.ratingBarStyleSmall);
        qw0Var.setNumStars(5);
        qw0Var.setStepSize(0.5f);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.rightMargin = this.f392749d;
        qw0Var.setLayoutParams(layoutParams5);
        this.f392762q = qw0Var;
        TextView textView5 = new TextView(getContext());
        textView5.setEllipsize(truncateAt);
        textView5.setMaxLines(1);
        textView5.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f392763r = textView5;
        linearLayout9.addView(this.f392762q);
        linearLayout9.addView(this.f392763r);
        LinearLayout linearLayout10 = new LinearLayout(getContext());
        linearLayout10.setOrientation(0);
        linearLayout10.setGravity(5);
        linearLayout10.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Button button = new Button(getContext(), null, R.attr.borderlessButtonStyle);
        button.setEllipsize(truncateAt);
        button.setMaxLines(1);
        button.setTransformationMethod(null);
        int iA2 = rj1.a(getContext(), 26.0f);
        button.setMinimumHeight(iA2);
        button.setMinHeight(iA2);
        button.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f392754i = button;
        linearLayout10.addView(button);
        this.f392770y.addView(linearLayout9);
        this.f392770y.addView(linearLayout10);
        linearLayout7.addView(this.f392770y);
        this.f392769x.addView(frameLayout);
        this.f392769x.addView(linearLayout7);
        LinearLayout linearLayout11 = this.f392769x;
        LinearLayout linearLayout12 = new LinearLayout(getContext());
        linearLayout12.setOrientation(0);
        linearLayout12.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f392737A = linearLayout12;
        ImageView imageView5 = new ImageView(getContext());
        imageView5.setAdjustViewBounds(true);
        imageView5.setScaleType(scaleType);
        imageView5.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f392771z = imageView5;
        this.f392737A.addView(imageView5);
        LinearLayout linearLayout13 = this.f392737A;
        LinearLayout linearLayout14 = new LinearLayout(getContext());
        linearLayout14.setOrientation(0);
        linearLayout14.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f392739C = linearLayout14;
        CustomizableMediaView customizableMediaView = new CustomizableMediaView(getContext());
        customizableMediaView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f392738B = customizableMediaView;
        this.f392739C.addView(customizableMediaView);
        LinearLayout linearLayout15 = this.f392739C;
        TextView textView6 = new TextView(getContext());
        textView6.setEllipsize(truncateAt);
        this.f392760o = textView6;
        linearLayout.addView(linearLayout5);
        linearLayout.addView(linearLayout11);
        linearLayout.addView(linearLayout13);
        linearLayout.addView(linearLayout15);
        linearLayout.addView(textView6);
        this.f392766u = linearLayout;
        int iA3 = rj1.a(getContext(), this.f392751f.getBannerAppearance().getContentPadding().getRight()) - this.f392749d;
        uv uvVar = new uv(getContext());
        this.f392767v = new nv(getContext()).a();
        ImageView imageViewA = uvVar.a(iA3, this.f392748c);
        this.f392756k = imageViewA;
        this.f392767v.addView(imageViewA);
        this.f392767v.setVisibility(8);
        addView(this.f392765t, new ViewGroup.LayoutParams(-1, -2));
        addView(this.f392766u, new ViewGroup.LayoutParams(-1, -1));
        addView(this.f392767v);
        this.f392765t.setVisibility(8);
        this.f392766u.setVisibility(8);
        this.f392745I = new com.yandex.mobile.ads.nativeads.template.b(this.f392764s, this.f392761p, this.f392757l, this.f392771z, this.f392765t);
        a();
    }

    public void applyAppearance(@N NativeTemplateAppearance nativeTemplateAppearance) {
        if (nativeTemplateAppearance == null || nativeTemplateAppearance.equals(this.f392751f)) {
            return;
        }
        this.f392751f = nativeTemplateAppearance;
        a();
    }

    public final TextView c() {
        return this.f392753h;
    }

    public final Button d() {
        return this.f392754i;
    }

    public final TextView e() {
        return this.f392755j;
    }

    public final ImageView f() {
        return this.f392764s;
    }

    @N
    public final ImageView g() {
        return this.f392756k;
    }

    public final ImageView h() {
        return this.f392761p;
    }

    public final ImageView i() {
        NativeAdImage image;
        ImageView imageView = this.f392757l;
        if (this.f392743G == null || (image = this.f392741E.getImage()) == null) {
            return imageView;
        }
        this.f392743G.getClass();
        if ("fill".equals(image.a())) {
            return this.f392765t;
        }
        this.f392743G.getClass();
        return d.a(image) ? this.f392771z : imageView;
    }

    public final CustomizableMediaView j() {
        return this.f392738B;
    }

    public final qw0 k() {
        return this.f392762q;
    }

    public final TextView l() {
        return this.f392763r;
    }

    public final TextView m() {
        return this.f392758m;
    }

    public final TextView n() {
        return this.f392759n;
    }

    public final TextView o() {
        return this.f392760o;
    }

    @Override // com.yandex.mobile.ads.nativeads.n, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NativeAd nativeAd = this.f392744H;
        if (nativeAd != null) {
            nativeAd.addImageLoadingListener(this.f392746J);
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.n, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        NativeAd nativeAd = this.f392744H;
        if (nativeAd != null) {
            nativeAd.removeImageLoadingListener(this.f392746J);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int iRound;
        int iRound2;
        if (this.f392743G != null) {
            int size = View.MeasureSpec.getSize(i12);
            float borderWidth = this.f392751f.getBannerAppearance().getBorderWidth();
            dq dqVar = this.f392747b;
            Context context = getContext();
            dqVar.getClass();
            int iA2 = size - (dq.a(context, borderWidth) * 2);
            if (iA2 < 0) {
                iA2 = 0;
            }
            d dVar = this.f392743G;
            Context context2 = getContext();
            int iA3 = rj1.a(context2, this.f392751f.getBannerAppearance().getContentPadding().getLeft());
            int iA4 = l41.a(context2, 1, this.f392751f.getBannerAppearance().getContentPadding().getRight());
            if (dVar.b() || dVar.c() || dVar.f()) {
                int iRound3 = Math.round((iA2 - iA3) - iA4);
                int iRound4 = Math.round(TypedValue.applyDimension(1, iA3, context2.getResources().getDisplayMetrics())) + rj1.a(getContext(), this.f392751f.getBannerAppearance().getImageMargins().getLeft());
                int iA5 = rj1.a(getContext(), this.f392751f.getBannerAppearance().getImageMargins().getRight());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
                if (dVar.b()) {
                    NativeAdImage favicon = this.f392741E.getFavicon();
                    int width = favicon.getWidth();
                    int height = favicon.getHeight();
                    SizeConstraint widthConstraint = this.f392751f.getFaviconAppearance().getWidthConstraint();
                    int i14 = b.f392773a[widthConstraint.getSizeConstraintType().ordinal()];
                    a.d dVarA = (i14 != 1 ? i14 != 2 ? i14 != 3 ? new a.c(widthConstraint.getValue()) : new a.c(widthConstraint.getValue()) : new a.b(widthConstraint.getValue()) : new a.C10990a(widthConstraint.getValue())).a(getContext(), iRound3, width, height);
                    int iA6 = rj1.a(getContext(), 5.0f);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dVarA.b(), dVarA.a());
                    layoutParams2.leftMargin = iRound4;
                    layoutParams2.rightMargin = iA6;
                    layoutParams = layoutParams2;
                }
                this.f392764s.setLayoutParams(layoutParams);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(0, 0);
                if (dVar.c()) {
                    NativeAdImage icon = this.f392741E.getIcon();
                    int width2 = icon.getWidth();
                    int height2 = icon.getHeight();
                    SizeConstraint widthConstraint2 = this.f392751f.getImageAppearance().getWidthConstraint();
                    int i15 = b.f392773a[widthConstraint2.getSizeConstraintType().ordinal()];
                    a.d dVarA2 = (i15 != 1 ? i15 != 2 ? i15 != 3 ? new a.c(widthConstraint2.getValue()) : new a.c(widthConstraint2.getValue()) : new a.b(widthConstraint2.getValue()) : new a.C10990a(widthConstraint2.getValue())).a(getContext(), iRound3, width2, height2);
                    FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(dVarA2.b(), dVarA2.a());
                    layoutParams4.leftMargin = iRound4;
                    layoutParams4.rightMargin = iA5;
                    layoutParams3 = layoutParams4;
                }
                this.f392761p.setLayoutParams(layoutParams3);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(0, 0);
                if (dVar.f()) {
                    NativeAdImage image = this.f392741E.getImage();
                    int width3 = image.getWidth();
                    int height3 = image.getHeight();
                    SizeConstraint widthConstraint3 = this.f392751f.getImageAppearance().getWidthConstraint();
                    int i16 = b.f392773a[widthConstraint3.getSizeConstraintType().ordinal()];
                    a.d dVarA3 = (i16 != 1 ? i16 != 2 ? i16 != 3 ? new a.c(widthConstraint3.getValue()) : new a.c(widthConstraint3.getValue()) : new a.b(widthConstraint3.getValue()) : new a.C10990a(widthConstraint3.getValue())).a(getContext(), iRound3, width3, height3);
                    layoutParams5 = new FrameLayout.LayoutParams(dVarA3.b(), dVarA3.a());
                    layoutParams5.leftMargin = iRound4;
                    layoutParams5.rightMargin = iA5;
                }
                this.f392757l.setLayoutParams(layoutParams5);
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) this.f392769x.getLayoutParams();
                layoutParams6.leftMargin = 0;
                this.f392769x.setLayoutParams(layoutParams6);
            } else {
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(0, 0);
                this.f392764s.setLayoutParams(layoutParams7);
                this.f392761p.setLayoutParams(layoutParams7);
                this.f392757l.setLayoutParams(layoutParams7);
                LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) this.f392769x.getLayoutParams();
                layoutParams8.leftMargin = iA3;
                this.f392769x.setLayoutParams(layoutParams8);
            }
            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, 0);
            if (dVar.d()) {
                NativeAdImage image2 = this.f392741E.getImage();
                int width4 = image2.getWidth();
                int height4 = image2.getHeight();
                float width5 = image2.getWidth();
                float height5 = image2.getHeight();
                if (height5 == 0.0f || width5 / height5 >= 1.0f) {
                    if (width4 != 0) {
                        height4 = Math.round(height4 * (iA2 / width4));
                    }
                    iRound = iA2;
                    iRound2 = height4;
                } else {
                    iRound2 = Math.round((iA2 * 3) / 4);
                    iRound = Math.round((iRound2 / height4) * width4);
                }
                float width6 = image2.getWidth();
                float height6 = image2.getHeight();
                if (height6 == 0.0f || width6 / height6 <= 1.5f) {
                    iRound2 = Math.round(iRound2 * 0.8f);
                }
                layoutParams9 = new LinearLayout.LayoutParams(iRound, iRound2);
                layoutParams9.topMargin = (this.f392742F.a() || this.f392742F.d()) ? this.f392748c : 0;
                layoutParams9.gravity = 1;
            }
            this.f392737A.setLayoutParams(layoutParams9);
            d dVar2 = this.f392743G;
            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(0, 0);
            NativeAdMedia media = this.f392741E.getMedia();
            if (media != null && dVar2.e()) {
                layoutParams10 = new LinearLayout.LayoutParams(iA2, new cb(media.getAspectRatio()).a(iA2));
            }
            this.f392739C.setLayoutParams(layoutParams10);
            if (this.f392742F.f()) {
                if (this.f392742F.g()) {
                    ((ViewManager) this.f392770y.getParent()).removeView(this.f392770y);
                    LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, -2);
                    if (this.f392742F.c()) {
                        layoutParams11.topMargin = this.f392750e;
                    } else {
                        layoutParams11.topMargin = this.f392748c;
                    }
                    layoutParams11.bottomMargin = this.f392749d;
                    this.f392770y.setLayoutParams(layoutParams11);
                    this.f392770y.setPadding(rj1.a(getContext(), this.f392751f.getBannerAppearance().getContentPadding().getLeft()), 0, rj1.a(getContext(), this.f392751f.getBannerAppearance().getContentPadding().getRight()), 0);
                    LinearLayout linearLayout = this.f392766u;
                    linearLayout.addView(this.f392770y, linearLayout.getChildCount() - 1);
                } else {
                    ((ViewManager) this.f392770y.getParent()).removeView(this.f392770y);
                    this.f392770y.setPadding(0, 0, 0, 0);
                    LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, -2);
                    int i17 = this.f392749d;
                    layoutParams12.topMargin = i17;
                    layoutParams12.bottomMargin = i17;
                    ((ViewManager) this.f392755j.getParent()).addView(this.f392770y, layoutParams12);
                }
                this.f392754i.setLayoutParams(this.f392742F.b() ? new LinearLayout.LayoutParams(-1, -2) : new LinearLayout.LayoutParams(-2, -2));
            } else {
                this.f392770y.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
            }
            int iRound5 = Math.round(iA2 * 0.4f);
            this.f392754i.setMinWidth(iRound5);
            this.f392754i.setMinimumWidth(iRound5);
            if (this.f392742F.h()) {
                TextView textView = this.f392760o;
                if (this.f392742F.i()) {
                    textView.setBackgroundColor(0);
                } else {
                    textView.setBackgroundColor(rj1.a(textView.getCurrentTextColor(), 92.0f));
                }
                this.f392760o.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            }
        }
        super.onMeasure(i12, i13);
    }

    @k0
    public final void q() {
        NativeAdImage image;
        int i12 = 0;
        if (this.f392743G != null && (image = this.f392741E.getImage()) != null) {
            this.f392743G.getClass();
            if ("fill".equals(image.a())) {
                this.f392765t.setVisibility(0);
                i12 = 8;
            }
            this.f392743G.getClass();
            if (d.a(image)) {
                if (!this.f392742F.a()) {
                    this.f392769x.setVisibility(8);
                }
                if (!this.f392742F.d()) {
                    this.f392768w.setVisibility(8);
                }
            }
        }
        this.f392766u.setVisibility(i12);
    }

    public void setAd(@N NativeAd nativeAd) {
        NativeAd nativeAd2 = this.f392744H;
        if (nativeAd2 != nativeAd) {
            if (nativeAd2 != null) {
                try {
                    nativeAd2.removeImageLoadingListener(this.f392746J);
                } catch (NativeAdException unused) {
                    return;
                }
            }
            nativeAd.addImageLoadingListener(this.f392746J);
            this.f392740D = nativeAd.getAdType();
            NativeAdAssets adAssets = nativeAd.getAdAssets();
            this.f392741E = adAssets;
            this.f392742F = new e(adAssets, this.f392740D);
            this.f392743G = new d(this.f392741E, this.f392740D);
            new jv(getContext(), this.f392741E).a(this.f392756k, this.f392767v, this.f392750e);
            ((u) nativeAd).a(this);
            q();
            this.f392744H = nativeAd;
        }
    }

    private void a() {
        int iA2 = rj1.a(getContext(), this.f392751f.getBannerAppearance().getBorderWidth());
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RectShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(this.f392751f.getBannerAppearance().getBackgroundColor());
        paint.setStyle(Paint.Style.FILL);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.setShape(new RectShape());
        Paint paint2 = shapeDrawable2.getPaint();
        paint2.setColor(this.f392751f.getBannerAppearance().getBorderColor());
        paint2.setStrokeWidth(iA2 * 2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        setBackground(new LayerDrawable(new Drawable[]{shapeDrawable, shapeDrawable2}));
        setPadding(iA2, iA2, iA2, iA2);
        int iA3 = rj1.a(getContext(), this.f392751f.getBannerAppearance().getContentPadding().getLeft());
        int iA4 = rj1.a(getContext(), this.f392751f.getBannerAppearance().getContentPadding().getRight());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(iA3, this.f392749d, iA4, this.f392748c);
        this.f392768w.setLayoutParams(layoutParams);
        this.f392768w.invalidate();
        int iA5 = rj1.a(getContext(), this.f392751f.getBannerAppearance().getContentPadding().getLeft());
        int iA6 = rj1.a(getContext(), this.f392751f.getBannerAppearance().getContentPadding().getRight());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = iA5;
        layoutParams2.rightMargin = iA6;
        layoutParams2.bottomMargin = this.f392748c;
        this.f392769x.setLayoutParams(layoutParams2);
        this.f392769x.invalidate();
        int iA7 = rj1.a(getContext(), this.f392751f.getBannerAppearance().getContentPadding().getLeft());
        int iA8 = rj1.a(getContext(), this.f392751f.getBannerAppearance().getContentPadding().getRight());
        TextView textView = this.f392760o;
        int i12 = this.f392748c;
        textView.setPadding(iA7, i12, iA8, i12);
        this.f392760o.invalidate();
        this.f392754i.setTextColor(this.f392751f.getCallToActionAppearance().getTextAppearance().getTextColor());
        this.f392754i.setTextSize(this.f392751f.getCallToActionAppearance().getTextAppearance().getTextSize());
        this.f392754i.setTypeface(Typeface.create(this.f392751f.getCallToActionAppearance().getTextAppearance().getFontFamilyName(), this.f392751f.getCallToActionAppearance().getTextAppearance().getFontStyle()));
        float[] fArr = new float[8];
        Arrays.fill(fArr, rj1.a(getContext(), 5.0f));
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, fArr);
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(roundRectShape);
        shapeDrawable3.getPaint().setColor(this.f392751f.getCallToActionAppearance().getPressedColor());
        ShapeDrawable shapeDrawable4 = new ShapeDrawable(roundRectShape);
        shapeDrawable4.getPaint().setColor(this.f392751f.getCallToActionAppearance().getNormalColor());
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, shapeDrawable3);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, shapeDrawable3);
        stateListDrawable.addState(new int[0], shapeDrawable4);
        int iA9 = rj1.a(getContext(), this.f392751f.getCallToActionAppearance().getBorderWidth());
        ShapeDrawable shapeDrawable5 = new ShapeDrawable();
        shapeDrawable5.setShape(roundRectShape);
        Paint paint3 = shapeDrawable5.getPaint();
        paint3.setColor(this.f392751f.getCallToActionAppearance().getBorderColor());
        paint3.setStrokeWidth(iA9);
        paint3.setStyle(style);
        this.f392754i.setBackground(new LayerDrawable(new Drawable[]{stateListDrawable, shapeDrawable5}));
        LayerDrawable layerDrawable = (LayerDrawable) this.f392762q.getProgressDrawable();
        Drawable drawable = layerDrawable.getDrawable(2);
        int progressStarColor = this.f392751f.getRatingAppearance().getProgressStarColor();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        drawable.setColorFilter(progressStarColor, mode);
        layerDrawable.getDrawable(1).setColorFilter(this.f392751f.getRatingAppearance().getBackgroundStarColor(), mode);
        layerDrawable.getDrawable(0).setColorFilter(this.f392751f.getRatingAppearance().getBackgroundStarColor(), mode);
        this.f392752g.setTypeface(Typeface.create(this.f392751f.getAgeAppearance().getFontFamilyName(), this.f392751f.getAgeAppearance().getFontStyle()));
        this.f392752g.setTextColor(this.f392751f.getAgeAppearance().getTextColor());
        this.f392752g.setTextSize(2, this.f392751f.getAgeAppearance().getTextSize());
        this.f392753h.setTypeface(Typeface.create(this.f392751f.getBodyAppearance().getFontFamilyName(), this.f392751f.getBodyAppearance().getFontStyle()));
        this.f392753h.setTextColor(this.f392751f.getBodyAppearance().getTextColor());
        this.f392753h.setTextSize(2, this.f392751f.getBodyAppearance().getTextSize());
        this.f392755j.setTypeface(Typeface.create(this.f392751f.getDomainAppearance().getFontFamilyName(), this.f392751f.getDomainAppearance().getFontStyle()));
        this.f392755j.setTextColor(this.f392751f.getDomainAppearance().getTextColor());
        this.f392755j.setTextSize(2, this.f392751f.getDomainAppearance().getTextSize());
        this.f392763r.setTypeface(Typeface.create(this.f392751f.getReviewCountAppearance().getFontFamilyName(), this.f392751f.getReviewCountAppearance().getFontStyle()));
        this.f392763r.setTextColor(this.f392751f.getReviewCountAppearance().getTextColor());
        this.f392763r.setTextSize(2, this.f392751f.getReviewCountAppearance().getTextSize());
        this.f392758m.setTypeface(Typeface.create(this.f392751f.getSponsoredAppearance().getFontFamilyName(), this.f392751f.getSponsoredAppearance().getFontStyle()));
        this.f392758m.setTextColor(this.f392751f.getSponsoredAppearance().getTextColor());
        this.f392758m.setTextSize(2, this.f392751f.getSponsoredAppearance().getTextSize());
        this.f392759n.setTypeface(Typeface.create(this.f392751f.getTitleAppearance().getFontFamilyName(), this.f392751f.getTitleAppearance().getFontStyle()));
        this.f392759n.setTextColor(this.f392751f.getTitleAppearance().getTextColor());
        this.f392759n.setTextSize(2, this.f392751f.getTitleAppearance().getTextSize());
        this.f392760o.setTypeface(Typeface.create(this.f392751f.getWarningAppearance().getFontFamilyName(), this.f392751f.getWarningAppearance().getFontStyle()));
        this.f392760o.setTextColor(this.f392751f.getWarningAppearance().getTextColor());
        this.f392760o.setTextSize(2, this.f392751f.getWarningAppearance().getTextSize());
        invalidate();
        requestLayout();
    }

    public final TextView b() {
        return this.f392752g;
    }

    public NativeBannerView(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f392748c = rj1.a(getContext(), 4.0f);
        this.f392749d = rj1.a(getContext(), 8.0f);
        this.f392750e = rj1.a(getContext(), 12.0f);
        this.f392746J = new a();
        this.f392747b = new dq();
        p();
    }

    public NativeBannerView(@N Context context, @P AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f392748c = rj1.a(getContext(), 4.0f);
        this.f392749d = rj1.a(getContext(), 8.0f);
        this.f392750e = rj1.a(getContext(), 12.0f);
        this.f392746J = new a();
        this.f392747b = new dq();
        p();
    }
}
