package com.avito.android.blueprints.selector_cards_carousel;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.lib.design.selector_card.r;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorCardsCarouselContentBinder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/selector_cards_carousel/c;", "Lcom/avito/android/lib/design/selector_card/f;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements com.avito.android.lib.design.selector_card.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public View f106721a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public TextView f106722b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public SimpleDraweeView f106723c;

    @Override // com.avito.android.lib.design.selector_card.f
    public final void a(@Y61.k View view) {
        this.f106721a = view;
        View viewFindViewById = view.findViewById(R.id.selector_cards_carousel_card_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f106723c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.selector_cards_carousel_card_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f106722b = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.lib.design.selector_card.f
    public final void b(@Y61.k r rVar) {
        View view = this.f106721a;
        Context context = view != null ? view.getContext() : null;
        if (context == null) {
            return;
        }
        ParameterElement.SelectorCardsCarousel.a aVar = (ParameterElement.SelectorCardsCarousel.a) rVar;
        if (aVar instanceof ParameterElement.SelectorCardsCarousel.a.C3417a) {
            SimpleDraweeView simpleDraweeView = this.f106723c;
            if (simpleDraweeView != null) {
                simpleDraweeView.setVisibility(0);
            }
            SimpleDraweeView simpleDraweeView2 = this.f106723c;
            if (simpleDraweeView2 != null) {
                C35949t5.c(simpleDraweeView2, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(((ParameterElement.SelectorCardsCarousel.a.C3417a) rVar).f117369e, com.avito.android.lib.util.darkTheme.c.b(context))), null, null, null, 14);
            }
            TextView textView = this.f106722b;
            if (textView != null) {
                textView.setGravity(1);
            }
            TextView textView2 = this.f106722b;
            if (textView2 != null) {
                textView2.setText(((ParameterElement.SelectorCardsCarousel.a.C3417a) rVar).f117368d);
            }
            TextView textView3 = this.f106722b;
            if (textView3 != null) {
                textView3.setCompoundDrawablePadding(0);
            }
            TextView textView4 = this.f106722b;
            if (textView4 != null) {
                textView4.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                return;
            }
            return;
        }
        if (aVar instanceof ParameterElement.SelectorCardsCarousel.a.b) {
            SimpleDraweeView simpleDraweeView3 = this.f106723c;
            if (simpleDraweeView3 != null) {
                simpleDraweeView3.setVisibility(8);
            }
            TextView textView5 = this.f106722b;
            if (textView5 != null) {
                textView5.setGravity(16);
            }
            TextView textView6 = this.f106722b;
            if (textView6 != null) {
                int i12 = ((ParameterElement.SelectorCardsCarousel.a.b) rVar).f117371c;
                textView6.setText(i12 > 0 ? context.getResources().getQuantityString(R.plurals.selector_cards_carousel_selected_count, i12, Integer.valueOf(i12)) : context.getString(R.string.selector_cards_carousel_supplement_text));
            }
            if (((ParameterElement.SelectorCardsCarousel.a.b) rVar).f117372d) {
                TextView textView7 = this.f106722b;
                if (textView7 != null) {
                    textView7.setCompoundDrawablePadding(y6.b(4));
                }
                TextView textView8 = this.f106722b;
                if (textView8 != null) {
                    textView8.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_publish_arrow_right, 0);
                    return;
                }
                return;
            }
            TextView textView9 = this.f106722b;
            if (textView9 != null) {
                textView9.setCompoundDrawablePadding(0);
            }
            TextView textView10 = this.f106722b;
            if (textView10 != null) {
                textView10.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
        }
    }
}
