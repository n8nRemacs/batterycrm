package com.avito.android.rating_form.select_item.adapter.advert;

import fh0.InterfaceC40422a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/select_item/adapter/advert/g;", "Lcom/avito/android/rating_form/select_item/adapter/advert/d;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC40422a, G0> f248919b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@Y61.k Y41.l<? super InterfaceC40422a, G0> lVar) {
        this.f248919b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        a aVar2 = (a) aVar;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        kVar.x(com.avito.android.image_loader.b.b(aVar2.f248907g));
        String str = aVar2.f248904d;
        if (str == null) {
            str = "";
        }
        String str2 = aVar2.f248905e;
        kVar.O0(str, str2 != null ? str2 : "");
        kVar.p(aVar2.f248906f);
        kVar.d(new e(kVar, cVar));
        if (aVar2.f248908h) {
            cVar.b(kVar.A().t0(new f(this, aVar2)));
        }
    }
}
