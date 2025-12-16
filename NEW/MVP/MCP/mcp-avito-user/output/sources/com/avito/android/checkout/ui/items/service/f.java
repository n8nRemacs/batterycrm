package com.avito.android.checkout.ui.items.service;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CheckoutServiceItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f118500l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f118501m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, g gVar) {
        super(0);
        this.f118500l = bVar;
        this.f118501m = gVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        a aVar = this.f118500l.f118490f;
        if (aVar != null && (deepLink = aVar.f118485c) != null) {
            this.f118501m.f118502b.invoke(deepLink);
        }
        return G0.f406611a;
    }
}
