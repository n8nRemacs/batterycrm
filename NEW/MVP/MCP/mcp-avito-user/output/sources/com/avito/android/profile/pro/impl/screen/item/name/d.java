package com.avito.android.profile.pro.impl.screen.item.name;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ProfileProNamePresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/name/d;", "Lcom/avito/android/profile/pro/impl/screen/item/name/c;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<D90.a, G0> f223355b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super D90.a, G0> lVar) {
        this.f223355b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((f) eVar).Y40((ProfileProNameItem) aVar, this.f223355b);
    }
}
