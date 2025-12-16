package com.avito.android.crm_paid_cvs.view.list_items.searches_item;

import bt.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.crm_paid_cvs.dto.SearchItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SearchesItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f130995l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SearchItem f130996m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, SearchItem searchItem) {
        super(0);
        this.f130995l = gVar;
        this.f130996m = searchItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        g gVar = this.f130995l;
        InterfaceC28373a interfaceC28373a = gVar.f130998c;
        SearchItem searchItem = this.f130996m;
        interfaceC28373a.c(new l(gVar.f130999d, searchItem.f130376b));
        gVar.f130997b.invoke(searchItem.f130381g);
        return G0.f406611a;
    }
}
