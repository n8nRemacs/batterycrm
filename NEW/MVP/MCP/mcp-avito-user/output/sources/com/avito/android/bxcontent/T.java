package com.avito.android.bxcontent;

import Db.InterfaceC13381a;
import com.avito.android.advertising.analytics.events.BannerPageSource;
import kotlin.Metadata;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/G;", "invoke", "()Lcom/avito/android/advertising/loaders/beduin/G;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class T extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.advertising.loaders.beduin.G> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BxContentFragment f109431l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(BxContentFragment bxContentFragment) {
        super(0);
        this.f109431l = bxContentFragment;
    }

    @Override // Y41.a
    public final com.avito.android.advertising.loaders.beduin.G invoke() {
        BxContentFragment bxContentFragment = this.f109431l;
        com.avito.android.advertising.loaders.n nVar = bxContentFragment.f109038o4;
        if (nVar == null) {
            nVar = null;
        }
        C29235n c29235nZ5 = bxContentFragment.Z5();
        com.avito.android.advertising.loaders.event_service.c cVar = bxContentFragment.f109042p4;
        if (cVar == null) {
            cVar = null;
        }
        BannerPageSource bannerPageSource = bxContentFragment.f109046q4;
        if (bannerPageSource == null) {
            bannerPageSource = null;
        }
        InterfaceC13381a interfaceC13381a = bxContentFragment.f109050r4;
        return new com.avito.android.advertising.loaders.beduin.G(nVar, c29235nZ5.f112648P, cVar, bannerPageSource, (interfaceC13381a != null ? interfaceC13381a : null).e());
    }
}
