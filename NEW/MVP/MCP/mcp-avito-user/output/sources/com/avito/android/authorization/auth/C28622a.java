package com.avito.android.authorization.auth;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.AuthScreenMode;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AuthActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_authorization_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.authorization.auth.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28622a {
    public static final AuthArguments a(Intent intent, InterfaceC28373a interfaceC28373a) {
        String stringExtra = intent.getStringExtra("src");
        Intent intentA = Zd.n.a(intent, interfaceC28373a);
        boolean z12 = intent.getIntExtra("result", 0) == -1;
        AuthScreenMode authScreenMode = (AuthScreenMode) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("full_screen_mode", AuthScreenMode.class) : intent.getParcelableExtra("full_screen_mode"));
        if (authScreenMode == null) {
            authScreenMode = AuthScreenMode.f92662b;
        }
        return new AuthArguments(stringExtra, intentA, z12, intent.getBooleanExtra("isRegistered", false), authScreenMode);
    }
}
