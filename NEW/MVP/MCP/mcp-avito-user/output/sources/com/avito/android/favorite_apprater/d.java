package com.avito.android.favorite_apprater;

import io.reactivex.rxjava3.internal.operators.single.G;
import io.reactivex.rxjava3.internal.operators.single.O;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FavoriteAppRaterInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_apprater/d;", "Lcom/avito/android/favorite_apprater/b;", "_avito_favorite-apprater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f155265a;

    @Inject
    public d(@Y61.k j jVar) {
        this.f155265a = jVar;
    }

    @Override // com.avito.android.favorite_apprater.b
    @Y61.k
    public final O a() {
        return new G(new VH0.c(this, 15)).r(new c(this));
    }
}
