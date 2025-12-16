package com.avito.android.serp.adapter.rich_snippets.service;

import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertRichServiceItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.service.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34809g extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f271317l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f271318m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f271319n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271320o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271321p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34809g(v vVar, s sVar, v vVar2, AdvertItem advertItem, AdvertItem advertItem2) {
        super(0);
        this.f271317l = vVar;
        this.f271318m = sVar;
        this.f271319n = vVar2;
        this.f271320o = advertItem;
        this.f271321p = advertItem2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        v vVar = this.f271317l;
        vVar.l5(null);
        vVar.H0();
        vVar.d(null);
        vVar.w4();
        vVar.W2();
        s sVar = this.f271318m;
        h31.e<InterfaceC28616b> eVar = sVar.f271373d;
        if (eVar.get().N6()) {
            String str = this.f271320o.f268425c;
            sVar.f271374e.p(this.f271319n, str);
        } else {
            eVar.get().M6(this.f271321p);
        }
        return G0.f406611a;
    }
}
