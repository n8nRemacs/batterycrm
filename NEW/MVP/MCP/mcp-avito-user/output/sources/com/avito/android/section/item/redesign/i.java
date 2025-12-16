package com.avito.android.section.item.redesign;

import com.avito.android.remote.model.ImageKt;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34863v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ComplementaryAdvertRedesignItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f264781l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f264782m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f264783n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f264784o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, AdvertItem advertItem, int i12, l lVar, AdvertItem advertItem2) {
        super(0);
        this.f264781l = hVar;
        this.f264782m = advertItem;
        this.f264783n = lVar;
        this.f264784o = advertItem2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Y41.l, java.lang.Object] */
    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC34863v interfaceC34863v = this.f264781l.f264778b.get();
        AdvertItem advertItem = this.f264782m;
        interfaceC34863v.k5(advertItem, ImageKt.toSingleImage(this.f264783n.O(com.avito.android.image_loader.b.c(advertItem.f268368A))));
        ?? r02 = this.f264784o.f268421a1;
        if (r02 != 0) {
            r02.invoke(advertItem.f268425c);
        }
        return G0.f406611a;
    }
}
