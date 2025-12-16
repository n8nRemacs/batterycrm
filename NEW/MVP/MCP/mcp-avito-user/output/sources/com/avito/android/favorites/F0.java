package com.avito.android.favorites;

import com.avito.android.cart_snippet_actions.models.CartItemQuantityChange;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FavoritesListPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/avito/android/cart_snippet_actions/models/CartItemQuantityChange;", "acc", "change", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class F0<T1, T2, R> implements l41.c {

    /* renamed from: b, reason: collision with root package name */
    public static final F0<T1, T2, R> f156216b = new F0<>();

    @Override // l41.c
    public final Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        list.add((CartItemQuantityChange) obj2);
        return list;
    }
}
