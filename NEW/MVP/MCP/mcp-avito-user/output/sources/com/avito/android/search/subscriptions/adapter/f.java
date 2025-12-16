package com.avito.android.search.subscriptions.adapter;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SearchSubscriptionItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f263872l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f263873m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f263874n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, i iVar, k kVar) {
        super(0);
        this.f263872l = dVar;
        this.f263873m = iVar;
        this.f263874n = kVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f263872l;
        dVar.f263868f = false;
        i iVar = this.f263873m;
        k kVar = this.f263874n;
        kVar.t50(false);
        kVar.VR(false);
        iVar.f263879b.get().b(dVar);
        return G0.f406611a;
    }
}
