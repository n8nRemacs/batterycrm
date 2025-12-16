package com.avito.android.user_advert.advert;

import android.content.Context;
import android.content.Intent;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-advert_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class K {
    public static Intent a(Context context, String str, String str2, boolean z12, MyAdvertPostAction myAdvertPostAction, DeepLink deepLink, String str3, boolean z13, int i12) {
        if ((i12 & 64) != 0) {
            deepLink = null;
        }
        if ((i12 & 128) != 0) {
            str3 = null;
        }
        if ((i12 & 256) != 0) {
            z13 = false;
        }
        return new Intent(context, (Class<?>) MyAdvertDetailsActivity.class).putExtra("itemId", str).putExtra("skipCpt", str2).putExtra("key_extra_action", myAdvertPostAction).putExtra("key_is_new_advert", z12).putExtra("status_message", (String) null).putExtra("key_invoke_action", deepLink).putExtra("key_instant_message", str3).putExtra("key_advert_with_video", z13).putExtra("supports_nested_intent", true);
    }
}
