package com.avito.android.cpt.activation.ui.items.delivery;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CptActivationDeliveryItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f126391l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f126392m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, f fVar) {
        super(0);
        this.f126391l = aVar;
        this.f126392m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f126391l.f126383d;
        if (deepLink != null) {
            this.f126392m.f126393b.invoke(deepLink);
        }
        return G0.f406611a;
    }
}
