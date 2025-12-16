package com.avito.android.photo_gallery_carousel.items.autoteka_teaser.v4;

import Y41.l;
import Y61.k;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j;
import com.avito.android.remote.model.autotekateaser.AutotekaButton;
import com.avito.android.remote.model.autotekateaser.PersonalDiscount;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryAutotekaNewTeaserItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/autoteka_teaser/v4/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/photo_gallery_carousel/items/autoteka_teaser/v4/g;", "Lcom/avito/android/photo_gallery_carousel/items/common/c;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements g, com.avito.android.photo_gallery_carousel.items.common.c {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f217880c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f217881b;

    public f(@k View view) {
        super(view);
        this.f217881b = view;
        new com.avito.android.photo_gallery_carousel.items.common.e(view);
    }

    @Override // com.avito.android.photo_gallery_carousel.items.autoteka_teaser.v4.g
    public final void Hg(@k AutotekaButton autotekaButton, @k l<? super DeepLink, G0> lVar) {
        View view = this.f217881b;
        View viewFindViewById = view.findViewById(R.id.buttonContainer);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        linearLayout.removeAllViews();
        Button button = new Button(new ContextThemeWrapper(view.getContext(), R.style.Theme_DesignSystem_Re23), null, 0, 0, 12, null);
        button.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        button.setAppearanceFromAttr((view.getResources().getConfiguration().uiMode & 48) == 32 ? R.attr.buttonPrimarySmall : R.attr.buttonOverlayPrimarySmall);
        button.setText(autotekaButton.getAction().getTitle());
        button.setOnClickListener(new j(11, lVar, autotekaButton));
        linearLayout.addView(button);
    }

    @Override // com.avito.android.photo_gallery_carousel.items.autoteka_teaser.v4.g
    public final void c9() {
        View viewFindViewById = this.f217881b.findViewById(R.id.gallery_teaser_icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById;
        imageView.setImageDrawable(C35835l0.m(imageView.getContext(), R.attr.ic_camera36, R.attr.constantWhite));
    }

    @Override // com.avito.android.photo_gallery_carousel.items.autoteka_teaser.v4.g
    public final void h(@k String str) {
        View viewFindViewById = this.f217881b.findViewById(R.id.description);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        I5.a((TextView) viewFindViewById, str, false);
    }

    @Override // com.avito.android.photo_gallery_carousel.items.autoteka_teaser.v4.g
    public final void oz(@k PersonalDiscount personalDiscount) {
        View view = this.f217881b;
        View viewFindViewById = view.findViewById(R.id.discountContainer);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.discountTitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.discountAmount);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.docking_badge.DockingBadge");
        }
        D6.H(linearLayout);
        textView.setText(personalDiscount.getTitle());
        ((DockingBadge) viewFindViewById3).setText(personalDiscount.getAmount());
    }

    @Override // com.avito.android.photo_gallery_carousel.items.autoteka_teaser.v4.g
    public final void setTitle(@k String str) {
        View viewFindViewById = this.f217881b.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById).setText(str);
    }

    @Override // com.avito.android.photo_gallery_carousel.items.autoteka_teaser.v4.g
    public final void u9() {
        View viewFindViewById = this.f217881b.findViewById(R.id.gallery_teaser_icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ((ImageView) viewFindViewById).setImageResource(R.drawable.autoteka_logo_in_gallery_teaser);
    }
}
