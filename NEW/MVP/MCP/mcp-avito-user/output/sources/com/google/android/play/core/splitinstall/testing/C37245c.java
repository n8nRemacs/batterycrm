package com.google.android.play.core.splitinstall.testing;

import java.util.Map;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.testing.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37245c extends x {

    /* renamed from: a, reason: collision with root package name */
    public Integer f358854a;

    /* renamed from: b, reason: collision with root package name */
    public Map f358855b;

    public final C37245c a(Map map) {
        if (map == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        this.f358855b = map;
        return this;
    }

    public final Map b() {
        Map map = this.f358855b;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }
}
