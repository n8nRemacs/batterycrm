package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.assetpacks.internal.C37136f;
import com.google.android.play.core.assetpacks.internal.C37147q;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public final class U1 implements com.google.android.play.core.assetpacks.internal.r {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.play.core.assetpacks.internal.r f358243a;

    /* renamed from: b, reason: collision with root package name */
    public final W1 f358244b;

    public U1(com.google.android.play.core.assetpacks.internal.r rVar, W1 w12) {
        this.f358243a = rVar;
        this.f358244b = w12;
    }

    @Override // com.google.android.play.core.assetpacks.internal.r
    public final Object a() throws PackageManager.NameNotFoundException {
        Object objA = this.f358243a.a();
        Context context = this.f358244b.f358258a.f358227a;
        N1 n12 = (N1) objA;
        C37136f.a(context.getPackageManager(), new ComponentName(context.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"));
        C37136f.a(context.getPackageManager(), new ComponentName(context.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"));
        C37147q.a(n12);
        return n12;
    }
}
