package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes6.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f348848a;

    /* renamed from: b, reason: collision with root package name */
    @J41.a
    public int f348849b;

    /* renamed from: c, reason: collision with root package name */
    @J41.a
    public int f348850c = 0;

    public w(Context context) {
        this.f348848a = context;
    }

    public final synchronized int a() {
        int i12 = this.f348850c;
        if (i12 != 0) {
            return i12;
        }
        PackageManager packageManager = this.f348848a.getPackageManager();
        if (aY0.c.a(this.f348848a).f20921a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f348850c = 2;
            return 2;
        }
        this.f348850c = 2;
        return 2;
    }
}
