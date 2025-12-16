package com.avito.android.cyclic_gallery_widget.image_carousel;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImageCarouselItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class s extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f132103l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.internal.observers.y f132104m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v vVar, io.reactivex.rxjava3.internal.observers.y yVar) {
        super(0);
        this.f132103l = vVar;
        this.f132104m = yVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f132103l.d(null);
        DisposableHelper.a(this.f132104m);
        return G0.f406611a;
    }
}
