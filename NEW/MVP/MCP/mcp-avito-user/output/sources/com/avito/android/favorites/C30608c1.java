package com.avito.android.favorites;

import com.avito.android.favorites.adapter.FavoriteListItem;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: FavoritesListStorage.kt */
@androidx.compose.runtime.internal.P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/c1;", "Lcom/avito/android/favorites/b1;", "<init>", "()V", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* renamed from: com.avito.android.favorites.c1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30608c1 implements InterfaceC30605b1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public List<? extends FavoriteListItem> f156807a;

    @Inject
    public C30608c1() {
    }

    @Override // com.avito.android.favorites.InterfaceC30605b1
    public final void a() {
        this.f156807a = null;
    }

    @Override // com.avito.android.favorites.InterfaceC30605b1
    @Y61.l
    public final List<FavoriteListItem> b() {
        return this.f156807a;
    }

    @Override // com.avito.android.favorites.InterfaceC30605b1
    public final void c(@Y61.l List<? extends FavoriteListItem> list) {
        this.f156807a = list;
    }
}
