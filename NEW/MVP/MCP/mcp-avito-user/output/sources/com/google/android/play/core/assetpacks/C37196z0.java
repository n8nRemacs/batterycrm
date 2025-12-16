package com.google.android.play.core.assetpacks;

import java.util.HashMap;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.z0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37196z0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f358561a = new HashMap();

    public final synchronized double a(String str) {
        Double d12 = (Double) this.f358561a.get(str);
        if (d12 == null) {
            return 0.0d;
        }
        return d12.doubleValue();
    }

    public final synchronized void b(String str) {
        this.f358561a.put(str, Double.valueOf(0.0d));
    }
}
