package com.google.firebase.messaging;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.Task;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import j.k0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* compiled from: GmsRpc.java */
/* loaded from: classes6.dex */
class r {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.g f361885a;

    /* renamed from: b, reason: collision with root package name */
    public final u f361886b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.cloudmessaging.d f361887c;

    /* renamed from: d, reason: collision with root package name */
    public final wZ0.b<com.google.firebase.platforminfo.i> f361888d;

    /* renamed from: e, reason: collision with root package name */
    public final wZ0.b<HeartBeatInfo> f361889e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.firebase.installations.i f361890f;

    @k0
    public r() {
        throw null;
    }

    public r(com.google.firebase.g gVar, u uVar, wZ0.b<com.google.firebase.platforminfo.i> bVar, wZ0.b<HeartBeatInfo> bVar2, com.google.firebase.installations.i iVar) {
        gVar.a();
        com.google.android.gms.cloudmessaging.d dVar = new com.google.android.gms.cloudmessaging.d(gVar.f361595a);
        this.f361885a = gVar;
        this.f361886b = uVar;
        this.f361887c = dVar;
        this.f361888d = bVar;
        this.f361889e = bVar2;
        this.f361890f = iVar;
    }

    public final Task<String> a(Task<Bundle> task) {
        return task.i(new androidx.arch.core.executor.a(1), new C37620n(this, 1));
    }

    public final void b(String str, String str2, Bundle bundle) {
        int i12;
        String str3;
        String strEncodeToString;
        HeartBeatInfo.HeartBeat heartBeatA;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        com.google.firebase.g gVar = this.f361885a;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f361597c.f361725b);
        u uVar = this.f361886b;
        synchronized (uVar) {
            try {
                if (uVar.f361938d == 0) {
                    try {
                        packageInfo = uVar.f361935a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e12) {
                        e12.toString();
                        packageInfo = null;
                    }
                    if (packageInfo != null) {
                        uVar.f361938d = packageInfo.versionCode;
                    }
                }
                i12 = uVar.f361938d;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i12));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f361886b.a());
        u uVar2 = this.f361886b;
        synchronized (uVar2) {
            try {
                if (uVar2.f361937c == null) {
                    uVar2.d();
                }
                str3 = uVar2.f361937c;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        com.google.firebase.g gVar2 = this.f361885a;
        gVar2.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.f361596b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String strA = ((com.google.firebase.installations.l) C37030m.a(this.f361890f.c())).a();
            if (!TextUtils.isEmpty(strA)) {
                bundle.putString("Goog-Firebase-Installations-Auth", strA);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString(HiAnalyticsConstant.HaKey.BI_KEY_APPID, (String) C37030m.a(this.f361890f.getId()));
        bundle.putString("cliv", "fcm-23.1.2");
        HeartBeatInfo heartBeatInfo = this.f361889e.get();
        com.google.firebase.platforminfo.i iVar = this.f361888d.get();
        if (heartBeatInfo == null || iVar == null || (heartBeatA = heartBeatInfo.a()) == HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatA.f361610b));
        bundle.putString("Firebase-Client", iVar.a());
    }

    public final Task<Bundle> c(String str, String str2, Bundle bundle) {
        try {
            b(str, str2, bundle);
            return this.f361887c.a(bundle);
        } catch (InterruptedException | ExecutionException e12) {
            return C37030m.e(e12);
        }
    }
}
