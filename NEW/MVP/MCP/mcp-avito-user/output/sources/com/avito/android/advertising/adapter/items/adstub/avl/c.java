package com.avito.android.advertising.adapter.items.adstub.avl;

import Y61.k;
import com.avito.android.advertising.CommercialLoadingItem;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kotlin.Metadata;
import ob.InterfaceC44738b;

/* compiled from: CommercialLoadingAVLPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/adapter/items/adstub/avl/c;", "LTV0/d;", "Lcom/avito/android/advertising/adapter/items/adstub/avl/a;", "Lcom/avito/android/advertising/CommercialLoadingItem;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements TV0.d<a, CommercialLoadingItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC44738b> f86918b;

    @Inject
    public c(@k h31.e<InterfaceC44738b> eVar) {
        this.f86918b = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((a) eVar).f86915b.setOnClickListener(new b(new WeakReference(this.f86918b), 0));
    }
}
