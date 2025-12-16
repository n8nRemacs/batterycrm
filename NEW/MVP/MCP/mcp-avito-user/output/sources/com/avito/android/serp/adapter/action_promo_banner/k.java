package com.avito.android.serp.adapter.action_promo_banner;

import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.search.filter.adapter.select.m;
import com.avito.android.serp.adapter.action_promo_banner.ActionPromoBannerItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: ActionPromoBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/action_promo_banner/k;", "Lcom/avito/android/serp/adapter/action_promo_banner/j;", "Lcom/avito/android/serp/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k extends com.avito.android.serp.c implements j {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f268626j = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Banner f268627b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Context f268628c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f268629d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f268630e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageView f268631f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f268632g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f268633h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f268634i;

    /* compiled from: ActionPromoBannerView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Integer> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(k.this.f268628c.getResources().getDimensionPixelSize(R.dimen.serp_action_promo_banner_corner_radius));
        }
    }

    public k(@Y61.k Banner banner) {
        super(banner);
        this.f268627b = banner;
        this.f268628c = banner.getContext();
        View viewFindViewById = banner.findViewById(R.id.sales_promo_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f268629d = (TextView) viewFindViewById;
        View viewFindViewById2 = banner.findViewById(R.id.sales_promo_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f268630e = (TextView) viewFindViewById2;
        View viewFindViewById3 = banner.findViewById(R.id.sales_promo_suggest_close);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f268631f = (ImageView) viewFindViewById3;
        View viewFindViewById4 = banner.findViewById(R.id.sales_promo_action_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f268632g = (Button) viewFindViewById4;
        View viewFindViewById5 = banner.findViewById(R.id.sales_promo_image);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f268633h = (SimpleDraweeView) viewFindViewById5;
        this.f268634i = C42727D.c(new a());
    }

    @Override // com.avito.android.serp.adapter.action_promo_banner.j
    public final void SP(@Y61.k ActionPromoBannerItem.Background background) {
        Integer numH;
        ArrayList arrayList = background.f268607b;
        InterfaceC42726C interfaceC42726C = this.f268634i;
        Context context = this.f268628c;
        Banner banner = this.f268627b;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(C48063a.f437606a.a(context, (UniversalColor) it.next())));
            }
            int[] iArrL0 = C42745f0.L0(arrayList2);
            if (iArrL0.length >= 2) {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, iArrL0);
                gradientDrawable.setCornerRadius(((Number) interfaceC42726C.getValue()).intValue());
                banner.setBackground(gradientDrawable);
                return;
            }
        }
        String str = background.f268608c;
        if (str != null && (numH = com.avito.android.lib.util.f.h(str)) != null) {
            AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(this.f268628c, numH.intValue(), 0, 4, null);
            c5275a.f179264a = ((Number) interfaceC42726C.getValue()).intValue();
            banner.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
            return;
        }
        UniversalColor universalColor = background.f268609d;
        if (universalColor != null) {
            Context context2 = banner.getContext();
            C48063a.f437606a.getClass();
            Banner.h(banner, C48063a.e(context2, universalColor));
            return;
        }
        String str2 = background.f268610e;
        if (str2 == null) {
            Banner.h(banner, C35835l0.e(R.attr.gray8, context));
            return;
        }
        Context context3 = banner.getContext();
        UniversalColor universalColor2 = new UniversalColor(str2, null, null);
        C48063a.f437606a.getClass();
        Banner.h(banner, C48063a.e(context3, universalColor2));
    }

    @Override // com.avito.android.serp.adapter.action_promo_banner.j
    public final void Xw(boolean z12, @Y61.k UniversalColor universalColor, @Y61.k m mVar) {
        ImageView imageView = this.f268631f;
        D6.G(imageView, z12);
        if (z12) {
            imageView.setImageTintList(ColorStateList.valueOf(C48063a.f437606a.a(this.f268628c, universalColor)));
            imageView.setOnClickListener(mVar);
        }
    }

    @Override // com.avito.android.serp.adapter.action_promo_banner.j
    public final void e(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.c(this.f268629d, attributedText, null);
    }

    @Override // com.avito.android.serp.adapter.action_promo_banner.j
    public final void gc(@l ButtonAction buttonAction, @Y61.k Y41.l<? super DeepLink, G0> lVar) throws Resources.NotFoundException {
        Button button = this.f268632g;
        if (buttonAction == null) {
            D6.w(button);
            button.setOnClickListener(null);
            return;
        }
        D6.H(button);
        button.setText(buttonAction.getTitle());
        String style = buttonAction.getStyle();
        if (style != null) {
            button.setAppearance(C35835l0.j(com.avito.android.lib.util.f.d(style), button.getContext()));
        }
        DeepLink deeplink = buttonAction.getDeeplink();
        if (deeplink != null) {
            button.setOnClickListener(new XA0.c(lVar, deeplink, 6));
        }
    }

    @Override // com.avito.android.serp.adapter.action_promo_banner.j
    public final void i(@l UniversalImage universalImage) {
        Image imageDependsOnTheme = universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f268628c)) : null;
        SimpleDraweeView simpleDraweeView = this.f268633h;
        if (imageDependsOnTheme == null) {
            D6.w(simpleDraweeView);
            return;
        }
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(imageDependsOnTheme);
        D6.H(simpleDraweeView);
        C35949t5.c(this.f268633h, aVarB, null, null, null, 14);
    }

    @Override // com.avito.android.serp.adapter.action_promo_banner.j
    public final void r(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f268630e, attributedText, null);
    }
}
