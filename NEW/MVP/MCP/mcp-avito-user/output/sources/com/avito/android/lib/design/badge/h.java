package com.avito.android.lib.design.badge;

import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: Badges.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h {
    public static void a(Badge badge, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            D6.w(badge);
        } else {
            D6.H(badge);
            badge.setTitleText(charSequence);
        }
    }
}
