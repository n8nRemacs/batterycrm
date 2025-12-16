package com.avito.android.advert.item.brandingGallery.items;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import kotlin.Metadata;

/* compiled from: BrandingGalleryBlockElementView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/brandingGallery/items/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f74164b;

    /* renamed from: c, reason: collision with root package name */
    public final SimpleDraweeView f74165c;

    /* renamed from: d, reason: collision with root package name */
    public final ShimmerLayout f74166d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f74167e;

    public g(@k View view) {
        super(view);
        this.f74164b = view;
        this.f74165c = (SimpleDraweeView) view.findViewById(R.id.advert_details_branding_gallery_block_element_image);
        this.f74166d = (ShimmerLayout) view.findViewById(R.id.advert_details_branding_gallery_block_element_shimmer);
        this.f74167e = (ImageView) view.findViewById(R.id.advert_details_branding_gallery_block_element_play_button);
    }
}
