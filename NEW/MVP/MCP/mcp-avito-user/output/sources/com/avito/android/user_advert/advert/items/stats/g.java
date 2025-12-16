package com.avito.android.user_advert.advert.items.stats;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MyAdvertStatsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f310294l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f310295m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DeepLink f310296n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, a aVar, DeepLink deepLink) {
        super(0);
        this.f310294l = hVar;
        this.f310295m = aVar;
        this.f310296n = deepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f310294l.f310297b;
        if (myAdvertDetailsActivity != null) {
            InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
            if (interfaceC35426j0 == null) {
                interfaceC35426j0 = null;
            }
            interfaceC35426j0.Jb(this.f310295m, this.f310296n);
        }
        return G0.f406611a;
    }
}
