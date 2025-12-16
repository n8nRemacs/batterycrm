package com.avito.android.advert;

import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.toggle_comparison_state.s;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class A extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28245z f68528l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d0 f68529m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AdvertDetails f68530n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.toggle_comparison_state.s f68531o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C28245z c28245z, d0 d0Var, AdvertDetails advertDetails, com.avito.android.toggle_comparison_state.s sVar) {
        super(0);
        this.f68528l = c28245z;
        this.f68529m = d0Var;
        this.f68530n = advertDetails;
        this.f68531o = sVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        boolean z12 = ((s.c) this.f68531o).f301636a.f301629e;
        this.f68528l.e(this.f68529m, this.f68530n, z12);
        return G0.f406611a;
    }
}
