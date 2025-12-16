package com.avito.android.user_advert.advert.items.promo_block_feed;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.lib.util.UiTheme;
import com.avito.android.lib.util.q;
import com.avito.android.lib.util.s;
import com.avito.android.remote.model.SimpleAction;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.adverts.PromoBlockData;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.google.android.flexbox.FlexboxLayout;
import eH0.C40005a;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: PromoBlockItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_advert/advert/items/promo_block_feed/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/promo_block_feed/i;", "Lcom/avito/android/lib/util/groupable_item/e;", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends com.avito.konveyor.adapter.b implements i, com.avito.android.lib.util.groupable_item.e {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f309876h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f309877b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.vertical_main.c f309878c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Banner f309879d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a f309880e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public String f309881f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public Context f309882g;

    /* compiled from: PromoBlockItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/promo_block_feed/k$a;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f309883a;

        public a() {
        }
    }

    /* compiled from: PromoBlockItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f309885a;

        static {
            int[] iArr = new int[Theme.values().length];
            try {
                iArr[Theme.AVITO_LOOK_AND_FEEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Theme.AVITO_RE_23.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f309885a = iArr;
        }
    }

    public k(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar, @Y61.k com.avito.android.serp.adapter.vertical_main.c cVar) {
        super(view);
        this.f309877b = aVar;
        this.f309878c = cVar;
        Banner banner = (Banner) view;
        this.f309879d = banner;
        this.f309880e = new a();
        this.f309882g = banner.getThemedContext();
    }

    public final void B80(TextView textView, AttributedText attributedText) {
        String str = this.f309881f;
        if (str != null) {
            com.avito.android.util.text.j.d(textView, C35835l0.d(s.a(str), textView.getContext()));
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        com.avito.android.util.text.j.a(textView, attributedText, this.f309877b);
    }

    @Override // com.avito.android.user_advert.advert.items.promo_block_feed.i
    public final void CG(@Y61.l PromoBlockData.ProgressBar progressBar) {
        Banner banner = this.f309879d;
        TextView textView = (TextView) banner.findViewById(R.id.progress_title);
        ProgressBar progressBar2 = (ProgressBar) banner.findViewById(R.id.progress_bar);
        if (progressBar == null) {
            D6.w(textView);
            D6.w(progressBar2);
        } else {
            B80(textView, progressBar.getTitle());
            progressBar2.setProgress(progressBar.getValue());
            D6.H(progressBar2);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.promo_block_feed.i
    public final void Dq(@Y61.k PromoStyle promoStyle, @Y61.k Theme theme) throws Resources.NotFoundException {
        String strName = promoStyle.name();
        Locale locale = Locale.ROOT;
        this.f309881f = strName.toLowerCase(locale);
        Banner banner = this.f309879d;
        this.f309882g = new ContextThemeWrapper(banner.getThemedContext(), R.style.PromoBlockContentRe23Theme);
        banner.setAppearance(C35835l0.j(this.f309878c.a(promoStyle), this.f309882g));
        banner.setContentView(LayoutInflater.from(this.f309882g).inflate(R.layout.my_advert_promo_block_content, (ViewGroup) banner, false));
        a aVar = this.f309880e;
        k kVar = k.this;
        Context context = kVar.f309882g;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C35835l0.j(R.attr.promoBlockContentTheme, context), C40005a.i.f395083a);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        aVar.f309883a = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        int dimensionPixelSize6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize7 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        typedArrayObtainStyledAttributes.recycle();
        D6.c(kVar.f309879d, null, 0, null, 0, 5);
        Banner banner2 = kVar.f309879d;
        TextView textView = (TextView) banner2.findViewById(R.id.progress_title);
        ProgressBar progressBar = (ProgressBar) banner2.findViewById(R.id.progress_bar);
        FlexboxLayout flexboxLayout = (FlexboxLayout) banner2.findViewById(R.id.actions);
        TextView textView2 = (TextView) banner2.findViewById(R.id.footer);
        D6.c(textView, null, Integer.valueOf(dimensionPixelSize), null, null, 13);
        D6.c(progressBar, null, null, null, Integer.valueOf(dimensionPixelSize2), 7);
        progressBar.setSeparatorWidth(dimensionPixelSize3);
        progressBar.setBarHeight(dimensionPixelSize4);
        D6.c(flexboxLayout, null, Integer.valueOf(dimensionPixelSize5), null, Integer.valueOf(dimensionPixelSize6), 5);
        flexboxLayout.setDividerDrawable(drawable);
        D6.c(textView2, null, Integer.valueOf(dimensionPixelSize7), null, null, 13);
        int i12 = b.f309885a[theme.ordinal()];
        UiTheme uiTheme = i12 != 1 ? i12 != 2 ? UiTheme.f181325b : UiTheme.f181327d : UiTheme.f181326c;
        TextView textView3 = (TextView) banner.findViewById(R.id.progress_title);
        textView3.setTextColor(C35835l0.d(s.a.f181426a[uiTheme.ordinal()] == 1 ? R.attr.black : s.a(promoStyle.name().toLowerCase(locale)), textView3.getContext()));
        ProgressBar progressBar2 = (ProgressBar) banner.findViewById(R.id.progress_bar);
        progressBar2.setEmptyColor(C35835l0.d(s.b(promoStyle.name().toLowerCase(locale), uiTheme), progressBar2.getContext()));
        progressBar2.setFillColor(C35835l0.d(s.c(promoStyle.name().toLowerCase(locale), uiTheme), progressBar2.getContext()));
        progressBar2.setSeparatorColor(C35835l0.d(s.d(promoStyle.name().toLowerCase(locale)), progressBar2.getContext()));
    }

    @Override // com.avito.android.user_advert.advert.items.promo_block_feed.i
    public final void Qd(@Y61.k Y41.a<G0> aVar) {
        this.f309879d.setCloseButtonListener(new com.avito.android.travel_guest_profile.items.profile_header.h(22, aVar));
    }

    @Override // com.avito.android.lib.util.groupable_item.e
    public final void Tz(boolean z12, boolean z13) {
        this.f309879d.Tz(z12, z13);
    }

    @Override // com.avito.android.user_advert.advert.items.promo_block_feed.i
    public final void Uc(@Y61.l AttributedText attributedText) {
        B80((TextView) this.f309879d.findViewById(R.id.footer), attributedText);
    }

    @Override // com.avito.android.user_advert.advert.items.promo_block_feed.i
    public final void Ut(boolean z12) {
        this.f309879d.setCloseButtonVisible(z12);
    }

    @Override // com.avito.android.user_advert.advert.items.promo_block_feed.i
    public final void Xc(@Y61.k List<PromoBlockData.Insight> list) {
        LinearLayout linearLayout = (LinearLayout) this.f309879d.findViewById(R.id.insights_container);
        linearLayout.removeAllViews();
        D6.w(linearLayout);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f309882g);
        for (PromoBlockData.Insight insight : list) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.my_advert_promo_block_insight, (ViewGroup) linearLayout, false);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.insight_icon);
            String icon = insight.getIcon();
            UniversalColor iconColor = insight.getIconColor();
            Integer numA = icon != null ? q.a(icon) : null;
            if (numA == null) {
                D6.w(imageView);
            } else {
                imageView.setImageDrawable(C35835l0.h(numA.intValue(), imageView.getContext()));
                if (iconColor != null) {
                    imageView.setImageTintList(ColorStateList.valueOf(C48063a.f437606a.a(imageView.getContext(), iconColor)));
                }
                D6.H(imageView);
            }
            B80((TextView) viewInflate.findViewById(R.id.insight_text), insight.getText());
            D6.c(viewInflate, null, Integer.valueOf(this.f309880e.f309883a), null, null, 13);
            linearLayout.addView(viewInflate);
        }
        if (list.isEmpty()) {
            return;
        }
        D6.H(linearLayout);
    }

    @Override // com.avito.android.user_advert.advert.items.promo_block_feed.i
    public final void hN(@Y61.k Y41.l lVar, @Y61.k List list) {
        FlexboxLayout flexboxLayout = (FlexboxLayout) this.f309879d.findViewById(R.id.actions);
        flexboxLayout.removeAllViews();
        D6.w(flexboxLayout);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SimpleAction simpleAction = (SimpleAction) it.next();
            Context context = this.f309882g;
            String style = simpleAction.getStyle();
            Button button = new Button(context, null, L.f(style, "promoBlockBeigePrimaryShareLarge") ? 0 : style != null ? com.avito.android.lib.util.f.d(style) : R.attr.buttonPrimaryLarge, L.f(simpleAction.getStyle(), "promoBlockBeigePrimaryShareLarge") ? R.style.ShareButtonPrimaryLarge : 0);
            button.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            com.avito.android.lib.design.button.b.a(button, simpleAction.getTitle(), false);
            button.setOnClickListener(new j(lVar, simpleAction, 0));
            flexboxLayout.addView(button);
        }
        if (list.isEmpty()) {
            return;
        }
        D6.H(flexboxLayout);
    }

    @Override // com.avito.android.user_advert.advert.items.promo_block_feed.i
    public final void setTitle(@Y61.l String str) {
        this.f309879d.setTitle(str);
    }
}
