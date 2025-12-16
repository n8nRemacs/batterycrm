package com.avito.android.beduin.common.component.favorite_button;

import com.avito.android.di.B;
import javax.inject.Inject;
import ji.InterfaceC42385a;
import kotlin.Metadata;

/* compiled from: BeduinFavoriteButtonViewModel.kt */
@B
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/favorite_button/j;", "Lji/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements InterfaceC42385a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f101202a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_toast.b f101203b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f101204c = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public j(@Y61.k com.avito.android.favorite.h hVar, @Y61.k com.avito.android.advert_collection_toast.b bVar) {
        this.f101202a = hVar;
        this.f101203b = bVar;
    }

    @Override // ji.InterfaceC42385a
    public final void onCleared() {
        this.f101204c.e();
    }
}
