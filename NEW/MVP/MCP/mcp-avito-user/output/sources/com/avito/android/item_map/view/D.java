package com.avito.android.item_map.view;

import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ItemMapPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class D extends kotlin.jvm.internal.N implements Y41.l<G0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I f173409l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(I i12) {
        super(1);
        this.f173409l = i12;
    }

    @Override // Y41.l
    public final G0 invoke(G0 g02) {
        V v12 = this.f173409l.f173423j;
        if (v12 != null) {
            com.avito.android.lib.design.tooltip.k kVar = v12.f173557M;
            if (kVar != null) {
                kVar.dismiss();
            }
            com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(v12.f173555K, 0, 0, 6, null);
            kVar2.f181224j = new r.d(new i.b(new b.C5327b()));
            com.avito.android.lib.design.tooltip.p.a(kVar2, new a0(v12));
            kVar2.e(v12.f173553I);
            v12.f173557M = kVar2;
        }
        return G0.f406611a;
    }
}
