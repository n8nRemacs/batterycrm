package com.avito.android.user_advert.advert.items.services;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_advert.advert.InterfaceC35426j0;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AppliedServicesItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f310224l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f310225m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, a aVar) {
        super(0);
        this.f310224l = fVar;
        this.f310225m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f310224l.f310226b;
        if (myAdvertDetailsActivity != null) {
            a aVar = this.f310225m;
            DeepLink deepLink = aVar.f310219e;
            InterfaceC35426j0 interfaceC35426j0 = myAdvertDetailsActivity.f308326q;
            if (interfaceC35426j0 == null) {
                interfaceC35426j0 = null;
            }
            interfaceC35426j0.O1(aVar, deepLink);
        }
        return G0.f406611a;
    }
}
