package com.avito.android.favorites;

import com.avito.android.cart_snippet_actions.models.CartItemQuantityChange;
import kotlin.Metadata;
import un.C49079a;

/* compiled from: FavoritesListPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/cart_snippet_actions/models/CartItemQuantityChange;", "kotlin.jvm.PlatformType", "it", "Lun/a;", "apply", "(Lcom/avito/android/cart_snippet_actions/models/CartItemQuantityChange;)Lun/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.favorites.t0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30695t0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C30695t0<T, R> f157544b = new C30695t0<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        CartItemQuantityChange cartItemQuantityChange = (CartItemQuantityChange) obj;
        return new C49079a(cartItemQuantityChange.getF116266b(), cartItemQuantityChange.getF116267c(), cartItemQuantityChange.getF116268d(), cartItemQuantityChange.getF116269e());
    }
}
