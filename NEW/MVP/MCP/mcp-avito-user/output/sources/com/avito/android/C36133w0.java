package com.avito.android;

import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.favorites.InterfaceC30662g1;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ur.C49102c;

/* compiled from: FavoritesSpaceFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/w0;", "Lcom/avito/android/favorites/g1;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.w0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C36133w0 implements InterfaceC30662g1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C49102c f327456a;

    /* compiled from: FavoritesSpaceFactoryImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.w0$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BottomNavigationSpace.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BottomNavigationSpace bottomNavigationSpace = BottomNavigationSpace.f107065b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public C36133w0(@Y61.k C49102c c49102c) {
        this.f327456a = c49102c;
    }

    @Override // com.avito.android.favorites.InterfaceC30662g1
    @Y61.k
    public final FavoritesSpace a(@Y61.k BottomNavigationSpace bottomNavigationSpace) {
        if (this.f327456a.c()) {
            return FavoritesSpace.f156266h;
        }
        int iOrdinal = bottomNavigationSpace.ordinal();
        if (iOrdinal == 0) {
            return FavoritesSpace.f156264f;
        }
        if (iOrdinal == 1) {
            return FavoritesSpace.f156265g;
        }
        throw new NoWhenBranchMatchedException();
    }
}
