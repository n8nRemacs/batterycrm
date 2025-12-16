package com.avito.android.profile_settings;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileSettingsActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-management_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {
    public static Intent a(Context context, String str, String str2, String str3, int i12) {
        String str4 = (i12 & 8) != 0 ? null : "edit_seller_type_fragment_tag";
        if ((i12 & 16) != 0) {
            str3 = null;
        }
        return new Intent(context, (Class<?>) ProfileSettingsActivity.class).putExtra("key_active_tab", str).putExtra("key_source", str2).putExtra("start_fragment", str4).putExtra("widgets_to_scroll", str3);
    }
}
