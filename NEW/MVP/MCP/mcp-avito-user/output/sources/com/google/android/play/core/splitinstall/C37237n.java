package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.File;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37237n implements com.google.android.play.core.splitinstall.internal.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C37235l f358827a;

    public C37237n(C37235l c37235l) {
        this.f358827a = c37235l;
    }

    @Override // com.google.android.play.core.splitinstall.internal.b0
    @j.P
    public final Object zza() {
        String string;
        Context context = this.f358827a.f358819a.f358814a;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null && (string = bundle.getString("local_testing_dir")) != null) {
                return new File(context.getExternalFilesDir(null), string);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }
}
