package nK0;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import lK0.InterfaceC43650a;

/* compiled from: UserViewedAdvertPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnK0/b;", "LnK0/a;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nK0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C44287b implements InterfaceC44286a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC43650a, G0> f415088b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public C44287b(@k l<? super InterfaceC43650a, G0> lVar) {
        this.f415088b = lVar;
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void D(@k DeepLink deepLink, @k String str) {
        this.f415088b.invoke(new InterfaceC43650a.c(deepLink, null, deepLink.getClass().getSimpleName(), 2, null));
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void E(@k DeepLink deepLink) {
        this.f415088b.invoke(new InterfaceC43650a.c(deepLink, null, deepLink.getClass().getSimpleName(), 2, null));
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void e(@k DeepLink deepLink) {
        this.f415088b.invoke(new InterfaceC43650a.c(deepLink, null, deepLink.getClass().getSimpleName(), 2, null));
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void l(@k FavoriteAdvertItem favoriteAdvertItem) {
        this.f415088b.invoke(new InterfaceC43650a.e(favoriteAdvertItem.f156404b, favoriteAdvertItem.f156394F, favoriteAdvertItem.f156395G));
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void y(@k FavoriteAdvertItem favoriteAdvertItem, @Y61.l Image image) {
        DeepLink deepLink = favoriteAdvertItem.f156415m;
        if (deepLink != null) {
            this.f415088b.invoke(new InterfaceC43650a.b(deepLink, String.valueOf(favoriteAdvertItem.f156413k), favoriteAdvertItem.f156405c, favoriteAdvertItem.f156406d, favoriteAdvertItem.f156407e, favoriteAdvertItem.f156411i));
        }
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void C(@k String str) {
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void h(@k DeepLink deepLink) {
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void o(@k AutotekaPurchaseAction autotekaPurchaseAction) {
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void p(@k DeepLink deepLink) {
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void F(@k String str, @k String str2) {
    }

    @Override // com.avito.android.favorites.adapter.advert.d.a
    public final void b(int i12, int i13, @k String str, int i14) {
    }
}
