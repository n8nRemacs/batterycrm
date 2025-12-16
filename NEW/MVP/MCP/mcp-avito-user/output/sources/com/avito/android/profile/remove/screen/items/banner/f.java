package com.avito.android.profile.remove.screen.items.banner;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.profile_removal.RemovalProcessItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/banner/f;", "Lcom/avito/android/profile/remove/screen/items/banner/d;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<M90.a, G0> f224067b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super M90.a, G0> lVar) {
        this.f224067b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.setTitle(aVar2.f224058c);
        hVar.h(aVar2.f224059d);
        RemovalProcessItem.Banner.Link link = aVar2.f224060e;
        if (link != null) {
            hVar.r1(link.getText(), new e(this, link));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            hVar.L1();
        }
    }
}
