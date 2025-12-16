package com.avito.android.publish.slots.fashion_authentication_check_banner.item;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: FashionAuthenticationCheckBannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<io.reactivex.rxjava3.disposables.d> f243873l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l0.h<io.reactivex.rxjava3.disposables.d> hVar) {
        super(0);
        this.f243873l = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        io.reactivex.rxjava3.disposables.d dVar = this.f243873l.f406842b;
        if (dVar != null) {
            dVar.dispose();
        }
        return G0.f406611a;
    }
}
