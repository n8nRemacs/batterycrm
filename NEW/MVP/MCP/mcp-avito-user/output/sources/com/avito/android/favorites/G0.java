package com.avito.android.favorites;

import com.avito.android.cart_snippet_actions.models.CartItemQuantityChange;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FavoritesListPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/avito/android/cart_snippet_actions/models/CartItemQuantityChange;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class G0 extends kotlin.jvm.internal.N implements Y41.l<List<CartItemQuantityChange>, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final G0 f156274l = new G0();

    public G0() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(List<CartItemQuantityChange> list) {
        return Boolean.valueOf(list.isEmpty());
    }
}
