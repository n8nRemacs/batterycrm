package com.avito.android.favorites.adapter.promo_banner_with_description;

import Y61.l;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
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
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PromoBannerWithDescriptionView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/adapter/promo_banner_with_description/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/favorites/adapter/promo_banner_with_description/j;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f156784p = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f156785b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f156786c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f156787d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f156788e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f156789f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f156790g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Input f156791h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Button f156792i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ImageButton f156793j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f156794k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public Y41.l<? super String, G0> f156795l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public Y41.l<? super String, G0> f156796m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public Y41.l<? super List<String>, G0> f156797n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public Y41.l<? super DeepLink, G0> f156798o;

    public k(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.favorites_closed_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156785b = (TextView) viewFindViewById;
        this.f156786c = view.getContext();
        View viewFindViewById2 = view.findViewById(R.id.title_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156787d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.description_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156788e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.subtitle_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f156789f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.image);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f156790g = (SimpleDraweeView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.phone_input);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById6;
        this.f156791h = input;
        View viewFindViewById7 = view.findViewById(R.id.recall_button);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f156792i = (Button) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.image_close_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f156793j = (ImageButton) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.recall_policy);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById9;
        this.f156794k = textView;
        FormatterType.f179288e.getClass();
        input.setFormatterType(FormatterType.f179290g);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.favorites.adapter.promo_banner_with_description.j
    public final void gV(@Y61.k PromoBannerRecallWithDescriptionItem promoBannerRecallWithDescriptionItem, @Y61.k Y41.l<? super String, G0> lVar, @Y61.k Y41.l<? super String, G0> lVar2, @Y61.k Y41.l<? super List<String>, G0> lVar3, @Y61.k Y41.l<? super DeepLink, G0> lVar4) {
        this.f156795l = lVar;
        this.f156796m = lVar2;
        this.f156797n = lVar3;
        this.f156798o = lVar4;
        boolean z12 = promoBannerRecallWithDescriptionItem.f156769k;
        TextView textView = this.f156785b;
        TextView textView2 = this.f156789f;
        TextView textView3 = this.f156788e;
        TextView textView4 = this.f156787d;
        TextView textView5 = this.f156794k;
        ImageButton imageButton = this.f156793j;
        Input input = this.f156791h;
        Button button = this.f156792i;
        SimpleDraweeView simpleDraweeView = this.f156790g;
        if (z12) {
            D6.w(simpleDraweeView);
            D6.w(button);
            D6.w(input);
            D6.w(imageButton);
            D6.w(textView5);
            D6.w(textView4);
            D6.w(textView3);
            D6.w(textView2);
            D6.H(textView);
            return;
        }
        D6.w(textView);
        D6.H(simpleDraweeView);
        D6.H(button);
        D6.H(input);
        D6.H(imageButton);
        D6.H(textView5);
        D6.H(textView4);
        D6.H(textView3);
        D6.H(textView2);
        imageButton.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(13, this, promoBannerRecallWithDescriptionItem));
        com.avito.android.lib.design.button.b.a(button, promoBannerRecallWithDescriptionItem.f156763e, false);
        button.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 12));
        I5.a(textView2, promoBannerRecallWithDescriptionItem.f156764f, false);
        com.avito.android.cpt.pre_activation.ui.c cVar = new com.avito.android.cpt.pre_activation.ui.c(this, 9);
        AttributedText attributedText = promoBannerRecallWithDescriptionItem.f156765g;
        attributedText.setOnDeepLinkClickListener(cVar);
        com.avito.android.util.text.j.a(textView5, attributedText, null);
        I5.a(textView4, promoBannerRecallWithDescriptionItem.f156761c, false);
        I5.a(textView3, promoBannerRecallWithDescriptionItem.f156762d, false);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        UniversalImage universalImage = promoBannerRecallWithDescriptionItem.f156766h;
        aVarA.d(n.a(universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f156786c)) : null));
        aVarA.c();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f156795l = null;
        this.f156796m = null;
        this.f156797n = null;
        this.f156798o = null;
    }
}
