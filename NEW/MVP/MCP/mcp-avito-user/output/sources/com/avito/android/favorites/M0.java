package com.avito.android.favorites;

import android.net.Uri;
import com.avito.android.favorites.InterfaceC30665h1;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.android.favorites.adapter.advert.skeleton.SkeletonFavoriteAdvertItem;
import com.avito.android.favorites.adapter.error.FavoriteErrorItem;
import com.avito.android.favorites.adapter.loading.FavoriteLoadingItem;
import com.avito.android.util.P2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: FavoritesListPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "loadingState", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class M0 extends kotlin.jvm.internal.N implements Y41.l<P2<? super List<? extends FavoriteListItem>>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C30684r0 f156302l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Uri f156303m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(C30684r0 c30684r0, Uri uri) {
        super(1);
        this.f156302l = c30684r0;
        this.f156303m = uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    @Override // Y41.l
    public final kotlin.G0 invoke(P2<? super List<? extends FavoriteListItem>> p22) {
        ?? arrayList;
        P2<? super List<? extends FavoriteListItem>> p23 = p22;
        boolean z12 = p23 instanceof P2.a;
        ?? arrayList2 = 0;
        C30684r0 c30684r0 = this.f156302l;
        if (z12) {
            P2.a aVar = (P2.a) p23;
            c30684r0.getClass();
            String f244063c = aVar.f318719a.getF244063c();
            List<? extends FavoriteListItem> list = c30684r0.f157456a0;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    FavoriteListItem favoriteListItem = (FavoriteListItem) obj;
                    if (!(favoriteListItem instanceof FavoriteLoadingItem) && !(favoriteListItem instanceof FavoriteErrorItem) && !(favoriteListItem instanceof SkeletonFavoriteAdvertItem)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = C42784z0.f406748b;
            }
            c30684r0.f157456a0 = C42745f0.i0(new FavoriteErrorItem(com.avito.android.printable_text.b.f(f244063c), this.f156303m), (Collection) arrayList);
            x1 x1Var = c30684r0.f157454Y;
            if (x1Var != null) {
                InterfaceC30665h1.a.a(x1Var, com.avito.android.printable_text.b.f(f244063c), null, aVar.f318719a, 2);
            }
            c30684r0.O();
        } else if (p23 instanceof P2.b) {
            List<? extends FavoriteListItem> list2 = c30684r0.f157456a0;
            if (list2 != null) {
                arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    FavoriteListItem favoriteListItem2 = (FavoriteListItem) obj2;
                    if (!(favoriteListItem2 instanceof FavoriteLoadingItem) && !(favoriteListItem2 instanceof FavoriteErrorItem) && !(favoriteListItem2 instanceof SkeletonFavoriteAdvertItem)) {
                        arrayList2.add(obj2);
                    }
                }
            }
            if (arrayList2 == 0) {
                arrayList2 = C42784z0.f406748b;
            }
            c30684r0.f157456a0 = C42745f0.h0((Iterable) ((P2.b) p23).f318720a, (Collection) arrayList2);
            c30684r0.O();
        } else {
            p23.equals(P2.c.f318721a);
        }
        return kotlin.G0.f406611a;
    }
}
