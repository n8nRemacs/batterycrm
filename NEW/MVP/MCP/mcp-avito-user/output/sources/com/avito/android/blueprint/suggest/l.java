package com.avito.android.blueprint.suggest;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishInputWithSuggestsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class l extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f105716l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(w wVar) {
        super(0);
        this.f105716l = wVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        w wVar = this.f105716l;
        com.jakewharton.rxrelay3.c<G0> cVar = wVar.f105747l;
        G0 g02 = G0.f406611a;
        cVar.accept(g02);
        wVar.f105743h.c();
        return g02;
    }
}
