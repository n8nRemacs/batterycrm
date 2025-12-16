package com.avito.android.profile.pro.impl;

import Y61.k;
import Y61.l;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: NotificationBadgeExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-pro_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {
    public static final void a(@k Badge badge, @l String str) {
        if (str == null || str.length() == 0) {
            D6.w(badge);
        } else {
            D6.H(badge);
            badge.setTitleText(str);
        }
    }
}
