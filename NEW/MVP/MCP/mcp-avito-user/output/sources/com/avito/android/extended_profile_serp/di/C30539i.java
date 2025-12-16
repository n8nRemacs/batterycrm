package com.avito.android.extended_profile_serp.di;

import bB.InterfaceC25487a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.remote.model.Image;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34863v;
import com.avito.android.serp.adapter.S;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSerpModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/di/i;", "Lcom/avito/android/serp/adapter/v;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile_serp.di.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30539i implements InterfaceC34863v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC25487a, G0> f152854b;

    /* JADX WARN: Multi-variable type inference failed */
    public C30539i(Y41.l<? super InterfaceC25487a, G0> lVar) {
        this.f152854b = lVar;
    }

    @Override // com.avito.android.favorite.u
    public final void Ld(@Y61.k S s5, @Y61.l AbstractC30567a abstractC30567a) {
        this.f152854b.invoke(new InterfaceC25487a.b(s5));
    }

    @Override // com.avito.android.serp.adapter.InterfaceC34863v
    public final void k5(@Y61.k AdvertItem advertItem, @Y61.l Image image) {
        this.f152854b.invoke(new InterfaceC25487a.C1993a(advertItem, image));
    }

    @Override // La.g
    public final void ic(@Y61.k String str) {
    }

    @Override // com.avito.android.serp.adapter.K
    public final void p9(@Y61.k DeepLink deepLink) {
    }
}
