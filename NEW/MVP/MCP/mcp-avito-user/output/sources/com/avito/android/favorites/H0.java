package com.avito.android.favorites;

import com.avito.android.cart_snippet_actions.models.CartItemQuantityChange;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FavoritesListPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "", "Lcom/avito/android/cart_snippet_actions/models/CartItemQuantityChange;", "changes", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class H0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C30684r0 f156280b;

    public H0(C30684r0 c30684r0) {
        this.f156280b = c30684r0;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t12 : (List) obj) {
            String f116266b = ((CartItemQuantityChange) t12).getF116266b();
            Object objR = linkedHashMap.get(f116266b);
            if (objR == null) {
                objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap, f116266b);
            }
            ((List) objR).add(t12);
        }
        this.f156280b.f157478l0.clear();
        return linkedHashMap;
    }
}
