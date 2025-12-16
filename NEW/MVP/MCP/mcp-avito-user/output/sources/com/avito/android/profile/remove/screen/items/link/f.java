package com.avito.android.profile.remove.screen.items.link;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LinkItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/link/f;", "Lcom/avito/android/profile/remove/screen/items/link/d;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<M90.a, G0> f224093b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super M90.a, G0> lVar) {
        this.f224093b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.setText(aVar2.f224085c);
        hVar.c(new e(this, aVar2));
    }
}
