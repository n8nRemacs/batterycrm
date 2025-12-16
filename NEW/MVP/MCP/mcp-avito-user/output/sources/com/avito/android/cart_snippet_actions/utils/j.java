package com.avito.android.cart_snippet_actions.utils;

import Y61.k;
import android.os.Build;
import android.view.View;
import kotlin.Metadata;

/* compiled from: Views.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cart-snippet-actions_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j {
    public static final void a(@k View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.performHapticFeedback(17);
        }
    }
}
