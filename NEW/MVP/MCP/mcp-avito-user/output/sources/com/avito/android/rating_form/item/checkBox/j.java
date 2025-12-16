package com.avito.android.rating_form.item.checkBox;

import ih0.InterfaceC41402a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CheckableGroupItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/checkBox/j;", "Lcom/avito/android/rating_form/item/checkBox/h;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC41402a, G0> f248318b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public j(@Y61.k Y41.l<? super InterfaceC41402a, G0> lVar) {
        this.f248318b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        n nVar = (n) eVar;
        CheckableGroupItem checkableGroupItem = (CheckableGroupItem) aVar;
        nVar.setTitle(checkableGroupItem.f248284d);
        nVar.s0(checkableGroupItem.f248285e);
        nVar.pv(checkableGroupItem.f248287g, checkableGroupItem.f248286f, new i(checkableGroupItem, this));
    }
}
