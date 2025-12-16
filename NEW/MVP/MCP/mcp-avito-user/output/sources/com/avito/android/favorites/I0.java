package com.avito.android.favorites;

import com.avito.android.cart_snippet_actions.models.CartItemQuantityChange;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: FavoritesListPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "", "Lcom/avito/android/cart_snippet_actions/models/CartItemQuantityChange;", "changesMap", "Lkotlin/G0;", "accept", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class I0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C30684r0 f156282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.h<Map<String, List<CartItemQuantityChange>>> f156283c;

    public I0(C30684r0 c30684r0, l0.h<Map<String, List<CartItemQuantityChange>>> hVar) {
        this.f156282b = c30684r0;
        this.f156283c = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.Map] */
    @Override // l41.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.Map r1 = (java.util.Map) r1
            com.avito.android.favorites.r0 r2 = r0.f156282b
            com.avito.android.favorites.CategoryState r3 = r2.f157458b0
            java.util.List<com.avito.android.favorites.CategoryChipable> r3 = r3.f156209e
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L29
            java.lang.Object r4 = r3.next()
            r6 = r4
            com.avito.android.favorites.CategoryChipable r6 = (com.avito.android.favorites.CategoryChipable) r6
            int r6 = r6.f156200b
            com.avito.android.favorites.CategoryState r7 = r2.f157458b0
            int r7 = r7.f156207c
            if (r6 != r7) goto L12
            goto L2a
        L29:
            r4 = r5
        L2a:
            com.avito.android.favorites.CategoryChipable r4 = (com.avito.android.favorites.CategoryChipable) r4
            java.util.Set r3 = r1.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L34:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto Lae
            java.lang.Object r6 = r3.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.getValue()
            java.util.List r6 = (java.util.List) r6
            java.util.List<? extends com.avito.android.favorites.adapter.FavoriteListItem> r8 = r2.f157456a0
            if (r8 == 0) goto L72
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L56:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L6e
            java.lang.Object r9 = r8.next()
            r10 = r9
            com.avito.android.favorites.adapter.FavoriteListItem r10 = (com.avito.android.favorites.adapter.FavoriteListItem) r10
            java.lang.String r10 = r10.getF85304c()
            boolean r10 = kotlin.jvm.internal.L.f(r10, r7)
            if (r10 == 0) goto L56
            goto L6f
        L6e:
            r9 = r5
        L6f:
            com.avito.android.favorites.adapter.FavoriteListItem r9 = (com.avito.android.favorites.adapter.FavoriteListItem) r9
            goto L73
        L72:
            r9 = r5
        L73:
            boolean r8 = r9 instanceof com.avito.android.favorites.adapter.advert.FavoriteAdvertItem
            if (r8 == 0) goto L7a
            com.avito.android.favorites.adapter.advert.FavoriteAdvertItem r9 = (com.avito.android.favorites.adapter.advert.FavoriteAdvertItem) r9
            goto L7b
        L7a:
            r9 = r5
        L7b:
            if (r9 == 0) goto L8e
            com.avito.android.deep_linking.links.DeepLink r8 = r9.f156415m
            if (r8 == 0) goto L8e
            boolean r9 = r8 instanceof com.avito.android.deep_linking.links.AdvertDetailsLink
            if (r9 == 0) goto L88
            com.avito.android.deep_linking.links.AdvertDetailsLink r8 = (com.avito.android.deep_linking.links.AdvertDetailsLink) r8
            goto L89
        L88:
            r8 = r5
        L89:
            if (r8 == 0) goto L8e
            java.lang.String r8 = r8.f132948c
            goto L8f
        L8e:
            r8 = r5
        L8f:
            com.avito.android.util.f5 r9 = new com.avito.android.util.f5
            r9.<init>(r8)
            java.lang.String r13 = com.avito.android.util.C35800g5.b(r9)
            java.util.Map r11 = java.util.Collections.singletonMap(r7, r6)
            com.avito.android.cart_recommendations.model.FromPage r12 = com.avito.android.cart_recommendations.model.FromPage.f115329d
            if (r4 == 0) goto La4
            java.util.Map<java.lang.String, java.lang.String> r6 = r4.f156203e
            r15 = r6
            goto La5
        La4:
            r15 = r5
        La5:
            com.avito.android.cart_snippet_actions.a r10 = r2.f157501x
            r16 = 16
            r14 = 0
            com.avito.android.cart_snippet_actions.a.C3391a.a(r10, r11, r12, r13, r14, r15, r16)
            goto L34
        Lae:
            kotlin.jvm.internal.l0$h<java.util.Map<java.lang.String, java.util.List<com.avito.android.cart_snippet_actions.models.CartItemQuantityChange>>> r2 = r0.f156283c
            r2.f406842b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorites.I0.accept(java.lang.Object):void");
    }
}
