package com.avito.android.cart_similar_items.konveyor.pagination;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.ViewGroup;
import com.avito.android.cart_similar_items.konveyor.pagination.a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.printable_text.PrintableText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import mn.InterfaceC44101a;

/* compiled from: PaginationItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/pagination/d;", "LTV0/d;", "Lcom/avito/android/cart_similar_items/konveyor/pagination/f;", "Lcom/avito/android/cart_similar_items/konveyor/pagination/a;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements TV0.d<f, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC44101a, G0> f115857b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC44101a, G0> lVar) {
        this.f115857b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        a.b.C3380b c3380b = a.b.C3380b.f115852a;
        a.b bVar = ((a) aVar).f115849d;
        boolean zEquals = bVar.equals(c3380b);
        Button button = fVar.f115863f;
        ViewGroup viewGroup = fVar.f115861d;
        Spinner spinner = fVar.f115860c;
        if (zEquals) {
            spinner.setVisibility(0);
            viewGroup.setVisibility(8);
        } else if (bVar instanceof a.b.C3379a) {
            spinner.setVisibility(8);
            viewGroup.setVisibility(0);
            a.b.C3379a c3379a = (a.b.C3379a) bVar;
            PrintableText printableText = c3379a.f115850a;
            Context context = fVar.f115859b;
            fVar.f115862e.setText(printableText.k0(context));
            button.setText(c3379a.f115851b.k0(context));
        }
        button.setOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 25));
    }
}
