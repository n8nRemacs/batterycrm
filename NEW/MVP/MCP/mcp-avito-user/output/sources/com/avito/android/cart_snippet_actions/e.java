package com.avito.android.cart_snippet_actions;

import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CartActionsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/e;", "", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface e {

    /* compiled from: CartActionsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ I a(e eVar, List list, boolean z12, boolean z13, String str, boolean z14, int i12) {
            boolean z15 = (i12 & 2) != 0 ? false : z12;
            boolean z16 = (i12 & 4) != 0 ? false : z13;
            if ((i12 & 8) != 0) {
                str = null;
            }
            return eVar.a(str, list, z15, z16, (i12 & 16) != 0 ? false : z14);
        }
    }

    @Y61.k
    W a(@Y61.l String str, @Y61.k List list, boolean z12, boolean z13, boolean z14);
}
