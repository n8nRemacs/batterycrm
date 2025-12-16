package com.avito.android.cyclic_gallery_widget.image_carousel;

import kotlin.Metadata;

/* compiled from: CarouselActionItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f132008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f132009c;

    public f(d dVar, i iVar) {
        this.f132008b = dVar;
        this.f132009c = iVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        d dVar = this.f132008b;
        dVar.f132004b.accept(this.f132009c);
    }
}
