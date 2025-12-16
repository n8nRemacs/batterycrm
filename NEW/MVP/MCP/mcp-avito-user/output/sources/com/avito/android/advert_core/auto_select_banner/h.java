package com.avito.android.advert_core.auto_select_banner;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.auto_select.SelectButtonParams;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutoSelectBannerView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/auto_select_banner/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/auto_select_banner/g;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f82912h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f82913b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CardView f82914c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f82915d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f82916e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Button f82917f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleDraweeView f82918g;

    public h(@k View view) {
        super(view);
        this.f82913b = view;
        View viewFindViewById = view.findViewById(R.id.auto_select_banner);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.cardview.widget.CardView");
        }
        this.f82914c = (CardView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.auto_select_banner_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f82915d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.auto_select_banner_description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f82916e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.auto_select_banner_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f82917f = (Button) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.auto_select_banner_image);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f82918g = (SimpleDraweeView) viewFindViewById5;
    }

    @Override // com.avito.android.advert_core.auto_select_banner.g
    public final void Az(@k SelectButtonParams selectButtonParams, @k l<? super DeepLink, G0> lVar) {
        String text = selectButtonParams.getText();
        Button button = this.f82917f;
        com.avito.android.lib.design.button.b.a(button, text, false);
        String style = selectButtonParams.getStyle();
        button.setAppearanceFromAttr(style != null ? com.avito.android.lib.util.f.d(style) : R.attr.buttonPayMedium);
        button.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(11, lVar, selectButtonParams));
    }

    @Override // com.avito.android.advert_core.auto_select_banner.g
    public final void e(@k AttributedText attributedText) {
        j.c(this.f82915d, attributedText, null);
    }

    @Override // com.avito.android.advert_core.auto_select_banner.g
    public final void g(@k AttributedText attributedText) {
        j.c(this.f82916e, attributedText, null);
    }

    @Override // com.avito.android.advert_core.auto_select_banner.g
    public final void g5(@Y61.l String str) {
        Integer numA;
        this.f82914c.setCardBackgroundColor(C35835l0.d((str == null || (numA = com.avito.android.lib.util.e.a(str)) == null) ? R.attr.violet : numA.intValue(), this.f82913b.getContext()));
    }

    @Override // com.avito.android.advert_core.auto_select_banner.g
    public final void l(@k Image image) {
        ImageRequest.a aVarA = C35949t5.a(this.f82918g);
        aVarA.d(com.avito.android.image_loader.b.b(image));
        aVarA.f169499q = ImageRequest.CacheChoice.f169468b;
        aVarA.f169491i = true;
        aVarA.c();
    }

    @Override // com.avito.android.advert_core.auto_select_banner.g
    public final void pm(@k UniversalImage universalImage) {
        Image imageQ = com.avito.android.actions_sheet.a.q(this.f82913b, universalImage);
        ImageRequest.a aVarA = C35949t5.a(this.f82918g);
        aVarA.d(com.avito.android.image_loader.b.b(imageQ));
        aVarA.f169499q = ImageRequest.CacheChoice.f169468b;
        aVarA.f169491i = true;
        aVarA.c();
    }
}
