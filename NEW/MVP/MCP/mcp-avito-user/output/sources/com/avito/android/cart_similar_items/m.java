package com.avito.android.cart_similar_items;

import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mn.C44104d;

/* compiled from: CartSimilarItemsView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class m extends N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C44104d.b f115922l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f115923m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C44104d.b bVar, Y41.a<G0> aVar) {
        super(1);
        this.f115922l = bVar;
        this.f115923m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        C44104d.b bVar = this.f115922l;
        contentPlaceholder2.setTitle(bVar.f414716a.k0(contentPlaceholder2.getContext()));
        PrintableText printableText = bVar.f414717b;
        contentPlaceholder2.setSubtitle(printableText != null ? printableText.k0(contentPlaceholder2.getContext()) : null);
        contentPlaceholder2.setButtonTitle(bVar.f414718c.k0(contentPlaceholder2.getContext()));
        contentPlaceholder2.setButtonOnClickListener(new com.avito.android.calltracking.item.m(7, this.f115923m));
        return G0.f406611a;
    }
}
