package com.avito.android.cart_snippet_actions.utils;

import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItemInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Steppers.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cart-snippet-actions_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i {
    public static Stepper a(Stepper stepper, CartItemInfo cartItemInfo) {
        Stepper stepper2 = stepper;
        boolean z12 = (stepper2 == null || (stepper2.f116271b == 0 && stepper2.f116272c == 0)) ? false : true;
        Integer num = cartItemInfo != null ? cartItemInfo.f176569c : null;
        if (cartItemInfo == null) {
            if (stepper2 == null) {
                return null;
            }
            if (z12) {
                stepper2 = new Stepper(0, stepper2.f116272c, stepper2.f116273d, null, false, 24, null);
            }
            return stepper2;
        }
        if (num != null) {
            return new Stepper(cartItemInfo.f176568b, num.intValue(), stepper2 != null ? stepper2.f116273d : null, null, stepper2 != null ? stepper2.f116275f : false, 8, null);
        }
        if (z12) {
            return new Stepper(cartItemInfo.f176568b, stepper2.f116272c, stepper2.f116273d, null, stepper2.f116275f, 8, null);
        }
        Boolean bool = stepper2 != null ? stepper2.f116273d : null;
        boolean z13 = stepper2 != null ? stepper2.f116275f : false;
        int i12 = cartItemInfo.f176568b;
        return new Stepper(i12, i12, bool, null, z13, 8, null);
    }
}
