package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import com.yandex.metrica.MetricaService;

/* renamed from: com.yandex.metrica.impl.ob.n2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38991n2 {

    /* renamed from: a, reason: collision with root package name */
    private static final C38987mn f381141a = new C38987mn();

    public static Intent a(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Intent intentAddFlags = new Intent(context, (Class<?>) MetricaService.class).setAction("com.yandex.metrica.IMetricaService").setData(new Uri.Builder().scheme("metrica").authority(context.getPackageName()).build()).addFlags(32);
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            applicationInfo = null;
        }
        try {
            bundle = applicationInfo.metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } catch (Throwable unused2) {
            bundle = new Bundle();
        }
        Intent intentPutExtras = intentAddFlags.putExtras(bundle);
        intentPutExtras.setData(intentPutExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", A3.f377754c).build());
        C38717c2 c38717c2A = C38792f2.a(context).a();
        intentPutExtras.putExtra("screen_size", c38717c2A != null ? Tl.a(c38717c2A) : null);
        return intentPutExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
