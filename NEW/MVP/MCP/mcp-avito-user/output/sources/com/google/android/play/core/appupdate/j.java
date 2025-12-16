package com.google.android.play.core.appupdate;

import android.content.IntentFilter;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
public final class j implements com.google.android.play.core.appupdate.internal.g {

    /* renamed from: a, reason: collision with root package name */
    public final p f358056a;

    public j(p pVar) {
        this.f358056a = pVar;
    }

    @Override // com.google.android.play.core.appupdate.internal.g
    public final Object zza() {
        return new i(new com.google.android.play.core.appupdate.internal.s("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), this.f358056a.f358066a.f358064a);
    }
}
