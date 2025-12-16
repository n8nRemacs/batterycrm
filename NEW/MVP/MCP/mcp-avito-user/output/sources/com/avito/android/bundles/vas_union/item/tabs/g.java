package com.avito.android.bundles.vas_union.item.tabs;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TabsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f108675l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f108676m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, h hVar) {
        super(1);
        this.f108675l = cVar;
        this.f108676m = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        c cVar = this.f108675l;
        cVar.f108669c = iIntValue;
        h hVar = this.f108676m;
        hVar.f108678c.accept(cVar.f108668b.get(iIntValue));
        return G0.f406611a;
    }
}
