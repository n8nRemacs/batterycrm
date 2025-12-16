package com.avito.android.favorites.adapter.promo_banner_with_benefits;

import Y61.l;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.n;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PromoBannerRecallWithBenefitsView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/adapter/promo_banner_with_benefits/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/favorites/adapter/promo_banner_with_benefits/j;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f156742s = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f156743b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f156744c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f156745d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f156746e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageButton f156747f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f156748g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Input f156749h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Button f156750i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f156751j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f156752k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f156753l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Q<TextView, SimpleDraweeView> f156754m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Q<TextView, SimpleDraweeView> f156755n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public Y41.l<? super String, G0> f156756o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public Y41.l<? super String, G0> f156757p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public Y41.l<? super List<String>, G0> f156758q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public Y41.l<? super DeepLink, G0> f156759r;

    public k(@Y61.k View view) {
        super(view);
        this.f156743b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.favorites_closed_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156744c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.text_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156745d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.text_body);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156746e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.image_close_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f156747f = (ImageButton) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.input_title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156748g = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.phone_input);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById6;
        this.f156749h = input;
        View viewFindViewById7 = view.findViewById(R.id.recall_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f156750i = (Button) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.recall_policy);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById8;
        this.f156751j = textView;
        View viewFindViewById9 = view.findViewById(R.id.keys_block);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f156752k = (ConstraintLayout) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.graph_block);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f156753l = (ConstraintLayout) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.keys_text);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.keys_image);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f156754m = new Q<>(textView2, (SimpleDraweeView) viewFindViewById12);
        View viewFindViewById13 = view.findViewById(R.id.graph_text);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView3 = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.graph_image);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f156755n = new Q<>(textView3, (SimpleDraweeView) viewFindViewById14);
        FormatterType.f179288e.getClass();
        input.setFormatterType(FormatterType.f179290g);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.favorites.adapter.promo_banner_with_benefits.j
    public final void kI(@Y61.k PromoBannerRecallWithBenefitsItem promoBannerRecallWithBenefitsItem, @Y61.k Y41.l<? super String, G0> lVar, @Y61.k Y41.l<? super String, G0> lVar2, @Y61.k Y41.l<? super List<String>, G0> lVar3, @Y61.k Y41.l<? super DeepLink, G0> lVar4) {
        ConstraintLayout constraintLayout = this.f156753l;
        ConstraintLayout constraintLayout2 = this.f156752k;
        Input input = this.f156749h;
        TextView textView = this.f156748g;
        ImageButton imageButton = this.f156747f;
        TextView textView2 = this.f156746e;
        TextView textView3 = this.f156745d;
        TextView textView4 = this.f156751j;
        Button button = this.f156750i;
        this.f156756o = lVar;
        this.f156757p = lVar2;
        this.f156758q = lVar3;
        this.f156759r = lVar4;
        boolean z12 = promoBannerRecallWithBenefitsItem.f156727n;
        TextView textView5 = this.f156744c;
        if (z12) {
            Iterator it = C42745f0.U(textView3, textView2, imageButton, textView, input, button, textView4, constraintLayout2, constraintLayout).iterator();
            while (it.hasNext()) {
                D6.w((View) it.next());
            }
            D6.H(textView5);
            return;
        }
        D6.w(textView5);
        Iterator it2 = C42745f0.U(textView3, textView2, imageButton, textView, input, button, textView4, constraintLayout2, constraintLayout).iterator();
        while (it2.hasNext()) {
            D6.H((View) it2.next());
        }
        imageButton.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(12, this, promoBannerRecallWithBenefitsItem));
        com.avito.android.lib.design.button.b.a(button, promoBannerRecallWithBenefitsItem.f156718e, false);
        button.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 11));
        I5.a(textView, promoBannerRecallWithBenefitsItem.f156719f, false);
        AttributedText attributedText = promoBannerRecallWithBenefitsItem.f156720g;
        com.avito.android.util.text.j.a(textView4, attributedText, null);
        attributedText.setOnDeepLinkClickListener(new com.avito.android.cpt.pre_activation.ui.c(this, 8));
        I5.a(textView3, promoBannerRecallWithBenefitsItem.f156716c, false);
        I5.a(textView2, promoBannerRecallWithBenefitsItem.f156717d, false);
        Q<TextView, SimpleDraweeView> q12 = this.f156754m;
        I5.a(q12.f406619b, promoBannerRecallWithBenefitsItem.f156723j, false);
        ImageRequest.a aVarA = C35949t5.a(q12.f406620c);
        Context context = this.f156743b;
        UniversalImage universalImage = promoBannerRecallWithBenefitsItem.f156721h;
        aVarA.d(n.a(universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(context)) : null));
        aVarA.c();
        Q<TextView, SimpleDraweeView> q13 = this.f156755n;
        I5.a(q13.f406619b, promoBannerRecallWithBenefitsItem.f156724k, false);
        ImageRequest.a aVarA2 = C35949t5.a(q13.f406620c);
        UniversalImage universalImage2 = promoBannerRecallWithBenefitsItem.f156722i;
        aVarA2.d(n.a(universalImage2 != null ? UniversalImageKt.getImageDependsOnTheme(universalImage2, com.avito.android.lib.util.darkTheme.c.b(context)) : null));
        aVarA2.c();
    }
}
