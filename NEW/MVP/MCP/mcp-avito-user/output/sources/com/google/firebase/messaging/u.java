package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* compiled from: Metadata.java */
/* loaded from: classes6.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f361935a;

    /* renamed from: b, reason: collision with root package name */
    @j.B
    public String f361936b;

    /* renamed from: c, reason: collision with root package name */
    @j.B
    public String f361937c;

    /* renamed from: d, reason: collision with root package name */
    @j.B
    public int f361938d;

    /* renamed from: e, reason: collision with root package name */
    @j.B
    public int f361939e = 0;

    public u(Context context) {
        this.f361935a = context;
    }

    public static String b(com.google.firebase.g gVar) {
        gVar.a();
        com.google.firebase.m mVar = gVar.f361597c;
        String str = mVar.f361728e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = mVar.f361725b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        try {
            if (this.f361936b == null) {
                d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f361936b;
    }

    public final boolean c() {
        int i12;
        synchronized (this) {
            i12 = this.f361939e;
            if (i12 == 0) {
                PackageManager packageManager = this.f361935a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    i12 = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                        this.f361939e = 2;
                    } else {
                        this.f361939e = 2;
                    }
                    i12 = 2;
                }
            }
        }
        return i12 != 0;
    }

    public final synchronized void d() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.f361935a.getPackageManager().getPackageInfo(this.f361935a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e12) {
            e12.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.f361936b = Integer.toString(packageInfo.versionCode);
            this.f361937c = packageInfo.versionName;
        }
    }
}
