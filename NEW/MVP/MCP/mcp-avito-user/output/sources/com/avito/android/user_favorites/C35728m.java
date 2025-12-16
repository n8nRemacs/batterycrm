package com.avito.android.user_favorites;

import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserFavoritesIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_favorites/m;", "Lcom/avito/android/user_favorites/l;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_favorites.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35728m implements InterfaceC35727l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.L f316923a;

    @Inject
    public C35728m(@Y61.k com.avito.android.L l12) {
        this.f316923a = l12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.user_favorites.InterfaceC35727l
    @Y61.k
    public final Intent a(@Y61.l Integer num) {
        UserFavoritesFragmentData.f316821f.getClass();
        return this.f316923a.d(new UserFavoritesFragmentData(1, null, num, 0 == true ? 1 : 0));
    }

    @Override // com.avito.android.user_favorites.InterfaceC35727l
    @Y61.k
    public final Intent b() {
        UserFavoritesFragmentData.f316821f.getClass();
        return this.f316923a.d(new UserFavoritesFragmentData(4, null, null, 6, null));
    }

    @Override // com.avito.android.user_favorites.InterfaceC35727l
    @Y61.k
    public final Intent c(@Y61.l String str) {
        UserFavoritesFragmentData.f316821f.getClass();
        return this.f316923a.d(new UserFavoritesFragmentData(2, str, null, 4, null));
    }
}
