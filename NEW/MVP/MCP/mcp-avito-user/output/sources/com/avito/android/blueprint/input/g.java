package com.avito.android.blueprint.input;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishInputPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f105524l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar) {
        super(0);
        this.f105524l = oVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        o oVar = this.f105524l;
        com.jakewharton.rxrelay3.c<G0> cVar = oVar.f105544j;
        G0 g02 = G0.f406611a;
        cVar.accept(g02);
        oVar.f105540f.c();
        return g02;
    }
}
