package com.avito.android.di.module;

import com.avito.android.remote.model.FavoriteSellersLoadingResult;
import com.avito.android.remote.model.FavoriteSellersResultItem;
import com.avito.android.remote.parse.adapter.FavoriteSellersLoadingResultOkTypeAdapter;
import com.avito.android.remote.parse.adapter.FavoriteSellersTypeAdapter;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: FavoriteSellersJsonModule_ProvideTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/di/module/a5;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/X5;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_favorite-sellers"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.a5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C29983a5 implements dagger.internal.h<Set<com.avito.android.util.X5>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C29983a5 f144228a = new C29983a5();

    @Override // javax.inject.Provider
    public final Object get() {
        Y4.f144209a.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new com.avito.android.util.X5(FavoriteSellersResultItem.class, new FavoriteSellersTypeAdapter()));
        linkedHashSet.add(new com.avito.android.util.X5(FavoriteSellersLoadingResult.Ok.class, new FavoriteSellersLoadingResultOkTypeAdapter()));
        return linkedHashSet;
    }
}
