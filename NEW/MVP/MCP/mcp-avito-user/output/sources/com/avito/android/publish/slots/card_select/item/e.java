package com.avito.android.publish.slots.card_select.item;

import Y41.l;
import com.avito.android.remote.model.category_parameters.slot.card_select.CardSelect;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: CardSelectSlotItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelect;", "clickedCard", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/slot/card_select/CardSelect;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements l<CardSelect, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f243145l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f243146m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, a aVar) {
        super(1);
        this.f243145l = gVar;
        this.f243146m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(CardSelect cardSelect) {
        CardSelect cardSelect2 = cardSelect;
        g gVar = this.f243145l;
        gVar.getClass();
        a aVar = this.f243146m;
        ArrayList arrayList = new ArrayList(aVar.f243136c);
        int iIndexOf = aVar.f243136c.indexOf(cardSelect2);
        arrayList.set(iIndexOf, cardSelect2.copy((8187 & 1) != 0 ? cardSelect2.cardTitle : null, (8187 & 2) != 0 ? cardSelect2.deeplink : null, (8187 & 4) != 0 ? cardSelect2.isChecked : !cardSelect2.isChecked(), (8187 & 8) != 0 ? cardSelect2.linkButton : null, (8187 & 16) != 0 ? cardSelect2.paragraphs : null, (8187 & 32) != 0 ? cardSelect2.navigationAction : null, (8187 & 64) != 0 ? cardSelect2.navigationButtonsDisclaimer : null, (8187 & 128) != 0 ? cardSelect2.isRedesign : null, (8187 & 256) != 0 ? cardSelect2.header : null, (8187 & 512) != 0 ? cardSelect2.titleBadge : null, (8187 & 1024) != 0 ? cardSelect2.titleBadgeStyle : null, (8187 & 2048) != 0 ? cardSelect2.buyoutPrice : null, (8187 & 4096) != 0 ? cardSelect2.infoBadge : null));
        if (((CardSelect) arrayList.get(iIndexOf)).isChecked()) {
            Iterator it = arrayList.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                CardSelect cardSelect3 = (CardSelect) next;
                if (i12 != iIndexOf) {
                    arrayList.set(i12, cardSelect3.copy((8187 & 1) != 0 ? cardSelect3.cardTitle : null, (8187 & 2) != 0 ? cardSelect3.deeplink : null, (8187 & 4) != 0 ? cardSelect3.isChecked : false, (8187 & 8) != 0 ? cardSelect3.linkButton : null, (8187 & 16) != 0 ? cardSelect3.paragraphs : null, (8187 & 32) != 0 ? cardSelect3.navigationAction : null, (8187 & 64) != 0 ? cardSelect3.navigationButtonsDisclaimer : null, (8187 & 128) != 0 ? cardSelect3.isRedesign : null, (8187 & 256) != 0 ? cardSelect3.header : null, (8187 & 512) != 0 ? cardSelect3.titleBadge : null, (8187 & 1024) != 0 ? cardSelect3.titleBadgeStyle : null, (8187 & 2048) != 0 ? cardSelect3.buyoutPrice : null, (8187 & 4096) != 0 ? cardSelect3.infoBadge : null));
                }
                i12 = i13;
            }
        }
        G0 g02 = G0.f406611a;
        gVar.f243148b.accept(new a(aVar.f243135b, arrayList, aVar.f243137d, aVar.f243138e));
        return G0.f406611a;
    }
}
