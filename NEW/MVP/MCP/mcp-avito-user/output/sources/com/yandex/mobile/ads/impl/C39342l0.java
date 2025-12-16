package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.Window;
import android.widget.RelativeLayout;

/* renamed from: com.yandex.mobile.ads.impl.l0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39342l0 implements InterfaceC39351o0 {
    @Override // com.yandex.mobile.ads.impl.InterfaceC39351o0
    @j.P
    public final InterfaceC39348n0 a(@j.N Context context, @j.N RelativeLayout relativeLayout, @j.N C39311c1 c39311c1, @j.N C39362s0 c39362s0, @j.N Intent intent, @j.N Window window) {
        String stringExtra = intent.getStringExtra("extra_browser_url");
        if (!TextUtils.isEmpty(stringExtra)) {
            try {
                return new C39339k0(context, relativeLayout, c39311c1, window, stringExtra);
            } catch (kl1 unused) {
            }
        }
        return null;
    }
}
