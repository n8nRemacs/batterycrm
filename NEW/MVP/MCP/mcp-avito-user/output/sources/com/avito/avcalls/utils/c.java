package com.avito.avcalls.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import kotlin.Metadata;

/* compiled from: BuildInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/utils/c;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f333655a;

    public c(@Y61.k Context context) {
        this.f333655a = context;
    }

    @Y61.k
    public final b a() throws PackageManager.NameNotFoundException {
        Context context = this.f333655a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        String str = packageInfo.packageName;
        String str2 = packageInfo.versionName;
        com.avito.avcalls.b.f332535a.getClass();
        String str3 = com.avito.avcalls.b.f332536b;
        boolean z12 = (packageInfo.applicationInfo.flags & 2) == 0;
        Platform platform = Platform.f333648b;
        return new b(str, str2, str3, z12);
    }
}
