package com.avito.android.advert_core.comfortable_deal_promo;

import LV.c;
import VU.b;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert_core.comfortable_deal_promo.AdvertDetailsComfortableDealPromoItem;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.flexbox.FlexboxLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsComfortableDealPromoView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/comfortable_deal_promo/j;", "Lcom/avito/android/advert_core/comfortable_deal_promo/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f83088h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f83089b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f83090c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f83091d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f83092e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f83093f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final FlexboxLayout f83094g;

    public j(@Y61.k View view) {
        super(view);
        this.f83089b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.advert_details_comfortable_deal_promo_block_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f83090c = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f83091d = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.title_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83092e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.subtitle_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83093f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.buttons);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
        }
        this.f83094g = (FlexboxLayout) viewFindViewById5;
    }

    @Override // com.avito.android.advert_core.comfortable_deal_promo.i
    public final void b(@Y61.k String str) {
        I5.a(this.f83092e, str, false);
    }

    @Override // com.avito.android.advert_core.comfortable_deal_promo.i
    public final void na(@Y61.k UniversalImage universalImage, int i12, int i13, int i14, int i15) {
        SimpleDraweeView simpleDraweeView = this.f83091d;
        Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()));
        com.avito.android.image_loader.a aVarB = imageDependsOnThemeOrDefault != null ? com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault) : null;
        if (aVarB == null) {
            D6.w(simpleDraweeView);
            return;
        }
        D6.H(simpleDraweeView);
        C35949t5.c(this.f83091d, aVarB, null, null, null, 14);
        D6.b(simpleDraweeView, Integer.valueOf(y6.b(i14)), Integer.valueOf(y6.b(i12)), Integer.valueOf(y6.b(i15)), Integer.valueOf(y6.b(i13)));
    }

    @Override // com.avito.android.advert_core.comfortable_deal_promo.i
    public final void p0() {
        D6.w(this.f83091d);
    }

    @Override // com.avito.android.advert_core.comfortable_deal_promo.i
    public final void tb(@Y61.k Y41.l lVar, @Y61.l AttributedText attributedText) {
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new SE0.a(7, lVar));
        }
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f83093f;
        textView.setMovementMethod(linkMovementMethod);
        com.avito.android.util.text.j.a(textView, attributedText, null);
    }

    @Override // com.avito.android.advert_core.comfortable_deal_promo.i
    public final void uo(@Y61.l UniversalColor universalColor, @Y61.l Integer num) {
        ViewGroup viewGroup = this.f83090c;
        if (num != null) {
            viewGroup.setBackground(new AvitoLinearGradientDrawable(new AvitoLinearGradientDrawable.a.C5275a(this.itemView.getContext(), num.intValue(), 0, 4, null).a()));
        } else {
            Context context = this.f83089b;
            if (universalColor != null) {
                Color color = universalColor.getColor();
                if (color == null) {
                    return;
                }
                int value = color.getValue();
                Color colorDark = universalColor.getColorDark();
                if (colorDark == null) {
                    return;
                }
                int value2 = colorDark.getValue();
                if (!com.avito.android.lib.util.darkTheme.c.b(context)) {
                    value = value2;
                }
                viewGroup.setBackgroundColor(value);
            } else {
                viewGroup.setBackgroundColor(C35835l0.d(R.attr.warmGray4, context));
            }
        }
        v.a(viewGroup, y6.b(28));
    }

    @Override // com.avito.android.advert_core.comfortable_deal_promo.i
    public final void v50(@Y61.k Y41.l lVar, @Y61.k List list) {
        FlexboxLayout flexboxLayout = this.f83094g;
        flexboxLayout.removeAllViews();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f83089b, R.style.Theme_DesignSystem_Re23);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AdvertDetailsComfortableDealPromoItem.Button button = (AdvertDetailsComfortableDealPromoItem.Button) it.next();
            Button button2 = new Button(contextThemeWrapper, null, 0, 0, 14, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = D6.i(6, button2.getContext());
            layoutParams.rightMargin = D6.i(6, button2.getContext());
            button2.setLayoutParams(layoutParams);
            b.a aVar = VU.b.f17147t;
            Context context = button2.getContext();
            aVar.getClass();
            button2.setStyle((VU.b) c.a.a(aVar, context, R.attr.buttonOverlaySecondaryMedium));
            button2.setText(button.f83065b);
            button2.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(12, lVar, button));
            flexboxLayout.addView(button2);
        }
    }
}
