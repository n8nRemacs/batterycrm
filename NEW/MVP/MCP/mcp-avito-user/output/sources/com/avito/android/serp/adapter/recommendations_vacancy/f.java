package com.avito.android.serp.adapter.recommendations_vacancy;

import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RdsAdvertVacancyItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f270588l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f270589m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f270590n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f270591o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f270592p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, h hVar, j jVar2, AdvertItem advertItem, AdvertItem advertItem2) {
        super(0);
        this.f270588l = jVar;
        this.f270589m = hVar;
        this.f270590n = jVar2;
        this.f270591o = advertItem;
        this.f270592p = advertItem2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        j jVar = this.f270588l;
        jVar.H0();
        jVar.d(null);
        h hVar = this.f270589m;
        InterfaceC28616b interfaceC28616b = hVar.f270597d;
        if (interfaceC28616b.N6()) {
            String str = this.f270591o.f268425c;
            hVar.f270598e.p(this.f270590n, str);
        } else {
            interfaceC28616b.M6(this.f270592p);
        }
        return G0.f406611a;
    }
}
