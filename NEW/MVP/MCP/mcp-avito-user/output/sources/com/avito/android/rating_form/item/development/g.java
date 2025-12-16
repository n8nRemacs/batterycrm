package com.avito.android.rating_form.item.development;

import Y41.l;
import Y61.k;
import com.avito.android.printable_text.PrintableText;
import ih0.InterfaceC41402a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DevelopmentItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/development/g;", "Lcom/avito/android/rating_form/item/development/d;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC41402a, G0> f248405b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super InterfaceC41402a, G0> lVar) {
        this.f248405b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        iVar.setTitle(aVar2.f248391d);
        iVar.f(aVar2.f248392e);
        iVar.X0(aVar2.f248395h);
        iVar.i40(aVar2.f248397j);
        iVar.o(aVar2.f248393f);
        iVar.s0(aVar2.f248394g);
        iVar.M5(new e(this));
        iVar.a(new f(this, aVar2));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        List list2 = list;
        Object obj = null;
        for (Object obj2 : list2) {
            if (obj2 instanceof com.avito.android.rating_form.step.recycler.e) {
                obj = obj2;
            }
        }
        if (!(obj instanceof com.avito.android.rating_form.step.recycler.e)) {
            obj = null;
        }
        com.avito.android.rating_form.step.recycler.e eVar2 = (com.avito.android.rating_form.step.recycler.e) obj;
        PrintableText printableText = eVar2 != null ? eVar2.f249734a : null;
        Object obj3 = null;
        for (Object obj4 : list2) {
            if (obj4 instanceof com.avito.android.rating_form.step.recycler.e) {
                obj3 = obj4;
            }
        }
        if (!(obj3 instanceof com.avito.android.rating_form.step.recycler.e)) {
            obj3 = null;
        }
        com.avito.android.rating_form.step.recycler.e eVar3 = (com.avito.android.rating_form.step.recycler.e) obj3;
        Boolean bool = eVar3 != null ? eVar3.f249735b : null;
        iVar.s0(printableText);
        iVar.X0(bool);
    }
}
