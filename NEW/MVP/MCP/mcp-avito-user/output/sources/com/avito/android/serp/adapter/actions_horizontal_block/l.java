package com.avito.android.serp.adapter.actions_horizontal_block;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.developments_catalog.serp.Tab;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47690b;
import rn0.InterfaceC47691c;

/* compiled from: ActionsHorizontalBlockItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class l extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f268683l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Tab f268684m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, Tab tab) {
        super(0);
        this.f268683l = gVar;
        this.f268684m = tab;
    }

    @Override // Y41.a
    public final G0 invoke() {
        h31.e<InterfaceC47690b> eVar = this.f268683l.f268674c;
        InterfaceC47690b interfaceC47690b = eVar.get();
        Tab tab = this.f268684m;
        InterfaceC47691c.a.b(interfaceC47690b, tab.getFiltersDeeplink(), 6);
        DeepLink clickstreamDeeplink = tab.getClickstreamDeeplink();
        if (clickstreamDeeplink != null) {
            InterfaceC47691c.a.a(eVar.get(), clickstreamDeeplink, null, 14);
        }
        return G0.f406611a;
    }
}
