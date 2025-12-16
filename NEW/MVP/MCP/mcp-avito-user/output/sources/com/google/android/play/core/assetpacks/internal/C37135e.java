package com.google.android.play.core.assetpacks.internal;

import android.content.Context;
import com.google.android.play.core.assetpacks.W1;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* renamed from: com.google.android.play.core.assetpacks.internal.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37135e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final W1 f358374a;

    public C37135e(W1 w12) {
        this.f358374a = w12;
    }

    @Override // com.google.android.play.core.assetpacks.internal.r
    public final Object a() {
        Context contextB = this.f358374a.b();
        C37134d c37134d = new C37134d();
        contextB.getPackageName();
        return c37134d;
    }
}
