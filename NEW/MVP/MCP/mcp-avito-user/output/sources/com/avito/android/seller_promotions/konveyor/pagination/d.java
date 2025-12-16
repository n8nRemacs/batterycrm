package com.avito.android.seller_promotions.konveyor.pagination;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.ViewGroup;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.review_gallery.g;
import com.avito.android.seller_promotions.konveyor.pagination.a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PaginationItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_promotions/konveyor/pagination/d;", "LTV0/d;", "Lcom/avito/android/seller_promotions/konveyor/pagination/f;", "Lcom/avito/android/seller_promotions/konveyor/pagination/a;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements TV0.d<f, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Oq0.d, G0> f267818b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super Oq0.d, G0> lVar) {
        this.f267818b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        a.b.C8011b c8011b = a.b.C8011b.f267813a;
        a.b bVar = ((a) aVar).f267810d;
        boolean zEquals = bVar.equals(c8011b);
        Button button = fVar.f267824f;
        ViewGroup viewGroup = fVar.f267822d;
        Spinner spinner = fVar.f267821c;
        if (zEquals) {
            spinner.setVisibility(0);
            viewGroup.setVisibility(8);
        } else if (bVar instanceof a.b.C8010a) {
            spinner.setVisibility(8);
            viewGroup.setVisibility(0);
            a.b.C8010a c8010a = (a.b.C8010a) bVar;
            PrintableText printableText = c8010a.f267811a;
            Context context = fVar.f267820b;
            fVar.f267823e.setText(printableText.k0(context));
            button.setText(c8010a.f267812b.k0(context));
        }
        button.setOnClickListener(new g(this, 19));
    }
}
