package com.avito.android.advert_details_items.imv_v4_cars;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImvCarsV4ItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ImvCarsV4Item f84849l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f84850m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DeepLink f84851n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ImvCarsV4Item imvCarsV4Item, h hVar, DeepLink deepLink) {
        super(0);
        this.f84849l = imvCarsV4Item;
        this.f84850m = hVar;
        this.f84851n = deepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        String str = this.f84849l.f84837f;
        h hVar = this.f84850m;
        if (str != null) {
            hVar.f84852b.b(str);
        }
        b.a.a(hVar.f84853c, this.f84851n, null, null, 6);
        return G0.f406611a;
    }
}
