package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public class ExtractionForegroundService extends Service {

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f358120b = new BinderC37175s0(this);

    @Override // android.app.Service
    @j.P
    public final IBinder onBind(Intent intent) {
        return this.f358120b;
    }
}
