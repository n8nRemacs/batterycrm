package vd0;

import AK0.l;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PromoBannerFavoritesStorageImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvd0/a;", "LYC/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vd0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C49311a implements YC.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f440912a;

    @Inject
    public C49311a(@k l lVar) {
        this.f440912a = lVar;
    }

    @Override // YC.a
    public final void a(@k String str) {
        this.f440912a.putBoolean("should_show_banner_favorites.".concat(str), false);
    }

    @Override // YC.a
    public final boolean b(@k String str) {
        return this.f440912a.getBoolean("should_show_banner_favorites.".concat(str), true);
    }
}
