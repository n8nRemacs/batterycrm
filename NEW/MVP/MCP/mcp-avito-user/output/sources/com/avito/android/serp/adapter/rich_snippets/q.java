package com.avito.android.serp.adapter.rich_snippets;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.cyclic_gallery_widget.image_carousel.seller_info.SellerInfoParams;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SellerInfoParamsFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/q;", "Lcom/avito/android/serp/adapter/rich_snippets/p;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    public final int f270887a;

    /* renamed from: b, reason: collision with root package name */
    public final int f270888b;

    @Inject
    public q(@Y61.k Resources resources) {
        this.f270887a = resources.getDimensionPixelOffset(R.dimen.rich_snippet_seller_info_vas_padding);
        this.f270888b = resources.getDimensionPixelOffset(R.dimen.rich_snippet_seller_info_regular_padding);
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.p
    @Y61.k
    public final SellerInfoParams a() {
        return new SellerInfoParams(this.f270888b, false, 1, SellerInfoParams.SellerInfoBlockPosition.f132109b);
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.p
    @Y61.k
    public final SellerInfoParams b() {
        return new SellerInfoParams(this.f270888b, false, 2, SellerInfoParams.SellerInfoBlockPosition.f132109b);
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.p
    @Y61.k
    public final SellerInfoParams c() {
        return new SellerInfoParams(this.f270887a, true, 2, SellerInfoParams.SellerInfoBlockPosition.f132109b);
    }
}
