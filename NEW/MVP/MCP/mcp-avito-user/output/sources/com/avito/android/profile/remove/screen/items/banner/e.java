package com.avito.android.profile.remove.screen.items.banner;

import M90.a;
import com.avito.android.remote.model.profile_removal.RemovalProcessItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f224065l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RemovalProcessItem.Banner.Link f224066m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, RemovalProcessItem.Banner.Link link) {
        super(0);
        this.f224065l = fVar;
        this.f224066m = link;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f224065l.f224067b.invoke(new a.b(this.f224066m.getDeeplink()));
        return G0.f406611a;
    }
}
