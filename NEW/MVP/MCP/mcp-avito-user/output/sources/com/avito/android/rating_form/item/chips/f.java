package com.avito.android.rating_form.item.chips;

import Y41.l;
import Y61.k;
import ih0.InterfaceC41402a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChipsItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/chips/f;", "Lcom/avito/android/rating_form/item/chips/d;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC41402a, G0> f248361b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC41402a, G0> lVar) {
        this.f248361b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.List] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.setTitle(aVar2.f248347d);
        hVar.f(aVar2.f248348e);
        hVar.o(aVar2.f248349f);
        hVar.s0(aVar2.f248350g);
        hVar.sV(aVar2.f248354k);
        hVar.X0(aVar2.f248351h);
        hVar.hX(aVar2.f248352i);
        hVar.iv(aVar2.f248353j);
        hVar.l0(new e(this, aVar2));
    }
}
