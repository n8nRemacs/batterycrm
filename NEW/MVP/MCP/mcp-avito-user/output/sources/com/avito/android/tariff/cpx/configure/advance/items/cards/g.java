package com.avito.android.tariff.cpx.configure.advance.items.cards;

import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.cpx.configure.advance.items.cards.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpxConfigureAdvanceCardsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/items/cards/a;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/tariff/cpx/configure/advance/items/cards/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.l<a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f295661l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f295662m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, j jVar) {
        super(1);
        this.f295661l = hVar;
        this.f295662m = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(a aVar) {
        a aVar2 = aVar;
        boolean z12 = aVar2 instanceof a.b;
        a.b bVar = z12 ? (a.b) aVar2 : null;
        AttributedText attributedText = bVar != null ? bVar.f295653d : null;
        h hVar = this.f295661l;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new f(hVar.f295665d));
        }
        this.f295662m.U4(attributedText);
        if (z12) {
            hVar.f295663b.invoke(((a.b) aVar2).f295652c);
        } else if (aVar2 instanceof a.C8994a) {
            hVar.f295664c.invoke(((a.C8994a) aVar2).f295649b);
        }
        return G0.f406611a;
    }
}
