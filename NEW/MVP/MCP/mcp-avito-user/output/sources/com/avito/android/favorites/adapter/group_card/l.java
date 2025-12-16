package com.avito.android.favorites.adapter.group_card;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GroupCardItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/adapter/group_card/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/favorites/adapter/group_card/k;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f156584b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f156585c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f156586d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f156587e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f156588f;

    public l(@Y61.k View view) {
        super(view);
        this.f156584b = view;
        this.f156585c = (TextView) view.findViewById(R.id.group_card_item_title);
        this.f156586d = (TextView) view.findViewById(R.id.group_card_item_subtitle);
        this.f156587e = (ImageView) view.findViewById(R.id.group_card_item_image);
        view.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 10));
    }

    @Override // com.avito.android.favorites.adapter.group_card.k
    public final void M(@Y61.l UniversalImage universalImage) {
        ImageView imageView = this.f156587e;
        com.avito.android.image_loader.glide.utils.b.b(imageView, com.avito.android.image_loader.b.b(universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(imageView.getContext())) : null).a(imageView), R.drawable.bg_group_card_preview, y6.b(20));
    }

    @Override // com.avito.android.favorites.adapter.group_card.k
    public final void R(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f156586d, attributedText, null);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f156588f = null;
    }

    @Override // com.avito.android.favorites.adapter.group_card.k
    public final void uk(@Y61.k Y41.a<G0> aVar) {
        this.f156588f = aVar;
    }

    @Override // com.avito.android.favorites.adapter.group_card.k
    public final void w(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f156585c, attributedText, null);
    }
}
