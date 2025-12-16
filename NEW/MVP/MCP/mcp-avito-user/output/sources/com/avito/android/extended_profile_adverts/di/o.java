package com.avito.android.extended_profile_adverts.di;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.remote.model.Image;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34863v;
import com.avito.android.serp.adapter.S;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Y1;
import pA.InterfaceC46926a;

/* compiled from: ProfileAdvertsModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_adverts/di/o;", "Lcom/avito/android/serp/adapter/v;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements InterfaceC34863v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y1<InterfaceC46926a> f150822b;

    public o(Y1<InterfaceC46926a> y12) {
        this.f150822b = y12;
    }

    @Override // com.avito.android.favorite.u
    public final void Ld(@Y61.k S s5, @Y61.l AbstractC30567a abstractC30567a) {
        this.f150822b.K5(new InterfaceC46926a.e(s5));
    }

    @Override // com.avito.android.serp.adapter.InterfaceC34863v
    public final void k5(@Y61.k AdvertItem advertItem, @Y61.l Image image) {
        this.f150822b.K5(new InterfaceC46926a.b(advertItem, image));
    }

    @Override // com.avito.android.serp.adapter.K
    public final void p9(@Y61.k DeepLink deepLink) {
        this.f150822b.K5(new InterfaceC46926a.c(deepLink));
    }

    @Override // La.g
    public final void ic(@Y61.k String str) {
    }
}
