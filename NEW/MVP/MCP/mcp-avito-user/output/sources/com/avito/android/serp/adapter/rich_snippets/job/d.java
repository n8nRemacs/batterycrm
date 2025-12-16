package com.avito.android.serp.adapter.rich_snippets.job;

import com.avito.android.serp.adapter.AdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import rn0.InterfaceC47691c;

/* compiled from: AdvertRichJobItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f270787l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f270788m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, AdvertItem advertItem) {
        super(0);
        this.f270787l = jVar;
        this.f270788m = advertItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC47691c.a.b(this.f270787l.f270803b.get(), this.f270788m.f268410V.getDeepLink(), 6);
        return G0.f406611a;
    }
}
