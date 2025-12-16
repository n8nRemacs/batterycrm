package com.avito.android.seller_promotions;

import Oq0.g;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SellerPromotionsView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class p extends N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g.b f268093l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f268094m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g.b bVar, Y41.a<G0> aVar) {
        super(1);
        this.f268093l = bVar;
        this.f268094m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        g.b bVar = this.f268093l;
        contentPlaceholder2.setTitle(bVar.f12625a.k0(contentPlaceholder2.getContext()));
        PrintableText printableText = bVar.f12626b;
        contentPlaceholder2.setSubtitle(printableText != null ? printableText.k0(contentPlaceholder2.getContext()) : null);
        contentPlaceholder2.setButtonTitle(bVar.f12627c.k0(contentPlaceholder2.getContext()));
        contentPlaceholder2.setButtonOnClickListener(new o(0, this.f268094m));
        return G0.f406611a;
    }
}
