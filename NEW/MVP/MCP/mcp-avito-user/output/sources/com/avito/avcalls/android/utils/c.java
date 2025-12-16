package com.avito.avcalls.android.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.avito.avcalls.android.rtc.y;
import kotlin.Metadata;

/* compiled from: BuildInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/utils/c;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final y f332431a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f332432b;

    public c(@Y61.k y yVar, boolean z12) {
        this.f332431a = yVar;
        this.f332432b = z12;
    }

    @Y61.k
    public final b a() throws PackageManager.NameNotFoundException {
        Context context = this.f332431a.f331983a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        String str = packageInfo.packageName;
        String str2 = packageInfo.versionName;
        com.avito.avcalls.android.b.f331396a.getClass();
        String str3 = com.avito.avcalls.android.b.f331397b;
        boolean z12 = (packageInfo.applicationInfo.flags & 2) == 0;
        Platform platform = Platform.f332423b;
        return new b(str, str2, z12, str3, this.f332432b);
    }
}
