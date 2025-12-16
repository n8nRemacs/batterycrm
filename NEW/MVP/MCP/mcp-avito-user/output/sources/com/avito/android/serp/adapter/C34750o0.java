package com.avito.android.serp.adapter;

import com.avito.android.remote.model.ImageKt;
import kotlin.Metadata;

/* compiled from: RdsAdvertItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34750o0 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34755r0 f270444l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f270445m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34860t0 f270446n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f270447o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34750o0(C34755r0 c34755r0, AdvertItem advertItem, int i12, InterfaceC34860t0 interfaceC34860t0, AdvertItem advertItem2) {
        super(0);
        this.f270444l = c34755r0;
        this.f270445m = advertItem;
        this.f270446n = interfaceC34860t0;
        this.f270447o = advertItem2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Y41.l, java.lang.Object] */
    @Override // Y41.a
    public final kotlin.G0 invoke() {
        InterfaceC34863v interfaceC34863v = this.f270444l.f270535b.get();
        AdvertItem advertItem = this.f270445m;
        interfaceC34863v.k5(advertItem, ImageKt.toSingleImage(this.f270446n.O(com.avito.android.image_loader.b.c(advertItem.f268368A))));
        ?? r02 = this.f270447o.f268421a1;
        if (r02 != 0) {
            r02.invoke(advertItem.f268425c);
        }
        return kotlin.G0.f406611a;
    }
}
