package com.avito.android.advert_core.information_about;

import com.avito.android.advert.item.Z0;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InformationAboutPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f83694l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f83695m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, DeepLink deepLink) {
        super(0);
        this.f83694l = eVar;
        this.f83695m = deepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Z0 z02 = this.f83694l.f83696b;
        if (z02 != null) {
            z02.g(null, this.f83695m, null);
        }
        return G0.f406611a;
    }
}
