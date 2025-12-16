package com.avito.android.profile.remove.screen.items.list_item;

import Y41.l;
import Y61.k;
import com.avito.android.profile.remove.analytics.ProfileRemoveAnalytics;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ListItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/list_item/f;", "Lcom/avito/android/profile/remove/screen/items/list_item/d;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<M90.a, G0> f224106b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ProfileRemoveAnalytics f224107c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super M90.a, G0> lVar, @k ProfileRemoveAnalytics profileRemoveAnalytics) {
        this.f224106b = lVar;
        this.f224107c = profileRemoveAnalytics;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.setTitle(aVar2.f224098c);
        hVar.c(new e(this, aVar2));
    }
}
