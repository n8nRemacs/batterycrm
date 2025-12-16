package com.avito.android.success.konveyor.charity;

import com.avito.android.deep_linking.links.DeepLink;
import eA0.InterfaceC39979a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuccessCharityBlockPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f291629l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f291630m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, c cVar) {
        super(0);
        this.f291629l = gVar;
        this.f291630m = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f291630m.f291626e;
        g gVar = this.f291629l;
        gVar.f291632c.invoke(new InterfaceC39979a.C11056a(deepLink));
        return G0.f406611a;
    }
}
