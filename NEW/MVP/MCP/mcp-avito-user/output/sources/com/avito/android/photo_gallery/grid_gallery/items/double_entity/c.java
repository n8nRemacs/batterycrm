package com.avito.android.photo_gallery.grid_gallery.items.double_entity;

import T70.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GridGalleryDoubleEntityPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f217251l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ GridGalleryDoubleEntityItem f217252m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, GridGalleryDoubleEntityItem gridGalleryDoubleEntityItem) {
        super(0);
        this.f217251l = eVar;
        this.f217252m = gridGalleryDoubleEntityItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f217251l;
        GridGalleryDoubleEntityItem gridGalleryDoubleEntityItem = this.f217252m;
        eVar.f217255b.invoke(new c.C1050c(gridGalleryDoubleEntityItem.f217246c.getF217212c(), gridGalleryDoubleEntityItem.f217246c.getF217215f()));
        return G0.f406611a;
    }
}
