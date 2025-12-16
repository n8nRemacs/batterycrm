package com.avito.android.favorites.adapter.banner;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.lib.design.gradient.a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: SalesPromoItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/adapter/banner/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/favorites/adapter/banner/h;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f156545d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f156546b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f156547c;

    public i(@k View view) {
        super(view);
        this.f156546b = view;
        View viewFindViewById = view.findViewById(R.id.background);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f156547c = (SimpleDraweeView) viewFindViewById;
    }

    public static void B80(SimpleDraweeView simpleDraweeView, UniversalImage universalImage) {
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext())) : null;
        if (imageDependsOnThemeOrDefault == null) {
            D6.w(simpleDraweeView);
        } else {
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault), null, null, null, 14);
            D6.H(simpleDraweeView);
        }
    }

    @Override // com.avito.android.favorites.adapter.banner.h
    public final void M(@l UniversalImage universalImage) {
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) this.f156546b.findViewById(R.id.sale_promo_image);
        if (simpleDraweeView != null) {
            B80(simpleDraweeView, universalImage);
        }
    }

    @Override // com.avito.android.favorites.adapter.banner.h
    public final void Qs(@k UniversalImage universalImage) {
        View view = this.f156546b;
        view.setBackground(null);
        view.setBackgroundTintList(null);
        B80(this.f156547c, universalImage);
    }

    @Override // com.avito.android.favorites.adapter.banner.h
    public final void R(@k AttributedText attributedText) {
        View viewFindViewById = this.f156546b.findViewById(R.id.sale_promo_subtitle);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        j.a((TextView) viewFindViewById, attributedText, null);
    }

    @Override // com.avito.android.favorites.adapter.banner.h
    @k
    public final String w(@k AttributedText attributedText) {
        View viewFindViewById = this.f156546b.findViewById(R.id.sale_promo_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        j.a(textView, attributedText, null);
        return textView.getText().toString();
    }

    @Override // com.avito.android.favorites.adapter.banner.h
    public final void wM(@k UniversalColor universalColor) {
        View view = this.f156546b;
        view.setBackgroundResource(R.drawable.bg_favorite_sale_promo);
        D6.w(this.f156547c);
        Context context = view.getContext();
        C48063a.f437606a.getClass();
        view.setBackgroundTintList(C48063a.e(context, universalColor));
    }

    @Override // com.avito.android.favorites.adapter.banner.h
    public final void yB(@k String str) throws Resources.NotFoundException {
        Integer numH = com.avito.android.lib.util.f.h(str);
        Integer numI = com.avito.android.lib.util.f.i(str);
        View view = this.f156546b;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.banner_corner_radius);
        Drawable aVar = null;
        view.setBackgroundTintList(null);
        D6.w(this.f156547c);
        if (numH != null) {
            AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(view.getContext(), numH.intValue(), 0, 4, null);
            c5275a.f179264a = dimensionPixelSize;
            aVar = new AvitoLinearGradientDrawable(c5275a.a());
        } else if (numI != null) {
            Context context = view.getContext();
            a.C5276a.C5277a c5277a = new a.C5276a.C5277a(view.getContext(), numI.intValue(), 0, 4, null);
            c5277a.f179264a = dimensionPixelSize;
            G0 g02 = G0.f406611a;
            aVar = new com.avito.android.lib.design.gradient.a(context, c5277a.a());
        }
        view.setBackground(aVar);
    }

    @Override // com.avito.android.favorites.adapter.banner.h
    public final void z00(@k Y41.a<G0> aVar) {
        this.f156546b.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(25, aVar));
    }
}
