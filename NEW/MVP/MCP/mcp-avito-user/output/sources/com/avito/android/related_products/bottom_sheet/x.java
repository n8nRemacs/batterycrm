package com.avito.android.related_products.bottom_sheet;

import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RelatedProductsPageFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class x extends N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RelatedProductsPageFragment f252998l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(RelatedProductsPageFragment relatedProductsPageFragment) {
        super(1);
        this.f252998l = relatedProductsPageFragment;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        contentPlaceholder.setState(new WU.a(Integer.valueOf(R.drawable.placeholders_img_unknown_error), com.avito.android.printable_text.b.c(R.string.error_layout_unknown_error, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.related_products_network_parsing_error, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.related_products_close, new Serializable[0]), new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(this.f252998l, 28)));
        return G0.f406611a;
    }
}
