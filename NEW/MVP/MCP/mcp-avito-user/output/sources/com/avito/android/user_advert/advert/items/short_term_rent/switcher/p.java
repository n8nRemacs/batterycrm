package com.avito.android.user_advert.advert.items.short_term_rent.switcher;

import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import com.avito.android.user_advert.advert.items.j0;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ShortTermRentSwitcherItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/short_term_rent/switcher/p;", "Lcom/avito/android/user_advert/advert/items/short_term_rent/switcher/k;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class p implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public MyAdvertDetailsActivity f310274b;

    @Inject
    public p() {
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((r) eVar, (OH0.e) aVar);
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.switcher.k
    public final void c0() {
        this.f310274b = null;
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.switcher.k
    public final void c1(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f310274b = myAdvertDetailsActivity;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        r rVar = (r) eVar;
        OH0.e eVar2 = (OH0.e) aVar;
        Iterator it = list.iterator();
        Object obj = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null ? next instanceof j0 : true) {
                obj = next;
            }
        }
        j0 j0Var = (j0) (obj instanceof j0 ? obj : null);
        if (j0Var == null) {
            k(rVar, eVar2);
            return;
        }
        rVar.setEnabled(j0Var.f309540a);
        l lVar = new l(this, eVar2);
        rVar.Bj();
        rVar.setChecked(j0Var.f309541b);
        rVar.hK(new o(lVar));
    }

    public final void k(@Y61.k r rVar, @Y61.k OH0.e eVar) {
        rVar.setTitle(eVar.f12163c);
        m mVar = new m(this, eVar);
        rVar.Bj();
        rVar.setChecked(eVar.f12165e);
        rVar.hK(new o(mVar));
        rVar.setEnabled(eVar.f12164d);
        AttributedText attributedText = eVar.f12166f;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new com.avito.android.advert_details_items.buyer_bonuses.g(13, this, eVar));
        }
        rVar.k(attributedText);
        rVar.U2(new n(eVar));
    }
}
