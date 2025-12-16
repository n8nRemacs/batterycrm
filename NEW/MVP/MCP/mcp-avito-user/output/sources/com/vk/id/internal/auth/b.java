package com.vk.id.internal.auth;

import android.content.Context;
import android.content.Intent;
import androidx.browser.customtabs.f;
import com.vk.id.internal.auth.AuthActivity;
import com.vk.id.storage.InternalVKIDEncryptedSharedPreferencesStorage;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Y41.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f366970b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f366971c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f366972d;

    public /* synthetic */ b(int i12, Object obj, Object obj2) {
        this.f366970b = i12;
        this.f366971c = obj;
        this.f366972d = obj2;
    }

    @Override // Y41.a
    public final Object invoke() {
        switch (this.f366970b) {
            case 0:
                return AuthActivity.onNewIntent$lambda$5((AuthActivity) this.f366971c, (Intent) this.f366972d);
            case 1:
                return AuthActivity.AnonymousClass1.onCustomTabsServiceConnected$lambda$2((AuthActivity) this.f366971c, (f) this.f366972d);
            default:
                return InternalVKIDEncryptedSharedPreferencesStorage.sharedPreferences_delegate$lambda$0((InternalVKIDEncryptedSharedPreferencesStorage) this.f366971c, (Context) this.f366972d);
        }
    }
}
