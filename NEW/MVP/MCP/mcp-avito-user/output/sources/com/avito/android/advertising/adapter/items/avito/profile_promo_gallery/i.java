package com.avito.android.advertising.adapter.items.avito.profile_promo_gallery;

import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ProfilePromoGalleryPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WeakReference<a> f87248l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f87249m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(WeakReference<a> weakReference, l lVar) {
        super(0);
        this.f87248l = weakReference;
        this.f87249m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f87248l.get();
        if (aVar != null) {
            this.f87249m.f87253b.b(aVar);
        }
        return G0.f406611a;
    }
}
