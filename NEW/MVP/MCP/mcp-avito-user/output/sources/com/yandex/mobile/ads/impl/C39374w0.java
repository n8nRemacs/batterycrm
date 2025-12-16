package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* renamed from: com.yandex.mobile.ads.impl.w0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39374w0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final C39345m0 f391240a = new C39345m0();

    @SuppressLint({"WrongConstant"})
    public final void a(@Y61.k Context context) throws PackageManager.NameNotFoundException {
        try {
            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.yandex.mobile.ads.common.AdActivity"), 0);
            this.f391240a.getClass();
            C39345m0.a(activityInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new g70("There is no presence of com.yandex.mobile.ads.common.AdActivity activity in AndroidManifest file.");
        }
    }
}
