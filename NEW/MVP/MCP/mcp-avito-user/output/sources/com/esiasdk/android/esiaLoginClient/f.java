package com.esiasdk.android.esiaLoginClient;

import Y61.k;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.esiasdk.android.EsiaAuthActivity;
import com.esiasdk.android.data.network.model.ClientSessionInfo;
import kotlin.Metadata;

/* compiled from: EsiaLoginManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/esiasdk/android/esiaLoginClient/f;", "", "<init>", "()V", "esiasdk-1.1.3(6)_nonPguRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final f f339706a = new f();

    public static void a(@k Activity activity, @k ClientSessionInfo clientSessionInfo, @k String str, @k String str2) {
        PackageManager packageManager = activity.getApplicationContext().getPackageManager();
        if (packageManager == null) {
            throw new IllegalStateException("EsiaAuthActivity not found in AndroidManifest.xml");
        }
        try {
            packageManager.getActivityInfo(new ComponentName(activity, (Class<?>) EsiaAuthActivity.class), 1);
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(activity, EsiaAuthActivity.class.getName()));
            intent.putExtra("EXTRA_ESIA_API_URL", str2);
            intent.putExtra("EXTRA_CLIENT_SESSION", clientSessionInfo);
            intent.putExtra("EXTRA_PERMISSIONS", str);
            activity.startActivityForResult(intent, 1);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new IllegalStateException("EsiaAuthActivity not found in AndroidManifest.xml");
        }
    }
}
