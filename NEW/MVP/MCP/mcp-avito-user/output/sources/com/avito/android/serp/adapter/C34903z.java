package com.avito.android.serp.adapter;

import com.avito.android.remote.model.ImageKt;
import kotlin.Metadata;

/* compiled from: AdvertListItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34903z extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D f273904l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f273905m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E f273906n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f273907o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34903z(D d12, AdvertItem advertItem, int i12, E e12, AdvertItem advertItem2) {
        super(0);
        this.f273904l = d12;
        this.f273905m = advertItem;
        this.f273906n = e12;
        this.f273907o = advertItem2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Y41.l, java.lang.Object] */
    @Override // Y41.a
    public final kotlin.G0 invoke() {
        InterfaceC34863v interfaceC34863v = this.f273904l.f268490b.get();
        AdvertItem advertItem = this.f273905m;
        interfaceC34863v.k5(advertItem, ImageKt.toSingleImage(this.f273906n.O(com.avito.android.image_loader.b.c(advertItem.f268368A))));
        ?? r02 = this.f273907o.f268421a1;
        if (r02 != 0) {
            r02.invoke(advertItem.f268425c);
        }
        return kotlin.G0.f406611a;
    }
}
