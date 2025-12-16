package com.google.android.gms.auth.api.signin.internal;

import androidx.loader.app.a;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
final class z implements a.InterfaceC1804a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SignInHubActivity f348795a;

    @Override // androidx.loader.app.a.InterfaceC1804a
    public final f a() {
        SignInHubActivity signInHubActivity = this.f348795a;
        Set set = com.google.android.gms.common.api.i.f348935a;
        synchronized (set) {
        }
        return new f(signInHubActivity, set);
    }

    @Override // androidx.loader.app.a.InterfaceC1804a
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        SignInHubActivity signInHubActivity = this.f348795a;
        signInHubActivity.setResult(signInHubActivity.f348775e, signInHubActivity.f348776f);
        signInHubActivity.finish();
    }
}
