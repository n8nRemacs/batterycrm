package com.avito.android.section.item;

import com.avito.android.remote.model.ImageKt;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34863v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SectionAdvertItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class o extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f264750l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f264751m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q f264752n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f264753o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, AdvertItem advertItem, int i12, q qVar, AdvertItem advertItem2) {
        super(0);
        this.f264750l = pVar;
        this.f264751m = advertItem;
        this.f264752n = qVar;
        this.f264753o = advertItem2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Y41.l, java.lang.Object] */
    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC34863v interfaceC34863v = this.f264750l.f264754b.get();
        AdvertItem advertItem = this.f264751m;
        interfaceC34863v.k5(advertItem, ImageKt.toSingleImage(this.f264752n.O(com.avito.android.image_loader.b.a(advertItem.f268368A))));
        ?? r02 = this.f264753o.f268421a1;
        if (r02 != 0) {
            r02.invoke(advertItem.f268425c);
        }
        return G0.f406611a;
    }
}
