package Hb;

import Y61.k;
import Y61.l;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.P;
import com.avito.android.R;
import com.avito.android.advertising.splitter.YandexBadgeStyle;
import com.avito.android.advertising.ui.AdStyle;
import com.avito.android.advertising.ui.a;
import com.avito.android.advertising.ui.c;
import com.avito.android.advertising.ui.e;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.util.v;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdViewBinder;
import j.InterfaceC42161q;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdYandex.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LHb/c;", "LHb/a;", "Lcom/yandex/mobile/ads/nativeads/NativeAdImageLoadingListener;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC13946a, NativeAdImageLoadingListener {

    /* renamed from: A, reason: collision with root package name */
    @l
    public NativeAdViewBinder f7293A;

    /* renamed from: B, reason: collision with root package name */
    @l
    public WeakReference<NativeAd> f7294B;

    /* renamed from: C, reason: collision with root package name */
    public final int f7295C;

    /* renamed from: D, reason: collision with root package name */
    public final int f7296D;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f7297b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AdStyle f7298c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ViewGroup f7299d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ViewGroup f7300e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f7301f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final TextView f7302g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final TextView f7303h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ImageView f7304i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final ViewGroup f7305j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final LinearLayout f7306k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final TextView f7307l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final RatingBar f7308m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final TextView f7309n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final TextView f7310o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final TextView f7311p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final TextView f7312q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final ImageView f7313r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final TextView f7314s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final View f7315t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public final ViewGroup f7316u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public final TextView f7317v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public final ImageView f7318w;

    /* renamed from: x, reason: collision with root package name */
    @l
    public final ViewGroup f7319x;

    /* renamed from: y, reason: collision with root package name */
    @l
    public final ShimmerLayout f7320y;

    /* renamed from: z, reason: collision with root package name */
    @k
    public final NativeAdViewBinder.Builder f7321z;

    /* compiled from: AdYandex.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[YandexBadgeStyle.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                YandexBadgeStyle yandexBadgeStyle = YandexBadgeStyle.f88521b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "androidx/core/view/v0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f7322b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f7323c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f7324d;

        public b(View view, TextView textView, c cVar) {
            this.f7322b = view;
            this.f7323c = textView;
            this.f7324d = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextView textView = this.f7323c;
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.width = this.f7324d.f7310o.getMeasuredWidth();
                textView.requestLayout();
            }
        }
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "androidx/core/view/v0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: Hb.c$c, reason: collision with other inner class name */
    public static final class RunnableC0426c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f7325b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f7326c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f7327d;

        public RunnableC0426c(View view, TextView textView, c cVar) {
            this.f7325b = view;
            this.f7326c = textView;
            this.f7327d = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextView textView = this.f7326c;
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.width = this.f7327d.f7310o.getMeasuredWidth();
                textView.requestLayout();
            }
        }
    }

    public c(@k View view, @k AdStyle adStyle) {
        this.f7297b = view;
        this.f7298c = adStyle;
        this.f7299d = (ViewGroup) view.findViewById(R.id.yandex_content);
        View viewFindViewById = view.findViewById(R.id.ad_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.NativeAdView");
        }
        NativeAdView nativeAdView = (NativeAdView) viewFindViewById;
        this.f7300e = (ViewGroup) view.findViewById(R.id.badges_container);
        View viewFindViewById2 = view.findViewById(R.id.age_badge);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        this.f7301f = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.description);
        this.f7302g = textView2;
        TextView textView3 = (TextView) view.findViewById(R.id.call_to_action);
        this.f7303h = textView3;
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        this.f7304i = imageView;
        this.f7305j = (ViewGroup) view.findViewById(R.id.media_view_container);
        MediaView mediaView = (MediaView) view.findViewById(R.id.media_view);
        this.f7306k = (LinearLayout) view.findViewById(R.id.additional_info);
        this.f7307l = (TextView) view.findViewById(R.id.price);
        this.f7308m = (RatingBar) view.findViewById(R.id.rating_bar);
        this.f7309n = (TextView) view.findViewById(R.id.rating_count);
        View viewFindViewById3 = view.findViewById(R.id.advertising_badge);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView4 = (TextView) viewFindViewById3;
        this.f7310o = textView4;
        View viewFindViewById4 = view.findViewById(R.id.title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView5 = (TextView) viewFindViewById4;
        this.f7311p = textView5;
        TextView textView6 = (TextView) view.findViewById(R.id.domain_badge);
        this.f7312q = textView6;
        ImageView imageView2 = (ImageView) view.findViewById(R.id.feedback);
        this.f7313r = imageView2;
        TextView textView7 = (TextView) view.findViewById(R.id.customBadgeFeedback);
        this.f7314s = textView7;
        this.f7315t = view.findViewById(R.id.ad_placeholder);
        this.f7316u = (ViewGroup) view.findViewById(R.id.disclaimer_container);
        TextView textView8 = (TextView) view.findViewById(R.id.disclaimer);
        this.f7317v = textView8;
        this.f7318w = (ImageView) view.findViewById(R.id.close_button);
        this.f7319x = (ViewGroup) view.findViewById(R.id.text_container);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.call_to_action_container);
        this.f7320y = (ShimmerLayout) view.findViewById(R.id.media_view_placeholder);
        NativeAdViewBinder.Builder builder = new NativeAdViewBinder.Builder(nativeAdView);
        this.f7321z = builder;
        this.f7295C = view.getResources().getDimensionPixelOffset(R.dimen.ad_badges_margin);
        this.f7296D = view.getResources().getDimensionPixelOffset(R.dimen.ad_badges_mid_margin);
        builder.setAgeView(textView).setCallToActionView(textView3).setMediaView(mediaView).setIconView(imageView).setSponsoredView(textView4).setTitleView(textView5).setWarningView(textView8).setBodyView(textView2).setFeedbackView(imageView2).setDomainView(textView6);
        if (textView7 != null) {
            final int i12 = 0;
            textView7.setOnClickListener(new View.OnClickListener(this) { // from class: Hb.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ c f7292c;

                {
                    this.f7292c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i12) {
                        case 0:
                            ImageView imageView3 = this.f7292c.f7313r;
                            if (imageView3 != null) {
                                imageView3.performClick();
                                break;
                            }
                            break;
                        default:
                            TextView textView9 = this.f7292c.f7303h;
                            if (textView9 != null) {
                                textView9.performClick();
                                break;
                            }
                            break;
                    }
                }
            });
        }
        if (viewGroup != null) {
            final int i13 = 1;
            viewGroup.setOnClickListener(new View.OnClickListener(this) { // from class: Hb.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ c f7292c;

                {
                    this.f7292c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i13) {
                        case 0:
                            ImageView imageView3 = this.f7292c.f7313r;
                            if (imageView3 != null) {
                                imageView3.performClick();
                                break;
                            }
                            break;
                        default:
                            TextView textView9 = this.f7292c.f7303h;
                            if (textView9 != null) {
                                textView9.performClick();
                                break;
                            }
                            break;
                    }
                }
            });
        }
    }

    @Override // com.avito.android.advertising.ui.a
    public final void BN(@l Float f12, @k AdStyle adStyle) {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean DH() {
        return c.a.b(this);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void Ex(boolean z12, boolean z13) {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.e
    public final void H60(@InterfaceC42161q int i12) {
        throw null;
    }

    @Override // Hb.InterfaceC13946a
    public final void Hn(@k YandexBadgeStyle yandexBadgeStyle) {
        int iOrdinal = yandexBadgeStyle.ordinal();
        View view = this.f7297b;
        TextView textView = this.f7314s;
        if (iOrdinal == 1) {
            if (textView != null) {
                CharSequence text = textView.getText();
                if (text == null || text.length() == 0) {
                    textView.setText(view.getContext().getString(R.string.advertising_badge_empty));
                    textView.setVisibility(0);
                    int iB2 = y6.b(31);
                    b(iB2, y6.b(36), iB2);
                    return;
                }
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        if (textView != null) {
            CharSequence text2 = textView.getText();
            TextView textView2 = this.f7310o;
            if (text2 == null || text2.length() == 0) {
                textView.setText(view.getContext().getString(R.string.advertising_badge_empty));
                textView.setMinWidth(0);
                textView.setMinimumWidth(0);
                textView.setVisibility(0);
                textView.setBackground(null);
                textView.setGravity(21);
                textView.setPadding(0, textView.getPaddingTop(), y6.b(5), textView.getPaddingBottom());
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.width = -2;
                }
                ViewGroup viewGroup = this.f7300e;
                Object layoutParams3 = viewGroup != null ? viewGroup.getLayoutParams() : null;
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.rightMargin = view.getResources().getDimensionPixelOffset(R.dimen.ad_avl_inset);
                }
                textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), y6.b(9), textView2.getPaddingBottom());
                int iB3 = y6.b(30);
                b(iB3, y6.b(36), iB3);
            }
            P.b(textView2, new b(textView2, textView, this));
        }
    }

    @Override // com.avito.android.advertising.ui.a
    public final void IS(int i12, @l Float f12) {
        a.C2614a.d(this, f12, i12);
    }

    @Override // com.avito.android.advertising.ui.a
    @l
    /* renamed from: Ik, reason: from getter */
    public final RatingBar getF7308m() {
        return this.f7308m;
    }

    @Override // Hb.InterfaceC13946a
    public final void J60(@k NativeAd nativeAd) {
        NativeAd nativeAd2;
        WeakReference<NativeAd> weakReference = this.f7294B;
        if (weakReference != null && (nativeAd2 = weakReference.get()) != null) {
            nativeAd2.removeImageLoadingListener(this);
        }
        this.f7294B = new WeakReference<>(nativeAd);
        D6.G(this.f7320y, true);
        nativeAd.addImageLoadingListener(this);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void Kw(@InterfaceC42161q int i12) {
        e.a.a(this, R.dimen.ad_image_corner_radius);
    }

    @Override // Hb.InterfaceC13946a
    public final void N6() {
        D6.H(this.f7315t);
    }

    @Override // com.avito.android.advertising.ui.c
    @k
    /* renamed from: Ns */
    public final Rect getF87360i() {
        return com.avito.android.advertising.ui.d.f88703a;
    }

    @Override // com.avito.android.advertising.ui.a
    public final void OB(@k AdStyle adStyle) {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: Qw, reason: from getter */
    public final TextView getF6597k() {
        return this.f7302g;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: T1, reason: from getter */
    public final ViewGroup getF6591e() {
        return this.f7299d;
    }

    public final void b(int i12, int i13, int i14) {
        ImageView imageView = this.f7313r;
        Object layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.width = y6.b(1);
            marginLayoutParams.height = y6.b(1);
            marginLayoutParams.setMargins(i14, i13, i12, i14);
        }
    }

    @Override // com.avito.android.advertising.ui.e
    public final void e20(@InterfaceC42161q int i12) {
        ViewGroup f7305j = getF6592f();
        if (f7305j != null) {
            v.b(f7305j, i12);
        }
    }

    @Override // com.avito.android.advertising.ui.e
    public final void f20(@l TextView textView, @l String str) {
        e.a.k(textView, str, null);
    }

    @Override // com.avito.android.advertising.ui.e
    public final void fu(boolean z12) {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: getCallToActionView, reason: from getter */
    public final TextView getF6596j() {
        return this.f7303h;
    }

    @Override // com.avito.android.advertising.ui.c
    @k
    /* renamed from: getStyle, reason: from getter */
    public final AdStyle getF6589c() {
        return this.f7298c;
    }

    @Override // com.avito.android.advertising.ui.e
    @k
    /* renamed from: getView, reason: from getter */
    public final View getF6588b() {
        return this.f7297b;
    }

    @Override // com.avito.android.advertising.ui.a
    @l
    /* renamed from: hh, reason: from getter */
    public final LinearLayout getF7306k() {
        return this.f7306k;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: j70, reason: from getter */
    public final ViewGroup getF7319x() {
        return this.f7319x;
    }

    @Override // com.avito.android.advertising.ui.a
    @l
    /* renamed from: oX, reason: from getter */
    public final TextView getF7309n() {
        return this.f7309n;
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: od, reason: from getter */
    public final ViewGroup getF6592f() {
        return this.f7305j;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener
    public final void onFinishLoadingImages() {
        D6.w(this.f7320y);
        this.f7294B = null;
    }

    @Override // com.avito.android.advertising.ui.a
    public final void p(@l String str) {
        throw null;
    }

    @Override // Hb.InterfaceC13946a
    public final void pV(@k NativeAd nativeAd, boolean z12, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
        if (z12) {
            N6();
            return;
        }
        D6.w(this.f7315t);
        NativeAdViewBinder nativeAdViewBinderBuild = this.f7293A;
        if (nativeAdViewBinderBuild == null) {
            nativeAdViewBinderBuild = this.f7321z.build();
        }
        this.f7293A = nativeAdViewBinderBuild;
        boolean z13 = nativeAd.getAdAssets().getWarning() != null;
        ViewGroup viewGroup = this.f7316u;
        if (viewGroup != null) {
            viewGroup.setBackground(z13 ? androidx.core.content.d.getDrawable(this.f7297b.getContext(), R.drawable.ad_yandex_disclaimer_gradient) : null);
        }
        nativeAd.bindNativeAd(nativeAdViewBinderBuild);
        nativeAd.setNativeAdEventListener(new f(aVar, aVar2));
        nativeAd.loadImages();
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    public final ImageView pi() {
        throw null;
    }

    @Override // com.avito.android.advertising.ui.e
    @k
    /* renamed from: qs, reason: from getter */
    public final TextView getF6595i() {
        return this.f7311p;
    }

    @Override // com.avito.android.advertising.ui.a
    @l
    /* renamed from: sq, reason: from getter */
    public final TextView getF7307l() {
        return this.f7307l;
    }

    @Override // com.avito.android.advertising.ui.e
    public final View uC() {
        return this.f7304i;
    }

    @Override // Hb.InterfaceC13946a
    public final void uM(@k YandexBadgeStyle yandexBadgeStyle, boolean z12) {
        int i12 = this.f7295C;
        int i13 = this.f7296D;
        int i14 = z12 ? i13 - i12 : 0;
        if (z12) {
            i12 = i13;
        }
        int iOrdinal = yandexBadgeStyle.ordinal();
        View view = this.f7297b;
        TextView textView = this.f7314s;
        if (iOrdinal == 1) {
            if (textView != null) {
                CharSequence text = textView.getText();
                if (text == null || text.length() == 0) {
                    textView.setText(view.getContext().getString(R.string.advertising_badge_empty));
                    textView.setVisibility(0);
                    D6.c(textView, null, Integer.valueOf(i12), Integer.valueOf(i12), null, 9);
                    D6.c(this.f7310o, null, Integer.valueOf(i12), Integer.valueOf(y6.b(4)), null, 9);
                    b(y6.b(13) + i14, y6.b(13) + i14, y6.b(5));
                    return;
                }
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            D6.c(this.f7301f, null, Integer.valueOf(i12), null, null, 13);
            D6.c(this.f7310o, null, Integer.valueOf(i12), null, null, 13);
            ImageView imageView = this.f7313r;
            if (imageView != null) {
                D6.c(imageView, null, Integer.valueOf(i12), Integer.valueOf(i12), null, 9);
            }
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        if (textView != null) {
            CharSequence text2 = textView.getText();
            TextView textView2 = this.f7310o;
            if (text2 == null || text2.length() == 0) {
                textView.setText(view.getContext().getString(R.string.advertising_badge_empty));
                textView.setMinWidth(0);
                textView.setMinimumWidth(0);
                textView.setVisibility(0);
                textView.setBackground(null);
                textView.setGravity(21);
                textView.setPadding(0, textView.getPaddingTop(), y6.b(5), textView.getPaddingBottom());
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.topMargin = i12;
                    layoutParams2.rightMargin = i12;
                    layoutParams2.width = -2;
                }
                ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
                RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
                if (layoutParams4 != null) {
                    layoutParams4.topMargin = i12;
                    layoutParams4.rightMargin = i12;
                    layoutParams4.removeRule(16);
                    if (this.f7298c == AdStyle.f88541f) {
                        layoutParams4.addRule(7, R.id.media_view_container);
                    } else {
                        layoutParams4.addRule(21);
                    }
                }
                textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), y6.b(9), textView2.getPaddingBottom());
                b(y6.b(12) + i14, y6.b(13) + i14, 0);
            }
            P.b(textView2, new RunnableC0426c(textView2, textView, this));
        }
    }

    @Override // com.avito.android.advertising.ui.e
    @l
    /* renamed from: wV, reason: from getter */
    public final TextView getF6601o() {
        return this.f7312q;
    }

    @Override // com.avito.android.advertising.ui.c
    public final boolean yi() {
        return c.a.a(this);
    }
}
