package com.avito.android.extended_profile.di;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.remote.model.Image;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34863v;
import fA.InterfaceC40265a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedProfileModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/di/s;", "Lcom/avito/android/serp/adapter/v;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile.di.s, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30438s implements InterfaceC34863v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC40265a, G0> f149946b;

    /* JADX WARN: Multi-variable type inference failed */
    public C30438s(Y41.l<? super InterfaceC40265a, G0> lVar) {
        this.f149946b = lVar;
    }

    @Override // com.avito.android.favorite.u
    public final void Ld(@Y61.k com.avito.android.serp.adapter.S s5, @Y61.l AbstractC30567a abstractC30567a) {
        this.f149946b.invoke(new InterfaceC40265a.k(s5));
    }

    @Override // com.avito.android.serp.adapter.InterfaceC34863v
    public final void k5(@Y61.k AdvertItem advertItem, @Y61.l Image image) {
        this.f149946b.invoke(new InterfaceC40265a.f(advertItem));
    }

    @Override // La.g
    public final void ic(@Y61.k String str) {
    }

    @Override // com.avito.android.serp.adapter.K
    public final void p9(@Y61.k DeepLink deepLink) {
    }
}
