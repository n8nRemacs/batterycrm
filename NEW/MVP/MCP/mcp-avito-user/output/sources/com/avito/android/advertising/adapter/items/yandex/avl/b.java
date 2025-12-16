package com.avito.android.advertising.adapter.items.yandex.avl;

import com.avito.android.advertising.adapter.items.yandex.YandexBannerItem;
import java.lang.ref.WeakReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ob.InterfaceC44738b;

/* compiled from: YandexAvlPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WeakReference<h31.e<InterfaceC44738b>> f87711l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ YandexBannerItem f87712m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WeakReference<h31.e<InterfaceC44738b>> weakReference, YandexBannerItem yandexBannerItem) {
        super(0);
        this.f87711l = weakReference;
        this.f87712m = yandexBannerItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC44738b interfaceC44738b;
        h31.e<InterfaceC44738b> eVar = this.f87711l.get();
        if (eVar != null && (interfaceC44738b = eVar.get()) != null) {
            interfaceC44738b.A(this.f87712m.getStringId());
        }
        return G0.f406611a;
    }
}
