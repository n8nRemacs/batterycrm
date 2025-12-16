package com.avito.android.photo_gallery_carousel.items.autoteka_teaser;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mortgage.root.list.items.legacy_status.i;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryAutotekaTeaserItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/autoteka_teaser/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/photo_gallery_carousel/items/autoteka_teaser/g;", "Lcom/avito/android/photo_gallery_carousel/items/common/c;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements g, com.avito.android.photo_gallery_carousel.items.common.c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f217864g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f217865b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f217866c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f217867d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f217868e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f217869f;

    public f(@k View view) {
        super(view);
        this.f217865b = view;
        new com.avito.android.photo_gallery_carousel.items.common.e(view);
        View viewFindViewById = view.findViewById(R.id.gallery_teaser_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f217866c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.gallery_teaser_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f217867d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.gallery_teaser_button_show);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f217868e = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.gallery_teaser_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f217869f = (ImageView) viewFindViewById4;
    }

    @Override // com.avito.android.photo_gallery_carousel.items.autoteka_teaser.g
    public final void b50(@k String str) {
        this.f217868e.setText(str);
    }

    @Override // com.avito.android.photo_gallery_carousel.items.autoteka_teaser.g
    public final void c9() {
        ImageView imageView = this.f217869f;
        imageView.setImageDrawable(C35835l0.m(imageView.getContext(), R.attr.ic_camera36, R.attr.constantWhite));
    }

    @Override // com.avito.android.photo_gallery_carousel.items.autoteka_teaser.g
    public final void cB(@k Y41.a<G0> aVar) {
        this.f217868e.setOnClickListener(new i(26, aVar));
    }

    @Override // com.avito.android.photo_gallery_carousel.items.autoteka_teaser.g
    public final void f(@k String str) {
        this.f217867d.setText(str);
    }

    @Override // com.avito.android.photo_gallery_carousel.items.autoteka_teaser.g
    public final void setTitle(@k String str) {
        this.f217866c.setText(str);
    }

    @Override // com.avito.android.photo_gallery_carousel.items.autoteka_teaser.g
    public final void u9() {
        this.f217869f.setImageResource(R.drawable.ic_autoteka_logo_in_gallery_teaser);
    }
}
