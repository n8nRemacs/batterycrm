package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.q1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37171q1 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.android.play.core.assetpacks.internal.F f358473c = new com.google.android.play.core.assetpacks.internal.F("PackageStateCache");

    /* renamed from: a, reason: collision with root package name */
    public final Context f358474a;

    /* renamed from: b, reason: collision with root package name */
    public int f358475b = -1;

    public C37171q1(Context context) {
        this.f358474a = context;
    }

    public final synchronized int a() {
        if (this.f358475b == -1) {
            try {
                this.f358475b = this.f358474a.getPackageManager().getPackageInfo(this.f358474a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f358473c.b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f358475b;
    }
}
