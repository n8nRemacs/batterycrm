package com.avito.android.tariff_lf.edit_info.item.edit_button;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditTariffButtonItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f298922l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f298923m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, f fVar) {
        super(0);
        this.f298922l = aVar;
        this.f298923m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deeplink = this.f298922l.f298917b.getDeeplink();
        if (deeplink != null) {
            this.f298923m.f298924b.accept(deeplink);
        }
        return G0.f406611a;
    }
}
